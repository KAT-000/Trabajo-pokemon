// Dejare anotaciones del por que cada cosa , se declaran las variables para su posterior getter y setter 
// En este caso el protected por que segun lo que aprendi es que tiene la capacidad de comunicarse con las  clase padre y las subclases hijas sin importar en la carpeta o sector esten 
public class Pokemon {
    protected String nombre_pokemon;
    protected int puntosVida;
    protected int ataque;
    protected int defensa;
    protected int ataque_especial;
    protected int defensa_especial;
    protected int velocidad;
    String naturaleza;
    protected String habilidad;
    String habilidad_oculta;
    protected String Movimientos;
    boolean mega_evolucion;
    boolean movimiento_huevo;

    public int getpuntosVida() {
        return puntosVida;
    }
    public String getNombre(){
        return nombre_pokemon;
    }
    // Lo voy a explicar con mis propias palabras los if de este metodo ,"si nombre(parametro) esta vacio O  nombre(parametro) esta vacio/espacios entre medio entonces este nombre_pokemon tendra valor sin nombre"
    public void setNombre(String nombre){
        if(nombre == null || nombre.isBlank()){
            this.nombre_pokemon = "Sin nombre";
            // Si este nombre tiene una longitud mayor a 12 caracteres , entonces , este nombre_pokemon tendra una longitud de solo 12 caracteres mayor a eso lo recorto (.substring)
        } else if(nombre.length() > 12){
            this.nombre_pokemon = nombre.substring(0 , 12);
            // si no , entonces este nombre_pokemon sera igual a nombre(parametro)
        } else{
            this.nombre_pokemon = nombre;
        }
    }
    public void setpuntosVida(int puntosVida) {
        if(puntosVida < 0){
            this.puntosVida = 0;
        }else if(puntosVida > 255) {
            this.puntosVida = 255;
        }else{
            this.puntosVida = puntosVida;
        }
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        if (ataque < 1){
            this.ataque = 1;
        } else if (ataque > 255) {
            this.ataque = 1;
        } else{
            this.ataque = ataque;
        }
    }
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        if (defensa < 1){
            this.defensa = 1;
        } else if (defensa > 255) {
            this.defensa = 255;
        } else {
            this.defensa = defensa;
        }
    }
    public int getAtaque_especial() {
        return ataque_especial;
    }
    public void setAtaque_especial(int ataque_especial) {
        if (ataque_especial < 1){
            this.ataque_especial = 1;
        } else if (ataque_especial > 255){
            this.ataque_especial = 255;
        } else{
            this.ataque_especial = ataque_especial;
        }
    }
    public int getDefensa_especial() {
        return defensa_especial;
    }
    public void setDefensa_especial(int defensa_especial) {
        if (defensa_especial < 1){
            this.defensa_especial = 1;
        } else if (defensa_especial > 255) {
            this.defensa_especial = 255;
        } else {
            this.defensa_especial = defensa_especial;
        }
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        if (velocidad < 1){
            this.velocidad = 1;
        } else if (velocidad > 255) {
            this.velocidad = 255;
        } else {
            this.velocidad = velocidad;
        }
    }
    public String getNaturaleza() {
        return naturaleza;
    }
    public String getHabilidad() {
        return habilidad;
    }
    public String getHabilidad_oculta() {
        return habilidad_oculta;
    }
    public String getMovimientos() {
        return Movimientos;
    }
    public boolean isMega_evolucion() {
        return mega_evolucion;
    }
    public void setMega_evolucion(boolean mega_evolucion) {
        this.mega_evolucion = mega_evolucion;
    }
    public boolean isMovimiento_huevo() {
        return movimiento_huevo;
    }
    public void setMovimiento_huevo(boolean movimiento_huevo) {
        this.movimiento_huevo = movimiento_huevo;
    }
}