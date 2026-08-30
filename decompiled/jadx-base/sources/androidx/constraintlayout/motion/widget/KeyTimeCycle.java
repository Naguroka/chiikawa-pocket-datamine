package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyTimeCycle extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 3;
    static final java.lang.String NAME = "KeyTimeCycle";
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final java.lang.String TAG = "KeyTimeCycle";
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
    public static final java.lang.String WAVE_SHAPE = "waveShape";
    private java.lang.String mTransitionEasing;
    private int mCurveFit = -1;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mProgress = Float.NaN;
    private int mWaveShape = 0;
    private java.lang.String mCustomWaveShape = null;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;

    public KeyTimeCycle() {
        this.mType = 3;
        this.mCustomConstraints = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attrs) {
        androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.read(this, context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.KeyTimeCycle));
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
        if (!java.lang.Float.isNaN(this.mTranslationX)) {
            attributes.add("translationX");
        }
        if (!java.lang.Float.isNaN(this.mTranslationY)) {
            attributes.add("translationY");
        }
        if (!java.lang.Float.isNaN(this.mTranslationZ)) {
            attributes.add("translationZ");
        }
        if (!java.lang.Float.isNaN(this.mTransitionPathRotate)) {
            attributes.add("transitionPathRotate");
        }
        if (!java.lang.Float.isNaN(this.mScaleX)) {
            attributes.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.mScaleY)) {
            attributes.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.mProgress)) {
            attributes.add("progress");
        }
        if (this.mCustomConstraints.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> interpolation) {
        if (this.mCurveFit == -1) {
            return;
        }
        if (!java.lang.Float.isNaN(this.mAlpha)) {
            interpolation.put("alpha", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mElevation)) {
            interpolation.put("elevation", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mRotation)) {
            interpolation.put(androidx.constraintlayout.motion.widget.Key.ROTATION, java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mRotationX)) {
            interpolation.put("rotationX", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mRotationY)) {
            interpolation.put("rotationY", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTranslationX)) {
            interpolation.put("translationX", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTranslationY)) {
            interpolation.put("translationY", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTranslationZ)) {
            interpolation.put("translationZ", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTransitionPathRotate)) {
            interpolation.put("transitionPathRotate", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mScaleX)) {
            interpolation.put("scaleX", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mScaleX)) {
            interpolation.put("scaleY", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mProgress)) {
            interpolation.put("progress", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (this.mCustomConstraints.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                interpolation.put("CUSTOM," + it.next(), java.lang.Integer.valueOf(this.mCurveFit));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> splines) {
        throw new java.lang.IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> splines) {
        for (java.lang.String str : splines.keySet()) {
            androidx.constraintlayout.motion.utils.ViewTimeCycle viewTimeCycle = splines.get(str);
            if (viewTimeCycle != null) {
                if (str.startsWith("CUSTOM")) {
                    androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet) viewTimeCycle).setPoint(this.mFramePosition, constraintAttribute, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                    }
                } else {
                    str.hashCode();
                    switch (str) {
                        case "rotationX":
                            if (java.lang.Float.isNaN(this.mRotationX)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mRotationX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (java.lang.Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mRotationY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "translationX":
                            if (java.lang.Float.isNaN(this.mTranslationX)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTranslationX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "translationY":
                            if (java.lang.Float.isNaN(this.mTranslationY)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTranslationY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (java.lang.Float.isNaN(this.mTranslationZ)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTranslationZ, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "progress":
                            if (java.lang.Float.isNaN(this.mProgress)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mProgress, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (java.lang.Float.isNaN(this.mScaleX)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mScaleX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (java.lang.Float.isNaN(this.mScaleY)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mScaleY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "rotation":
                            if (java.lang.Float.isNaN(this.mRotation)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mRotation, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "elevation":
                            if (java.lang.Float.isNaN(this.mElevation)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mElevation, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (java.lang.Float.isNaN(this.mTransitionPathRotate)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTransitionPathRotate, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "alpha":
                            if (java.lang.Float.isNaN(this.mAlpha)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mAlpha, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        default:
                            android.util.Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
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

    private static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static android.util.SparseIntArray mAttrMap;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_alpha, 1);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_elevation, 2);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotation, 4);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotationX, 5);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotationY, 6);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_scaleX, 7);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_transitionEasing, 9);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_motionTarget, 10);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_framePosition, 12);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_curveFit, 13);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_scaleY, 14);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationX, 15);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationY, 16);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationZ, 17);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_motionProgress, 18);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_wavePeriod, 20);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_waveOffset, 21);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_waveShape, 19);
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyTimeCycle c, android.content.res.TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a2.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        c.mAlpha = a2.getFloat(index, c.mAlpha);
                        break;
                    case 2:
                        c.mElevation = a2.getDimension(index, c.mElevation);
                        break;
                    case 3:
                    case 11:
                    default:
                        android.util.Log.e("KeyTimeCycle", "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                    case 4:
                        c.mRotation = a2.getFloat(index, c.mRotation);
                        break;
                    case 5:
                        c.mRotationX = a2.getFloat(index, c.mRotationX);
                        break;
                    case 6:
                        c.mRotationY = a2.getFloat(index, c.mRotationY);
                        break;
                    case 7:
                        c.mScaleX = a2.getFloat(index, c.mScaleX);
                        break;
                    case 8:
                        c.mTransitionPathRotate = a2.getFloat(index, c.mTransitionPathRotate);
                        break;
                    case 9:
                        c.mTransitionEasing = a2.getString(index);
                        break;
                    case 10:
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
                    case 12:
                        c.mFramePosition = a2.getInt(index, c.mFramePosition);
                        break;
                    case 13:
                        c.mCurveFit = a2.getInteger(index, c.mCurveFit);
                        break;
                    case 14:
                        c.mScaleY = a2.getFloat(index, c.mScaleY);
                        break;
                    case 15:
                        c.mTranslationX = a2.getDimension(index, c.mTranslationX);
                        break;
                    case 16:
                        c.mTranslationY = a2.getDimension(index, c.mTranslationY);
                        break;
                    case 17:
                        c.mTranslationZ = a2.getDimension(index, c.mTranslationZ);
                        break;
                    case 18:
                        c.mProgress = a2.getFloat(index, c.mProgress);
                        break;
                    case 19:
                        if (a2.peekValue(index).type == 3) {
                            c.mCustomWaveShape = a2.getString(index);
                            c.mWaveShape = 7;
                        } else {
                            c.mWaveShape = a2.getInt(index, c.mWaveShape);
                        }
                        break;
                    case 20:
                        c.mWavePeriod = a2.getFloat(index, c.mWavePeriod);
                        break;
                    case 21:
                        if (a2.peekValue(index).type == 5) {
                            c.mWaveOffset = a2.getDimension(index, c.mWaveOffset);
                        } else {
                            c.mWaveOffset = a2.getFloat(index, c.mWaveOffset);
                        }
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key src) {
        super.copy(src);
        androidx.constraintlayout.motion.widget.KeyTimeCycle keyTimeCycle = (androidx.constraintlayout.motion.widget.KeyTimeCycle) src;
        this.mTransitionEasing = keyTimeCycle.mTransitionEasing;
        this.mCurveFit = keyTimeCycle.mCurveFit;
        this.mWaveShape = keyTimeCycle.mWaveShape;
        this.mWavePeriod = keyTimeCycle.mWavePeriod;
        this.mWaveOffset = keyTimeCycle.mWaveOffset;
        this.mProgress = keyTimeCycle.mProgress;
        this.mAlpha = keyTimeCycle.mAlpha;
        this.mElevation = keyTimeCycle.mElevation;
        this.mRotation = keyTimeCycle.mRotation;
        this.mTransitionPathRotate = keyTimeCycle.mTransitionPathRotate;
        this.mRotationX = keyTimeCycle.mRotationX;
        this.mRotationY = keyTimeCycle.mRotationY;
        this.mScaleX = keyTimeCycle.mScaleX;
        this.mScaleY = keyTimeCycle.mScaleY;
        this.mTranslationX = keyTimeCycle.mTranslationX;
        this.mTranslationY = keyTimeCycle.mTranslationY;
        this.mTranslationZ = keyTimeCycle.mTranslationZ;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public androidx.constraintlayout.motion.widget.Key mo15clone() {
        return new androidx.constraintlayout.motion.widget.KeyTimeCycle().copy(this);
    }
}
