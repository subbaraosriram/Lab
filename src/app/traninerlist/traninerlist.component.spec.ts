import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TraninerlistComponent } from './traninerlist.component';

describe('TraninerlistComponent', () => {
  let component: TraninerlistComponent;
  let fixture: ComponentFixture<TraninerlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TraninerlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TraninerlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
