#language: pt

@atendimentoAoCliente
Funcionalidade: Duvidas sobre criancas

@validarPerguntaCrianca
Cenario: Validar Pergunta Sobre Criancas
Dado que o usuario esteja na pagina de central de atendimento
E digitou "Crian�a" no campo de duvidas
Quando clicar em pesquisar
Entao serao exibidas as duvidas sobre crian�as
E ele clicara em cada pergunta e vera os textos exibidos com duvidas sanadas