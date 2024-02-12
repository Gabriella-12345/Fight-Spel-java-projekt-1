// Gabriella Jonsson 
// Te22a
import java.util.Random; // Impoterar klassen Random som finns i java bibliotek
import java.util.Scanner;
public class App {

    public static String RESET = "\u001B[0m";
    public static String RED = "\u001B[31m";
    public static String BLUE = "\u001B[34m";
    public static String PURPLE = "\u001B[35m";
    public static String GREEN = "\u001B[32m";
    public static String WHITE = "\u001B[37m";
    public static String GUL ="\u001B[33m\t";

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        int runda = 1; // håller koll på vilken runda mna är på
        Random rand = new Random(); 
        int hp1 = 5; // Hälsopoäng för sam/spelare 1
        int hp2 = 5; // Hälsopoäng för spelare 2

        while(hp1 > 0 && hp2 > 0) {
            
            long start_tid = System.currentTimeMillis(); 
            int tal = 5;
        
            System.out.println(BLUE+"SLÅSS MED SAM!" + "\n\n");
            System.out.println("Sam slog och kidnappade din stackas mamma och tog allt ditt godis och din dator");
            System.out.println("Nu måste du slåss med honom för att vinna tillbaka dina mamma och dina saker!!!!");
            System.out.print("Välj ett spelnamn för spelare 2: "+RESET	);
            String usernamne = reader.nextLine();

            System.out.println("Användarman för spelare 1: Sam"); 
            System.out.println("Använarnamn för spelare 2: " + usernamne + "\n");


            //runda 1
            System.out.println(GREEN+"Runda" + runda++ +":Vilken Spelare ska slå första slaget? Svara 1 eller 2 "+RESET);
            String svar = reader.nextLine();
            
            if(svar.equals("2")) // Jämför svar(string) med "2"
            {
                System.out.println("Du slog Sam i ansiktet!");
                hp1--;
            }
            else{
                System.out.println("Sam sparkade dig i revbenen men missade..." + "\n");
                hp2--;
            }
            
            System.out.println(GUL+"Sams Hälsopoäng:" + hp1+RESET);
            System.out.println(usernamne + " Hälsopoäng:" + hp2);
            Thread.sleep(4000);

            int ettrandomInt = rand.nextInt(11); // Genererar ett slumptal mellan 0-10
            int tvårandomInt = rand.nextInt(11); // Genererar ett slumptal mellan 0-10


            //runda 2
            System.out.println(GREEN+"Runda " + runda++ +":Sam är påväg att sparka dig i höften! Kommer du ta eller blocka sparken? Tyck enter för att fortsätta."+RESET);
            reader.nextLine();

            if(ettrandomInt>=tvårandomInt) // Jämför de två slumpmässigt genererade talen, spelaren med mindre talet förlorar ett hälsopoäng
            {
                System.out.println("Du bröt benet och du blöder ut på makren för att sam sparkade dig! Oh nej");
                hp2--; // Förlora hälso poäng -1
            }
            else{
                System.out.println("Du fick ont med klarade dig, den här gången..." + "\n");
                // Ingen förlorar hälso poäng
            }
            System.out.println(GUL+ "Sams Hälsopoäng:" + hp1+RESET);
            System.out.println(GUL+ usernamne + " Hälsopoäng:" + hp2 + "\n"+RESET);
            Thread.sleep(4000);


            //runda 3 
            System.out.println(GREEN+"Runda " + runda++ +":Du slår sam i ansiktet trots dina skador...Tyck enter för att fortsätta"+RESET);
            reader.nextLine();
            if(rand.nextInt(2) == 1) // 0-1 , 50/50 chans
                {
                    System.out.println("Sam blockade och clinchade dig");
                    hp2--; // Spelare 2 förlora hälsopoäng -1
                }
                else{
                    System.out.println("Du fick ont med klarade dig, den här gången..." + "\n\n");
                    hp1--;// Sam förlorar hälso poäng
                }

            System.out.println("Sams Hälsopoäng:" + hp1);
            System.out.println(usernamne + " Hälsopoäng:" + hp2 + "\n");
            Thread.sleep(4000);


            //runda 4
            System.out.println(GREEN+"Runda " + runda++ +":Du får chansen att skada Sam, Vart väljer du? Svara 1, 2 eller 3."+RESET);
            System.out.println("1: Högra stortåns nagelband");
            System.out.println("2: Armbågen");
            System.out.println("3: Tibia");

            String Val = reader.nextLine(); // Användarens svar
            switch (Val) { 
                case "1":
                    System.out.println("Sam fick ont och tittade på dig konstigt");
                    hp1--; // Sam förlorar 1 hälsopoäng
                    break;
                case "2":
                    System.out.println("Båda fick ont, Aj!");
                    hp1--; // Båda spelarna förlorar 1 hälsopoäng
                    hp2--; // Båda spelarna förlorar 1 hälsopoäng
                    break; 
                case "3":
                    System.out.println("Du fick ont");
                    hp2--; // Spelare 2 (du) förlorar 1 hälsopoäng
                    break;
            }
            System.out.println(GUL+"Sams Hälsopoäng:" + hp1);
            System.out.println(usernamne + " Hälsopoäng:" + hp2 + "\n"+RESET);
            Thread.sleep(4000);


            //runda 5
            System.out.println(GREEN+"Runda " + runda++ +":Sam sparkar ditt lår med sitt smalben, vad händer sen? Tyck enter för att fortsätta"+RESET);
            reader.nextLine();

            if(rand.nextInt(2) == 1) // 0-1 , 50/50 chans
                {
                    System.out.println("Du blockerade att sparkade Sam vid midjan, han fick ont");
                    hp1--; // Spelare 2 förlora hälsopoäng -1
                }
                else{
                    System.out.println("Du fick ont men du klarade dig åter igen, den här gången iallafall..." + "\n\n");
                    hp1--;// Sam förlorar hälso poäng
                }
                
            System.out.println(GUL+"Sams Hälsopoäng:" + hp1);
            System.out.println(usernamne + " Hälsopoäng:" + hp2 + "\n"+RESET);
            Thread.sleep(4000);


            //runda 6
            System.out.println(GREEN+"Runda " + runda++ +":Sam kommer emot dig vad ska du göra? välj mellan 1, 2 eller 3."+RESET);
            System.out.println("1: Springa iväg!");
            System.out.println("2: Putta iväg honsom");
            System.out.println("3: Äta lunch");

            Val= reader.nextLine(); // Användarens svar
            switch (Val) { 
                case "1":
                    System.out.println("Fegt...");
                    hp1--; // Sam förlorar hp
                    break;
                case "2":
                    System.out.println("Sam blev arg och slog dig i revbenen"); 
                    hp2--; //Spelare 2 förlorar hp
                    break; 
                case "3":
                    System.out.println("Nej, fokus!!!!!!" + "\n");
                    hp2--; // Spelare 2 (du) förlorar 1 hälsopoäng
                    break;
            }
            
            System.out.println(GUL+"Sams Hälsopoäng:" + hp1+RESET);
            System.out.println(
            usernamne + " Hälsopoäng:" + hp2 + "\n"+RESET);
            Thread.sleep(4000);


            //runda 7
            System.out.println(GREEN+"Runda " + runda++ +":Du ser din mamma hon ropar på din hjälp sam tar fram en gaffel...Tyck enter för att fortsätta"+RESET);
            reader.nextLine();

            if(rand.nextInt(2) == 1) // 0-1 , 50/50 chans
            {
                System.out.println("Du åt din lunch");
                hp1--; // Spelare 2 förlora hälsopoäng -1
            }
            else{
                System.out.println("Du tog gaffeln och högg Sam i armen" + "\n\n");
                hp1--;// Sam förlorar hälso poäng
            }
            System.out.println(GUL+"Sams Hälsopoäng:" + hp1);
            System.out.println(usernamne + " Hälsopoäng:" + hp2 + "\n"+RESET);
            Thread.sleep(4000);

            //slut text
            if(hp1==0)
                {
                    System.out.println("Du vann!");
                    System.out.println("Sams poäng:"+hp1);
                    System.out.println( usernamne + " poäng:"+hp2);
                }
                else{
                    System.out.println("Du förlorade!");
                    System.out.println("Sams poäng:"+hp1);
                    System.out.println(usernamne + " poäng:"+hp2);
                }
            
                for(int i = 0; i < 100000000; i++) 
                {
                    tal += 5;
                }
                long slut_tid = System.currentTimeMillis();
                long tid = slut_tid - start_tid; // räknar ut tiden
                System.out.println("Din tid: " + tid + " Millisekunder"+ "\n\n");
    
        }      
        System.out.println("Vill du spela igen?");
        String slut = reader.nextLine();

        reader.close(); // Scanner klagar, stänga Scannern
    }   
}
