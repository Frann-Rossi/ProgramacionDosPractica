package Models;

import Exceptions.DividirPorCeroException;

public  class OperacionMatematica  {

    public static <T extends Number> double sumar(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> double restar(T num1, T num2){
        return num1.doubleValue() - num2.doubleValue();
    }

    public static <T extends Number> double multiplicar(T num1, T num2){
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number> double dividir(T num1, T num2) throws DividirPorCeroException {
        if(num2.doubleValue() == 0)
        {
            throw new DividirPorCeroException();
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}
