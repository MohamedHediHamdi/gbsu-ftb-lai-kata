import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {


  form: FormGroup;
  @Output()
  submitNumberOutput: EventEmitter<number> = new EventEmitter<number>();

  constructor() {
    this.form = new FormGroup({
      inputNumber: new FormControl('', [Validators.required])
    });
  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    const input = this.form.controls.inputNumber.value;
    this.submitNumberOutput.emit(input);
  }

}
