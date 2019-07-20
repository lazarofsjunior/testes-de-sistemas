#language: pt

Funcionalidade: Consultar Boleto

@ConsultarBoletoSucesso
Cenario: Consultar boleto de suas viagens

Dado que o usuario ja tenha cadastro no site do cvc  
E clica em login e minhas viagens
E clica Enviar apos preencher login/senha
E clica para consultar boleto da viagem
E preenche os campos obrigatórios
Quando acionar o botao ver boletos
Entao aparecera o boleto para que possa ser impresso.
