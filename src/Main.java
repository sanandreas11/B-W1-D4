// Main
public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[4];

        dipendenti[0] = new DipendenteFullTime("001", "PRODUZIONE", 2500.00);
        dipendenti[1] = new DipendentePartTime("002", "VENDITE", 20.00, 80); // 20€/h * 80h
        dipendenti[2] = new Dirigente("003", "AMMINISTRAZIONE", 3000.00, 1000.00);
        dipendenti[3] = new DipendenteFullTime("004", "PRODUZIONE", 2600.00);

        double totaleStipendi = 0;
        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola() + ", Stipendio: " + d.calculateSalary());
            totaleStipendi += d.calculateSalary();
        }

        System.out.println("Totale stipendi: " + totaleStipendi);
    }
}