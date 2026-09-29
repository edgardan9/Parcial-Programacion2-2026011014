public class Main {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor(
                "Edgard",
                1000,
                new ComisionEstandar()
        );

        vendedor.mostrarDetalle();

    }

}
