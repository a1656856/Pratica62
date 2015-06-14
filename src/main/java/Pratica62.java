
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica62 {
    public static void main(String[] args) {
    
       
        Jogador A1 = new Jogador(12,"Roberto");
        Jogador B1 = new Jogador(2,"Rogério");
        Jogador C1 = new Jogador(3,"Ronaldo");
        Jogador D1 = new Jogador(4,"Neymar");
        Jogador A2 = new Jogador(1,"Didi");
        Jogador B2 = new Jogador(5,"Anderson");
        Jogador C2 = new Jogador(7,"Otavios");
        Jogador D2 = new Jogador(8,"Cristiano");
        
        
        Time a = new Time();
        
        Time b = new Time();
        
       
       
        a.addJogador("Goleiro",A2);
        a.addJogador("Atacante", D2);
        a.addJogador("Zagueiro", C2);
        a.addJogador("Meio", B2);
        b.addJogador("Goleiro", A1);
        b.addJogador("Atacante", B1);
        b.addJogador("Meio", C1);
        b.addJogador("Zagueiro", D1);
        
        
        HashMap has = a.getJogadores();
        HashMap hes = b.getJogadores();
        
        
        
        
   
    
   System.out.println("Posição     Time 1        Time 2" );
    Set<String> entries1 = has.keySet();
    
    for (String entry: entries1) {
        
        
        System.out.println(entry +"    "+  has.get(entry)+ "    "  + hes.get(entry));
    }

    
        

    }
}
