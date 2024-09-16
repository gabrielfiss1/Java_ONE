//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match! ");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.4;
        String sinopse = """
                    Filme de aventura com galã
                    Muito bom!
                    Ano: 
                """ + anoDeLancamento;
        System.out.println(sinopse);

        var nome = "Maria";
        int idade = 30;
        double valor = 55.4;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        String saudacao = "Olá, meu nome é ";
        String continuacao = "e minha idade é ";
        System.out.println(saudacao + nome + continuacao + idade);    }
}