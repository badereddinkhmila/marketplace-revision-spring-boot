import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {LoginComponent} from './user/login/login.component';
import {SignupComponent} from './user/signup/signup.component';
import {UsersListComponent} from './user/users-list/users-list.component';
import {NotFoundComponent} from './components/errors/notfound/notfound.component';
import {IsSignedInGuard} from "@src/app/guards/IsSignedIn.gaurd";
import {ProductListComponent} from "@src/app/product/product-list/product-list.component";

const routes: Routes = [
  {path: '', component: ProductListComponent},
  {path: 'login', component: LoginComponent},
  {path: 'signup', component: SignupComponent},
  {
    path: 'users', component: UsersListComponent, canActivate: [
      IsSignedInGuard
    ]
  },
  {path: '**', component: NotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
