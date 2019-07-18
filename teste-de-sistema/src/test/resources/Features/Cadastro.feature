#language: pt

Funcionalidade: Cadastro 

@CadastrarComSucesso
Cenario: Cadastrar cliente

Dado que o usuario no site do cvc  
E clica em login e minhas viagens
E clica cadastrar em cliente
E preencheu todos os campos obrigatórios
Quando acionar cadastrar
Entao aparecera a mensagem informando que os dados foram salvos com sucesso

