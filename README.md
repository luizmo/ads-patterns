# Análise e Desenvolvimento de Sistemas - Design Patterns

##### Professor: Filipe Guelber
##### Aluno: Luiz Miguel de Oliveira - GitHub: [luizmo](https://github.com/luizmo)

## Objetivo do Trabalho

Implementar um software em java que demonstre a utilização de 3 design patterns em um mesmo contexto.

## Objetivo do Software Desenvolvido

Calcular impostos de determinado produto baseado em seu valor e/ou estado, sendo os estados possíveis: novo ou velho.

## Pattern Utilizados

- *[Strategy](https://refactoring.guru/pt-br/design-patterns/strategy)*
- *[Template Method](https://refactoring.guru/pt-br/design-patterns/template-method)*
- *[State](https://refactoring.guru/pt-br/design-patterns/state)*

## Aplicação dos Patterns no Trabalho
*Strategy:* Como existem vários impostos que se baseiam no valor do produto e retornam o valor final e com os impostos sendo calculados da mesma forma independentemente de qual imposto seja, o pattern permite que seja definido um contrato (interface) a ser seguido por todas as classes de impostos. Dessa forma evita-se a repetição de um mesmo bloco de código e intermináveis ``if`` e ``elses`` na classe responsável pelo cálculo.

*Template Method:* Como existem impostos que são condicionais a valores mínimos/máximos no projeto e que apesar dessas condicionais realizam o mesmo cálculo base de qualquer imposto o pattern permite definir um molde para qualquer imposto que necessite de condicionais de forma que cada imposto implemente suas prórpias condições e ainda assim não saiam do que foi definido.

*State:* Como existem impostos que são condicionais ao estado de um produto e o produto pode variar de estado dentro do sistema o pattern permite criar um estado mutável para cada produto de forma a modificar a forma com que o imposto é calculado.
