#language: pt

@Formulario
Funcionalidade: Formulario

@FaleConosco
Cenario: Validar Formulario Fale Conosco

Dado que o usuario esteja no formulario fale conosco
E preencheu todos os campos obrigatorios com dados invalidos
Quando clicar em enviar mensagem
Entao aparecera uma janela alertando o usuario que a mensagem nao foi enviada

