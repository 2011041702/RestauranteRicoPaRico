package com.herprogramacion.restaurantericoparico.ui;

import com.herprogramacion.restaurantericoparico.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class FotoTarataTicaco {

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
    public FotoTarataTicaco(int idImagen, String Titulo, String usuario){
        this.idImagen = idImagen;
        this.titulo = Titulo;
        this.usuario = usuario;
    }

    public static final List<FotoTarataTicaco> FOTOS = new ArrayList<>();

    static {

        FOTOS.add(new FotoTarataTicaco(R.drawable.tarataticaco_retenticalaco,
                "Reten de Ticalaco",
                "Se halla ubicado en el sector Yunga del distrito de Tarata, en la provincia de Tarata, se accede al sitio por el camino Inka que una a Tarata con el poblado de Tikako o Ticaco, dicho camino pasa por entre grandes peñas dos  de ellas con existencia de pinturas rupestres pintadas con ocre, contiene dibujos de camélidos en de alerta, estos motivos pertenecientes seguramente al pre cerámico."));

        FOTOS.add(new FotoTarataTicaco(R.drawable.tarataticaco_petroglifosanajiri,
                "Petroglifos de Anajiri",
                "Se encuentra ubicado en la parte superior del puente denominado Puente Palo a 4 Km de Tarata se llega siguiendo el camino de herradura que se inicia a la vera de la carretera que conduce a Tarata. En el recorrido se observan terrazas con petroglifos aislados; encontrándose la mayor concentración al final de la  quebrada en la ladera del cerro, estimándose en más de cien los petroglifos existentes."));

        FOTOS.add(new FotoTarataTicaco(R.drawable.tarataticaco_cerrostamaria,
                "Cerro Santa Maria Museo de Sitio",
                "El sitio se halla ubicado en el sector Yunga del distrito de Tarata, a 3 Km de la capital de la provincia de Tarata tiene una altitud de 3078 m.s.n.m., es un asentamiento con recintos, terrazas y por lo menos un camino intermedio muy bien conservado, pertenece al periodo intermedio tardío y es reconocido asentamiento primigenio de la población prehispánica de Tarata, una característica peculiar de sus muros es la presencia de pequeñas ventanas llamadas “hornacinas”. "));

        FOTOS.add(new FotoTarataTicaco(R.drawable.tarataticaco_putina,
               "Aguas Termales de Putina",
               "se encuentra a unos 250 metro del distrito de Chucatamani está situada a unos metros hacia abajo de la carreta principal que lleva al interior del valle, tiene una altitud 2288 m.s.n.m en el lugar está construido dos pequeños cuartos pre fabricados de madera y al costado esta la posa circular de agua termal que brota por presión del subsuelo formando un “ojo de agua”. "));


        /**FOTOS.add(new FotoValleViejo(R.drawable.citytourtacna_pieltaornamental,
                "Iglesia de Calana",
                "Iglesia de Calana"));

        FOTOS.add(new FotoValleViejo(R.drawable.citytourtacna_alamedabolognesi,
                "Iglesia de Pachia",
                "El circuito continúa por la avenida más pintoresca d" +
                        "e Tacna, conocida como ALAMEDA BOLOGNESI, por cuyo cen" +
                        "tro discurre subterráneamente el Río Caplina. Tiene una exte" +
                        "nsión de 20 cuadras aproximadamente, al término de las cuales e" +
                        "mpiezan el Valle Viejo que comprende los distritos de Pocollay, C" +
                        "alana, Pachía y las aguas termales de Calientes. A lo largo de esta " +
                        "Avenida se pueden apreciar centenarias palmeras, hermosas flores y románticas glorietas."));**/

        FOTOS.add(new FotoTarataTicaco(R.drawable.tarataticaco_iglesiatarata,
                "Iglesia de Tarata",
                "La iglesia de Tarata se distingue por sus dos torres altas, la parroquia o doctrina  de san Benedicto se estableció en 1613. La primera partida se hizo está facha, data del  29 de marzo de 1613." +
                        "Se halla ubicada frente a la plaza principal de la ciudad de Tarata. Fue inaugurada el 03 de enero de 1741 y donde se venera la imagen de San Benito de Abad o San Benedicto"));

        FOTOS.add(new FotoTarataTicaco(R.drawable.tarataticaco_iglesiatarucachi,
                "Iglesia de Tarucachi",
                "La Iglesia data del siglo XIX, fue declarada patrimonio cultural de la Nacion Mediante Resolución Directoral Nacional Nro 18597 tiene una arquitectura clásica con líneas sencillas a la cual se le han añadido algunos ornamentos."));

        /**FOTOS.add(new FotoValleViejo(R.drawable.citytourtacna_altodelaalianza,
                "Puente Colgante de Miculla",
                "Nos dirigimos a las afueras de la ciudad, donde encontraremos " +
                        "el CAMPO DE ALTO DE LA ALIANZA, ubicado al Nor - oeste " +
                        "del Cerro Intiorko, a una distancia de 8 Km de la ciudad." +
                "        \n" +
                "        \nEste complejo fue erigido en homenaje a los soldados peruanos y b" +
                        "olivianos, que defendieron con sus vidas la integridad t" +
                        "erritorial el 26 de Mayo de 1880, en la Batalla del Alto de la Alianza."));**/

        FOTOS.add(new FotoTarataTicaco(R.drawable.tarataticaco_piedramatrimonio,
                "El Matrimonio de Piedra",
                "Cuentan los antepasados que una pareja de enamorados que venían de la parte alta de Tarata, dispuestos a casarse. Puesto que sus padres no aceptaban la relación que existían entre ellos y ese amor tan inmenso que ambos se tenían."));

        FOTOS.add(new FotoTarataTicaco(R.drawable.tarataticaco_mirador,
                "Mirador Apacheta",
                "Mirador Natural, constituye el paso más elevado entre la carretera Tacna – Tarata, se encuentra en una cota a 3.503.115 m.s.n.m, en ella se alza la capilla donde los pobladores veneran a San Martín de Porras, zona de mucho viento y con un espectacular paisaje."));
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
