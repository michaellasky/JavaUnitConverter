# JavaUnitConverter
A quick and dirty unit converter for java that enforces unit dimensionality (ie: cannot convert Meters to Kilograms) 

Other solutions tend to be rediculously complex for when you just want to convert meters to feet, etc.  This is approx 100 LOC, and can be extended pretty easily.  

# Usage

To convert 1 foot to 12 inches:

     UnitConverter.convert(1, UnitConverter.Lengths.FEET, UnitConverter.Lengths.INCHES);

To convert 1337 Kilograms to Pounds:

     UnitConverter.convert(1337, UnitConverter.Masses.KILOGRAMS, UnitConverter.Masses.POUNDS);
