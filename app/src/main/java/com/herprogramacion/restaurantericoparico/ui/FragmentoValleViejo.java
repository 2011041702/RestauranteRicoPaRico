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
 * Fragmento para la pestaña "DIRECCIONES" De la sección "Mi Cuenta"
 */
public class FragmentoValleViejo extends Fragment implements AdaptadorFotosValleViejo.EscuchaEventosClick{

    public static final String EXTRA_POSICIONv = "com.herprogramacion.restaurantericoparico.extra.POSICION";


    private RecyclerView reciclador;
    private LinearLayoutManager layoutManager;
    //private AdaptadorInicio adaptador;

    public FragmentoValleViejo() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.actividad_valleviejo, container, false);

        reciclador = (RecyclerView) view.findViewById(R.id.recicladorv);
        layoutManager = new LinearLayoutManager(getActivity());
        reciclador.setLayoutManager(layoutManager);

        AdaptadorFotosValleViejo adaptador = new AdaptadorFotosValleViejo(this);
        reciclador.setAdapter(adaptador);
        return view;
    }


    @Override
    public void onItemClick(AdaptadorFotosValleViejo.ViewHolder holder, int posicion) {
        Intent intent = new Intent(getActivity(), ActividadDetalleValleViejo.class);
        intent.putExtra(EXTRA_POSICIONv, posicion);
        startActivity(intent);
    }
}
