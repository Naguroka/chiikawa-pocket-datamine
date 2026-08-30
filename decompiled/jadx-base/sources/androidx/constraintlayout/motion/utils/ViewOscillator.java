package androidx.constraintlayout.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewOscillator extends androidx.constraintlayout.core.motion.utils.KeyCycleOscillator {
    private static final java.lang.String TAG = "ViewOscillator";

    public abstract void setProperty(android.view.View view, float t);

    public static androidx.constraintlayout.motion.utils.ViewOscillator makeSpline(java.lang.String str) {
        if (str.startsWith("CUSTOM")) {
            return new androidx.constraintlayout.motion.utils.ViewOscillator.CustomSet();
        }
        str.hashCode();
        switch (str) {
            case "rotationX":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.RotationXset();
            case "rotationY":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.RotationYset();
            case "translationX":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.TranslationXset();
            case "translationY":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.TranslationYset();
            case "translationZ":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.TranslationZset();
            case "progress":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.ProgressSet();
            case "scaleX":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.ScaleXset();
            case "scaleY":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.ScaleYset();
            case "waveVariesBy":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.AlphaSet();
            case "rotation":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.RotationSet();
            case "elevation":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.ElevationSet();
            case "transitionPathRotate":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet();
            case "alpha":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.AlphaSet();
            case "waveOffset":
                return new androidx.constraintlayout.motion.utils.ViewOscillator.AlphaSet();
            default:
                return null;
        }
    }

    static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            view.setElevation(get(t));
        }
    }

    static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            view.setAlpha(get(t));
        }
    }

    static class RotationSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            view.setRotation(get(t));
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            view.setRotationX(get(t));
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            view.setRotationY(get(t));
        }
    }

    public static class PathRotateSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
        }

        public void setPathRotate(android.view.View view, float t, double dx, double dy) {
            view.setRotation(get(t) + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(dy, dx))));
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            view.setScaleX(get(t));
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            view.setScaleY(get(t));
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            view.setTranslationX(get(t));
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            view.setTranslationY(get(t));
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            view.setTranslationZ(get(t));
        }
    }

    static class CustomSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        protected androidx.constraintlayout.widget.ConstraintAttribute mCustom;
        float[] value = new float[1];

        CustomSet() {
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        protected void setCustom(java.lang.Object custom) {
            this.mCustom = (androidx.constraintlayout.widget.ConstraintAttribute) custom;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View view, float t) {
            this.value[0] = get(t);
            androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(this.mCustom, view, this.value);
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
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
                    android.util.Log.e(androidx.constraintlayout.motion.utils.ViewOscillator.TAG, "unable to setProgress", e);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    android.util.Log.e(androidx.constraintlayout.motion.utils.ViewOscillator.TAG, "unable to setProgress", e2);
                }
            }
        }
    }
}
