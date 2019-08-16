import { Component, Input, Output, EventEmitter} from '@angular/core';


@Component({
  selector: 'app-studentcount',
  templateUrl: './studentcount.component.html',
  styleUrls: ['./studentcount.component.css']
})
export class StudentcountComponent  {
@Input()
  all=10;
  @Input()
  female=5;
  @Input()
  male=5;

  selectedRadioButtonValue = 'All';

  @Output()
  countRadioButtonSelectionChanged: EventEmitter<string> = new EventEmitter<string>();

  onRadioButtonSelectionChanged(){
    this.countRadioButtonSelectionChanged.emit(this.selectedRadioButtonValue);
  }

}
