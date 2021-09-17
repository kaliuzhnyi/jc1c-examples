package org.jc1c.example.counter;

import org.jc1c.annotations.JHandler;
import org.jc1c.annotations.JHandlerControllers;

@JHandlerControllers
public class CounterHandlers {

    @JHandler(methodName = "plus")
    public void methodPlusD(Double value) {
        Counter.getInstance().plusIndex((int) value.doubleValue());
    }

    @JHandler(methodName = "plus")
    public void methodPlusL(Long value) {
        Counter.getInstance().plusIndex(value.intValue());
    }

    @JHandler(methodName = "minus")
    public void methodMinusD(Double value) {
        Counter.getInstance().minusIndex((int) value.doubleValue());
    }

    @JHandler(methodName = "minus")
    public void methodMinusL(Long value) {
        Counter.getInstance().minusIndex(value.intValue());
    }

    @JHandler(methodName = "get")
    public Integer methodMinus() {
        return Counter.getInstance().getIndex();
    }

}
