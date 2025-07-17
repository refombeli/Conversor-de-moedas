public record ValorMoedas(String moedaBase, String moedaDestino, double valor) {

    @Override
    public String toString() {
        return "valor convertido: " +valor+ " de " + moedaBase + " para " +moedaDestino;
    }
}
