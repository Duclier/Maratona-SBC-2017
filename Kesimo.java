package aquecimento;

import java.util.Scanner;

/***************************************
 * Maratona de Programa��o da SBC - 2017            
 * Autor : Duclier do Nascimento Santos
 * Data : 24/12/2017
 * Problema : Fatorial(Aquecimento)
 * O fatorial de um n�mero inteiro positivo N, denotado por N!, � definido como o produto do s inteiros
 * positivos menores do que ou iguais a N. Por exemplo 4! = 4 x 3 x 2 x 1 = 24.
 * 	Dado um inteiro positivo N, voc� deve escrever um programa para determinar o menor n�mero k tal que N = a1! + a2!...
 * +ak!, onde cada ai, para 1<= i <= k , � um n�mero inteiro positivo.
 * 	Por exemplo, para N = 10 a resposta � 3, pois � poss�vel escrever N como a soma de tr�s n�meros fatoriais: 10=3! + 
 * 2! + 2!. Para N = 25 a resposta � 2, pois � poss�vel escrever N como a soma de dois n�meros fatoriais: 25= 4! + 1!.
 ****************************************/

public class Kesimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int n = s.nextInt();
		int fat = 1,calc_fat = 0, menor_k=0;
		
		for(int i=8; calc_fat < n;){
			for(int j=i; j>0;j--){
				fat= fat *j;
			}
			if((fat > n) || (calc_fat+fat > n)){
				fat=1;
				i--;
			}else if((calc_fat+(2*fat) <= n)){
				calc_fat = calc_fat + fat;
				menor_k++;
				fat=1;
			}else{
				calc_fat = calc_fat +fat;
				i--;
				menor_k++;
				fat=1;
			}
		}
		System.out.println("K-�simo fatorial:" + menor_k);
	}

}
