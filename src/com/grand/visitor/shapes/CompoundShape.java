package com.grand.visitor.shapes;

import com.grand.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghongwei
 */
public class CompoundShape implements Shape{

    private int id;

    private List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw(int x, int y) {

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundShape(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Shape> getChildren() {
        return children;
    }

    public void setChildren(List<Shape> children) {
        this.children = children;
    }
}
