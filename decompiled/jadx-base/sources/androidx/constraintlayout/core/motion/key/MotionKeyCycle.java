package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyCycle extends androidx.constraintlayout.core.motion.key.MotionKey {
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

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public androidx.constraintlayout.core.motion.key.MotionKey mo13clone() {
        return null;
    }

    public MotionKeyCycle() {
        this.mType = 4;
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

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 401) {
            this.mCurveFit = i2;
            return true;
        }
        if (i == 421) {
            this.mWaveShape = i2;
            return true;
        }
        if (setValue(i, i2)) {
            return true;
        }
        return super.setValue(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 420) {
            this.mTransitionEasing = str;
            return true;
        }
        if (i == 422) {
            this.mCustomWaveShape = str;
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 315) {
            this.mProgress = f;
            return true;
        }
        if (i == 403) {
            this.mAlpha = f;
            return true;
        }
        if (i != 416) {
            switch (i) {
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
                default:
                    switch (i) {
                        case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
                            this.mWavePeriod = f;
                            return true;
                        case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                            this.mWaveOffset = f;
                            return true;
                        case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                            this.mWavePhase = f;
                            return true;
                        default:
                            return super.setValue(i, f);
                    }
            }
        }
        this.mTransitionPathRotate = f;
        return true;
    }

    public float getValue(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return this.mRotationX;
            case "rotationY":
                return this.mRotationY;
            case "rotationZ":
                return this.mRotation;
            case "translationX":
                return this.mTranslationX;
            case "translationY":
                return this.mTranslationY;
            case "translationZ":
                return this.mTranslationZ;
            case "offset":
                return this.mWaveOffset;
            case "progress":
                return this.mProgress;
            case "scaleX":
                return this.mScaleX;
            case "scaleY":
                return this.mScaleY;
            case "elevation":
                return this.mElevation;
            case "alpha":
                return this.mAlpha;
            case "phase":
                return this.mWavePhase;
            case "pathRotate":
                return this.mTransitionPathRotate;
            default:
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "customWave":
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE;
            case "easing":
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
            case "rotationX":
                return 308;
            case "rotationY":
                return 309;
            case "rotationZ":
                return 310;
            case "translationX":
                return 304;
            case "translationY":
                return 305;
            case "translationZ":
                return 306;
            case "offset":
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET;
            case "progress":
                return 315;
            case "period":
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD;
            case "pivotX":
                return 313;
            case "pivotY":
                return 314;
            case "scaleX":
                return 311;
            case "scaleY":
                return 312;
            case "alpha":
                return 403;
            case "phase":
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE;
            case "curveFit":
                return 401;
            case "pathRotate":
                return 416;
            case "waveShape":
                return 421;
            case "visibility":
                return 402;
            default:
                return -1;
        }
    }

    public void addCycleValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map) {
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator2;
        for (java.lang.String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.core.motion.CustomVariable customVariable = this.mCustom.get(str.substring(7));
                if (customVariable != null && customVariable.getType() == 901 && (keyCycleOscillator = map.get(str)) != null) {
                    keyCycleOscillator.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, -1, this.mWavePeriod, this.mWaveOffset, this.mWavePhase, customVariable.getValueToInterpolate(), customVariable);
                }
            } else {
                float value = getValue(str);
                if (!java.lang.Float.isNaN(value) && (keyCycleOscillator2 = map.get(str)) != null) {
                    keyCycleOscillator2.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, -1, this.mWavePeriod, this.mWaveOffset, this.mWavePhase, value);
                }
            }
        }
    }

    public void dump() {
        java.lang.System.out.println("MotionKeyCycle{mWaveShape=" + this.mWaveShape + ", mWavePeriod=" + this.mWavePeriod + ", mWaveOffset=" + this.mWaveOffset + ", mWavePhase=" + this.mWavePhase + ", mRotation=" + this.mRotation + '}');
    }

    public void printAttributes() {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        getAttributeNames(hashSet);
        androidx.constraintlayout.core.motion.utils.Utils.log(" ------------- " + this.mFramePosition + " -------------");
        androidx.constraintlayout.core.motion.utils.Utils.log("MotionKeyCycle{Shape=" + this.mWaveShape + ", Period=" + this.mWavePeriod + ", Offset=" + this.mWaveOffset + ", Phase=" + this.mWavePhase + '}');
        java.lang.String[] strArr = (java.lang.String[]) hashSet.toArray(new java.lang.String[0]);
        for (int i = 0; i < strArr.length; i++) {
            androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(strArr[i]);
            androidx.constraintlayout.core.motion.utils.Utils.log(strArr[i] + ":" + getValue(strArr[i]));
        }
    }
}
