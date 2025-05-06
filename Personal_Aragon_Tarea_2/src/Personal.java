public class Personal extends PersonalAragon{
    private String puesto;

    public Personal(String nombre, String apellido, String numeroID, String puesto) {
        super(nombre, apellido, numeroID);
        this.puesto = puesto;
    }

    public void establecerPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String obtenerPuesto() {
        return puesto;
    }

    @Override
    public String obtenerRol() {
        return "Personal con el puesto de: " + puesto;
    }
}
