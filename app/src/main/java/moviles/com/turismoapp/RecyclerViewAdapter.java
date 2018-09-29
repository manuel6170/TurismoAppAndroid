package moviles.com.turismoapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context myContext;
    private List<Lugar> listLugares; //creamos una lista que lugares que seran visualizados en la card view

    public RecyclerViewAdapter(MainActivity myContext, List<Lugar> listLugares) {
        this.myContext = myContext;
        this.listLugares = listLugares;
    }

    //Metodo que debemos implementar
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //Vinculamos el XML card_view_item_lugar
        //cada vez que se crea un View Holder toma la forma de la card que diseñamos
        //Usamos Layout Inflater porque accedemos al carpeta Layout=>__.xml
        View view;
        LayoutInflater myInfalter = LayoutInflater.from(myContext);
        view = myInfalter.inflate(R.layout.card_view_item_lugar,viewGroup,false);
        return new MyViewHolder(view);
    }

    //Metodo que debemos implementar
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, final int position) {
        //Fijamos el texto y la imagen en nuetsro viewHolder
        myViewHolder.textView.setText(listLugares.get(position).getNombre());
        myViewHolder.imageView.setImageResource(listLugares.get(position).getThumbnail());

        //Evento click en Imagen
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(myContext,DescriptionActivity.class);
                //Enviamos parametros entre activitys
                intent.putExtra("NOMBRE",listLugares.get(position).getNombre());
                intent.putExtra("THUMBNAIL",listLugares.get(position).getThumbnail());
                intent.putExtra("DESCRIPTION",listLugares.get(position).getDescripcion());
                myContext.startActivity(intent);

            }




        });


    }

    //Metodo que debemos implementar=>Retorna la longitud de la lista lugares
    @Override
    public int getItemCount() {
        return listLugares.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        //Elementos del XML card_view_item
        CardView cardView;
        ImageView imageView;
        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            //Obtenemos una representacion en objeto de los elementos del XML card_view_item
            cardView= (CardView) itemView.findViewById(R.id.cardview_id);
            imageView= (ImageView)itemView.findViewById(R.id.imagecardview_id);
            textView=(TextView)itemView.findViewById(R.id.textcardview_id);

        }
    }
}
