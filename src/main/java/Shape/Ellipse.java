package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {

        Collection<Point2d> pointsOfEllipse = new ArrayList<>();

        double halfWidth = widthDiameter / 2;
        double halfHeight = heightDiameter / 2;

        for (double y = -halfHeight; y <= halfHeight; y += 0.5) {
            double xBound = halfWidth * Math.sqrt(1 - Math.pow(y / halfHeight, 2));
            for (double x = -xBound; x <= xBound; x += 0.5) {
                pointsOfEllipse.add(new Point2d(x, y));
                pointsOfEllipse.add(new Point2d(-x, y));
            }
        }

        this.addAll(pointsOfEllipse);

    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        Collection<Point2d> pointsOfEllipse = new ArrayList<>();

        double halfWidth = dimensions.X() / 2;
        double halfHeight = dimensions.Y() / 2;

        for (double y = -halfHeight; y <= halfHeight; y += 0.5) {
            double xBound = halfWidth * Math.sqrt(1 - Math.pow(y / halfHeight, 2));
            for (double x = -xBound; x <= xBound; x += 0.5) {
                pointsOfEllipse.add(new Point2d(x, y));
                pointsOfEllipse.add(new Point2d(-x, y));
            }
        }

        this.addAll(pointsOfEllipse);
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        // Calculate the width and height using the coordinates
        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxX = -Double.MAX_VALUE;
        double maxY = -Double.MAX_VALUE;

        for (Point2d point : coords) {
            minX = Math.min(minX, point.X());
            minY = Math.min(minY, point.Y());
            maxX = Math.max(maxX, point.X());
            maxY = Math.max(maxY, point.Y());
        }

        double widthValue = maxX - minX;
        double heightValue = maxY - minY;


        Collection<Point2d> pointsOfEllipse = new ArrayList<>();

        double halfWidth = widthValue / 2;
        double halfHeight = heightValue / 2;

        for (double y = -halfHeight; y <= halfHeight; y += 0.5) {
            double xBound = halfWidth * Math.sqrt(1 - Math.pow(y / halfHeight, 2));
            for (double x = -xBound; x <= xBound; x += 0.5) {
                pointsOfEllipse.add(new Point2d(x, y));
                pointsOfEllipse.add(new Point2d(-x, y));
            }
        }
        this.addAll(pointsOfEllipse);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        Collection<Point2d> newCollection = new ArrayList<>();
        for (Point2d point : this.getCoords()) {
            newCollection.add(point.clone());
        }
        return new Ellipse(newCollection);
    }
}
