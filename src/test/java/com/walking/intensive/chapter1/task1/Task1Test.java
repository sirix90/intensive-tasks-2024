package com.walking.intensive.chapter1.task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter1.task1.Task1.getAgeString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class Task1Test {


    @ParameterizedTest
    @MethodSource("dataSource")
    void getAgeStringTest(String expected, Integer value) {
        assertEquals(expected, getAgeString(value));
    }

    static Stream<Arguments> dataSource() {
        return Stream.of(
                of("Вам 0 лет", 0),
                of("Вам 1 год", 1),
                of("Вам 2 года", 2),
                of("Вам 3 года", 3),
                of("Вам 4 года", 4),
                of("Вам 5 лет", 5),
                of("Вам 6 лет", 6),
                of("Вам 7 лет", 7),
                of("Вам 8 лет", 8),
                of("Вам 9 лет", 9),
                of("Вам 10 лет", 10),
                of("Вам 11 лет", 11),
                of("Вам 12 лет", 12),
                of("Вам 13 лет", 13),
                of("Вам 14 лет", 14),
                of("Вам 15 лет", 15),
                of("Вам 16 лет", 16),
                of("Вам 17 лет", 17),
                of("Вам 18 лет", 18),
                of("Вам 19 лет", 19),
                of("Вам 20 лет", 20),
                of("Вам 21 год", 21),
                of("Вам 22 года", 22),
                of("Вам 23 года", 23),
                of("Вам 24 года", 24),
                of("Вам 25 лет", 25),
                of("Вам 26 лет", 26),
                of("Вам 27 лет", 27),
                of("Вам 28 лет", 28),
                of("Вам 29 лет", 29),
                of("Вам 30 лет", 30),
                of("Вам 31 год", 31),
                of("Вам 32 года", 32),
                of("Вам 33 года", 33),
                of("Вам 34 года", 34),
                of("Вам 35 лет", 35),
                of("Вам 36 лет", 36),
                of("Вам 37 лет", 37),
                of("Вам 38 лет", 38),
                of("Вам 39 лет", 39),
                of("Вам 40 лет", 40),
                of("Вам 41 год", 41),
                of("Вам 42 года", 42),
                of("Вам 43 года", 43),
                of("Вам 44 года", 44),
                of("Вам 45 лет", 45),
                of("Вам 46 лет", 46),
                of("Вам 47 лет", 47),
                of("Вам 48 лет", 48),
                of("Вам 49 лет", 49),
                of("Вам 50 лет", 50),
                of("Вам 51 год", 51),
                of("Вам 52 года", 52),
                of("Вам 53 года", 53),
                of("Вам 54 года", 54),
                of("Вам 55 лет", 55),
                of("Вам 56 лет", 56),
                of("Вам 57 лет", 57),
                of("Вам 58 лет", 58),
                of("Вам 59 лет", 59),
                of("Вам 60 лет", 60),
                of("Вам 61 год", 61),
                of("Вам 62 года", 62),
                of("Вам 63 года", 63),
                of("Вам 64 года", 64),
                of("Вам 65 лет", 65),
                of("Вам 66 лет", 66),
                of("Вам 67 лет", 67),
                of("Вам 68 лет", 68),
                of("Вам 69 лет", 69),
                of("Вам 70 лет", 70),
                of("Вам 71 год", 71),
                of("Вам 72 года", 72),
                of("Вам 73 года", 73),
                of("Вам 74 года", 74),
                of("Вам 75 лет", 75),
                of("Вам 76 лет", 76),
                of("Вам 77 лет", 77),
                of("Вам 78 лет", 78),
                of("Вам 79 лет", 79),
                of("Вам 80 лет", 80),
                of("Вам 81 год", 81),
                of("Вам 82 года", 82),
                of("Вам 83 года", 83),
                of("Вам 84 года", 84),
                of("Вам 85 лет", 85),
                of("Вам 86 лет", 86),
                of("Вам 87 лет", 87),
                of("Вам 88 лет", 88),
                of("Вам 89 лет", 89),
                of("Вам 90 лет", 90),
                of("Вам 91 год", 91),
                of("Вам 92 года", 92),
                of("Вам 93 года", 93),
                of("Вам 94 года", 94),
                of("Вам 95 лет", 95),
                of("Вам 96 лет", 96),
                of("Вам 97 лет", 97),
                of("Вам 98 лет", 98),
                of("Вам 99 лет", 99),
                of("Вам 100 лет", 100),
                of("Вам 101 год", 101),
                of("Вам 102 года", 102),
                of("Вам 103 года", 103),
                of("Вам 104 года", 104),
                of("Вам 105 лет", 105),
                of("Вам 106 лет", 106),
                of("Вам 107 лет", 107),
                of("Вам 108 лет", 108),
                of("Вам 109 лет", 109),
                of("Вам 110 лет", 110),
                of("Вам 111 лет", 111),
                of("Вам 112 лет", 112),
                of("Вам 113 лет", 113),
                of("Вам 114 лет", 114),
                of("Вам 115 лет", 115),
                of("Вам 116 лет", 116),
                of("Вам 117 лет", 117),
                of("Вам 118 лет", 118),
                of("Вам 119 лет", 119),
                of("Вам 120 лет", 120),
                of("Вам 121 год", 121),
                of("Вам 122 года", 122),
                of("Вам 123 года", 123),
                of("Вам 124 года", 124),
                of("Вам 125 лет", 125),
                of("Вам 126 лет", 126),
                of("Вам 127 лет", 127)
        );
    }
}
