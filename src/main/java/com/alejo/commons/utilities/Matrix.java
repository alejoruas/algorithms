package com.alejo.commons.utilities;

public final class Matrix {

    /** Put rows like columns in a new matrix */
    public static String[] rotate(String[] matrix) {
        String[] result = new String[matrix[0].length()];
        
        for (int i = 0; i < result.length; i++) {
            StringBuilder builder = new StringBuilder("");
            for (int j = 0; j < matrix.length; j++) {
                builder.append(matrix[j].charAt(i));
            }
            result[i] = builder.toString();
        }
        return result;
    }

    /**Take the diagonals (45 degrades up) like rows in a new String array  */
    public static String[] rotate45Up(String[] matrix) {
        String[] result = new String[matrix.length * 2 - 1];  
        int count = 0;
        int actualColumnStart = 0;
        int actualRowStart = 0;
        int rowIndex = actualRowStart;
        int columnIndex = actualColumnStart;
        
        while (count < result.length) {
            StringBuilder builder = new StringBuilder("");
            while (rowIndex >= 0 && columnIndex < matrix.length) {
                builder.append(matrix[rowIndex].charAt(columnIndex));
                rowIndex--;
                columnIndex++;
            }
            result[count] = builder.toString();

            count++;

            if (count < matrix.length) actualRowStart++;
            if (count >= matrix.length) actualColumnStart++;

            rowIndex = actualRowStart;
            columnIndex = actualColumnStart;           
        }
        return result;
    }

    /**Take the diagonals (315 degree down) like rows in a new String array*/
    public static String[] rotate45Down(String[] matrix) {
        String[] result = new String[matrix.length * 2 - 1];  
        int count = 0;       
        int actualColumnStart = matrix.length - 1;
        int actualRowStart = 0;
        int rowIndex = actualRowStart;
        int columnIndex = actualColumnStart;
        
        while (count < result.length) {
            StringBuilder builder = new StringBuilder("");
            while (columnIndex < matrix.length && rowIndex < matrix.length) {
                builder.append(matrix[rowIndex].charAt(columnIndex));
                rowIndex++;
                columnIndex++;
            }
            result[count] = builder.toString();

            count++;

            if (count < matrix.length) actualColumnStart--;
            if (count >= matrix.length) actualRowStart++;

            rowIndex = actualRowStart;
            columnIndex = actualColumnStart;           
        }
        return result;
    }
}
