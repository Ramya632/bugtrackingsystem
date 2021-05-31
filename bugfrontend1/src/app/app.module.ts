import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BuglistComponent } from './buglist/buglist.component';
import { BugformComponent } from './bugform/bugform.component';
import { FormsModule } from '@angular/forms';
import { UpdatebugComponent } from './updatebug/updatebug.component';



@NgModule({
  declarations: [
    AppComponent,
    BuglistComponent,
    BugformComponent,
    UpdatebugComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
