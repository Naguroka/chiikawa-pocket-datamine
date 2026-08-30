package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyTimeCycle extends androidx.constraintlayout.core.motion.key.MotionKey {
    public static final int KEY_TYPE = 3;
    static final java.lang.String NAME = "KeyTimeCycle";
    private static final java.lang.String TAG = "KeyTimeCycle";
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

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map) {
    }

    public MotionKeyTimeCycle() {
        this.mType = 3;
        this.mCustom = new java.util.HashMap<>();
    }

    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> map) {
        for (java.lang.String str : map.keySet()) {
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet timeCycleSplineSet = map.get(str);
            if (timeCycleSplineSet != null) {
                if (str.startsWith("CUSTOM")) {
                    androidx.constraintlayout.core.motion.CustomVariable customVariable = this.mCustom.get(str.substring(7));
                    if (customVariable != null) {
                        ((androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.CustomVarSet) timeCycleSplineSet).setPoint(this.mFramePosition, customVariable, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                    }
                } else {
                    str.hashCode();
                    switch (str) {
                        case "rotationX":
                            if (java.lang.Float.isNaN(this.mRotationX)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mRotationX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (java.lang.Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mRotationY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (java.lang.Float.isNaN(this.mRotation)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mRotation, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "translationX":
                            if (java.lang.Float.isNaN(this.mTranslationX)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mTranslationX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "translationY":
                            if (java.lang.Float.isNaN(this.mTranslationY)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mTranslationY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (java.lang.Float.isNaN(this.mTranslationZ)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mTranslationZ, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "progress":
                            if (java.lang.Float.isNaN(this.mProgress)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mProgress, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (java.lang.Float.isNaN(this.mScaleX)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mScaleX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (java.lang.Float.isNaN(this.mScaleY)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mScaleY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "elevation":
                            if (java.lang.Float.isNaN(this.mTranslationZ)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mTranslationZ, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "alpha":
                            if (java.lang.Float.isNaN(this.mAlpha)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mAlpha, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (java.lang.Float.isNaN(this.mTransitionPathRotate)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.mTransitionPathRotate, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            }
                            break;
                        default:
                            androidx.constraintlayout.core.motion.utils.Utils.loge("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
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
        if (i == 421) {
            this.mWaveShape = i2;
            return true;
        }
        return super.setValue(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 315) {
            this.mProgress = toFloat(java.lang.Float.valueOf(f));
            return true;
        }
        if (i == 401) {
            this.mCurveFit = toInt(java.lang.Float.valueOf(f));
            return true;
        }
        if (i == 403) {
            this.mAlpha = f;
            return true;
        }
        if (i == 416) {
            this.mTransitionPathRotate = toFloat(java.lang.Float.valueOf(f));
            return true;
        }
        if (i == 423) {
            this.mWavePeriod = toFloat(java.lang.Float.valueOf(f));
            return true;
        }
        if (i != 424) {
            switch (i) {
                case 304:
                    this.mTranslationX = toFloat(java.lang.Float.valueOf(f));
                    return true;
                case 305:
                    this.mTranslationY = toFloat(java.lang.Float.valueOf(f));
                    return true;
                case 306:
                    this.mTranslationZ = toFloat(java.lang.Float.valueOf(f));
                    return true;
                case 307:
                    this.mElevation = toFloat(java.lang.Float.valueOf(f));
                    return true;
                case 308:
                    this.mRotationX = toFloat(java.lang.Float.valueOf(f));
                    return true;
                case 309:
                    this.mRotationY = toFloat(java.lang.Float.valueOf(f));
                    return true;
                case 310:
                    this.mRotation = toFloat(java.lang.Float.valueOf(f));
                    return true;
                case 311:
                    this.mScaleX = toFloat(java.lang.Float.valueOf(f));
                    return true;
                case 312:
                    this.mScaleY = toFloat(java.lang.Float.valueOf(f));
                    return true;
                default:
                    return super.setValue(i, f);
            }
        }
        this.mWaveOffset = toFloat(java.lang.Float.valueOf(f));
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 420) {
            this.mTransitionEasing = str;
            return true;
        }
        if (i == 421) {
            this.mWaveShape = 7;
            this.mCustomWaveShape = str;
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return super.setValue(i, z);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle copy(androidx.constraintlayout.core.motion.key.MotionKey motionKey) {
        super.copy(motionKey);
        androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle motionKeyTimeCycle = (androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) motionKey;
        this.mTransitionEasing = motionKeyTimeCycle.mTransitionEasing;
        this.mCurveFit = motionKeyTimeCycle.mCurveFit;
        this.mWaveShape = motionKeyTimeCycle.mWaveShape;
        this.mWavePeriod = motionKeyTimeCycle.mWavePeriod;
        this.mWaveOffset = motionKeyTimeCycle.mWaveOffset;
        this.mProgress = motionKeyTimeCycle.mProgress;
        this.mAlpha = motionKeyTimeCycle.mAlpha;
        this.mElevation = motionKeyTimeCycle.mElevation;
        this.mRotation = motionKeyTimeCycle.mRotation;
        this.mTransitionPathRotate = motionKeyTimeCycle.mTransitionPathRotate;
        this.mRotationX = motionKeyTimeCycle.mRotationX;
        this.mRotationY = motionKeyTimeCycle.mRotationY;
        this.mScaleX = motionKeyTimeCycle.mScaleX;
        this.mScaleY = motionKeyTimeCycle.mScaleY;
        this.mTranslationX = motionKeyTimeCycle.mTranslationX;
        this.mTranslationY = motionKeyTimeCycle.mTranslationY;
        this.mTranslationZ = motionKeyTimeCycle.mTranslationZ;
        return this;
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
        if (!java.lang.Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("pathRotate");
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
        if (this.mCustom.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public androidx.constraintlayout.core.motion.key.MotionKey mo13clone() {
        return new androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle().copy((androidx.constraintlayout.core.motion.key.MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.getId(str);
    }
}
