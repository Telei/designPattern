# designPattern
自学设计模式
一、简单工厂模式（或静态工厂模式）（simpleFactoryPattern）

1、工厂类角色，这是本模式的核心，里面有逻辑判断，java中往往由一个具体类来实现；

2、抽象产品类角色，一般是某个产品的接口或者抽象类，包含产品的共性；

3、具体产品角色，用来实现抽象产品类的接口或者继承抽象类。

二、工厂模式(factoryPattern)

1、抽象工厂类角色，这是本模式的核心，java中往往由一个接口或者抽象类来实现；

2、具体抽象工厂类角色，用来实现抽象工厂类角色，有业务逻辑代码；

3、抽象产品类角色，一般是某个产品的接口或者抽象类，包含产品的共性；

4、具体产品角色，用来实现抽象产品类的接口或者继承抽象类；

三、抽象工厂模式（abstractFactoryPattern）

前面跟工厂模式一样

1、抽象工厂类角色，这是本模式的核心，java中往往由一个接口或者抽象类来实现；

2、具体抽象工厂类角色，用来实现抽象工厂类角色，有业务逻辑代码；

3、抽象产品类角色，一般是某个产品的接口或者抽象类，包含产品的共性；

4、具体产品角色，用来实现抽象产品类的接口或者继承抽象类；

不过在抽象工厂模式中，有一个产品族的概念：所谓的产品族，是指位于不同产品等级结构中功能相关联的产品组成的家族。抽象工厂模式所提供的一系列产品就组成一个产品族；而工厂方法提供的一系列产品称为一个等级结构。

总结

无论是简单工厂模式，工厂方法模式，还是抽象工厂模式，他们都属于工厂模式，在形式和特点上也是极为相似的，他们的最终目的都是为了解耦。在使用时，我们不必去在意这个模式到底工厂方法模式还是抽象工厂模式，因为他们之间的演变常常是令人琢磨不透的。经常你会发现，明明使用的工厂方法模式，当新需求来临，稍加修改，加入了一个新方法后，由于类中的产品构成了不同等级结构中的产品族，它就变成抽象工厂模式了；而对于抽象工厂模式，当减少一个方法使的提供的产品不再构成产品族之后，它就演变成了工厂方法模式。

所以，在使用工厂模式时，只需要关心降低耦合度的目的是否达到了。

四、单例模式(simpleFactoryPattern)

单列模式分为饿汉式单例模式（Eager Singleton），和懒汉式单列模式（Lazy Singleton）。

1、单例模式的主要特点：私有的构造方法，指向自己实例的私有静态引用，以自己实例为返回值的静态的公有的方法。

注：单例类只能有一个实例。单例类必须自己创建自己的唯一实例。单例类必须给所有其他对象提供这一实例。

2、饿汉式单例在单例类被加载时候，就实例化一个对象交给自己的引用；

      懒汉式在调用取得实例方法的时候才会实例化对象；synchronized关键字修饰后，是线程安全的，并不会产生实例化多个对象的情况。

3、登记式单例模式，实际上维护了一组单例类的实例，将这些实例存放在一个Map（登记薄）中，对于已经登记过的实例，则从Map直接返回，对于没有登记的，则先登记，然后返回。

题外话：抛开单例模式，确定此类永远是单例的，也可以用

public static final Singleton instance=new Singleton();此种模式可以在不改变API的情况下，改变我们对单例类的具体要求。

五、建造者模式(builderPattern)

四个要素

产品类：一般是一个较为复杂的对象，也就是说创建对象的过程比较复杂，一般会有比较多的代码量。在本类图中，产品类是一个具体的类，而非抽象类。实际编程中，产品类可以是由一个抽象类与它的不同实现组成，也可以是由多个抽象类与他们的实现组成。

抽象建造者：引入抽象建造者的目的，是为了将建造的具体过程交与它的子类来实现。这样更容易扩展。一般至少会有两个抽象方法，一个用来建造产品，一个是用来返回产品。

建造者：实现抽象类的所有未实现的方法，具体来说一般是两项任务：组建产品；返回组建好的产品。

导演类：负责调用适当的建造者来组建产品，导演类一般不与产品类发生依赖关系，与导演类直接交互的是建造者类。一般来说，导演类被用来封装程序中易变的部分。

优点：1）建造者模式的封装性很好。使用建造者模式可以有效的封装变化，在使用建造者模式的场景中，一般产品类和建造者类是比较稳定的，因此，将主要的业务逻辑封装在导演类中对整体而言可以取得比较好的稳定性。2）建造者模式很容易进行扩展。如果有新的需求，通过实现一个新的建造者类就可以完成，基本上不用修改之前已经测试通过的代码，因此也就不会对原有功能引入风险。
六、原型模式(PrototypePattern)
原型模式主要用于对象的复制，它的核心是就是类图中的原型类Prototype。Prototype类需要具备以下两个条件：

实现Cloneable接口。在java语言有一个Cloneable接口，它的作用只有一个，就是在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在运行时会抛出CloneNotSupportedException异常。

重写Object类中的clone方法。Java中，所有类的父类都是Object类，Object类中有一个clone方法，作用是返回对象的一个拷贝，但是其作用域protected类型的，一般的类无法调用，因此，Prototype类需要将clone方法的作用域修改为public类型。
原型模式的注意事项

使用原型模式复制对象不会调用类的构造方法。因为对象的复制是通过调用Object类的clone方法来完成的，它直接在内存中复制数据，因此不会调用到类的构造方法。不但构造方法中的代码不会执行，甚至连访问权限都对原型模式无效。还记得单例模式吗？单例模式中，只要将构造方法的访问权限设置为private型，就可以实现单例。但是clone方法直接无视构造方法的权限，所以，单例模式与原型模式是冲突的，在使用时要特别注意。

深拷贝与浅拷贝。Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。
PS：深拷贝与浅拷贝问题中，会发生深拷贝的有java中的8中基本类型以及他们的封装类型，另外还有String类型。其余的都是浅拷贝。
参考文章：详解Java中的clone方法 -- 原型模式