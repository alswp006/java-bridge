package bridge.controller;

import bridge.model.BridgeGame;
import bridge.model.BridgeMaker;
import bridge.model.BridgeNumberGenerator;
import bridge.model.BridgeRandomNumberGenerator;
import bridge.view.InputView;
import bridge.view.OutputView;

import java.util.List;

public class Controller {
    private final InputView inputView = InputView.getInstance();;
    private final OutputView outputView = OutputView.getInstance();
    BridgeGame bridgeGame = new BridgeGame();
    int count = 1;

    public void play() {
        outputView.printStartMessage();
        int bridgeLen = inputView.readBridgeSize();

        BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);
        List<String> bridges = bridgeMaker.makeBridge(bridgeLen);

        boolean checkGameClear = moveUser(bridges);
        String gameClear = "실패";

        System.out.println(checkGameClear);
        if (checkGameClear){
            gameClear = "성공";
        }
        System.out.println(gameClear);
        outputView.printResult(gameClear, count);
    }

    private boolean moveUser(List<String> bridges){
        for (String bridge : bridges){
            String bridgeMove = inputView.readMoving();
            boolean checkMove = bridgeGame.move(bridge, bridgeMove);
            outputView.printMap(bridgeGame.getResult());
            if(!checkMove){
                getRestart(bridges);
                return false;
            }
        }
        return true;
    }

    private void getRestart(List<String> bridges){
        String gameCommand = inputView.readGameCommand();

        if(gameCommand.equals("R")){
            count+=1;
            bridgeGame.initMoveResult();
            moveUser(bridges);
        }
    }
}
