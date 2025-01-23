
# [1. Introdução](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#1-introdu%C3%A7%C3%A3o-1)
# [2. Habilidades adquiridas ou requisitadas para o projeto](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#2-habilidades-adquiridas-ou-requisitadas-para-o-projeto-1)
# [3. Como executar](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#3-como-executar-1)
# [4. Principais aplicações do conteudo](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#4-principais-funcionalidades)
# [4.1 Clean code](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#41-clean-code-1)
# [4.2 Programação Defensiva](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#42-programa%C3%A7%C3%A3o-defensiva-1)
# [4.3 Testes de software](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#43-testes-de-software-1)
# [5. Exemplos de execução](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#5-exemplos-de-execu%C3%A7%C3%A3o-1)
# [5.1 Inserção de arquivos](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#51-inser%C3%A7%C3%A3o-de-arquivos-1)
 

# 1. Introdução
Esse Projeto visa à criação de um Sistema de Reserva de Salas. Foi criado na linguagem de programação Java e realizado.

# 2. Habilidades adquiridas ou requisitadas para o projeto
Conhecimento básico da linguagem de programação Java. Domínio da Programação Orientada a Objetos, Clean Code, Programação defensiva e teste de software.

# 3. Como executar
Importar o projeto e executar usando o compilador Java, preferencialmente usando o Apache netbeans

# 4. Principais funcionalidades

Temos aqui a aplicação de alguns conceitos de boas práticas de programação

# 4.1 Clean Code

No código temos a aplicação de conceitos importantes do clean code como por exemplo Nomes Significativos (nomes das variaveis e das funções de facil entendimento), poucos comentários, formatação e organização consistente (mantendo um padrão de indentação), funções pequenas e simples e ausencia de codigo mortos. Abaixo apresentação de alguns metodos na qual foi aplicado essas práticas. Entretanto, pode ser encontrado através de todo o código.

![Criar_Reserva()](https://github.com/user-attachments/assets/a8c3d236-d899-4343-ac31-c9cee7ca93c9)
Criar_Reserva(Reserva reserva)


![Cancelar_Reserva()](https://github.com/user-attachments/assets/66ef2e6d-ec87-41ea-91cd-f6607180e66d)
Cancelar_Reserva(Reserva)


![Listar_Reserva_Sala()](https://github.com/user-attachments/assets/abdca9d9-27ca-452e-b46d-d98e1fbb7966)
Listar_Reserva_Sala(Sala sala)

![Listar_Reserva_Usuario()](https://github.com/user-attachments/assets/7509e322-e768-4ca6-bfb6-176fbef59867)
Listar_Reserva_Usuario(Usuário usuário)

# 4.2 Programação defensiva

No codigo temos a aplicação da programação defensiva para garantir os valores das variaveis criadas a partir das classes usuário, sala e reserva:


![image](https://github.com/user-attachments/assets/5316f795-c2a6-41cb-beac-ae1432278cd8)
Classe usuário. Verificação se as variaveis do tipo string nome e tipo não são nulas e a variavel matrícula é inteiro positivo.

![image](https://github.com/user-attachments/assets/f2e64bf2-8978-41f7-be76-679a8b99c6fd)
Classe Sala. Verificação se as variaveis do tipo inteiro número da sala e capacidade são maiores que zero e a string do tipo de sala não é nula.

![image](https://github.com/user-attachments/assets/4d245efa-bdfa-4773-af37-9e4b37d75910)
Classe Reserva. Verificação se as variaveis data, horario inicio e fim são não-nulas. Como as variaveis usuário fram verificadas anteriomente não há necessidade.

Caso os casos não sejam contemplados uma mensagem de erro é emitida explicitando o tipo de erro.

# 4.3 Testes de software 

 Foram realizados testes unitários para verificar se ao acrescer reservas serão apresentadas corretamente.

 ## 5. Exemplos de execução

Nesse tópico apresentamos alguns exemplos de código

## 5.1 Criar_Reserva()



## 5.2 Cancelar_Reserva()


## 5.3 Listar_Reserva_Sala()



## 5.4 Listar_Reserva_Usuario()





![Inserção arquivos](https://github.com/user-attachments/assets/5d43dc3b-9e75-4f50-b51a-196f83b5f063)


