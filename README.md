# hexagonal-arch-coffee
Este projeto é uma implementação de exemplo, de um pedido de café, demostrando o poder da Arquitetura 
Hexagonal (também conhecida como: Ports &amp; Adapters).

Criado para acompanhar [essa apresentação](./docs/ppt.ppt)

**Índice**
* [Motivação](#Motivação)
* [O que é arquitetura hexagonal](O-que-é-arquitetura-hexagonal)

## Motivação

> O centro do seu aplicativo não é o seu banco de dados. Nem é uma ou qualquer estrutura que você pode estar usando. 
> **O centro do seu aplicativo são os casos de uso de seu aplicativo**
> 
> ~ *[Unclebob](https://blog.cleancoder.com/uncle-bob/2012/05/15/NODB.html)*

## O que é arquitetura hexagonal

É um padrão estrutural de objeto cunhado pelo Dr. Alistair Cockburn, em um 
[artigo](https://web.archive.org/web/20180822100852/http://alistair.cockburn.us/Hexagonal+architecture) que ele escreveu em 2005.

A **ideia principal de Ports and Adapters** é definir a estrutra de um aplicativo para que ele possa ser executado por 
diferentes tipos de clientes (humanos, casos de testes, outros aplicativos, etc...) e possa ser **testado isoladamente de dispositivos externos**
do mundo real do qual sua aplicação depende (base de dados, servidores, outras aplicações, etc...).

> Um objetivo atemporal da engenharia de software é **separar o código que muda com frequência do código que é estável.**
> 
> ~ James Coplien / Lean Architecture

Recomenda-se a Arquitetura Hexagonal (Ports and Adapters) para aqueles que desejam escrever código limpo, sustentável 
e bem definido, bem testado e desacoplamento da lógica de negócios do código técnico.

Ajuda a resolver, ou pelo menos mitigar, alguns problemas comuns de arquitetura:

* **As decisões são tomadas muito cedo**, muitas vezes no inicio do projeto, quando sabemos o mínimo sobre o problema
que temos que resolver.
* **É difícil de mudar**, então, quando descobrimos novos requisitos, temos que decidir se iremos assumir algum débito
técnico ou redesenhar a aplicação. *As melhores arquiteturas são aquelas que nos permitem adiar o compromisso com uma
solução em particular e nos permite mudar de ideia*.
* **É centrado em frameworks**. Frameworks são ferramentas a serem usadas, não arquiteturas a serem conformadas. 
Não devemos nos comprometer com esses frameworks, eles podem evoluir em diferentes direções. Mas não devem "ditar" como 
sua aplicação deve evoluir.
* **É centrado em torno do banco de dados**. Frequentemente pensamos inicialmente no banco de dados, e em seguida, 
modelamos o sistema em torno do CRUD. Daí vemos objetos de banco de dados por toda aplicação e tratamos tudo como tabela, 
linhas e colunas.
* **A lógica de negócio está espalhada por toda aplicação**, espalhada em muitas camadas, sendo a única opção "debugar" o código 
para entender como as coisas funcionam.
* **Concentramos em aspectos técnicos** e quando questionados sobre a arquitetura, dizemos coisas como... "é Spring e usa Mongo DB"

Alguns benefícios:

* **Estratégia de teste eficaz** que segue o conceito de [pirâmede de teste](https://martinfowler.com/bliki/TestPyramid.html)
* **Os frameworks são isaolados** em módulos individuais, permitindo assim, (se mudarmos de ideia de usar um determinado framewors), só tenhamos que mudar um ligar
* **Idependente de banco de dados**, que é tratado como qualquer outro provedor de dado
* **Lógica de negócio em um caso de uso**, ficando fácil encontrar... e não é duplicada em nenhum outro.

Claro, mas temos algum custo:

* **Duplicação de código** Entidades podem ser representadas de forma diferente dependendo da camada que está sendo usada.
Podemos pensar da seguinte forma: "*Estamos preferindo o desacoplamento em vez de DRY*"
* **Complexidade** Você precisa de uma lógica de negócio que "justifique" a estrutura. 
