public class PR431Objecte {
    private static PR431Objecte instance;
    private String nom;
    private String cognom;
    private int edat;


    private PR431Objecte(String nom, String cognom, int edat) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public static PR431Objecte getInstance(String nom, String cognom, int edat) {
        if (instance == null) {
            instance = new PR431Objecte(nom, cognom, edat);
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