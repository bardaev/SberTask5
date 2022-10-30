package task5;

interface Task {
    void someMethod();
    void someElseMethod();
}

public class Task1 implements Task {
    public void someMethod() {
        System.out.println("do Some usual");
        System.out.println("do Some usual1");
        RefCreator.printOperativeRef();
        System.out.println("do Some usual2");
        System.out.println("do Some usual3");
    }
    public void someElseMethod() {
        System.out.println("do Some usual");
        System.out.println("do Some usual1");
        RefCreator.printHistoricalRef();
        System.out.println("do Some usual2");
        System.out.println("do Some usual3");
    }
    static class RefCreator {
        static void printOperativeRef(){
            System.out.println("operative ref");
        }
        static void printHistoricalRef(){
            System.out.println("historical ref");
        }
    }
    public static void main(String[] args) {
        Task1 refactorTest = new Task1();
        refactorTest.someMethod();
        refactorTest.someElseMethod();
    }
}
