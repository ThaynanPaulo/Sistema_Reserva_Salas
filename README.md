
# [1. Introdução](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#1-introdu%C3%A7%C3%A3o-1)
# [2. Habilidaes adiquiridas ou requisitadas para o projeto](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#2-habilidaes-adiquiridas-ou-requisitadas-para-o-projeto-1)
# [3. Como executar](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#3-como-executar-1)
# [4. Principais aplicações do conteudo](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#4-principais-funcionalidades)
# [4.1 Clean code](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#41-modo-de-gerenciamento-de-busca-1)
# [4.2 Programação Defensiva](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#41-modo-de-gerenciamento-de-busca-1)
# [5. Exemplos de execução](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#5-exemplos-de-execu%C3%A7%C3%A3o-1)
# [5.1 Inserção de arquivos](https://github.com/ThaynanPaulo/Sistema_Reserva_Salas/blob/main/README.md#51-inser%C3%A7%C3%A3o-de-arquivos-1)
 

# 1. Introdução
Esse Projeto visa à criação de um Sistema de Reserva de Salas. Foi criado na linguagem de programação Java e realizado.

# 2. Habilidaes adiquiridas ou requisitadas para o projeto
Conhecimento básico da linguagem de programação Java. Domínio da Programação Orientada a Objetos, Clean Code, Programação defensiva e teste de software.

# 3. Como executar
Importar o projeto e executar usando o compilador Java, preferencialmente usando o Apache netbeans

# 4. Principais funcionalidades

Temos aqui a aplicação de alguns conceitos de boas práticas de programação

# 4.1 Clean Code

No código temos a aplicação de conceitos importantes do clean code como por exemplo Nomes Significativos (nomes das variaveis e das funções de facil entendimento), poucos comentários, formatação e organização consistente (mantendo um padrão de indentação), funções pequenas e simples e ausencia de codigo mortos. Abaixo apresentação de alguns metodos na qual foi aplicado essas práticas. Entretanto, pode ser encontrado através de todo o código.

![image](https://github.com/user-attachments/assets/1ffb6291-9f2e-4bfe-9925-edf66b9d5785)
Criar_Reserva(Reserva reserva)


![image](https://github.com/user-attachments/assets/a3253675-eff8-41bb-9907-520a5d18fdc8)
5.2 Cancelar_Reserva(Reserva)


![image](https://github.com/user-attachments/assets/75ee0705-ed33-4ff0-a588-bf7e77867aec)
Listar_Reserva_Sala(Sala sala)

![image](https://github.com/user-attachments/assets/f766b2ad-61b4-4c9a-8751-026976e201b1)
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


