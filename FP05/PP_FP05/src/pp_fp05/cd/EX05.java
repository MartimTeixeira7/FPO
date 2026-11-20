/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp05.cd;

/**
 *
 * @author Utilizador
 */
public class EX05 {
    public static void main(String[] args) {
        Artist a1 = new Artist("Artista 1", "1977-03-04", "German");
        Artist[] artists = { a1 };
        
        Track t1 = new Track(1, "Ho Hey", 90, "Lumineers");
        Track t2 = new Track(2, "Stubborn Love", 105, "Wesley Schltz");
        
        CD cd = new CD("The Lumineers", "The Lumineers", 2012, "Dualtone Records", 195, artists);
        
        cd.tracks[0] = t1;
        cd.tracks[14] = t2;
        
        System.out.println("Nome do cd: " + cd.cdName);
        System.out.println("Ano de lancamento: " + cd.year);
        System.out.println("Editora: " + cd.editor);
        
        int nTracks = cd.tracks.length;
        for (int i = 0; i < nTracks; i++) {
            if (cd.tracks[i] != null) {
                Track t = cd.tracks[i];
                System.out.println("Musica numero: " + t.number + " com titulo: " + t.name);
                System.out.println("Duracao (em segundos): " + t.duration);
                System.out.println("Autor da musica: " + t.authorName);
            }
        }
    }
}