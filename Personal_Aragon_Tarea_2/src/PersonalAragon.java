public abstract class PersonalAragon {
        private String nombre;
        private String apellido;
        private String numeroIdentificacion;

        public PersonalAragon(String nombre, String apellido, String numeroIdentificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.numeroIdentificacion = numeroIdentificacion;
        }

        public void establecerNombre(String nombre) {
            this.nombre = nombre;
        }

        public String obtenerNombre() {
            return nombre;
        }

        public void establecerApellido(String apellido) {
            this.apellido = apellido;
        }

        public String obtenerApellido() {
            return apellido;
        }

        public void establecerNumeroIdentificacion(String numero) {
            this.numeroIdentificacion = numero;
        }

        public String obtenerNumeroIdentificacion() {
            return numeroIdentificacion;
        }

        @Override
        public String toString() {
            return String.format("%s %s\nNúmero de ID: %s",
                    obtenerNombre(), obtenerApellido(), obtenerNumeroIdentificacion());
        }
        // Método abstracto para obtener la descripción del rol en la FES Aragón
        public abstract String obtenerRol();
}
