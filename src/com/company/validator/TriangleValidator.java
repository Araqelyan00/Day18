package com.company.validator;
import com.company.model.*;

public class TriangleValidator {

public static boolean isValidSide(int side) {
    return (side >= 1 && side <= 20);
}

public static boolean checkTriangle(TriangleModel triangle) {
    return (triangle != null && isValidTriangle(triangle));
}

private static boolean isValidTriangle(TriangleModel triangle) {
    if (triangle == null) {
        return false;
    }
    if (triangle.getSideA() + triangle.getSideB() <= triangle.getSideC()) {
        return false;
    }
    if (triangle.getSideA() + triangle.getSideC() <= triangle.getSideB()) {
        return false;
    }
        return triangle.getSideC() + triangle.getSideB() > triangle.getSideA();
}

    public static boolean isRightTriangle(TriangleModel triangle) {
        int max = Math.max(Math.max(triangle.getSideA(), triangle.getSideB()), triangle.getSideC());
        int min = Math.min(Math.min(triangle.getSideA(), triangle.getSideB()), triangle.getSideC());
        int mid = triangle.getSideA() + triangle.getSideB() + triangle.getSideC() - max - min;
        return (Math.pow(max, 2) == Math.pow(min, 2) + Math.pow(mid, 2));
    }

}
