
package lab2_walterreyes;

public class Dectectives {
    
private String nombre;
private int edad;
private String nacionalidad;
private int años;
private int nivel;
    
// constructores
public Dectectives(){
    
}
public Dectectives(String nombre,int edad, String nacionalidad,int años, int nivel){
    this.nombre= nombre;
    this.edad = edad;
    this.nacionalidad =nacionalidad;
    this.años = años;
    this.nivel = nivel;
    
}

//mutadores 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
        // MA
@Override
    public String toString(){
        return "Nombre de detective: "+nombre+" Edad: "+edad+" Nacionalidad: "+nacionalidad+" Años de servicio: "+años+
        " Nivel de calidad: "+nivel+"\n";
    }

}
