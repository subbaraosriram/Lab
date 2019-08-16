import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'studentpipe'
})
export class StudentpipePipe implements PipeTransform {

  transform(value: string, gen: string): string {
    if(gen.toLowerCase() === "male")
    {
        return 'Mr.' + value;
    }
    else
    {
        return 'Miss.' + value;
    }
  }

}
