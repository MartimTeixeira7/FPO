/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp05.cd;

/**
 *
 * @author Utilizador
 */
public class CD {
    public String bandName;
    public String cdName;
    public int totalTime;
    public int year;
    public String editor;
    public Artist[] artists;
    public Track[] tracks;

    public CD(String bandName, String cdName, int year, String editor, int totalTime, Artist[] artists) {
        this.bandName = bandName;
        this.cdName = cdName;
        this.year = year;
        this.editor = editor;
        this.totalTime = totalTime;
        this.artists = artists;
        this.tracks = new Track[15]; 
    }
}