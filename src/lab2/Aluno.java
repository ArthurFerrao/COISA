package lab2;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author arthurlf
 */
public class Aluno {

    private HashMap<String, ContaLaboratorio> contasLab;
    private HashMap<String, Disciplina> disciplinas;
    private HashMap<String, ContaCantina> contasCantina;
    private Saude saude;

    /**
     *
     */
    public Aluno() {
        this.contasLab = new HashMap<String, ContaLaboratorio>();
        this.disciplinas = new HashMap<String, Disciplina>();
        this.contasCantina = new HashMap<String, ContaCantina>();
        this.saude = new Saude();
    }

    /**
     *
     * @param nomeLaboratorio
     */
    public void cadastraLaboratorio(String nomeLaboratorio) {
        this.contasLab.put(nomeLaboratorio, new ContaLaboratorio(nomeLaboratorio));
    }

    /**
     *
     * @param nomeLaboratorio
     * @param cota
     */
    public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
        this.contasLab.put(nomeLaboratorio, new ContaLaboratorio(nomeLaboratorio, cota));
    }

    /**
     *
     * @param nomeLaboratorio
     * @param mbytes
     */
    public void consomeEspaco(String nomeLaboratorio, int mbytes) {
        this.contasLab.get(nomeLaboratorio).consomeEspaco(mbytes);
    }

    /**
     *
     * @param nomeLaboratorio
     * @param mbytes
     */
    public void liberaEspaco(String nomeLaboratorio, int mbytes) {
        this.contasLab.get(nomeLaboratorio).liberaEspaco(mbytes);
    }

    /**
     *
     * @param nomeLaboratorio
     * @return
     */
    public boolean atingiuCota(String nomeLaboratorio) {
        return this.contasLab.get(nomeLaboratorio).atingiuCota();
    }

    /**
     *
     * @param nomeLaboratorio
     * @return
     */
    public String laboratorioToString(String nomeLaboratorio) {
        return this.contasLab.get(nomeLaboratorio).toString();
    }

    /**
     *
     * @param nomeDisciplina
     */
    public void cadastraDisciplina(String nomeDisciplina) {
        this.disciplinas.put(nomeDisciplina, new Disciplina(nomeDisciplina));
    }

    /**
     *
     * @param nomeDisciplina
     * @param horas
     */
    public void cadastraHoras(String nomeDisciplina, int horas) {
        this.disciplinas.get(nomeDisciplina).cadastraHoras(horas);
    }

    /**
     *
     * @param nomeDisciplina
     * @param nota
     * @param valorNota
     */
    public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
        this.disciplinas.get(nomeDisciplina).cadastraNota(nota, valorNota);
    }

    /**
     *
     * @param nomeDisciplina
     * @return
     */
    public boolean aprovado(String nomeDisciplina) {
        return this.disciplinas.get(nomeDisciplina).aprovado();
    }

    /**
     *
     * @param nomeDisciplina
     * @return
     */
    public String disciplinaToString(String nomeDisciplina) {
        return this.disciplinas.get(nomeDisciplina).toString();
    }

    /**
     *
     * @param nomeCantina
     */
    public void cadastraCantina(String nomeCantina) {
        this.contasCantina.put(nomeCantina, new ContaCantina(nomeCantina));
    }

    /**
     *
     * @param nomeCantina
     * @param qtdItens
     * @param valorCentavos
     */
    public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {
        this.contasCantina.get(nomeCantina).cadastraLanche(qtdItens, valorCentavos);
    }

    /**
     *
     * @param nomeCantina
     * @param valorCentavos
     */
    public void pagarConta(String nomeCantina, int valorCentavos) {
        this.contasCantina.get(nomeCantina).pagaConta(valorCentavos);
    }

    /**
     *
     * @param nomeCantina
     * @return
     */
    public String cantinaToString(String nomeCantina) {
        return this.contasCantina.get(nomeCantina).toString();
    }

    /**
     *
     * @param valor
     */
    public void defineSaudeMental(String valor) {
        this.saude.defineSaudeMental(valor);
    }

    /**
     *
     * @param valor
     */
    public void defineSaudeFisica(String valor) {
        this.saude.defineSaudeFisica(valor);
    }

    /**
     *
     * @return
     */
    public String geral() {
        return this.saude.toString();
    }
}
