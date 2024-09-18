package fogão;

public class Fogao {
    private int numeroDeBocas;
    private String tipo;
    private String marca;

    Fogao() {
        numeroDeBocas = 4;
        tipo = "Gás";
        marca = "Brastemp";
    }

    Fogao(int n, String t, String m) {
        numeroDeBocas = n;
        tipo = t;
        marca = m;
    }

    public int getNumeroDeBocas() {
        return numeroDeBocas;
    }

    public void setNumeroDeBocas(int n) {
        this.numeroDeBocas = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static void main(String[] args) {
        Fogao fogao1 = new Fogao();
        System.out.println("O fogão é da marca " + fogao1.getMarca());
        System.out.println("Número de bocas: " + fogao1.getNumeroDeBocas());
    }
}
