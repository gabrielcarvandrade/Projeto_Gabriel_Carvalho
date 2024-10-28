public class B {
    private int B1;
    private float B2;

    // Construtor
    public B(int B1, float B2) {
        this.B1 = B1;
        this.B2 = B2;
    }

    // Getters
    public int getB1() {
        return B1;
    }

    public float getB2() {
        return B2;
    }

    // Setters
    public void setB1(int B1) {
        this.B1 = B1;
    }

    public void setB2(float B2) {
        this.B2 = B2;
    }

    // Métodos
    public void MB1() {
        System.out.println("Método MB1 chamado");
    }

    public void MB2() {
        System.out.println("Método MB2 chamado");
    }
}