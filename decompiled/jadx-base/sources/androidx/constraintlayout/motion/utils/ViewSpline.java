package androidx.constraintlayout.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewSpline extends androidx.constraintlayout.core.motion.utils.SplineSet {
    private static final java.lang.String TAG = "ViewSpline";

    public abstract void setProperty(android.view.View view, float t);

    public static androidx.constraintlayout.motion.utils.ViewSpline makeCustomSpline(java.lang.String str, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> attrList) {
        return new androidx.constraintlayout.motion.utils.ViewSpline.CustomSet(str, attrList);
    }

    public static androidx.constraintlayout.motion.utils.ViewSpline makeSpline(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return new androidx.constraintlayout.motion.utils.ViewSpline.RotationXset();
            case "rotationY":
                return new androidx.constraintlayout.motion.utils.ViewSpline.RotationYset();
            case "translationX":
                return new androidx.constraintlayout.motion.utils.ViewSpline.TranslationXset();
            case "translationY":
                return new androidx.constraintlayout.motion.utils.ViewSpline.TranslationYset();
            case "translationZ":
                return new androidx.constraintlayout.motion.utils.ViewSpline.TranslationZset();
            case "progress":
                return new androidx.constraintlayout.motion.utils.ViewSpline.ProgressSet();
            case "scaleX":
                return new androidx.constraintlayout.motion.utils.ViewSpline.ScaleXset();
            case "scaleY":
                return new androidx.constraintlayout.motion.utils.ViewSpline.ScaleYset();
            case "waveVariesBy":
                return new androidx.constraintlayout.motion.utils.ViewSpline.AlphaSet();
            case "transformPivotX":
                return new androidx.constraintlayout.motion.utils.ViewSpline.PivotXset();
            case "transformPivotY":
                return new androidx.constraintlayout.motion.utils.ViewSpline.PivotYset();
            case "rotation":
                return new androidx.constraintlayout.motion.utils.ViewSpline.RotationSet();
            case "elevation":
                return new androidx.constraintlayout.motion.utils.ViewSpline.ElevationSet();
            case "transitionPathRotate":
                return new androidx.constraintlayout.motion.utils.ViewSpline.PathRotate();
            case "alpha":
                return new androidx.constraintlayout.motion.utils.ViewSpline.AlphaSet();
            case "waveOffset":
                return new androidx.constraintlayout.motion.utils.ViewSpline.AlphaSet();
            default:
                return null;
        }
    }

    static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setElevation(get(t));
        }
    }

    static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setAlpha(get(t));
        }
    }

    static class RotationSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setRotation(get(t));
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setRotationX(get(t));
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setRotationY(get(t));
        }
    }

    static class PivotXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        PivotXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setPivotX(get(t));
        }
    }

    static class PivotYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        PivotYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setPivotY(get(t));
        }
    }

    public static class PathRotate extends androidx.constraintlayout.motion.utils.ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
        }

        public void setPathRotate(android.view.View view, float t, double dx, double dy) {
            view.setRotation(get(t) + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(dy, dx))));
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setScaleX(get(t));
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setScaleY(get(t));
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setTranslationX(get(t));
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setTranslationY(get(t));
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewSpline {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            view.setTranslationZ(get(t));
        }
    }

    public static class CustomSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        java.lang.String mAttributeName;
        android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(java.lang.String attribute, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> attrList) {
            this.mAttributeName = attribute.split(",")[1];
            this.mConstraintAttributeList = attrList;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int curveType) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i);
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i);
                dArr[i] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i2 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i2 < fArr.length) {
                        dArr2[i][i2] = fArr[i2];
                        i2++;
                    }
                }
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(curveType, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int position, float value) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setPoint(int position, androidx.constraintlayout.widget.ConstraintAttribute value) {
            this.mConstraintAttributeList.append(position, value);
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            this.mCurveFit.getPos(t, this.mTempValues);
            androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mTempValues);
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View view, float t) {
            java.lang.reflect.Method method;
            if (view instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) view).setProgress(get(t));
                return;
            }
            if (this.mNoMethod) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", java.lang.Float.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                this.mNoMethod = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, java.lang.Float.valueOf(get(t)));
                } catch (java.lang.IllegalAccessException e) {
                    android.util.Log.e(androidx.constraintlayout.motion.utils.ViewSpline.TAG, "unable to setProgress", e);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    android.util.Log.e(androidx.constraintlayout.motion.utils.ViewSpline.TAG, "unable to setProgress", e2);
                }
            }
        }
    }
}
