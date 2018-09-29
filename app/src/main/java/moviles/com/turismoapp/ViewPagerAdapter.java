package moviles.com.turismoapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    //Creamos una lista que contendra los fragments del TAPLAYOUT
    private final List<Fragment> fragmentList = new ArrayList<>();
    //Creamos una lista para los nombres de los Fragmentos
    private final List<String> fragmentListNombres = new ArrayList<>();


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListNombres.size();
    }
    //Sobreescribimos
    @Override
    public CharSequence getPageTitle(int position){
        return fragmentListNombres.get(position);

    }
    //Cada vez que agregamos un fragment lo añadimos
    //a nuestra lista de fragments y el nombre del fragment tambien lo agregamos

    public void AddFragment(Fragment fragment, String nombre){
        fragmentList.add(fragment);
        fragmentListNombres.add(nombre);
    }

}
