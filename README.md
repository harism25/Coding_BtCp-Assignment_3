# Coding_BtCp-Assignment_3
 
 
On this assignment the following scenario is implemented using the Strategy pattern:

You have a product named 'T-Shirt' that has the following three variations:

1. Color, {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}
2. Size, {XS, S, M, L, XL, XXL, XXXL}
3. Fabric, {WOOL, COTTON, POLYESTER, RAYON, LINEN, CASHMERE, SILK}

Each variation gets a different price tag.

Each product can be paid via three different payment methods:

1. Credit / Debit cards
2. Money / Bank Transfer
3. Cash

Construct a Strategy pattern that implements the variations and the payment methods
under three combined strategies that implement all the possible combinations as follows:

1. Color, Size and Fabric with Credit / Debit Cards
2. Color, Size and Fabric with Money / Bank Transfer
3. Color, Size and Fabric with Cash
