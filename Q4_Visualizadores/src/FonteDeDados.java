import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private ArrayList<Observer> observadores;
    public FonteDeDados(){
        lst = new LinkedList<>();
        observadores=new ArrayList<>();
    }
    public void registraObservador(Observer obs){
        observadores.add(obs);
    }
    public void notificaObs(){
        for(Observer observador:observadores){
            observador.update(lst);
        }
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notificaObs();
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}