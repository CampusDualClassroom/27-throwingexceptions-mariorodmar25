package com.campusdual.classroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ExerciseTest {
    @Test
    @DisplayName("Test if main method throws any exception")
    void testLaunchAnyException() {
        assertThrows(Exception.class, () -> Exercise.main(null), "Exception not thrown");
    }
}