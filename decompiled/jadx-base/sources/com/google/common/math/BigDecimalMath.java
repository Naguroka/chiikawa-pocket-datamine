package com.google.common.math;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
public class BigDecimalMath {
    private BigDecimalMath() {
    }

    public static double roundToDouble(java.math.BigDecimal x, java.math.RoundingMode mode) {
        return com.google.common.math.BigDecimalMath.BigDecimalToDoubleRounder.INSTANCE.roundToDouble(x, mode);
    }

    private static class BigDecimalToDoubleRounder extends com.google.common.math.ToDoubleRounder<java.math.BigDecimal> {
        static final com.google.common.math.BigDecimalMath.BigDecimalToDoubleRounder INSTANCE = new com.google.common.math.BigDecimalMath.BigDecimalToDoubleRounder();

        private BigDecimalToDoubleRounder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public double roundToDoubleArbitrarily(java.math.BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public int sign(java.math.BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public java.math.BigDecimal toX(double d, java.math.RoundingMode mode) {
            return new java.math.BigDecimal(d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public java.math.BigDecimal minus(java.math.BigDecimal a2, java.math.BigDecimal b) {
            return a2.subtract(b);
        }
    }
}
