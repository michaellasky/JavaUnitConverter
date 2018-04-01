import org.junit.Test;
import java.math.BigDecimal;

import static com.nuclearhorsestudios.UnitConverter.UnitConverter.*;
import static junit.framework.Assert.assertEquals;

public class UnitConverterTest {

    private final BigDecimal bd1 = BigDecimal.ONE;

    private final Lengths m = Lengths.METERS;
    private final Lengths cm = Lengths.CENTIMETERS;
    private final Lengths in = Lengths.INCHES;
    private final Lengths km = Lengths.KILOMETERS;
    private final Lengths mi = Lengths.MILES;
    private final Lengths ft = Lengths.FEET;
    private final Lengths yd = Lengths.YARDS;
    private final Lengths nm = Lengths.NAUTICAL_MILES;

    private final Masses kg = Masses.KILOGRAMS;
    private final Masses lb = Masses.POUNDS;
    private final Masses g = Masses.GRAMS;
    private final Masses st = Masses.STONE;

    // Lengths

    @Test
    public void testMetersToMeters () {
        BigDecimal val = convert(bd1, m, m);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testMetersToCentimeters () {
        BigDecimal val = convert(bd1, m, cm);
        assertEquals(val.doubleValue(), 100d);
    }

    @Test
    public void testMetersToInches () {
        BigDecimal val = convert(bd1, m, in);
        assertEquals(val.doubleValue(), 39.37007874d);
    }

    @Test
    public void testMetersToKilometers () {
        BigDecimal val = convert(bd1, m, km);
        assertEquals(val.doubleValue(), 0.001d);
    }

    @Test
    public void testMetersToMiles () {
        BigDecimal val = convert(bd1, m, mi);
        assertEquals(val.doubleValue(), 0.00062137d);
    }

    @Test
    public void testMetersToFeet () {
        BigDecimal val = convert(bd1, m, ft);
        assertEquals(val.doubleValue(), 3.2808399d);
    }

    @Test
    public void testMetersToYards () {
        BigDecimal val = convert(bd1, m, yd);
        assertEquals(val.doubleValue(), 1.0936133d);
    }

    @Test
    public void testMetersToNauticalMiles () {
        BigDecimal val = convert(bd1, m, nm);
        assertEquals(val.doubleValue(), 0.00053996d);
    }

    @Test
    public void testCentimetersToCentimeters () {
        BigDecimal val = convert(bd1, cm, cm);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testCentimetersToMeters () {
        BigDecimal val = convert(bd1, cm, m);
        assertEquals(val.doubleValue(), 0.01d);
    }

    @Test
    public void testCentimetersToKilometers () {
        BigDecimal val = convert(bd1, cm, km);
        assertEquals(val.doubleValue(), 1e-5d);
    }

    @Test
    public void testCentimetersToMiles () {
        BigDecimal val = convert(bd1, cm, mi);
        assertEquals(val.doubleValue(), 6.21e-6d);
    }

    @Test
    public void testCentimetersToInches () {
        BigDecimal val = convert(bd1, cm, in);
        assertEquals(val.doubleValue(), 0.39370079d);
    }

    @Test
    public void testCentimetersToFeet () {
        BigDecimal val = convert(bd1, cm, ft);
        assertEquals(val.doubleValue(), 0.0328084d);
    }

    @Test
    public void testCentimetersToYards () {
        BigDecimal val = convert(bd1, cm, yd);
        assertEquals(val.doubleValue(), 0.01093613d);
    }

    @Test
    public void testCentimetersToNauticalMiles () {
        BigDecimal val = convert(bd1, cm, nm);
        assertEquals(val.doubleValue(), 5.4e-6d);
    }

    @Test
    public void testKilometersToKilometers () {
        BigDecimal val = convert(bd1, km, km);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testKilometersToCentimeters () {
        BigDecimal val = convert(bd1, km, cm);
        assertEquals(val.doubleValue(), 100000d);
    }

    @Test
    public void testKilometersToMeters () {
        BigDecimal val = convert(bd1, km, m);
        assertEquals(val.doubleValue(), 1000d);
    }

    @Test
    public void testKilometersToMiles () {
        BigDecimal val = convert(bd1, km, mi);
        assertEquals(val.doubleValue(), 0.62137274d);
    }

    @Test
    public void testKilometersToInches () {
        BigDecimal val = convert(bd1, km, in);
        assertEquals(val.doubleValue(), 39370.07874016d);
    }

    @Test
    public void testKilometersToFeet () {
        BigDecimal val = convert(bd1, km, ft);
        assertEquals(val.doubleValue(), 3280.83989501d);
    }

    @Test
    public void testKilometersToYards () {
        BigDecimal val = convert(bd1, km, yd);
        assertEquals(val.doubleValue(), 1093.61329834d);
    }

    @Test
    public void testKilometersToNauticalMiles () {
        BigDecimal val = convert(bd1, km, nm);
        assertEquals(val.doubleValue(), 0.5399568d);
    }

    @Test
    public void testMilesToMiles () {
        BigDecimal val = convert(bd1, mi, mi);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testMilesToCentimeters () {
        BigDecimal val = convert(bd1, mi, cm);
        assertEquals(val.doubleValue(), 160934d);
    }

    @Test
    public void testMilesToMeters () {
        BigDecimal val = convert(bd1, mi, cm);
        assertEquals(val.doubleValue(), 160934d);
    }

    @Test
    public void testMilesToKilometers () {
        BigDecimal val = convert(bd1, mi, km);
        assertEquals(val.doubleValue(), 1.60934d);
    }

    @Test
    public void testMilesToInches () {
        BigDecimal val = convert(bd1, mi, in);
        assertEquals(val.doubleValue(), 63359.84251969d);
    }

    @Test
    public void testMilesToFeet () {
        BigDecimal val = convert(bd1, mi, ft);
        assertEquals(val.doubleValue(), 5279.98687664d);
    }

    @Test
    public void testMilesToYards () {
        BigDecimal val = convert(bd1, mi, yd);
        assertEquals(val.doubleValue(), 1759.99562555d);
    }

    @Test
    public void testMilesToNauticalMiles () {
        BigDecimal val = convert(bd1, mi, nm);
        assertEquals(val.doubleValue(), 0.86897408d);
    }

    @Test
    public void testInchesToInches () {
        BigDecimal val = convert(bd1, in, in);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testInchesToCentimeters () {
        BigDecimal val = convert(bd1, in, cm);
        assertEquals(val.doubleValue(), 2.54d);
    }

    @Test
    public void testInchesToMeters () {
        BigDecimal val = convert(bd1, in, m);
        assertEquals(val.doubleValue(), 0.0254d);
    }

    @Test
    public void testInchesToKilometers () {
        BigDecimal val = convert(bd1, in, km);
        assertEquals(val.doubleValue(), 2.54e-5d);
    }

    @Test
    public void testInchesToMiles () {
        BigDecimal val = convert(bd1, in, mi);
        assertEquals(val.doubleValue(), 1.578e-5d);
    }

    @Test
    public void testInchesToFeet () {
        BigDecimal val = convert(bd1, in, ft);
        assertEquals(val.doubleValue(), 0.08333333d);
    }

    @Test
    public void testInchesToYards () {
        BigDecimal val = convert(bd1, in, yd);
        assertEquals(val.doubleValue(), 0.02777778d);
    }

    @Test
    public void testInchesToNauticalMiles () {
        BigDecimal val = convert(bd1, in, nm);
        assertEquals(val.doubleValue(), 1.371e-5d);
    }

    @Test
    public void testFeetToFeet () {
        BigDecimal val = convert(bd1, ft, ft);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testFeetToMeters () {
        BigDecimal val = convert(bd1, ft, m);
        assertEquals(val.doubleValue(), 0.3048d);
    }

    @Test
    public void testFeetToCentimeters () {
        BigDecimal val = convert(bd1, ft, cm);
        assertEquals(val.doubleValue(), 30.48d);
    }

    @Test
    public void testFeetToKilometers () {
        BigDecimal val = convert(bd1, ft, km);
        assertEquals(val.doubleValue(), 0.0003048d);
    }

    @Test
    public void testFeetToMiles () {
        BigDecimal val = convert(bd1, ft, mi);
        assertEquals(val.doubleValue(), 0.00018939d);
    }

    @Test
    public void testFeetToInches () {
        BigDecimal val = convert(bd1, ft, in);
        assertEquals(val.doubleValue(), 12d);
    }

    @Test
    public void testFeetToYards () {
        BigDecimal val = convert(bd1, ft, yd);
        assertEquals(val.doubleValue(), 0.33333333d);
    }

    @Test
    public void testFeetToNauticalMiles () {
        BigDecimal val = convert(bd1, ft, nm);
        assertEquals(val.doubleValue(), 0.00016458d);
    }

    @Test
    public void testYardsToYards () {
        BigDecimal val = convert(bd1, yd, yd);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testYardsToMeters () {
        BigDecimal val = convert(bd1, yd, m);
        assertEquals(val.doubleValue(), 0.9144d);
    }

    @Test
    public void testYardsToCentimeters () {
        BigDecimal val = convert(bd1, yd, cm);
        assertEquals(val.doubleValue(), 91.44d);
    }

    @Test
    public void testYardsToKilometers () {
        BigDecimal val = convert(bd1, yd, km);
        assertEquals(val.doubleValue(), 0.0009144d);
    }

    @Test
    public void testYardsToMiles () {
        BigDecimal val = convert(bd1, yd, mi);
        assertEquals(val.doubleValue(), 0.00056818d);
    }

    @Test
    public void testYardsToInches () {
        BigDecimal val = convert(bd1, yd, in);
        assertEquals(val.doubleValue(), 36d);
    }

    @Test
    public void testYardsToFeet () {
        BigDecimal val = convert(bd1, yd, ft);
        assertEquals(val.doubleValue(), 3d);
    }

    @Test
    public void testYardsToNauticalMiles () {
        BigDecimal val = convert(bd1, yd, nm);
        assertEquals(val.doubleValue(), 0.00049374d);
    }

    @Test
    public void testNauticalMilesToNauticalMiles () {
        BigDecimal val = convert(bd1, nm, nm);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testNauticalMilesToMeters () {
        BigDecimal val = convert(bd1, nm, m);
        assertEquals(val.doubleValue(), 1852d);
    }

    @Test
    public void testNauticalMilesToCentimeters () {
        BigDecimal val = convert(bd1, nm, cm);
        assertEquals(val.doubleValue(), 185200d);
    }

    @Test
    public void testNauticalMilesToKilometers () {
        BigDecimal val = convert(bd1, nm, km);
        assertEquals(val.doubleValue(), 1.852d);
    }

    @Test
    public void testNauticalMilesToMiles () {
        BigDecimal val = convert(bd1, nm, mi);
        assertEquals(val.doubleValue(), 1.15078231d);
    }

    @Test
    public void testNauticalMilesToInches () {
        BigDecimal val = convert(bd1, nm, in);
        assertEquals(val.doubleValue(), 72913.38582677d);
    }

    @Test
    public void testNauticalMilesToFeet () {
        BigDecimal val = convert(bd1, nm, ft);
        assertEquals(val.doubleValue(), 6076.11548556d);
    }

    @Test
    public void testNauticalMilesToYards () {
        BigDecimal val = convert(bd1, nm, yd);
        assertEquals(val.doubleValue(), 2025.37182852d);
    }

    // Masses

    @Test
    public void testKilogramsToKilograms () {
        BigDecimal val = convert(bd1, kg, kg);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testKilogramsToPounds () {
        BigDecimal val = convert(bd1, kg, lb);
        assertEquals(val.doubleValue(), 2.20462442d);
    }

    @Test
    public void testKilogramsToGrams () {
        BigDecimal val = convert(bd1, kg, g);
        assertEquals(val.doubleValue(), 1000d);
    }

    @Test
    public void testKilogramsToStone () {
        BigDecimal val = convert(bd1, kg, st);
        assertEquals(val.doubleValue(), 0.15747312d);
    }

    @Test
    public void testPoundsToPounds () {
        BigDecimal val = convert(bd1, lb, lb);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testPoundsToKilograms () {
        BigDecimal val = convert(bd1, lb, kg);
        assertEquals(val.doubleValue(), 0.453592d);
    }

    @Test
    public void testPoundsToGrams () {
        BigDecimal val = convert(bd1, lb, g);
        assertEquals(val.doubleValue(), 453.592d);
    }

    @Test
    public void testPoundsToStone () {
        BigDecimal val = convert(bd1, lb, st);
        assertEquals(val.doubleValue(), 0.07142855d);
    }

    @Test
    public void testGramsToGrams () {
        BigDecimal val = convert(bd1, g, g);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testGramsToKilograms () {
        BigDecimal val = convert(bd1, g, kg);
        assertEquals(val.doubleValue(), 0.001d);
    }

    @Test
    public void testGramsToPounds () {
        BigDecimal val = convert(bd1, g, lb);
        assertEquals(val.doubleValue(), 0.00220462d);
    }

    @Test
    public void testGramsToStone () {
        BigDecimal val = convert(bd1, g, st);
        assertEquals(val.doubleValue(), 0.00015747d);
    }

    @Test
    public void testStoneToStone () {
        BigDecimal val = convert(bd1, st, st);
        assertEquals(val.doubleValue(), 1d);
    }

    @Test
    public void testStoneToPounds () {
        BigDecimal val = convert(bd1, st, lb);
        assertEquals(val.doubleValue(), 14.00000441d);
    }

    @Test
    public void testStoneToKilograms () {
        BigDecimal val = convert(bd1, st, kg);
        assertEquals(val.doubleValue(), 6.35029d);
    }

    @Test
    public void testStoneToGrams () {
        BigDecimal val = convert(bd1, st, g);
        assertEquals(val.doubleValue(), 6350.29d);
    }
}
