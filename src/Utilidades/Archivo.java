/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Predicados.Hijo_de;
import Predicados.Le_gusta;
import Predicados.Practica;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

/**
 *
 * @author Christian
 */
public class Archivo {

    public static void escribirArchivo(String nombreArchivo,
            Procesa base) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo, false))) {
            base.getLstHijo().stream().forEach((h) -> {
                pw.println("hijo_de(" + h.getX() + "," + h.getY() + ")");
            });
            base.getLes_gusta().stream().forEach((l) -> {
                pw.println("le_gusta(" + l.getX() + "," + l.getY() + ")");
            });
            base.getLstPractica().stream().forEach((p) -> {
                pw.println("practica(" + p.getX() + "," + p.getY() + ")");
            });
        }
    }

    public static Procesa leerArchivo(String nombreArchivo) throws IOException, ParseException, Exception {
        Procesa retorno = new Procesa();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                int posicion = linea.indexOf("(");
                if (posicion > 0) {
                    String[] valores;
                    int posicion2 = linea.indexOf(")");
                    posicion2 = posicion2 <= 0 ? linea.length() : posicion2;
                    valores = linea.substring(posicion + 1, posicion2).split(",");
                    if (valores.length >= 2) {
                        switch (linea.substring(0, posicion).toLowerCase()) {
                            case "hijo_de":
                                Hijo_de h = new Hijo_de(valores[0].trim(), valores[1].trim());
                                retorno.getLstHijo().add(h);
                                break;
                            case "le_gusta":
                                Le_gusta l = new Le_gusta(valores[0].trim(), valores[1].trim());
                                retorno.getLes_gusta().add(l);
                                break;
                            case "practica":
                                Practica p = new Practica(valores[0].trim(), valores[1].trim());
                                retorno.getLstPractica().add(p);
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
        return retorno;
    }
}
