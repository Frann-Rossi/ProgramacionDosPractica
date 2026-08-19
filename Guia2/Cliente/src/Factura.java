import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private String id;
    private double montoTotal;
    private LocalDateTime fechaHora;

    public Factura(double montoTotal) {
        this.id = UUID.randomUUID().toString();
        this.montoTotal = montoTotal;
        this.fechaHora = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id='" + id + '\'' +
                ", montoTotal=" + montoTotal +
                ", fechaHora=" + fechaHora +
                '}';
    }
}
