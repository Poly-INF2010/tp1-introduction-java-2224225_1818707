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

        Collection<Point2d> ellipseCoordinates = new ArrayList<>();

        double halfWidth = widthDiameter / 2;
        double halfHeight = heightDiameter / 2;

        for (double yCoordinate = -halfHeight; yCoordinate <= halfHeight; yCoordinate += 0.5) {
            double absoluteXValue = halfWidth * Math.sqrt(1 - Math.pow(yCoordinate / halfHeight, 2));
            for (double xCoordinate = -absoluteXValue; xCoordinate <= absoluteXValue; xCoordinate += 0.5) {
                ellipseCoordinates.add(new Point2d(xCoordinate, yCoordinate));
            }
        }

        this.addAll(ellipseCoordinates);

    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        Collection<Point2d> ellipseCoordinates = new ArrayList<>();

        double halfWidth = dimensions.X() / 2;
        double halfHeight = dimensions.Y() / 2;

        for (double yCoordinate = -halfHeight; yCoordinate <= halfHeight; yCoordinate += 0.5) {
            double absoluteXValue = halfWidth * Math.sqrt(1 - Math.pow(yCoordinate / halfHeight, 2));
            for (double xCoordinate = -absoluteXValue; xCoordinate <= absoluteXValue; xCoordinate += 0.5) {
                ellipseCoordinates.add(new Point2d(xCoordinate, yCoordinate));
            }
        }

        this.addAll(ellipseCoordinates);
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        // Calculate the width and height using the coordinates
        double minValueOfX = Double.MAX_VALUE;
        double minValueOfY = Double.MAX_VALUE;
        double maxValueOfX = -Double.MAX_VALUE;
        double maxValueOfY = -Double.MAX_VALUE;

        for (Point2d point : coords) {
            minValueOfX = Math.min(minValueOfX, point.X());
            minValueOfY = Math.min(minValueOfY, point.Y());
            maxValueOfX = Math.max(maxValueOfX, point.X());
            maxValueOfY = Math.max(maxValueOfY, point.Y());
        }

        double valueOfWidth = maxValueOfX - minValueOfX;
        double valueOfHeight = maxValueOfY - minValueOfY;


        Collection<Point2d> ellipseCoordinates = new ArrayList<>();

        double halfWidth = valueOfWidth / 2;
        double halfHeight = valueOfHeight / 2;

        for (double yCoordinate = -halfHeight; yCoordinate <= halfHeight; yCoordinate += 0.5) {
            double absoluteXValue = halfWidth * Math.sqrt(1 - Math.pow(yCoordinate / halfHeight, 2));
            for (double xCoordinate = -absoluteXValue; xCoordinate <= absoluteXValue; xCoordinate += 0.5) {
                ellipseCoordinates.add(new Point2d(xCoordinate, yCoordinate));
            }
        }
        this.addAll(ellipseCoordinates);
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
