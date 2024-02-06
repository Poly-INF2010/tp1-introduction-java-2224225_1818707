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

        Rectangle barreVerticale = new Rectangle(0.5, 32.0);
        lettreA.addAll(barreVerticale.cloneCoords());

        Rectangle barreDroite = new Rectangle(0.5, 32.0);
        barreDroite.translate(barreDroite.getCoords(), new Point2d(10.0, 0.0));
        lettreA.addAll(barreDroite.getCoords());


        Rectangle barreMilieu = new Rectangle(10.0, 1.0);
        barreMilieu.translate(barreMilieu.getCoords(), new Point2d(5.0, 0.0));
        lettreA.addAll(barreMilieu.getCoords());

        Rectangle barreHaut = new Rectangle(10.0, 1.0);
        barreHaut.translate(barreHaut.getCoords(), new Point2d(5.0, -16.0));
        lettreA.addAll(barreHaut.getCoords());

        return new BaseShape(lettreA);
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {

        Collection<Point2d> lettreB = new ArrayList<>();

        Rectangle barreVerticale = new Rectangle(0.5, 32.0);
        lettreB.addAll(barreVerticale.cloneCoords());

        Rectangle barreDroite = new Rectangle(0.5, 32.0);
        barreDroite.translate(barreDroite.getCoords(), new Point2d(10.0, 0.0));
        lettreB.addAll(barreDroite.getCoords());


        Rectangle barreMilieu = new Rectangle(10.0, 1.0);
        barreMilieu.translate(barreMilieu.getCoords(), new Point2d(5.0, 0.0));
        lettreB.addAll(barreMilieu.getCoords());

        Rectangle barreHaut = new Rectangle(10.0, 1.0);
        barreHaut.translate(barreHaut.getCoords(), new Point2d(5.0, -16.0));
        lettreB.addAll(barreHaut.getCoords());

        Rectangle barreBas = new Rectangle(10.0, 1.0);
        barreBas.translate(barreBas.getCoords(), new Point2d(5.0, 16.0));
        lettreB.addAll(barreBas.getCoords());

        return new BaseShape(lettreB);
    }
    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {

        Collection<Point2d> lettreC = new ArrayList<>();

        Rectangle barreVerticale = new Rectangle(0.5, 32.0);
        lettreC.addAll(barreVerticale.cloneCoords());

        Rectangle barreHaut = new Rectangle(10.0, 1.0);
        barreHaut.translate(barreHaut.getCoords(), new Point2d(5.0, -16.0));
        lettreC.addAll(barreHaut.getCoords());

        Rectangle barreBas = new Rectangle(10.0, 1.0);
        barreBas.translate(barreBas.getCoords(), new Point2d(5.0, 16.0));
        lettreC.addAll(barreBas.getCoords());

        return new BaseShape(lettreC);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Collection<Point2d> lettreE = new ArrayList<>();

        Rectangle barreVerticale = new Rectangle(0.5, 32.0);
        lettreE.addAll(barreVerticale.cloneCoords());

        Rectangle barreMilieu = new Rectangle(10.0, 1.0);
        barreMilieu.translate(barreMilieu.getCoords(), new Point2d(5.0, 0.0));
        lettreE.addAll(barreMilieu.getCoords());

        Rectangle barreHaut = new Rectangle(10.0, 1.0);
        barreMilieu.translate(barreHaut.getCoords(), new Point2d(5.0, -16.0));
        lettreE.addAll(barreHaut.getCoords());

        Rectangle barreBas = new Rectangle(10.0, 1.0);
        barreBas.translate(barreBas.getCoords(), new Point2d(5.0, 16.0));
        lettreE.addAll(barreBas.getCoords());

        return new BaseShape(lettreE);
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Collection<Point2d> lettreH = new ArrayList<>();

        Rectangle barreVerticale = new Rectangle(0.5, 32.0);
        lettreH.addAll(barreVerticale.cloneCoords());

        Rectangle barreMilieu = new Rectangle(10.0, 1.0);
        barreMilieu.translate(barreMilieu.getCoords(), new Point2d(5.0, 0.0));
        lettreH.addAll(barreMilieu.getCoords());

        Rectangle barreDroite = new Rectangle(0.5, 32.0);
        barreDroite.translate(barreDroite.getCoords(), new Point2d(10.0, 0.0));
        lettreH.addAll(barreDroite.getCoords());

        return new BaseShape(lettreH);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Collection<Point2d> lettreN = new ArrayList<>();

        Rectangle barreVerticale = new Rectangle(0.5, 32.0);
        lettreN.addAll(barreVerticale.cloneCoords());

        Rectangle barreDroite = new Rectangle(0.5, 32.0);
        barreDroite.translate(barreDroite.getCoords(), new Point2d(10.0, 0.0));
        lettreN.addAll(barreDroite.getCoords());

        //barre diagonale
        Rectangle barreDiagonale = new Rectangle(10.0, 1.0);
        barreDiagonale.rotate(barreDiagonale.getCoords(), Math.toRadians(-50.0));
        barreDiagonale.translate(barreDiagonale.getCoords(), new Point2d(2.0, 8.0));
        lettreN.addAll(barreDiagonale.getCoords());

        return new BaseShape(lettreN);
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Collection<Point2d> lettreO = new ArrayList<>();

        //ellipse exterieure
        Ellipse countour = new Ellipse(12.0, 32.0);
        lettreO.addAll(countour.cloneCoords());

        // ellipse interieure (creuse)
        Ellipse interieure = new Ellipse(4.0,10.0);
        lettreO.removeAll(interieure.cloneCoords());

        return new BaseShape(lettreO);
    }

}
