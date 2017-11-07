package lab2;

/**
 * Reune o cunjunto de caracteristicas referente a saúde do aluno
 * @author arthurlf
 */
public class Saude {
   /**
   * 
   * 
   */
    private String saudeFisica;
    private String saudeMental;
    private String saudeGeral;
    private String emoji;

    /**
     *Constrói o objeto saude definindo seus três atributos como "boa"
     */
    public Saude() {
        this.saudeFisica = "boa";
        this.saudeMental = "boa";
        this.saudeGeral = "boa";
    }

    /**
     *Atribui o valor a saudeMental
     *Modifica a saudeGeral chamando o metodo checaGeral
     * @param valor conteudo da saude mental do aluno
     */
    public void defineSaudeMental(String valor) {
        this.saudeMental = valor;
        checaGeral();
    }

    /**
     *Atribui o valor a saudeFisica
     *Modifica a saudeGeral chamando o metodo checaGeral
     * @param valor conteudo da saude fisica do aluno
     */
    public void defineSaudeFisica(String valor) {
        this.saudeFisica = valor;
        checaGeral();
    }
    
    /**
     *Modifica a saudeGeral dependendo dos valores atribuidos a saudeMental e saudeFisica
     */
    private void checaGeral() {
        if (this.saudeFisica.equals("boa") && this.saudeMental.equals("boa")) {
            this.saudeGeral = "boa";
        } else if (this.saudeFisica.equals("boa") || this.saudeMental.equals("boa")) {
            this.saudeGeral = "ok";
        } else {
            this.saudeGeral = "fraca";
        }
    }

    /**
     *Atribui uma string ao atributo emoji
     *Atribui essa string a saudeGeral
     * @param valor conteudo atribuido a emoji
     */
    public void definirEmoji(String valor) {
        this.emoji = valor;
        this.saudeGeral = valor;
    }

    /**
     *
     * @return o valor de saudeGeral
     */
    public String geral() {
        return this.saudeGeral;
    }


}
