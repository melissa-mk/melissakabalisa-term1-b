package rw.ac.rca.melissakabalisaterm1b.services;

import rw.ac.rca.melissakabalisaterm1b.exceptions.InvalidOperationException;

public interface MathOperator {
    double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}