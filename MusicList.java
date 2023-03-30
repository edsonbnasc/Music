import java.util.ArrayList;
public class MusicList {

    public static void main(String[] args) {
       ArrayList <String> listaParaIlhaDeserta = new ArrayList<>();
       listaParaIlhaDeserta.add("Dr Dre");
       listaParaIlhaDeserta.add("Eminem");
       listaParaIlhaDeserta.add("50cent");
       listaParaIlhaDeserta.add("Busta");
       listaParaIlhaDeserta.add("Geracao");
       listaParaIlhaDeserta.add("Chama");
       listaParaIlhaDeserta.add("Oh ele");
       System.out.println(listaParaIlhaDeserta);
       //System.out.println(listaParaIlhaDeserta.size());
    
        if(listaParaIlhaDeserta.size()>5){
        for (int i=0;listaParaIlhaDeserta.size()>=6;i++){
        listaParaIlhaDeserta.remove(i);
        //System.out.println("Tamanho da lista maior que 5");
        
        if (listaParaIlhaDeserta.size()==5){
                System.out.println("Tamanho da lista atualizado "+listaParaIlhaDeserta.size());
                
            }
           
            
        }
       }
        //mudar a ordem da lista 
            int a = 1;
            int b = 0;
            System.out.println(listaParaIlhaDeserta);//imprime a lista 
            String temporaria = listaParaIlhaDeserta.get(a);
            listaParaIlhaDeserta.set(a,listaParaIlhaDeserta.get(b));
            listaParaIlhaDeserta.set(b,temporaria);
            System.out.println(listaParaIlhaDeserta);


    }     
    }
    
