package Enums;

public enum ENivelExperiencia {
    JUNIOR(1), SEMISENIOR(1.5), SENIOR(2);

    private double multiplicadorSalario;

    ENivelExperiencia(double multiplicadorSalario) {
        this.multiplicadorSalario = multiplicadorSalario;
    }

    public double getMultiplicadorSalario() {
        return multiplicadorSalario;
    }
}
