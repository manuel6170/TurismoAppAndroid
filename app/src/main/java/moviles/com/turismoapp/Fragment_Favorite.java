package moviles.com.turismoapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_Favorite extends Fragment {


    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Le fijamos a este fragment un xml que contenga la informacion que queremos mostrar
        view = inflater.inflate(R.layout.fragment_favorite,container,false);
        return view;
    }
}
