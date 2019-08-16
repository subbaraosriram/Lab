import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  // template: `<h1>Welcome{{title?title:'no value'}}
  //               {{34*54+32}}<br>
  //               {{name}}
  //               <input type="text" name="name" value="Sriram"/>
  //               <button disabled='{{isDisabled}}'> Click me</button>
  //               <button [disabled]="isDisabled">ClickMe</button>
  //               <div>{{badData}}</div>
  //               <div>[innerHtml]="baddata"</div>
  //               </h1>`,
  
  styleUrls: ['./app.component.css']
   


})
export class AppComponent {
  title = 'Student App';
  name = 'sriram';
  name1 = 'ramani';
  isDisabled = false;
  baddata = 'Hello<script>alert(hello)</script>welcome';
}
