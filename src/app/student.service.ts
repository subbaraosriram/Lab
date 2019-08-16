import { Injectable } from '@angular/core';
import { Http,Headers} from '@angular/http';
import {promise} from '../../node_modules/protractor';
import { Student } from './student';
@Injectable()
export class StudentService {
  private http:Http;
  private headers = new Headers({'content-type':'application/json'});

  constructor(_http: Http) {
    this.http = _http;
   }
   createStudent(student: Student):Promise<Student>
   {
     return this.http.post(`http://localhost:8089/SpringRest/student/adds`, JSON.stringify(student),{headers : this.headers})
     .toPromise().then(res => res.json() as Student)
     .catch(this.handleError);
   }
   getStudents():Promise<Student[]>
   {
     return this.http.get(`http://localhost:8089/SpringRest/student/students`)
     .toPromise().then(res => res.json() as Student[])
     .catch(this.handleError);
   }
   deleteStudent(id:number): Promise<void>{
     const url = `http://localhost:8089/SpringRest/student/dels/${id}`;
     return this.http.delete(url,{headers:this.headers}).toPromise().then(() => null).catch(this.handleError);
   }
   updateStudent(student:Student):Promise<Student>
   {
    return this.http.put(`http://localhost:8089/SpringRest/student/upds`,JSON.stringify(student),{headers : this.headers})
    .toPromise().then(res => res.json() as Student)
    .catch(this.handleError);

   }
    
   private handleError(error : any ):Promise<any>{
     console.error('Error', error);
     return Promise.reject(error.message || error);
   }
 
}
