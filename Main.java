import java.util.List;

public class Main {
    public static void main(String[] args) {
      
        Bingo bingo = new Bingo();// Estancia bingo

 
        bingo.iniciar(50); // Inicia um jogo
        
        
        System.out.println("sorteio de 10 bolas:");
        for (int i = 0; i < 10; i++) {
            int numero = bingo.proximo();
            if (numero == -1) {
                System.out.println("Todas as bolas já foram sorteadas.");
                break;
            } else {
                System.out.println("Bola sorteada: " + numero);
            }
        }

        // Teoricamente, Exibe todas as bolas que foram sorteadas (se estiver certo kkk)
