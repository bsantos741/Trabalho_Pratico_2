//Dev: bruno Moroni Amaral Santos
package media;

public class Main {
	
	public static void main(String[] args) {
	
		Aluno aluno1 = new Aluno();
		aluno1.alteraNome("Pedro");
		aluno1.alteraId(1);
		aluno1.nota1 = 3.5;
		aluno1.nota2 = 6.5;
		aluno1.retornaMedia();
		System.out.println("O aluno passou? "+aluno1.passou());
		

	}
}
