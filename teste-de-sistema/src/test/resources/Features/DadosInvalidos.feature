#language: pt

Funcionalidade: Validar a mensagem de retorno apos inclusao dos dados de acesso invalidos

@dadosinvalidos
Cenario: dados invalidos

Dado que o usuario esteja na pagina principal do cvc  
E acessou login e minhas viagens
E preencheu login e senha invalidos
Quando acionar enviar
Entao aparecera a mensagem informando que o e invalido

