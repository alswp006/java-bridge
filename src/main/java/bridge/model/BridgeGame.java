package bridge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
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

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
