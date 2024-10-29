public class A {
    private int A1;
    private float A2;

    // Construtor
    public A(int A1, float A2) {
        this.A1 = A1;
        this.A2 = A2;
    }

    // Getters
    public int getA1() {
        return A1;
    }

    public float getA2() {
        return A2;
    }

    // Setters
    public void setA1(int A1) {
        this.A1 = A1;
    }

    public void setA2(float A2) {
        this.A2 = A2;
    }

    // Métodos
    public void MA1() {
        System.out.println("Método MA1 chamado");
    }

    public void MA2() {
        System.out.println("Método MA2 chamado");
    }

    public void MA3() {
        System.out.println("Alteração a classe A partir do clone");
    }

    public int getSoma(int a, int b) {
        return a + b;
    }
}