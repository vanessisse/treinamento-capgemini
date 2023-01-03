package Embarque;
import java.util.Scanner;

import Controle.Aeronaves;

/*
 Informar a quantidade de aeronaves no pátio e o número de vôos por ordem de chegada. 
 A ordem de decolagem é FIFO: o primeiro que entra é o primeiro que sai. 
 Mostrar qual é a primeira aeronave a decolar.
 */
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		Aeronaves aero = new Aeronaves();
		System.out.println("Informe o número de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		// Adicionando vôos
		for (int i = 0; i < nrAeronaves; i++) {
			int nrVoo = sc.nextInt();
			aero.addVoo(nrVoo);	
		}
		System.out.println("O primeiro a decolar será o número: " + aero.primeiroVoo());
		aero.listaVoos();
		sc.close();
		
	}

}
