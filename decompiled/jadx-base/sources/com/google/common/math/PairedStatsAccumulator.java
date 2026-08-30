package com.google.common.math;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
public final class PairedStatsAccumulator {
    private final com.google.common.math.StatsAccumulator xStats = new com.google.common.math.StatsAccumulator();
    private final com.google.common.math.StatsAccumulator yStats = new com.google.common.math.StatsAccumulator();
    private double sumOfProductsOfDeltas = 0.0d;

    private double ensurePositive(double value) {
        if (value > 0.0d) {
            return value;
        }
        return Double.MIN_VALUE;
    }

    public void add(double x, double y) {
        this.xStats.add(x);
        if (!com.google.common.primitives.Doubles.isFinite(x) || !com.google.common.primitives.Doubles.isFinite(y)) {
            this.sumOfProductsOfDeltas = Double.NaN;
        } else if (this.xStats.count() > 1) {
            this.sumOfProductsOfDeltas += (x - this.xStats.mean()) * (y - this.yStats.mean());
        }
        this.yStats.add(y);
    }

    public void addAll(com.google.common.math.PairedStats values) {
        if (values.count() == 0) {
            return;
        }
        this.xStats.addAll(values.xStats());
        if (this.yStats.count() == 0) {
            this.sumOfProductsOfDeltas = values.sumOfProductsOfDeltas();
        } else {
            this.sumOfProductsOfDeltas += values.sumOfProductsOfDeltas() + ((values.xStats().mean() - this.xStats.mean()) * (values.yStats().mean() - this.yStats.mean()) * values.count());
        }
        this.yStats.addAll(values.yStats());
    }

    public com.google.common.math.PairedStats snapshot() {
        return new com.google.common.math.PairedStats(this.xStats.snapshot(), this.yStats.snapshot(), this.sumOfProductsOfDeltas);
    }

    public long count() {
        return this.xStats.count();
    }

    public com.google.common.math.Stats xStats() {
        return this.xStats.snapshot();
    }

    public com.google.common.math.Stats yStats() {
        return this.yStats.snapshot();
    }

    public double populationCovariance() {
        com.google.common.base.Preconditions.checkState(count() != 0);
        return this.sumOfProductsOfDeltas / count();
    }

    public final double sampleCovariance() {
        com.google.common.base.Preconditions.checkState(count() > 1);
        return this.sumOfProductsOfDeltas / (count() - 1);
    }

    public final double pearsonsCorrelationCoefficient() {
        com.google.common.base.Preconditions.checkState(count() > 1);
        if (java.lang.Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double dSumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        double dSumOfSquaresOfDeltas2 = this.yStats.sumOfSquaresOfDeltas();
        com.google.common.base.Preconditions.checkState(dSumOfSquaresOfDeltas > 0.0d);
        com.google.common.base.Preconditions.checkState(dSumOfSquaresOfDeltas2 > 0.0d);
        return ensureInUnitRange(this.sumOfProductsOfDeltas / java.lang.Math.sqrt(ensurePositive(dSumOfSquaresOfDeltas * dSumOfSquaresOfDeltas2)));
    }

    public final com.google.common.math.LinearTransformation leastSquaresFit() {
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

    private static double ensureInUnitRange(double value) {
        return com.google.common.primitives.Doubles.constrainToRange(value, -1.0d, 1.0d);
    }
}
