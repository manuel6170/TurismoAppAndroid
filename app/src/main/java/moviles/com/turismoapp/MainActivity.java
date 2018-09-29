package moviles.com.turismoapp;

import android.arch.lifecycle.ViewModelProvider;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Nestros atributos corresponden a los elementos que tenemos en el XML
    private TabLayout tabLayout;
    //private AppBarLayout appBarLayout;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtenemos una representacion en objeto de nuestros elementos del xml
        tabLayout = (TabLayout)findViewById(R.id.tabLayout_id);
        //appBarLayout = (AppBarLayout)findViewById(R.id.appbar_id);
        viewPager = (ViewPager)findViewById(R.id.viewPager_id);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Agregamos los fragmentos
        viewPagerAdapter.AddFragment(new Fragment_Home_List(),"HOME");
        viewPagerAdapter.AddFragment(new Fragment_Favorite(),"FAVORITE");
        //

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
