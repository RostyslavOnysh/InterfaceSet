# Interface Set
### Set overview та чим відрізняєтмя від листа 

Всі реалізації інтерфейсу ***Set*** будуть зберігати тільки унікальні значення 
створюємо екземляр *Set interface*, параметризуємо його типом String type,називаємо змінну ,та проініціалізуємо цю змінну.
```java 
 Set<String> names = new HashSet<>();
```
* ***HashSet<>();*** - найпопулярніша реалізація інтерфейсу.
та додаємо деякі значення в нашу змінну.

```java 
names.add("bob");
names.add("alice");
names.add("john");
names.add("bob");
names.add("alice");
names.add("john");
names.add("bob");
names.add("alice");
names.add("john");
names.add("bob");
names.add("alice");
names.add("john");
```

В результаті виведення інформації з *Set names* бачимo output лише 3 значення
будь-яка реалізація *Set* буде зберігати ***унікальні*** значення.Якщо ми додамо 
в *Set* більше ніж два об`єкти, однакових за *equals()* в *Set* буде зберігатися тільки ***один*** екземпляр

* ***це перша відмінність сету від листа*** 
* друга відмінність полягає в наборі тих чи інших методів.
Наприклад в ***interface List*** є method get element by index :
```java 
String name = nameList.get(0);
```
на вхід в якості параметру передаємо index і в результаті можемо отримати те що зберігаєтся під index =  0.
int Set interface такого методу немає, тому що в Set немає індексації.

* size
* empty
* remove 
*  boolean contain :
```java 
 System.out.println(names.contains("Bob"));
 ```

*  Set розширяє ***Interface collection*** адже ***Set*** розширяє інтерфейс Collection; 
* порядок виведення елементів Set interface може змінюватися.

#### під капотом у HashSet буде знаходитись HashMap
Interface HashSet<E> параметризований одним типом

```java 
import java.util.AbstractSet;

public class HashSet<E> extends AbstractSet<E>
implements Set<E>, Cloneable,java.io.Serializable
```







