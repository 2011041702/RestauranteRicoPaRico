package com.herprogramacion.restaurantericoparico.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.herprogramacion.restaurantericoparico.R;

/**
 * Fragmento para la pestaña "TARJETAS" de la sección "Mi Cuenta"
 */
public class FragmentoTarataTicaco extends Fragment implements AdaptadorFotosTarataTicaco.EscuchaEventosClick{
    public static final String EXTRA_POSICIONv = "com.herprogramacion.restaurantericoparico.extra.POSICION";


    private RecyclerView reciclador;
    private LinearLayoutManager layoutManager;
    public FragmentoTarataTicaco() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.actividad_tarataticaco, container, false);

        reciclador = (RecyclerView) view.findViewById(R.id.recicladorv);
        layoutManager = new LinearLayoutManager(getActivity());
        reciclador.setLayoutManager(layoutManager);

        AdaptadorFotosTarataTicaco adaptador = new AdaptadorFotosTarataTicaco(this);
        reciclador.setAdapter(adaptador);
        return view;
    }


    @Override
    public void onItemClick(AdaptadorFotosTarataTicaco.ViewHolder holder, int posicion) {
        Intent intent = new Intent(getActivity(), ActividadDetalleTarataTicaco.class);
        intent.putExtra(EXTRA_POSICIONv, posicion);
        startActivity(intent);
    }
}
