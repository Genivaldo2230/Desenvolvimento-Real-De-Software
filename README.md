# 💼 Desenvolvimento Real de Software
# Desenvolvimento Real de Software

Um livro para apreender algumas principios e práticas sobre desenvolvimento de software, os exemplos dos livros são em java pórem estou neste repositorio estou praticando com C#/.Net

## Explicifico do Livro
+ KISS, manter curto e simples
+ DRY, não manter código duplicado, para evitar ter quer fazer multiplas modificações no código
+ SRP, Responsabilidade Unica, uma classe deve ter apenas uma razão para mudar
+ Coesão, mensura quanto as responsabilidade da classe ou métodos esão intimamente relacionadas

Tipo de coesão | como funciona | pro | contras
---|---|---|---|
Funcional | Geralmente um metodo que chama outro | facil de entender | pode levar as classes exageradamamente simplistas
Informacional | Trabalham nos mesmos dados ou objetos de dominio | Fácil de manter | Pode levar a dependências desnecessárias
Sequencia | Agrupa metodo que são utilizados em  sequencia um do outro | Fácil de localizar operações relacionadas | Encoraja a violação do SRP
Lógica | Se agrupam por uma mesma natureza ou objetivo porem com varias derivações | Oferece certo tipo de categorização de alto nivel | Encoraja a violação do SRP
Utilitária | Agrupa uma serie de metodos que podem ser utilizadso por varios clientes  | simples de implementar | mais dificil de racionalizar a responsabilidade da classe
Temporal | Relativas ao tempo, com ser chamada na inicialização e finalização de operadoções | N\D | mais dificil de entender e utilizar operações individuais

+ Exceções verificadas, são aquelas nas caso oferecemos umma maneira de se recuperar
+ Exceções não verificadas, podem ser geradas a qualquer momento da execução
+ Padrão Notification, classe de dominio so para capturar erros, assim podemos controlar/diminiur a quantidade de fluxos alternativos que mossa aplicação terá quer percorrer, podendo ainda lançar um feedback sobre todos os erros cometidos
Este projeto simula um **Analisador de Transações Bancárias**, desenvolvido como parte de estudos em desenvolvimento de software com foco em boas práticas, estruturação de código e uso de ferramentas modernas de versionamento e automação.

## 🔗 Repositório

[https://github.com/Genivaldo2230/Desenvolvimento-Real-De-Software](https://github.com/Genivaldo2230/Desenvolvimento-Real-De-Software)

## 🛠️ Tecnologias Utilizadas

- Java (JDK 17)
- Git
- IntelliJ IDEA (recomendado)
- Paradigma de programação orientado a objetos (OOP)
## Fluxos - Trabalho

![Fluxo de Trabalho - BankTransactionAnalyzerSimples](https://github.com/user-attachments/assets/87209a1f-7e41-4cea-88ab-f40e399304b9)


##
## 📁 Estrutura do Projeto

BankTransactionAnalyzerSimples/
│── .idea/                    # Configuração do IDE
│── out/                      # Arquivos compilados
│── src/                      # Código-fonte
│   ├── main/
│   │   ├── resources/        # Arquivos CSV e configurações
│   │   ├── java/
│   │   │   ├── chapter_02/
│   │   │   │   ├── BankStatementCSVParser.java
│   │   │   │   ├── BankStatementAnalyzerProblemat.java
│   │   │   │   ├── BankStatementAnalyzerSRP.java
│   │   │   │   ├── BankTransaction.java
│   │   │   │   ├── BankTransactionAnalyzerSimple.java
│   │   │   ├── chapter_03/
│   │   │   ├── chapter_04/
│   │   │   ├── chapter_05/
│   │   │   ├── chapter_06/
│   ├── test/                 # Testes unitários
│   │   ├── Documentacao.Livro/
│   │   ├── Recursos.Imagens/
│── .gitignore                 # Arquivos ignorados pelo Git
│── README.md                  # Documentação do projeto
│── External Libraries/         # Dependências externas
│── Scratches and Consoles/     # Código temporário e testes
<<<<<<< HEAD


##
=======
...

> Obs: O arquivo `BankStatementCSVParser.java` foi removido por correção e simplificação da lógica.

>>>>>>> 0100c8c897f89b4824fdde1a4caed3a692ba67d8
## 🚀 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/Genivaldo2230/Desenvolvimento-Real-De-Software.git
   cd Desenvolvimento-Real-De-Software
   ```

2. Compile o projeto com Maven:
   ```bash
   mvn clean compile
   ```

3. Execute a aplicação (ajuste o nome da classe com `main` se necessário):
   ```bash
   mvn exec:java -Dexec.mainClass="com.bank.BankTransactionAnalyzer"
   ```

> Certifique-se de ter o Java e o Maven corretamente instalados no seu sistema.

## 📚 Objetivo

O projeto tem como objetivo reforçar práticas de desenvolvimento orientado a objetos, modularização de código, separação de responsabilidades e domínio do ciclo de vida de um projeto Java no mundo real.

## 🧾 Licença

