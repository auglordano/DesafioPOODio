package DesafioPOODio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso voltado para o aprendizado da linguagem Java");
		curso1.setCargaHoraria(20);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Curso voltado para o aprendizado da linguagem JavaScript");
		curso2.setCargaHoraria(15);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Curso voltado para a mentoria em linguagem de programacao");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp voltado para o aprendizado da linguagem Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAugusto = new Dev();
		devAugusto.setNome("Augusto");
		devAugusto.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Augusto: " + devAugusto.getConteudoInscritos());
		
		devAugusto.progredir();
		System.out.println("Conteúdos inscritos Augusto: " + devAugusto.getConteudoInscritos());
		System.out.println("Conteúdos concluidos Augusto: " + devAugusto.getConteudosConcluidos());
		System.out.println("XP: " + devAugusto.calcularTotalXP());
		
		Dev devMarcos = new Dev();
		devMarcos.setNome("Marcos");
		devMarcos.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Marcos: " + devMarcos.getConteudoInscritos());
		devMarcos.progredir();
		System.out.println("Conteúdos inscritos Marcos: " + devMarcos.getConteudoInscritos());
		System.out.println("Conteúdos concluidos Marcos: " + devMarcos.getConteudosConcluidos());
		System.out.println("XP: " + devMarcos.calcularTotalXP());
		
	}

}
