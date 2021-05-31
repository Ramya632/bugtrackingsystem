import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

import { Bug } from '../bug';
import { BugService } from '../bug.service';

@Component({
  selector: 'app-buglist',
  templateUrl: './buglist.component.html',
  styleUrls: ['./buglist.component.css']
})
export class BuglistComponent implements OnInit {
  bugs: Bug[];
  constructor(private bugService:BugService,
      private router:Router)
     { } 

  ngOnInit():void {
    this.getBugs();
    
  }
  private getBugs()
  {
    this.bugService.getBugList().subscribe(data => {
        this.bugs=data;
      });
  }
  updateBug(id:number)
  {
    this.router.navigate(['update-bug',id]);
  }

}
