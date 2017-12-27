package aquecimento;

import java.util.Scanner;

/**********************************************************************************************************************************
 * 
 * Maratona de Programação da SBC - 2017            
 * Autor : Duclier do Nascimento Santos
 * Data : 26/12/2017
 * Problema : Jogo de Estratégia(Aquecimento)
 * Um jogo de estratégia, com J jogadores, é jogado em volta de uma mesa. O primeiro a jogar é o jogador 1, o segundo a
 * jogar é o jogador 2 e assim por diante. Uma vez completada uma rodada, novamento o jogador  faz sua jogada e a ordem
 * dos jogadores se repete novamente. A cada jogada, um jogador garante uma certa quantidade de Pontos de Vitoria.A 
 * pontuação de cada jogador consiste na soma dos ontos de Vitória de cada uma das suas jogadas.
 *  
 *  Dado um número de jogadores, o número de rodadas e uma lista representando os Pontos de Vitória na ordem em que 
 *  foram obtidos, você deve determinar qual é o jogador vencedor. Caso mais de um jogador obtenha a pontuação máxima,
 *  o jogador com pontuação máxima que tiver jogado por último é o vencedor.
 *  
 *  Entrada :
 *  	A entrada consiste de duas linhas. A primeira linha contém dois inteiros J e R, o número de jogadores e
 *  de rodadas respectivamente (1<=J,R<=500). A segunda linha contém J x R inteiros, correspondentes aos Pontos de Vitória
 *  em cada uma das jogadas feitas, na ordem em que aconteceram. Os pontos de Vitória obtidos em cada jogada serão sempre inteiros 
 *  entre 0 e 100, inclusive.
 *  
 *  Saída:
 *  	Seu programa deve produzir uma única linha, contendo o inteiro correspondente ao jogador vencedor.
 ************************************************************************************************************************************/

public class Jogo_Estrategia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int jogadores,rodadas;
		
		System.out.println("Entre com o número de jogadores e o número de rodadas.");
		jogadores = s.nextInt();
		rodadas=  s.nextInt();
		
		final int PONTOS = jogadores * rodadas;
		
		int placar[] = new int[PONTOS];
		System.out.println("Entre com a pontuação.");
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


