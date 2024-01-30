// Gabriella Jonsson 
// Te22a
import java.util.Random; // impoterar klassen Random
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random(); 
        int hp1; // hälsopoäng för sam/ spelare 1
        int hp2; // hälsopoäng för spelare 2

        
        System.out.println("Hello, World!");
        Scanner reader = new Scanner(System.in);

        System.out.println("SLÅS MED SAM!");
        System.out.print("Välj ett spelnamn för spelare 2:");
        String usernamne = reader.nextLine();

        System.out.println("Användarman för spelare 1: Sam"); 
        System.out.println("Använarnamn för spelare 2:" + usernamne);
        
        System.out.println("Vilken Spelare ska slå första slaget? svara 1 eller 2 ");
        String svar = reader.nextLine();
        if( svar == "2") 
            {
                System.out.println("Du slog Sam i ansiktet!");
                
            }
            else{
                System.out.println("Sam sparkade dig i revbenen men missade...");
            }

        int ettrandomInt = rand.nextInt(11); // genererar ett slumptal mellan 0-10
        int tvårandomInt = rand.nextInt(11); // genererar ett slumptal mellan 0-10
       
        System.out.println("Sam är påväg att sparka dig i höften! Kommer du ta eller blocka sparken?");
        
        if(ettrandomInt>=tvårandomInt) // Jämför de två slumpmässigt genererade talen, spelaren med mindre talet förlorar ett hälsopoäng
            {
                System.out.println("Du bröt benet och du blöder ut på makren för att sam sparkade dig!");
               // förlora hälso poäng -1
            }
            else{
                System.out.println("Du fick ont med klarade dig, den här gången...");
               // ingen förlorar hälso poäng
            }
        
        
    }   
    
}
