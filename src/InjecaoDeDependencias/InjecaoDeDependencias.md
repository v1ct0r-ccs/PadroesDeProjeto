# Injeção de Dependências

Dependência têm a ver com precisar de algo em termos de apoio. Um exemplo, Se eu falar que estamos dependendo demais de celulares, significa que precisamos deles para fazer outras coisas.

- Quando a classe A usa alguma fincionalidade da classe B, diz-se que a classe A tem uma dependência da classe B.

- Em Java, antes de poder usar métodos de outras classes, primeiro precisamos criar o objeto daquela classe (ou seja, a classe A precisa criar uma instância da classe B).

- Desse modo, trasnferir a tarefa de criação do objeto a outra entidade e usar diretamente a dependência é chamado de injeção de dependência.

## Tipos de Injeção de Dependências

- *Injeção do construtor*: as dependências são fornecidas por meio de um construtor da classe.
- *Injeção pelo setter*: o cliente expõe o método `setter` que o injetor usa para injetar a dependência.
- *Injeção de interface*: a dependência fornece um método injetor, que injetará uma dependência em qualquer cliente que for passado a ele. Os clientes devem implementar uma interface que expõe um método _setter_ que aceita a dependência.

Com isso, é responsabilidade da injeção de dependência:

1. Criar os objetos
2. Saber quais classes necessitam desses objetos
3. Fornecer todos esses objetos

Se há alguma mudança nos objetos, a DI investiga isso e isso não deve preocupar a classe que usa esses objetos. Dessa forma, se os objetos mudarem no futuro, é responsabilidade da DI fornecer os objetos apropriados à classe.

## Injeção de Dependências com Spring

O Spring lida com injeção de dependências utilizando um ``Spring IoC Container`` conhecido como Spring Context. Essse container é o responsável por gerenciar todas as dependências do projeto de uma forma automática.

Os objetos gerenciados pelo container do _Spring_ são chamados ``Beans``. Uma aplicação rodando pode ter vários beans ativos e gerenciados pelo Spring, pois, esses beans são os mesmos objetos que nós utilizamos no projeto normalmente, a única diferença é que a classe deles recebe uma anotação especial que determina que os objetos dessa classe devem ser gerenciados pelo _IoC container_.

- Então toda a classe que nós colocamos a anotação ``@Component`` já é instanciada automaticamente pelo Spring e se torna um Bean dentro do contexto do IoC Container.