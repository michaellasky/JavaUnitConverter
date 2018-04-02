package com.nuclearhorsestudios.UnitConverter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UnitConverter {

    interface Dimension {
        BigDecimal getMultiplier();
    }

    public interface Length extends Dimension {}
    public interface Mass extends Dimension {}

    // BigDecimal instantiates cleaner with strings.
    // "1.5" stays 1.5, not 1.4999999999999...
    private static final String METERS_MULTIPLIER = "1";
    private static final String CENTIMETERS_MULTIPLIER = "0.01";
    private static final String KILOMETERS_MULTIPLIER = "1000";
    private static final String MILES_MULTIPLIER = "1609.34";
    private static final String INCHES_MULTIPLIER = "0.0254";
    private static final String FEET_MULTIPLIER = "0.3048";
    private static final String YARDS_MULTIPLIER = "0.9144";
    private static final String N_MILES_MULTIPLIER = "1852";

    private static final String GRAMS_MULTIPLIER = "1";
    private static final String KILOGRAMS_MULTIPLIER = "1000";
    private static final String POUNDS_MULTIPLIER = "453.592";
    private static final String STONE_MULTIPLIER = "6350.29";

    public enum Lengths implements Length {
        CENTIMETERS (new BigDecimal(CENTIMETERS_MULTIPLIER)),
        METERS (new BigDecimal(METERS_MULTIPLIER)),
        KILOMETERS (new BigDecimal(KILOMETERS_MULTIPLIER)),
        MILES (new BigDecimal(MILES_MULTIPLIER)),
        INCHES (new BigDecimal(INCHES_MULTIPLIER)),
        FEET (new BigDecimal(FEET_MULTIPLIER)),
        YARDS (new BigDecimal(YARDS_MULTIPLIER)),
        NAUTICAL_MILES (new BigDecimal(N_MILES_MULTIPLIER));

        public final BigDecimal multiplier;

        Lengths (BigDecimal multiplier) {
            this.multiplier = multiplier;
        }

        public BigDecimal getMultiplier () {
            return this.multiplier;
        }
    }

    public enum Masses implements Mass {
        POUNDS (new BigDecimal(POUNDS_MULTIPLIER)),
        KILOGRAMS (new BigDecimal(KILOGRAMS_MULTIPLIER)),
        GRAMS (new BigDecimal(GRAMS_MULTIPLIER)),
        STONE (new BigDecimal(STONE_MULTIPLIER));

        public final BigDecimal multiplier;

        Masses (BigDecimal multiplier) {
            this.multiplier = multiplier;
        }

        public BigDecimal getMultiplier () {
            return this.multiplier;
        }
    }

    public static <T extends Length> BigDecimal convert (
            BigDecimal num,
            T fromType,
            T toType)
    {
        return unsafeConvert(num, fromType, toType);
    }

    public static <T extends Mass> BigDecimal convert (
            BigDecimal num,
            T fromType,
            T toType)
    {
        return unsafeConvert(num, fromType, toType);
    }

    // This is unsafe in the sense that you could pass it conflicting Dimensions
    // For example, a Length and a Mass.  The public methods enforce dimension
    // sameness
    private static <T extends Dimension> BigDecimal unsafeConvert (
            BigDecimal num,
            T fromType,
            T toType)
    {
        BigDecimal inBaseUnit = num.multiply(fromType.getMultiplier());
        BigDecimal mult = toType.getMultiplier();

        return inBaseUnit.divide(mult, 8, RoundingMode.HALF_UP);
    }
}
