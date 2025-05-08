class Dirigente extends Dipendente {
    private double stipendioFisso;
    private double bonus;

    public Dirigente(String matricola, String dipartimento, double stipendioFisso, double bonus) {
        super(matricola, dipartimento);
        this.stipendioFisso = stipendioFisso;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return stipendioFisso + bonus;
    }
}
