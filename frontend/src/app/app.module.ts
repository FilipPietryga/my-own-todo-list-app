import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormDeleteComponent } from './components/form-delete-component/form-delete.component';
import { FormAddComponent } from './components/form-add-component/form-add.component';
import { FormUpdateComponent } from './components/form-update-component/form-update.component';
import { ViewComponent } from './components/view-component/view.component'
import { NavComponent } from './components/nav-component/nav.component';
import { ViewItemComponent } from './components/view-item-component/view-item.component'

@NgModule({
  declarations: [
    AppComponent,
    FormDeleteComponent,
    FormAddComponent,
    FormUpdateComponent,
    ViewComponent,
    NavComponent,
    ViewItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
