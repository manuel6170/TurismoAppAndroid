package moviles.com.turismoapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Home_List extends Fragment {

    List<Lugar> listLugares;
    DataLugar dataLugar;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    View view;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Le fijamos a este fragment un xml que contenga la informacion que queremos mostrar
        view = inflater.inflate(R.layout.fragment_home_list,container,false);

        //Llenamos nuestra lista con Lugares
        dataLugar = new DataLugar();
        recyclerView= (RecyclerView) view.findViewById(R.id.recyclerview_id);
        recyclerViewAdapter = new RecyclerViewAdapter((MainActivity) getContext(),dataLugar.listLugares);

        //Definimos la grilla
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }
}
