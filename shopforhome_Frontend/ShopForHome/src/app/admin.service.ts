import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Admin } from './admin';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(public http: HttpClient) { }

  // baseApiUrl = "${environment.baseUrl}api/csv/upload"

  //Loading admin details from the backend
  loadAdminDetails(): Observable<Admin[]> {
    return this.http.get<Admin[]>(`${environment.baseUrl}Admin/displayAdmin`)
  }

  storeAdminDetails(admin: Admin): Observable<string> {
    return this.http.post(`${environment.baseUrl}Admin/register`, admin, { responseType: 'text' })
  }

  loginAdminDetails(admin: Admin): Observable<string> {
    return this.http.post(`${environment.baseUrl}Admin/login`, admin, { responseType: 'text' })
  }

  logoutAdminDetails(email: string): Observable<string> {
    return this.http.get(`${environment.baseUrl}Admin/logout/` + email, { responseType: 'text' })
  }

  adminuser(): Observable<any> {
    return this.http.get<any>(`${environment.baseUrl}Admin/displayAdmin`);
  }

  upload(file):Observable<any> {
  
    const formData = new FormData(); 
    formData.append("file", file, file.name);
    return this.http.post(environment.baseUrl, formData)
}

}



