package temaPentruJoi;

public class Main {
    /*
   1. Creeaza clasa IceCreamMachine cu campurile:
    Vei avea o lista de tip String in care vei trece aromele aparatului tau: ciocolata, vanilie, capsuni, pepene, banane
    Clasa IceCreamMachine va avea metoda prepareIceCream(String desireFlavour);
    Aparatul tau de inghetata va putea prepara inghetata doar daca clientul tau va introduce ca parametru una dintre aromele valabile.
    Testeaza functionalitatile

    2.  Modifica functionalitatea clasei tale adaugant metoda addFlavour(String newFlavour) - care v-a adauga un  nou tip de inghetata
    Testeaza functionalitatile.
     */

    public static void main(String[] args) {
        IceCreamMachine machine = new IceCreamMachine();
        machine.displayAvailableFlavours();
        machine.prepareIceCream("ciocolata");
        machine.prepareIceCream("caramel");


        machine.addFlavour("caramel");
        machine.prepareIceCream("caramel");



    }
}
