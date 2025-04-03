public class TestaAluno {
    public static void main (String[] args) {
        Aluno a1 = new Aluno("Thiago");
        Aluno a2 = new Aluno("Thiago", 9.0, 9.0);


        
        a1.nota1 = 8.0;
        a1.nota2 = 9.0;

        

        System.out.println(a1.calculaMedia());
        System.out.println(a2.calculaMedia());

    }
}