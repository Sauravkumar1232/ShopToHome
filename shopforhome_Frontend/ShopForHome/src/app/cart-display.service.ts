import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Cart } from './cart';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CartDisplayService {

  constructor(public http: HttpClient) { }


  storeCartDetails(cart:Cart):Observable<string>{
    return this.http.post(`${environment.baseUrl}cart/storeCart`, cart, { responseType: 'text' })
  }
}
