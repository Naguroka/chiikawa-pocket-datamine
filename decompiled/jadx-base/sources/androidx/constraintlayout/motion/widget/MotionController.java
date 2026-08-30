package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class MotionController {
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
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> mAttributesMap;
    java.lang.String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private androidx.constraintlayout.motion.widget.KeyTrigger[] mKeyTriggers;
    private androidx.constraintlayout.core.motion.utils.CurveFit[] mSpline;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> mTimeCycleAttributesMap;
    android.view.View mView;
    android.graphics.Rect mTempRect = new android.graphics.Rect();
    boolean mForceMeasure = false;
    private int mCurveFitType = -1;
    private androidx.constraintlayout.motion.widget.MotionPaths mStartMotionPath = new androidx.constraintlayout.motion.widget.MotionPaths();
    private androidx.constraintlayout.motion.widget.MotionPaths mEndMotionPath = new androidx.constraintlayout.motion.widget.MotionPaths();
    private androidx.constraintlayout.motion.widget.MotionConstrainedPoint mStartPoint = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint();
    private androidx.constraintlayout.motion.widget.MotionConstrainedPoint mEndPoint = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> mMotionPaths = new java.util.ArrayList<>();
    private float[] mVelocity = new float[1];
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> mKeyList = new java.util.ArrayList<>();
    private int mPathMotionArc = androidx.constraintlayout.motion.widget.Key.UNSET;
    private int mTransformPivotTarget = androidx.constraintlayout.motion.widget.Key.UNSET;
    private android.view.View mTransformPivotView = null;
    private int mQuantizeMotionSteps = androidx.constraintlayout.motion.widget.Key.UNSET;
    private float mQuantizeMotionPhase = Float.NaN;
    private android.view.animation.Interpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public void setTransformPivotTarget(int transformPivotTarget) {
        this.mTransformPivotTarget = transformPivotTarget;
        this.mTransformPivotView = null;
    }

    androidx.constraintlayout.motion.widget.MotionPaths getKeyFrame(int i) {
        return this.mMotionPaths.get(i);
    }

    MotionController(android.view.View view) {
        setView(view);
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

    public void setupRelative(androidx.constraintlayout.motion.widget.MotionController motionController) {
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getCenter(double p, float[] pos, float[] vel) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(p, dArr);
        this.mSpline[0].getSlope(p, dArr2);
        java.util.Arrays.fill(vel, 0.0f);
        this.mStartMotionPath.getCenter(p, this.mInterpolateVariables, dArr, pos, dArr2, vel);
    }

    public void remeasure() {
        this.mForceMeasure = true;
    }

    void buildPath(float[] points, int pointCount) {
        float f = 1.0f;
        float f2 = 1.0f / (pointCount - 1);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map = this.mAttributesMap;
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline = map == null ? null : map.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map2 = this.mAttributesMap;
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline2 = map2 == null ? null : map2.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> map3 = this.mCycleMap;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator = map3 == null ? null : map3.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> map4 = this.mCycleMap;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i = 0;
        while (i < pointCount) {
            float fMin = i * f2;
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
            for (androidx.constraintlayout.motion.widget.MotionPaths motionPaths : this.mMotionPaths) {
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
            int i2 = i * 2;
            int i3 = i;
            this.mStartMotionPath.getCenter(d2, this.mInterpolateVariables, this.mInterpolateData, points, i2);
            if (viewOscillator != null) {
                points[i2] = points[i2] + viewOscillator.get(f6);
            } else if (viewSpline != null) {
                points[i2] = points[i2] + viewSpline.get(f6);
            }
            if (viewOscillator2 != null) {
                int i4 = i2 + 1;
                points[i4] = points[i4] + viewOscillator2.get(f6);
            } else if (viewSpline2 != null) {
                int i5 = i2 + 1;
                points[i5] = points[i5] + viewSpline2.get(f6);
            }
            i = i3 + 1;
            f = 1.0f;
        }
    }

    double[] getPos(double position) {
        this.mSpline[0].getPos(position, this.mInterpolateData);
        androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(position, dArr);
            }
        }
        return this.mInterpolateData;
    }

    void buildBounds(float[] bounds, int pointCount) {
        float f = 1.0f / (pointCount - 1);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map = this.mAttributesMap;
        if (map != null) {
            map.get("translationX");
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map2 = this.mAttributesMap;
        if (map2 != null) {
            map2.get("translationY");
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> map3 = this.mCycleMap;
        if (map3 != null) {
            map3.get("translationX");
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i = 0; i < pointCount; i++) {
            float fMin = i * f;
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
            for (androidx.constraintlayout.motion.widget.MotionPaths motionPaths : this.mMotionPaths) {
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
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, bounds, i * 2);
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
            for (androidx.constraintlayout.motion.widget.MotionPaths motionPaths : this.mMotionPaths) {
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

    androidx.constraintlayout.motion.widget.KeyPositionBase getPositionKeyframe(int layoutWidth, int layoutHeight, float x, float y) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = this.mStartMotionPath.x;
        rectF.top = this.mStartMotionPath.y;
        rectF.right = rectF.left + this.mStartMotionPath.width;
        rectF.bottom = rectF.top + this.mStartMotionPath.height;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        rectF2.left = this.mEndMotionPath.x;
        rectF2.top = this.mEndMotionPath.y;
        rectF2.right = rectF2.left + this.mEndMotionPath.width;
        rectF2.bottom = rectF2.top + this.mEndMotionPath.height;
        for (androidx.constraintlayout.motion.widget.Key key : this.mKeyList) {
            if (key instanceof androidx.constraintlayout.motion.widget.KeyPositionBase) {
                androidx.constraintlayout.motion.widget.KeyPositionBase keyPositionBase = (androidx.constraintlayout.motion.widget.KeyPositionBase) key;
                if (keyPositionBase.intersects(layoutWidth, layoutHeight, rectF, rectF2, x, y)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    int buildKeyFrames(float[] keyFrames, int[] mode) {
        if (keyFrames == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (mode != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                mode[i] = it.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < timePoints.length; i3++) {
            this.mSpline[0].getPos(timePoints[i3], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i3], this.mInterpolateVariables, this.mInterpolateData, keyFrames, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    int buildKeyBounds(float[] keyBounds, int[] mode) {
        if (keyBounds == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (mode != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                mode[i] = it.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (double d : timePoints) {
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, keyBounds, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    int getAttributeValues(java.lang.String attributeType, float[] points, int pointCount) {
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline = this.mAttributesMap.get(attributeType);
        if (viewSpline == null) {
            return -1;
        }
        for (int i = 0; i < points.length; i++) {
            points[i] = viewSpline.get(i / (points.length - 1));
        }
        return points.length;
    }

    void buildRect(float p, float[] path, int offset) {
        this.mSpline[0].getPos(getAdjustedPosition(p, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, path, offset);
    }

    void buildRectangles(float[] path, int pointCount) {
        float f = 1.0f / (pointCount - 1);
        for (int i = 0; i < pointCount; i++) {
            this.mSpline[0].getPos(getAdjustedPosition(i * f, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, path, i * 8);
        }
    }

    float getKeyFrameParameter(int type, float x, float y) {
        float f = this.mEndMotionPath.x - this.mStartMotionPath.x;
        float f2 = this.mEndMotionPath.y - this.mStartMotionPath.y;
        float f3 = this.mStartMotionPath.x + (this.mStartMotionPath.width / 2.0f);
        float f4 = this.mStartMotionPath.y + (this.mStartMotionPath.height / 2.0f);
        float fHypot = (float) java.lang.Math.hypot(f, f2);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f5 = x - f3;
        float f6 = y - f4;
        if (((float) java.lang.Math.hypot(f5, f6)) == 0.0f) {
            return 0.0f;
        }
        float f7 = (f5 * f) + (f6 * f2);
        if (type == 0) {
            return f7 / fHypot;
        }
        if (type == 1) {
            return (float) java.lang.Math.sqrt((fHypot * fHypot) - (f7 * f7));
        }
        if (type == 2) {
            return f5 / f;
        }
        if (type == 3) {
            return f6 / f;
        }
        if (type == 4) {
            return f5 / f2;
        }
        if (type != 5) {
            return 0.0f;
        }
        return f6 / f2;
    }

    private void insertKey(androidx.constraintlayout.motion.widget.MotionPaths point) {
        int iBinarySearch = java.util.Collections.binarySearch(this.mMotionPaths, point);
        if (iBinarySearch == 0) {
            android.util.Log.e(TAG, " KeyPath position \"" + point.position + "\" outside of range");
        }
        this.mMotionPaths.add((-iBinarySearch) - 1, point);
    }

    void addKeys(java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> list) {
        this.mKeyList.addAll(list);
    }

    public void addKey(androidx.constraintlayout.motion.widget.Key key) {
        this.mKeyList.add(key);
    }

    public void setPathMotionArc(int arc) {
        this.mPathMotionArc = arc;
    }

    public void setup(int parentWidth, int parentHeight, float transitionDuration, long currentTime) {
        java.util.ArrayList arrayList;
        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute;
        androidx.constraintlayout.motion.utils.ViewTimeCycle viewTimeCycleMakeSpline;
        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute2;
        java.lang.Integer num;
        androidx.constraintlayout.motion.utils.ViewSpline viewSplineMakeSpline;
        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute3;
        new java.util.HashSet();
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        java.util.HashSet<java.lang.String> hashSet2 = new java.util.HashSet<>();
        java.util.HashSet<java.lang.String> hashSet3 = new java.util.HashSet<>();
        java.util.HashMap<java.lang.String, java.lang.Integer> map = new java.util.HashMap<>();
        if (this.mPathMotionArc != androidx.constraintlayout.motion.widget.Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = this.mPathMotionArc;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            arrayList = null;
            for (androidx.constraintlayout.motion.widget.Key key : arrayList2) {
                if (key instanceof androidx.constraintlayout.motion.widget.KeyPosition) {
                    androidx.constraintlayout.motion.widget.KeyPosition keyPosition = (androidx.constraintlayout.motion.widget.KeyPosition) key;
                    insertKey(new androidx.constraintlayout.motion.widget.MotionPaths(parentWidth, parentHeight, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    if (keyPosition.mCurveFit != androidx.constraintlayout.motion.widget.Key.UNSET) {
                        this.mCurveFitType = keyPosition.mCurveFit;
                    }
                } else if (key instanceof androidx.constraintlayout.motion.widget.KeyCycle) {
                    key.getAttributeNames(hashSet3);
                } else if (key instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle) {
                    key.getAttributeNames(hashSet);
                } else if (key instanceof androidx.constraintlayout.motion.widget.KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add((androidx.constraintlayout.motion.widget.KeyTrigger) key);
                } else {
                    key.setInterpolation(map);
                    key.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i = 0;
        if (arrayList != null) {
            this.mKeyTriggers = (androidx.constraintlayout.motion.widget.KeyTrigger[]) arrayList.toArray(new androidx.constraintlayout.motion.widget.KeyTrigger[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new java.util.HashMap<>();
            for (java.lang.String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    android.util.SparseArray sparseArray = new android.util.SparseArray();
                    java.lang.String str2 = str.split(",")[1];
                    for (androidx.constraintlayout.motion.widget.Key key2 : this.mKeyList) {
                        if (key2.mCustomConstraints != null && (constraintAttribute3 = key2.mCustomConstraints.get(str2)) != null) {
                            sparseArray.append(key2.mFramePosition, constraintAttribute3);
                        }
                    }
                    viewSplineMakeSpline = androidx.constraintlayout.motion.utils.ViewSpline.makeCustomSpline(str, (android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute>) sparseArray);
                } else {
                    viewSplineMakeSpline = androidx.constraintlayout.motion.utils.ViewSpline.makeSpline(str);
                }
                if (viewSplineMakeSpline != null) {
                    viewSplineMakeSpline.setType(str);
                    this.mAttributesMap.put(str, viewSplineMakeSpline);
                }
            }
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                for (androidx.constraintlayout.motion.widget.Key key3 : arrayList3) {
                    if (key3 instanceof androidx.constraintlayout.motion.widget.KeyAttributes) {
                        key3.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (java.lang.String str3 : this.mAttributesMap.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                androidx.constraintlayout.motion.utils.ViewSpline viewSpline = this.mAttributesMap.get(str3);
                if (viewSpline != null) {
                    viewSpline.setup(iIntValue);
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
                        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                        java.lang.String str5 = str4.split(",")[1];
                        for (androidx.constraintlayout.motion.widget.Key key4 : this.mKeyList) {
                            if (key4.mCustomConstraints != null && (constraintAttribute2 = key4.mCustomConstraints.get(str5)) != null) {
                                sparseArray2.append(key4.mFramePosition, constraintAttribute2);
                            }
                        }
                        viewTimeCycleMakeSpline = androidx.constraintlayout.motion.utils.ViewTimeCycle.makeCustomSpline(str4, sparseArray2);
                    } else {
                        viewTimeCycleMakeSpline = androidx.constraintlayout.motion.utils.ViewTimeCycle.makeSpline(str4, currentTime);
                    }
                    if (viewTimeCycleMakeSpline != null) {
                        viewTimeCycleMakeSpline.setType(str4);
                        this.mTimeCycleAttributesMap.put(str4, viewTimeCycleMakeSpline);
                    }
                }
            }
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                for (androidx.constraintlayout.motion.widget.Key key5 : arrayList4) {
                    if (key5 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle) {
                        ((androidx.constraintlayout.motion.widget.KeyTimeCycle) key5).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (java.lang.String str6 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str6).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int i2 = 2;
        int size = this.mMotionPaths.size() + 2;
        androidx.constraintlayout.motion.widget.MotionPaths[] motionPathsArr = new androidx.constraintlayout.motion.widget.MotionPaths[size];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size - 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.mMotionPaths.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            motionPathsArr[i3] = it.next();
            i3++;
        }
        java.util.HashSet hashSet4 = new java.util.HashSet();
        for (java.lang.String str7 : this.mEndMotionPath.attributes.keySet()) {
            if (this.mStartMotionPath.attributes.containsKey(str7) && !hashSet2.contains("CUSTOM," + str7)) {
                hashSet4.add(str7);
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) hashSet4.toArray(new java.lang.String[0]);
        this.mAttributeNames = strArr;
        this.mAttributeInterpolatorCount = new int[strArr.length];
        int i4 = 0;
        while (true) {
            java.lang.String[] strArr2 = this.mAttributeNames;
            if (i4 >= strArr2.length) {
                break;
            }
            java.lang.String str8 = strArr2[i4];
            this.mAttributeInterpolatorCount[i4] = 0;
            for (int i5 = 0; i5 < size; i5++) {
                if (motionPathsArr[i5].attributes.containsKey(str8) && (constraintAttribute = motionPathsArr[i5].attributes.get(str8)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i4] = iArr[i4] + constraintAttribute.numberOfInterpolatedValues();
                    break;
                }
            }
            i4++;
        }
        boolean z = motionPathsArr[0].mPathMotionArc != androidx.constraintlayout.motion.widget.Key.UNSET;
        int length = 18 + this.mAttributeNames.length;
        boolean[] zArr = new boolean[length];
        for (int i6 = 1; i6 < size; i6++) {
            motionPathsArr[i6].different(motionPathsArr[i6 - 1], zArr, this.mAttributeNames, z);
        }
        int i7 = 0;
        for (int i8 = 1; i8 < length; i8++) {
            if (zArr[i8]) {
                i7++;
            }
        }
        this.mInterpolateVariables = new int[i7];
        int iMax = java.lang.Math.max(2, i7);
        this.mInterpolateData = new double[iMax];
        this.mInterpolateVelocity = new double[iMax];
        int i9 = 0;
        for (int i10 = 1; i10 < length; i10++) {
            if (zArr[i10]) {
                this.mInterpolateVariables[i9] = i10;
                i9++;
            }
        }
        double[][] dArr = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, this.mInterpolateVariables.length);
        double[] dArr2 = new double[size];
        for (int i11 = 0; i11 < size; i11++) {
            motionPathsArr[i11].fillStandard(dArr[i11], this.mInterpolateVariables);
            dArr2[i11] = motionPathsArr[i11].time;
        }
        int i12 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i12 >= iArr2.length) {
                break;
            }
            if (iArr2[i12] < androidx.constraintlayout.motion.widget.MotionPaths.names.length) {
                java.lang.String str9 = androidx.constraintlayout.motion.widget.MotionPaths.names[this.mInterpolateVariables[i12]] + " [";
                for (int i13 = 0; i13 < size; i13++) {
                    str9 = str9 + dArr[i13][i12];
                }
            }
            i12++;
        }
        this.mSpline = new androidx.constraintlayout.core.motion.utils.CurveFit[this.mAttributeNames.length + 1];
        int i14 = 0;
        while (true) {
            java.lang.String[] strArr3 = this.mAttributeNames;
            if (i14 >= strArr3.length) {
                break;
            }
            java.lang.String str10 = strArr3[i14];
            int i15 = i;
            int i16 = i15;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i15 < size) {
                if (motionPathsArr[i15].hasCustomData(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i2];
                        iArr3[1] = motionPathsArr[i15].getCustomDataCount(str10);
                        iArr3[i] = size;
                        dArr4 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, iArr3);
                    }
                    dArr3[i16] = motionPathsArr[i15].time;
                    motionPathsArr[i15].getCustomData(str10, dArr4[i16], 0);
                    i16++;
                }
                i15++;
                i2 = 2;
                i = 0;
            }
            i14++;
            this.mSpline[i14] = androidx.constraintlayout.core.motion.utils.CurveFit.get(this.mCurveFitType, java.util.Arrays.copyOf(dArr3, i16), (double[][]) java.util.Arrays.copyOf(dArr4, i16));
            i2 = 2;
            i = 0;
        }
        this.mSpline[0] = androidx.constraintlayout.core.motion.utils.CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != androidx.constraintlayout.motion.widget.Key.UNSET) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, 2);
            for (int i17 = 0; i17 < size; i17++) {
                iArr4[i17] = motionPathsArr[i17].mPathMotionArc;
                dArr5[i17] = motionPathsArr[i17].time;
                dArr6[i17][0] = motionPathsArr[i17].x;
                dArr6[i17][1] = motionPathsArr[i17].y;
            }
            this.mArcSpline = androidx.constraintlayout.core.motion.utils.CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        this.mCycleMap = new java.util.HashMap<>();
        if (this.mKeyList != null) {
            float preCycleDistance = Float.NaN;
            for (java.lang.String str11 : hashSet3) {
                androidx.constraintlayout.motion.utils.ViewOscillator viewOscillatorMakeSpline = androidx.constraintlayout.motion.utils.ViewOscillator.makeSpline(str11);
                if (viewOscillatorMakeSpline != null) {
                    if (viewOscillatorMakeSpline.variesByPath() && java.lang.Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    viewOscillatorMakeSpline.setType(str11);
                    this.mCycleMap.put(str11, viewOscillatorMakeSpline);
                }
            }
            for (androidx.constraintlayout.motion.widget.Key key6 : this.mKeyList) {
                if (key6 instanceof androidx.constraintlayout.motion.widget.KeyCycle) {
                    ((androidx.constraintlayout.motion.widget.KeyCycle) key6).addCycleValues(this.mCycleMap);
                }
            }
            java.util.Iterator<androidx.constraintlayout.motion.utils.ViewOscillator> it2 = this.mCycleMap.values().iterator();
            while (it2.hasNext()) {
                it2.next().setup(preCycleDistance);
            }
        }
    }

    public java.lang.String toString() {
        return " start: x: " + this.mStartMotionPath.x + " y: " + this.mStartMotionPath.y + " end: x: " + this.mEndMotionPath.x + " y: " + this.mEndMotionPath.y;
    }

    private void readView(androidx.constraintlayout.motion.widget.MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void setView(android.view.View view) {
        this.mView = view;
        this.mId = view.getId();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public android.view.View getView() {
        return this.mView;
    }

    void setStartCurrentState(android.view.View v) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        this.mStartMotionPath.setBounds(v.getX(), v.getY(), v.getWidth(), v.getHeight());
        this.mStartPoint.setState(v);
    }

    public void setStartState(androidx.constraintlayout.motion.utils.ViewState rect, android.view.View v, int rotation, int preWidth, int preHeight) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        android.graphics.Rect rect2 = new android.graphics.Rect();
        if (rotation == 1) {
            int i = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = preWidth - ((i + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (rotation == 2) {
            int i2 = rect.left + rect.right;
            rect2.left = preHeight - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i2 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
        this.mStartMotionPath.setBounds(rect2.left, rect2.top, rect2.width(), rect2.height());
        this.mStartPoint.setState(rect2, v, rotation, rect.rotation);
    }

    void rotate(android.graphics.Rect rect, android.graphics.Rect out, int rotation, int preHeight, int preWidth) {
        if (rotation == 1) {
            int i = rect.left + rect.right;
            out.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            out.top = preWidth - ((i + rect.height()) / 2);
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        if (rotation == 2) {
            int i2 = rect.left + rect.right;
            out.left = preHeight - (((rect.top + rect.bottom) + rect.width()) / 2);
            out.top = (i2 - rect.height()) / 2;
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        if (rotation != 3) {
            if (rotation != 4) {
                return;
            }
            int i3 = rect.left + rect.right;
            out.left = preHeight - (((rect.bottom + rect.top) + rect.width()) / 2);
            out.top = (i3 - rect.height()) / 2;
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        int i4 = rect.left + rect.right;
        int i5 = rect.top;
        int i6 = rect.bottom;
        out.left = ((rect.height() / 2) + rect.top) - (i4 / 2);
        out.top = preWidth - ((i4 + rect.height()) / 2);
        out.right = out.left + rect.width();
        out.bottom = out.top + rect.height();
    }

    void setStartState(android.graphics.Rect cw, androidx.constraintlayout.widget.ConstraintSet constraintSet, int parentWidth, int parentHeight) {
        int i = constraintSet.mRotate;
        if (i != 0) {
            rotate(cw, this.mTempRect, i, parentWidth, parentHeight);
        }
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        readView(this.mStartMotionPath);
        this.mStartMotionPath.setBounds(cw.left, cw.top, cw.width(), cw.height());
        androidx.constraintlayout.widget.ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(cw, constraintSet, i, this.mId);
        this.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        this.mQuantizeMotionSteps = parameters.motion.mQuantizeMotionSteps;
        this.mQuantizeMotionPhase = parameters.motion.mQuantizeMotionPhase;
        this.mQuantizeMotionInterpolator = getInterpolator(this.mView.getContext(), parameters.motion.mQuantizeInterpolatorType, parameters.motion.mQuantizeInterpolatorString, parameters.motion.mQuantizeInterpolatorID);
    }

    private static android.view.animation.Interpolator getInterpolator(android.content.Context context, int type, java.lang.String interpolatorString, int id) {
        if (type == -2) {
            return android.view.animation.AnimationUtils.loadInterpolator(context, id);
        }
        if (type == -1) {
            final androidx.constraintlayout.core.motion.utils.Easing interpolator = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(interpolatorString);
            return new android.view.animation.Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float v) {
                    return (float) interpolator.get(v);
                }
            };
        }
        if (type == 0) {
            return new android.view.animation.AccelerateDecelerateInterpolator();
        }
        if (type == 1) {
            return new android.view.animation.AccelerateInterpolator();
        }
        if (type == 2) {
            return new android.view.animation.DecelerateInterpolator();
        }
        if (type == 4) {
            return new android.view.animation.BounceInterpolator();
        }
        if (type != 5) {
            return null;
        }
        return new android.view.animation.OvershootInterpolator();
    }

    void setEndState(android.graphics.Rect cw, androidx.constraintlayout.widget.ConstraintSet constraintSet, int parentWidth, int parentHeight) {
        int i = constraintSet.mRotate;
        if (i != 0) {
            rotate(cw, this.mTempRect, i, parentWidth, parentHeight);
            cw = this.mTempRect;
        }
        this.mEndMotionPath.time = 1.0f;
        this.mEndMotionPath.position = 1.0f;
        readView(this.mEndMotionPath);
        this.mEndMotionPath.setBounds(cw.left, cw.top, cw.width(), cw.height());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(cw, constraintSet, i, this.mId);
    }

    void setBothStates(android.view.View v) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        this.mNoMovement = true;
        this.mStartMotionPath.setBounds(v.getX(), v.getY(), v.getWidth(), v.getHeight());
        this.mEndMotionPath.setBounds(v.getX(), v.getY(), v.getWidth(), v.getHeight());
        this.mStartPoint.setState(v);
        this.mEndPoint.setState(v);
    }

    private float getAdjustedPosition(float position, float[] velocity) {
        float f = 0.0f;
        if (velocity != null) {
            velocity[0] = 1.0f;
        } else {
            float f2 = this.mStaggerScale;
            if (f2 != 1.0d) {
                float f3 = this.mStaggerOffset;
                if (position < f3) {
                    position = 0.0f;
                }
                if (position > f3 && position < 1.0d) {
                    position = java.lang.Math.min((position - f3) * f2, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f4 = Float.NaN;
        for (androidx.constraintlayout.motion.widget.MotionPaths motionPaths : this.mMotionPaths) {
            if (motionPaths.mKeyFrameEasing != null) {
                if (motionPaths.time < position) {
                    easing = motionPaths.mKeyFrameEasing;
                    f = motionPaths.time;
                } else if (java.lang.Float.isNaN(f4)) {
                    f4 = motionPaths.time;
                }
            }
        }
        if (easing != null) {
            float f5 = (java.lang.Float.isNaN(f4) ? 1.0f : f4) - f;
            double d = (position - f) / f5;
            position = (((float) easing.get(d)) * f5) + f;
            if (velocity != null) {
                velocity[0] = (float) easing.getDiff(d);
            }
        }
        return position;
    }

    void endTrigger(boolean start) {
        if (!"button".equals(androidx.constraintlayout.motion.widget.Debug.getName(this.mView)) || this.mKeyTriggers == null) {
            return;
        }
        int i = 0;
        while (true) {
            androidx.constraintlayout.motion.widget.KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
            if (i >= keyTriggerArr.length) {
                return;
            }
            keyTriggerArr[i].conditionallyFire(start ? -100.0f : 100.0f, this.mView);
            i++;
        }
    }

    boolean interpolate(android.view.View child, float global_position, long time, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
        androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate pathRotate;
        boolean pathRotate2;
        float interpolation;
        float adjustedPosition = getAdjustedPosition(global_position, null);
        if (this.mQuantizeMotionSteps != androidx.constraintlayout.motion.widget.Key.UNSET) {
            float f = 1.0f / this.mQuantizeMotionSteps;
            float fFloor = ((float) java.lang.Math.floor(adjustedPosition / f)) * f;
            float f2 = (adjustedPosition % f) / f;
            if (!java.lang.Float.isNaN(this.mQuantizeMotionPhase)) {
                f2 = (f2 + this.mQuantizeMotionPhase) % 1.0f;
            }
            android.view.animation.Interpolator interpolator = this.mQuantizeMotionInterpolator;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(f2);
            } else {
                interpolation = ((double) f2) > 0.5d ? 1.0f : 0.0f;
            }
            adjustedPosition = (interpolation * f) + fFloor;
        }
        float f3 = adjustedPosition;
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map = this.mAttributesMap;
        if (map != null) {
            java.util.Iterator<androidx.constraintlayout.motion.utils.ViewSpline> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(child, f3);
            }
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> map2 = this.mTimeCycleAttributesMap;
        if (map2 != null) {
            androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate pathRotate3 = null;
            boolean property = false;
            for (androidx.constraintlayout.motion.utils.ViewTimeCycle viewTimeCycle : map2.values()) {
                if (viewTimeCycle instanceof androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate) {
                    pathRotate3 = (androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    property |= viewTimeCycle.setProperty(child, f3, time, keyCache);
                }
            }
            pathRotate2 = property;
            pathRotate = pathRotate3;
        } else {
            pathRotate = null;
            pathRotate2 = false;
        }
        androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr = this.mSpline;
        int i = 1;
        if (curveFitArr != null) {
            double d = f3;
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
                this.mStartMotionPath.setView(f3, child, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                this.mForceMeasure = false;
            }
            if (this.mTransformPivotTarget != androidx.constraintlayout.motion.widget.Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((android.view.View) child.getParent()).findViewById(this.mTransformPivotTarget);
                }
                android.view.View view = this.mTransformPivotView;
                if (view != null) {
                    float top = (view.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (child.getRight() - child.getLeft() > 0 && child.getBottom() - child.getTop() > 0) {
                        float left2 = left - child.getLeft();
                        float top2 = top - child.getTop();
                        child.setPivotX(left2);
                        child.setPivotY(top2);
                    }
                }
            }
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map3 = this.mAttributesMap;
            if (map3 != null) {
                for (androidx.constraintlayout.motion.utils.ViewSpline viewSpline : map3.values()) {
                    if (viewSpline instanceof androidx.constraintlayout.motion.utils.ViewSpline.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        if (dArr2.length > 1) {
                            ((androidx.constraintlayout.motion.utils.ViewSpline.PathRotate) viewSpline).setPathRotate(child, f3, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                pathRotate2 |= pathRotate.setPathRotate(child, keyCache, f3, time, dArr3[0], dArr3[1]);
            }
            int i2 = i;
            while (true) {
                androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr2 = this.mSpline;
                if (i2 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i2].getPos(d, this.mValuesBuff);
                androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(this.mStartMotionPath.attributes.get(this.mAttributeNames[i2 - 1]), child, this.mValuesBuff);
                i2++;
            }
            if (this.mStartPoint.mVisibilityMode == 0) {
                if (f3 <= 0.0f) {
                    child.setVisibility(this.mStartPoint.visibility);
                } else if (f3 >= 1.0f) {
                    child.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != this.mStartPoint.visibility) {
                    child.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i3 = 0;
                while (true) {
                    androidx.constraintlayout.motion.widget.KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i3 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i3].conditionallyFire(f3, child);
                    i3++;
                }
            }
        } else {
            i = 1;
            float f4 = this.mStartMotionPath.x + ((this.mEndMotionPath.x - this.mStartMotionPath.x) * f3);
            float f5 = f4 + 0.5f;
            int i4 = (int) f5;
            float f6 = this.mStartMotionPath.y + ((this.mEndMotionPath.y - this.mStartMotionPath.y) * f3) + 0.5f;
            int i5 = (int) f6;
            int i6 = (int) (f5 + this.mStartMotionPath.width + ((this.mEndMotionPath.width - this.mStartMotionPath.width) * f3));
            int i7 = (int) (f6 + this.mStartMotionPath.height + ((this.mEndMotionPath.height - this.mStartMotionPath.height) * f3));
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (this.mEndMotionPath.width != this.mStartMotionPath.width || this.mEndMotionPath.height != this.mStartMotionPath.height || this.mForceMeasure) {
                child.measure(android.view.View.MeasureSpec.makeMeasureSpec(i8, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                this.mForceMeasure = false;
            }
            child.layout(i4, i5, i6, i7);
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            for (androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator : map4.values()) {
                if (viewOscillator instanceof androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(child, f3, dArr4[0], dArr4[i]);
                } else {
                    viewOscillator.setProperty(child, f3);
                }
            }
        }
        return pathRotate2;
    }

    void getDpDt(float position, float locationX, float locationY, float[] mAnchorDpDt) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(position, this.mVelocity);
        androidx.constraintlayout.core.motion.utils.CurveFit[] curveFitArr = this.mSpline;
        int i = 0;
        if (curveFitArr != null) {
            double d = adjustedPosition;
            curveFitArr[0].getSlope(d, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d, this.mInterpolateData);
            float f = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f);
                i++;
            }
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        float f2 = this.mEndMotionPath.x - this.mStartMotionPath.x;
        float f3 = this.mEndMotionPath.y - this.mStartMotionPath.y;
        float f4 = (this.mEndMotionPath.width - this.mStartMotionPath.width) + f2;
        float f5 = (this.mEndMotionPath.height - this.mStartMotionPath.height) + f3;
        mAnchorDpDt[0] = (f2 * (1.0f - locationX)) + (f4 * locationX);
        mAnchorDpDt[1] = (f3 * (1.0f - locationY)) + (f5 * locationY);
    }

    void getPostLayoutDvDp(float position, int width, int height, float locationX, float locationY, float[] mAnchorDpDt) {
        float adjustedPosition = getAdjustedPosition(position, this.mVelocity);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map = this.mAttributesMap;
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline = map == null ? null : map.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map2 = this.mAttributesMap;
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline2 = map2 == null ? null : map2.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map3 = this.mAttributesMap;
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline3 = map3 == null ? null : map3.get(androidx.constraintlayout.motion.widget.Key.ROTATION);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map4 = this.mAttributesMap;
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline4 = map4 == null ? null : map4.get("scaleX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> map5 = this.mAttributesMap;
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline5 = map5 == null ? null : map5.get("scaleY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> map6 = this.mCycleMap;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator = map6 == null ? null : map6.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> map7 = this.mCycleMap;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator2 = map7 == null ? null : map7.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> map8 = this.mCycleMap;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator3 = map8 == null ? null : map8.get(androidx.constraintlayout.motion.widget.Key.ROTATION);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> map9 = this.mCycleMap;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator4 = map9 == null ? null : map9.get("scaleX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> map10 = this.mCycleMap;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator5 = map10 != null ? map10.get("scaleY") : null;
        androidx.constraintlayout.core.motion.utils.VelocityMatrix velocityMatrix = new androidx.constraintlayout.core.motion.utils.VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
        velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
        androidx.constraintlayout.core.motion.utils.CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d = adjustedPosition;
                curveFit.getPos(d, dArr);
                this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        int i = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i < dArr2.length) {
                    dArr2[i] = dArr2[i] * ((double) f);
                    i++;
                } else {
                    this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
                    return;
                }
            }
        } else {
            float f2 = this.mEndMotionPath.x - this.mStartMotionPath.x;
            float f3 = this.mEndMotionPath.y - this.mStartMotionPath.y;
            androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator6 = viewOscillator5;
            float f4 = (this.mEndMotionPath.width - this.mStartMotionPath.width) + f2;
            float f5 = (this.mEndMotionPath.height - this.mStartMotionPath.height) + f3;
            mAnchorDpDt[0] = (f2 * (1.0f - locationX)) + (f4 * locationX);
            mAnchorDpDt[1] = (f3 * (1.0f - locationY)) + (f5 * locationY);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
        }
    }

    public int getDrawPath() {
        int iMax = this.mStartMotionPath.mDrawPath;
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            iMax = java.lang.Math.max(iMax, it.next().mDrawPath);
        }
        return java.lang.Math.max(iMax, this.mEndMotionPath.mDrawPath);
    }

    public void setDrawPath(int debugMode) {
        this.mStartMotionPath.mDrawPath = debugMode;
    }

    java.lang.String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    void positionKeyframe(android.view.View view, androidx.constraintlayout.motion.widget.KeyPositionBase key, float x, float y, java.lang.String[] attribute, float[] value) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = this.mStartMotionPath.x;
        rectF.top = this.mStartMotionPath.y;
        rectF.right = rectF.left + this.mStartMotionPath.width;
        rectF.bottom = rectF.top + this.mStartMotionPath.height;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        rectF2.left = this.mEndMotionPath.x;
        rectF2.top = this.mEndMotionPath.y;
        rectF2.right = rectF2.left + this.mEndMotionPath.width;
        rectF2.bottom = rectF2.top + this.mEndMotionPath.height;
        key.positionAttributes(view, rectF, rectF2, x, y, attribute, value);
    }

    public int getKeyFramePositions(int[] type, float[] pos) {
        int i = 0;
        int i2 = 0;
        for (androidx.constraintlayout.motion.widget.Key key : this.mKeyList) {
            type[i] = key.mFramePosition + (key.mType * 1000);
            double d = key.mFramePosition / 100.0f;
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, pos, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public int getKeyFrameInfo(int type, int[] info) {
        float[] fArr = new float[2];
        int i = 0;
        int i2 = 0;
        for (androidx.constraintlayout.motion.widget.Key key : this.mKeyList) {
            if (key.mType == type || type != -1) {
                info[i2] = 0;
                int i3 = i2 + 1;
                info[i3] = key.mType;
                int i4 = i3 + 1;
                info[i4] = key.mFramePosition;
                double d = key.mFramePosition / 100.0f;
                this.mSpline[0].getPos(d, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                int i5 = i4 + 1;
                info[i5] = java.lang.Float.floatToIntBits(fArr[0]);
                int i6 = i5 + 1;
                info[i6] = java.lang.Float.floatToIntBits(fArr[1]);
                if (key instanceof androidx.constraintlayout.motion.widget.KeyPosition) {
                    androidx.constraintlayout.motion.widget.KeyPosition keyPosition = (androidx.constraintlayout.motion.widget.KeyPosition) key;
                    int i7 = i6 + 1;
                    info[i7] = keyPosition.mPositionType;
                    int i8 = i7 + 1;
                    info[i8] = java.lang.Float.floatToIntBits(keyPosition.mPercentX);
                    i6 = i8 + 1;
                    info[i6] = java.lang.Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i9 = i6 + 1;
                info[i2] = i9 - i2;
                i++;
                i2 = i9;
            }
        }
        return i;
    }
}
