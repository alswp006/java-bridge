package bridge.model;

import java.util.ArrayList;
import java.util.List;

public class BridgeMaker {
    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMaker(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeNumberGenerator = bridgeNumberGenerator;
    }

    public List<String> makeBridge(int size) {
        List<String> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int number = bridgeNumberGenerator.generate();

            if (number == 1) {
                numbers.add("U");
                continue;
            }
            numbers.add("D");
        }

        return numbers;
    }
}
