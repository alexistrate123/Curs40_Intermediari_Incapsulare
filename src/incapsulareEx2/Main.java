package incapsulareEx2;

public class Main {
    /*
    1. Creeaza 3 clase: duck, pigeon, chicken;
    2. Campurile age , colour, breed;
    3. Efectueaza incapsularea si protejeaza campul age;
    4. Creeaza constructor parametrizat;
    5. Declara cate un obiect din fiecare in main si afiseaza detaliile fiecaruia la consola.

    */

    public static void main(String[] args) throws Exception {
        Chicken chicken = new Chicken("Maro", 10, "Africana");
        chicken.setColour("Maro");
        chicken.setAge(10);
        chicken.setBreed("Africana");
        System.out.println(chicken);

        Duck duck = new Duck("Negru", 7, "Asiatica");
        duck.setColour("Negru");
        duck.setAge(12);
        duck.setBreed("Asiatica");
        System.out.println(duck);

        Pigeon pigeon = new Pigeon("Gri", 10, "Tulcean");
        pigeon.setColour("Gri");
        pigeon.setAge(100);
        pigeon.setBreed("Tulcean");
        System.out.println(pigeon);
    }

}
