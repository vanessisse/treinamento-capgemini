import { Component } from '@angular/core';

@Component({
  selector: 'app-segundo-componente',
  templateUrl: './segundo-componente.component.html',
  styles: ["h2 {color: #F7358D;}"]
})
export class SegundoComponenteComponent {
  nome = "Minnie";
  dataNascimento = "1928-11-18";
  urlImagem = "/assets/minnie.png";

  mostrarDataNascimento() {
    alert(`A data de nascimento da Minnie é: ${this.dataNascimento}`);
  }
}
