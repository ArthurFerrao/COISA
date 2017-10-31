
package lab2;

/**
 *
 * @author arthurlf
 */
public class ContaLaboratorio {
    private String nomeLab;
    private int dados;
    private int cota;
    
    
    public ContaLaboratorio(String nomeLab){
        this.nomeLab = nomeLab;
    }
    public ContaLaboratorio(String nomeLab, int cota){
        this.nomeLab = nomeLab;
        this.cota = cota;
    }
    
    
    public void consomeEspaco(int mbytes){
        this.dados+= mbytes;  
    }
    
    public void liberaEspaco(int mbytes){
        if(this.dados - mbytes >= 0){
            this.dados-= mbytes;        
        }else{
            this.dados = 0;
        }
    }
    
    public Boolean atingiuCota(){
        if(this.dados >= this.cota){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return this.nomeLab +" " + this.dados + "/" + this.cota;
    }
    
}
