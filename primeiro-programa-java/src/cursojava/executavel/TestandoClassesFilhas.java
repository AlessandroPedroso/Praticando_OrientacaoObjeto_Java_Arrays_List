package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alessandro Schuquel Pedroso");
		aluno.setNomeEscola("Uniritter");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("4654545646");
		diretor.setNome("Ta�s Mariano Froner");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		secretario.setNome("Eduardo Froner Pedroso");
		secretario.setIdade(18);
		
		aluno.pessoaMaiorIdade();
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Sal�rio do " + aluno.getNome() + " = " + aluno.salario());
		System.out.println("Sal�rio do "+ diretor.getNome() +" = " + diretor.salario());
		System.out.println("Sal�rio do "+ secretario.getNome() +" = " + secretario.salario());
		
		Pessoa pessoa = new Aluno();
		pessoa = secretario;
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais = " + pessoa.getNome() + " e o salario � de = " + pessoa.salario());
	}
}
