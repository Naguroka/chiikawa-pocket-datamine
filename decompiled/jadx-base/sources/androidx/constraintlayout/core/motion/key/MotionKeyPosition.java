package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyPosition extends androidx.constraintlayout.core.motion.key.MotionKey {
    static final int KEY_TYPE = 2;
    static final java.lang.String NAME = "KeyPosition";
    protected static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public int mCurveFit = UNSET;
    public java.lang.String mTransitionEasing = null;
    public int mPathMotionArc = UNSET;
    public int mDrawPath = 0;
    public float mPercentWidth = Float.NaN;
    public float mPercentHeight = Float.NaN;
    public float mPercentX = Float.NaN;
    public float mPercentY = Float.NaN;
    public float mAltPercentX = Float.NaN;
    public float mAltPercentY = Float.NaN;
    public int mPositionType = 0;
    private float mCalculatedPositionX = Float.NaN;
    private float mCalculatedPositionY = Float.NaN;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
    }

    public MotionKeyPosition() {
        this.mType = 2;
    }

    private void calcScreenPosition(int i, int i2) {
        float f = this.mPercentX;
        float f2 = 0;
        this.mCalculatedPositionX = ((i - 0) * f) + f2;
        this.mCalculatedPositionY = ((i2 - 0) * f) + f2;
    }

    private void calcPathPosition(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.mPercentX;
        float f8 = this.mPercentY;
        this.mCalculatedPositionX = f + (f5 * f7) + ((-f6) * f8);
        this.mCalculatedPositionY = f2 + (f6 * f7) + (f5 * f8);
    }

    private void calcCartesianPosition(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = java.lang.Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
        float f8 = java.lang.Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
        float f9 = java.lang.Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
        this.mCalculatedPositionX = (int) (f + (f7 * f5) + ((java.lang.Float.isNaN(this.mAltPercentX) ? 0.0f : this.mAltPercentX) * f6));
        this.mCalculatedPositionY = (int) (f2 + (f5 * f8) + (f6 * f9));
    }

    float getPositionX() {
        return this.mCalculatedPositionX;
    }

    float getPositionY() {
        return this.mCalculatedPositionY;
    }

    public void positionAttributes(androidx.constraintlayout.core.motion.MotionWidget motionWidget, androidx.constraintlayout.core.motion.utils.FloatRect floatRect, androidx.constraintlayout.core.motion.utils.FloatRect floatRect2, float f, float f2, java.lang.String[] strArr, float[] fArr) {
        int i = this.mPositionType;
        if (i == 1) {
            positionPathAttributes(floatRect, floatRect2, f, f2, strArr, fArr);
        } else if (i == 2) {
            positionScreenAttributes(motionWidget, floatRect, floatRect2, f, f2, strArr, fArr);
        } else {
            positionCartAttributes(floatRect, floatRect2, f, f2, strArr, fArr);
        }
    }

    void positionPathAttributes(androidx.constraintlayout.core.motion.utils.FloatRect floatRect, androidx.constraintlayout.core.motion.utils.FloatRect floatRect2, float f, float f2, java.lang.String[] strArr, float[] fArr) {
        float fCenterX = floatRect.centerX();
        float fCenterY = floatRect.centerY();
        float fCenterX2 = floatRect2.centerX() - fCenterX;
        float fCenterY2 = floatRect2.centerY() - fCenterY;
        float fHypot = (float) java.lang.Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            java.lang.System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = fCenterX2 / fHypot;
        float f4 = fCenterY2 / fHypot;
        float f5 = f2 - fCenterY;
        float f6 = f - fCenterX;
        float f7 = ((f3 * f5) - (f6 * f4)) / fHypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / fHypot;
        java.lang.String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f8;
                fArr[1] = f7;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f8;
        fArr[1] = f7;
    }

    void positionScreenAttributes(androidx.constraintlayout.core.motion.MotionWidget motionWidget, androidx.constraintlayout.core.motion.utils.FloatRect floatRect, androidx.constraintlayout.core.motion.utils.FloatRect floatRect2, float f, float f2, java.lang.String[] strArr, float[] fArr) {
        floatRect.centerX();
        floatRect.centerY();
        floatRect2.centerX();
        floatRect2.centerY();
        androidx.constraintlayout.core.motion.MotionWidget parent = motionWidget.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        java.lang.String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f / width;
                fArr[1] = f2 / height;
                return;
            } else {
                fArr[1] = f / width;
                fArr[0] = f2 / height;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = f / width;
        strArr[1] = "percentY";
        fArr[1] = f2 / height;
    }

    void positionCartAttributes(androidx.constraintlayout.core.motion.utils.FloatRect floatRect, androidx.constraintlayout.core.motion.utils.FloatRect floatRect2, float f, float f2, java.lang.String[] strArr, float[] fArr) {
        float fCenterX = floatRect.centerX();
        float fCenterY = floatRect.centerY();
        float fCenterX2 = floatRect2.centerX() - fCenterX;
        float fCenterY2 = floatRect2.centerY() - fCenterY;
        java.lang.String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f - fCenterX) / fCenterX2;
                fArr[1] = (f2 - fCenterY) / fCenterY2;
                return;
            } else {
                fArr[1] = (f - fCenterX) / fCenterX2;
                fArr[0] = (f2 - fCenterY) / fCenterY2;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = (f - fCenterX) / fCenterX2;
        strArr[1] = "percentY";
        fArr[1] = (f2 - fCenterY) / fCenterY2;
    }

    public boolean intersects(int i, int i2, androidx.constraintlayout.core.motion.utils.FloatRect floatRect, androidx.constraintlayout.core.motion.utils.FloatRect floatRect2, float f, float f2) {
        calcPosition(i, i2, floatRect.centerX(), floatRect.centerY(), floatRect2.centerX(), floatRect2.centerY());
        return java.lang.Math.abs(f - this.mCalculatedPositionX) < SELECTION_SLOPE && java.lang.Math.abs(f2 - this.mCalculatedPositionY) < SELECTION_SLOPE;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKey copy(androidx.constraintlayout.core.motion.key.MotionKey motionKey) {
        super.copy(motionKey);
        androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) motionKey;
        this.mTransitionEasing = motionKeyPosition.mTransitionEasing;
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mPercentWidth = motionKeyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = motionKeyPosition.mPercentX;
        this.mPercentY = motionKeyPosition.mPercentY;
        this.mAltPercentX = motionKeyPosition.mAltPercentX;
        this.mAltPercentY = motionKeyPosition.mAltPercentY;
        this.mCalculatedPositionX = motionKeyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = motionKeyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public androidx.constraintlayout.core.motion.key.MotionKey mo13clone() {
        return new androidx.constraintlayout.core.motion.key.MotionKeyPosition().copy(this);
    }

    void calcPosition(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.mPositionType;
        if (i3 == 1) {
            calcPathPosition(f, f2, f3, f4);
        } else if (i3 == 2) {
            calcScreenPosition(i, i2);
        } else {
            calcCartesianPosition(f, f2, f3, f4);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 100) {
            this.mFramePosition = i2;
            return true;
        }
        if (i == 508) {
            this.mCurveFit = i2;
            return true;
        }
        if (i == 510) {
            this.mPositionType = i2;
            return true;
        }
        return super.setValue(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        switch (i) {
            case 503:
                this.mPercentWidth = f;
                return true;
            case 504:
                this.mPercentHeight = f;
                return true;
            case 505:
                this.mPercentWidth = f;
                this.mPercentHeight = f;
                return true;
            case 506:
                this.mPercentX = f;
                return true;
            case androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_Y /* 507 */:
                this.mPercentY = f;
                return true;
            default:
                return super.setValue(i, f);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 501) {
            this.mTransitionEasing = str.toString();
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        return androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.getId(str);
    }
}
