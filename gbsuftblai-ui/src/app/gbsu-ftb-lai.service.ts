import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {NumberConverted} from './gbsu-ftb-lai/gbsu-ftb-lai.component';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {

  apiURL = 'http://localhost:8080/gbsu-ftb-lai';

  constructor(private http: HttpClient) {
  }

  public convertNumber(inputNumber: number): Observable<string> {
    return this.http.get<string>(`${this.apiURL}/${inputNumber}`);
  }

}
