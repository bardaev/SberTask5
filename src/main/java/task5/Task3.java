package task5;

public class Task3 {
    class A {
        String str = "ab";
        A() {
            printLength();
        }
        void printLength() {
            System.out.println(str.length());
        }
    }

    class B extends A {
        String str = "abc";
        void printLength() {
            System.out.println(str.length());
        }
    }

    public static void main(String[] args) {
        new Task3().new B();
    }
}

/*
    Будет выброшено NullPointerException
    Данная ошибка происходит из-за того, что при констуировании объекта B вызывается конструктор родитель A
    А в конструкторе вызывается переопределенный метод printLength объекта B
    Так как поле str не инициализируется в конструкторе и инициализируется после конструктора, оно имеет значение null
    Функция printLength обращается к полю со значением null
 */