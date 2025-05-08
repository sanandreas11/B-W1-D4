public abstract class Dipendente implements CheckIn {
    private String matricola;
    private String dipartimento;

    public Dipendente(String matricola, String dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Metodo astratto da implementare nelle sottoclassi
    public abstract double calculateSalary();

    // Metodo dell'interfaccia CheckInable
    @Override
    public void checkIn() {
        System.out.println("Il dipendente con matricola " + matricola + " ha iniziato il turno.");
    }
}