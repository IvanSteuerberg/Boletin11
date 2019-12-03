package boletin11;

/**
 *
 * @author irodriguezsteuerberg
 */
public class ClasseA {

    private int valorPrimari;
    private int valorSecundari;

    public ClasseA() {
        valorPrimari = 5;
        valorSecundari = 10;
    }

    public ClasseA(int vp) {
        valorPrimari = vp;
        valorSecundari = 10;
    }

    public ClasseA(int vp, int vs) {
        valorPrimari = vp;
        valorSecundari = vs;
    }

    public int getPrimari() {
        return valorPrimari;
    }

    public int getSecundari() {
        return valorSecundari;
    }



}
