package androidx.dynamicanimation.animation;

/* JADX INFO: loaded from: classes.dex */
public final class SpringAnimation extends androidx.dynamicanimation.animation.DynamicAnimation<androidx.dynamicanimation.animation.SpringAnimation> {
    private static final float UNSET = Float.MAX_VALUE;
    private boolean mEndRequested;
    private float mPendingPosition;
    private androidx.dynamicanimation.animation.SpringForce mSpring;

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    void setValueThreshold(float f) {
    }

    public SpringAnimation(androidx.dynamicanimation.animation.FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
    }

    public <K> SpringAnimation(K k, androidx.dynamicanimation.animation.FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
    }

    public <K> SpringAnimation(K k, androidx.dynamicanimation.animation.FloatPropertyCompat<K> floatPropertyCompat, float f) {
        super(k, floatPropertyCompat);
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
        this.mSpring = new androidx.dynamicanimation.animation.SpringForce(f);
    }

    public androidx.dynamicanimation.animation.SpringForce getSpring() {
        return this.mSpring;
    }

    public androidx.dynamicanimation.animation.SpringAnimation setSpring(androidx.dynamicanimation.animation.SpringForce springForce) {
        this.mSpring = springForce;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void start() {
        sanityCheck();
        this.mSpring.setValueThreshold(getValueThreshold());
        super.start();
    }

    public void animateToFinalPosition(float f) {
        if (isRunning()) {
            this.mPendingPosition = f;
            return;
        }
        if (this.mSpring == null) {
            this.mSpring = new androidx.dynamicanimation.animation.SpringForce(f);
        }
        this.mSpring.setFinalPosition(f);
        start();
    }

    public void skipToEnd() {
        if (!canSkipToEnd()) {
            throw new java.lang.UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.mRunning) {
            this.mEndRequested = true;
        }
    }

    public boolean canSkipToEnd() {
        return this.mSpring.mDampingRatio > 0.0d;
    }

    private void sanityCheck() {
        androidx.dynamicanimation.animation.SpringForce springForce = this.mSpring;
        if (springForce == null) {
            throw new java.lang.UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double finalPosition = springForce.getFinalPosition();
        if (finalPosition > this.mMaxValue) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (finalPosition < this.mMinValue) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean updateValueAndVelocity(long j) {
        if (this.mEndRequested) {
            float f = this.mPendingPosition;
            if (f != Float.MAX_VALUE) {
                this.mSpring.setFinalPosition(f);
                this.mPendingPosition = Float.MAX_VALUE;
            }
            this.mValue = this.mSpring.getFinalPosition();
            this.mVelocity = 0.0f;
            this.mEndRequested = false;
            return true;
        }
        if (this.mPendingPosition != Float.MAX_VALUE) {
            this.mSpring.getFinalPosition();
            long j2 = j / 2;
            androidx.dynamicanimation.animation.DynamicAnimation.MassState massStateUpdateValues = this.mSpring.updateValues(this.mValue, this.mVelocity, j2);
            this.mSpring.setFinalPosition(this.mPendingPosition);
            this.mPendingPosition = Float.MAX_VALUE;
            androidx.dynamicanimation.animation.DynamicAnimation.MassState massStateUpdateValues2 = this.mSpring.updateValues(massStateUpdateValues.mValue, massStateUpdateValues.mVelocity, j2);
            this.mValue = massStateUpdateValues2.mValue;
            this.mVelocity = massStateUpdateValues2.mVelocity;
        } else {
            androidx.dynamicanimation.animation.DynamicAnimation.MassState massStateUpdateValues3 = this.mSpring.updateValues(this.mValue, this.mVelocity, j);
            this.mValue = massStateUpdateValues3.mValue;
            this.mVelocity = massStateUpdateValues3.mVelocity;
        }
        this.mValue = java.lang.Math.max(this.mValue, this.mMinValue);
        this.mValue = java.lang.Math.min(this.mValue, this.mMaxValue);
        if (!isAtEquilibrium(this.mValue, this.mVelocity)) {
            return false;
        }
        this.mValue = this.mSpring.getFinalPosition();
        this.mVelocity = 0.0f;
        return true;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    float getAcceleration(float f, float f2) {
        return this.mSpring.getAcceleration(f, f2);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean isAtEquilibrium(float f, float f2) {
        return this.mSpring.isAtEquilibrium(f, f2);
    }
}
