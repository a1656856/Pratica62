/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Julio
 */
public class Time {
    
   
    private HashMap<String, Jogador> jogadores;
    
    
    public Time(){
    
  HashMap<String, Jogador> jogadores = new HashMap<>();
  this.jogadores = jogadores;
    
}
    
    public void addJogador(String posicao,Jogador j){
        jogadores.put(posicao, new Jogador(j.getNumero(),j.getNome()));
    }
    
   
        
   
    public HashMap getJogadores(){
       return jogadores;
   }

       public List<Jogador> ordena(JogadorComparator comparacao)
    {
        //Criando uma lista com os valores do mapa
        List<Jogador> sortido = new ArrayList<>(jogadores.values());
        //Ordenando a lista
        Collections.sort(sortido, comparacao);
        return sortido;
    }
}
