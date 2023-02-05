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

        //Ссылочные типы данных. Строки(String) в Java. Представляет собой последовательность символов !
        String wordLine = "Hi";
        String s = " ";
        String nameBoy = "Beka";
        System.out.println(wordLine + s + nameBoy);
        System.out.println("My name is " + "Beka");
        System.out.println();
        // Цикл while. Повторяет оператор или блок операторов до тех пор, пока значение его управляющего выражения истинно !
        int value = 0;
        while (value < 5) {
            System.out.println("Hello" + value);
            value = value + 1;
        }
        System.out.println();
        //Цикл for.Управляющая конструкция программного кода, которая нарушает линейность исполнения алгоритма и позволяет выполнить указанный код множество раз !
        for (int i = 0; i <= 20; i++) {// i++ == i=i+1
            System.out.println("Hi " + i);
        }

        //Условный оператор if.Конструкция, которая, проверяя условия, запускает в действие необходимый код !
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

        //Цикл do...while. Похож на цикл while, отличие, что цикл do...while гарантированно выполнится, по крайней мере один раз !
        int number = 0;
        do {
            System.out.println("Введи 7");
            number = scanner.nextInt();
        } while (number != 7);
        System.out.println(" МОЛОДЦЫ, ВЫ ВВЕЛИ 7 ");

        //Операторы break и continue. Оператор break завершает ближайший оператор или операторитерации switch . Оператор continue запускает новую итерацию ближайшего включающего оператора итерации !
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

        //Оператор return. Используется в функциях для возвращения данных после выполнения работы самой функции !
        String nyc = bitch("");
        System.out.println(nyc);
    }

    public static String bitch(String beka) {
        return ("ты " + "пукнул");

        //Оператор switch. Условный оператор, который дает возможность сравнивать переменную со списком значений !
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

        //Массивы в Java. Структура данных. Шкаф с полочками !
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

        //Многомерные массивы. Массивы массивов !
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

        //Методы в Java. Это блок кода, обьявляемый внутри класса !
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

        //Параметры метода ! Это специальные переменные метода !
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
        используются для получения значения поля класса или его изменения !
         */
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

        //Ключевое слово this. - это ключевое слово, которое вызывает обьект внутри класса !
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

        //Конструкторы. Это специальные методы, которые вызываются при создании нового обьекта !
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

        //Ключевое слово static.
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
            public void printCountofPeople(){
                System.out.println("NUMBER OF PEOPLE IS " + countPeople);
            }
        }

        // Ключевое слово final.
        public class Main {
            public static void main(String[] args) {
                final int x =0;
                System.out.println(x);
                x=5;
            }
        }
        class TEST{
            public static final int CONSTANT = 0;
        }

        //StringBuilder.


        //Форматирование строк в Java


        //Класс Object и метод toString()


        //Наследование


        //Интерфейсы


        //Пакеты


        //Модификаторы доступа public, private, protected и default.


        //Enum (Перечисления).


        //Полиморфизм


        //Приведение примитивных типов данных.


        //Классы-обертки примитивных типов данных.


        //Восходящее и нисходящее преобразование.


        //Введение в параметризацию. (Generics)


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
