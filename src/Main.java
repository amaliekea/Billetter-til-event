import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("velkommen til salget af tilletter til Amalie's event!");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Dage til event, Studiebillet:");
        int dageTilEvent = scanner.nextInt();
        int studieId=12345;
        if(dageTilEvent>10) {
            System.out.println("indtast studie id: ");
            studieId = scanner.nextInt();
        }
        System.out.println("BilletID til studiebillet: ");
        int billetId = scanner.nextInt();
        Billet studieBillet = new StudieBillet(billetId, dageTilEvent, studieId);
        studieBillet.getPrice();
        System.out.println(studieBillet);


        System.out.println("ID til dørsalg: ");
        billetId = scanner.nextInt();
        Billet dørBillet = new DørSalg(billetId);
        System.out.println(dørBillet);

        System.out.println("Dage til event, forsalg:");
        dageTilEvent = scanner.nextInt();
        System.out.println("ID til forsalg: ");
        billetId = scanner.nextInt();
        Billet forsalgBillet = new ForSalg(billetId,dageTilEvent);
        forsalgBillet.getPrice();
        System.out.println(forsalgBillet);
        ///////

        SolgteBilletter solgtb = new SolgteBilletter();
        solgtb.addBillet(studieBillet);
        solgtb.addBillet(dørBillet);
        solgtb.addBillet(forsalgBillet);

        solgtb.ticketsSold();
        solgtb.hentAlleStudiekortId();
        System.out.println(solgtb);
        }
    }
