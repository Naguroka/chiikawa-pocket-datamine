package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyCycle extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 4;
    static final java.lang.String NAME = "KeyCycle";
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final java.lang.String TAG = "KeyCycle";
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
    public static final java.lang.String WAVE_PHASE = "wavePhase";
    public static final java.lang.String WAVE_SHAPE = "waveShape";
    private java.lang.String mTransitionEasing = null;
    private int mCurveFit = 0;
    private int mWaveShape = -1;
    private java.lang.String mCustomWaveShape = null;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;
    private float mWavePhase = 0.0f;
    private float mProgress = Float.NaN;
    private int mWaveVariesBy = -1;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;

    public KeyCycle() {
        this.mType = 4;
        this.mCustomConstraints = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attrs) {
        androidx.constraintlayout.motion.widget.KeyCycle.Loader.read(this, context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.KeyCycle));
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> attributes) {
        if (!java.lang.Float.isNaN(this.mAlpha)) {
            attributes.add("alpha");
        }
        if (!java.lang.Float.isNaN(this.mElevation)) {
            attributes.add("elevation");
        }
        if (!java.lang.Float.isNaN(this.mRotation)) {
            attributes.add(androidx.constraintlayout.motion.widget.Key.ROTATION);
        }
        if (!java.lang.Float.isNaN(this.mRotationX)) {
            attributes.add("rotationX");
        }
        if (!java.lang.Float.isNaN(this.mRotationY)) {
            attributes.add("rotationY");
        }
        if (!java.lang.Float.isNaN(this.mScaleX)) {
            attributes.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.mScaleY)) {
            attributes.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.mTransitionPathRotate)) {
            attributes.add("transitionPathRotate");
        }
        if (!java.lang.Float.isNaN(this.mTranslationX)) {
            attributes.add("translationX");
        }
        if (!java.lang.Float.isNaN(this.mTranslationY)) {
            attributes.add("translationY");
        }
        if (!java.lang.Float.isNaN(this.mTranslationZ)) {
            attributes.add("translationZ");
        }
        if (this.mCustomConstraints.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    public void addCycleValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> oscSet) {
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator2;
        for (java.lang.String str : oscSet.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.getType() == androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE && (viewOscillator = oscSet.get(str)) != null) {
                    viewOscillator.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, this.mWaveVariesBy, this.mWavePeriod, this.mWaveOffset, this.mWavePhase, constraintAttribute.getValueToInterpolate(), constraintAttribute);
                }
            } else {
                float value = getValue(str);
                if (!java.lang.Float.isNaN(value) && (viewOscillator2 = oscSet.get(str)) != null) {
                    viewOscillator2.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, this.mWaveVariesBy, this.mWavePeriod, this.mWaveOffset, this.mWavePhase, value);
                }
            }
        }
    }

    public float getValue(java.lang.String key) {
        key.hashCode();
        switch (key) {
            case "rotationX":
                return this.mRotationX;
            case "rotationY":
                return this.mRotationY;
            case "translationX":
                return this.mTranslationX;
            case "translationY":
                return this.mTranslationY;
            case "translationZ":
                return this.mTranslationZ;
            case "progress":
                return this.mProgress;
            case "scaleX":
                return this.mScaleX;
            case "scaleY":
                return this.mScaleY;
            case "rotation":
                return this.mRotation;
            case "elevation":
                return this.mElevation;
            case "transitionPathRotate":
                return this.mTransitionPathRotate;
            case "alpha":
                return this.mAlpha;
            case "waveOffset":
                return this.mWaveOffset;
            case "wavePhase":
                return this.mWavePhase;
            default:
                if (key.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                android.util.Log.v("WARNING! KeyCycle", "  UNKNOWN  " + key);
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> splines) {
        androidx.constraintlayout.motion.widget.Debug.logStack(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.NAME, "add " + splines.size() + " values", 2);
        for (java.lang.String str : splines.keySet()) {
            androidx.constraintlayout.motion.utils.ViewSpline viewSpline = splines.get(str);
            if (viewSpline != null) {
                str.hashCode();
                switch (str) {
                    case "rotationX":
                        viewSpline.setPoint(this.mFramePosition, this.mRotationX);
                        break;
                    case "rotationY":
                        viewSpline.setPoint(this.mFramePosition, this.mRotationY);
                        break;
                    case "translationX":
                        viewSpline.setPoint(this.mFramePosition, this.mTranslationX);
                        break;
                    case "translationY":
                        viewSpline.setPoint(this.mFramePosition, this.mTranslationY);
                        break;
                    case "translationZ":
                        viewSpline.setPoint(this.mFramePosition, this.mTranslationZ);
                        break;
                    case "progress":
                        viewSpline.setPoint(this.mFramePosition, this.mProgress);
                        break;
                    case "scaleX":
                        viewSpline.setPoint(this.mFramePosition, this.mScaleX);
                        break;
                    case "scaleY":
                        viewSpline.setPoint(this.mFramePosition, this.mScaleY);
                        break;
                    case "rotation":
                        viewSpline.setPoint(this.mFramePosition, this.mRotation);
                        break;
                    case "elevation":
                        viewSpline.setPoint(this.mFramePosition, this.mElevation);
                        break;
                    case "transitionPathRotate":
                        viewSpline.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                        break;
                    case "alpha":
                        viewSpline.setPoint(this.mFramePosition, this.mAlpha);
                        break;
                    case "waveOffset":
                        viewSpline.setPoint(this.mFramePosition, this.mWaveOffset);
                        break;
                    case "wavePhase":
                        viewSpline.setPoint(this.mFramePosition, this.mWavePhase);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            break;
                        } else {
                            android.util.Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        }
                        break;
                }
            }
        }
    }

    private static class Loader {
        private static final int ANDROID_ALPHA = 9;
        private static final int ANDROID_ELEVATION = 10;
        private static final int ANDROID_ROTATION = 11;
        private static final int ANDROID_ROTATION_X = 12;
        private static final int ANDROID_ROTATION_Y = 13;
        private static final int ANDROID_SCALE_X = 15;
        private static final int ANDROID_SCALE_Y = 16;
        private static final int ANDROID_TRANSLATION_X = 17;
        private static final int ANDROID_TRANSLATION_Y = 18;
        private static final int ANDROID_TRANSLATION_Z = 19;
        private static final int CURVE_FIT = 4;
        private static final int FRAME_POSITION = 2;
        private static final int PROGRESS = 20;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 14;
        private static final int WAVE_OFFSET = 7;
        private static final int WAVE_PERIOD = 6;
        private static final int WAVE_PHASE = 21;
        private static final int WAVE_SHAPE = 5;
        private static final int WAVE_VARIES_BY = 8;
        private static android.util.SparseIntArray mAttrMap;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_motionTarget, 1);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_framePosition, 2);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_transitionEasing, 3);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_curveFit, 4);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_waveShape, 5);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_wavePeriod, 6);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_waveOffset, 7);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_waveVariesBy, 8);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_alpha, 9);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_elevation, 10);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotation, 11);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotationX, 12);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotationY, 13);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_transitionPathRotate, 14);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_scaleX, 15);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_scaleY, 16);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationX, 17);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationY, 18);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationZ, 19);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_motionProgress, 20);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_wavePhase, 21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(androidx.constraintlayout.motion.widget.KeyCycle c, android.content.res.TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a2.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        if (androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE) {
                            c.mTargetId = a2.getResourceId(index, c.mTargetId);
                            if (c.mTargetId == -1) {
                                c.mTargetString = a2.getString(index);
                            }
                        } else if (a2.peekValue(index).type == 3) {
                            c.mTargetString = a2.getString(index);
                        } else {
                            c.mTargetId = a2.getResourceId(index, c.mTargetId);
                        }
                        break;
                    case 2:
                        c.mFramePosition = a2.getInt(index, c.mFramePosition);
                        break;
                    case 3:
                        c.mTransitionEasing = a2.getString(index);
                        break;
                    case 4:
                        c.mCurveFit = a2.getInteger(index, c.mCurveFit);
                        break;
                    case 5:
                        if (a2.peekValue(index).type == 3) {
                            c.mCustomWaveShape = a2.getString(index);
                            c.mWaveShape = 7;
                        } else {
                            c.mWaveShape = a2.getInt(index, c.mWaveShape);
                        }
                        break;
                    case 6:
                        c.mWavePeriod = a2.getFloat(index, c.mWavePeriod);
                        break;
                    case 7:
                        if (a2.peekValue(index).type == 5) {
                            c.mWaveOffset = a2.getDimension(index, c.mWaveOffset);
                        } else {
                            c.mWaveOffset = a2.getFloat(index, c.mWaveOffset);
                        }
                        break;
                    case 8:
                        c.mWaveVariesBy = a2.getInt(index, c.mWaveVariesBy);
                        break;
                    case 9:
                        c.mAlpha = a2.getFloat(index, c.mAlpha);
                        break;
                    case 10:
                        c.mElevation = a2.getDimension(index, c.mElevation);
                        break;
                    case 11:
                        c.mRotation = a2.getFloat(index, c.mRotation);
                        break;
                    case 12:
                        c.mRotationX = a2.getFloat(index, c.mRotationX);
                        break;
                    case 13:
                        c.mRotationY = a2.getFloat(index, c.mRotationY);
                        break;
                    case 14:
                        c.mTransitionPathRotate = a2.getFloat(index, c.mTransitionPathRotate);
                        break;
                    case 15:
                        c.mScaleX = a2.getFloat(index, c.mScaleX);
                        break;
                    case 16:
                        c.mScaleY = a2.getFloat(index, c.mScaleY);
                        break;
                    case 17:
                        c.mTranslationX = a2.getDimension(index, c.mTranslationX);
                        break;
                    case 18:
                        c.mTranslationY = a2.getDimension(index, c.mTranslationY);
                        break;
                    case 19:
                        c.mTranslationZ = a2.getDimension(index, c.mTranslationZ);
                        break;
                    case 20:
                        c.mProgress = a2.getFloat(index, c.mProgress);
                        break;
                    case 21:
                        c.mWavePhase = a2.getFloat(index, c.mWavePhase) / 360.0f;
                        break;
                    default:
                        android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.NAME, "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String tag, java.lang.Object value) {
        tag.hashCode();
        switch (tag) {
            case "motionProgress":
                this.mProgress = toFloat(value);
                break;
            case "transitionEasing":
                this.mTransitionEasing = value.toString();
                break;
            case "rotationX":
                this.mRotationX = toFloat(value);
                break;
            case "rotationY":
                this.mRotationY = toFloat(value);
                break;
            case "translationX":
                this.mTranslationX = toFloat(value);
                break;
            case "translationY":
                this.mTranslationY = toFloat(value);
                break;
            case "translationZ":
                this.mTranslationZ = toFloat(value);
                break;
            case "scaleX":
                this.mScaleX = toFloat(value);
                break;
            case "scaleY":
                this.mScaleY = toFloat(value);
                break;
            case "rotation":
                this.mRotation = toFloat(value);
                break;
            case "elevation":
                this.mElevation = toFloat(value);
                break;
            case "transitionPathRotate":
                this.mTransitionPathRotate = toFloat(value);
                break;
            case "alpha":
                this.mAlpha = toFloat(value);
                break;
            case "waveOffset":
                this.mWaveOffset = toFloat(value);
                break;
            case "wavePeriod":
                this.mWavePeriod = toFloat(value);
                break;
            case "curveFit":
                this.mCurveFit = toInt(value);
                break;
            case "wavePhase":
                this.mWavePhase = toFloat(value);
                break;
            case "waveShape":
                if (value instanceof java.lang.Integer) {
                    this.mWaveShape = toInt(value);
                    break;
                } else {
                    this.mWaveShape = 7;
                    this.mCustomWaveShape = value.toString();
                    break;
                }
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key src) {
        super.copy(src);
        androidx.constraintlayout.motion.widget.KeyCycle keyCycle = (androidx.constraintlayout.motion.widget.KeyCycle) src;
        this.mTransitionEasing = keyCycle.mTransitionEasing;
        this.mCurveFit = keyCycle.mCurveFit;
        this.mWaveShape = keyCycle.mWaveShape;
        this.mCustomWaveShape = keyCycle.mCustomWaveShape;
        this.mWavePeriod = keyCycle.mWavePeriod;
        this.mWaveOffset = keyCycle.mWaveOffset;
        this.mWavePhase = keyCycle.mWavePhase;
        this.mProgress = keyCycle.mProgress;
        this.mWaveVariesBy = keyCycle.mWaveVariesBy;
        this.mAlpha = keyCycle.mAlpha;
        this.mElevation = keyCycle.mElevation;
        this.mRotation = keyCycle.mRotation;
        this.mTransitionPathRotate = keyCycle.mTransitionPathRotate;
        this.mRotationX = keyCycle.mRotationX;
        this.mRotationY = keyCycle.mRotationY;
        this.mScaleX = keyCycle.mScaleX;
        this.mScaleY = keyCycle.mScaleY;
        this.mTranslationX = keyCycle.mTranslationX;
        this.mTranslationY = keyCycle.mTranslationY;
        this.mTranslationZ = keyCycle.mTranslationZ;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public androidx.constraintlayout.motion.widget.Key mo15clone() {
        return new androidx.constraintlayout.motion.widget.KeyCycle().copy(this);
    }
}
