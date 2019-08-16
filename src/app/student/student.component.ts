import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent  {

  center = 'center'; 
  colspanv = 2;
   stuid = 132;
   stuname = 'sriram';
   age = 21;
   marks = 67;
   gen = 'male';
   showDetails = false;
   
   toggleDetails():void
  {
       this.showDetails = !this.showDetails;
  }
  

}
