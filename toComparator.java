import java.util.Comparator;

public class toComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape S1, Shape S2) {
        if (S1.perimeter() - S2.perimeter() > 0.001) {
            return 1;
        } else if (S1.perimeter() - S2.perimeter() < 0.001){
            return -1;
        } else {
            return 0;
        }
    }
}
