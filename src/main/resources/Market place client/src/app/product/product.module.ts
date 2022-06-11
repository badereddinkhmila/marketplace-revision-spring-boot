import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ProductListComponent} from './product-list/product-list.component';
import {MatCardModule} from '@angular/material/card';
import {MatGridListModule} from "@angular/material/grid-list";
import {ProductItemComponent} from './product-item/product-item.component';
import {MatIconModule} from "@angular/material/icon";
import {MatButtonModule} from "@angular/material/button";
import {SwiperModule} from "swiper/angular";


@NgModule({
  declarations: [
    ProductListComponent,
    ProductItemComponent,
  ],
  imports: [
    CommonModule,
    MatCardModule,
    MatGridListModule,
    MatIconModule,
    MatButtonModule,
    SwiperModule
  ],
  exports: [
    ProductListComponent
  ]
})
export class ProductModule {
}
