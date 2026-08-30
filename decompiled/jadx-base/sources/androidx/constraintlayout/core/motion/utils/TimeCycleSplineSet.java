package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class TimeCycleSplineSet {
    protected static final int CURVE_OFFSET = 2;
    protected static final int CURVE_PERIOD = 1;
    protected static final int CURVE_VALUE = 0;
    private static final java.lang.String TAG = "SplineSet";
    protected static float VAL_2PI = 6.2831855f;
    protected int count;
    protected long last_time;
    protected androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
    protected java.lang.String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 10, 3);
    protected float[] mCache = new float[3];
    protected boolean mContinue = false;
    protected float last_cycle = Float.NaN;

    public java.lang.String toString() {
        java.lang.String str = this.mType;
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("##.##");
        for (int i = 0; i < this.count; i++) {
            str = str + com.ironsource.y8.i.d + this.mTimePoints[i] + " , " + decimalFormat.format(this.mValues[i]) + "] ";
        }
        return str;
    }

    public void setType(java.lang.String str) {
        this.mType = str;
    }

    protected float calcWave(float f) {
        float fAbs;
        switch (this.mWaveShape) {
            case 1:
                return java.lang.Math.signum(f * VAL_2PI);
            case 2:
                fAbs = java.lang.Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) java.lang.Math.cos(f * VAL_2PI);
            case 6:
                float fAbs2 = 1.0f - java.lang.Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) java.lang.Math.sin(f * VAL_2PI);
        }
        return 1.0f - fAbs;
    }

    public androidx.constraintlayout.core.motion.utils.CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    protected void setStartTime(long j) {
        this.last_time = j;
    }

    public void setPoint(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.mTimePoints;
        int i3 = this.count;
        iArr[i3] = i;
        float[] fArr = this.mValues[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.mWaveShape = java.lang.Math.max(this.mWaveShape, i2);
        this.count++;
    }

    public static class CustomSet extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
        java.lang.String mAttributeName;
        float[] mCache;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mTempValues;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray mWaveProperties = new androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray();

        public CustomSet(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i2 = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i2];
            this.mCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i3);
                androidx.constraintlayout.core.motion.CustomAttribute customAttributeValueAt = this.mConstraintAttributeList.valueAt(i3);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                customAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i, androidx.constraintlayout.core.motion.CustomAttribute customAttribute, float f, int i2, float f2) {
            this.mConstraintAttributeList.append(i, customAttribute);
            this.mWaveProperties.append(i, new float[]{f, f2});
            this.mWaveShape = java.lang.Math.max(this.mWaveShape, i2);
        }

        public boolean setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            this.mCurveFit.getPos(f, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.last_time;
            if (java.lang.Float.isNaN(this.last_cycle)) {
                this.last_cycle = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                if (java.lang.Float.isNaN(this.last_cycle)) {
                    this.last_cycle = 0.0f;
                }
            }
            this.last_cycle = (float) ((((double) this.last_cycle) + ((j2 * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.last_time = j;
            float fCalcWave = calcWave(this.last_cycle);
            this.mContinue = false;
            for (int i = 0; i < this.mCache.length; i++) {
                this.mContinue |= ((double) this.mTempValues[i]) != 0.0d;
                this.mCache[i] = (this.mTempValues[i] * fCalcWave) + f3;
            }
            motionWidget.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), this.mCache);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    public void setup(int i) {
        int i2 = this.count;
        if (i2 == 0) {
            java.lang.System.err.println("Error no points added to " + this.mType);
            return;
        }
        androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i4, 3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.count; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.mTimePoints;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = ((double) this.mTimePoints[i6]) * 0.01d;
                    double[] dArr3 = dArr2[i5];
                    float[] fArr = this.mValues[i6];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i5++;
                }
            } else {
                dArr[i5] = ((double) this.mTimePoints[i6]) * 0.01d;
                double[] dArr4 = dArr2[i5];
                float[] fArr2 = this.mValues[i6];
                dArr4[0] = fArr2[0];
                dArr4[1] = fArr2[1];
                dArr4[2] = fArr2[2];
                i5++;
            }
        }
        this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
    }

    protected static class Sort {
        protected Sort() {
        }

        static void doubleQuickSort(int[] iArr, float[][] fArr, int i, int i2) {
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

        private static int partition(int[] iArr, float[][] fArr, int i, int i2) {
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

        private static void swap(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    public static class CustomVarSet extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
        java.lang.String mAttributeName;
        float[] mCache;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mTempValues;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray mWaveProperties = new androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray();

        public CustomVarSet(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i2 = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i2];
            this.mCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i3);
                androidx.constraintlayout.core.motion.CustomVariable customVariableValueAt = this.mConstraintAttributeList.valueAt(i3);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                customVariableValueAt.getValuesToInterpolate(this.mTempValues);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i, androidx.constraintlayout.core.motion.CustomVariable customVariable, float f, int i2, float f2) {
            this.mConstraintAttributeList.append(i, customVariable);
            this.mWaveProperties.append(i, new float[]{f, f2});
            this.mWaveShape = java.lang.Math.max(this.mWaveShape, i2);
        }

        public boolean setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            this.mCurveFit.getPos(f, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.last_time;
            if (java.lang.Float.isNaN(this.last_cycle)) {
                this.last_cycle = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                if (java.lang.Float.isNaN(this.last_cycle)) {
                    this.last_cycle = 0.0f;
                }
            }
            this.last_cycle = (float) ((((double) this.last_cycle) + ((j2 * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.last_time = j;
            float fCalcWave = calcWave(this.last_cycle);
            this.mContinue = false;
            for (int i = 0; i < this.mCache.length; i++) {
                this.mContinue |= ((double) this.mTempValues[i]) != 0.0d;
                this.mCache[i] = (this.mTempValues[i] * fCalcWave) + f3;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mCache);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }
    }
}
