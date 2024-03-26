import java.util.*;

public class TriNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void repTri(){
        String choix;
        do{
            System.out.print("Veuiller choisir entre 'croissant' ou 'decroissant' pour le tri: ");
            choix = scanner.nextLine();

            if(choix.equals("croissant")){
                Integer [] repTriFonctionCroix = TriNumberCrois();
                for (int rep : repTriFonctionCroix){
                    System.out.println(rep);
                }
            }
            else if(choix.equals("decroissant")){
                Integer [] repTriFonctionDec = TriNumberDec();
                for (int rep : repTriFonctionDec){
                    System.out.println(rep);
                }
            }
        } while (!choix.equals(""));
    }

    public static int[] nbTableau(){
        //Methode 1 : tableau
        System.out.print("Veuillez entrer le nombre de tableau : ");
        int num = scanner.nextInt();
        int[] tabNumber = new int[num];

        for (int i = 0; i < tabNumber.length; i++) {
            System.out.print("Indice " + (i + 1) + " : ");
            tabNumber[i] = scanner.nextInt();
        }
        return tabNumber;
    }

    public static Integer[] NbArrayTab(){
        //Methode 2: arrayList
        List<Integer> list = new ArrayList<>();
        Integer [] repArrTab = null;

            System.out.print("Veuillez entrer les composants (nombre) et qui est separe en (,) : ");
            String input = scanner.nextLine();

            String[] numbers = input.split(",");
            for (String number : numbers) {
                list.add((Integer.parseInt(number.trim())));
                repArrTab = list.toArray(new Integer[list.size()]);
            }

        return repArrTab;
    }

    public static Integer[] TriNumberDec(){
        Integer [] numTableau = NbArrayTab();
        for (int i = 0; i < numTableau.length - 1; i++) {
            for (int j = 0; j < numTableau.length - i - 1; j++) {
                if (numTableau[j] < numTableau[j + 1]) {
                    int temp = numTableau[j];
                    numTableau[j] = numTableau[j + 1];
                    numTableau[j + 1] = temp;
                }
            }
        }
        return numTableau;
    }

    public static Integer[] TriNumberCrois(){
        Integer [] numTableau = NbArrayTab();
        for (int i = 0; i < numTableau.length - 1; i++) {
            for (int j = 0; j < numTableau.length - i - 1; j++) {
                if (numTableau[j] < numTableau[j + 1]) {
                    int temp = numTableau[j];
                    numTableau[j] = numTableau[j + 1];

                    numTableau[j + 1] = temp;
                }
            }
        }
        return numTableau;
    }
}
