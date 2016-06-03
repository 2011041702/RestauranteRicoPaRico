package com.herprogramacion.restaurantericoparico.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.herprogramacion.restaurantericoparico.R;

/**
 * Adaptador de fotos para el recycler view
 */
public class AdaptadorFotosTarataTicaco extends RecyclerView.Adapter<AdaptadorFotosTarataTicaco.ViewHolder> {

    interface EscuchaEventosClick {
        void onItemClick(ViewHolder holder, int posicion);
    }

    private EscuchaEventosClick escucha;

    public class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        // Campos respectivos de un item
        public ImageView avatar;
        public TextView titulo;
        public ImageView imagen;
        public TextView noVisualizaciones;
        public TextView noLikes;
        public ImageView iconoFavorito;
        public TextView noComentarios;

        public ViewHolder(View v) {
            super(v);

            //avatar = (ImageView) v.findViewById(R.id.avatar);
            titulo = (TextView) v.findViewById(R.id.titulo_imagen);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            //noVisualizaciones = (TextView) v.findViewById(R.id.noVisualizaciones);
            noLikes = (TextView) v.findViewById(R.id.noLikes);
            //iconoFavorito = (ImageView) v.findViewById(R.id.iconoFavorito);
            noComentarios = (TextView) v.findViewById(R.id.noComentarios);

            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            escucha.onItemClick(this, getAdapterPosition());
        }
    }

    public AdaptadorFotosTarataTicaco(EscuchaEventosClick escucha) {
        this.escucha = escucha;
    }

    @Override
    public int getItemCount() {
        return FotoTarataTicaco.FOTOS.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_galeria_fotos, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        FotoTarataTicaco itemActual = FotoTarataTicaco.FOTOS.get(i);

        //Glide.with(viewHolder.avatar.getContext())
        //        .load(itemActual.getIdAvatarUsuario())
        //        .into(viewHolder.avatar);
        viewHolder.titulo.setText(itemActual.getTitulo());

        //viewHolder.noVisualizaciones.setText(itemActual.getNoVisualizaciones());

        Glide.with(viewHolder.imagen.getContext())
                .load(itemActual.getIdImagen())
                .into(viewHolder.imagen);
        //viewHolder.noVisualizaciones.setText(itemActual.getNoVisualizaciones());
        //viewHolder.noLikes.setText(String.valueOf(itemActual.getNoLikes()));

        //int drawableFavorito = itemActual.esFavorita() ? R.drawable.favorito : R.drawable.no_favorito;
        //viewHolder.iconoFavorito.setImageResource(drawableFavorito);

        //viewHolder.noComentarios.setText(itemActual.getNoComentarios());
    }
}
