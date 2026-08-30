package androidx.dynamicanimation.animation;

/* JADX INFO: loaded from: classes.dex */
public abstract class DynamicAnimation<T extends androidx.dynamicanimation.animation.DynamicAnimation<T>> implements androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback {
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;
    private static final float THRESHOLD_MULTIPLIER = 0.75f;
    private static final float UNSET = Float.MAX_VALUE;
    private final java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener> mEndListeners;
    private long mLastFrameTime;
    float mMaxValue;
    float mMinValue;
    private float mMinVisibleChange;
    final androidx.dynamicanimation.animation.FloatPropertyCompat mProperty;
    boolean mRunning;
    boolean mStartValueIsSet;
    final java.lang.Object mTarget;
    private final java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener> mUpdateListeners;
    float mValue;
    float mVelocity;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_X = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("translationX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.1
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setTranslationX(f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getTranslationX();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_Y = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("translationY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.2
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setTranslationY(f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getTranslationY();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_Z = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("translationZ") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.3
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            androidx.core.view.ViewCompat.setTranslationZ(view, f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return androidx.core.view.ViewCompat.getTranslationZ(view);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCALE_X = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("scaleX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.4
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setScaleX(f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getScaleX();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCALE_Y = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("scaleY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.5
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setScaleY(f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getScaleY();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty(androidx.constraintlayout.motion.widget.Key.ROTATION) { // from class: androidx.dynamicanimation.animation.DynamicAnimation.6
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setRotation(f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getRotation();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION_X = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("rotationX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.7
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setRotationX(f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getRotationX();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION_Y = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("rotationY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.8
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setRotationY(f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getRotationY();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty X = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("x") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.9
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setX(f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getX();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty Y = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("y") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.10
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setY(f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getY();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty Z = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("z") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.11
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            androidx.core.view.ViewCompat.setZ(view, f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return androidx.core.view.ViewCompat.getZ(view);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ALPHA = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("alpha") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.12
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setAlpha(f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getAlpha();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCROLL_X = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("scrollX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.13
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setScrollX((int) f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getScrollX();
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCROLL_Y = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("scrollY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.14
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(android.view.View view, float f) {
            view.setScrollY((int) f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(android.view.View view) {
            return view.getScrollY();
        }
    };

    public interface OnAnimationEndListener {
        void onAnimationEnd(androidx.dynamicanimation.animation.DynamicAnimation dynamicAnimation, boolean z, float f, float f2);
    }

    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(androidx.dynamicanimation.animation.DynamicAnimation dynamicAnimation, float f, float f2);
    }

    abstract float getAcceleration(float f, float f2);

    abstract boolean isAtEquilibrium(float f, float f2);

    abstract void setValueThreshold(float f);

    abstract boolean updateValueAndVelocity(long j);

    public static abstract class ViewProperty extends androidx.dynamicanimation.animation.FloatPropertyCompat<android.view.View> {
        private ViewProperty(java.lang.String str) {
            super(str);
        }
    }

    static class MassState {
        float mValue;
        float mVelocity;

        MassState() {
        }
    }

    DynamicAnimation(final androidx.dynamicanimation.animation.FloatValueHolder floatValueHolder) {
        this.mVelocity = 0.0f;
        this.mValue = Float.MAX_VALUE;
        this.mStartValueIsSet = false;
        this.mRunning = false;
        this.mMaxValue = Float.MAX_VALUE;
        this.mMinValue = -Float.MAX_VALUE;
        this.mLastFrameTime = 0L;
        this.mEndListeners = new java.util.ArrayList<>();
        this.mUpdateListeners = new java.util.ArrayList<>();
        this.mTarget = null;
        this.mProperty = new androidx.dynamicanimation.animation.FloatPropertyCompat("FloatValueHolder") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.15
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(java.lang.Object obj) {
                return floatValueHolder.getValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(java.lang.Object obj, float f) {
                floatValueHolder.setValue(f);
            }
        };
        this.mMinVisibleChange = 1.0f;
    }

    <K> DynamicAnimation(K k, androidx.dynamicanimation.animation.FloatPropertyCompat<K> floatPropertyCompat) {
        this.mVelocity = 0.0f;
        this.mValue = Float.MAX_VALUE;
        this.mStartValueIsSet = false;
        this.mRunning = false;
        this.mMaxValue = Float.MAX_VALUE;
        this.mMinValue = -Float.MAX_VALUE;
        this.mLastFrameTime = 0L;
        this.mEndListeners = new java.util.ArrayList<>();
        this.mUpdateListeners = new java.util.ArrayList<>();
        this.mTarget = k;
        this.mProperty = floatPropertyCompat;
        if (floatPropertyCompat == ROTATION || floatPropertyCompat == ROTATION_X || floatPropertyCompat == ROTATION_Y) {
            this.mMinVisibleChange = 0.1f;
            return;
        }
        if (floatPropertyCompat == ALPHA) {
            this.mMinVisibleChange = 0.00390625f;
        } else if (floatPropertyCompat == SCALE_X || floatPropertyCompat == SCALE_Y) {
            this.mMinVisibleChange = 0.00390625f;
        } else {
            this.mMinVisibleChange = 1.0f;
        }
    }

    public T setStartValue(float f) {
        this.mValue = f;
        this.mStartValueIsSet = true;
        return this;
    }

    public T setStartVelocity(float f) {
        this.mVelocity = f;
        return this;
    }

    public T setMaxValue(float f) {
        this.mMaxValue = f;
        return this;
    }

    public T setMinValue(float f) {
        this.mMinValue = f;
        return this;
    }

    public T addEndListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        if (!this.mEndListeners.contains(onAnimationEndListener)) {
            this.mEndListeners.add(onAnimationEndListener);
        }
        return this;
    }

    public void removeEndListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        removeEntry(this.mEndListeners, onAnimationEndListener);
    }

    public T addUpdateListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener onAnimationUpdateListener) {
        if (isRunning()) {
            throw new java.lang.UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.mUpdateListeners.contains(onAnimationUpdateListener)) {
            this.mUpdateListeners.add(onAnimationUpdateListener);
        }
        return this;
    }

    public void removeUpdateListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener onAnimationUpdateListener) {
        removeEntry(this.mUpdateListeners, onAnimationUpdateListener);
    }

    public T setMinimumVisibleChange(float f) {
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.mMinVisibleChange = f;
        setValueThreshold(f * 0.75f);
        return this;
    }

    public float getMinimumVisibleChange() {
        return this.mMinVisibleChange;
    }

    private static <T> void removeNullEntries(java.util.ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private static <T> void removeEntry(java.util.ArrayList<T> arrayList, T t) {
        int iIndexOf = arrayList.indexOf(t);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public void start() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.mRunning) {
            return;
        }
        startAnimationInternal();
    }

    public void cancel() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.mRunning) {
            endAnimationInternal(true);
        }
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    private void startAnimationInternal() {
        if (this.mRunning) {
            return;
        }
        this.mRunning = true;
        if (!this.mStartValueIsSet) {
            this.mValue = getPropertyValue();
        }
        float f = this.mValue;
        if (f > this.mMaxValue || f < this.mMinValue) {
            throw new java.lang.IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        androidx.dynamicanimation.animation.AnimationHandler.getInstance().addAnimationFrameCallback(this, 0L);
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    public boolean doAnimationFrame(long j) {
        long j2 = this.mLastFrameTime;
        if (j2 == 0) {
            this.mLastFrameTime = j;
            setPropertyValue(this.mValue);
            return false;
        }
        this.mLastFrameTime = j;
        boolean zUpdateValueAndVelocity = updateValueAndVelocity(j - j2);
        float fMin = java.lang.Math.min(this.mValue, this.mMaxValue);
        this.mValue = fMin;
        float fMax = java.lang.Math.max(fMin, this.mMinValue);
        this.mValue = fMax;
        setPropertyValue(fMax);
        if (zUpdateValueAndVelocity) {
            endAnimationInternal(false);
        }
        return zUpdateValueAndVelocity;
    }

    private void endAnimationInternal(boolean z) {
        this.mRunning = false;
        androidx.dynamicanimation.animation.AnimationHandler.getInstance().removeCallback(this);
        this.mLastFrameTime = 0L;
        this.mStartValueIsSet = false;
        for (int i = 0; i < this.mEndListeners.size(); i++) {
            if (this.mEndListeners.get(i) != null) {
                this.mEndListeners.get(i).onAnimationEnd(this, z, this.mValue, this.mVelocity);
            }
        }
        removeNullEntries(this.mEndListeners);
    }

    void setPropertyValue(float f) {
        this.mProperty.setValue(this.mTarget, f);
        for (int i = 0; i < this.mUpdateListeners.size(); i++) {
            if (this.mUpdateListeners.get(i) != null) {
                this.mUpdateListeners.get(i).onAnimationUpdate(this, this.mValue, this.mVelocity);
            }
        }
        removeNullEntries(this.mUpdateListeners);
    }

    float getValueThreshold() {
        return this.mMinVisibleChange * 0.75f;
    }

    private float getPropertyValue() {
        return this.mProperty.getValue(this.mTarget);
    }
}
