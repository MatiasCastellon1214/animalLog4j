package com.backend;
import org.apache.log4j.Logger;
public class Tigre {
    private static final Logger logger = Logger.getLogger(Tigre.class);
    private String nombre;
    private int edad;

    public Tigre(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public  void correr(){
        logger.info("El Tigre "+ nombre+" está corriendo....... ");
    }



    public void esMayorA10(){
        logger.info("Verificando la edad del tigre: "+nombre);
        try{
            if(edad < 0){
                throw new Exception("La edad no puede ser negativa");
            }

        } catch (Exception e){
            logger.error("Error al crear el bicho tigre, la edad no puede ser negativa", e);
            return;
        }

        logger.debug("La edad del Tigre "+nombre+" es: "+edad+" años.");


    }

}
