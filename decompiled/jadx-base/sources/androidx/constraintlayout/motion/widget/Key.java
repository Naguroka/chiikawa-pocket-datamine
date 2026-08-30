package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class Key {
    public static final java.lang.String ALPHA = "alpha";
    public static final java.lang.String CURVEFIT = "curveFit";
    public static final java.lang.String CUSTOM = "CUSTOM";
    public static final java.lang.String ELEVATION = "elevation";
    public static final java.lang.String MOTIONPROGRESS = "motionProgress";
    public static final java.lang.String PIVOT_X = "transformPivotX";
    public static final java.lang.String PIVOT_Y = "transformPivotY";
    public static final java.lang.String PROGRESS = "progress";
    public static final java.lang.String ROTATION = "rotation";
    public static final java.lang.String ROTATION_X = "rotationX";
    public static final java.lang.String ROTATION_Y = "rotationY";
    public static final java.lang.String SCALE_X = "scaleX";
    public static final java.lang.String SCALE_Y = "scaleY";
    public static final java.lang.String TRANSITIONEASING = "transitionEasing";
    public static final java.lang.String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final java.lang.String TRANSLATION_X = "translationX";
    public static final java.lang.String TRANSLATION_Y = "translationY";
    public static final java.lang.String TRANSLATION_Z = "translationZ";
    public static int UNSET = -1;
    public static final java.lang.String VISIBILITY = "visibility";
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
    public static final java.lang.String WAVE_PHASE = "wavePhase";
    public static final java.lang.String WAVE_VARIES_BY = "waveVariesBy";
    java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mCustomConstraints;
    int mFramePosition;
    int mTargetId;
    java.lang.String mTargetString;
    protected int mType;

    public abstract void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> splines);

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract androidx.constraintlayout.motion.widget.Key mo15clone();

    abstract void getAttributeNames(java.util.HashSet<java.lang.String> attributes);

    abstract void load(android.content.Context context, android.util.AttributeSet attrs);

    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> interpolation) {
    }

    public abstract void setValue(java.lang.String tag, java.lang.Object value);

    public Key() {
        int i = UNSET;
        this.mFramePosition = i;
        this.mTargetId = i;
        this.mTargetString = null;
    }

    boolean matches(java.lang.String constraintTag) {
        java.lang.String str = this.mTargetString;
        if (str == null || constraintTag == null) {
            return false;
        }
        return constraintTag.matches(str);
    }

    float toFloat(java.lang.Object value) {
        return value instanceof java.lang.Float ? ((java.lang.Float) value).floatValue() : java.lang.Float.parseFloat(value.toString());
    }

    int toInt(java.lang.Object value) {
        return value instanceof java.lang.Integer ? ((java.lang.Integer) value).intValue() : java.lang.Integer.parseInt(value.toString());
    }

    boolean toBoolean(java.lang.Object value) {
        return value instanceof java.lang.Boolean ? ((java.lang.Boolean) value).booleanValue() : java.lang.Boolean.parseBoolean(value.toString());
    }

    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key src) {
        this.mFramePosition = src.mFramePosition;
        this.mTargetId = src.mTargetId;
        this.mTargetString = src.mTargetString;
        this.mType = src.mType;
        this.mCustomConstraints = src.mCustomConstraints;
        return this;
    }

    public androidx.constraintlayout.motion.widget.Key setViewId(int id) {
        this.mTargetId = id;
        return this;
    }

    public void setFramePosition(int pos) {
        this.mFramePosition = pos;
    }

    public int getFramePosition() {
        return this.mFramePosition;
    }
}
