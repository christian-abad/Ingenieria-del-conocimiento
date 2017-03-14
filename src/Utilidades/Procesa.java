package Utilidades;

import Predicados.Hijo_de;
import Predicados.Le_gusta;
import Predicados.Practica;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Christian
 */
public class Procesa {

    private ArrayList<Hijo_de> lstHijo = new ArrayList<>();
    private ArrayList<Le_gusta> les_gusta = new ArrayList<>();
    private ArrayList<Practica> lstPractica = new ArrayList<>();
    private ArrayList<String> saludos = new ArrayList<>();
    private ArrayList<String> despedidas = new ArrayList<>();

    public Procesa() {
        saludos.add("Hola");
        saludos.add("Hola ¿cómo estas?");
        saludos.add("Que onda");
        saludos.add("Hi");
        despedidas.add("Adios");
        despedidas.add("Adios, regresa pronto");
        despedidas.add("Bye");
        despedidas.add("Hasta luego");
    }

    public String procesarCadena(String cadena) {
        String respuesta = "No entiendo tu pregunta";
        cadena = cadena.toLowerCase().trim();
        if (cadena.contains("hola")) {
            return saludoAleatorio();
        } else if (cadena.contains("adios")) {
            return despedidaAleatoria();
        } else if (cadena.contains("dime los padres de")) {
            String cadena2 = cadena.replace("dime los padres de", "");
            cadena2 = cadena2.split(" ")[0];
        }
        return respuesta;
    }

    public ArrayList<Hijo_de> getLstHijo() {
        return lstHijo;
    }

    public ArrayList<Le_gusta> getLes_gusta() {
        return les_gusta;
    }

    public ArrayList<Practica> getLstPractica() {
        return lstPractica;
    }

    public String saludoAleatorio() {
        Random r = new Random();
        return saludos.get(r.nextInt(saludos.size()));
    }

    public String despedidaAleatoria() {
        Random r = new Random();
        return despedidas.get(r.nextInt(despedidas.size()));
    }

    public String obtenerPadres(String hijo) {
        String respuesta = "";
        for (Hijo_de h : lstHijo) {
            if (h.getX().equals(hijo)) {
                respuesta += h.getY() + " ";
            }
        }
        return respuesta;
    }

    public boolean sonHermanos(String x, String y) {
        return true;
    }

    public String obtenerHermanos(String x) {
        return "hermanos";
    }

    public boolean esAbuelo(String abuelo, String nieto) {
        return true;
    }

    public String obtenerAbuelos(String nieto) {
        return "abuelos";
    }
}
