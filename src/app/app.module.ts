import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule} from '@angular/forms';
import{RouterModule,Routes} from '@angular/router';
import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { StudentlistComponent } from './studentlist/studentlist.component';
import { StudentpipePipe } from './studentpipe.pipe';
import { StudentcountComponent } from './studentlist/studentcount/studentcount.component';
import { LangPipe } from './lang.pipe';
import { TraninerlistComponent } from './traninerlist/traninerlist.component';
import { AssisnmentlistComponent } from './assisnmentlist/assisnmentlist.component';
import { CreatetrainerComponent } from './createtrainer/createtrainer.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { CreatestudentComponent } from './createstudent/createstudent.component';
import{ Http, HttpModule } from '@angular/http';
import { StudentService } from './student.service';
import { AssignmentComponent } from './assignment/assignment.component';
import { AssignmentService } from './assignment.service';
import { CreateassignmentComponent } from './createassignment/createassignment.component';

const appRoutes: Routes =[
{path:'students',component:StudentlistComponent},
{path:'trainers',component:TraninerlistComponent},
{path:'student/add',component:CreatestudentComponent},
{path:'trainer/add',component:CreatetrainerComponent},
{path:'assignments',component:AssisnmentlistComponent},
{path:'assignment/add',component:CreateassignmentComponent},
{path:'',redirectTo:'/students', pathMatch:'full'},
{path:'**', component: PagenotfoundComponent }

];
@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
   
    StudentlistComponent,
   
    StudentpipePipe,
   
    StudentcountComponent,
   
    LangPipe,
   
    TraninerlistComponent,
   
    AssisnmentlistComponent,
   
    CreatetrainerComponent,
   
    PagenotfoundComponent,
   
    CreatestudentComponent,
   
    AssignmentComponent,
   
    CreateassignmentComponent
  ],
  imports: [
    BrowserModule,FormsModule,RouterModule.forRoot(appRoutes),HttpModule
  ],
  providers: [StudentService,AssignmentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
