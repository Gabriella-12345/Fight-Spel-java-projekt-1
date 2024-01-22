// Gabriella Jonsson
// Te22a
import java.util.Random; // impoterar klassen Random
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner reader = new Scanner(System.in);

        System.out.println("Gabriellas Fight spel!");
        System.out.print("Välj ett spelnamn för spelare 2:");
        String usernamne = reader.nextLine();

        System.out.println("Använarnamn för spelare 2:" + usernamne);
        System.out.println("Användarman för spelare 1: Sam"); 

    
        System.out.println(" vilken Spelare ska slå första slaget? svara 1 eller 2");
        String svar = reader.nextLine();
        if( svar == "2") 
            {
                System.out.println("Spelare 2 slog spelare 1 i ansiktet!");
            }
            else{
                System.out.println("Spelare 1 sparkade Spelare 2 i revbenen men missade...");
            }
        
        public class Slumptal {
            public static void main(String[] args) {
                Random rand = new Random();
                int ettrandomInt = rand.nextInt(11); // genererar ett slumptal mellan 0-10
                System.out.println(ettrandomInt);
            }
        }
        
        System.out.println("Spelare 2 är påväg att sparka dig i höften! Ska du 1: ta sparken eller 2: blocka sparken?");
        svar = reader.nextLine();
        if(svar=="1")
            {
            System.out.println("Du bröt benet och du blöder ut på makren för att sam sparkade dig, Game over!");
            }
            else{
                System.out.println("Du fick ont med klarade dig, den här gången...");
            }
        
    }   
    
}
