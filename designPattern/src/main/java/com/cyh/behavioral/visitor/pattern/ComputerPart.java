package com.cyh.behavioral.visitor.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
