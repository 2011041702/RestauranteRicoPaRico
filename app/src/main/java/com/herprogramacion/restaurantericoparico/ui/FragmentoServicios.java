package com.herprogramacion.restaurantericoparico.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.herprogramacion.restaurantericoparico.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Fragmento que contiene otros fragmentos anidados para representar las categorías
 * de comidas
 *
 * AQUI SERIA EL FRAGMENTO PRINCIPAL (SERVICIOS) Y LOS TABS FRAGMENTE ANIDADOS PARA CADA TIPO DE SERVICIO
 */
public class FragmentoServicios extends Fragment {

    /**
     * SERVICIOS
     * FRAGMENTE DE CATEGORIAS Q EN RELIADADD SERIAA EL ITEM DE LA NAVEGACION DE SERVICIOS
     * **/
    private AppBarLayout appBarLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public FragmentoServicios() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_paginado, container, false);

        if (savedInstanceState == null) {
            insertarTabs(container);

            // Setear adaptador al viewpager.
            viewPager = (ViewPager) view.findViewById(R.id.pager);
            poblarViewPager(viewPager);

            tabLayout.setupWithViewPager(viewPager);
        }

        return view;
    }

    private void insertarTabs(ViewGroup container) {
        View padre = (View) container.getParent();
        appBarLayout = (AppBarLayout) padre.findViewById(R.id.appbar);

        tabLayout = new TabLayout(getActivity());
        tabLayout.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"));
        appBarLayout.addView(tabLayout);
    }

    private void poblarViewPager(ViewPager viewPager) {
        //LOS SERVICIOS, CADA TAB(PESTAÑA) ES UN TIPO DE SERVICIO
        //CAMBIAR EL NOMBRE FragmentoCategoria por FragmentoServicio
        AdaptadorSecciones adapter = new AdaptadorSecciones(getFragmentManager());
        adapter.addFragment(FragmentoCategoria.nuevaInstancia(0), getString(R.string.titulo_tab_salud));
        adapter.addFragment(FragmentoCategoria.nuevaInstancia(1), getString(R.string.titulo_tab_entretenimiento));
        adapter.addFragment(FragmentoCategoria.nuevaInstancia(2), getString(R.string.titulo_tab_recreacion));
        adapter.addFragment(FragmentoCategoria.nuevaInstancia(3), getString(R.string.titulo_tab_agencias));
        adapter.addFragment(FragmentoCategoria.nuevaInstancia(4), getString(R.string.titulo_tab_otros));
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_categorias, menu);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        appBarLayout.removeView(tabLayout);
    }

    /**
     * Un {@link FragmentStatePagerAdapter} que gestiona las secciones, fragmentos y
     * títulos de las pestañas
     */
    public class AdaptadorSecciones extends FragmentStatePagerAdapter {
        private final List<Fragment> fragmentos = new ArrayList<>();
        private final List<String> titulosFragmentos = new ArrayList<>();

        public AdaptadorSecciones(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentos.get(position);
        }

        @Override
        public int getCount() {
            return fragmentos.size();
        }

        public void addFragment(Fragment fragment, String title) {
            fragmentos.add(fragment);
            titulosFragmentos.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titulosFragmentos.get(position);
        }
    }
}
