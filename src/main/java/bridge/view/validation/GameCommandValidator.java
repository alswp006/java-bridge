package bridge.view.validation;

import bridge.util.ErrorMessage;

public class GameCommandValidator implements Validator{
    private final String RESTART_STRING = "R";
    private final String QUIT_STRING = "Q";
    @Override
    public void validate(String input) {
        moveCharacterCheck(input);
    }

    private void moveCharacterCheck(String input){
        if (!RESTART_STRING.equals(input) && !QUIT_STRING.equals(input)){
            ErrorMessage.throwError("재시작은 R, 종료는 Q로 입력해주세요.");
        }
    }


}
