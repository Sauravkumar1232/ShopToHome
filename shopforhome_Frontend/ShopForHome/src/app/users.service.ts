
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { Users } from './users';
import { map } from 'rxjs/operators';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  //userURL: any = environment.userURL;


  constructor(public http: HttpClient) {

  }
  isLoggedIn(): boolean {
    return !!localStorage.getItem('email');
  }

  isAdminLoggedIn(): boolean {
    return !!localStorage.getItem('email');
  }
  email(): string | null {
    return localStorage.getItem("email");
  }

  adminname(): string | null {
    return localStorage.getItem("email");
  }

  //Loading user Details from the backend
  loadUserDetails(): Observable<Users[]> {
    return this.http.get<Users[]>(`${environment.baseUrl}/User/displayUser`)
  }

  storeUserDetails(user: Users): Observable<string> {
    return this.http.post(`${environment.baseUrl}User/register`, user, { responseType: 'text' })
  }

  loginUserDetails(user: Users): Observable<string> {
    return this.http.post(`${environment.baseUrl}User/login`, user, { responseType: 'text' })
  }

  logoutUserDetails(email: string): Observable<string> {
    return this.http.get(`${environment.baseUrl}User/logout/` + email, { responseType: 'text' })
  }

  deleteUserDetails(email: string): Observable<string> {
    return this.http.delete(`${environment.baseUrl}User/deleteUser/` + email, { responseType: 'text' });
  }

  updateUserDetails(user: any): Observable<string> {
    return this.http.patch(`${environment.baseUrl}User/updateUser`, user, { responseType: 'text' })
  }

  loginUser(): Observable<any> {
    return this.http.get<any>(`${environment.baseUrl}User/displayUser`);
  }
}
