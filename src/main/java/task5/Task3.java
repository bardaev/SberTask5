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
