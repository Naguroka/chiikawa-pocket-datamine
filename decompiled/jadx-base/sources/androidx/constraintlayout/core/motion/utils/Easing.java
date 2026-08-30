package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class Easing {
    private static final java.lang.String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final java.lang.String ANTICIPATE = "cubic(0.36, 0, 0.66, -0.56)";
    private static final java.lang.String ANTICIPATE_NAME = "anticipate";
    private static final java.lang.String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final java.lang.String LINEAR = "cubic(1, 1, 0, 0)";
    private static final java.lang.String OVERSHOOT = "cubic(0.34, 1.56, 0.64, 1)";
    private static final java.lang.String OVERSHOOT_NAME = "overshoot";
    private static final java.lang.String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    java.lang.String str = "identity";
    static androidx.constraintlayout.core.motion.utils.Easing sDefault = new androidx.constraintlayout.core.motion.utils.Easing();
    private static final java.lang.String STANDARD_NAME = "standard";
    private static final java.lang.String ACCELERATE_NAME = "accelerate";
    private static final java.lang.String DECELERATE_NAME = "decelerate";
    private static final java.lang.String LINEAR_NAME = "linear";
    public static java.lang.String[] NAMED_EASING = {STANDARD_NAME, ACCELERATE_NAME, DECELERATE_NAME, LINEAR_NAME};

    public double get(double d) {
        return d;
    }

    public double getDiff(double d) {
        return 1.0d;
    }

    public static androidx.constraintlayout.core.motion.utils.Easing getInterpolator(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing(str);
        }
        if (str.startsWith("spline")) {
            return new androidx.constraintlayout.core.motion.utils.StepCurve(str);
        }
        if (str.startsWith("Schlick")) {
            return new androidx.constraintlayout.core.motion.utils.Schlick(str);
        }
        str.hashCode();
        switch (str) {
            case "accelerate":
                return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing(ACCELERATE);
            case "decelerate":
                return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing(DECELERATE);
            case "anticipate":
                return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing(ANTICIPATE);
            case "linear":
                return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing(LINEAR);
            case "overshoot":
                return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing(OVERSHOOT);
            case "standard":
                return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing(STANDARD);
            default:
                java.lang.System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + java.util.Arrays.toString(NAMED_EASING));
                return sDefault;
        }
    }

    public java.lang.String toString() {
        return this.str;
    }

    static class CubicEasing extends androidx.constraintlayout.core.motion.utils.Easing {
        private static double d_error = 1.0E-4d;
        private static double error = 0.01d;
        double x1;
        double x2;
        double y1;
        double y2;

        CubicEasing(java.lang.String str) {
            this.str = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.x1 = java.lang.Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.y1 = java.lang.Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.x2 = java.lang.Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.y2 = java.lang.Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        public CubicEasing(double d, double d2, double d3, double d4) {
            setup(d, d2, d3, d4);
        }

        void setup(double d, double d2, double d3, double d4) {
            this.x1 = d;
            this.y1 = d2;
            this.x2 = d3;
            this.y2 = d4;
        }

        private double getX(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.x1 * d2 * d3 * d) + (this.x2 * d3 * d * d) + (d * d * d);
        }

        private double getY(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.y1 * d2 * d3 * d) + (this.y2 * d3 * d * d) + (d * d * d);
        }

        private double getDiffX(double d) {
            double d2 = 1.0d - d;
            double d3 = this.x1;
            double d4 = this.x2;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        private double getDiffY(double d) {
            double d2 = 1.0d - d;
            double d3 = this.y1;
            double d4 = this.y2;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double getDiff(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > d_error) {
                d2 *= 0.5d;
                d3 = getX(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (getY(d5) - getY(d4)) / (getX(d5) - getX(d4));
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double get(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > error) {
                d2 *= 0.5d;
                d3 = getX(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double x = getX(d4);
            double d5 = d3 + d2;
            double x2 = getX(d5);
            double y = getY(d4);
            return (((getY(d5) - y) * (d - x)) / (x2 - x)) + y;
        }
    }
}
