import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { EmployeesComponent } from './employees/employees.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'employees', component: EmployeesComponent },
  { path:'', redirectTo:'/home', pathMatch:'full' },
];

@NgModule({
  declarations: [
    
    // ... other components
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: []
})
export class AppModule { }
