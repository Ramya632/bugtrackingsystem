import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bug } from '../bug';
import { BugService } from '../bug.service';

@Component({
  selector: 'app-updatebug',
  templateUrl: './updatebug.component.html',
  styleUrls: ['./updatebug.component.css']
})
export class UpdatebugComponent implements OnInit {
  id:number;
bug:Bug=new Bug();
  constructor(private bugService:BugService,private router: Router,
    private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.bugService.getBugById(this.id).subscribe(data => {
      
      this.bug = data;
    }, error => console.log(error));

  }
  
  updateEmployee() {
    this.bugService.updateBug(this.id, this.bug)
      .subscribe(data => {
        console.log(data);
        this.bug = new Bug();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateEmployee();    
  }

  gotoList() {
    this.router.navigate(['/bugs']);
  }

}
