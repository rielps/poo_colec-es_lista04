import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String nome;
    private String descricao;
    private List<Musica> musicas;

    public PlayList(String nome, String descricao) { //construindo...
        this.nome = nome;
        this.descricao = descricao;
        this.musicas = new ArrayList<>();
    }

    public void Inserir(Musica m) { deve inserir uma música na playlist
        musicas.add(m);
    }

    public List<Musica> Listar() { //lista as musicas
        return new ArrayList<>(musicas); // Retorna uma cópia da lista 
    }

    public Duration TempoTotal() { // calcula o tempo total da playlist
        Duration total = Duration.ZERO;
        for (Musica musica : musicas) {
            total = total.plus(musica.getDuracao());
        }
        return total;
    }
    @Override
    public String toString() { //informações da playlist
        return "Playlist: " + nome + "\nDescrição: " + descricao + "\nNúmero de Músicas: " + musicas.size() +
               "\nTempo Total: " + formatarDuracao(TempoTotal());
    }
    private String formatarDuracao(Duration duracao) {
        long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;
        long segundos = duracao.getSeconds() % 60;
        return String.format("%02d:%02d:%02d", horas, minutos, segundos); //formata a duração
    }
}
