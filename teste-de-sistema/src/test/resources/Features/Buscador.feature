#language: pt

Funcionalidade: Buscar dados

@ValidarBuscador
Cenario: Dados Invalidos Buscar Pacotes

Dado que o usuario ja esteja no site do cvc
E insere dados invalidos "asdcfesaDS" em origem
Quando ele preencher os campos obrigatorios 
Entao clicar no botao de buscar e aparecera uma mensagem pedindo para selecionar a origem
#