package com.grand.visitor.visitor;

import com.grand.visitor.shapes.Circle;
import com.grand.visitor.shapes.CompoundShape;
import com.grand.visitor.shapes.Dot;
import com.grand.visitor.shapes.Rectangle;
import com.grand.visitor.shapes.Shape;
import com.grand.visitor.shapes.Triangle;

import java.text.MessageFormat;

/**
 * @author zhanghongwei
 */
public class XmlExportVisitor implements Visitor{
    @Override
    public String visitDot(Dot dot) {
        return MessageFormat.format(
                "我是{0}元素,id为{1}",
                dot.getClass().getSimpleName(),
                dot.getId()
        );
    }

    @Override
    public String visitCircle(Circle circle) {
        return MessageFormat.format(
                "我是{0}元素,id为{1}",
                circle.getClass().getSimpleName(),
                circle.getId()
        );
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return MessageFormat.format(
                "我是{0}元素,id为{1}",
                rectangle.getClass().getSimpleName(),
                rectangle.getId()
        );
    }

    @Override
    public String visitCompoundShape(CompoundShape compoundShape) {
        return MessageFormat.format(
                "我是{0}元素,id为{1}",
                compoundShape.getClass().getSimpleName(),
                compoundShape.getId()
        );    }

    @Override
    public String visitTriangle(Triangle triangle) {
        return MessageFormat.format(
                "我是{0}元素,id为{1}",
                triangle.getClass().getSimpleName(),
                triangle.getId()
        );
    }

    public String export(Shape ...shapes){
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }
}
