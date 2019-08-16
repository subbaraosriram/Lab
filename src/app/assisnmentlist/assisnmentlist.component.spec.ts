import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AssisnmentlistComponent } from './assisnmentlist.component';

describe('AssisnmentlistComponent', () => {
  let component: AssisnmentlistComponent;
  let fixture: ComponentFixture<AssisnmentlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AssisnmentlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AssisnmentlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
