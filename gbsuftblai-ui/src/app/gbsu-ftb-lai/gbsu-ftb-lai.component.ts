import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {GbsuFtbLaiService} from '../gbsu-ftb-lai.service';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {


  private $convertNumberSubscription: Subscription;

  inputNbr: number;
  numberConverted: NumberConverted = new class implements NumberConverted {
    numberToConvert: number;
    result: string;
  };

  convertedNumbers: Array<any> = new Array<any>();

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) {
  }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
    if (this.$convertNumberSubscription) {
      this.$convertNumberSubscription.unsubscribe();
    }
  }

  convertNumber(inputNumber: number): void {
    this.numberConverted.numberToConvert = inputNumber;
    this.$convertNumberSubscription = this.gbsuFtbLaiService.convertNumber(inputNumber)
      .subscribe((data: any) => {
        this.numberConverted.result = data.result;
        this.convertedNumbers.push({convertedNumber: inputNumber, result: data.result});
      });
  }

}

export interface NumberConverted {
  numberToConvert: number;
  result: string;
}
