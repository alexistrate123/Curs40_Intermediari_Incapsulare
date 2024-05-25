package incapsulareEx1;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) throws Exception {
        if (name.length() >= 3) {
            this.name = name;
        } else {
           // System.err.println("Lungimea numelui este mai mica de 3 caractere.");
            throw new Exception("Lungimea numelui este mai mica de 3 caractere.");
        }
    }

    public void setAge(int age) throws Exception {
      if (age >= 18 && age <= 80 ) {
          this.age = age;
      } else {
          throw new Exception("Varsta nu este cuprinsa intre valorile cerute.");
      }
      //"Varsta nu este cuprinsa intre valorile cerute."
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
