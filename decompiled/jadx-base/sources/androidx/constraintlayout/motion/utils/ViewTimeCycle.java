package androidx.constraintlayout.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewTimeCycle extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
    private static final java.lang.String TAG = "ViewTimeCycle";

    public abstract boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache);

    public float get(float pos, long time, android.view.View view, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
        this.mCurveFit.getPos(pos, this.mCache);
        float f = this.mCache[1];
        if (f == 0.0f) {
            this.mContinue = false;
            return this.mCache[2];
        }
        if (java.lang.Float.isNaN(this.last_cycle)) {
            this.last_cycle = cache.getFloatValue(view, this.mType, 0);
            if (java.lang.Float.isNaN(this.last_cycle)) {
                this.last_cycle = 0.0f;
            }
        }
        this.last_cycle = (float) ((((double) this.last_cycle) + (((time - this.last_time) * 1.0E-9d) * ((double) f))) % 1.0d);
        cache.setFloatValue(view, this.mType, 0, this.last_cycle);
        this.last_time = time;
        float f2 = this.mCache[0];
        float fCalcWave = (calcWave(this.last_cycle) * f2) + this.mCache[2];
        this.mContinue = (f2 == 0.0f && f == 0.0f) ? false : true;
        return fCalcWave;
    }

    public static androidx.constraintlayout.motion.utils.ViewTimeCycle makeCustomSpline(java.lang.String str, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> attrList) {
        return new androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet(str, attrList);
    }

    public static androidx.constraintlayout.motion.utils.ViewTimeCycle makeSpline(java.lang.String str, long currentTime) {
        androidx.constraintlayout.motion.utils.ViewTimeCycle rotationXset;
        str.hashCode();
        switch (str) {
            case "rotationX":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.RotationXset();
                break;
            case "rotationY":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.RotationYset();
                break;
            case "translationX":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.TranslationXset();
                break;
            case "translationY":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.TranslationYset();
                break;
            case "translationZ":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.TranslationZset();
                break;
            case "progress":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.ProgressSet();
                break;
            case "scaleX":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.ScaleXset();
                break;
            case "scaleY":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.ScaleYset();
                break;
            case "rotation":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.RotationSet();
                break;
            case "elevation":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.ElevationSet();
                break;
            case "transitionPathRotate":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate();
                break;
            case "alpha":
                rotationXset = new androidx.constraintlayout.motion.utils.ViewTimeCycle.AlphaSet();
                break;
            default:
                return null;
        }
        rotationXset.setStartTime(currentTime);
        return rotationXset;
    }

    static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            view.setElevation(get(t, time, view, cache));
            return this.mContinue;
        }
    }

    static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            view.setAlpha(get(t, time, view, cache));
            return this.mContinue;
        }
    }

    static class RotationSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            view.setRotation(get(t, time, view, cache));
            return this.mContinue;
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            view.setRotationX(get(t, time, view, cache));
            return this.mContinue;
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            view.setRotationY(get(t, time, view, cache));
            return this.mContinue;
        }
    }

    public static class PathRotate extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            return this.mContinue;
        }

        public boolean setPathRotate(android.view.View view, androidx.constraintlayout.core.motion.utils.KeyCache cache, float t, long time, double dx, double dy) {
            view.setRotation(get(t, time, view, cache) + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(dy, dx))));
            return this.mContinue;
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            view.setScaleX(get(t, time, view, cache));
            return this.mContinue;
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            view.setScaleY(get(t, time, view, cache));
            return this.mContinue;
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            view.setTranslationX(get(t, time, view, cache));
            return this.mContinue;
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            view.setTranslationY(get(t, time, view, cache));
            return this.mContinue;
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            view.setTranslationZ(get(t, time, view, cache));
            return this.mContinue;
        }
    }

    public static class CustomSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        java.lang.String mAttributeName;
        float[] mCache;
        android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        android.util.SparseArray<float[]> mWaveProperties = new android.util.SparseArray<>();

        public CustomSet(java.lang.String attribute, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> attrList) {
            this.mAttributeName = attribute.split(",")[1];
            this.mConstraintAttributeList = attrList;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int curveType) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i];
            this.mCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, i);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i2);
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i2);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
                double[] dArr3 = dArr2[i2];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(curveType, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int position, float value, float period, int shape, float offset) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int position, androidx.constraintlayout.widget.ConstraintAttribute value, float period, int shape, float offset) {
            this.mConstraintAttributeList.append(position, value);
            this.mWaveProperties.append(position, new float[]{period, offset});
            this.mWaveShape = java.lang.Math.max(this.mWaveShape, shape);
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            this.mCurveFit.getPos(t, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f = fArr[fArr.length - 2];
            float f2 = fArr[fArr.length - 1];
            long j = time - this.last_time;
            if (java.lang.Float.isNaN(this.last_cycle)) {
                this.last_cycle = cache.getFloatValue(view, this.mAttributeName, 0);
                if (java.lang.Float.isNaN(this.last_cycle)) {
                    this.last_cycle = 0.0f;
                }
            }
            this.last_cycle = (float) ((((double) this.last_cycle) + ((j * 1.0E-9d) * ((double) f))) % 1.0d);
            this.last_time = time;
            float fCalcWave = calcWave(this.last_cycle);
            this.mContinue = false;
            for (int i = 0; i < this.mCache.length; i++) {
                this.mContinue |= ((double) this.mTempValues[i]) != 0.0d;
                this.mCache[i] = (this.mTempValues[i] * fCalcWave) + f2;
            }
            androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mCache);
            if (f != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View view, float t, long time, androidx.constraintlayout.core.motion.utils.KeyCache cache) {
            java.lang.reflect.Method method;
            if (view instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) view).setProgress(get(t, time, view, cache));
            } else {
                if (this.mNoMethod) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", java.lang.Float.TYPE);
                } catch (java.lang.NoSuchMethodException unused) {
                    this.mNoMethod = true;
                    method = null;
                }
                java.lang.reflect.Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, java.lang.Float.valueOf(get(t, time, view, cache)));
                    } catch (java.lang.IllegalAccessException e) {
                        android.util.Log.e(androidx.constraintlayout.motion.utils.ViewTimeCycle.TAG, "unable to setProgress", e);
                    } catch (java.lang.reflect.InvocationTargetException e2) {
                        android.util.Log.e(androidx.constraintlayout.motion.utils.ViewTimeCycle.TAG, "unable to setProgress", e2);
                    }
                }
            }
            return this.mContinue;
        }
    }
}
