
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Trojki {
    
    static void pktA() throws FileNotFoundException{

        File file = new File("trojki.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){

            String line = scanner.nextLine();
            String[] liczby = line.split(" ");
            
            int suma = 0;

            String polaczoneLiczby = liczby[0]+liczby[1];

            for(int i = 0; i < polaczoneLiczby.length(); i++){
                suma += Integer.parseInt(Character.toString(polaczoneLiczby.charAt(i)));
            }

            if(suma == Integer.parseInt(liczby[2])){
                System.out.println("Poprawne: "+line);
            }

        }

        scanner.close();

    }



    static void pktB() throws FileNotFoundException{

        File file = new File("trojki.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){

            String line = scanner.nextLine();
            String[] liczby = line.split(" ");

            boolean pierwsza = false;
            boolean druga = false;
            
            int pierwszaLiczba = Integer.parseInt(liczby[0]);
            int drugaLiczba = Integer.parseInt(liczby[1]);
            int trzeciaLiczba = Integer.parseInt(liczby[2]);
            
            for(int i = 2; i < pierwszaLiczba; i++){
                if(pierwszaLiczba%i == 0){
                    pierwsza = false;
                    break;
                }else{
                    pierwsza = true;
                }
            }

            for(int i = 2; i < drugaLiczba; i++){
                if(drugaLiczba%i == 0){
                    druga = false;
                    break;
                }else{
                    druga = true;
                }
            }

            if(pierwsza == true && druga == true && pierwszaLiczba*drugaLiczba == trzeciaLiczba){
                System.out.println("Poprawne: "+line);
            }

        }

        scanner.close();

    }


    
    static void pktC() throws FileNotFoundException{

        File file = new File("trojki.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){

            String line = scanner.nextLine();
            String[] liczby = line.split(" ");

            int pierwszaLiczba = Integer.parseInt(liczby[0]);
            int drugaLiczba = Integer.parseInt(liczby[1]);
            int trzeciaLiczba = Integer.parseInt(liczby[2]);

            if(pierwszaLiczba*pierwszaLiczba + drugaLiczba*drugaLiczba == trzeciaLiczba*trzeciaLiczba){
                System.out.println("Poprawne: "+line);
            }

        }

        scanner.close();

    }



    static void pktD() throws FileNotFoundException{

        File file = new File("trojki.txt");
        Scanner scanner = new Scanner(file);
        
        int i = 0;
        int dlCiagu = 0;
        int iloscWierszy = 0;

        while(scanner.hasNextLine()){

            String line = scanner.nextLine();
            String[] liczby = line.split(" ");

            int pierwszaLiczba = Integer.parseInt(liczby[0]);
            int drugaLiczba = Integer.parseInt(liczby[1]);
            int trzeciaLiczba = Integer.parseInt(liczby[2]);
            
            if(pierwszaLiczba + drugaLiczba > trzeciaLiczba && pierwszaLiczba + trzeciaLiczba > drugaLiczba && drugaLiczba + trzeciaLiczba > pierwszaLiczba){
                iloscWierszy++;
                i++;
            }else{
                i = 0;
            }

            if(i > 0 && i > dlCiagu){
                dlCiagu = i;
            }

        }

        System.out.println("Ilosc trojek: "+iloscWierszy);
        System.out.println("Najdluzszy ciag: "+dlCiagu);

        scanner.close();

    }



    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("<-----------------PKT A----------------->");
        pktA();
        System.out.println("\n");

        System.out.println("<-----------------PKT B----------------->");
        pktB();
        System.out.println("\n");

        System.out.println("<-----------------PKT C----------------->");
        pktC();
        System.out.println("\n");

        System.out.println("<-----------------PKT D----------------->");
        pktD();
        System.out.println("\n");

    }

}
