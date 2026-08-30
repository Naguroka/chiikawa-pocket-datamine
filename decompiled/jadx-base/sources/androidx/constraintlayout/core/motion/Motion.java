package androidx.constraintlayout.core.motion;

/* JADX INFO: loaded from: classes.dex */
public class Motion implements androidx.constraintlayout.core.motion.utils.TypedValues {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final java.lang.String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    java.lang.String[] attributeTable;
    private androidx.constraintlayout.core.motion.utils.CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private java.lang.String[] mAttributeNames;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> mAttributesMap;
    java.lang.String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] mKeyTriggers;
    private androidx.constraintlayout.core.motion.utils.CurveFit[] mSpline;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> mTimeCycleAttributesMap;
    androidx.constraintlayout.core.motion.MotionWidget mView;
    androidx.constraintlayout.core.motion.utils.Rect mTempRect = new androidx.constraintlayout.core.motion.utils.Rect();
    private int mCurveFitType = -1;
    private androidx.constraintlayout.core.motion.MotionPaths mStartMotionPath = new androidx.constraintlayout.core.motion.MotionPaths();
    private androidx.constraintlayout.core.motion.MotionPaths mEndMotionPath = new androidx.constraintlayout.core.motion.MotionPaths();
    private androidx.constraintlayout.core.motion.MotionConstrainedPoint mStartPoint = new androidx.constraintlayout.core.motion.MotionConstrainedPoint();
    private androidx.constraintlayout.core.motion.MotionConstrainedPoint mEndPoint = new androidx.constraintlayout.core.motion.MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> mMotionPaths = new java.util.ArrayList<>();
    private float[] mVelocity = new float[1];
    private java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> mKeyList = new java.util.ArrayList<>();
    private int mPathMotionArc = -1;
    private int mTransformPivotTarget = -1;
    private androidx.constraintlayout.core.motion.MotionWidget mTransformPivotView = null;
    private int mQuantizeMotionSteps = -1;
    private float mQuantizeMotionPhase = Float.NaN;
    private androidx.constraintlayout.core.motion.utils.DifferentialInterpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    void endTrigger(boolean z) {
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        return 0;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public void setTransformPivotTarget(int i) {
        this.mTransformPivotTarget = i;
        this.mTransformPivotView = null;
    }

    public androidx.constraintlayout.core.motion.MotionPaths getKeyFrame(int i) {
        return this.mMotionPaths.get(i);
    }

    public Motion(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        setView(motionWidget);
    }

    public float getStartX() {
        return this.mStartMotionPath.x;
    }

    public float getStartY() {
        return this.mStartMotionPath.y;
    }

    public float getFinalX() {
        return this.mEndMotionPath.x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.y;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.width;
    }

    public float getStartHeight() {
        return this.mStartMotionPath.height;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.width;
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.height;
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public void setupRelative(androidx.constraintlayout.core.motion.Motion motion) {
        this.mStartMotionPath.setupRelative(motion, motion.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motion, motion.mEndMotionPath);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getCenter(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d, dArr);
        this.mSpline[0].getSlope(d, dArr2);
        java.util.Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public void buildPath(float[] fArr, int i) {
        float f = 1.0f;
        float f2 = 1.0f / (i - 1);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map = this.mAttributesMap;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSet = map == null ? null : map.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map2 = this.mAttributesMap;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map3 = this.mCycleMap;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator = map3 == null ? null : map3.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map4 = this.mCycleMap;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i2 = 0;
        while (i2 < i) {
            float fMin = i2 * f2;
            float f3 = this.mStaggerScale;
            float f4 = 0.0f;
            if (f3 != f) {
                float f5 = this.mStaggerOffset;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = java.lang.Math.min((fMin - f5) * f3, f);
                }
            }
            float f6 = fMin;
            double d = f6;
            androidx.constraintlayout.core.motion.utils.Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f7 = Float.NaN;
            for (androidx.constraintlayout.core.motion.MotionPaths motionPaths : this.mMotionPaths) {
                if (motionPaths.mKeyFrameEasing != null) {
                    if (motionPaths.time < f6) {
                        easing = motionPaths.mKeyFrameEasing;
                        f4 = motionPaths.time;
                    } else if (java.lang.Float.isNaN(f7)) {
                        f7 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (java.lang.Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f8 = f7 - f4;
                d = (((float) easing.get((f6 - f4) / f8)) * f8) + f4;
            }
            double d2 = d;
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.mStartMotionPath.getCenter(d2, this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
            if (keyCycleOscillator != null) {
                fArr[i3] = fArr[i3] + keyCycleOscillator.get(f6);
            } else if (splineSet != null) {
                fArr[i3] = fArr[i3] + splineSet.get(f6);
            }
            if (keyCycleOscillator2 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + keyCycleOscillator2.get(f6);
            } else if (splineSet2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + splineSet2.get(f6);
            }
            i2 = i4 + 1;
            f = 1.0f;
        }
    }

    double[] getPos(double d) {
        this.mSpline[0].getPos(d, this.mInterpolateData);
        androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d, dArr);
            }
        }
        return this.mInterpolateData;
    }

    void buildBounds(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map = this.mAttributesMap;
        if (map != null) {
            map.get("translationX");
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map2 = this.mAttributesMap;
        if (map2 != null) {
            map2.get("translationY");
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map3 = this.mCycleMap;
        if (map3 != null) {
            map3.get("translationX");
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i2 = 0; i2 < i; i2++) {
            float fMin = i2 * f;
            float f2 = this.mStaggerScale;
            float f3 = 0.0f;
            if (f2 != 1.0f) {
                float f4 = this.mStaggerOffset;
                if (fMin < f4) {
                    fMin = 0.0f;
                }
                if (fMin > f4 && fMin < 1.0d) {
                    fMin = java.lang.Math.min((fMin - f4) * f2, 1.0f);
                }
            }
            double d = fMin;
            androidx.constraintlayout.core.motion.utils.Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f5 = Float.NaN;
            for (androidx.constraintlayout.core.motion.MotionPaths motionPaths : this.mMotionPaths) {
                if (motionPaths.mKeyFrameEasing != null) {
                    if (motionPaths.time < fMin) {
                        easing = motionPaths.mKeyFrameEasing;
                        f3 = motionPaths.time;
                    } else if (java.lang.Float.isNaN(f5)) {
                        f5 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (java.lang.Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                float f6 = f5 - f3;
                d = (((float) easing.get((fMin - f3) / f6)) * f6) + f3;
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i2 * 2);
        }
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = 0.0f;
        while (i < 100) {
            float f2 = i * f;
            double d3 = f2;
            androidx.constraintlayout.core.motion.utils.Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f3 = Float.NaN;
            float f4 = 0.0f;
            for (androidx.constraintlayout.core.motion.MotionPaths motionPaths : this.mMotionPaths) {
                if (motionPaths.mKeyFrameEasing != null) {
                    if (motionPaths.time < f2) {
                        easing = motionPaths.mKeyFrameEasing;
                        f4 = motionPaths.time;
                    } else if (java.lang.Float.isNaN(f3)) {
                        f3 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (java.lang.Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                float f5 = f3 - f4;
                d3 = (((float) easing.get((f2 - f4) / f5)) * f5) + f4;
            }
            this.mSpline[0].getPos(d3, this.mInterpolateData);
            float f6 = fHypot;
            int i2 = i;
            this.mStartMotionPath.getCenter(d3, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            fHypot = i2 > 0 ? (float) (((double) f6) + java.lang.Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]))) : f6;
            d = fArr[0];
            i = i2 + 1;
            d2 = fArr[1];
        }
        return fHypot;
    }

    androidx.constraintlayout.core.motion.key.MotionKeyPosition getPositionKeyframe(int i, int i2, float f, float f2) {
        androidx.constraintlayout.core.motion.utils.FloatRect floatRect = new androidx.constraintlayout.core.motion.utils.FloatRect();
        floatRect.left = this.mStartMotionPath.x;
        floatRect.top = this.mStartMotionPath.y;
        floatRect.right = floatRect.left + this.mStartMotionPath.width;
        floatRect.bottom = floatRect.top + this.mStartMotionPath.height;
        androidx.constraintlayout.core.motion.utils.FloatRect floatRect2 = new androidx.constraintlayout.core.motion.utils.FloatRect();
        floatRect2.left = this.mEndMotionPath.x;
        floatRect2.top = this.mEndMotionPath.y;
        floatRect2.right = floatRect2.left + this.mEndMotionPath.width;
        floatRect2.bottom = floatRect2.top + this.mEndMotionPath.height;
        for (androidx.constraintlayout.core.motion.key.MotionKey motionKey : this.mKeyList) {
            if (motionKey instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition) {
                androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) motionKey;
                if (motionKeyPosition.intersects(i, i2, floatRect, floatRect2, f, f2)) {
                    return motionKeyPosition;
                }
            }
        }
        return null;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().mMode;
                i++;
            }
        }
        if (iArr2 != null) {
            java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it2 = this.mMotionPaths.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                iArr2[i2] = (int) (it2.next().position * 100.0f);
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < timePoints.length; i4++) {
            this.mSpline[0].getPos(timePoints[i4], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i4], this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (double d : timePoints) {
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    int getAttributeValues(java.lang.String str, float[] fArr, int i) {
        androidx.constraintlayout.core.motion.utils.SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = splineSet.get(i2 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void buildRect(float f, float[] fArr, int i) {
        this.mSpline[0].getPos(getAdjustedPosition(f, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i);
    }

    void buildRectangles(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            this.mSpline[0].getPos(getAdjustedPosition(i2 * f, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i2 * 8);
        }
    }

    float getKeyFrameParameter(int i, float f, float f2) {
        float f3 = this.mEndMotionPath.x - this.mStartMotionPath.x;
        float f4 = this.mEndMotionPath.y - this.mStartMotionPath.y;
        float f5 = this.mStartMotionPath.x + (this.mStartMotionPath.width / 2.0f);
        float f6 = this.mStartMotionPath.y + (this.mStartMotionPath.height / 2.0f);
        float fHypot = (float) java.lang.Math.hypot(f3, f4);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f7 = f - f5;
        float f8 = f2 - f6;
        if (((float) java.lang.Math.hypot(f7, f8)) == 0.0f) {
            return 0.0f;
        }
        float f9 = (f7 * f3) + (f8 * f4);
        if (i == 0) {
            return f9 / fHypot;
        }
        if (i == 1) {
            return (float) java.lang.Math.sqrt((fHypot * fHypot) - (f9 * f9));
        }
        if (i == 2) {
            return f7 / f3;
        }
        if (i == 3) {
            return f8 / f3;
        }
        if (i == 4) {
            return f7 / f4;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f8 / f4;
    }

    private void insertKey(androidx.constraintlayout.core.motion.MotionPaths motionPaths) {
        androidx.constraintlayout.core.motion.MotionPaths motionPaths2 = null;
        for (androidx.constraintlayout.core.motion.MotionPaths motionPaths3 : this.mMotionPaths) {
            if (motionPaths.position == motionPaths3.position) {
                motionPaths2 = motionPaths3;
            }
        }
        if (motionPaths2 != null) {
            this.mMotionPaths.remove(motionPaths2);
        }
        int iBinarySearch = java.util.Collections.binarySearch(this.mMotionPaths, motionPaths);
        if (iBinarySearch == 0) {
            androidx.constraintlayout.core.motion.utils.Utils.loge(TAG, " KeyPath position \"" + motionPaths.position + "\" outside of range");
        }
        this.mMotionPaths.add((-iBinarySearch) - 1, motionPaths);
    }

    void addKeys(java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void addKey(androidx.constraintlayout.core.motion.key.MotionKey motionKey) {
        this.mKeyList.add(motionKey);
    }

    public void setPathMotionArc(int i) {
        this.mPathMotionArc = i;
    }

    public void setup(int i, int i2, float f, long j) {
        java.util.ArrayList arrayList;
        androidx.constraintlayout.core.motion.CustomVariable customVariable;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSetMakeSpline;
        androidx.constraintlayout.core.motion.CustomVariable customVariable2;
        java.lang.Integer num;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSetMakeSpline2;
        androidx.constraintlayout.core.motion.CustomVariable customVariable3;
        new java.util.HashSet();
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        java.util.HashSet<java.lang.String> hashSet2 = new java.util.HashSet<>();
        java.util.HashSet<java.lang.String> hashSet3 = new java.util.HashSet<>();
        java.util.HashMap<java.lang.String, java.lang.Integer> map = new java.util.HashMap<>();
        int i3 = this.mPathMotionArc;
        if (i3 != -1) {
            this.mStartMotionPath.mPathMotionArc = i3;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            arrayList = null;
            for (androidx.constraintlayout.core.motion.key.MotionKey motionKey : arrayList2) {
                if (motionKey instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition) {
                    androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) motionKey;
                    insertKey(new androidx.constraintlayout.core.motion.MotionPaths(i, i2, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    if (motionKeyPosition.mCurveFit != -1) {
                        this.mCurveFitType = motionKeyPosition.mCurveFit;
                    }
                } else if (motionKey instanceof androidx.constraintlayout.core.motion.key.MotionKeyCycle) {
                    motionKey.getAttributeNames(hashSet3);
                } else if (motionKey instanceof androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) {
                    motionKey.getAttributeNames(hashSet);
                } else if (motionKey instanceof androidx.constraintlayout.core.motion.key.MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add((androidx.constraintlayout.core.motion.key.MotionKeyTrigger) motionKey);
                } else {
                    motionKey.setInterpolation(map);
                    motionKey.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger[]) arrayList.toArray(new androidx.constraintlayout.core.motion.key.MotionKeyTrigger[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new java.util.HashMap<>();
            for (java.lang.String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar customVar = new androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar();
                    java.lang.String str2 = str.split(",")[c];
                    for (androidx.constraintlayout.core.motion.key.MotionKey motionKey2 : this.mKeyList) {
                        if (motionKey2.mCustom != null && (customVariable3 = motionKey2.mCustom.get(str2)) != null) {
                            customVar.append(motionKey2.mFramePosition, customVariable3);
                        }
                    }
                    splineSetMakeSpline2 = androidx.constraintlayout.core.motion.utils.SplineSet.makeCustomSplineSet(str, customVar);
                } else {
                    splineSetMakeSpline2 = androidx.constraintlayout.core.motion.utils.SplineSet.makeSpline(str, j);
                }
                if (splineSetMakeSpline2 != null) {
                    splineSetMakeSpline2.setType(str);
                    this.mAttributesMap.put(str, splineSetMakeSpline2);
                }
                c = 1;
            }
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                for (androidx.constraintlayout.core.motion.key.MotionKey motionKey3 : arrayList3) {
                    if (motionKey3 instanceof androidx.constraintlayout.core.motion.key.MotionKeyAttributes) {
                        motionKey3.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (java.lang.String str3 : this.mAttributesMap.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                androidx.constraintlayout.core.motion.utils.SplineSet splineSet = this.mAttributesMap.get(str3);
                if (splineSet != null) {
                    splineSet.setup(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new java.util.HashMap<>();
            }
            for (java.lang.String str4 : hashSet) {
                if (!this.mTimeCycleAttributesMap.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar customVar2 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar();
                        java.lang.String str5 = str4.split(",")[1];
                        for (androidx.constraintlayout.core.motion.key.MotionKey motionKey4 : this.mKeyList) {
                            if (motionKey4.mCustom != null && (customVariable2 = motionKey4.mCustom.get(str5)) != null) {
                                customVar2.append(motionKey4.mFramePosition, customVariable2);
                            }
                        }
                        splineSetMakeSpline = androidx.constraintlayout.core.motion.utils.SplineSet.makeCustomSplineSet(str4, customVar2);
                    } else {
                        splineSetMakeSpline = androidx.constraintlayout.core.motion.utils.SplineSet.makeSpline(str4, j);
                    }
                    if (splineSetMakeSpline != null) {
                        splineSetMakeSpline.setType(str4);
                    }
                }
            }
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                for (androidx.constraintlayout.core.motion.key.MotionKey motionKey5 : arrayList4) {
                    if (motionKey5 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) {
                        ((androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) motionKey5).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (java.lang.String str6 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str6).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.mMotionPaths.size() + 2;
        androidx.constraintlayout.core.motion.MotionPaths[] motionPathsArr = new androidx.constraintlayout.core.motion.MotionPaths[size];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size - 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == androidx.constraintlayout.core.motion.key.MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it = this.mMotionPaths.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            motionPathsArr[i4] = it.next();
            i4++;
        }
        java.util.HashSet hashSet4 = new java.util.HashSet();
        for (java.lang.String str7 : this.mEndMotionPath.customAttributes.keySet()) {
            if (this.mStartMotionPath.customAttributes.containsKey(str7) && !hashSet2.contains("CUSTOM," + str7)) {
                hashSet4.add(str7);
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) hashSet4.toArray(new java.lang.String[0]);
        this.mAttributeNames = strArr;
        this.mAttributeInterpolatorCount = new int[strArr.length];
        int i5 = 0;
        while (true) {
            java.lang.String[] strArr2 = this.mAttributeNames;
            if (i5 >= strArr2.length) {
                break;
            }
            java.lang.String str8 = strArr2[i5];
            this.mAttributeInterpolatorCount[i5] = 0;
            for (int i6 = 0; i6 < size; i6++) {
                if (motionPathsArr[i6].customAttributes.containsKey(str8) && (customVariable = motionPathsArr[i6].customAttributes.get(str8)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i5] = iArr[i5] + customVariable.numberOfInterpolatedValues();
                    break;
                }
            }
            i5++;
        }
        boolean z = motionPathsArr[0].mPathMotionArc != -1;
        int length = 18 + this.mAttributeNames.length;
        boolean[] zArr = new boolean[length];
        for (int i7 = 1; i7 < size; i7++) {
            motionPathsArr[i7].different(motionPathsArr[i7 - 1], zArr, this.mAttributeNames, z);
        }
        int i8 = 0;
        for (int i9 = 1; i9 < length; i9++) {
            if (zArr[i9]) {
                i8++;
            }
        }
        this.mInterpolateVariables = new int[i8];
        int iMax = java.lang.Math.max(2, i8);
        this.mInterpolateData = new double[iMax];
        this.mInterpolateVelocity = new double[iMax];
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                this.mInterpolateVariables[i10] = i11;
                i10++;
            }
        }
        double[][] dArr = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, this.mInterpolateVariables.length);
        double[] dArr2 = new double[size];
        for (int i12 = 0; i12 < size; i12++) {
            motionPathsArr[i12].fillStandard(dArr[i12], this.mInterpolateVariables);
            dArr2[i12] = motionPathsArr[i12].time;
        }
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i13 >= iArr2.length) {
                break;
            }
            if (iArr2[i13] < androidx.constraintlayout.core.motion.MotionPaths.names.length) {
                java.lang.String str9 = androidx.constraintlayout.core.motion.MotionPaths.names[this.mInterpolateVariables[i13]] + " [";
                for (int i14 = 0; i14 < size; i14++) {
                    str9 = str9 + dArr[i14][i13];
                }
            }
            i13++;
        }
        this.mSpline = new androidx.constraintlayout.core.motion.utils.CurveFit[this.mAttributeNames.length + 1];
        int i15 = 0;
        while (true) {
            java.lang.String[] strArr3 = this.mAttributeNames;
            if (i15 >= strArr3.length) {
                break;
            }
            java.lang.String str10 = strArr3[i15];
            double[] dArr3 = null;
            double[][] dArr4 = null;
            int i16 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                if (motionPathsArr[i17].hasCustomData(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        dArr4 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, motionPathsArr[i17].getCustomDataCount(str10));
                    }
                    dArr3[i16] = motionPathsArr[i17].time;
                    motionPathsArr[i17].getCustomData(str10, dArr4[i16], 0);
                    i16++;
                }
            }
            i15++;
            this.mSpline[i15] = androidx.constraintlayout.core.motion.utils.CurveFit.get(this.mCurveFitType, java.util.Arrays.copyOf(dArr3, i16), (double[][]) java.util.Arrays.copyOf(dArr4, i16));
        }
        this.mSpline[0] = androidx.constraintlayout.core.motion.utils.CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != -1) {
            int[] iArr3 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, 2);
            for (int i18 = 0; i18 < size; i18++) {
                iArr3[i18] = motionPathsArr[i18].mPathMotionArc;
                dArr5[i18] = motionPathsArr[i18].time;
                dArr6[i18][0] = motionPathsArr[i18].x;
                dArr6[i18][1] = motionPathsArr[i18].y;
            }
            this.mArcSpline = androidx.constraintlayout.core.motion.utils.CurveFit.getArc(iArr3, dArr5, dArr6);
        }
        this.mCycleMap = new java.util.HashMap<>();
        if (this.mKeyList != null) {
            float preCycleDistance = Float.NaN;
            for (java.lang.String str11 : hashSet3) {
                androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillatorMakeWidgetCycle = androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.makeWidgetCycle(str11);
                if (keyCycleOscillatorMakeWidgetCycle != null) {
                    if (keyCycleOscillatorMakeWidgetCycle.variesByPath() && java.lang.Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    keyCycleOscillatorMakeWidgetCycle.setType(str11);
                    this.mCycleMap.put(str11, keyCycleOscillatorMakeWidgetCycle);
                }
            }
            for (androidx.constraintlayout.core.motion.key.MotionKey motionKey6 : this.mKeyList) {
                if (motionKey6 instanceof androidx.constraintlayout.core.motion.key.MotionKeyCycle) {
                    ((androidx.constraintlayout.core.motion.key.MotionKeyCycle) motionKey6).addCycleValues(this.mCycleMap);
                }
            }
            java.util.Iterator<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> it2 = this.mCycleMap.values().iterator();
            while (it2.hasNext()) {
                it2.next().setup(preCycleDistance);
            }
        }
    }

    public java.lang.String toString() {
        return " start: x: " + this.mStartMotionPath.x + " y: " + this.mStartMotionPath.y + " end: x: " + this.mEndMotionPath.x + " y: " + this.mEndMotionPath.y;
    }

    private void readView(androidx.constraintlayout.core.motion.MotionPaths motionPaths) {
        motionPaths.setBounds(this.mView.getX(), this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void setView(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    public androidx.constraintlayout.core.motion.MotionWidget getView() {
        return this.mView;
    }

    public void setStart(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        this.mStartMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartMotionPath.applyParameters(motionWidget);
        this.mStartPoint.setState(motionWidget);
    }

    public void setEnd(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        this.mEndMotionPath.time = 1.0f;
        this.mEndMotionPath.position = 1.0f;
        readView(this.mEndMotionPath);
        this.mEndMotionPath.setBounds(motionWidget.getLeft(), motionWidget.getTop(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.applyParameters(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setStartState(androidx.constraintlayout.core.motion.utils.ViewState viewState, androidx.constraintlayout.core.motion.MotionWidget motionWidget, int i, int i2, int i3) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        androidx.constraintlayout.core.motion.utils.Rect rect = new androidx.constraintlayout.core.motion.utils.Rect();
        if (i == 1) {
            int i4 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i2 - ((i4 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        } else if (i == 2) {
            int i5 = viewState.left + viewState.right;
            rect.left = i3 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
            rect.top = (i5 - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, motionWidget, i, viewState.rotation);
    }

    void rotate(androidx.constraintlayout.core.motion.utils.Rect rect, androidx.constraintlayout.core.motion.utils.Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((i4 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            int i6 = rect.left + rect.right;
            rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
            rect2.top = (i6 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        int i7 = rect.left + rect.right;
        int i8 = rect.top;
        int i9 = rect.bottom;
        rect2.left = ((rect.height() / 2) + rect.top) - (i7 / 2);
        rect2.top = i3 - ((i7 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    private static androidx.constraintlayout.core.motion.utils.DifferentialInterpolator getInterpolator(int i, java.lang.String str, int i2) {
        if (i != -1) {
            return null;
        }
        final androidx.constraintlayout.core.motion.utils.Easing interpolator = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(str);
        return new androidx.constraintlayout.core.motion.utils.DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1
            float mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f) {
                this.mX = f;
                return (float) interpolator.get(f);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) interpolator.getDiff(this.mX);
            }
        };
    }

    void setBothStates(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        this.mNoMovement = true;
        this.mStartMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartPoint.setState(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    private float getAdjustedPosition(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.mStaggerScale;
            if (f3 != 1.0d) {
                float f4 = this.mStaggerOffset;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = java.lang.Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f5 = Float.NaN;
        for (androidx.constraintlayout.core.motion.MotionPaths motionPaths : this.mMotionPaths) {
            if (motionPaths.mKeyFrameEasing != null) {
                if (motionPaths.time < f) {
                    easing = motionPaths.mKeyFrameEasing;
                    f2 = motionPaths.time;
                } else if (java.lang.Float.isNaN(f5)) {
                    f5 = motionPaths.time;
                }
            }
        }
        if (easing != null) {
            float f6 = (java.lang.Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f6;
            f = (((float) easing.get(d)) * f6) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d);
            }
        }
        return f;
    }

    public boolean interpolate(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
        float interpolation;
        float adjustedPosition = getAdjustedPosition(f, null);
        int i = this.mQuantizeMotionSteps;
        if (i != -1) {
            float f2 = 1.0f / i;
            float fFloor = ((float) java.lang.Math.floor(adjustedPosition / f2)) * f2;
            float f3 = (adjustedPosition % f2) / f2;
            if (!java.lang.Float.isNaN(this.mQuantizeMotionPhase)) {
                f3 = (f3 + this.mQuantizeMotionPhase) % 1.0f;
            }
            androidx.constraintlayout.core.motion.utils.DifferentialInterpolator differentialInterpolator = this.mQuantizeMotionInterpolator;
            if (differentialInterpolator != null) {
                interpolation = differentialInterpolator.getInterpolation(f3);
            } else {
                interpolation = ((double) f3) > 0.5d ? 1.0f : 0.0f;
            }
            adjustedPosition = (interpolation * f2) + fFloor;
        }
        float f4 = adjustedPosition;
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map = this.mAttributesMap;
        if (map != null) {
            java.util.Iterator<androidx.constraintlayout.core.motion.utils.SplineSet> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget, f4);
            }
        }
        androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d = f4;
            curveFitArr[0].getPos(d, this.mInterpolateData);
            this.mSpline[0].getSlope(d, this.mInterpolateVelocity);
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                this.mStartMotionPath.setView(f4, motionWidget, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = motionWidget.getParent().findViewById(this.mTransformPivotTarget);
                }
                androidx.constraintlayout.core.motion.MotionWidget motionWidget2 = this.mTransformPivotView;
                if (motionWidget2 != null) {
                    float top = (motionWidget2.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (motionWidget.getRight() - motionWidget.getLeft() > 0 && motionWidget.getBottom() - motionWidget.getTop() > 0) {
                        float left2 = left - motionWidget.getLeft();
                        float top2 = top - motionWidget.getTop();
                        motionWidget.setPivotX(left2);
                        motionWidget.setPivotY(top2);
                    }
                }
            }
            int i2 = 1;
            while (true) {
                androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr2 = this.mSpline;
                if (i2 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i2].getPos(d, this.mValuesBuff);
                this.mStartMotionPath.customAttributes.get(this.mAttributeNames[i2 - 1]).setInterpolatedValue(motionWidget, this.mValuesBuff);
                i2++;
            }
            if (this.mStartPoint.mVisibilityMode == 0) {
                if (f4 <= 0.0f) {
                    motionWidget.setVisibility(this.mStartPoint.visibility);
                } else if (f4 >= 1.0f) {
                    motionWidget.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != this.mStartPoint.visibility) {
                    motionWidget.setVisibility(4);
                }
            }
            if (this.mKeyTriggers != null) {
                int i3 = 0;
                while (true) {
                    androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i3 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i3].conditionallyFire(f4, motionWidget);
                    i3++;
                }
            }
        } else {
            float f5 = this.mStartMotionPath.x + ((this.mEndMotionPath.x - this.mStartMotionPath.x) * f4) + 0.5f;
            float f6 = this.mStartMotionPath.y + ((this.mEndMotionPath.y - this.mStartMotionPath.y) * f4) + 0.5f;
            motionWidget.layout((int) f5, (int) f6, (int) (f5 + this.mStartMotionPath.width + ((this.mEndMotionPath.width - this.mStartMotionPath.width) * f4)), (int) (f6 + this.mStartMotionPath.height + ((this.mEndMotionPath.height - this.mStartMotionPath.height) * f4)));
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map2 = this.mCycleMap;
        if (map2 == null) {
            return false;
        }
        for (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator : map2.values()) {
            if (keyCycleOscillator instanceof androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet) {
                double[] dArr2 = this.mInterpolateVelocity;
                ((androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget, f4, dArr2[0], dArr2[1]);
            } else {
                keyCycleOscillator.setProperty(motionWidget, f4);
            }
        }
        return false;
    }

    void getDpDt(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr = this.mSpline;
        int i = 0;
        if (curveFitArr != null) {
            double d = adjustedPosition;
            curveFitArr[0].getSlope(d, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        float f5 = this.mEndMotionPath.x - this.mStartMotionPath.x;
        float f6 = this.mEndMotionPath.y - this.mStartMotionPath.y;
        float f7 = (this.mEndMotionPath.width - this.mStartMotionPath.width) + f5;
        float f8 = (this.mEndMotionPath.height - this.mStartMotionPath.height) + f6;
        fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
        fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
    }

    void getPostLayoutDvDp(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map = this.mAttributesMap;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSet = map == null ? null : map.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map2 = this.mAttributesMap;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map3 = this.mAttributesMap;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSet3 = map3 == null ? null : map3.get("rotationZ");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map4 = this.mAttributesMap;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSet4 = map4 == null ? null : map4.get("scaleX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map5 = this.mAttributesMap;
        androidx.constraintlayout.core.motion.utils.SplineSet splineSet5 = map5 == null ? null : map5.get("scaleY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map6 = this.mCycleMap;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator = map6 == null ? null : map6.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map7 = this.mCycleMap;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator2 = map7 == null ? null : map7.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map8 = this.mCycleMap;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator3 = map8 == null ? null : map8.get("rotationZ");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map9 = this.mCycleMap;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator4 = map9 == null ? null : map9.get("scaleX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> map10 = this.mCycleMap;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator5 = map10 != null ? map10.get("scaleY") : null;
        androidx.constraintlayout.core.motion.utils.VelocityMatrix velocityMatrix = new androidx.constraintlayout.core.motion.utils.VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d = adjustedPosition;
                curveFit.getPos(d, dArr);
                this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * ((double) f4);
                    i3++;
                } else {
                    this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            float f5 = this.mEndMotionPath.x - this.mStartMotionPath.x;
            float f6 = this.mEndMotionPath.y - this.mStartMotionPath.y;
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator6 = keyCycleOscillator5;
            float f7 = (this.mEndMotionPath.width - this.mStartMotionPath.width) + f5;
            float f8 = (this.mEndMotionPath.height - this.mStartMotionPath.height) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
        }
    }

    public int getDrawPath() {
        int iMax = this.mStartMotionPath.mDrawPath;
        java.util.Iterator<androidx.constraintlayout.core.motion.MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            iMax = java.lang.Math.max(iMax, it.next().mDrawPath);
        }
        return java.lang.Math.max(iMax, this.mEndMotionPath.mDrawPath);
    }

    public void setDrawPath(int i) {
        this.mStartMotionPath.mDrawPath = i;
    }

    java.lang.String name() {
        return this.mView.getName();
    }

    void positionKeyframe(androidx.constraintlayout.core.motion.MotionWidget motionWidget, androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition, float f, float f2, java.lang.String[] strArr, float[] fArr) {
        androidx.constraintlayout.core.motion.utils.FloatRect floatRect = new androidx.constraintlayout.core.motion.utils.FloatRect();
        floatRect.left = this.mStartMotionPath.x;
        floatRect.top = this.mStartMotionPath.y;
        floatRect.right = floatRect.left + this.mStartMotionPath.width;
        floatRect.bottom = floatRect.top + this.mStartMotionPath.height;
        androidx.constraintlayout.core.motion.utils.FloatRect floatRect2 = new androidx.constraintlayout.core.motion.utils.FloatRect();
        floatRect2.left = this.mEndMotionPath.x;
        floatRect2.top = this.mEndMotionPath.y;
        floatRect2.right = floatRect2.left + this.mEndMotionPath.width;
        floatRect2.bottom = floatRect2.top + this.mEndMotionPath.height;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f, f2, strArr, fArr);
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        int i = 0;
        int i2 = 0;
        for (androidx.constraintlayout.core.motion.key.MotionKey motionKey : this.mKeyList) {
            iArr[i] = motionKey.mFramePosition + (motionKey.mType * 1000);
            double d = motionKey.mFramePosition / 100.0f;
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        float[] fArr = new float[2];
        int i2 = 0;
        int i3 = 0;
        for (androidx.constraintlayout.core.motion.key.MotionKey motionKey : this.mKeyList) {
            if (motionKey.mType == i || i != -1) {
                iArr[i3] = 0;
                int i4 = i3 + 1;
                iArr[i4] = motionKey.mType;
                int i5 = i4 + 1;
                iArr[i5] = motionKey.mFramePosition;
                double d = motionKey.mFramePosition / 100.0f;
                this.mSpline[0].getPos(d, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                int i6 = i5 + 1;
                iArr[i6] = java.lang.Float.floatToIntBits(fArr[0]);
                int i7 = i6 + 1;
                iArr[i7] = java.lang.Float.floatToIntBits(fArr[1]);
                if (motionKey instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition) {
                    androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) motionKey;
                    int i8 = i7 + 1;
                    iArr[i8] = motionKeyPosition.mPositionType;
                    int i9 = i8 + 1;
                    iArr[i9] = java.lang.Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i7 = i9 + 1;
                    iArr[i7] = java.lang.Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i10 = i7 + 1;
                iArr[i3] = i10 - i3;
                i2++;
                i3 = i10;
            }
        }
        return i2;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i != 509) {
            return i == 704;
        }
        setPathMotionArc(i2);
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (705 == i) {
            java.lang.System.out.println("TYPE_INTERPOLATOR  " + str);
            this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
        }
        return false;
    }
}
