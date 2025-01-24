
# [1. Introdução](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#1-introdu%C3%A7%C3%A3o-1)
# [2. Habilidades adquiridas ou requisitadas para o projeto](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#2-habilidades-adquiridas-ou-requisitadas-para-o-projeto-1)
# [3. Como executar](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#3-como-executar-1)
# [4. Principais aplicações do conteudo](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#4-principais-funcionalidades)
## [4.1 Clean code](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#41-clean-code-1)
## [4.2 Programação Defensiva](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#42-programa%C3%A7%C3%A3o-defensiva-1)
## [4.3 Testes de software](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#43-testes-de-software-1)
# [5. Exemplos de execução](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#5-exemplos-de-execu%C3%A7%C3%A3o-1)
## [5.1 Inserção de arquivos](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#51-inser%C3%A7%C3%A3o-de-arquivos-1)
 

# 1. Introdução
Esse Projeto visa à criação de um Sistema de Reserva de Salas. Foi criado na linguagem de programação Java e realizado.

# 2. Habilidades adquiridas ou requisitadas para o projeto
Conhecimento básico da linguagem de programação Java. Domínio da Programação Orientada a Objetos, Clean Code, Programação defensiva e teste de software.

# 3. Como executar
Importar o projeto e executar usando o compilador Java, preferencialmente usando o Apache netbeans

# 4. Principais funcionalidades

Temos aqui a aplicação de alguns conceitos de boas práticas de programação

## 4.1 Clean Code

No código temos a aplicação de conceitos importantes do clean code como por exemplo Nomes Significativos (nomes das variaveis e das funções de facil entendimento), poucos comentários, formatação e organização consistente (mantendo um padrão de indentação), funções pequenas e simples e ausencia de codigo mortos. Abaixo apresentação de alguns metodos na qual foi aplicado essas práticas. Entretanto, pode ser encontrado através de todo o código.

![Criar_Reserva()](https://github.com/user-attachments/assets/a8c3d236-d899-4343-ac31-c9cee7ca93c9)
Criar_Reserva(Reserva reserva)


![Cancelar_Reserva()](https://github.com/user-attachments/assets/66ef2e6d-ec87-41ea-91cd-f6607180e66d)
Cancelar_Reserva(Reserva)

![Listar_Reserva_Sala()](https://github.com/user-attachments/assets/abdca9d9-27ca-452e-b46d-d98e1fbb7966)
Listar_Reserva_Sala(Sala sala)

![Listar_Reserva_Usuario()](https://github.com/user-attachments/assets/7509e322-e768-4ca6-bfb6-176fbef59867)
Listar_Reserva_Usuario(Usuário usuário)

## 4.2 Programação defensiva

No codigo temos a aplicação da programação defensiva para garantir os valores das variaveis criadas a partir das classes usuário, sala e reserva:

![image](https://github.com/user-attachments/assets/5316f795-c2a6-41cb-beac-ae1432278cd8)
Classe usuário. Verificação se as variaveis do tipo string nome e tipo não são nulas e a variavel matrícula é inteiro positivo.

![image](https://github.com/user-attachments/assets/f2e64bf2-8978-41f7-be76-679a8b99c6fd)
Classe Sala. Verificação se as variaveis do tipo inteiro número da sala e capacidade são maiores que zero e a string do tipo de sala não é nula.

![image](https://github.com/user-attachments/assets/4d245efa-bdfa-4773-af37-9e4b37d75910)
Classe Reserva. Verificação se as variaveis data, horario inicio e fim são não-nulas. Como as variaveis usuário fram verificadas anteriomente não há necessidade.

Caso os casos não sejam contemplados uma mensagem de erro é emitida explicitando o tipo de erro.

## 4.3 Testes de software 

##4.3.1. Testes Unitários

Foram realizados testes unitários para verificar se o ato de acrescer/cancelar reservas será apresentadas corretamente. Para tanto foi criado a classe Servico_de_ReservaTest com os metodos testCriar_Reserva() e testCancelar_Reserva().
 

![image](https://github.com/user-attachments/assets/2d2113d8-e73c-43aa-b340-146fd56c61c5)
Primeiro teste unitário relacionado ao metodo testCriar_Reserva(). Nesse caso são criados os usuário, as salas e adicionados a ao array de reserva junto com as informações adicionais da reserva.
Após isso, é verificado se o número da sala da primeira reserva aparece no array.

![image](https://github.com/user-attachments/assets/e94aa72b-6344-4697-b9da-31f1a9a5ab59)
Segundo teste relacionado ao método testCancelar_Reserva(). Tal qual o primeiro caso é criado uma reserva e removido. É verificado a confirmação da remoção.

![image](https://github.com/user-attachments/assets/798d7aaa-68b3-46a9-8730-1ddf2d658797)
Ambos os testes são positivos.

### 4.3.2 Debugger
Aqui colocamos pontos de interrupção no para mostrar o acréscimo e remoção de reserva na classe Sistema_Reserva_Salas onde se encontra o main.

![image](https://github.com/user-attachments/assets/0abdc500-75ec-4599-af93-f428ff98c05a)
Inclusão da reserva com as informações

![image](https://github.com/user-attachments/assets/451f027d-b225-46e2-bb52-31865fc9fe56)
remoção da reserva. Informações do debug foram eliminadas.

# 5. Exemplos de execução

Nesse tópico apresentamos alguns exemplos de código

## 5.1 Consulta de reservas para a sala 

![image](https://github.com/user-attachments/assets/6c2edfac-62b7-49ff-9d7e-9d11fbfe4b60)
Apresentação das reservas para a variavel Sala_teste1 (sala nº 253).

![image](https://github.com/user-attachments/assets/dead228d-9b01-469b-b1ab-41650daf7411)
Apresentação das reservas para a variavel Usuario_teste (matrícula nº 189222).
