package lab2;

/**
 *
 * @author arthurlf
 */
public class Coisa {

    public static void main(String[] args) {
        
        int[] pesos = {6,4};
        Disciplina prog2 = new Disciplina("PROGRAMACAO 2",2,pesos);

        prog2.cadastraHoras(4);

        prog2.cadastraNota(1, 5.0);

        prog2.cadastraNota(2, 6.0);

        

        System.out.println(prog2.aprovado());


        System.out.println(prog2.toString());

        
    }

}
