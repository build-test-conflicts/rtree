package com.github.davidmoten.rtree.geometry;

import rx.functions.Func2;

public final class Intersects {

    private Intersects() {
        // prevent instantiation
    }

    public static final Func2<Rectangle, Circle, Boolean> rectangleIntersectsCircle = new Func2<Rectangle, Circle, Boolean>() {
        @Override
        public Boolean call(Rectangle rectangle, Circle circle) {
            return circle.intersects(rectangle);
        }
    };

    public static final Func2<Circle, Rectangle, Boolean> circleIntersectsRectangle = new Func2<Circle, Rectangle, Boolean>() {
        @Override
        public Boolean call(Circle circle, Rectangle rectangle) {
            return circle.intersects(rectangle);
        }
    };

    public static final Func2<Point, Circle, Boolean> pointIntersectsCircle = new Func2<Point, Circle, Boolean>() {
        @Override
        public Boolean call(Point point, Circle circle) {
            return circle.intersects(point);
        }
    };

    public static final Func2<Circle, Point, Boolean> circleIntersectsPoint = new Func2<Circle, Point, Boolean>() {
        @Override
        public Boolean call(Circle circle, Point point) {
            return circle.intersects(point);
        }
    };

    public static final Func2<Circle, Circle, Boolean> circleIntersectsCircle = new Func2<Circle, Circle, Boolean>() {
        @Override
        public Boolean call(Circle a, Circle b) {
            return a.intersects(b);
        }
    };

    public static final Func2<Line, Line, Boolean> lineIntersectsLine = new Func2<Line, Line, Boolean>() {
        @Override
        public Boolean call(Line a, Line b) {
            return a.intersects(b);
        }
    };

    public static final Func2<Line, Rectangle, Boolean> lineIntersectsRectangle = new Func2<Line, Rectangle, Boolean>() {
        @Override
        public Boolean call(Line a, Rectangle r) {
            return a.intersects(r);
        }
    };

    public static final Func2<Rectangle, Line, Boolean> rectangleIntersectsLine = new Func2<Rectangle, Line, Boolean>() {
        @Override
        public Boolean call(Rectangle r, Line a) {
            return a.intersects(r);
        }
    };

    public static final Func2<Line, Circle, Boolean> lineIntersectsCircle = new Func2<Line, Circle, Boolean>() {
        @Override
        public Boolean call(Line a, Circle c) {
            return a.intersects(c);
        }
    };

    public static final Func2<Circle, Line, Boolean> circleIntersectsLine = new Func2<Circle, Line, Boolean>() {
        @Override
        public Boolean call(Circle c, Line a) {
            return a.intersects(c);
        }
    };

    public static final Func2<Line, Point, Boolean> lineIntersectsPoint = new Func2<Line, Point, Boolean>() {

        @Override
        public Boolean call(Line line, Point point) {
            return line.intersects(point.mbr());
        }
    };

    public static final Func2<Point, Line, Boolean> pointIntersectsLine = new Func2<Point, Line, Boolean>() {

        @Override
        public Boolean call(Point point, Line line) {
            return line.intersects(point.mbr());
        }
    };

}
