package com.yl.principle;

import org.junit.jupiter.api.Test;

/**
 * @author candk
 * @Description 单一职责原则
 * 1. 降低类的复杂度，一个类只负责一项职责
 * 2. 提高类的可读性，可维护性
 * 3. 降低变更引起的风险
 * 4. 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则，只有类中方法数量足够少，可以在方法级别保持单一职责原则
 * @date 4/8/21 - 9:27 AM
 */

public class SingleResponsibility {

    @Test
    public void test1() {
        Vehicle vehicle = new Vehicle();
        vehicle.run("car");
        vehicle.run("train");
        vehicle.run("plain");
    }

}
