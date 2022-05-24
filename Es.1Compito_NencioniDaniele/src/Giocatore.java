public class Giocatore extends Thread {
    private String nome;
    private int punteggioTot = 0;
    private int punteggio = 0;
    private int punteggioBonus = 0;


    public Giocatore(String nome) {
        this.nome = nome;
        this.setName(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPunteggioTot() {
        return this.punteggioTot;
    }

    public void setPunteggioTot(int punteggioTot) {
        this.punteggioTot = punteggioTot;
    }

    public double getPunteggio() {
        return this.punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public double getPunteggioBonus() {
        return this.punteggioBonus;
    }

    public void setPunteggioBonus(int punteggioBonus) {
        this.punteggioBonus = punteggioBonus;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " si è unito alla partita");
        try {
            sleep(1000);
        } catch (Exception e) {}
        punteggioTot += (int)(Math.random()*6 + 1);
        System.out.println(Thread.currentThread().getName() + " ha ottenuto un punteggio di " + punteggioTot + " punti");
        punteggio += (int)(Math.random()*6 + 1);
        System.out.println(Thread.currentThread().getName() + " ha ottenuto un punteggio di " + punteggio + " punti");
        if (punteggioTot == punteggio) {
            System.out.println(Thread.currentThread().getName() + " ha diritto ad un LANCIO BONUS");
            punteggioBonus += (int)(Math.random()*6 + 1);
            System.out.println(Thread.currentThread().getName() + " ha ottenuto un punteggio di " + punteggioBonus + " punti");
        }
        System.out.println(Thread.currentThread().getName() + " ha totalizzato un punteggio di " + (punteggioTot += punteggio += punteggioBonus) + " punti");
    }
}
