package com.google.common.math;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
public final class PairedStats implements java.io.Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final com.google.common.math.Stats xStats;
    private final com.google.common.math.Stats yStats;

    private static double ensureInUnitRange(double value) {
        if (value >= 1.0d) {
            return 1.0d;
        }
        if (value <= -1.0d) {
            return -1.0d;
        }
        return value;
    }

    private static double ensurePositive(double value) {
        if (value > 0.0d) {
            return value;
        }
        return Double.MIN_VALUE;
    }

    PairedStats(com.google.common.math.Stats xStats, com.google.common.math.Stats yStats, double sumOfProductsOfDeltas) {
        this.xStats = xStats;
        this.yStats = yStats;
        this.sumOfProductsOfDeltas = sumOfProductsOfDeltas;
    }

    public long count() {
        return this.xStats.count();
    }

    public com.google.common.math.Stats xStats() {
        return this.xStats;
    }

    public com.google.common.math.Stats yStats() {
        return this.yStats;
    }

    public double populationCovariance() {
        com.google.common.base.Preconditions.checkState(count() != 0);
        return this.sumOfProductsOfDeltas / count();
    }

    public double sampleCovariance() {
        com.google.common.base.Preconditions.checkState(count() > 1);
        return this.sumOfProductsOfDeltas / (count() - 1);
    }

    public double pearsonsCorrelationCoefficient() {
        com.google.common.base.Preconditions.checkState(count() > 1);
        if (java.lang.Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double dSumOfSquaresOfDeltas = xStats().sumOfSquaresOfDeltas();
        double dSumOfSquaresOfDeltas2 = yStats().sumOfSquaresOfDeltas();
        com.google.common.base.Preconditions.checkState(dSumOfSquaresOfDeltas > 0.0d);
        com.google.common.base.Preconditions.checkState(dSumOfSquaresOfDeltas2 > 0.0d);
        return ensureInUnitRange(this.sumOfProductsOfDeltas / java.lang.Math.sqrt(ensurePositive(dSumOfSquaresOfDeltas * dSumOfSquaresOfDeltas2)));
    }

    public com.google.common.math.LinearTransformation leastSquaresFit() {
        com.google.common.base.Preconditions.checkState(count() > 1);
        if (java.lang.Double.isNaN(this.sumOfProductsOfDeltas)) {
            return com.google.common.math.LinearTransformation.forNaN();
        }
        double dSumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        if (dSumOfSquaresOfDeltas <= 0.0d) {
            com.google.common.base.Preconditions.checkState(this.yStats.sumOfSquaresOfDeltas() > 0.0d);
            return com.google.common.math.LinearTransformation.vertical(this.xStats.mean());
        }
        if (this.yStats.sumOfSquaresOfDeltas() > 0.0d) {
            return com.google.common.math.LinearTransformation.mapping(this.xStats.mean(), this.yStats.mean()).withSlope(this.sumOfProductsOfDeltas / dSumOfSquaresOfDeltas);
        }
        return com.google.common.math.LinearTransformation.horizontal(this.yStats.mean());
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.common.math.PairedStats pairedStats = (com.google.common.math.PairedStats) obj;
        return this.xStats.equals(pairedStats.xStats) && this.yStats.equals(pairedStats.yStats) && java.lang.Double.doubleToLongBits(this.sumOfProductsOfDeltas) == java.lang.Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas);
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.xStats, this.yStats, java.lang.Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public java.lang.String toString() {
        if (count() > 0) {
            return com.google.common.base.MoreObjects.toStringHelper(this).add("xStats", this.xStats).add("yStats", this.yStats).add("populationCovariance", populationCovariance()).toString();
        }
        return com.google.common.base.MoreObjects.toStringHelper(this).add("xStats", this.xStats).add("yStats", this.yStats).toString();
    }

    double sumOfProductsOfDeltas() {
        return this.sumOfProductsOfDeltas;
    }

    public byte[] toByteArray() {
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(88).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.xStats.writeTo(byteBufferOrder);
        this.yStats.writeTo(byteBufferOrder);
        byteBufferOrder.putDouble(this.sumOfProductsOfDeltas);
        return byteBufferOrder.array();
    }

    public static com.google.common.math.PairedStats fromByteArray(byte[] byteArray) {
        com.google.common.base.Preconditions.checkNotNull(byteArray);
        com.google.common.base.Preconditions.checkArgument(byteArray.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, byteArray.length);
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(byteArray).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return new com.google.common.math.PairedStats(com.google.common.math.Stats.readFrom(byteBufferOrder), com.google.common.math.Stats.readFrom(byteBufferOrder), byteBufferOrder.getDouble());
    }
}
