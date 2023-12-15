package bridge.view.validation;

import bridge.util.ErrorMessage;

public class BridgeMoveValidator implements Validator {
    private final String UP_STRING = "U";
    private final String DOWN_STRING = "D";
    @Override
    public void validate(String input) {
        moveCharacterCheck(input);
    }

    private void moveCharacterCheck(String input){
        if (!UP_STRING.equals(input) && !DOWN_STRING.equals(input)){
            ErrorMessage.throwError("올바른 이동 문자를 입력하세요.");
        }
    }
}
