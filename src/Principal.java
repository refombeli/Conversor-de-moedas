import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("\n----------Conversor de Moedas----------");
        System.out.println("""
                        1: Real ==> Dólar
                        2: Dólar ==> Real
                        3: Real ==> Pesos Argentinos
                        4: Pesos Argentinos ==> Real
                        5: Real ==> Dirham Marroquino
                        6: Dirham Marroquino ==> Real
                        7: Real ==> Euro
                        8: Euro ==> Real
                        9: Sair
                        """);
        System.out.println("Digite a opção desejada: ");
        int opcao = leitura.nextInt();

        ConversorMoedas conversorMoedas = new ConversorMoedas();

        if (opcao <1 || opcao > 9) {
            System.out.println("Opção Inválida, escolha novamente!");
            return;
        }

        switch (opcao) {
            case 1: {
                String moedaBase = "BRL";
                String moedaDestino = "USD";

                System.out.println("Digite o Valor em REAL que deseja converter em DÓLAR: ");
                double valor = leitura.nextDouble();

                ValorMoedas resultado = conversorMoedas.converter(moedaBase, moedaDestino, valor);
                System.out.println(resultado);
                break;
            }
            case 2: {
                String moedaBase = "USD";
                String moedaDestino = "BRL";

                System.out.println("Digite o Valor em DÓLAR que deseja converter em REAL: ");
                double valor = leitura.nextDouble();

                ValorMoedas resultado = conversorMoedas.converter(moedaBase, moedaDestino, valor);
                System.out.println(resultado);
                break;
            }
            case 3: {
                String moedaBase = "BRL";
                String moedaDestino = "ARS";

                System.out.println("Digite o Valor em REAL que deseja converter em PESOS: ");
                double valor = leitura.nextDouble();

                ValorMoedas resultado = conversorMoedas.converter(moedaBase, moedaDestino, valor);
                System.out.println(resultado);
                break;
            }
            case 4: {
                String moedaBase = "ARS";
                String moedaDestino = "BRL";

                System.out.println("Digite o Valor em PESOS que deseja converter em REAL: ");
                double valor = leitura.nextDouble();

                ValorMoedas resultado = conversorMoedas.converter(moedaBase, moedaDestino, valor);
                System.out.println(resultado);
                break;
            }
            case 5: {
                String moedaBase = "BRL";
                String moedaDestino = "MAD";

                System.out.println("Digite o Valor em REAL que deseja converter em DIRHAM MARROQUINO: ");
                double valor = leitura.nextDouble();

                ValorMoedas resultado = conversorMoedas.converter(moedaBase, moedaDestino, valor);
                System.out.println(resultado);
                break;
            }
            case 6: {
                String moedaBase = "MAD";
                String moedaDestino = "BRL";

                System.out.println("Digite o Valor em DIRHAM MARROQUINO que deseja converter em REAL: ");
                double valor = leitura.nextDouble();

                ValorMoedas resultado = conversorMoedas.converter(moedaBase, moedaDestino, valor);
                System.out.println(resultado);
                break;
            }
            case 7: {
                String moedaBase = "BRL";
                String moedaDestino = "EUR";

                System.out.println("Digite o Valor em REAL que deseja converter em EURO: ");
                double valor = leitura.nextDouble();

                ValorMoedas resultado = conversorMoedas.converter(moedaBase, moedaDestino, valor);
                System.out.println(resultado);
                break;
            }
            case 8: {
                String moedaBase = "EUR";
                String moedaDestino = "BRL";

                System.out.println("Digite o Valor em EURO que deseja converter em REAL: ");
                double valor = leitura.nextDouble();

                ValorMoedas resultado = conversorMoedas.converter(moedaBase, moedaDestino, valor);
                System.out.println(resultado);
                break;
            }
            case 9: {
                System.out.println("Seu programa foi finalizado!!  ");
                break;
            }
        }
    }
}
