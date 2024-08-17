import java.time.Duration;

public class mainmusica {

    public static void main(String[] args) {
        // Cria algumas músicas
        Musica musica1 = new Musica("Imagine", "John Lennon", "Imagine", Duration.ofMinutes(3).plusSeconds(15));
        Musica musica2 = new Musica("Bohemian Rhapsody", "Queen", "A Night at the Opera", Duration.ofMinutes(5).plusSeconds(55));
        Musica musica3 = new Musica("Billie Jean", "Michael Jackson", "Thriller", Duration.ofMinutes(4).plusSeconds(54));

        // Cria uma playlist
        PlayList playlist = new PlayList("Clássicos do Rock", "As melhores músicas do rock de todos os tempos");

        // Insere as músicas na playlist
        playlist.Inserir(musica1);
        playlist.Inserir(musica2);
        playlist.Inserir(musica3);

        // Exibe as informações da playlist
        System.out.println(playlist.toString());

        // Lista todas as músicas da playlist
        System.out.println("\nMúsicas na playlist:");
        for (Musica m : playlist.Listar()) {
            System.out.println(m.toString
