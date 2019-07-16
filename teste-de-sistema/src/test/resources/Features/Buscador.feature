#language: pt

Funcionalidade: Buscar dados

@ValidarBuscador
Cenario: Dados Invalidos Buscar Pacotes

Dado que o usuario ja esteja no site do cvc
E insere dados invalidos "asdcfesaDS" em origem
Quando ele preencher os campos obrigatorios
E clicar no botao de buscar
Entao aparecera uma mensagem pedindo para selecionar a origem

#