package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
class MotionConstrainedPoint implements java.lang.Comparable<androidx.constraintlayout.motion.widget.MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final java.lang.String TAG = "MotionPaths";
    static java.lang.String[] names = {com.ironsource.y8.h.L, "x", "y", "width", "height", "pathRotate"};
    private float height;
    private androidx.constraintlayout.core.motion.utils.Easing mKeyFrameEasing;
    private float position;
    int visibility;
    private float width;
    private float x;
    private float y;
    private float alpha = 1.0f;
    int mVisibilityMode = 0;
    private boolean applyElevation = false;
    private float elevation = 0.0f;
    private float rotation = 0.0f;
    private float rotationX = 0.0f;
    public float rotationY = 0.0f;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float translationX = 0.0f;
    private float translationY = 0.0f;
    private float translationZ = 0.0f;
    private int mDrawPath = 0;
    private float mPathRotate = Float.NaN;
    private float mProgress = Float.NaN;
    private int mAnimateRelativeTo = -1;
    java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> attributes = new java.util.LinkedHashMap<>();
    int mMode = 0;
    double[] mTempValue = new double[18];
    double[] mTempDelta = new double[18];

    private boolean diff(float a2, float b) {
        if (java.lang.Float.isNaN(a2) || java.lang.Float.isNaN(b)) {
            return java.lang.Float.isNaN(a2) != java.lang.Float.isNaN(b);
        }
        return java.lang.Math.abs(a2 - b) > 1.0E-6f;
    }

    void different(androidx.constraintlayout.motion.widget.MotionConstrainedPoint points, java.util.HashSet<java.lang.String> keySet) {
        if (diff(this.alpha, points.alpha)) {
            keySet.add("alpha");
        }
        if (diff(this.elevation, points.elevation)) {
            keySet.add("elevation");
        }
        int i = this.visibility;
        int i2 = points.visibility;
        if (i != i2 && this.mVisibilityMode == 0 && (i == 0 || i2 == 0)) {
            keySet.add("alpha");
        }
        if (diff(this.rotation, points.rotation)) {
            keySet.add(androidx.constraintlayout.motion.widget.Key.ROTATION);
        }
        if (!java.lang.Float.isNaN(this.mPathRotate) || !java.lang.Float.isNaN(points.mPathRotate)) {
            keySet.add("transitionPathRotate");
        }
        if (!java.lang.Float.isNaN(this.mProgress) || !java.lang.Float.isNaN(points.mProgress)) {
            keySet.add("progress");
        }
        if (diff(this.rotationX, points.rotationX)) {
            keySet.add("rotationX");
        }
        if (diff(this.rotationY, points.rotationY)) {
            keySet.add("rotationY");
        }
        if (diff(this.mPivotX, points.mPivotX)) {
            keySet.add(androidx.constraintlayout.motion.widget.Key.PIVOT_X);
        }
        if (diff(this.mPivotY, points.mPivotY)) {
            keySet.add(androidx.constraintlayout.motion.widget.Key.PIVOT_Y);
        }
        if (diff(this.scaleX, points.scaleX)) {
            keySet.add("scaleX");
        }
        if (diff(this.scaleY, points.scaleY)) {
            keySet.add("scaleY");
        }
        if (diff(this.translationX, points.translationX)) {
            keySet.add("translationX");
        }
        if (diff(this.translationY, points.translationY)) {
            keySet.add("translationY");
        }
        if (diff(this.translationZ, points.translationZ)) {
            keySet.add("translationZ");
        }
    }

    void different(androidx.constraintlayout.motion.widget.MotionConstrainedPoint points, boolean[] mask, java.lang.String[] custom) {
        mask[0] = mask[0] | diff(this.position, points.position);
        mask[1] = mask[1] | diff(this.x, points.x);
        mask[2] = mask[2] | diff(this.y, points.y);
        mask[3] = mask[3] | diff(this.width, points.width);
        mask[4] = diff(this.height, points.height) | mask[4];
    }

    void fillStandard(double[] data, int[] toUse) {
        float[] fArr = {this.position, this.x, this.y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
        int i = 0;
        for (int i2 : toUse) {
            if (i2 < 18) {
                data[i] = fArr[i2];
                i++;
            }
        }
    }

    boolean hasCustomData(java.lang.String name) {
        return this.attributes.containsKey(name);
    }

    int getCustomDataCount(java.lang.String name) {
        return this.attributes.get(name).numberOfInterpolatedValues();
    }

    int getCustomData(java.lang.String name, double[] value, int offset) {
        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.attributes.get(name);
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            value[offset] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[iNumberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        int i = 0;
        while (i < iNumberOfInterpolatedValues) {
            value[offset] = fArr[i];
            i++;
            offset++;
        }
        return iNumberOfInterpolatedValues;
    }

    void setBounds(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.constraintlayout.motion.widget.MotionConstrainedPoint o) {
        return java.lang.Float.compare(this.position, o.position);
    }

    public void applyParameters(android.view.View view) {
        this.visibility = view.getVisibility();
        this.alpha = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.applyElevation = false;
        this.elevation = view.getElevation();
        this.rotation = view.getRotation();
        this.rotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.scaleX = view.getScaleX();
        this.scaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.translationX = view.getTranslationX();
        this.translationY = view.getTranslationY();
        this.translationZ = view.getTranslationZ();
    }

    public void applyParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint c) {
        this.mVisibilityMode = c.propertySet.mVisibilityMode;
        this.visibility = c.propertySet.visibility;
        this.alpha = (c.propertySet.visibility == 0 || this.mVisibilityMode != 0) ? c.propertySet.alpha : 0.0f;
        this.applyElevation = c.transform.applyElevation;
        this.elevation = c.transform.elevation;
        this.rotation = c.transform.rotation;
        this.rotationX = c.transform.rotationX;
        this.rotationY = c.transform.rotationY;
        this.scaleX = c.transform.scaleX;
        this.scaleY = c.transform.scaleY;
        this.mPivotX = c.transform.transformPivotX;
        this.mPivotY = c.transform.transformPivotY;
        this.translationX = c.transform.translationX;
        this.translationY = c.transform.translationY;
        this.translationZ = c.transform.translationZ;
        this.mKeyFrameEasing = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(c.motion.mTransitionEasing);
        this.mPathRotate = c.motion.mPathRotate;
        this.mDrawPath = c.motion.mDrawPath;
        this.mAnimateRelativeTo = c.motion.mAnimateRelativeTo;
        this.mProgress = c.propertySet.mProgress;
        for (java.lang.String str : c.mCustomConstraints.keySet()) {
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = c.mCustomConstraints.get(str);
            if (constraintAttribute.isContinuous()) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> splines, int mFramePosition) {
        for (java.lang.String str : splines.keySet()) {
            androidx.constraintlayout.motion.utils.ViewSpline viewSpline = splines.get(str);
            str.hashCode();
            byte b = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b = 1;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b = 2;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b = 3;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b = 4;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b = 5;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b = 6;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b = 7;
                    }
                    break;
                case -760884510:
                    if (str.equals(androidx.constraintlayout.motion.widget.Key.PIVOT_X)) {
                        b = 8;
                    }
                    break;
                case -760884509:
                    if (str.equals(androidx.constraintlayout.motion.widget.Key.PIVOT_Y)) {
                        b = 9;
                    }
                    break;
                case -40300674:
                    if (str.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
                        b = 10;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        b = 11;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b = 12;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b = 13;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.rotationX) ? 0.0f : this.rotationX);
                    break;
                case 1:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.rotationY) ? 0.0f : this.rotationY);
                    break;
                case 2:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.translationX) ? 0.0f : this.translationX);
                    break;
                case 3:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.translationY) ? 0.0f : this.translationY);
                    break;
                case 4:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.translationZ) ? 0.0f : this.translationZ);
                    break;
                case 5:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.mProgress) ? 0.0f : this.mProgress);
                    break;
                case 6:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.scaleX) ? 1.0f : this.scaleX);
                    break;
                case 7:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.scaleY) ? 1.0f : this.scaleY);
                    break;
                case 8:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.mPivotX) ? 0.0f : this.mPivotX);
                    break;
                case 9:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.mPivotY) ? 0.0f : this.mPivotY);
                    break;
                case 10:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.rotation) ? 0.0f : this.rotation);
                    break;
                case 11:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.elevation) ? 0.0f : this.elevation);
                    break;
                case 12:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.mPathRotate) ? 0.0f : this.mPathRotate);
                    break;
                case 13:
                    viewSpline.setPoint(mFramePosition, java.lang.Float.isNaN(this.alpha) ? 1.0f : this.alpha);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        java.lang.String str2 = str.split(",")[1];
                        if (this.attributes.containsKey(str2)) {
                            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.attributes.get(str2);
                            if (viewSpline instanceof androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) {
                                ((androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) viewSpline).setPoint(mFramePosition, constraintAttribute);
                            } else {
                                android.util.Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + mFramePosition + ", value" + constraintAttribute.getValueToInterpolate() + viewSpline);
                            }
                        }
                    } else {
                        android.util.Log.e("MotionPaths", "UNKNOWN spline " + str);
                    }
                    break;
            }
        }
    }

    public void setState(android.view.View view) {
        setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        applyParameters(view);
    }

    public void setState(android.graphics.Rect rect, android.view.View view, int rotation, float prevous) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(view);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        if (rotation == 1) {
            this.rotation = prevous - 90.0f;
        } else {
            if (rotation != 2) {
                return;
            }
            this.rotation = prevous + 90.0f;
        }
    }

    public void setState(android.graphics.Rect cw, androidx.constraintlayout.widget.ConstraintSet constraintSet, int rotation, int viewId) {
        setBounds(cw.left, cw.top, cw.width(), cw.height());
        applyParameters(constraintSet.getParameters(viewId));
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    if (rotation != 4) {
                        return;
                    }
                }
            }
            float f = this.rotation + 90.0f;
            this.rotation = f;
            if (f > 180.0f) {
                this.rotation = f - 360.0f;
                return;
            }
            return;
        }
        this.rotation -= 90.0f;
    }
}
