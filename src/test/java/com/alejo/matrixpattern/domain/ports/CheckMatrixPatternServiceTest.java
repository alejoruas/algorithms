package com.alejo.matrixpattern.domain.ports;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CheckMatrixPatternServiceTest {
    @Test
    void testhavePatternHorizontal() {
        String[] sequence = {"ATGCGA","CCCCGT","TTATGT","AGAAGG","CGCCTA","TCACTG"};

        CheckMatrixPatternService checkMutantService = new CheckMatrixPatternService();
        assertTrue(checkMutantService.havePattern(sequence));
    }

    @Test
    void testhavePatternVertical() {
        String[] sequence = {"ATGCGA","CTCCGT","TTATGT","ATAAGG","CGCCTA","TCACTG"};

        CheckMatrixPatternService checkMutantService = new CheckMatrixPatternService();
        assertTrue(checkMutantService.havePattern(sequence));
    }

    @Test
    void testhavePatternDiagonalUp() {
        String[] sequence = {"ATGCGA","CACCGT","TTATGT","ATAAGG","CGCCTA","TCACTG"};

        CheckMatrixPatternService checkMutantService = new CheckMatrixPatternService();
        assertTrue(checkMutantService.havePattern(sequence));
    }

    @Test
    void testhavePatternDiagonalDown() {
        String[] sequence = {"ATGCGA","CACCAT","TGAAGT","ATAAGG","CGCCTA","TCACTG"};

        CheckMatrixPatternService checkMutantService = new CheckMatrixPatternService();
        assertTrue(checkMutantService.havePattern(sequence));
    }

    @Test
    void testhaveNoPattern() {
        String[] sequence = {"ATGCGA","CTCCGT","TGAACT","ATAAGG","CGCCTA","TCACTG"};

        CheckMatrixPatternService checkMutantService = new CheckMatrixPatternService();
        assertFalse(checkMutantService.havePattern(sequence));
    }
}
