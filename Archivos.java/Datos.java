
public class Datos {
    public static String nombreUsuario;
    public static String contraseñaUsuario;
    public static int dineroUsuario;
    
    public Datos() {
        Registrarse objetoUno = new Registrarse();
        nombreUsuario = objetoUno.nombreUsuarioCreado;
        
        Registrarse objetoDos = new Registrarse();
        contraseñaUsuario = objetoUno.contraseñaCreada;
        
        Depositar objetoTres = new Depositar();
        dineroUsuario = objetoTres.saldoFinal;
    }
}
