#language: pt

Funcionalidade: Validar Lista Casamento

@ValidarListaCasamento
Cenario: Validar lista de casamento

Dado que o usuario esteja na home do site do cvc
E acionar login e minhas viagens  
E clica em Lista de Casamento
E preenche no campo noiva "<Projeto>"
#E preenche no campo noiva "<Testes de Sistemas>"
Quando acionar Pesquisar
Entao as informacoes do casamento sera exibido com sucesso