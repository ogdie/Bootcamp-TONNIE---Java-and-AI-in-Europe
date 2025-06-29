🚀 Explorando Padrões de Projeto na Prática com Java! 🚀
Este repositório é o resultado do nosso trabalho em implementar e entender alguns dos Padrões de Projeto mais fundamentais usando Java puro. Aqui, a teoria se encontra com a prática para mostrar como essas soluções consagradas podem tornar seu código mais organizado, flexível e manutenível.

O projeto foca em três padrões essenciais: Singleton, Strategy e Facade, além de simular a integração com subsistemas externos.

🌟 Padrões de Projeto Implementados
Exploramos a implementação dos seguintes padrões:

Singleton
Objetivo: Garantir que uma classe tenha apenas uma única instância e fornecer um ponto de acesso global a essa instância. Perfeito para gerenciar configurações, loggers ou recursos de banco de dados.

Como foi implementado:

SingletonLazy.java: A instância é criada somente quando é solicitada pela primeira vez (lazy initialization). É simples, mas não é thread-safe por padrão.

SingletonEager.java: A instância é criada no momento em que a classe é carregada. É sempre thread-safe, mas pode gastar recursos se a instância não for usada.

SingletonLazyHolder.java: Uma abordagem que combina a lazy initialization com a segurança de threads de forma eficiente, usando uma classe interna estática.

Strategy
Objetivo: Definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Isso permite que o algoritmo varie independentemente dos clientes que o utilizam.

Como foi implementado:

Comportamento.java: Uma interface que define o método mover(), servindo como o contrato para todos os comportamentos.

ComportamentoAgressivo.java, ComportamentoDefensivo.java, ComportamentoNormal.java: Classes que implementam a interface Comportamento, cada uma com sua lógica específica de movimento.

Robo.java: A classe "contexto" que mantém uma referência para um Comportamento e pode trocar o comportamento dinamicamente em tempo de execução através do método setComportamento().

Facade
Objetivo: Fornecer uma interface unificada e simplificada para um conjunto complexo de interfaces em um subsistema. Ele serve como um "portão de entrada" que esconde a complexidade interna do subsistema.

Como foi implementado:

CrmService.java (em subsistema1/crm): Simula um subsistema de CRM, responsável por gravar dados de clientes.

CepApi.java (em subsistema2/cep): Simula uma API externa de consulta de CEP, responsável por recuperar informações de cidade e estado.

Facade.java: A classe Facade centraliza a lógica para "migrar um cliente", orquestrando chamadas tanto para o CrmService quanto para o CepApi, simplificando a interação para o cliente que usa a Facade.

📂 Estrutura do Projeto
A estrutura de pastas e arquivos está organizada de forma clara para facilitar a navegação:

.
├── src/
│   ├── one/
│   │   └── digitalinnovation/
│   │       └── gof/
│   │           ├── facade/
│   │           │   └── Facade.java
│   │           ├── singleton/
│   │           │   ├── SingletonEager.java
│   │           │   ├── SingletonLazy.java
│   │           │   └── SingletonLazyHolder.java
│   │           ├── strategy/
│   │           │   ├── Comportamento.java
│   │           │   ├── ComportamentoAgressivo.java
│   │           │   ├── ComportamentoDefensivo.java
│   │           │   └── ComportamentoNormal.java
│   │           └── Test.java (Renomeado de 'test.java' para seguir a convenção Java)
│   ├── subsistema1/
│   │   └── crm/
│   │       └── CrmService.java
│   └── subsistema2/
│       └── cep/
│           └── CepApi.java
🚀 Como Rodar o Projeto
Clone o repositório:

Bash

git clone [LINK_DO_SEU_REPOSITORIO]
Abra o projeto em sua IDE favorita (IntelliJ IDEA, Eclipse, VS Code com extensions Java, etc.).

Compile o projeto.

Execute a classe Test.java (localizada em src/one/digitalinnovation/gof/Test.java). Ela contém exemplos de uso para cada um dos padrões implementados, demonstrando seu funcionamento no console.


Projeto desenvolvido por Diego Monteiro para o Bootcamp da Tonnie em parceria com a DIO.