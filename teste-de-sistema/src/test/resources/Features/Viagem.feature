#language: pt

@DefinirRotas
Funcionalidade: Definir rotas

@Viagem
Cenario: Validar melhor preco

Dado que o usuario esteja no site do CVC
E clica em Passagens
E no campo origem escreve "Recife"
E no campo destino ecreve "Rio"
E preencheu todos os campos obrigatorios
Quando clicar em buscar
Entao o melhor preco por cia sera exibido

