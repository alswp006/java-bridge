package bridge.view;

import bridge.view.validation.BridgeLenValidator;
import bridge.view.validation.BridgeMoveValidator;
import bridge.view.validation.GameCommandValidator;
import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public enum InputView {
    INSTANCE;

    public static InputView getInstance() {
        return INSTANCE;
    }

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        BridgeLenValidator bridgeLenValidator = new BridgeLenValidator();
        System.out.println("다리의 길이를 입력해주세요.");

        while (true) {
            try {
                String input = Console.readLine();

                bridgeLenValidator.validate(input);

                return Integer.parseInt(input);

            } catch (IllegalArgumentException e) {
            }
        }
    }

    public String readMoving() {
        BridgeMoveValidator bridgeMoveValidator = new BridgeMoveValidator();
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");

        while (true) {
            try {
                String input = Console.readLine();

                bridgeMoveValidator.validate(input);

                return input;

            } catch (IllegalArgumentException e) {
            }
        }

    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        GameCommandValidator gameCommandValidator = new GameCommandValidator();
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");

        while (true) {
            try {
                String input = Console.readLine();

                gameCommandValidator.validate(input);

                return input;

            } catch (IllegalArgumentException e) {
            }
        }
    }
}
