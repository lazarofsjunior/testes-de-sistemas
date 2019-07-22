#language: pt

Funcionalidade: Criar Lista Casamento

@AlterarCadastroComSucesso
Cenario: Criar Lista Casamento

Dado que o usuario esteja na pagina inicial do cvc  
E aciona em login e minhas viagens
E preenche login/senha
E clica enviar
E clica em minha lista de casamento 
E preenche todos os campos obrigatorios 
Quando acionar criar lista
Entao aparecera que a lista esta ativa informando uma numeração
