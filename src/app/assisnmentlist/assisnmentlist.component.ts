 import { Component  } from '@angular/core';
import { Assignment} from '../assignment';
import {AssignmentService } from '../assignment.service';
@Component({
  selector: 'app-assisnmentlist',
  templateUrl: './assisnmentlist.component.html',
  styleUrls: ['./assisnmentlist.component.css']
})
export class AssisnmentlistComponent   {

  assignments : Assignment[];
   constructor(private assignmentService: AssignmentService){
     this.assignmentService.getAssisnment().then(assignmnets => this.assignments = assignmnets  ) }

   

}
