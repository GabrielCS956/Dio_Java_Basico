public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Gabriel";
        String segundoNome = "Sampaio";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String SegundoNome) {
        return primeiroNome.concat(" ").concat(SegundoNome);
    }

}