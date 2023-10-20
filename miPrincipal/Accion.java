package miPrincipal;

// Accion.java
// Clase para implementar una Accion y su porcentaje de cambio de precio

public class Accion
{
	// Atributos
    private String simbolo;
    private String nombre;
    private double precioCierrePrevio;
    private double precioActual;

	// Constructor
	public Accion( String simbolo, String nombre, double precioCierrePrevio, double precioActual )
	{
		// Mandar llamar los metodos set de los atributos
	}

	// Metodos set/get
    public void setSimbolo( String simbolo )
    {
        // El simbolo no se valida
    }

    public void setNombre( String nombre )
    {
        // El nombre no se valida
    }

    public void setPrecioCierrePrevio( double precioCierrePrevio )
    {
        // El precio del cierre previo debe ser mayor que 0
    }

    public void setPrecioActual( double precioActual )
    {
        // El precio actual debe ser mayor que 0
    }

    public String getSimbolo()
    {
        return "";
    }

    public String getNombre()
    {
        return "";
    }

    public double getPrecioCierrePrevio()
    {
        return 0.0;
    }

    public double getPrecioActual()
    {
        return 0.0;
    }

    // Metodo de instancia
    public double getPorcentajeCambio()
    {
        // Usar la formula proporcionada en la descripcion del problema
        return 0.0;
    }

    // Sobreescribir metodo toString()
	public String toString()
	{
		String resultado = String.format("Accion: Simbolo: %s, Nombre: %s, Precio Cierre: $%,.2f, Precio Actual: $%,.2f",
                            simbolo, nombre, precioCierrePrevio, precioActual);
		return resultado;
	}
}