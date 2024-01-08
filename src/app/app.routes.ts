import { Routes } from '@angular/router';
import { EmployeesComponent } from './employees/employees.component';
import { HomeComponent } from './home/home.component';

export const routes: Routes = [
    { path: 'employees', component: EmployeesComponent },
    { path: 'home', component: HomeComponent },
    { path:'',redirectTo:'home',pathMatch:'full'},
];
