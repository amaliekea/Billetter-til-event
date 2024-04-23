import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("velkommen til salget af tilletter til Amalie's event!");
        Billet studieBillet = new StudieBillet(1249202, 22, 988810);
        studieBillet.getPrice();
        System.out.println(studieBillet);

        Billet dørBillet = new DørSalg(29011);
        System.out.println(dørBillet);

        Billet forsalgBillet = new ForSalg(1919201,2);
        forsalgBillet.getPrice();
        System.out.println(forsalgBillet);


        SolgteBilletter solgtb = new SolgteBilletter();
        solgtb.addBillet(studieBillet); //tilføj til liste af solgte biletter
        solgtb.addBillet(dørBillet);
        solgtb.addBillet(forsalgBillet);

        solgtb.ticketsSold();
        solgtb.hentAlleStudiekortId();
        System.out.println(solgtb);
        }
    }
