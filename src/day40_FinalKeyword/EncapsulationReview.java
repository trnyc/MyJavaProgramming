package day40_FinalKeyword;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {

    private Circle circle; // instance variable from Circle class

    private Square square; // instance variable from Square class

    public Circle getCircle(){ // Getter. Getter's return type must match with variable data type, here is Circle
        return circle;
    }

    public  void setCircle(Circle circle){ // Setter

        if(circle.getRadius() < 5){
            return;
        }

        this.circle = circle;
    }


    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }


}
