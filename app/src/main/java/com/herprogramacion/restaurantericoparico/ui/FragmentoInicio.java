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
 * Fragmento para la sección de "Inicio"
 */
public class FragmentoInicio extends Fragment implements AdaptadorFotosCityTourTacna.EscuchaEventosClick{

    public static final String EXTRA_POSICION = "com.herprogramacion.restaurantericoparico.extra.POSICION";


    private RecyclerView reciclador;
    private LinearLayoutManager layoutManager;
    private AdaptadorInicio adaptador;

    public FragmentoInicio() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.actividad_principal2, container, false);

        reciclador = (RecyclerView) view.findViewById(R.id.reciclador);
        layoutManager = new LinearLayoutManager(getActivity());
        reciclador.setLayoutManager(layoutManager);

        AdaptadorFotosCityTourTacna adaptador = new AdaptadorFotosCityTourTacna(this);
        reciclador.setAdapter(adaptador);
        return view;
    }

    @Override
    public void onItemClick(AdaptadorFotosCityTourTacna.ViewHolder holder, int posicion) {
        Intent intent = new Intent(getActivity(), ActividadDetalle.class);
        intent.putExtra(EXTRA_POSICION, posicion);
        startActivity(intent);
    }
}
