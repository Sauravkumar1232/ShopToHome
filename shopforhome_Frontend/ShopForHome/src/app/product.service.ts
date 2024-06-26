import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'//giving the information  in providers attribute in app.module.ts
})
export class ProductService {

  constructor(public http: HttpClient, private router: Router) { } //DI for HttpClient API

  //Loading product detains from the backend
  loadProductDetails(): Observable<Product[]> {
    // return this.http.get<Product[]>("http://localhost:9123/product/getAllProduct")
  
    return this.http.get<Product[]>( `${environment.baseUrl}product/getAllProduct`)


  }

  storeProductDetails(product: Product): Observable<string> {
    return this.http.post(`${environment.baseUrl}product/storeProduct`, product, { responseType: 'text' })
  }

  deleteProductDetails(pid: number): Observable<string> {
    return this.http.delete( `${environment.baseUrl} product/deleteProduct/` + pid, { responseType: 'text' });
  }

  updateProductInfo(product: any): Observable<string> {
    return this.http.patch(`${environment.baseUrl}/product/updateProduct`, product, { responseType: 'text' })
  }

  loggedIn() {
    console.log(localStorage.getItem);
    return !!localStorage.getItem('token')
  }

  logoutUser() {
    localStorage.removeItem('token');
    this.router.navigate([''])
  }
}
