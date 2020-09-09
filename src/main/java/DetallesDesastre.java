import java.util.*;
public class DetallesDesastre {
    int personas [];

public void detallesDesastre(){
    Date incidenteDate = new Date();
    System.out.println(incidenteDate);
}

    static  void listaDesaparecidos(Personas[] array){
        for (int i = 0; i < array.length; i++)
            System.out.println((i+1) + ". " + array[i].firstName + array[i].lastName );
    }
}
