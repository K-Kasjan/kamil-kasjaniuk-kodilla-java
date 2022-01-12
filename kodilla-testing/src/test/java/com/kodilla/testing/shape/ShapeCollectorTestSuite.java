package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("ShapeCollector test")
public class ShapeCollectorTestSuite {
    private static int testId = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Shape Collector Test start");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("Test ended.");
    }

    @BeforeEach
    void beforeEachTest(){
        System.out.println("Beginning test "+(++testId));
    }

    @Nested
    @DisplayName("Square test")
    class SquareTest{
        @Test
        void testSquareGetShapeName(){
            //Given
            Square square = new Square(10,"Square");

            //When
            String squareName = square.getShapeName();

            //Then
            Assertions.assertEquals("Square",squareName);
        }

        @Test
        void testSquareGetField(){
            //Given
            Square square = new Square(10,"Square");

            //When
            double squareField = square.getField();

            //Then
            Assertions.assertEquals(100,squareField);
        }
    }
    @Nested
    @DisplayName("Triangle test")
    class TriangleTest{
        @Test
        void testTriangleGetShapeName(){
            //Given
            Triangle triangle = new Triangle(10,10,"Triangle");

            //When
            String triangleName = triangle.getShapeName();

            //Then
            Assertions.assertEquals("Triangle",triangleName);
        }

        @Test
        void testTriangleGetField(){
            //Given
            Triangle triangle = new Triangle(10,10,"Triangle");

            //When
            double triangleField = triangle.getField();

            //Then
            Assertions.assertEquals(50,triangleField);
        }
    }
    @Nested
    @DisplayName("Circle test")
    class CircleTest{
        @Test
        void testCircleGetShapeName(){
            //Given
            Circle circle = new Circle(10,"Circle");

            //When
            String circleName = circle.getShapeName();

            //Then
            Assertions.assertEquals("Circle",  circleName);
        }

        @Test
        void testCircleField(){
            //Given
            Circle circle = new Circle(10,"Circle");

            //When
            double circleField = circle.getField();

            //Then
            Assertions.assertEquals((double) (22*10*10)/7,circleField);
        }
    }

    @Nested
    @DisplayName("Shape Collector test")
    class ShapeCollectorTest{
        @Test
        void testShapeCollectorAddFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(10,"Test Square");

            //When
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(1,shapeCollector.getShapeList().size());
        }

        @Test
        void testShapeCollectorRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(10,"Test Square");
            shapeCollector.addFigure(square);

            //When
            shapeCollector.removeFigure(square);

            //Then
            Assertions.assertEquals(0, shapeCollector.getShapeList().size());
        }

        @Test
        void testShapeCollectorGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(10,"Test Square");
            shapeCollector.addFigure(square);

            //When
            Square newSquare = (Square) shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(square,newSquare);

        }

        @Test
        void testShapeCollectorGetShapeList(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(10,"Test Square");
            Square square2 = new Square(12,"Test Square 2");
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square2);

            List<Shape> expectedShapeArrayList = new ArrayList<>();
            expectedShapeArrayList.add(square);
            expectedShapeArrayList.add(square2);

            //When
            List<Shape> shapeArrayList = shapeCollector.getShapeList();

            //Then
            Assertions.assertEquals(expectedShapeArrayList, shapeArrayList);
        }
    }
}
