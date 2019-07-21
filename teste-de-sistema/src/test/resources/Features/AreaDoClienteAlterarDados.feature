#language: pt

Funcionalidade: Alterar Cadastro

@AlterarCadastroComSucesso
Cenario: Alterar Cadastro Cliente

Dado que o usuario esteja no site do cvc  
E clica em login e minha viagens
E preenche login e  senha
E clica para alterar seus dados cadastrais
E altera o campo bairro
Quando acionar alterar cadastro
Entao o campo sera alterado com sucesso