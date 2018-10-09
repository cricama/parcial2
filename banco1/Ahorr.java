package banco1;
import java.util.*;

public class Ahorr {
	


		private Scanner sc;
		String cliente;
	    int cuenta;
	    int saldo;
	    String fecha;
	    String interes;
	    
	    banc b = new banc();
	    
	    public void menu_ahorro() {
			int opc=0,s = 0;
			Ahorr se = new Ahorr();
			
	
			 System.out.println("1.registro.");
			 System.out.println("2.consultar.");
			 System.out.println("3.depositar");
			 System.out.println("4.retirar.");
			 System.out.println("5.volver.");
			 opc=sc.nextInt();
			 switch(s) {
			 
			 case 1:
				 se.ahorro1();
				 break;
				 
			 case 2:
				 se.consultar();
				 break;
				 
			 case 3:
				 se.deposita();
				 break;
			 case 4:
				 se.retirar();
				 break;
				 
			 case 5:
				 b.banco1();
				 break;
			default:
				break;
			 }
		}
		
		
		
		public void ahorro1() {
			
			
	      
	      
	                
	                System.out.println("1.) ingrese el numero de la cuenta: ");
	                cuenta=sc.nextInt();
	                
	                System.out.println("2.) ingrese el nombre del cliente: ");
	                cliente=sc.nextLine();
	                
	                System.out.println("3.) ingrese el saldo: ");
	                saldo=sc.nextInt();
	                
	                System.out.println("4.) ingrese la fecha de vencimiento: ");
	                fecha=sc.nextLine();
	                System.out.println("");
	                
	                System.out.println("5.) ingrese el porcentage del interes mensual. ");
	                interes=sc.nextLine();
	                System.out.println("");
	                
	                System.out.println("");
	                
		
	        System.out.println("la cuenta de ahorro se han creado con exito.");

	
		
	     
		}
		
		
		
		public void deposita() {
			int valor;
			 System.out.println("ingrese el valor a depositar:");
			 valor=sc.nextInt();
			 
			 saldo=valor+saldo;
	       
	    }
		
		public void consultar() {
			System.out.println("el saldo de la cuenta de es:"+saldo);
		}
		
		public void retirar() {
			int retiro;
			 System.out.println("ingrese el valor a retirar:");
			 retiro=sc.nextInt();
			saldo=saldo-retiro;
		}
		
		
	}
