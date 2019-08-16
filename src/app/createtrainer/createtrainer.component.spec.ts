import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatetrainerComponent } from './createtrainer.component';

describe('CreatetrainerComponent', () => {
  let component: CreatetrainerComponent;
  let fixture: ComponentFixture<CreatetrainerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreatetrainerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreatetrainerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
