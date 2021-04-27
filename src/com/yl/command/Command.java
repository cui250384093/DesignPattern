package com.yl.command;

/**
 * @author candk
 * @Description
 * @date 4/27/21 - 4:04 PM
 */
public interface Command {

    public void execute();

    public void undo();
}
