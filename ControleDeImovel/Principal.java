import imovel.*;

public class Principal {
    public static void main(String[] args) {
    CarteiraLocacao cart = new CarteiraLocacao();

    Imovel res1 = new Residencial("123.456.789-0", "local", "Av. Uruguai, 51, Lavras-MG", 900.00, 0.1);
    Imovel res2 = new Residencial("987.654.321-0", "regional", "Av. Argentina, 71, Ijaci-MG", 1300.00, 0.1);
    Imovel com1 = new Comercial("99.888.777/0001-66", 60, "Rua Curitiba, 20, Lavras-MG", 5000.00, 0.08);
    Imovel com2 = new Comercial("11.222.333/0001-44", 120, "Rua Alagoas, 5, Lavras-MG", 6500.00, 0.08);
   
    cart.cadastrarImovel(res1);
    cart.cadastrarImovel(res2);
    cart.cadastrarImovel(com1);
    cart.cadastrarImovel(com2);
   
    cart.imprimirCarteira();
    
    }
}