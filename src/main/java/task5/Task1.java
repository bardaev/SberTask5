package task5;

interface Task {
    void someMethod();
    void someElseMethod();
}

class TaskProxy implements Task {

    Task task;

    TaskProxy(Task task) {
        this.task = task;
    }

    @Override
    public void someMethod() {
        doBefore();
        task.someMethod();
        doAfter();
    }

    @Override
    public void someElseMethod() {
        doBefore();
        task.someElseMethod();
        doAfter();
    }

    private void doAfter() {
        System.out.println("do Some usual");
        System.out.println("do Some usual1");
    }

    private void doBefore() {
        System.out.println("do Some usual2");
        System.out.println("do Some usual3");
    }
}

public class Task1 implements Task {
    public void someMethod() {
        RefCreator.printOperativeRef();
    }
    public void someElseMethod() {
        RefCreator.printHistoricalRef();
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
        Task refactorTest = new TaskProxy(new Task1());
        refactorTest.someMethod();
        refactorTest.someElseMethod();
    }
}
