/*

Nombre de alumno Emily Karelis Garcia Quichimbo
No. de control 19200853
Materia POO
Abstract (Que hace el programa) programa que nos enseña flujos y archivos
Version PRIMER PROGRAMA DE POO
Fecha	28 de Mayo 2020

*/
import java.util.*;
import javax.swing.JOptionPane;

public class diag1{
	public void Respuestas() {
		String resp;
		char respuestas[];
		resp= JOptionPane.showInputDialog("Ingrese las respuestas del examen: ");
		respuestas = resp.toCharArray();
	}

	public void Alumno(){
		String numcuenta, respalum;
		char respalumno[];
		numcuenta= JOptionPane.showInputDialog("Ingrese el numero de cuenta del alumno: ");
		respalum= JOptionPane.showInputDialog("Ingrese las respuestas del alumno: ");
		//respalumno = respalum.toCharArray();
		int longresp = respalum.length();
		
		if (respalum.length() != 0) {
			System.out.println("Menor");
		}

		System.out.println(numcuenta);
		System.out.println(respalum);
		System.out.println(longresp);
	}

	public static void main(String[] args) {
		Datos alumno = new Datos();
		alumno.Respuestas();
		alumno.Alumno();
	}
}




















