package Model;

import java.util.Objects;
import java.util.Random;

public class Persona {
    private static final char SEXO_DEFECTO = 'H';
    private static final int BAJO_PESO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;

    private  String nombre;
    private Integer edad;
    private final String dni;
    private  Character sexo;
    private Double peso;
    private  Double altura;


    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = String.valueOf(generaDNI());;
        this.sexo = SEXO_DEFECTO;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, Integer edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = String.valueOf(generaDNI());
        this.sexo = comprobarSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = String.valueOf(generaDNI());;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    public int calcularIMC()
    {
        double imc = peso / Math.pow(altura,2);
        int res;
        if(imc < 20)
        {
            res = BAJO_PESO;
        } else if (imc >= 20 && imc <= 25) {
            res = PESO_IDEAL;
        }
        else
        {
            res = SOBREPESO;
        }
        return res;
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    private char comprobarSexo(char sexo)
    {
        if(sexo == 'H' || sexo == 'M')
        {
            return sexo;
        }
        return 'H';
    }

    private long generaDNI()
    {
        Random random = new Random();
        return random.nextInt(90000000) + 10000000;
    }


}
