package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class KeyCycleOscillator {
    private static final java.lang.String TAG = "KeyCycleOscillator";
    private androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
    private androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator mCycleOscillator;
    private java.lang.String mType;
    private int mWaveShape = 0;
    private java.lang.String mWaveString = null;
    public int mVariesBy = 0;
    java.util.ArrayList<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint> mWavePoints = new java.util.ArrayList<>();

    protected void setCustom(java.lang.Object obj) {
    }

    public void setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f) {
    }

    public static androidx.constraintlayout.core.motion.utils.KeyCycleOscillator makeWidgetCycle(java.lang.String str) {
        if (str.equals("pathRotate")) {
            return new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet(str);
        }
        return new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CoreSpline(str);
    }

    private static class CoreSpline extends androidx.constraintlayout.core.motion.utils.KeyCycleOscillator {
        java.lang.String type;
        int typeId;

        public CoreSpline(java.lang.String str) {
            this.type = str;
            this.typeId = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.getId(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f) {
            motionWidget.setValue(this.typeId, get(f));
        }
    }

    public static class PathRotateSet extends androidx.constraintlayout.core.motion.utils.KeyCycleOscillator {
        java.lang.String type;
        int typeId;

        public PathRotateSet(java.lang.String str) {
            this.type = str;
            this.typeId = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.getId(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f) {
            motionWidget.setValue(this.typeId, get(f));
        }

        public void setPathRotate(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f, double d, double d2) {
            motionWidget.setRotationZ(get(f) + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(d2, d))));
        }
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    static class WavePoint {
        float mOffset;
        float mPeriod;
        float mPhase;
        int mPosition;
        float mValue;

        public WavePoint(int i, float f, float f2, float f3, float f4) {
            this.mPosition = i;
            this.mValue = f4;
            this.mOffset = f2;
            this.mPeriod = f;
            this.mPhase = f3;
        }
    }

    public java.lang.String toString() {
        java.lang.String str = this.mType;
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("##.##");
        for (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint wavePoint : this.mWavePoints) {
            str = str + com.ironsource.y8.i.d + wavePoint.mPosition + " , " + decimalFormat.format(wavePoint.mValue) + "] ";
        }
        return str;
    }

    public void setType(java.lang.String str) {
        this.mType = str;
    }

    public float get(float f) {
        return (float) this.mCycleOscillator.getValues(f);
    }

    public float getSlope(float f) {
        return (float) this.mCycleOscillator.getSlope(f);
    }

    public androidx.constraintlayout.core.motion.utils.CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i, int i2, java.lang.String str, int i3, float f, float f2, float f3, float f4, java.lang.Object obj) {
        this.mWavePoints.add(new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.mVariesBy = i3;
        }
        this.mWaveShape = i2;
        setCustom(obj);
        this.mWaveString = str;
    }

    public void setPoint(int i, int i2, java.lang.String str, int i3, float f, float f2, float f3, float f4) {
        this.mWavePoints.add(new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.mVariesBy = i3;
        }
        this.mWaveShape = i2;
        this.mWaveString = str;
    }

    public void setup(float f) {
        int size = this.mWavePoints.size();
        if (size == 0) {
            return;
        }
        java.util.Collections.sort(this.mWavePoints, new java.util.Comparator<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint>() { // from class: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.1
            @Override // java.util.Comparator
            public int compare(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint wavePoint, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint wavePoint2) {
                return java.lang.Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
            }
        });
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, 3);
        this.mCycleOscillator = new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator(this.mWaveShape, this.mWaveString, this.mVariesBy, size);
        int i = 0;
        for (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint wavePoint : this.mWavePoints) {
            dArr[i] = ((double) wavePoint.mPeriod) * 0.01d;
            dArr2[i][0] = wavePoint.mValue;
            dArr2[i][1] = wavePoint.mOffset;
            dArr2[i][2] = wavePoint.mPhase;
            this.mCycleOscillator.setPoint(i, wavePoint.mPosition, wavePoint.mPeriod, wavePoint.mOffset, wavePoint.mPhase, wavePoint.mValue);
            i++;
        }
        this.mCycleOscillator.setup(f);
        this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(0, dArr, dArr2);
    }

    private static class IntDoubleSort {
        private IntDoubleSort() {
        }

        static void sort(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int iPartition = partition(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = iPartition - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = iPartition + 1;
                }
            }
        }

        private static int partition(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, i4, i2);
            return i4;
        }

        private static void swap(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    private static class IntFloatFloatSort {
        private IntFloatFloatSort() {
        }

        static void sort(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int iPartition = partition(iArr, fArr, fArr2, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = iPartition - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = iPartition + 1;
                }
            }
        }

        private static int partition(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, fArr2, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, fArr2, i4, i2);
            return i4;
        }

        private static void swap(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
            float f2 = fArr2[i];
            fArr2[i] = fArr2[i2];
            fArr2[i2] = f2;
        }
    }

    static class CycleOscillator {
        private static final java.lang.String TAG = "CycleOscillator";
        static final int UNSET = -1;
        private final int OFFST;
        private final int PHASE;
        private final int VALUE;
        androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
        float[] mOffset;
        androidx.constraintlayout.core.motion.utils.Oscillator mOscillator;
        float mPathLength;
        float[] mPeriod;
        float[] mPhase;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;

        CycleOscillator(int i, java.lang.String str, int i2, int i3) {
            androidx.constraintlayout.core.motion.utils.Oscillator oscillator = new androidx.constraintlayout.core.motion.utils.Oscillator();
            this.mOscillator = oscillator;
            this.OFFST = 0;
            this.PHASE = 1;
            this.VALUE = 2;
            this.mWaveShape = i;
            this.mVariesBy = i2;
            oscillator.setType(i, str);
            this.mValues = new float[i3];
            this.mPosition = new double[i3];
            this.mPeriod = new float[i3];
            this.mOffset = new float[i3];
            this.mPhase = new float[i3];
            this.mScale = new float[i3];
        }

        public double getValues(float f) {
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos(f, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = this.mOffset[0];
                dArr[1] = this.mPhase[0];
                dArr[2] = this.mValues[0];
            }
            double[] dArr2 = this.mSplineValueCache;
            return dArr2[0] + (this.mOscillator.getValue(f, dArr2[1]) * this.mSplineValueCache[2]);
        }

        public double getLastPhase() {
            return this.mSplineValueCache[1];
        }

        public double getSlope(float f) {
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                double d = f;
                curveFit.getSlope(d, this.mSplineSlopeCache);
                this.mCurveFit.getPos(d, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineSlopeCache;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double value = this.mOscillator.getValue(d2, this.mSplineValueCache[1]);
            double slope = this.mOscillator.getSlope(d2, this.mSplineValueCache[1], this.mSplineSlopeCache[1]);
            double[] dArr2 = this.mSplineSlopeCache;
            return dArr2[0] + (value * dArr2[2]) + (slope * this.mSplineValueCache[2]);
        }

        public void setPoint(int i, int i2, float f, float f2, float f3, float f4) {
            this.mPosition[i] = ((double) i2) / 100.0d;
            this.mPeriod[i] = f;
            this.mOffset[i] = f2;
            this.mPhase[i] = f3;
            this.mValues[i] = f4;
        }

        public void setup(float f) {
            this.mPathLength = f;
            double[][] dArr = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, this.mPosition.length, 3);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[fArr.length + 2];
            this.mSplineSlopeCache = new double[fArr.length + 2];
            if (this.mPosition[0] > 0.0d) {
                this.mOscillator.addPoint(0.0d, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.mOffset[i];
                dArr3[1] = this.mPhase[i];
                dArr3[2] = this.mValues[i];
                this.mOscillator.addPoint(this.mPosition[i], this.mPeriod[i]);
            }
            this.mOscillator.normalize();
            double[] dArr4 = this.mPosition;
            if (dArr4.length > 1) {
                this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(0, dArr4, dArr);
            } else {
                this.mCurveFit = null;
            }
        }
    }
}
