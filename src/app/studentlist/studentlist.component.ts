import { Component  } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-studentlist',
  templateUrl: './studentlist.component.html',
  styleUrls: ['./studentlist.component.css']
})
export class StudentlistComponent
{
  students : Student[];
   constructor(private studentService: StudentService){
     this.studentService.getStudents().then(students => this.students = students) }
     edit(student : Student) : void{
  
    }
    delete(student : Student) : void{
      this.studentService.deleteStudent(student.id).then(() => this.goBack());
    }
    goBack():void{
      window.location.replace('');
    }
   /* center = 'center'; 
  // colspanv = 12;
   selectedStudentCountRadioButton = 'All';
   getTotalCount(): number {
     return this.students.length;

   }
   getTotalMaleCount(): number {
     return this.students.filter(s => s.gender === 'male').length;
   }
   getTotalFemaleCount(): number {
    return this.students.filter(s => s.gender === 'female').length;
  }
   onStudentCountRadioButtonChanged(selectedRadioButtonValue: string) : void{
    this.selectedStudentCountRadioButton = selectedRadioButtonValue;
  } */
}