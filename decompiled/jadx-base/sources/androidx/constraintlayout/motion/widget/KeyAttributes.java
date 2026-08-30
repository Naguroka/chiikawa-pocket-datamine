package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyAttributes extends androidx.constraintlayout.motion.widget.Key {
    private static final boolean DEBUG = false;
    public static final int KEY_TYPE = 1;
    static final java.lang.String NAME = "KeyAttribute";
    private static final java.lang.String TAG = "KeyAttributes";
    private java.lang.String mTransitionEasing;
    private int mCurveFit = -1;
    private boolean mVisibility = false;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mProgress = Float.NaN;

    public KeyAttributes() {
        this.mType = 1;
        this.mCustomConstraints = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attrs) {
        androidx.constraintlayout.motion.widget.KeyAttributes.Loader.read(this, context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.KeyAttribute));
    }

    int getCurveFit() {
        return this.mCurveFit;
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
        if (!java.lang.Float.isNaN(this.mPivotX)) {
            attributes.add(androidx.constraintlayout.motion.widget.Key.PIVOT_X);
        }
        if (!java.lang.Float.isNaN(this.mPivotY)) {
            attributes.add(androidx.constraintlayout.motion.widget.Key.PIVOT_Y);
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
        if (!java.lang.Float.isNaN(this.mPivotX)) {
            interpolation.put(androidx.constraintlayout.motion.widget.Key.PIVOT_X, java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mPivotY)) {
            interpolation.put(androidx.constraintlayout.motion.widget.Key.PIVOT_Y, java.lang.Integer.valueOf(this.mCurveFit));
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
        if (!java.lang.Float.isNaN(this.mScaleY)) {
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
        for (java.lang.String str : splines.keySet()) {
            androidx.constraintlayout.motion.utils.ViewSpline viewSpline = splines.get(str);
            if (viewSpline != null) {
                if (str.startsWith("CUSTOM")) {
                    androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) viewSpline).setPoint(this.mFramePosition, constraintAttribute);
                    }
                } else {
                    str.hashCode();
                    switch (str) {
                        case "rotationX":
                            if (java.lang.Float.isNaN(this.mRotationX)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mRotationX);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (java.lang.Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mRotationY);
                                break;
                            }
                            break;
                        case "translationX":
                            if (java.lang.Float.isNaN(this.mTranslationX)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mTranslationX);
                                break;
                            }
                            break;
                        case "translationY":
                            if (java.lang.Float.isNaN(this.mTranslationY)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mTranslationY);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (java.lang.Float.isNaN(this.mTranslationZ)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mTranslationZ);
                                break;
                            }
                            break;
                        case "progress":
                            if (java.lang.Float.isNaN(this.mProgress)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mProgress);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (java.lang.Float.isNaN(this.mScaleX)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mScaleX);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (java.lang.Float.isNaN(this.mScaleY)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mScaleY);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (java.lang.Float.isNaN(this.mRotationX)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mPivotX);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (java.lang.Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mPivotY);
                                break;
                            }
                            break;
                        case "rotation":
                            if (java.lang.Float.isNaN(this.mRotation)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mRotation);
                                break;
                            }
                            break;
                        case "elevation":
                            if (java.lang.Float.isNaN(this.mElevation)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mElevation);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (java.lang.Float.isNaN(this.mTransitionPathRotate)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                                break;
                            }
                            break;
                        case "alpha":
                            if (java.lang.Float.isNaN(this.mAlpha)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mFramePosition, this.mAlpha);
                                break;
                            }
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
            case "transformPivotX":
                this.mPivotX = toFloat(value);
                break;
            case "transformPivotY":
                this.mPivotY = toFloat(value);
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
            case "curveFit":
                this.mCurveFit = toInt(value);
                break;
            case "visibility":
                this.mVisibility = toBoolean(value);
                break;
        }
    }

    private static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_PIVOT_X = 19;
        private static final int ANDROID_PIVOT_Y = 20;
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
        private static android.util.SparseIntArray mAttrMap;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_alpha, 1);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_elevation, 2);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotation, 4);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotationX, 5);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotationY, 6);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_transformPivotX, 19);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_transformPivotY, 20);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_scaleX, 7);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_transitionPathRotate, 8);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_transitionEasing, 9);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_motionTarget, 10);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_framePosition, 12);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_curveFit, 13);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_scaleY, 14);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationX, 15);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationY, 16);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationZ, 17);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_motionProgress, 18);
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyAttributes c, android.content.res.TypedArray a2) {
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
                        android.util.Log.e(androidx.constraintlayout.motion.widget.KeyAttributes.NAME, "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mAttrMap.get(index));
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
                        c.mPivotX = a2.getDimension(index, c.mPivotX);
                        break;
                    case 20:
                        c.mPivotY = a2.getDimension(index, c.mPivotY);
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key src) {
        super.copy(src);
        androidx.constraintlayout.motion.widget.KeyAttributes keyAttributes = (androidx.constraintlayout.motion.widget.KeyAttributes) src;
        this.mCurveFit = keyAttributes.mCurveFit;
        this.mVisibility = keyAttributes.mVisibility;
        this.mAlpha = keyAttributes.mAlpha;
        this.mElevation = keyAttributes.mElevation;
        this.mRotation = keyAttributes.mRotation;
        this.mRotationX = keyAttributes.mRotationX;
        this.mRotationY = keyAttributes.mRotationY;
        this.mPivotX = keyAttributes.mPivotX;
        this.mPivotY = keyAttributes.mPivotY;
        this.mTransitionPathRotate = keyAttributes.mTransitionPathRotate;
        this.mScaleX = keyAttributes.mScaleX;
        this.mScaleY = keyAttributes.mScaleY;
        this.mTranslationX = keyAttributes.mTranslationX;
        this.mTranslationY = keyAttributes.mTranslationY;
        this.mTranslationZ = keyAttributes.mTranslationZ;
        this.mProgress = keyAttributes.mProgress;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public androidx.constraintlayout.motion.widget.Key mo15clone() {
        return new androidx.constraintlayout.motion.widget.KeyAttributes().copy(this);
    }
}
