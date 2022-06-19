public class Compra {

    private float valorNota;

    public float getNota() {
        return valorNota;
    }

    public void somarNota(float valorNota1, float valorNota2) {
        Calculadora calculadora = new Calculadora(valorNota1, valorNota2);
        this.valorNota = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairNota(float valorNota1, float valorNota2) {
        Calculadora calculadora = new Calculadora(valorNota1, valorNota2);
        this.valorNota = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirNota(float valorNota1, float valorNota2) {
        Calculadora calculadora = new Calculadora(valorNota1, valorNota2);
        this.valorNota = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarNota(float valorNota1, float valorNota2) {
        Calculadora calculadora = new Calculadora(valorNota1, valorNota2);
        this.valorNota = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaNotas(float valorNota1, float valorNota2) {
        Calculadora calculadora = new Calculadora(valorNota1, valorNota2);
        this.valorNota = calculadora.calcular(new OperacaoMedia());
    }

}
