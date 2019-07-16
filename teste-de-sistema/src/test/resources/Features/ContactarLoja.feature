#language: pt

Funcionalidade: Contato da loja

@LojaProxima
Cenario: Loja proxima de uma regiao

Dado que o usuario no site do cvc e clicar em lojas
E pesquisar pela loja mais proxima a sua residencia
Quando clicar em pesquisar "CVC Jaboatao" e clicar no filtro retornado
Entao ele preenchera o formulario de contato
E clicara no botao entrar em contato
E aparecera a mensagem enviada com sucesso
#