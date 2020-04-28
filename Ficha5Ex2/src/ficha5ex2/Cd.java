/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5ex2;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author marce
 */
public class Cd {
    protected String bandName;
    protected String cdName;
    protected float tempoSecs;
    protected LocalDate anoLancamento;
    protected String editora;
    protected ElemntoDaBanda elementos[];
    protected Musica musicas[];

    public Cd(String bandName, String cdName, float tempoSecs, LocalDate anoLancamento, String editora, ElemntoDaBanda[] elementos, Musica[] musicas) {
        this.bandName = bandName;
        this.cdName = cdName;
        this.tempoSecs = tempoSecs;
        this.anoLancamento = anoLancamento;
        this.editora = editora;
        this.elementos = elementos;
        this.musicas = musicas;
    }
    
    
}
