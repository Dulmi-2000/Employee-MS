import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-progress-bar',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './progress-bar.component.html',
  styleUrl: './progress-bar.component.scss'
})
export class ProgressBarComponent implements OnInit {
  color: string = '';
 

  @Input() progress: number = 0;
  @Input() firstName: string = '';

  @Output() progressClick: EventEmitter<string> = new EventEmitter<string>();

  constructor() {}

  ngOnInit(): void {
    if (this.progress < 0 || this.progress > 100) {
      this.progress = 0;
      // Progress cannot be less than 0 or over 100 so assign it as 0
    }

    if (this.progress < 35) {
      this.color = 'red';
    } else if (this.progress < 75) {
      this.color = 'yellow';
    } else {
      this.color = 'green';
    }
  }

  onClick() {
    const message = `${this.firstName}'s Progress is ${this.progress}%`;
    this.progressClick.emit(message);
  }


}
