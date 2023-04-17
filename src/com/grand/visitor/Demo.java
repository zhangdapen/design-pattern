package com.grand.visitor;

import com.grand.visitor.shapes.Circle;
import com.grand.visitor.shapes.CompoundShape;
import com.grand.visitor.shapes.Dot;
import com.grand.visitor.shapes.Rectangle;
import com.grand.visitor.shapes.Shape;
import com.grand.visitor.shapes.Triangle;
import com.grand.visitor.visitor.XmlExportVisitor;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Dot dot = new Dot(1);

        Circle circle = new Circle(2);

        Rectangle rectangle = new Rectangle(3);

        CompoundShape compoundShape = new CompoundShape(4);

        Triangle triangle = new Triangle(5);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(dot);
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(compoundShape);
        shapes.add(triangle);

        String result = new XmlExportVisitor().export(shapes.toArray(new Shape[]{}));
        System.out.println(result);
    }
}
