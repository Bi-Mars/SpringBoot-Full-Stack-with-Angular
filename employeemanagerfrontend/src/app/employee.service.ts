import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import { Employee } from './employee';

@Injectable({
    providedIn: 'root'
})

export class EmployeeService{
    private apiServerUrl = '';
    
    constructor(private http: HttpClient){}

    public getEmployees(): Observable<Employee[]>{
        return this.http.get<Employee[]>(`${this.apiServerUrl}/api/employee/all`);
    }

    public addEmployees(employee: Employee): Observable<Employee>{
        return this.http.post<Employee>(`${this.apiServerUrl}/api/employee/add`,employee);
    }

    public updateEmployees(employee: Employee): Observable<Employee>{
        return this.http.put<Employee>(`${this.apiServerUrl}/api/employee/update`,employee);
    }

    public deleteEmployee(employeeId: number): Observable<void>{
        return this.http.delete<void>(`${this.apiServerUrl}/api/employee/delete/${employeeId}`);
    }
}