import { Component, OnInit } from '@angular/core';
import { Assignment } from '../assignment';
import { AssignmentService } from '../assignment.service';
import {Router} from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-createassignment',
  templateUrl: './createassignment.component.html',
  styleUrls: ['./createassignment.component.css']
})
export class CreateassignmentComponent  {
assignment = new Assignment();
students : Student[];
id:number;
constructor(private studentService: StudentService,private assignmentService: AssignmentService,private router:Router)
{
  this.studentService.getStudents().then(students => this.students = students);
}
addAssignment():void
{
  console.log(this.id);
  this.assignment ={
    
     'topic':this.assignment.topic,
     'grade':this.assignment.grade,
     'student' :
     {
         'id':this.id,
         'name': 'anyvalue',
         'age': 23

     },
     'aid':this.assignment.aid
  };
  this.assignmentService.createAssignment(this.assignment);
  this.router.navigateByUrl('assignments');
}

}
