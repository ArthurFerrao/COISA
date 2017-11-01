package lab2;

import java.util.ArrayList;

/**
 *
 * @author arthurlf
 */
public class ContaCantina {

    private String nomeCantina;
    private int debitoConta;
    private int itens;
    private ArrayList<String> detalhes;

    ContaCantina(String nomeDaCantina) {
        this.nomeCantina = nomeDaCantina;
        this.detalhes = new ArrayList();
    }

    /**
     *
     * @param qtdItens
     * @param valorCentavos
     */
    public void cadastraLanche(int qtdItens, int valorCentavos) {
        this.itens += qtdItens;
        this.debitoConta += qtdItens * valorCentavos;
    }

    /**
     *
     * @param qtdItens
     * @param valorCentavos
     * @param detalhes
     */
    public void cadastrarLanche(int qtdItens, int valorCentavos, String detalhes) {
        this.cadastraLanche(qtdItens, valorCentavos);
        this.detalhes.add(detalhes);
    }

    /**
     *
     * @return
     */
    public String listarDetalhes() {
        String detalhe = "";
        for (int x = this.detalhes.size() - 5; x < this.detalhes.size(); x++) {
            detalhe += this.detalhes.get(x) + "; ";
        }
        return detalhe;
    }

    /**
     *
     * @param valorCentavos
     */
    public void pagaConta(int valorCentavos) {
        if (this.debitoConta - valorCentavos >= 0) {
            this.debitoConta -= valorCentavos;
        } else {
            this.debitoConta = 0;
        }
    }

    public String toString() {
        return nomeCantina + " " + itens + " " + debitoConta;
    }

}
