public class CuentaBancaria {
    private static int contador = 0;
    private int id;
    private String nombre;
    private double balance;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombre, double balance) {
        this.id = contador;
        contador++;
        this.nombre = nombre;
        this.balance = balance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean credito(double deposit) {
        if (deposit >= 0) {
            balance += deposit;
            return true;
        }
        return false;
    }

    public boolean debit(double extraction) {
        if (extraction >= 0 && balance >= extraction) {
            balance -= extraction;
            return true;
        }
        return false;
    }


}
