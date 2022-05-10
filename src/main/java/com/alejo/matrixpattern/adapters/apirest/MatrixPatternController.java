package com.alejo.matrixpattern.adapters.apirest;

import com.alejo.matrixpattern.domain.ports.CheckMatrixPatternService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class MatrixPatternController {
    private CheckMatrixPatternService checkMatrixPatternService;

    public MatrixPatternController(CheckMatrixPatternService checkMatrixPatternService) {
        this.checkMatrixPatternService = checkMatrixPatternService;
    }

    @PostMapping("/pattern")
    public ResponseEntity havePattern(@RequestBody Request request) {
        if (checkMatrixPatternService.havePattern(request.sequence()))
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
}

final class Request {
    private String[] sequence;

    public String[] sequence() {
        return sequence;
    }

    public void setSequence(String[] sequence) {
        this.sequence = sequence;
    }        
}
