#language: pt

Funcionalidade: Criar Lista Casamento

@AlterarCadastroComSucesso
Cenario: Criar Lista Casamento

Dado que o usuario ja tenha cadastro no site do cvc  
E clica em login e minhas viagens
E clica Enviar apos preencher login/senha
E clica lista de casamento dentro da area do cliente
E clica no botão criar lista
E preenche todos os campos obrigatórios do cadastro
Quando acionar atualizar lista
Entao aparecera que a lista esta ativa informando uma numeração.
