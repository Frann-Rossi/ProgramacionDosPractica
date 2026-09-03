package Modal;

import Interface.ICompetible;

public class FutbolistaAmateur extends Futbolista implements ICompetible {
    private String competencia;
    private int ranking;

    public FutbolistaAmateur(String nombre, String competencia, int ranking) {
        super(nombre);
        this.competencia = competencia;
        this.ranking = ranking;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "FutbolistaAmateur{" +
                "competencia='" + competencia + '\'' +
                ", ranking=" + ranking +
                "} " + super.toString();
    }

    @Override
    public String competir(String resultado) {
        return "El futbolista Amateur " + getNombre()
                + ". Su resultado en la competencia fue: " + resultado;
    }
}
