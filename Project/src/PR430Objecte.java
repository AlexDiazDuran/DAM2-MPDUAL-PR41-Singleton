public class PR430Objecte {
    private String nom;
    private String cognom;
    private int edat;
    private static PR430Objecte instance;

    private PR430Objecte(String nom, String cognom, int edat) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public static PR430Objecte getInstance(String nom, String cognom, int edat) {
        if (instance == null){
            instance = new PR430Objecte(nom,cognom, edat);
        }
        return instance;
    }

    public void setDades(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Cognom: " + cognom + ", Edat: " + edat;
    }
}