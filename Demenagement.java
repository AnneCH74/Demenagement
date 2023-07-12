public class Demenagement {
    int nombreDeCartons;
    int nombreCartonsParVoyageur;
    int capaciteVoyage;

    public Demenagement() {
        this.nombreDeCartons = 34;
        this.nombreCartonsParVoyageur = 9;
    }

    public void demenager () {
        while (this.nombreDeCartons>0) {
            this.capaciteVoyage = this.nombreCartonsParVoyageur;
            if (this.nombreDeCartons<9) {
                this.capaciteVoyage = this.nombreDeCartons;
            }
            this.nombreDeCartons -= this.capaciteVoyage;
            System.out.println("Un voyage de " + this.capaciteVoyage+ "cartons");
        }
    }
}
