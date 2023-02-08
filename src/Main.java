import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ - хранят данные !
        int numberOne = 214748; // (10 чисел)
        long numberTwo = 9223372; // (19 чисел)
        float numberThree = 2362.4f; // (6-7 после запятой)
        double numberFour = 235.35; // (15 цифр после запятой)
        char symbol = 'a'; // один символ, буква
        boolean b = true; // true or false

        //Поразрядные операции !
        byte b = 7;     // 0000 0111
        short s = 7;    // 0000 0000 0000 0111
        //& (логическое умножение)
        int a1 = 2; //010
        int b1 = 5;//101
        System.out.println(a1 & b1); // результат 0

        int a2 = 4; //100
        int b2 = 5; //101
        System.out.println(a2 & b2); // результат 4
        //| (логическое сложение)
        int a1 = 2; //010
        int b1 = 5;//101
        System.out.println(a1 | b1); // результат 7 - 111
        int a2 = 4; //100
        int b2 = 5;//101
        System.out.println(a2 | b2); // результат 5 - 101
        //^ (логическое исключающее ИЛИ)
        int number = 45; // 1001 Значение, которое надо зашифровать - в двоичной форме 101101
        int key = 102; //Ключ шифрования - в двоичной системе 1100110
        int encrypt = number ^ key; //Результатом будет число 1001011 или 75
        System.out.println("Зашифрованное число: " + encrypt);

        int decrypt = encrypt ^ key; // Результатом будет исходное число 45
        System.out.println("Расшифрованное число: " + decrypt);
        //~ (логическое отрицание)
        byte a = 12;                 // 0000 1100
        System.out.println(~a);     //  1111 0011   или -13
        //Операции присваивания и приоритет операций !
        int a = 5;
        a += 10;        // 15
        a -= 3;         // 12
        a *= 2;         // 24
        a /= 6;         // 4
        a <<= 4;      // 64
        a >>= 2;      // 16
        System.out.println(a);  // 16

        //Ссылочные типы данных. Строки(String) в Java. Представляет собой последовательность символов !
        String wordLine = "Hi";
        String s = " ";
        String nameBoy = "Beka";
        System.out.println(wordLine + s + nameBoy);
        System.out.println("My name is " + "Beka");
        System.out.println();
        /* Цикл while - повторяет оператор или блок операторов до тех пор, пока значение его управляющего 
        выражения истинно ! */
        int value = 0;
        while (value < 5) {
            System.out.println("Hello" + value);
            value = value + 1;
        }
        System.out.println();
        /*Цикл for - управляющая конструкция программного кода, которая нарушает линейность исполнения алгоритма
         и позволяет выполнить указанный код множество раз ! */
        for (int i = 0; i <= 20; i++) {// i++ == i=i+1
            System.out.println("Hi " + i);
        }

        //Условный оператор if - конструкция, которая, проверяя условия, запускает в действие необходимый код !
        int digit = 10;
        if (digit < 10) {
            System.out.println("ВЕРНО");
        } else if (digit > 20) {
            System.out.println("НЕВЕРНО");
        } else
            System.out.println("НИ ОДИН ИЗ ПРЕДЫДУЩИХ");

        //Ввод данных. Класс Scanner. Позволяет считывать данные из разных источников !
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь : ");
        String x = scanner.nextLine();
        System.out.println("Вы ввели - " + x);

        /*Цикл do...while - похож на цикл while, отличие, что цикл do...while гарантированно выполнится,
        по крайней мере один раз ! */
        int number = 0;
        do {
            System.out.println("Введи 7");
            number = scanner.nextInt();
        } while (number != 7);
        System.out.println(" МОЛОДЦЫ, ВЫ ВВЕЛИ 7 ");

        /*Операторы break и continue. Оператор break завершает ближайший оператор или операторитерации switch.
        Оператор continue запускает новую итерацию ближайшего включающего оператора итерации ! */
        int digital = 0;
        while (true) {
            if (digital == 15) {
                break;
            }
            System.out.println(digital);
            digital++;
        }
        System.out.println("Вы вышли из цикла");

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Это нечетное число " + i);
        }

        //Оператор return - используется в функциях для возвращения данных после выполнения работы самой функции !
        String nyc = bitch("");
        System.out.println(nyc);
    }

    public static String bitch(String beka) {
        return ("ты " + "пукнул");

        //Оператор switch - условный оператор, который дает возможность сравнивать переменную со списком значений !
        Scanner scanners = new Scanner(System.in);
        System.out.println("Введи свой возраст : ");
        int lifeAndAge = scanners.nextInt();
        switch (lifeAndAge) {
            case 0:
                System.out.println("ТЫ РОДИЛСЯ");
                break;
            case 14:
                System.out.println("ТЫ ПОВЗРОСЛЕЛ");
                break;
            case 16:
                System.out.println("У ТЕБЯ ПОЯВИЛАСЬ ДЕВУШКА");
                break;
            case 18:
                System.out.println("ИЗВИНИ, НО ОНКАЗЫВАЕТСЯ, ЧТО БЕКТУР ГЕЙ !");
                break;
            default:
                System.out.println("НИ ОДИН ИЗ НИХ");
        }

        //Массивы в Java - структура данных, шкаф с полочками !
        int[] ageOfPupils = {13, 14, 15, 16, 17};
        System.out.println(ageOfPupils[0]);

        String nameOfPupils[] = new String[3];
        nameOfPupils[0] = "Ками";
        nameOfPupils[1] = "Нуриза";
        nameOfPupils[2] = "Аида";
        System.out.println(nameOfPupils[1]);
        int[] numbers = new int[9];
        for (int i = 0; i < numbers.length; i = i + 2) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }

        //Цикл for each, Массивы строк ! Используется для перебора элементов !
        String[] cars = {"BMW", "Mercedes-Benz", "AUDI"};
        for (String car : cars) {
            System.out.println(car);
        }
        int[] num = {1, 10, 100};
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println(sum);

        //Многомерные массивы - массивы массивов !
        int[] digitOne = {9, 8, 7};
        int[][] matrices = {{3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}};
        System.out.println(matrices[2][1]);

        int i;
        for (i = 0; i < matrices.length; i++) ;
        int j;
        for (j = 0; j < matrices[i].length; j++) ;
        System.out.println(matrices[i][j] + " ");

        //Классы и объекты. Класс - шаблон или описание обьекта. Обьект - экземпляр этого класса !
        public class Main {
            public static void main(String[] args) {
                Person person1 = new Person();
                person1.name = "Роман";
                person1.age = 18;
                System.out.println("Меня зовут " + person1.name + " , мне " + person1.age);
                Person person2 = new Person();
                person2.name = "Вова";
                person2.age = 36;
                System.out.println("Меня зовут " + person2.name + " , мне " + person2.age);
            }
        }
        class Person {
            //классы могут быть :
            //Данные (поля)
            //Действия, которые они могут совершать (Методы)
            String name;
            int age;
        }

        //Методы в Java - это блок кода, обьявляемый внутри класса !
        public class Main {
            public static void main(String[] args) {
                Person person1 = new Person();
                person1.name = "Роман";
                person1.age = 18;
                person1.speak();
                person1.sayHello();
                Person person2 = new Person();
                person2.name = "Вова";
                person2.age = 36;
                person2.speak();
                person2.sayHello();
            }
        }
        class Person {
            //классы могут быть :
            //Данные (поля)
            //Действия, которые они могут совершать (Методы)
            String name;
            int age;

            void speak() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("My name is " + name + " I'm " + age);
                }
            }

            void sayHello() {
                System.out.println("HI !");
            }
        }

        //Тип возвращаемого значения метода !
        public class Main {
            public static void main(String[] args) {
                Person person1 = new Person();
                person1.name = "Роман";
                person1.age = 18;
                int year1 = person1.calculateYearsToRetirement();
                Person person2 = new Person();
                person2.name = "Вова";
                person2.age = 36;
                int year2 = person2.calculateYearsToRetirement();
                System.out.println("Первому человеку до пенсии : " + year1 + " лет");
                System.out.println("Второму человеку до пенсии : " + year2 + " лет");
            }
        }
        class Person {
            String name;
            int age;

            int calculateYearsToRetirement() {
                int years = 65 - age;
                return years;
            }

            void speak() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("My name is " + name + " I'm " + age);
                }
            }

            void sayHello() {
                System.out.println("HI !");
            }
        }

        //Параметры метода - это специальные переменные метода !
        public class Main {
            public static void main(String[] args) {
                Person person1 = new Person();
                person1.setNameAndAge("Роман", 18);
                String s1 = "Вова";
                Person person2 = new Person();
                person2.setNameAndAge(s1, 36);
                person1.speak();
                person2.speak();
            }

            static class Person {
                String name;
                int age;

                void setNameAndAge(String username, int userage) {
                    name = username;
                    age = userage;
                }

                int calculateYearsToRetirement() {
                    int years = 65 - age;
                    return years;
                }

                void speak() {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("My name is " + name + " I'm " + age);
                    }
                }

                void sayHello() {
                    System.out.println("HI !");
                }
            }
        }

        /*Инкапсуляция. Сеттеры и геттеры. Инкапсуляция - способ спрятать сложную логику внутри класса ! С и Г -
        используются для получения значения поля класса или его изменения ! */
        public class Main {
            public static void main(String[] args) {
                Person person1 = new Person();
                person1.setName("");
                person1.setAge(-7);
                System.out.println(person1.getName());
                System.out.println(person1.getAge());
            }
        }
        class Person {
            private String name;
            private int age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                if (name.isEmpty()) {
                    System.out.println("You entered empty name ");
                } else {
                    this.name = name;
                }
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                if (age < 0) {
                    System.out.println("Name should be positive ");
                } else {
                    this.age = age;
                }
            }

            void speak() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("My name is " + name + " I'm " + age);
                }
            }

            void sayHello() {
                System.out.println(" HI !");
            }
        }

        //Ключевое слово this - это ключевое слово, которое вызывает обьект внутри класса !
        public class Main {
            public static void main(String[] args) {
                Human human1 = new Human();
                human1.setName("Bektur");
                human1.setAge(15);
                human1.getInfo();
            }
        }
        class Human {
            String name;
            int age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void getInfo() {
                System.out.println(name + " " + age);
            }
        }

        //Конструкторы - это специальные методы, которые вызываются при создании нового обьекта !
        public class Main {
            public static void main(String[] args) {
                Human human1 = new Human();
            }
        }
        class Human {
            public Human(String name, int age) {
                this.name = "Bob";
                this.age = 15;
                System.out.println("Привет из первого конструктора !");
            }

            private String name;
            private int age;

            public Human() {
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        /*Ключевое слово static - используется для обьявления статического члена, принадлежащего собственному типу,
        а не конкретному обьекту !*/
        public class Main {
            public static void main(String[] args) {
                Human human = new Human("BOB", 35);
                Human human2 = new Human("TOM", 19);
                Human human3 = new Human("BEN", 56);
                human.printCountofPeople();
                human2.printCountofPeople();
                human3.printCountofPeople();
            }
        }
        class Human {
            private String name;
            private int age;

            private static int countPeople;

            public Human(String name, int age) {
                this.name = name;
                this.age = age;
                countPeople++;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void printCountofPeople() {
                System.out.println("NUMBER OF PEOPLE IS " + countPeople);
            }
        }

        // Ключевое слово final(модификатор) применяется для ограничения поведения !
        public class Main {
            public static void main(String[] args) {
                final int x = 0;
                System.out.println(x);
                x = 5;
            }
        }
        class TEST {
            public static final int CONSTANT = 0;
        }

        //StringBuilder - класс, используемый для создания изменяемой последовательности символов !
        public class Main {
            public static void main(String[] args) {
                String X = "hello";
                X = X.toUpperCase();
                System.out.println(X);
                System.out.println();
                String string1 = "HI, ";
                String string2 = "MY ";
                String string3 = "FRIEND !";
                String all = string1 + string2 + string3;
                System.out.println(all);
                System.out.println();
                StringBuilder sb = new StringBuilder("HELLO, ");
                sb.append(" MY ").append(" FRIEND !");
                System.out.println(sb.toString());
            }
        }

        /* Форматирование строк в Java !
        %s ("Hello %s!","world") String
        %b ("Hello %b!", null) boolean
        %c ("Hello wor%cd", 'l') char
        %d ("I'M ONLY %d", 20) int, byte, short,int, long, BigInteger
        %n Разделитель строк для конкретной платформы
        %t ("TODAY %tA", new Date())
         */
        public class Main {
            public static void main(String[] args) {
                System.out.printf("STRING %.2f\n", 3.33);
                System.out.printf("STRING %.2f\n", 45.36366);
                System.out.printf("STRING %-10d\n", 5);
                System.out.printf("STRING %-10d\n", 100000);
                System.out.printf("STRING %-10d\n", 1000000000);
                //% -[10] [.42]
            }
        }

        /*Класс Object и метод toString()
        Метод toString служит для получения представления данного объекта в виде строки.
        В Java есть специальный суперкласс Object и все классы являются его подклассами ! */
        public class Main {
            public static void main(String[] args) {
                Human human = new Human("BOB", 35);
                human.toString();
                System.out.println(human.toString());
            }
        }
        class Human {
            private String name;
            private int age;

            public Human(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String toString() {
                return name + "," + age;
            }
        }

        //Наследование - механизм получения нового класса на основе уже существующего !
//LESSON.java
        public class LESSON {
            public static void main(String[] args) {
                Animal animal = new Animal();
                animal.eat();
                animal.sleep();
                DOG dog = new DOG();
                dog.eat();
                dog.sleep();
                dog.bark();
                dog.showName();
            }
        }
//Animal.java
        public class Animal {
            String name = "beka";

            public void eat() {
                System.out.println("I'M EATING !");
            }

            public void sleep() {
                System.out.println("I'M SLEEPING !");
            }
        }
//DOG.java
        public class DOG extends Animal {
            public void eat() {
                System.out.println("DOG IS EATING");
            }

            public void bark() {
                System.out.println("GAV GAV GAV");
            }

            public void showName() {
                System.out.println(name);
            }
        }

        /*Интерфейсы - определяют некоторый функционал, не имеющий конкретной реализации,
         который затем реализуют классы, применяющие эти интерфейсы ! */
//ANIMAL.java
package INTERFACE;
        public class ANIMAL implements INFO {
            public int id;

            public ANIMAL(int id) {
                this.id = id;
            }

            public void sleep() {
                System.out.println("i am sleeping ! ");
            }

            @Override
            public void showInfo() {
                System.out.println("ID IS " + this.id);
            }
        }
//INFO.java
        package INTERFACE;
        public interface INFO {
            public void showInfo();
        }
//PERSON.java
        package INTERFACE;
        public class PERSON implements INFO {
            public String name;

            public PERSON(String name) {
                this.name = name;
            }

            public void sayHello() {
                System.out.println("hello !");
            }

            @Override
            public void showInfo() {
                System.out.println("NAME IS " + this.name);
            }
        }
//TEST.java
        package INTERFACE;

        public class TEST {
            public static void main(String[] args) {
                ANIMAL animal = new ANIMAL(1);
                PERSON person = new PERSON("BOB");
                animal.sleep();
                person.sayHello();
                animal.showInfo();
                person.showInfo();
                System.out.println();
                INFO info = new ANIMAL(1);
                INFO info1 = new PERSON("MOM");
                outputInfo(info);
                outputInfo(info1);
                System.out.println();
                ANIMAL animal1 = new ANIMAL(1);
                PERSON person1 = new PERSON("TOM");
                outputInfo(animal1);
                outputInfo(person1);
            }

            public static void outputInfo(INFO info) {
                info.showInfo();
            }
        }

        //Пакеты - позволяют организовать классы логически в наборы !
        "C:\Users\User\Pictures\Screenshots\Снимок экрана (2).png"
        //Main.java
        import FOREST.SQUIRELL;
import FOREST.TREE;
import SOMETHING.SOMECLASS;

import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                TREE tree = new TREE();
                SQUIRELL squirell = new SQUIRELL();
                SOMECLASS someclass = new SOMECLASS();
            }
        }
//SOMECLASS.java
        package SOMETHING;
        public class SOMECLASS {
        }
//TREE.java
        package FOREST;
        public class TREE {
        }
//SQUIRELL.java
        package FOREST;
        public class SQUIRELL {
        }

        /*Модификаторы доступа public, private, protected и default.
        https://programmera.ru/wp-content/uploads/2018/06/access-modifier1.png
        */

        //Полиморфизм - способность метода обравбатывать данные разных типов !
//Main.java
        public class Main {
            public static void main(String[] args) {
                ANIMAL animal = new DOG(); // UPCASTING - восходящее преобразование
                animal.eat();
                System.out.println();
                DOG dog = new DOG();
                dog.eat();
                dog.bark();
                DOG dog1 = (DOG) animal; //DOWNCASTING -нисходящее преобразование
                DOG dog = (DOG) animal;
                System.out.println();
                CAT cat = new CAT();
                cat.eat();
                cat.cry();
                System.out.println();
                test(animal);
                test(dog);
                test(cat);
            }

            public static void test(ANIMAL animal) {
                animal.eat();
            }
        }
        //ANIMAL.java
        public class ANIMAL {
            public void eat() {
                System.out.println("ANIMAL IS EATING !");
            }
        }
        //DOG.java
        public class DOG extends ANIMAL {
            public void eat() {
                System.out.println("DOG IS EATING !");
            }

            public void bark() {
                System.out.println("DOG IS BARKING !");
            }
        }

        //CAT.java
        public class CAT extends ANIMAL {
            public void cry() {
                System.out.println("DON'T CRY !");
            }

            public void eat() {
                System.out.println("CAT IS EATING !");
            }
        }

        //Приведение примитивных типов данных !
        public class Main {
            public static void main(String[] args) {
                float f = (float) 123.4;// можно только числа из типа double
                int a = 123;

                double w = a;
                int y = (int) w;

                y = Math.round(a);

                long l = a;//неявное
                int x = (int) l;//явное

                byte e = (byte) 128;
                System.out.println(x);
                System.out.println(f);
                System.out.println(w);
                System.out.println(e);
            }
        }

        //Классы-обертки примитивных типов данных !
        public class Main {
            public static void main(String[] args) {
                int x = 1;
                Integer x2 = Integer.valueOf(25);
                Integer.parseInt("123");
                System.out.println(x);
            }
        }
        
        //Введение в параметризацию. (Generics) !


        //Wildcards (Generics)


        //Анонимные классы


        //Чтение из файла.


        //Исключения (часть 1). Обработка исключений.


        //Исключения (часть 2). Выбрасывание исключений.


        //Исключения (часть 3). Checked и Unchecked исключения.


        //Исключения (часть 4).


        //Абстрактные классы.


        //Метод equals() и String Pool.


        //Вложенные классы.


        //Запись в файл.


        //Сериализация (часть 1).


        //Сериализация (часть 2). Сериализация массивов.


        //Сериализация (часть 3). Transient, serialVersionUID.


        //Enum (Перечисления).


        //Рекурсия


    }
}
