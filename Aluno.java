package media;

public class Aluno {
	
	private String nome;
	private int id;
	private double media;
	
	protected double nota1;
	protected double nota2;
	
	public void imprimeNome() {
		
		System.out.println("O nome do aluno é: "+ nome);
		
	}
	public void alteraNome(String nome) {
		
		this.nome = nome;
		imprimeNome();
		
	}
	public void imprimeId() {
		
		System.out.println("Sua id é: "+id);
		
	}
	public void alteraId(int id) {
		
		this.id = id;
		imprimeId();
		
	}		
	private void calculaMedia() {
		
		media=((nota1+nota2)/2);
		System.out.println("Média do aluno: "+media);
		
	}
	public void retornaMedia() {
		
		calculaMedia();
		
	}
	public boolean passou() {
		
		if (media > 7) {
			return true;
		} else {
			return false;
		}
		
		}
	}
