package com.herprogramacion.restaurantericoparico.ui;

import com.herprogramacion.restaurantericoparico.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class FotoValleViejo {

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
    public FotoValleViejo(int idImagen, String Titulo, String usuario){
        this.idImagen = idImagen;
        this.titulo = Titulo;
        this.usuario = usuario;
    }

    public static final List<FotoValleViejo> FOTOS = new ArrayList<>();

    static {

        FOTOS.add(new FotoValleViejo(R.drawable.valleviejo_iglesiamercedespocollay,
                "Iglesia de las Mercedes",
                "la Iglesia Virgen de Las Mercedes patrona del distrito de Pocollay" +
                        " la cual mediante decreto episcopal de fecha 6 de junio de 1968 " +
                        "el Obispo de Tacna y Moquegua Monseñor Alfonso Zaplana Belliza designa " +
                        "como patrona de Pocollay a Nuestra Señora de las Mercedes ."));

        FOTOS.add(new FotoValleViejo(R.drawable.valleviejo_plazapocollay,
                "Plaza Pocollay",
                "Llamada Francisco Antonio de Zela, la cual fue delineada el " +
                        "25 de Noviembre de 1858. La fundación de este distrito fue impulsada " +
                        "por Don Manuel Flores Calvo quien concibió el proyecto de la fundación del pueblo " +
                        "y lo llevó a cabo, edificando una capilla y dos casas para escuelas."));

        FOTOS.add(new FotoValleViejo(R.drawable.valleviejo_museopeanas,
                "Museo de Sitio Las Peañas",
                "El área donde se encuentra fue excavada entre los años 1981-1982 rescatando 56 tumbas, las cuales son tipificadas como fosas y cistas. Su filiación cultural corresponde al periodo de los desarrollos regionales tardíos (1000-1445 A.D.C.) y época inca, algunos objetos o materiales culturales datan de principios de la colonia. Y pertenecen a los antiguos pobladores del Valle Viejo"));

        //FOTOS.add(new FotoValleViejo(R.drawable.citytourtacna_catedral,
        //        "Campiña de Pocollay",
        //        "De estilo Neorenacentista que fue diseñada por la firma Francesa de Alejandro Gustave Eiffel, construida también en piedra de cantera extraídas de las laderas del cerro Intiorco, al interior de la catedral encontramos a la virgen del Rosario; Patrona de la Ciudad de Tacna."));


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

        FOTOS.add(new FotoValleViejo(R.drawable.valleviejo_museomiculla,
                "Complejo Arqueologico de Miculla",
                "La carretera principal nos conduce hacia el punto más amplio de parada, el Complejo Arqueológico de Miculla uno de los complejos arqueológicos más extensos  de arte rupestre en los andes de Sud América. Se calcula aproximadamente un número de 1,500 petroglifos distribuidos en un área protegida de 22.054km²."));

        FOTOS.add(new FotoValleViejo(R.drawable.valleviejo_petroglifos,
                "Petroglifos de Miculla",
                "El campo de petroglifos de Miculla, tiene un área aproximada de 20 kms cuadrados. Se ubican en la zona de la quebrada seca de Palca, que llega desde la cordillera para abrirse en dirección a los cálidos parajes ribereños del río Kaplina y del imponente cerro Wawapas, que domina Mikulla."));

        /**FOTOS.add(new FotoValleViejo(R.drawable.citytourtacna_altodelaalianza,
                "Puente Colgante de Miculla",
                "Nos dirigimos a las afueras de la ciudad, donde encontraremos " +
                        "el CAMPO DE ALTO DE LA ALIANZA, ubicado al Nor - oeste " +
                        "del Cerro Intiorko, a una distancia de 8 Km de la ciudad." +
                "        \n" +
                "        \nEste complejo fue erigido en homenaje a los soldados peruanos y b" +
                        "olivianos, que defendieron con sus vidas la integridad t" +
                        "erritorial el 26 de Mayo de 1880, en la Batalla del Alto de la Alianza."));**/

        FOTOS.add(new FotoValleViejo(R.drawable.valleviejo_banostermales,
                "Baños Termomedicinales Calientes",
                "BAÑOS TERMO MEDICINALES DE CALIENTES, conocidas por sus propiedades curativas, cuya temperatura oscila entre 36º y 40º, recomendadas para enfermedades artríticas y de la piel."));
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
