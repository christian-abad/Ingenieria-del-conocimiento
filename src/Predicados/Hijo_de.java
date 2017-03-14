
package Predicados;

/**
 *
 * @author Christian
 */
public class Hijo_de {

    private String X;//Hijo
    private String Y;//Padre o madre

    public Hijo_de(String X, String Y) {
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
        return "hijoDe(" + X + "," + Y + ")";
    }

}
