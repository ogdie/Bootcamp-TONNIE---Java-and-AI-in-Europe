# Desafio: Aprenda na Prática Programação Orientada a Objetos 🎓

---

Bem-vindos ao projeto que explora os fundamentos da Programação Orientada a Objetos (POO) em Java! Este desafio, co-criado com a **Digital Innovation One (DIO)**, tem como objetivo principal aplicar os pilares da POO – **Abstração, Encapsulamento, Herança e Polimorfismo** – na construção de um sistema de gerenciamento de bootcamps.

## 🌟 O Desafio

O foco deste projeto é sair da teoria e ir para a prática, modelando entidades do mundo real e transformando-as em código Java. Simulamos um ecossistema de bootcamps, onde desenvolvedores podem se inscrever em cursos e mentorias, progredir em seus estudos e acumular experiência.

## 🎯 Conceitos Aplicados

Durante o desenvolvimento, os seguintes pilares da POO foram colocados em prática:

* **Abstração:** Modelamos as entidades essenciais do domínio (Bootcamp, Conteúdo, Dev, Curso, Mentoria), focando apenas nos atributos e comportamentos relevantes para o problema.
* **Encapsulamento:** Implementamos o controle de acesso aos atributos das classes, garantindo que a lógica interna dos objetos seja protegida e manipulada apenas através de métodos públicos (`getters` e `setters`), facilitando a manutenção e evolução do código.
* **Herança:** Criamos uma hierarquia de classes onde `Curso` e `Mentoria` herdam características comuns de uma classe abstrata `Conteudo`, promovendo a reutilização de código e uma estrutura mais organizada.
* **Polimorfismo:** Utilizamos o polimorfismo ao definir um método `calcularXp()` na classe `Conteudo`, que é implementado de maneiras distintas nas classes `Curso` e `Mentoria`, permitindo que objetos de diferentes tipos respondam à mesma chamada de método de forma específica.

## 🛠️ Tecnologias Utilizadas

* Java JDK 11
* IntelliJ IDEA (IDE)
* Git & GitHub

## 📂 Estrutura do Projeto

O projeto é organizado em um pacote principal, `br.com.dio.desafio.dominio`, que contém todas as classes do domínio e a classe `Main` para execução e testes.

## ✨ Como Executar

Para rodar o projeto, basta clonar o repositório, abrir no IntelliJ (ou sua IDE preferida) e executar a classe `Main.java`. A saída no console demonstrará as interações entre os objetos, as inscrições dos devs, o progresso nos estudos e o cálculo do XP.

---


Desenvolvido por Diego Monteiro, como parte do desafio DIO.