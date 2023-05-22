# Padrões de Projetos

O objetivo dos padões dos projetos, são tornar componentes reutilizáveis que facilitam a padronização, que permita agilidade para ass soluções de problemas recorrentes no desenvolvimento do sistema.

*Existem 2 Padrões de Projetos ou Design Patternes.*

- Padrões GRASP
- Padrões GOF

Os *Padrões de Projeto GOF* foram criados em 1995 pelos profissionais:

- Erich Gamma
- Richard Helm
- Ralph Johnson
- John Vlissides

Os profissionais foram batizados com o nome "Gangue dos Quatro" (Gang of Four ou GOF)

## Padrões GOF

Esses padrões tem como objetivo, solucionar problemas comuns de softwares que tenham algum envolvimento a orientação a objetos.
São formados por três grupos exibidos abaixo:

- *Padrões de criação*: Factory Method, Abstract Factory, Singleton, Builder. Prototype.

- *Padrões estruturais*: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy.

- *Padrões comportamentais*: Chain of Responsability, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Templete, Method, Visitor.

### Padrões GOF crição

Os padrões desse tipo, exigem tratamento de como os objetos (classes) são criados, para atenderem às diversas necessidades.

- Factory Method
- ``Singleton``
- ``Builder``
- ``Abstract Factory``
- Prototype

#### Singleton

Usado quando desejado, que uma classe tenha apenas uma instância. Abaixo, mostra alguns aspetos que devem ser cuidados ao criar esse padrão.

- O *construtor da classe* fica como privado (`private`), sendo que não pode ser instanciada para fora da própria classe.

- A *classe* é final, pois não permite a criação de subclasses da própria classe.

- O acesso é permitido *através do método* que retorna a instância única da classe, ou faz a criação de uma, casp não tenha sido criada.

#### Builder

Fornece uma interface genérica para a construção incremental de agregações. Esse padrão esconde os detalhes de como os componentes são criados, representados e compostos.

#### Abstract Factory

Permite elaborar uma interface para criação de famílias de objetos relacionados ou interdependentes, que não especifica as suas classes concretas. A partir desse padrão consegue-se criar fábricas concretas, que são responsáveis pela criação de novos objetos para atender as necessidades do cliente. Portanto, essa prática ajuda a excluir a dependência entre o cliente e a classe dos objetos usados por ele.

### Padrões GOF comportamentais

Esses padrões, mostram o processo de como os objetos ou classes se comunicam. Em geral, buscam um baixo acompanhamento entre os objetos, apesar da comunicação que existe entre eles.

- *Chain of Responsability*
- Command
- Interpreter
- Iterator
- Mediator
- Memento
- ``Observer``
- State
- *Strategy*
- ``Template Method``
- Visitor

#### Template Method

Permite definir o esqueleto de um algoritimo em uma classe base e permite as subclasses subistituam todas ou algumas etapas sem alterar a estrutura geral do algoritimo.

#### Observer

Permite que um objeto notifique outros objetos sobre alterações em seu estado.

### Padrões GOF struturais

Esses padrões descrevem os seguintes aspectos: elaboração, associação e a organização entre objetos e classes/interfaces. Permitem combinar objetos em estruturas mais complexas, ou descrever como as classes são herdadas ou compostas a partir de outras.

- ``Adapter``
- Bridge
- *Composite*
- Decomposite
- Decorator
- ``Facade``
- Flyweight
- Proxy

#### Facade

Oferece uma interface unificada para um conjunto de objetos que constituem um subsistema, definindo uma interface de alto nível que facilita no uso.

#### Adapter

ação desse padrão converte a interface de uma classe em outra, esperada pelo objeto cliente. Através dessa conversão, permite que classes com incompatibilidade de interfaces, consigam ser adaptadas para que outros objetos possam trabalhar juntos.