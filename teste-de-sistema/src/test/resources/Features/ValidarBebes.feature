#language: pt

@ValidacaoBebes
Funcionalidade: Contador de passageiros


Cenario: Validacao Bebes

Dado que o usuario esteja no site do CVC
E no campo origem escreve "Recife"
E no campo destino ecreve "Rio"
E insere datas validas
Quando ele inserir 7 bebes para um unico adulto
Entao uma mensagem de alerta devera aparecer sobre limite de bebes por adulto
