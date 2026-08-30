package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyAttributes extends androidx.constraintlayout.core.motion.key.MotionKey {
    private static final boolean DEBUG = false;
    public static final int KEY_TYPE = 1;
    static final java.lang.String NAME = "KeyAttribute";
    private static final java.lang.String TAG = "KeyAttributes";
    private java.lang.String mTransitionEasing;
    private int mCurveFit = -1;
    private int mVisibility = 0;
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

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public androidx.constraintlayout.core.motion.key.MotionKey mo13clone() {
        return null;
    }

    public MotionKeyAttributes() {
        this.mType = 1;
        this.mCustom = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
        if (!java.lang.Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!java.lang.Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!java.lang.Float.isNaN(this.mRotation)) {
            hashSet.add("rotationZ");
        }
        if (!java.lang.Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!java.lang.Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!java.lang.Float.isNaN(this.mPivotX)) {
            hashSet.add("pivotX");
        }
        if (!java.lang.Float.isNaN(this.mPivotY)) {
            hashSet.add("pivotY");
        }
        if (!java.lang.Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!java.lang.Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!java.lang.Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (!java.lang.Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("pathRotate");
        }
        if (!java.lang.Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.mProgress)) {
            hashSet.add("progress");
        }
        if (this.mCustom.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map) {
        for (java.lang.String str : map.keySet()) {
            androidx.constraintlayout.core.motion.utils.SplineSet splineSet = map.get(str);
            if (splineSet != null) {
                if (str.startsWith("CUSTOM")) {
                    androidx.constraintlayout.core.motion.CustomVariable customVariable = this.mCustom.get(str.substring(7));
                    if (customVariable != null) {
                        ((androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline) splineSet).setPoint(this.mFramePosition, customVariable);
                    }
                } else {
                    str.hashCode();
                    switch (str) {
                        case "rotationX":
                            if (java.lang.Float.isNaN(this.mRotationX)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mRotationX);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (java.lang.Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mRotationY);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (java.lang.Float.isNaN(this.mRotation)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mRotation);
                                break;
                            }
                            break;
                        case "translationX":
                            if (java.lang.Float.isNaN(this.mTranslationX)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationX);
                                break;
                            }
                            break;
                        case "translationY":
                            if (java.lang.Float.isNaN(this.mTranslationY)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationY);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (java.lang.Float.isNaN(this.mTranslationZ)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationZ);
                                break;
                            }
                            break;
                        case "progress":
                            if (java.lang.Float.isNaN(this.mProgress)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mProgress);
                                break;
                            }
                            break;
                        case "pivotX":
                            if (java.lang.Float.isNaN(this.mRotationX)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mPivotX);
                                break;
                            }
                            break;
                        case "pivotY":
                            if (java.lang.Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mPivotY);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (java.lang.Float.isNaN(this.mScaleX)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mScaleX);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (java.lang.Float.isNaN(this.mScaleY)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mScaleY);
                                break;
                            }
                            break;
                        case "elevation":
                            if (java.lang.Float.isNaN(this.mElevation)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mElevation);
                                break;
                            }
                            break;
                        case "alpha":
                            if (java.lang.Float.isNaN(this.mAlpha)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mAlpha);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (java.lang.Float.isNaN(this.mTransitionPathRotate)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                                break;
                            }
                            break;
                        default:
                            java.lang.System.err.println("not supported by KeyAttributes " + str);
                            break;
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 100) {
            this.mFramePosition = i2;
            return true;
        }
        if (i == 301) {
            this.mCurveFit = i2;
            return true;
        }
        if (i == 302) {
            this.mVisibility = i2;
            return true;
        }
        if (setValue(i, i2)) {
            return true;
        }
        return super.setValue(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i != 100) {
            switch (i) {
                case 303:
                    this.mAlpha = f;
                    return true;
                case 304:
                    this.mTranslationX = f;
                    return true;
                case 305:
                    this.mTranslationY = f;
                    return true;
                case 306:
                    this.mTranslationZ = f;
                    return true;
                case 307:
                    this.mElevation = f;
                    return true;
                case 308:
                    this.mRotationX = f;
                    return true;
                case 309:
                    this.mRotationY = f;
                    return true;
                case 310:
                    this.mRotation = f;
                    return true;
                case 311:
                    this.mScaleX = f;
                    return true;
                case 312:
                    this.mScaleY = f;
                    return true;
                case 313:
                    this.mPivotX = f;
                    return true;
                case 314:
                    this.mPivotY = f;
                    return true;
                case 315:
                    this.mProgress = f;
                    return true;
                case androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                    this.mTransitionPathRotate = f;
                    return true;
                default:
                    return super.setValue(i, f);
            }
        }
        this.mTransitionPathRotate = f;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> map) {
        if (!java.lang.Float.isNaN(this.mAlpha)) {
            map.put("alpha", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mElevation)) {
            map.put("elevation", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mRotation)) {
            map.put("rotationZ", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mRotationX)) {
            map.put("rotationX", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mRotationY)) {
            map.put("rotationY", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mPivotX)) {
            map.put("pivotX", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mPivotY)) {
            map.put("pivotY", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTranslationX)) {
            map.put("translationX", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTranslationY)) {
            map.put("translationY", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTranslationZ)) {
            map.put("translationZ", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTransitionPathRotate)) {
            map.put("pathRotate", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mScaleX)) {
            map.put("scaleX", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mScaleY)) {
            map.put("scaleY", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mProgress)) {
            map.put("progress", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (this.mCustom.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), java.lang.Integer.valueOf(this.mCurveFit));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 101) {
            this.mTargetString = str;
            return true;
        }
        if (i == 317) {
            this.mTransitionEasing = str;
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        return androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(str);
    }

    public int getCurveFit() {
        return this.mCurveFit;
    }

    public void printAttributes() {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        getAttributeNames(hashSet);
        java.lang.System.out.println(" ------------- " + this.mFramePosition + " -------------");
        java.lang.String[] strArr = (java.lang.String[]) hashSet.toArray(new java.lang.String[0]);
        for (int i = 0; i < strArr.length; i++) {
            java.lang.System.out.println(strArr[i] + ":" + getFloatValue(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(strArr[i])));
        }
    }

    private float getFloatValue(int i) {
        if (i != 100) {
            switch (i) {
                case 303:
                    return this.mAlpha;
                case 304:
                    return this.mTranslationX;
                case 305:
                    return this.mTranslationY;
                case 306:
                    return this.mTranslationZ;
                case 307:
                    return this.mElevation;
                case 308:
                    return this.mRotationX;
                case 309:
                    return this.mRotationY;
                case 310:
                    return this.mRotation;
                case 311:
                    return this.mScaleX;
                case 312:
                    return this.mScaleY;
                case 313:
                    return this.mPivotX;
                case 314:
                    return this.mPivotY;
                case 315:
                    return this.mProgress;
                case androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                    return this.mTransitionPathRotate;
                default:
                    return Float.NaN;
            }
        }
        return this.mFramePosition;
    }
}
