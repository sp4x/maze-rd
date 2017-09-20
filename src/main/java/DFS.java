import javafx.geometry.Pos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DFS {

    public PPM ppm;

    public void visit(Position p) {

    }

    public List<Position> adjacentEdges(Position p) {

    }

    public boolean isExit(Position p) {

    }

    public boolean isVisited(Position p) {

    }

    public void turnRed(Position p) {

    }

    public boolean dfs(Position current) {
        this.visit(current);
        for (Position p: this.adjacentEdges(current)) {
            if (isExit(p)) {
                turnRed(p);
                return true;
            } else if(!isVisited(p)) {
                boolean rightPath = dfs(p);
                if (rightPath) {
                    turnRed(p);
                }
                return rightPath;
            }
        }
        return false;
    }


}
