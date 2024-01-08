import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes, RouterOutlet } from '@angular/router';
import { EmployeesComponent } from './employees/employees.component';
import { FormsModule } from '@angular/forms';

import { BrowserModule } from '@angular/platform-browser';
import { HomeComponent } from './home/home.component';
import { routes } from './app.routes';



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    CommonModule,
    RouterOutlet,
    EmployeesComponent,
    FormsModule,
    HomeComponent,
    RouterModule
  ],

  
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'proj1';


}
