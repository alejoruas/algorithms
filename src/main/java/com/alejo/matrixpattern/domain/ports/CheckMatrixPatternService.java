package com.alejo.matrixpattern.domain.ports;

import com.alejo.commons.utilities.Service;
import com.alejo.matrixpattern.domain.model.Adn;

@Service
public final class CheckMatrixPatternService {
    public CheckMatrixPatternService() {}

    public boolean havePattern(String[] sequence) {
        Adn adn = new Adn(sequence);
        return adn.havePattern();
    }
}