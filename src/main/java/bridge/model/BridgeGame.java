package bridge.model;

import java.util.ArrayList;
import java.util.List;

public class BridgeGame {
    List<List<String>> moveResult = new ArrayList<>();

    public BridgeGame() {
        moveResult.add(new ArrayList<>());
        moveResult.add(new ArrayList<>());
    }

    public List<List<String>> getResult(){
        return moveResult;
    }

    public void initMoveResult(){
        moveResult.get(0).clear();
        moveResult.get(1).clear();
    }
    public boolean move(String bridge, String userMove) {
        if (userMove.equals("U")) {
            if (bridge.equals(userMove)) {
                moveResult.get(0).add("O");
                moveResult.get(1).add(" ");
                return true;
            }
            moveResult.get(0).add("X");
            moveResult.get(1).add("O");
            return false;
        }
        if (bridge.equals(userMove)) {
            moveResult.get(0).add(" ");
            moveResult.get(1).add("O");
            return true;
        }
        moveResult.get(0).add("O");
        moveResult.get(1).add("X");
        return false;
    }
}
