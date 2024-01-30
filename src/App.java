// Gabriella Jonsson 
// Te22a
import java.util.Random; // impoterar klassen Random som finns i java bibliotek
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner reader = new Scanner(System.in);
        Random rand = new Random(); 
        int hp1 = 10; // hälsopoäng för sam/spelare 1
        int hp2 = 10; // hälsopoäng för spelare 2

        System.out.println("SLÅS MED SAM!" + "\n");

        System.out.print("Välj ett spelnamn för spelare 2: ");
        String usernamne = reader.nextLine();

        System.out.println("Användarman för spelare 1: Sam"); 
        System.out.println("Använarnamn för spelare 2:" + usernamne + "\n");
        
        System.out.println("Vilken Spelare ska slå första slaget? svara 1 eller 2 ");
        int svar = Integer.parseInt(reader.nextLine()); //intparse för att det inte fungerade med string, varför? ingen aning
        System.out.println(svar);
        if(svar == 2) 
        {
            System.out.println("Du slog Sam i ansiktet!");
            hp1--;
        }
        else{
            System.out.println("Sam sparkade dig i revbenen men missade..." + "\n\n");
            hp2--;
        }

        System.out.println("Hälsopoäng:" + hp1);
        System.out.println("Hälsopoäng:" + hp2);

        int ettrandomInt = rand.nextInt(11); // genererar ett slumptal mellan 0-10
        int tvårandomInt = rand.nextInt(11); // genererar ett slumptal mellan 0-10
       
        System.out.println("Sam är påväg att sparka dig i höften! Kommer du ta eller blocka sparken? Tryck Enter för att fortsätta");
        String enter = reader.nextLine();

        if(ettrandomInt>=tvårandomInt) // Jämför de två slumpmässigt genererade talen, spelaren med mindre talet förlorar ett hälsopoäng
        {
            System.out.println("Du bröt benet och du blöder ut på makren för att sam sparkade dig! Oh nej");
            hp2--; // förlora hälso poäng -1
        }
        else{
            System.out.println("Du fick ont med klarade dig, den här gången..." + "\n\n");
            // ingen förlorar hälso poäng
        }
        System.out.println("Hälsopoäng:" + hp1);
        System.out.println("Hälsopoäng:" + hp2 + "\n\n");

        System.out.println(" Tryck Enter för att fortsätta");
        String Enter = reader.nextLine();
            

        System.out.println("Du slår sam i ansiktet trots dina skador...Tryck Enter för att fortsätta");
        String eNter = reader.nextLine();

        if(ettrandomInt<=tvårandomInt) // Jämför de två slumpmässigt genererade talen, spelaren med mindre talet förlorar ett hälsopoäng
            {
                System.out.println(" Sam blockade och clincha");
                hp2--; // spelare 2 förlora hälsopoäng -1
            }
            else{
                System.out.println("Du fick ont med klarade dig, den här gången..." + "\n\n");
                hp1--;// sam förlorar hälso poäng
            }
        System.out.println("Hälsopoäng:" + hp1);
        System.out.println("Hälsopoäng:" + hp2);
        
    }   
    
}
