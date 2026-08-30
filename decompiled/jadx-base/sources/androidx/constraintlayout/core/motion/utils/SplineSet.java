package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class SplineSet {
    private static final java.lang.String TAG = "SplineSet";
    private int count;
    protected androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
    private java.lang.String mType;
    protected int[] mTimePoints = new int[10];
    protected float[] mValues = new float[10];

    public void setProperty(androidx.constraintlayout.core.motion.utils.TypedValues typedValues, float f) {
        typedValues.setValue(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(this.mType), get(f));
    }

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

    public float get(float f) {
        return (float) this.mCurveFit.getPos(f, 0);
    }

    public float getSlope(float f) {
        return (float) this.mCurveFit.getSlope(f, 0);
    }

    public androidx.constraintlayout.core.motion.utils.CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i, float f) {
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.count + 1) {
            this.mTimePoints = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = java.util.Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i2 = this.count;
        iArr2[i2] = i;
        this.mValues[i2] = f;
        this.count = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public void setup(int i) {
        int i2 = this.count;
        if (i2 == 0) {
            return;
        }
        androidx.constraintlayout.core.motion.utils.SplineSet.Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i2 - 1);
        int i3 = 1;
        for (int i4 = 1; i4 < this.count; i4++) {
            int[] iArr = this.mTimePoints;
            if (iArr[i4 - 1] != iArr[i4]) {
                i3++;
            }
        }
        double[] dArr = new double[i3];
        double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i3, 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.count; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.mTimePoints;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = ((double) this.mTimePoints[i6]) * 0.01d;
                    dArr2[i5][0] = this.mValues[i6];
                    i5++;
                }
            } else {
                dArr[i5] = ((double) this.mTimePoints[i6]) * 0.01d;
                dArr2[i5][0] = this.mValues[i6];
                i5++;
            }
        }
        this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
    }

    public static androidx.constraintlayout.core.motion.utils.SplineSet makeCustomSpline(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray customArray) {
        return new androidx.constraintlayout.core.motion.utils.SplineSet.CustomSet(str, customArray);
    }

    public static androidx.constraintlayout.core.motion.utils.SplineSet makeCustomSplineSet(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar customVar) {
        return new androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline(str, customVar);
    }

    public static androidx.constraintlayout.core.motion.utils.SplineSet makeSpline(java.lang.String str, long j) {
        return new androidx.constraintlayout.core.motion.utils.SplineSet.CoreSpline(str, j);
    }

    private static class Sort {
        private Sort() {
        }

        static void doubleQuickSort(int[] iArr, float[] fArr, int i, int i2) {
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

    public static class CustomSet extends androidx.constraintlayout.core.motion.utils.SplineSet {
        java.lang.String mAttributeName;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i2);
                androidx.constraintlayout.core.motion.CustomAttribute customAttributeValueAt = this.mConstraintAttributeList.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                customAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i, float f) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setPoint(int i, androidx.constraintlayout.core.motion.CustomAttribute customAttribute) {
            this.mConstraintAttributeList.append(i, customAttribute);
        }

        public void setProperty(androidx.constraintlayout.core.state.WidgetFrame widgetFrame, float f) {
            this.mCurveFit.getPos(f, this.mTempValues);
            widgetFrame.setCustomValue(this.mConstraintAttributeList.valueAt(0), this.mTempValues);
        }
    }

    private static class CoreSpline extends androidx.constraintlayout.core.motion.utils.SplineSet {
        long start;
        java.lang.String type;

        public CoreSpline(java.lang.String str, long j) {
            this.type = str;
            this.start = j;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(androidx.constraintlayout.core.motion.utils.TypedValues typedValues, float f) {
            typedValues.setValue(typedValues.getId(this.type), get(f));
        }
    }

    public static class CustomSpline extends androidx.constraintlayout.core.motion.utils.SplineSet {
        java.lang.String mAttributeName;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mTempValues;

        public CustomSpline(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i2);
                androidx.constraintlayout.core.motion.CustomVariable customVariableValueAt = this.mConstraintAttributeList.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                customVariableValueAt.getValuesToInterpolate(this.mTempValues);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i, float f) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(androidx.constraintlayout.core.motion.utils.TypedValues typedValues, float f) {
            setProperty((androidx.constraintlayout.core.motion.MotionWidget) typedValues, f);
        }

        public void setPoint(int i, androidx.constraintlayout.core.motion.CustomVariable customVariable) {
            this.mConstraintAttributeList.append(i, customVariable);
        }

        public void setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f) {
            this.mCurveFit.getPos(f, this.mTempValues);
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mTempValues);
        }
    }
}
