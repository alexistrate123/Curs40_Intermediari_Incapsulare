package incapsulareEx1;

public class Main {
    /*
    1. Creeaza clasa student  cu campurile String name si int age;
    2. Conditionam colegul de la job sa nu puna un nume mai mic de 3 caractere si varsta sa nu fie mai mica de 18 si mai mare de 80
    */

    public static void main(String[] args) throws Exception {
        Student student = new Student("Hector", 23);
        student.setName("Marcel");
        student.setAge(47);
        System.out.println("Numele studentului este: " + student.getName() + " si are varsta de "  + student.getAge() + " de ani.");

    }
}
