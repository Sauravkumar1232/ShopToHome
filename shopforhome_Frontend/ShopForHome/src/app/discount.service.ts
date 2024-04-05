import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Discount } from './discount';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class DiscountService {

  constructor(public http: HttpClient) { }

  loadDiscount():Observable<Discount[]>{
    return this.http.get<Discount[]>(`${environment.baseUrl}discount/discountName`)
  } 
}
