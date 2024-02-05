package Interface;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Transform implements Rotate, Translate{
    /** TODO
     * Rotate all points of collections given in parameters
     * with the angle given
     * @param coords collections of Point2d
     * @param angle
     * @return rotated collection
     * */
    public Collection<Point2d> rotate(Collection<Point2d> coords, Double angle) {
        Collection<Point2d> rotatedCoordinates = new ArrayList<>();
        for (Point2d point : coords) {
            rotatedCoordinates.add(point.rotate(angle));
        }
        return rotatedCoordinates;
    }

    /** TODO
     * Translate all points of a collection by a given vector
     * @param coords Collection of Point2d
     * @param translateVector Vector of translation
     * @return translated coords
     * */
    public Collection<Point2d> translate(Collection<Point2d> coords, Point2d translateVector) {
        Collection<Point2d> translatedCoordinates = new ArrayList<>();
        for (Point2d point : coords) {
            translatedCoordinates.add(point.translate(translateVector));
        }
        return translatedCoordinates;
    }
}
