#language: pt

@Buscador
Funcionalidade: Buscar dados


Cenario: Dados Invalidos Buscar Pacotes

Dado que o usuario no site do cvc
E insere dados invalidos "asdcfesaDS" em origem
Quando ele preencher os campos obrigatorios
E clicar em buscar
Entao aparecera uma mensagem pedindo para selecionar a origem

