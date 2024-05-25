package incapsulareEx2;

public class Chicken {
    String colour;
    private int age;
    String breed;

    public Chicken(String colour, int age, String breed) {
        this.colour = colour;
        this.age = age;
        this.breed = breed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAge(int age) throws Exception {
        if (age >= 1 && age <= 12) {
            this.age = age;
        } else {
            throw new Exception("Varsta invalida!");
        }

    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + colour + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
