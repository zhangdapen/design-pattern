package com.grand.visitor.shapes;

import com.grand.visitor.visitor.Visitor;

/**
 * @author zhanghongwei
 */
public interface Shape {
    void move(int x, int y);

    void draw(int x, int y);

    String accept(Visitor visitor);
}
