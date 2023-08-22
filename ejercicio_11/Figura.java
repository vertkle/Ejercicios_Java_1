package semana1.Ejercicios.ejercicio_11;

public class Figura {
    private String color;
    private boolean estaLlena;

    public Figura(String color, boolean estaLlena) {
        this.color = color;
        this.estaLlena = estaLlena;
    }

    // Métodos para obtener y establecer campos
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean estaLlena() {
        return estaLlena;
    }

    public void setEstaLlena(boolean estaLlena) {
        this.estaLlena = estaLlena;
    }

    // Métodos para calcular área y perímetro
    public double calcularArea() {
        return 0.0;
    }

    public double calcularPerimetro() {
        return 0.0;
    }
}