package org.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @Test
    void evenOddNumber() {
        assertThat(MainHW.evenOddNumber(2)).isTrue();
        assertThat(MainHW.evenOddNumber(3)).isFalse();
    }


    @Test
    void numberInInterval() {
        assertThat(MainHW.numberInInterval(25)).isFalse();    // Т.к. указан диапазон (25, 100), то числа 25 и 100
        assertThat(MainHW.numberInInterval(100)).isFalse();   // исключены из валидных чисел.
        assertThat(MainHW.numberInInterval(26)).isTrue();
        assertThat(MainHW.numberInInterval(99)).isTrue();
    }
}