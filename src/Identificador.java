import java.util.Scanner;

public class Identificador {
public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int genero,idade,contador = 0,idadeTotal =0,Homem = 0,Mulher = 0,idadeMulher = 0,idadeHomem = 0;
		double mediaTotal,mediaHomem,mediaMulher;
		
		
		do {
			System.out.println(" Qual seu genero: [1]-HOMEM / [2]-MULHER ");
			genero=tc.nextInt();
			
			
			System.out.println("Qual eh a sua idade :");
			idade=tc.nextInt();
			
			if(genero == 1) {
				Homem++;
				idadeHomem= idadeHomem + idade;
			}
			else {
				Mulher++;
				idadeMulher = idadeMulher + idade;
			}
			
			idadeTotal = idadeTotal + idade;
			
			contador ++;
			
		}while(contador <=9);
		
		
		mediaTotal = idadeTotal /10;
		
		
		System.out.println("A media de idade e " + mediaTotal + " anos para Homens e Mulheres !");
		System.out.println(Homem  +  " Homens!" );
		System.out.println(Mulher +  " Mulheres!" );
		
		
		mediaHomem = idadeHomem/Homem;
		System.out.println( "Media de idade " + mediaHomem + " anos para Homens");
		
		mediaMulher = idadeMulher/Mulher;
		System.out.println("Media de idade " + mediaMulher + " anos para Mulheres");
		
		
	
		tc.close();
	}
		

}
