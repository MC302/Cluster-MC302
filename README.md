## Descrição:
----

Uma plataforma que contem tudo  necessário para implementar qualquer tipo de jogo de cartas de baralho com facilidade. De primeiro momento implementaremos um jogo simples, BlackJack, como protótipo, e iremos aumentando o catálogo de jogos, como também aumentará a flexibilidade da plataforma (ao implementar novos jogos descobriremos necessidades e idéias que passarão a integrar a mesma).

## Objetivo:
----

Implementar blackjack e outro jogo que seja compatíveis com a plataforma.

## Mecânicas de Funcionamento:
----

Através de uma interface implementada pelo manager e pelo game escolhido, o usuário poderá jogar interagir com o manager via o game, que decidirá como essa interação acontece, podendo ter acesso a mesa, ao baralho, ao seu turno, as suas cartas, e a algumas informações publicas de outros jogadores.

O game escolhido providenciará métodos e objetos específicos de interação para o manager, que fará o controle dos objetos através de interfaces e deixará todos os dados disponíveis ao game, que repassará o que for necessário ao player.

O manager fará o controle direto dos dados, seguindo um lógica de interfaces, pois todos os objetos virão do jogo.

O jogo terá um modelo genérico que permite terá métodos genéricos já implementados.

Todos os componentes em primeiro momento só requerem a compatibilidade com um jogo, o BlackJack.

## Componentes:
----

- __Card:__ contém definições de cartas de baralho, tanto permanentes como mutáveis
- __Deck:__ contém definições de gerenciamentos de cartas, como criação e compra e descarte
- __Player:__ contém dados privados e públicos de cada player, para possível implementação de AI e/ou Multiplayer
- __Mesa:__ contém dados públicos sobre rodadas e cartas públicas e escondidas que dependem do jogo
- __Manager:__ fará o controle dos turnos e das rodadas manipulando os componentes acima e repassando/perguntando  mudanças ao jogo
- __Jogo:__ implementação genérica de um jogo com métodos de interação ao usuário
- __BlackJack e Outros:__ implementação do jogo que fará suas alterações nos componentes acima
	
