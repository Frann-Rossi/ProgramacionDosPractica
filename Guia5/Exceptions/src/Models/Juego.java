package Models;

import Exceptions.ValorInvalidoException;

public class Juego {
    private int num;

    public Juego() {
        this.num = numeroRandom();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public int numeroRandom()
    {
        return (int) (Math.random() * 500)+ 1 ;
    }

    public String validadNumero(int intento)
    {
        StringBuilder sb = new StringBuilder();
        if(intento < 1 || intento > 500)
        {
            sb.append("Fuera de rango\n");
        }
        return sb.toString();
    }

    public String compararNumero(int intento)
    {
        StringBuilder sb = new StringBuilder();
        if(intento < num){
            sb.append("El número a adivinar es mayor el numero era:").append(num);
        } else if (intento > num) {
            sb.append("El número a adivinar es menor el numero era:").append(num);
        }else {
            sb.append("¡Adivinaste! el numero era:").append(num);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Juego{" +
                "num=" + num +
                '}';
    }
}
