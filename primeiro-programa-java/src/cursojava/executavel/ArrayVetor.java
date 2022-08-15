package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	/*usado para executar o código*/
	public static void main(String[] args) {
		
		double[] notas = {8.8,9.7,7.6};
		double[] notasLogica = {5.8,5.7,6.6};
		
		/*Criação de Alunos*/
		Aluno aluno = new Aluno();
		aluno.setNome("Alessandro Schuquel Pedroso");
		aluno.setNomeEscola("Jdev Treinamentos");
		
		/*Criação da Disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplina().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplina().add(disciplina2);
		
		//----------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[1];
		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do Aluno é : " + arrayAlunos[pos].getNome());
			
			for(Disciplina d : arrayAlunos[pos].getDisciplina()) {
				
				System.out.println("Disciplina é : " + d.getDisciplina());
				double notaMax = 0.0;
				for(int posicao = 0; posicao < d.getNota().length;posicao++) {
					
					System.out.println("Notas das disciplinas são : " + d.getNota()[posicao]);
					
					if(posicao == 0) {
						notaMax = d.getNota()[posicao];
						
					}else if (d.getNota()[posicao] < notaMax) {
						notaMax = d.getNota()[posicao];
					}
				}
				
				System.out.println("Sua menor nota foi = " + notaMax);
			}
			
		}
		
		
	}

}