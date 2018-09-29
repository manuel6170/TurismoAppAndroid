package moviles.com.turismoapp;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DescriptionActivity extends AppCompatActivity {

    private TextView textViewdescription ;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private ImageView imageView,icon_star;
    private boolean bandera;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        textViewdescription = (TextView)findViewById(R.id.textdescription_id);
        collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsingtoolbar_id);
        icon_star= (ImageView)findViewById(R.id.iconstart_id);
        button= (Button)findViewById(R.id.button_id);
        bandera=true;

        //RECUPERAMOS LOS DATOS ENVIADOS
        final Intent[] intent = {getIntent()};
        String nombre = intent[0].getExtras().getString("NOMBRE");
        int thumbnail = intent[0].getExtras().getInt("THUMBNAIL");
        int description = intent[0].getExtras().getInt("DESCRIPTION");
        //Fijamos los valores
        textViewdescription.setText(description);

        collapsingToolbarLayout.setTitle(nombre);
        collapsingToolbarLayout.setBackgroundResource(thumbnail);
        icon_star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bandera==true){
                    icon_star.setImageResource(R.drawable.iconstart);
                    Toast.makeText(getApplicationContext(),"Añadido a Favoritos",Toast.LENGTH_SHORT).show();

                    bandera=false;
                }else{
                    icon_star.setImageResource(R.drawable.ic_star_black_24dp);
                    Toast.makeText(getApplicationContext(),"Eliminado de Favoritos",Toast.LENGTH_SHORT).show();
                    bandera=true;
                }
                }

        });
        //Fijamos el evento de enviarnos a googleMaps con la direccion del lugar
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[0] = new Intent(Intent.ACTION_VIEW);
                intent[0].setData(Uri.parse("geo:0,0?z=4&q=parque+caldas+popayan"));
                startActivity(intent[0]);
                return;
            }
        });


    }
}
