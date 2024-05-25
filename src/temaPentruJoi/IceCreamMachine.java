package temaPentruJoi;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IceCreamMachine {
    private ArrayList<String> flavors;

    public IceCreamMachine() {
        // Initializăm lista de arome cu aromele predefinite
        flavors = new ArrayList<>();
        flavors.add("ciocolata");
        flavors.add("vanilie");
        flavors.add("capsuni");
        flavors.add("pepene");
        flavors.add("banane");
    }

    public void setFlavors(ArrayList<String> flavors) {
        this.flavors = flavors;
    }

    public void prepareIceCream(String desiredFlavour) {
        if (flavors.contains(desiredFlavour)) {
            System.out.println("Prepar înghețată cu aroma: " + desiredFlavour);
        } else {
            System.out.println("Aroma specificată nu este disponibilă.");
        }
    }


    public void addFlavour(String newFlavour) {
        flavors.add(newFlavour);
        System.out.println("Aroma '" + newFlavour + "' a fost adăugată cu succes.");
    }


    public void displayAvailableFlavours() {
        System.out.println("Aromele disponibile sunt: ");
        for (String flavour : flavors) {
            System.out.println(flavour);
        }
    }
}
