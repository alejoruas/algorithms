package com.alejo.matrixpattern.domain.model;

import com.alejo.commons.utilities.Matrix;

public class Adn {
    private String[] sequence;

    public Adn(String[] sequence) {
        this.sequence = sequence;
    }

    public String[] sequence() {
        return sequence;
    }

    public boolean havePattern() {
        System.out.println();
        this.printAdn();
        if (havePatter(this.sequence)) return true;

        if (havePatter(Matrix.rotate(this.sequence))) return true;

        if (havePatter(Matrix.rotate45Up(this.sequence))) return true;

        if (havePatter(Matrix.rotate45Down(this.sequence))) return true;

        return false;
    }

    private boolean havePatter(String matrix[]) {
        for(String row : matrix) {
            for (String pattern : MatrixPattern.PATTERNS) {
                if (row.contains(pattern)) return true;
            }
        }
        return false;
    }

    public void printAdn() {
        for(String row : sequence) {
            for (int i = 0; i < row.length(); i++) {
                System.out.print(row.substring(i, i + 1) + " ");
            }
            System.out.println(" ");
        } 
    }
}
