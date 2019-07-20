#language: pt

Funcionalidade: Alterar Cadastro

@AlterarCadastroComSucesso
Cenario: Alterar Cadastro Cliente

Dado que o usuario ja tenha cadastro no site do cvc  
E clica em login e minhas viagens
E clica Enviar apos preencher login/senha
E clica para alterar seus dados cadastrais
E modifica o campo Bairro
Quando acionar alterar cadastro
Entao o campo sera alterado com sucesso.
