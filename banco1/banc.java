package banco1;
import java.util.Scanner;
public class banc {
	


		
		public Scanner l;
		

		
		public void banco1(){
			int nose=0,j = 0;
			Ahorr a = new Ahorr();
			cheques c = new cheques();
			
			
		     System.out.println("BANCO ");
		     System.out.println("Ingrese su tipo de cuenta: ");
		     System.out.println("1.CHEQUES");
		     System.out.println("2.CUENTA DE Ahorro \n");
		     nose=l.nextInt();
		     
		     switch(j) {
		     
		     case 1:
		    	 c.cheque1();
		    	 break;
		    	 
		     case 2:
		    	a.ahorro1();
		    	 break;
		    	 
		    	default:
		    		break;
		     }
		
		}
			
		public static  void main(String[] args) {
		
	        banc j = new banc();
	                j.banco1();

	}
	}