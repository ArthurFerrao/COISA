package lab2;

/**
 *
 * @author arthurlf
 */
public class Disciplina {

    private String nomeDisciplina;
    private int horaEstudo;
    private double[] notas;
    private int[] pesos;

    /**
     *
     * @param nomeDisciplina
     * @param numNotas
     * @param pesos
     */
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        this(nomeDisciplina, numNotas);
        this.pesos = pesos;
    }

    /**
     *
     * @param nomeDisciplina
     * @param numNotas
     */
    public Disciplina(String nomeDisciplina, int numNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numNotas];
    }

    /**
     *
     * @param nomeDisciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
    }

    /**
     *
     * @param horas
     */
    public void cadastraHoras(int horas) {
        this.horaEstudo += horas;
    }

    /**
     *
     * @param nota
     * @param valorNota
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    /**
     *
     * @return
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
