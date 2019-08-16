import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-createstudent',
  templateUrl: './createstudent.component.html',
  styleUrls: ['./createstudent.component.css']
})
export class CreatestudentComponent  {

student = new Student();
constructor(private studentService: StudentService,private router:Router)
{
  
}
addStudent():void
{
  console.log(this.student.id);
  console.log(this.student.name);
  console.log(this.student.age);
  this.studentService.createStudent(this.student);
  this.router.navigateByUrl('students');
}

}
