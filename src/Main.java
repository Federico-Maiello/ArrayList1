import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Federico Maiello", 28);
        List<Student> list = Arrays.asList(student);

        System.out.println("Studente: " + list);

        List<Student> lista1 = new ArrayList<>();
        Student student2 = new Student("Luigi", 34);
        lista1.add(student);
        lista1.add(student2);
        lista1.add(new Student("Chiara", 24));
        lista1.add(new Student("Anna", 21));
        lista1.add(new Student("Franco", 25));
        lista1.add(new Student("Giorgia", 23));


        System.out.println("Lista studenti: " + lista1);
    }
}