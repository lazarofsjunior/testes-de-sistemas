#language: pt

Funcionalidade: Duvidas sobre criancas

@validarPerguntaCrianca
Cenario: Validar Pergunta Sobre Criancas
Dado que o usuario esteja na pagina de central de atendimento
E digitou "Criança" no campo de duvidas
Quando clicar em pesquisar
Entao serao exibidas as duvidas sobre criancas
E ele clicara em cada pergunta e vera os textos exibidos com duvidas sanadas

#teste