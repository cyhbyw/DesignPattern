package com.cyh.behavioral.visitor.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public interface Subject {

    void accept(Visitor visitor);

    String getSubject();
}
