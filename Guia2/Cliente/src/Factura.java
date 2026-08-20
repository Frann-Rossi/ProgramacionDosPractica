import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID id;
    private double montoTotal;
    private LocalDateTime fechaHora;
    private  Cliente cliente;

    public Factura(double montoTotal,Cliente cliente) {
        this.id = UUID.randomUUID();
        this.montoTotal = montoTotal;
        this.fechaHora = LocalDateTime.now();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public UUID getId() {
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
                "id=" + id +
                ", montoTotal=" + montoTotal +
                ", fechaHora=" + fechaHora +
                ", cliente=" + cliente +
                '}';
    }

    public double descuneto ()
    {
        return  montoTotal - (montoTotal * cliente.getDescuento() / 100);
    }
}
