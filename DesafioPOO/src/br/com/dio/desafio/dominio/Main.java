package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // --- Criando Conteúdos ---
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now()); // Data de hoje

        
        // --- Apenas para testar se os conteúdos foram criados corretamente ---
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


        // --- Criando um Bootcamp ---
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        // --- Criando e Inscrevendo Devs ---
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("XP Inicial Camila: " + devCamila.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("XP Inicial João: " + devJoao.calcularTotalXp());


        // --- Simula o Progresso dos Devs ---
        System.out.println("\n--- Progresso dos Devs ---");

        System.out.println("\nCamila progredindo...");
        devCamila.progredir();
        devCamila.progredir(); // Camila conclui dois conteúdos
        System.out.println("Conteúdos Inscritos Camila (após progredir):" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP Final Camila: " + devCamila.calcularTotalXp());

        System.out.println("\nJoão progredindo...");
        devJoao.progredir(); // João conclui um conteúdo
        System.out.println("Conteúdos Inscritos João (após progredir):" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP Final João: " + devJoao.calcularTotalXp());

    }
}
