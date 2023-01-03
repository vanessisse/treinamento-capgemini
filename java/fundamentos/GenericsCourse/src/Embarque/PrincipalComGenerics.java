package Embarque;
import java.util.Scanner;

import Controle.AeronavesComGenerics;

/*
Informar a quantidade de aeronaves no pátio e o número de voos por ordem de chegada. 
A ordem de decolagem é FIFO: o primeiro que entra é o primeiro que sai. 
Mostrar qual é a primeira aeronave a decolar.
*/
public class PrincipalComGenerics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		AeronavesComGenerics<Integer> aero = new AeronavesComGenerics<>();
		System.out.println("Informe o número de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		// Adicionando voos
		for (int i = 0; i < nrAeronaves; i++) {
			Integer nrVoo = sc.nextInt();
			aero.addVoo(nrVoo);
		}
		aero.primeiroVoo();
		Integer x = (Integer) aero.primeiroVoo();
		System.out.println("A primeira a decolar será a aeronave: " + x);
		sc.close();
	}
}