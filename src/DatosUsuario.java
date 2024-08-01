public class DatosUsuario {
    private static String nombreUsuario;
    private static String contraseñaUsuario;
    private static int dineroUsuario;
    
    public DatosUsuario() {
    }

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String nombreUsuario) {
        DatosUsuario.nombreUsuario = nombreUsuario;
    }

    public static String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public static void setContraseñaUsuario(String contraseñaUsuario) {
        DatosUsuario.contraseñaUsuario = contraseñaUsuario;
    }

    public static int getDineroUsuario() {
        return dineroUsuario;
    }

    public static void setDineroUsuario(int dineroUsuario) {
        DatosUsuario.dineroUsuario = dineroUsuario;
    }
}
