package Predicados;

/**
 *
 * @author Christian
 */
public class Le_gusta {

    private String X;//Sujeto
    private String Y;//Objeto

    public Le_gusta(String X, String Y) {
        this.X = X;
        this.Y = Y;
    }

    public String getY() {
        return Y;
    }

    public void setY(String Y) {
        this.Y = Y;
    }

    public String getX() {
        return X;
    }

    public void setX(String X) {
        this.X = X;
    }

    @Override
    public String toString() {
        return "practica(" + X + "," + Y + ")";
    }

}
