import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Bug } from '../bug';
import { BugService } from '../bug.service';

@Component({
  selector: 'app-bugform',
  templateUrl: './bugform.component.html',
  styleUrls: ['./bugform.component.css']
})
export class BugformComponent implements OnInit {
bug:Bug=new Bug();
  constructor(private bugService:BugService,
               private router:Router) { }

  ngOnInit(): void {
  }
  saveBug(){
    this.bugService.createBug(this.bug).subscribe( data =>{
      console.log(data);
      this.goToBugList();
    },
    error => console.log(error));
  }

  goToBugList(){
    this.router.navigate(['/bugs']);
  }
  onSubmit()
  {
    console.log(this.bug);
    this.saveBug();
  }

}
