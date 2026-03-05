## Atividade Prática Eng. Software II


Nesta atividade vou abordar conceitos básicos relacionados a
testes unitários, JUnit, Gradle e boas práticas de qualidades
e a estrutura AAA (do inglês: Arrange-Act-Assert).

    PRIMEIRO PASSO:

    -Fiz a implementação da classe chamada ContaBancaria
    assim solicitado pelo professor.

    -Nesta classe conseguimos simular operações básicas
    de uma conta bancária.

Requisitos Funcionais da conta: 

- Depositar valor POSITIVO.
- Não permite deposito negativo ou zero.
- Sacar somente os valores disponíveis.
- Não permite saque maior que o salto.
- E uma função de consulta do saldo.

Requisitos de Testes
-
Nos requisitos dos testes, foi solicitado que no meu projeto deveria ter
uma classe chamada ContaBancariaTest. 

Nela deveria conter: 

- 1 teste para depósito.
- 1 teste para depósito invalido.
- 1 teste para saque válido.
- 1 teste para saque inválido.
- 1 teste combinando múltiplas operações.
* TODOS OS TESTES DEVEM UTILIZAR: 
@Test, Assertions e organizado no padrão AAA.


_Com um total mínimo de 5 testes, mas adicionei 6._

## Explicação de como os conceitos foram aplicados no código:

No projeto, apliquei as boas práticas de qualidade separando estritamente o código de produção (`src/main/java`) do código de validação (`src/test/java`), o próprio Gradle facilita na criação. Utilizamos o **JUnit Jupiter** por meio da anotação `@Test` para validar cada teste isoladamente. Implementei asserções como `assertEquals` para conferências matemáticas e `assertThrows` para validar o tratamento de exceções (regras de bloqueio). Além disso, todos os métodos de teste foram documentados e estruturados seguindo o padrão **AAA (Arrange-Act-Assert)**, dividindo claramente a preparação do cenário, a execução do método e a verificação do resultado final.

Você pode rodar os testes deste projeto de duas formas:

* **Pela IDE (IntelliJ IDEA):** Navegue até a pasta `src/test/java`, abra o arquivo `ContaBancariaTest` e clique no botão verde de execução (Run) localizado na margem esquerda, ao lado da declaração da classe. Antes disso, copie daqui do GitHub para a sua IDE o código.
* **Pelo Terminal do Gradle:** Abra o terminal na pasta raiz do projeto e execute o comando `./gradlew test` (ou `gradlew test` no Windows).


## Print da Execução com Testes verdes:

<img width="1919" height="1032" alt="Captura de tela 2026-03-05 100225" src="https://github.com/user-attachments/assets/a55111bd-0008-4dd6-a5fc-ee9bc30ba822" />
