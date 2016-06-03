package com.herprogramacion.restaurantericoparico.ui;

import com.herprogramacion.restaurantericoparico.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class Foto {

        private int idImagen;

    private String titulo;
    private String usuario;
    private double latitude;
    private double longitude;


    /*public Foto(String noVisualizaciones, String noLikes, String noComentarios, int idImagen,
                boolean esFavorita, String titulo, String usuario, String tiempoDeExistencia,
                int idAvatarUsuario) {
        this.noVisualizaciones = noVisualizaciones;
        this.noLikes = noLikes;
        this.noComentarios = noComentarios;
        this.idImagen = idImagen;
        this.esFavorita = esFavorita;
        this.titulo = titulo;
        this.usuario = usuario;
        this.tiempoDeExistencia = tiempoDeExistencia;
        this.idAvatarUsuario = idAvatarUsuario;
    }*/
    public Foto(int idImagen, String Titulo, String usuario){
        this.idImagen = idImagen;
        this.titulo = Titulo;
        this.usuario = usuario;
    }

    public static final List<Foto> FOTOS = new ArrayList<>();

    static {

        FOTOS.add(new Foto(R.drawable.citytourtacna_casazela,
                "Casa Zela",
                "Donde murió el prócer de la independencia Francisco Antonio De Zela Y Arizaga, quien un 20 de Junio de 1811 dio el primer grito de libertad en las costas del Perú, 10 años antes de ser proclamada la independencia del Perú. Ésta es una casona típica del siglo XVIII, su fachada principal está hecha en su totalidad de piedra de cantera y grandes patios internos que muestran la elegancia de las familias antiguas que habitaron Tacna."));

        FOTOS.add(new Foto(R.drawable.citytourtacna_casajuridica,
                "Casona Juridica",
                "Abandonamos la histórica morada y continuamos el recorrido subiendo por la calle Zela, haciendo una breve parada en el PASAJE VIGIL, en cuya esquina se encuentra la FAMOSA CASONA JURÍDICA, lugar de célebre significación ya que fue escenario de la firma del Acta de Entrega de Tacna al Perú, el 28 de agosto de 1929. En su interior alberga el Museo de la Reincorporación, la Pinacoteca de Tacna y los archivos históricos departamentales."));

        FOTOS.add(new Foto(R.drawable.citytourtacna_teatromunicipal,
                "Teatro Municipal",
                "Siguiendo el curso de nuestro recorrido llegamos al pasaje Calderón de la Barca, cuyo nombre se le da en recuerdo del primer alcalde constitucional de Tacna, aquí encontramos el TEATRO MUNICIPAL DE TACNA considerado uno de los más bellos de la costa del pacífico en el Siglo XIX . Fue construido en 1870 por el ingeniero español Constantino Martínez del Pino. Es un símbolo de la cultura del pueblo tacneño que no contando entonces con más de 8 mil habitantes, apreciaba las más ricas expresiones del teatro y la ópera de ese tiempo."));

        FOTOS.add(new Foto(R.drawable.citytourtacna_catedral,
                "Catedral",
                "De estilo Neorenacentista que fue diseñada por la firma Francesa de Alejandro Gustave Eiffel, construida también en piedra de cantera extraídas de las laderas del cerro Intiorco, al interior de la catedral encontramos a la virgen del Rosario; Patrona de la Ciudad de Tacna."));

        FOTOS.add(new Foto(R.drawable.citytourtacna_arcoparabolico,
                "Arco Parabolico",
                "A continuación se encuentra el ARCO PARABÓLICO, construido en piedra de cantera que tiene como celosos guardianes y paradigmas de la peruanidad a los héroes de la guerra del Pacífico: El Almirante Miguel Grau y El Coronel Francisco Bolognesi. En la parte delantera del mismo se ubica la llama votiva, que es encendida en ocasiones de conmemoración patriótica."));

        FOTOS.add(new Foto(R.drawable.citytourtacna_pieltaornamental,
                "Pileta Ornamental",
                "Declarada Monumento Histórico, Construida en bronce el siglo pasado y traída desde Bruselas por la fundición Inglesa Simpson fue obsequiada a Tacna por el presidente José Balta; La que por el largo espacio de cien años, constituye un valioso tesoro artístico, no sólo para los habitantes de la ciudad, sino también para los turistas que vienen de otros lugares del país y procedentes de lejanas tierras. La Pila Ornamental tiene 6 mts. de altura, está sobre una base de granito y tiene 4 estatuas que simbolizan las cuatro estaciones del año. Completan el grupo un ancla, un remo, un fardo, cabos de ancla y el timón del bote, símbolos del comercio, la industria y de la navegación."));

        FOTOS.add(new Foto(R.drawable.citytourtacna_alamedabolognesi,
                "Alameda Bolognesi",
                "El circuito continúa por la avenida más pintoresca de Tacna, conocida como ALAMEDA BOLOGNESI, por cuyo centro discurre subterráneamente el Río Caplina. Tiene una extensión de 20 cuadras aproximadamente, al término de las cuales empiezan el Valle Viejo que comprende los distritos de Pocollay, Calana, Pachía y las aguas termales de Calientes. A lo largo de esta Avenida se pueden apreciar centenarias palmeras, hermosas flores y románticas glorietas."));

        FOTOS.add(new Foto(R.drawable.citytourtacna_locomotora,
                "Parque de la Locomotora",
                "Proseguimos hasta el PARQUE DE LA LOCOMOTORA, donde se exhibe la centenaria Locomotora Nº 3; que fue usada para transportar las tropas de los soldados que acudieron en defensa de la peruanidad. Esta locomotora nos abrirá el camino en el recorrido para llegar por la línea férrea al museo Ferroviario de Tacna."));

        FOTOS.add(new Foto(R.drawable.citytourtacna_museoferroviario,
                "Museo Ferroviario",
                "EL MUSEO FERROVIARIO es una Joya única en su género en la costa del pacífico, construido como estación del Ferrocarril Tacna - Arica y así, después de más de un siglo se conserva en buen estado. Más del 90 % de las piezas que conserva son originales. La tornamesa es digna de observarse. En él encontramos varias salas dedicadas a mostrar piezas de otros ferrocarriles del país, incluidas las del Ferrocarril del Centro, el más alto del Perú."));

        FOTOS.add(new Foto(R.drawable.citytourtacna_altodelaalianza,
                "Campo del Alto de la Alianza", "Nos dirigimos a las afueras de la ciudad, donde encontraremos el CAMPO DE ALTO DE LA ALIANZA, ubicado al Nor - oeste del Cerro Intiorko, a una distancia de 8 Km de la ciudad." +
                "        \n" +
                "        \nEste complejo fue erigido en homenaje a los soldados peruanos y bolivianos, que defendieron con sus vidas la integridad territorial el 26 de Mayo de 1880, en la Batalla del Alto de la Alianza."));
    }


    public int getIdImagen() {
        return idImagen;
    }





    public String getTitulo() {
        return titulo;
    }

    public String getUsuario() {
        return usuario;
    }


    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
