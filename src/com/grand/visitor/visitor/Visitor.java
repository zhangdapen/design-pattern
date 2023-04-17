package com.grand.visitor.visitor;

import com.grand.visitor.shapes.Circle;
import com.grand.visitor.shapes.CompoundShape;
import com.grand.visitor.shapes.Dot;
import com.grand.visitor.shapes.Rectangle;
import com.grand.visitor.shapes.Triangle;

/**
 * @author zhanghongwei
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundShape(CompoundShape compoundShape);

    String visitTriangle(Triangle triangle);
}
