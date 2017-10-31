package lab2;

import java.util.ArrayList;

/**
 *
 * @author arthurlf
 */
public class Aluno {

    private ArrayList<ContaLaboratorio> contasLab;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<ContaCantina> contasCantina;
    private Saude saude;
     
    public void cadastraLaboratorio(String nomeLaboratorio){
        ContaLaboratorio conta = new ContaLaboratorio(nomeLaboratorio);
        this.contasLab.add(conta);
    }
    
    
    public void cadastraLaboratorio(String nomeLaboratorio, int cota){
        ContaLaboratorio conta = new ContaLaboratorio(nomeLaboratorio,cota);
        this.contasLab.add(conta);
    }
    
    public void consomeEspaco(String nomeLaboratorio, int mbytes){
        
    }
}
