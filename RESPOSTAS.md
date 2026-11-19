# Respostas — Sistema de Emprestimo da Biblioteca

Nome completo: Thais Ferreira Lemos - RA: 3111392523009

# Etapa 1 — Diagnóstico

## Problema 1 — a conversão do acervo central

**Em que consiste o problema, e o que acontece quando o sistema cresce:**
A conversao da matriz de texto do acervo foi repetida em CatalogoExemplares e
RelatorioColecao. Como cada classe trata as letras maiusculas e minusculas de
um jeito, o mesmo exemplar pode aparecer com situacoes diferentes. Se o
sistema crescer, novas partes podem repetir essa conversao e aumentar os
pontos de erro.

**Princípio SOLID violado:**
SRP, porque as classes de negocio tambem interpretam o formato externo, e
DIP, porque elas dependem diretamente da classe concreta do legado.

**Classes afetadas (pelo nome):**
CatalogoExemplares, RelatorioColecao e AcervoLegadoWS.

**Que outra dependência indevida essas classes têm em relação ao
acervo central, e por que ela é um problema:**
CatalogoExemplares e RelatorioColecao conhecem diretamente
AcervoLegadoWS. Esse acoplamento torna mais dificil trocar a fonte de dados
ou testar as classes sem depender do servico legado.

## Problema 2 — o ciclo de vida de Emprestimo

**Em que consiste o problema, e o que acontece quando o sistema cresce:**
Emprestimo usa condicionais com uma String para controlar as transicoes. Com
mais estados ou regras, os metodos ficam maiores e pode ser facil permitir uma
transicao errada.

**Princípio SOLID violado:**
OCP e SRP, pois adicionar um estado novo exige alterar varios metodos da mesma
classe.

**Classes afetadas (pelo nome):**
Emprestimo.

---

# Etapa 4 — Justificativa

## Padrão aplicado ao Problema 1

**O problema que ele resolve (descreva antes de nomear o padrão):**


**Nome do padrão:**


**Alternativa descartada e por que ela não resolveria por completo:**


## Padrão aplicado ao Problema 2

**O problema que ele resolve (descreva antes de nomear o padrão):**


**Nome do padrão:**


**Alternativa descartada e por que ela não resolveria por completo:**
