import {Injectable} from '@angular/core';
import {Router} from '@angular/router';
import {Actions, createEffect, ofType} from '@ngrx/effects';
import {AuthService} from "@src/app/user/auth.service";
import {catchError, exhaustMap, map, of, tap} from "rxjs";
import {
  authActions,
  LogInFailure,
  LogInSuccess,
  RefreshTokenFailure,
  RefreshTokenSuccess
} from "@src/store/actions/auth.actions";


@Injectable()
export class AuthEffects {

  LogIn$ = createEffect(() => {
      return this.$actions.pipe(
        ofType(authActions.LOGIN_USER),
        exhaustMap((action: any) => {
          const {usernameOrEmail, password, ...rest} = action;
          console.log()
          return this.userService.login({usernameOrEmail, password}).pipe(
            map(response => {
              console.log(response)
              return LogInSuccess({payload: response})
            }),
            catchError(error => {
              console.log(error)
              return of(LogInFailure(error))
            })
          )
        })
      )
    }
  );
  LoginSuccess$ = createEffect(() => {
      return this.$actions.pipe(
        ofType(authActions.LOGIN_SUCCESS),
        tap((action: any) => {
          this.router.navigate(['']);
        })
      )
    }, {dispatch: false}
  );

  LogoutSuccess$ = createEffect(() => {
      return this.$actions.pipe(
        ofType(authActions.LOGOUT_USER),
        tap((action: any) => {
          this.router.navigate(['']);
        })
      )
    }, {dispatch: false}
  );

  RefreshToken$ = createEffect(() => {
      return this.$actions.pipe(
        ofType(authActions.REFRESH_ACCESS_TOKEN),
        exhaustMap((action: any) => this.userService.refreshToken(action.payload).pipe(
          map(response => {
            console.log(response)
            return RefreshTokenSuccess({payload: response})
          }),
          catchError(error => {
            console.log(error)
            this.router.navigateByUrl('/login')
            return of(RefreshTokenFailure(error))

          })
        ))
      )
    }
  );

  RefreshTokenSuccess$ = createEffect(() => {
      return this.$actions.pipe(
        ofType(authActions.REFRESH_TOKEN_SUCCESS),
        tap((action: any) => {
          localStorage.setItem('accessToken', action.payload.accessToken);
          localStorage.setItem('refreshToken', action.payload.refreshToken);
        })
      )
    }, {dispatch: false}
  );

  constructor(
    private $actions: Actions,
    private userService: AuthService,
    private router: Router,
  ) {
  }


}
