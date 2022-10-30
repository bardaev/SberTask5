package task5;

public class Task2 {
    static String str = "Hello";

    public static void change(String s) {
        s = "world";
    }

    public static void main(String[] args) {
        System.out.println(str);
        change(str);
        System.out.println(str);
    }
}

/*
    Будет напечатано: Hello
    Объекты в Java передаются по ссылке
    При вызове change переменной s передается ссылка
    А в теле функции переменной s присваивается ссылка на другой объект
    Если бы String был мутабельным и переменной s не присваивалась другая ссылка и менялся бы сам объект то результат был бы иным
 */