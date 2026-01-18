# learn-spring

Este repositório é um **Hub de Aprendizado** desenvolvido para praticar e consolidar conhecimentos no ecossistema Spring Boot.

O objetivo é criar uma aplicação centralizada protegida por login, que serve como porta de entrada para diversos mini-projetos e funcionalidades, simulando cenários reais do mercado de trabalho.

## Tecnologias e Ferramentas

* **Java 17+**
* **Spring Boot 3**
    * *Spring Security*: Para autenticação e autorização.
    * *Spring Web*: Para rotas e API.
    * *Spring Data JPA*: Para manipulação de banco de dados.
    * *Thymeleaf*: Para o frontend (HTML dinâmico).
* **Banco de Dados**: H2 (em memória para testes).
* **Maven**: Gerenciamento de dependências.

## Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/schirmr/learn-spring.git
    ```
2.  **Instale as dependências:**
    ```bash
    ./mvnw clean install
    ```
3.  **Rode a aplicação:**
    ```bash
    ./mvnw spring-boot:run
    ```
4.  **Acesse:** `http://localhost:8080`
5. **Senha de acesso ao site temporário para estudo:** 
    `Login: user`
    `Senha: password`