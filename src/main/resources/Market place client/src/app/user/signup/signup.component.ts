import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {map} from 'rxjs';
import {AuthService} from '../auth.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})

export class SignupComponent implements OnInit {

  signupForm: FormGroup;
  hide: boolean = true;
  usernameTaken: boolean = true;
  emailTaken: boolean = true;

  constructor(private router: Router, private formBuilder: FormBuilder,
              private userService: AuthService) {
    this.signupForm = this.formBuilder.group({
      'username': ['', Validators.compose([Validators.maxLength(20), Validators.minLength(5), Validators.required])],
      'email': ['', Validators.compose([Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$'), Validators.required])],
      'password': ['', Validators.compose([Validators.maxLength(20), Validators.minLength(6), Validators.required])]
    });
  }

  get f() {
    return this.signupForm.controls;
  }

  ngOnInit(): void {
  }

  onSubmit() {
    if (this.signupForm.invalid) {
      return;
    }
    this.userService.register(this.signupForm.value).subscribe(response => console.log(response));
  }

  getErrorMessage() {
    if (this.f['email'].hasError('required')) {
      return 'You must enter a value';
    }
    return this.f['email'].hasError('email') ? 'Not a valid email' : '';
  }

  checkUsernameAvailability(event: any) {
    if (this.f['username'].valid) {
      this.userService.checkUsernameAvailability(event.target.value)
          .pipe(map(resp => Object.values(resp)[0]))
          .subscribe(available => this.usernameTaken = !available);
    }
  }

  checkEmailAvailability(event: any) {
    if (this.f['email'].valid) {
      this.userService.checkEmailAvailability(event.target.value)
          .pipe(map(resp => Object.values(resp)[0]))
          .subscribe(available => this.emailTaken = !available);
    }
  }
}
