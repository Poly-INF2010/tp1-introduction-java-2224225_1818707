package Letter;

import Point.Point2d;
import Shape.*;

import Shape.Rectangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /**
     * TODO
     * Create the letter A graphically
     *
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        Collection<Point2d> lettreA = new ArrayList<>();

        Ellipse ellipseGauche = new Ellipse(4.0, 4.0);
        ellipseGauche.translate(ellipseGauche.cloneCoords(),new Point2d(0.0, 2.0));
        lettreA.addAll(ellipseGauche.cloneCoords());

        Ellipse ellipseDroite = new Ellipse(4.0, 4.0);
        ellipseDroite.translate(ellipseDroite.cloneCoords(),new Point2d(8.0, 2.0));
        lettreA.addAll(ellipseDroite.cloneCoords());

        Rectangle barreHorizontale = new Rectangle(8.0, 1.0);
        barreHorizontale.translate(barreHorizontale.cloneCoords(),new Point2d(0.0,4.0));
        lettreA.addAll(barreHorizontale.cloneCoords());

        return new BaseShape(lettreA);
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {

        Collection<Point2d> lettreB = new ArrayList<>();


        Ellipse ellipseSup = new Ellipse(6.0, 6.0);
        ellipseSup.translate(ellipseSup.cloneCoords(), new Point2d(4.0, 6.0));
        lettreB.addAll(ellipseSup.cloneCoords());

        Ellipse ellipseInf = new Ellipse(6.0, 6.0);
        ellipseInf.translate(ellipseInf.cloneCoords(), new Point2d(4.0, 0.0));
        lettreB.addAll(ellipseInf.cloneCoords());

        Rectangle barreVerticale = new Rectangle(2.0, 12.0);
        barreVerticale.translate(barreVerticale.cloneCoords(),new Point2d(8.0,0.0));
        lettreB.addAll(barreVerticale.cloneCoords());

        return new BaseShape(lettreB);
    }
    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {

        Collection<Point2d> lettreC = new ArrayList<>();

        Ellipse ellipseC = new Ellipse(6.0, 12.0);
        ellipseC.translate(ellipseC.cloneCoords(), new Point2d(6.0, 6.0));
        lettreC.addAll(ellipseC.cloneCoords());

        return new BaseShape(lettreC);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Collection<Point2d> lettreE = new ArrayList<>();
        // on veut faire 3 barres horizontales, Haut, milieu et bas, et une barre verticale
        Rectangle barreSup = new Rectangle(10.0, 2.0);
        barreSup.translate(barreSup.getCoords(), new Point2d(0.0, 6.0));
        lettreE.addAll(barreSup.getCoords());

        Rectangle barreMilieu = new Rectangle(10.0, 2.0);
        barreMilieu.translate(barreMilieu.getCoords(), new Point2d(0.0, 6.0));
        lettreE.addAll(barreMilieu.getCoords());

        Rectangle barreInf = new Rectangle(2.0, 12.0);
        barreInf.translate(barreInf.getCoords(), new Point2d(8.0, 0.0));
        lettreE.addAll(barreInf.getCoords());

        Rectangle barreVerticale = new Rectangle(2.0, 12.0);
        barreVerticale.translate(barreVerticale.getCoords(), new Point2d(8.0, 0.0));
        lettreE.addAll(barreVerticale.getCoords());


        return new BaseShape(lettreE);
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Collection<Point2d> lettreH = new ArrayList<>();

        Rectangle barreGauche = new Rectangle(2.0, 12.0);
        barreGauche.translate(barreGauche.getCoords(), new Point2d(0.0, 0.0));
        lettreH.addAll(barreGauche.getCoords());

        Rectangle barreDroite = new Rectangle(2.0, 12.0);
        barreDroite.translate(barreDroite.getCoords(), new Point2d(8.0, 0.0));
        lettreH.addAll(barreDroite.getCoords());

        Rectangle barreHorizontale = new Rectangle(10.0, 2.0);
        barreHorizontale.translate(barreHorizontale.getCoords(), new Point2d(0.0, 6.0));
        lettreH.addAll(barreHorizontale.getCoords());

        return new BaseShape(lettreH);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Collection<Point2d> lettreN = new ArrayList<>();

        //barre verticale gauche
        Rectangle barreGauche = new Rectangle(2.0, 12.0);
        barreGauche.translate(barreGauche.getCoords(), new Point2d(0.0, 0.0));
        lettreN.addAll(barreGauche.getCoords());

        //barre diagonale
        Rectangle barreDiagonale = new Rectangle(14.0, 2.0);
        barreDiagonale.rotate(barreDiagonale.getCoords(), Math.toRadians(-45.0));
        barreDiagonale.translate(barreDiagonale.getCoords(), new Point2d(0.0, 6.0));
        lettreN.addAll(barreDiagonale.getCoords());

        // barre verticale droite
        Rectangle barreHorizontale = new Rectangle(10.0, 2.0);
        barreHorizontale.translate(barreHorizontale.getCoords(), new Point2d(0.0, 6.0));
        lettreN.addAll(barreHorizontale.getCoords());

        return new BaseShape(lettreN);
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Collection<Point2d> lettreO = new ArrayList<>();

        Ellipse ellipseO = new Ellipse(6.0, 12.0);
        ellipseO.translate(ellipseO.cloneCoords(), new Point2d(6.0, 6.0));
        lettreO.addAll(ellipseO.cloneCoords());

        return new BaseShape(lettreO);
    }

}
