/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Julio
 */
public class Jogador implements Comparable<Jogador>{
    private final int numero;
    private final String nome;

    public Jogador(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    public int getNumero(){
        return numero;
    }
    
    public String getNome(){
        return nome;
    }
    @Override
    public String toString() {
        return numero + " - " + nome;
    }
    @Override
    public int compareTo(Jogador jogador) {
        return this.getNumero() - jogador.getNumero();
    }

}