import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LkrFormatterPipe } from './shared/lkr-formatter.pipe';
import { FormsModule } from '@angular/forms';
import { ProgressBarComponent } from "./shared/progress-bar.component";
import { HttpClient, HttpClientModule } from '@angular/common/http';

export class Employee {

  constructor(
   public id: number | string,
   public firstName: string,
   public lastName: string,
   public designation: string,
   public insuranceBalance: number,
   public rbtProgress: number,
   public avatar?: string, // Make the avatar property optional
  
  ) {
  
}
}

@Component({
    selector: 'app-employees',
    standalone: true,
    templateUrl: './employees.component.html',
    styleUrl: './employees.component.scss',
    imports: [
        CommonModule,
        LkrFormatterPipe,
        FormsModule,
      ProgressBarComponent,
        HttpClientModule
    ]
})
export class EmployeesComponent implements OnInit{

  title: string = 'Employee Management System';
  employees: Employee[] = [];
  filteredEmployees: Employee[] = []; // Use Employee[] instead of any[]

  showIcon: boolean = false;
  private _designationFilter: string = '';
  message: string = '';

  set designationFilter(value: string) {
    this._designationFilter = value;
    this.filterByDesignation();
  }

  get designationFilter(): string {
    return this._designationFilter;
  }

  constructor(private httpClient: HttpClient) {}

  ngOnInit(): void {
    this.getEmployees();
  }

  toggleIcon() {
    this.showIcon = !this.showIcon;
  }

  getEmployees() {
    this.httpClient.get<Employee[]>('http://localhost:8080/api/v1/employeeP/insuarance').subscribe(
      response => {
        this.employees = response;
        this.filterByDesignation(); // Apply filter after data retrieval
      },
      error => {
        // Handle error
      }
    );
  }

  filterByDesignation() {
    this.filteredEmployees = this.employees.filter(employee =>
      employee.designation.toLowerCase().includes(this.designationFilter.toLowerCase())
    );
  }

  onMessageReceived(value: string) {
    this.message = value;
  }
}