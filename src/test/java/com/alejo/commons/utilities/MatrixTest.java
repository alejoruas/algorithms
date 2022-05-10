package com.alejo.commons.utilities;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MatrixTest {
    @Test
    void testRotate() {
        String[] matrix = {"123", "543", "789"};
        String[] result = Matrix.rotate(matrix);

        assertTrue("157".equals(result[0]));
        assertTrue("248".equals(result[1]));
        assertTrue("339".equals(result[2]));
    }

    @Test
    void testRotate45Up() {
        String[] matrix = {"12", "34"};
        String[] result = Matrix.rotate45Up(matrix);

        assertTrue("1".equals(result[0]));
        assertTrue("32".equals(result[1]));
        assertTrue("4".equals(result[2]));
    }

    @Test
    void testRotate45Down() {
        String[] matrix = {"12", "34"};
        String[] result = Matrix.rotate45Down(matrix);

        assertTrue("2".equals(result[0]));
        assertTrue("14".equals(result[1]));
        assertTrue("3".equals(result[2]));
    }
}
