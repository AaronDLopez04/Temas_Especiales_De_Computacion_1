public class Alumno extends PersonalAragon{
        private String carrera;

        public Alumno(String nombre, String apellido, String numeroID, String carrera) {
            super(nombre, apellido, numeroID);
            this.carrera = carrera;
        }

        public void establecerCarrera(String carrera) {
            this.carrera = carrera;
        }

        public String obtenerCarrera() {
            return carrera;
        }

        @Override
        public String obtenerRol() {
            return "Alumno de la carrera: " + carrera;
        }
}

