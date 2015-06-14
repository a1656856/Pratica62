/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author Julio
 */
public class JogadorComparator implements Comparator<Jogador>{
    
   private final Boolean a;
   private final Boolean b;
   private final Boolean c;
    
    public JogadorComparator(Boolean a, Boolean b , Boolean c){
        
       this.a = a;
       this.b = b;
       this.c = c;
        
        
        
        
        
           
        
    }
    
    public JogadorComparator(){
    
  this(true,true,true);
    
}
    
    
    
    @Override
    public int compare(Jogador o1, Jogador o2) {
        int N=0;
        
        if (this.a == true){
            
            if(this.b ==true)N = o1.compareTo(o2); 
            else  N = -1*o1.compareTo(o2); 
            if(N == 0 && this.c == true){N = (o1.getNome().length()- o2.getNome().length());
            if(N == 0) N = -1*(o1.getNome().length()- o2.getNome().length());
        } }
        
        if(this.a == false){ 
            if(this.c == true){N = (o1.getNome().length()- o2.getNome().length());}
            else N = -1*(o1.getNome().length()- o2.getNome().length());
            if(N==0 && this.b ==true){ N = o1.compareTo(o2); }
            if(N==0) N = -1*o1.compareTo(o2); 
            }
        
     
        
        return N;
    }
}
/*
Esta classe deve implementar um construtor que receba 
três valores boolean: o primiero, se verdadeiro, indica 
ordenação por número, 
o segundo, se verdadeiro, indica que desejamos ordenar por número 
ascendente e o terceiro argumento,
se verdadeiro, indica que desejamos ordenar por nome ascendente.
*/