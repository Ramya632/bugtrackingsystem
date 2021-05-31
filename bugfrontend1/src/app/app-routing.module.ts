import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BugformComponent } from './bugform/bugform.component';
import { BuglistComponent } from './buglist/buglist.component';

import { UpdatebugComponent } from './updatebug/updatebug.component';

const routes: Routes = [
  {path:'',redirectTo:'bugs',pathMatch:'full'},
  {path:'bugs',component:BuglistComponent},
  {path:'create-bug',component:BugformComponent},
  
  
  
  {path:'update-bug/:id',component:UpdatebugComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
