package aquecimento;

import java.util.Scanner;

/**********************************************************************************************************************************
 * 
 * Maratona de Programa��o da SBC - 2017            
 * Autor : Duclier do Nascimento Santos
 * Data : 26/12/2017
 * Problema : Jogo de Estrat�gia(Aquecimento)
 * Um jogo de estrat�gia, com J jogadores, � jogado em volta de uma mesa. O primeiro a jogar � o jogador 1, o segundo a
 * jogar � o jogador 2 e assim por diante. Uma vez completada uma rodada, novamento o jogador  faz sua jogada e a ordem
 * dos jogadores se repete novamente. A cada jogada, um jogador garante uma certa quantidade de Pontos de Vitoria.A 
 * pontua��o de cada jogador consiste na soma dos ontos de Vit�ria de cada uma das suas jogadas.
 *  
 *  Dado um n�mero de jogadores, o n�mero de rodadas e uma lista representando os Pontos de Vit�ria na ordem em que 
 *  foram obtidos, voc� deve determinar qual � o jogador vencedor. Caso mais de um jogador obtenha a pontua��o m�xima,
 *  o jogador com pontua��o m�xima que tiver jogado por �ltimo � o vencedor.
 *  
 *  Entrada :
 *  	A entrada consiste de duas linhas. A primeira linha cont�m dois inteiros J e R, o n�mero de jogadores e
 *  de rodadas respectivamente (1<=J,R<=500). A segunda linha cont�m J x R inteiros, correspondentes aos Pontos de Vit�ria
 *  em cada uma das jogadas feitas, na ordem em que aconteceram. Os pontos de Vit�ria obtidos em cada jogada ser�o sempre inteiros 
 *  entre 0 e 100, inclusive.
 *  
 *  Sa�da:
 *  	Seu programa deve produzir uma �nica linha, contendo o inteiro correspondente ao jogador vencedor.
 ************************************************************************************************************************************/

public class Jogo_Estrategia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int jogadores,rodadas;
		
		System.out.println("Entre com o n�mero de jogadores e o n�mero de rodadas.");
		jogadores = s.nextInt();
		rodadas=  s.nextInt();
		
		final int PONTOS = jogadores * rodadas;
		
		int placar[] = new int[PONTOS];
		System.out.println("Entre com a pontua��o.");
		for(int i = 0; i < PONTOS ; i++ ){
			placar[i]= s.nextInt();
		}
		
		int pontosGanhos[] = new int[jogadores];;
		
		for(int j = 0; j < jogadores; j++){
			for(int p = j; p < PONTOS; p+=jogadores) {
				pontosGanhos[j]+=placar[p];
			}
		} 
			
		int maior = 0;
		for(int i = 0; i < pontosGanhos.length-1;i++){
			if(pontosGanhos[maior] <= pontosGanhos[i+1]){
				maior = i+1;
			}
		}
		
		System.out.println("O jogodor "+ (maior+1) +" ganhou com " + pontosGanhos[maior] +" pontos.");
		
	}	
}


