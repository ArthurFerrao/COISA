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

    public Aluno() {
        this.contasLab = new HashMap<String, ContaLaboratorio>();
        this.disciplinas = new HashMap<String, Disciplina>();
        this.contasCantina = new HashMap<String, ContaCantina>();
        this.saude = new Saude();
    }

    public void cadastraLaboratorio(String nomeLaboratorio) {
        this.contasLab.put(nomeLaboratorio, new ContaLaboratorio(nomeLaboratorio));
    }

    public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
        this.contasLab.put(nomeLaboratorio, new ContaLaboratorio(nomeLaboratorio, cota));
    }

    public void consomeEspaco(String nomeLaboratorio, int mbytes) {
        this.contasLab.get(nomeLaboratorio).consomeEspaco(mbytes);
    }

    public void liberaEspaco(String nomeLaboratorio, int mbytes) {
        this.contasLab.get(nomeLaboratorio).liberaEspaco(mbytes);
    }

    public boolean atingiuCota(String nomeLaboratorio) {
        return this.contasLab.get(nomeLaboratorio).atingiuCota();
    }

    public String laboratorioToString(String nomeLaboratorio) {
        return this.contasLab.get(nomeLaboratorio).toString();
    }

    public void cadastraDisciplina(String nomeDisciplina) {
        this.disciplinas.put(nomeDisciplina, new Disciplina(nomeDisciplina));
    }

    public void cadastraHoras(String nomeDisciplina, int horas) {
        this.disciplinas.get(nomeDisciplina).cadastraHoras(horas);
    }

    public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
        this.disciplinas.get(nomeDisciplina).cadastraNota(nota, valorNota);
    }

    public boolean aprovado(String nomeDisciplina) {
        return this.disciplinas.get(nomeDisciplina).aprovado();
    }

    public String disciplinaToString(String nomeDisciplina) {
        return this.disciplinas.get(nomeDisciplina).toString();
    }

    public void cadastraCantina(String nomeCantina) {
        this.contasCantina.put(nomeCantina, new ContaCantina(nomeCantina));
    }

    public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {
        this.contasCantina.get(nomeCantina).cadastraLanche(qtdItens, valorCentavos);
    }

    public void pagarConta(String nomeCantina, int valorCentavos) {
        this.contasCantina.get(nomeCantina).pagaConta(valorCentavos);
    }

    public String cantinaToString(String nomeCantina) {
        return this.contasCantina.get(nomeCantina).toString();
    }

    public void defineSaudeMental(String valor) {
        this.saude.defineSaudeMental(valor);
    }

    public void defineSaudeFisica(String valor) {
        this.saude.defineSaudeFisica(valor);
    }

    public String geral() {
        return this.saude.toString();
    }
}
