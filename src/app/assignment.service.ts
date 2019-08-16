import { Injectable } from '@angular/core';
import { Http,Headers} from '@angular/http';
import {promise} from '../../node_modules/protractor';
import { Assignment } from './assignment';
import { Student } from './student';
@Injectable()
export class AssignmentService {
  private http:Http;
  private headers = new Headers({'content-type':'application/json'});

  constructor(_http: Http) {
    this.http = _http;
   }
   getAssisnment():Promise<Assignment[]>
   {
     return this.http.get('http://localhost:8089/SpringRest/assignaments/getall')
     .toPromise().then(res => res.json() as  Assignment[])
     .catch(this.handleError);
   }
   createAssignment(assignment: Assignment):Promise<Assignment>
   {
     console.log(JSON.stringify(assignment));
    return this.http.post(`http://localhost:8089/SpringRest/assignaments/add`, JSON.stringify(assignment),{headers : this.headers})
     .toPromise().then(res => res.json() as Assignment)
     .catch(this.handleError);
   }
   
   private handleError(error : any ):Promise<any>{
    console.error('Error',error);
    return Promise.reject(error.message || error);
  }
}
