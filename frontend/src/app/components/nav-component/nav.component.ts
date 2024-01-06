import { Component } from '@angular/core';

@Component({
  selector: 'nav-component',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.sass']
})
export class NavComponent {
  onAdd() {
    console.log("the add task button have been clicked");
    this.enableOneAndDisableOthers('form-add-component');
  }

  onEdit() {
    console.log("the edit task button have been clicked");
    this.enableOneAndDisableOthers('form-update-component');
  }

  onDelete() {
    console.log("the delete task button have been clicked");
    this.enableOneAndDisableOthers('form-delete-component');
  }

  onView() {
    console.log("the view tasks button have been clicked");
    this.enableOneAndDisableOthers('view-component');
  }

  enableOneAndDisableOthers(elementName: string) {
    (document.querySelector('form-add-component') as HTMLElement).style.display = "none";
    (document.querySelector('form-update-component') as HTMLElement).style.display = "none";
    (document.querySelector('form-delete-component') as HTMLElement).style.display = "none";
    (document.querySelector('view-component') as HTMLElement).style.display = "none";
    (document.querySelector(elementName) as HTMLElement).style.display = "block";
  }
}
