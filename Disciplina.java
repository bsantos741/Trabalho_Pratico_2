package media;

public class Disciplina {
	
	Aluno[] alunos = new Aluno[10];
	
	public void adicionarAluno(int posicao, Aluno aluno) {
		
		Aluno Joao = new Aluno();
		Disciplina disciplina = new Disciplina();
		disciplina.adicionarAluno(0, Joao);
	
	}
	public void coletarMediaTurma() {
		
		double somaNotas = 0;
		for (int i = 0; i < 10; i++){
		       double nota = alunos[i].nota1;
		       somaNotas = somaNotas + nota;
		       System.out.println(somaNotas);
		}
		
		}
	}
	
