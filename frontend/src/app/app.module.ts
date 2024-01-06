import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormDeleteComponent } from './components/form-delete-component/form-delete.component';
import { FormAddComponent } from './components/form-add-component/form-add.component';
import { FormUpdateComponent } from './components/form-update-component/form-update.component';
import { ViewComponent } from './components/view-component/view.component'
import { NavComponent } from './components/nav-component/nav.component'

@NgModule({
  declarations: [
    AppComponent,
    FormDeleteComponent,
    FormAddComponent,
    FormUpdateComponent,
    ViewComponent,
    NavComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
