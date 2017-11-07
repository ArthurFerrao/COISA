ckage lab2;

/**
 *Representação de uma disciplina, que possue um nome de identificação
 * @author arthurlf
 */
public class Disciplina {

    private String nomeDisciplina;
    private int horaEstudo;
    private double[] notas;
    private int[] pesos;

    /**
     *Constroe uma disciplina recebendo seu nome, numero de notas e os pesos das notas
     * @param nomeDisciplina nome da disciplina 
     * @param numNotas inteiro com o numero de notas
     * @param pesos array com as notas do aluno
     */
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        this(nomeDisciplina, numNotas);
        this.pesos = pesos;
    }

    /**
     *Constroe uma disciplina recebendo seu nome, numero de notas 
     *As notas tem o mesmo peso
     * @param nomeDisciplina nome da disciplina 
     * @param numNotas inteiro com o numero de notas
     */
    public Disciplina(String nomeDisciplina, int numNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numNotas];
    }

    /**
     *Constroe uma disciplina recebendo seu nome
     * @param nomeDisciplina nome da disciplina 
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
    }

    /**
     *Atribui um valor inteiro pra horasEstudo
     * @param horas inteiro respresentando horas de estudo
     */
    public void cadastraHoras(int horas) {
        this.horaEstudo += horas;
    }

    /**
     *cadastra nota do aluno no array notas
     * @param nota inteiro q representa uma das notas do aluno
     * @param valorNota valor da nota do aluno
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    /**
     *Verifica se o aluno esta com media igual ou maior que 7
     * @return valor true se aluno aprovado ou false se nao tiver aprovado
     */
    public boolean aprovado() {
        boolean aprov;
        if (media() >= 7) {
            aprov = true;
        } else {
            aprov = false;
        }
        return aprov;
    }

    private double media() {
        double valor;
        if (this.pesos.length > 0) {
            valor = mediaPonderada();
        } else {
            valor = mediaAritmetica();
        }
        return valor;
    }

    private double mediaAritmetica() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / this.notas.length;
    }

    private double mediaPonderada() {
        double soma = 0;
        int peso = 0;
        for (int x = 0; x < this.notas.length; x++) {
            soma += this.notas[x] * this.pesos[x];
            peso += this.pesos[x];
        }
        return soma / peso;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.horaEstudo + " " + media() + " " + notas;
    }

}
