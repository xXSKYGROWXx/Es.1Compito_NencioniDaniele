public class App {
    public static void main(String[] args) throws Exception {
        Giocatore t1 = new Giocatore("CiccioGamer");
        Giocatore t2 = new Giocatore("Rocco");

        System.out.println("Inizio della partita: in attesa dei 2 giocatori.");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        if (t1.getPunteggioTot() > t2.getPunteggioTot()) {
            System.out.println(t1.getName() + " ha vinto.");
        }
        if (t1.getPunteggioTot() < t2.getPunteggioTot()) {
            System.out.println(t2.getName() + " ha vinto.");
        }
        if (t1.getPunteggioTot() == t2.getPunteggioTot()) {
            System.out.println("Partita patta.");
        }
    }
}
