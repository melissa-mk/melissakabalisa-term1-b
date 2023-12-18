package rw.ac.rca.melissakabalisaterm1b.services;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import rw.ac.rca.melissakabalisaterm1b.exceptions.InvalidOperationException;
import rw.ac.rca.melissakabalisaterm1b.services.serviceImpl.MathOperatorImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathOperatorServiceTest {

    @InjectMocks
    private MathOperatorImpl mathOperatorService;

    @Test
    public void should_create_math_operation_success() throws InvalidOperationException {
        double operator1 = 4;
        double operator2 = 9;
        String operation = "+";

        double mathOperation = mathOperatorService.doMath(operator1,operator2, operation);
        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(mathOperation);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(mathOperation).usingRecursiveComparison().isEqualTo(actualMathOperator);
    }

}