package trabajo1.com;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import trabajo1.com.componentes.Dependencia;

@SpringBootApplication
public class Trabajo1Application implements CommandLineRunner {

	Dependencia dependencia;
	

	public Trabajo1Application(Dependencia dependencia) {
		
		this.dependencia = dependencia;
	}

	public static void main(String[] args) {
		SpringApplication.run(Trabajo1Application.class, args);
	}

	@Override
	public void run(String... args) {
	    //suma
		//this.dependencia.salida_mensaje(this.dependencia.suma(dependencia.leer_teclado(), dependencia.leer_teclado()));
		
		//resta
		//this.dependencia.salida_mensaje(this.dependencia.resta(dependencia.leer_teclado(), dependencia.leer_teclado()));
		
		//multiplicacion
		//this.dependencia.salida_mensaje(this.dependencia.multiplicacion(dependencia.leer_teclado(), dependencia.leer_teclado()));
		
		//division
		//this.dependencia.salida_mensaje(this.dependencia.division(dependencia.leer_teclado(), dependencia.leer_teclado()));
		
		//Sacar el mayor de dos numeros
		//this.dependencia.salida_mensaje(this.dependencia.mayor(this.dependencia.leer_teclado(), this.dependencia.leer_teclado()));
	
	       //devuelve un array list
		ArrayList<String> vector= this.dependencia.tabla(dependencia.leer_teclado());
		
		for(String valor: vector) 
		{
			dependencia.salida_mensaje(valor);
		}
	}
}
