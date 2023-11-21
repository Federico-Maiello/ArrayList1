import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Federico Maiello", 28);
        List<Student> list = Arrays.asList(student);

        System.out.println("Studente: " + list);

        List<String> lista1 = new ArrayList<>();
        lista1.add(student.name);
        lista1.add(String.valueOf(student.age));
        lista1.add("H 1.85");
        lista1.add("Occhi marroni");
        lista1.add("Capelli neri");
        lista1.add("id: 774");

        System.out.println("Studente aggiornato: " + lista1);
    }
}