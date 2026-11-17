public class TestPelicula {
    public static void main(String[] args){
        Pelicula pelicula = new Pelicula("Origen", "Cristopher Nolar", 160);

        System.out.println("Datos de la pelicula: ");
        pelicula.mostrarInformacion();

        pelicula.setTitulo("Guardianes de la galaxia");
        pelicula.setDirector("kiko ribera");
        pelicula.setDuracionMinutos(180);

        System.out.println(pelicula);

        System.out.println();
        System.out.println(pelicula.getTitulo());
        System.out.println(pelicula.getDirector());
        System.out.println(pelicula.getDuracionMinutos());

        try {
            pelicula.setDuracionMinutos(-10);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
