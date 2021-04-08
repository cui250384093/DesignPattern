package com.yl.principle;

import java.security.PublicKey;

/**
 * @author candk
 * @Description 依赖倒转原则
 * 1. 高层模块不应该依赖低层模块，二者都应该依赖抽象, 低层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好；变量的声明类型尽量是抽象类或者接口，这样我们
 * 变量引用和实际对象间，就存在一个缓冲层，利于程序扩展和优化。
 * 2. 抽象不应该依赖细节，细节应该依赖抽象
 * 3. 依赖倒转的中心思想是面向接口编程
 * 4. 依赖倒转原则是基于这样的设计理念：相对于细节的多样性，抽象的东西要稳定的多，以抽象为基础搭建的架构比以细节为基础的架构要稳定的多，在java中，抽象指的是接口
 * 或抽象类，细节就是具体的实现类
 * 5. 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。
 * @date 4/8/21 - 1:38 PM
 */
public class DependenceInversion {
}

interface IReceive {

    /**
     * 接口
     * @return 返回
     */
    public String getInfo();
}


class Person {
    public void receive(IReceive receiver) {
        System.out.println(receiver.getInfo());
    }
}

class Email implements IReceive {
    @Override
    public String getInfo() {
        return "Email: hello!";
    }
}

class WeChat implements IReceive {

    @Override
    public String getInfo() {
        return "WeChat: hello!";
    }
}
