#language: pt

Funcionalidade: Melhor preco por companhia

@Viagem
Cenario: Validar melhor preco

Dado que o usuario esteja no site da CVC
E clica em Passagens
E no campo origem escrever "Recife"
E no campo destino ecrever "Rio de Janeiro"
E preencheu todos os campos obrigatorios
Quando clicar em buscar
Entao o melhor preco por cia sera exibido