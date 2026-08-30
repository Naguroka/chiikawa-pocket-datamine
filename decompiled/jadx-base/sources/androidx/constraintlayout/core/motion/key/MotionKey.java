package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes.dex */
public abstract class MotionKey implements androidx.constraintlayout.core.motion.utils.TypedValues {
    public static final java.lang.String ALPHA = "alpha";
    public static final java.lang.String CUSTOM = "CUSTOM";
    public static final java.lang.String ELEVATION = "elevation";
    public static final java.lang.String ROTATION = "rotationZ";
    public static final java.lang.String ROTATION_X = "rotationX";
    public static final java.lang.String SCALE_X = "scaleX";
    public static final java.lang.String SCALE_Y = "scaleY";
    public static final java.lang.String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final java.lang.String TRANSLATION_X = "translationX";
    public static final java.lang.String TRANSLATION_Y = "translationY";
    public static int UNSET = -1;
    public static final java.lang.String VISIBILITY = "visibility";
    public java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> mCustom;
    public int mFramePosition;
    int mTargetId;
    java.lang.String mTargetString;
    public int mType;

    public abstract void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map);

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract androidx.constraintlayout.core.motion.key.MotionKey mo13clone();

    public abstract void getAttributeNames(java.util.HashSet<java.lang.String> hashSet);

    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> map) {
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public MotionKey() {
        int i = UNSET;
        this.mFramePosition = i;
        this.mTargetId = i;
        this.mTargetString = null;
    }

    boolean matches(java.lang.String str) {
        java.lang.String str2 = this.mTargetString;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    float toFloat(java.lang.Object obj) {
        return obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
    }

    int toInt(java.lang.Object obj) {
        return obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
    }

    boolean toBoolean(java.lang.Object obj) {
        return obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : java.lang.Boolean.parseBoolean(obj.toString());
    }

    public androidx.constraintlayout.core.motion.key.MotionKey copy(androidx.constraintlayout.core.motion.key.MotionKey motionKey) {
        this.mFramePosition = motionKey.mFramePosition;
        this.mTargetId = motionKey.mTargetId;
        this.mTargetString = motionKey.mTargetString;
        this.mType = motionKey.mType;
        return this;
    }

    public androidx.constraintlayout.core.motion.key.MotionKey setViewId(int i) {
        this.mTargetId = i;
        return this;
    }

    public void setFramePosition(int i) {
        this.mFramePosition = i;
    }

    public int getFramePosition() {
        return this.mFramePosition;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i != 100) {
            return false;
        }
        this.mFramePosition = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i != 101) {
            return false;
        }
        this.mTargetString = str;
        return true;
    }

    public void setCustomAttribute(java.lang.String str, int i, float f) {
        this.mCustom.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, f));
    }

    public void setCustomAttribute(java.lang.String str, int i, int i2) {
        this.mCustom.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, i2));
    }

    public void setCustomAttribute(java.lang.String str, int i, boolean z) {
        this.mCustom.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, z));
    }

    public void setCustomAttribute(java.lang.String str, int i, java.lang.String str2) {
        this.mCustom.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, str2));
    }
}
