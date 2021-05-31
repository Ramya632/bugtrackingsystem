import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Bug } from './bug';
@Injectable({
  providedIn: 'root'
})
export class BugService {
  private baseUrl='http://localhost:8086/bug'

  constructor(private httpClient:HttpClient) { }
getBug(id:number):Observable<any>
{
  return this.httpClient.get(`${this.baseUrl}/${id}`);
}
getBugList():Observable<Bug[]>
{
  return this.httpClient.get<Bug[]>(`${this.baseUrl}`);
}

createBug(bug: Bug): Observable<Object>{
  return this.httpClient.post(`${this.baseUrl}`, bug);
}



getBugById(id: number): Observable<Bug> {
  return this.httpClient.get<Bug>(`${this.baseUrl}/${id}`);
}
updateBug(id: number, bug: Bug): Observable<Object> {
  return this.httpClient.put(`${this.baseUrl}/${id}`, bug);
}
}