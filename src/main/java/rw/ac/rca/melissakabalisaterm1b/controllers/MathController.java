package rw.ac.rca.melissakabalisaterm1b.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rw.ac.rca.melissakabalisaterm1b.dtos.DoMathRequestDto;
import rw.ac.rca.melissakabalisaterm1b.exceptions.InvalidOperationException;
import rw.ac.rca.melissakabalisaterm1b.payload.ApiResponse;
import rw.ac.rca.melissakabalisaterm1b.services.serviceImpl.MathOperatorImpl;

@RestController
@RequestMapping("/api/do_math")
public class MathController {
    private final MathOperatorImpl mathOperatorImpl;

    public MathController(MathOperatorImpl mathOperatorImpl) {
        this.mathOperatorImpl = mathOperatorImpl;
    }

    @PostMapping
    public ResponseEntity<ApiResponse> create(@RequestBody DoMathRequestDto dto) throws InvalidOperationException {
        return ResponseEntity.ok(ApiResponse.success(mathOperatorImpl.doMath(dto.getOperand1(), dto.getOperand2(), dto.getOperation())));
    }
}