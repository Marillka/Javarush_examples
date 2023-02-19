package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex1;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Director director = new Director();
        university.addStudent("Vaska");
        university.addObserver(director);
        university.addStudent("Anna");
        university.addStudent("Vaska");
    }
}
