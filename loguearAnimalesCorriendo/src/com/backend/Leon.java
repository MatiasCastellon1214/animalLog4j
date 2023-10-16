package com.backend;

import org.apache.log4j.Logger;

public class Leon {
    private static final Logger logger = Logger.getLogger(Leon.class);
    private String nombre;
    private int edad;

    private boolean esAlfa;

    public Leon(String nombre, int edad, boolean esAlfa) {
        this.nombre = nombre;
        this.edad = edad;
        this.esAlfa = esAlfa;
    }

    public  void correr(){
        logger.info("El León "+ nombre+" está corriendo....... ");
    }



    public void esMayorA10(){
        logger.info("Verificando la edad del león: "+nombre);
        try{
            if(edad < 0){
                throw new Exception("La edad no puede ser negativa");
            }

        } catch (Exception e){
            logger.error("Error al crear el bicho león, la edad no puede ser negativa", e);
            return;
        }

        logger.debug("La edad del León "+nombre+" es: "+edad+" años.");


    }

    public void machoAlfa(){
        if (esAlfa){
            logger.info("EL bicho "+nombre+" es macho Alfa");
        } else {
            logger.info("Al bicho le faltan huevos");
        }
    }

}
