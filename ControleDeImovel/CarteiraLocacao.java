import java.util.*;
import imovel.*;

public class CarteiraLocacao{
    
    private ArrayList<Imovel> imoveis;

    public CarteiraLocacao(){
        imoveis = new ArrayList<Imovel>();
    }

    public void cadastrarImovel(Imovel imovel){
        imoveis.add(imovel);
    }

    public void imprimirCarteira(){
        for(Imovel i: imoveis){
            System.out.println(i.toString());
        }
    }
}
