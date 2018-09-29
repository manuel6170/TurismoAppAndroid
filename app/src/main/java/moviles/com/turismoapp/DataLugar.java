package moviles.com.turismoapp;

import java.util.ArrayList;
import java.util.List;

public class DataLugar {
    List<Lugar> listLugares;

    public DataLugar(){
        listLugares = new ArrayList<>();
        listLugares.add(new Lugar("Parque Caldas",R.string.descriptionparquecaldas,R.drawable.parquecaldas,true));

        listLugares.add(new Lugar("Puente del Humilladero",R.string.descriptionparquecaldas,R.drawable.parquecaldas,true));

        listLugares.add(new Lugar("Morro",R.string.descriptionparquecaldas,R.drawable.parquecaldas,true));

        listLugares.add(new Lugar("Catedral",R.string.descriptionparquecaldas,R.drawable.parquecaldas,true));

    }

    public List<Lugar> getListLugares() {
        return listLugares;
    }

    public void setListLugares(List<Lugar> listLugares) {
        this.listLugares = listLugares;
    }

    public int getSize(){
        return listLugares.size();
    }
}
