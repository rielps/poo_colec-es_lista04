import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bingo {
    private int numeroDeBolas;
    private List<Integer> bolasSorteadas;
    private Random random;

    public Bingo() { // Construtor
        bolasSorteadas = new ArrayList<>();
        random = new Random();
    }

    
    public void iniciar(int numeroDeBolas) { // Método de iniciar o jogo 
        this.numeroDeBolas = numeroDeBolas;
        bolasSorteadas.clear(); // irá limpar a lista de bolas sorteadas 
    }

    
    public int proximo() { // sorteia uma próxima bola
        if (bolasSorteadas.size() >= numeroDeBolas) {
            return -1; 
        }

        int bola;
        do {
            bola = random.nextInt(numeroDeBolas) + 1; //Sorteia um número entre 1 e numeroDeBolas
        } while (bolasSorteadas.contains(bola)); //verificação

        bolasSorteadas.add(bola); //Adiciona a bola sorteada à lista, caso ela nao tenha sido sorteada antes

        return bola;
    }

   
    public List<Integer> sorteados() {
        return new ArrayList<>(bolasSorteadas); // retorna as bolas sorteadas
    }

  
    public boolean todasSorteadas() {  // Método para verificar se todas as bolas já foram sorteadas
        return bolasSorteadas.size() == numeroDeBolas;
    }

  
    public int getNumeroDeBolas() {  // Método para obter o número de bolas disponíveis
        return numeroDeBolas;
    }
}
//fim ;)