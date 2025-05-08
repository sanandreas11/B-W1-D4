class DipendenteFullTime extends Dipendente {
    private double stipendioMensile;

    public DipendenteFullTime(String matricola, String dipartimento, double stipendioMensile) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }
}