package com.google.common.math;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
public abstract class LinearTransformation {
    public abstract com.google.common.math.LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double x);

    public static com.google.common.math.LinearTransformation.LinearTransformationBuilder mapping(double x1, double y1) {
        com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(x1) && com.google.common.math.DoubleUtils.isFinite(y1));
        return new com.google.common.math.LinearTransformation.LinearTransformationBuilder(x1, y1);
    }

    public static final class LinearTransformationBuilder {
        private final double x1;
        private final double y1;

        private LinearTransformationBuilder(double x1, double y1) {
            this.x1 = x1;
            this.y1 = y1;
        }

        public com.google.common.math.LinearTransformation and(double x2, double y2) {
            com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(x2) && com.google.common.math.DoubleUtils.isFinite(y2));
            double d = this.x1;
            if (x2 == d) {
                com.google.common.base.Preconditions.checkArgument(y2 != this.y1);
                return new com.google.common.math.LinearTransformation.VerticalLinearTransformation(this.x1);
            }
            return withSlope((y2 - this.y1) / (x2 - d));
        }

        public com.google.common.math.LinearTransformation withSlope(double slope) {
            com.google.common.base.Preconditions.checkArgument(!java.lang.Double.isNaN(slope));
            if (com.google.common.math.DoubleUtils.isFinite(slope)) {
                return new com.google.common.math.LinearTransformation.RegularLinearTransformation(slope, this.y1 - (this.x1 * slope));
            }
            return new com.google.common.math.LinearTransformation.VerticalLinearTransformation(this.x1);
        }
    }

    public static com.google.common.math.LinearTransformation vertical(double x) {
        com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(x));
        return new com.google.common.math.LinearTransformation.VerticalLinearTransformation(x);
    }

    public static com.google.common.math.LinearTransformation horizontal(double y) {
        com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(y));
        return new com.google.common.math.LinearTransformation.RegularLinearTransformation(0.0d, y);
    }

    public static com.google.common.math.LinearTransformation forNaN() {
        return com.google.common.math.LinearTransformation.NaNLinearTransformation.INSTANCE;
    }

    private static final class RegularLinearTransformation extends com.google.common.math.LinearTransformation {

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        com.google.common.math.LinearTransformation inverse;
        final double slope;
        final double yIntercept;

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        RegularLinearTransformation(double slope, double yIntercept) {
            this.slope = slope;
            this.yIntercept = yIntercept;
            this.inverse = null;
        }

        RegularLinearTransformation(double slope, double yIntercept, com.google.common.math.LinearTransformation inverse) {
            this.slope = slope;
            this.yIntercept = yIntercept;
            this.inverse = inverse;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return this.slope == 0.0d;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return this.slope;
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double x) {
            return (x * this.slope) + this.yIntercept;
        }

        @Override // com.google.common.math.LinearTransformation
        public com.google.common.math.LinearTransformation inverse() {
            com.google.common.math.LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            com.google.common.math.LinearTransformation linearTransformationCreateInverse = createInverse();
            this.inverse = linearTransformationCreateInverse;
            return linearTransformationCreateInverse;
        }

        public java.lang.String toString() {
            return java.lang.String.format("y = %g * x + %g", java.lang.Double.valueOf(this.slope), java.lang.Double.valueOf(this.yIntercept));
        }

        private com.google.common.math.LinearTransformation createInverse() {
            double d = this.slope;
            if (d != 0.0d) {
                return new com.google.common.math.LinearTransformation.RegularLinearTransformation(1.0d / d, (this.yIntercept * (-1.0d)) / d, this);
            }
            return new com.google.common.math.LinearTransformation.VerticalLinearTransformation(this.yIntercept, this);
        }
    }

    private static final class VerticalLinearTransformation extends com.google.common.math.LinearTransformation {

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        com.google.common.math.LinearTransformation inverse;
        final double x;

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return true;
        }

        VerticalLinearTransformation(double x) {
            this.x = x;
            this.inverse = null;
        }

        VerticalLinearTransformation(double x, com.google.common.math.LinearTransformation inverse) {
            this.x = x;
            this.inverse = inverse;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double x) {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.math.LinearTransformation
        public com.google.common.math.LinearTransformation inverse() {
            com.google.common.math.LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            com.google.common.math.LinearTransformation linearTransformationCreateInverse = createInverse();
            this.inverse = linearTransformationCreateInverse;
            return linearTransformationCreateInverse;
        }

        public java.lang.String toString() {
            return java.lang.String.format("x = %g", java.lang.Double.valueOf(this.x));
        }

        private com.google.common.math.LinearTransformation createInverse() {
            return new com.google.common.math.LinearTransformation.RegularLinearTransformation(0.0d, this.x, this);
        }
    }

    private static final class NaNLinearTransformation extends com.google.common.math.LinearTransformation {
        static final com.google.common.math.LinearTransformation.NaNLinearTransformation INSTANCE = new com.google.common.math.LinearTransformation.NaNLinearTransformation();

        @Override // com.google.common.math.LinearTransformation
        public com.google.common.math.LinearTransformation inverse() {
            return this;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return Double.NaN;
        }

        public java.lang.String toString() {
            return "NaN";
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double x) {
            return Double.NaN;
        }

        private NaNLinearTransformation() {
        }
    }
}
