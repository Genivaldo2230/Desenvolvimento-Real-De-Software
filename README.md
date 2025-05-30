# 💼 Desenvolvimento Real de Software

Este projeto simula um **Analisador de Transações Bancárias**, desenvolvido como parte de estudos em desenvolvimento de software com foco em boas práticas, estruturação de código e uso de ferramentas modernas de versionamento e automação.

## 🔗 Repositório

[https://github.com/Genivaldo2230/Desenvolvimento-Real-De-Software](https://github.com/Genivaldo2230/Desenvolvimento-Real-De-Software)

## 🛠️ Tecnologias Utilizadas

- Java (JDK 17)
- Maven
- Git
- IntelliJ IDEA (recomendado)
- Paradigma de programação orientado a objetos (OOP)

## 📁 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com/
            └── bank/
                ├── BankTransactionAnalyzer.java
                ├── BankTransaction.java
                └── BankStatementProcessor.java
```

> Obs: O arquivo `BankStatementCSVParser.java` foi removido por correção e simplificação da lógica.

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

Este projeto é livre para fins educacionais e de estudo.
