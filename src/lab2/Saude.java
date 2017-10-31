package lab2;

/**
 *
 * @author arthurlf
 */
public class Saude {

    private String saudeFisica;
    private String saudeMental;
    private String saudeGeral;
    private String emoji;

    public Saude() {
        this.saudeFisica = "boa";
        this.saudeMental = "boa";
        this.saudeGeral = "boa";
    }

    public void defineSaudeMental(String valor) {
        this.saudeMental = valor;
        checaGeral();
    }

    public void defineSaudeFisica(String valor) {
        this.saudeFisica = valor;
        checaGeral();
    }

    private void checaGeral() {
        if (this.saudeFisica.equals("boa") && this.saudeMental.equals("boa")) {
            this.saudeGeral = "boa";
        } else if (this.saudeFisica.equals("boa") || this.saudeMental.equals("boa")) {
            this.saudeGeral = "ok";
        } else {
            this.saudeGeral = "fraca";
        }
    }

    public void definirEmoji(String valor) {
        this.emoji = valor;
        this.saudeGeral = valor;
    }

    public String geral() {
        return this.saudeGeral;
    }


}
