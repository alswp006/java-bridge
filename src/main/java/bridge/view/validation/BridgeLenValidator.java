package bridge.view.validation;

import bridge.util.ErrorMessage;

public class BridgeLenValidator implements Validator{
    private final int MIN_BRIDGE_NUMBER = 3;
    private final int MAX_BRIDGE_NUMBER = 20;

    @Override
    public void validate(String input) {
        checkBridgeLenTypeCheck(input);
        checkBridgeRangeCheck(input);
    }

    private void checkBridgeLenTypeCheck(String input){
        try{
            Integer.parseInt(input);
        }catch (NumberFormatException e){
            ErrorMessage.throwError("다리 길이는 숫자로 입력해주세요.");
        }
    }

    private void checkBridgeRangeCheck(String input){
        int bridge = Integer.parseInt(input);

        if (bridge < MIN_BRIDGE_NUMBER || bridge > MAX_BRIDGE_NUMBER){
            ErrorMessage.throwError("다리 길이는 3 이상 20 이하의 수를 입력해주세요.");
        }
    }
}
