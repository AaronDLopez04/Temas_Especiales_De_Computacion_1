public class ExAlumno extends PersonalAragon {
        private int añoEgreso;

        public ExAlumno(String nombre, String apellido, String numeroID, int añoEgreso) {
            super(nombre, apellido, numeroID);
            this.añoEgreso = añoEgreso;
        }

        public void establecerAñoEgreso(int año) {
            this.añoEgreso = año;
        }

        public int obtenerAñoEgreso() {
            return añoEgreso;
        }

        @Override
        public String obtenerRol() {
            return "Exalumno egresado en el año: " + añoEgreso;
        }
}

