package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyPosition extends androidx.constraintlayout.motion.widget.KeyPositionBase {
    public static final java.lang.String DRAWPATH = "drawPath";
    static final int KEY_TYPE = 2;
    static final java.lang.String NAME = "KeyPosition";
    public static final java.lang.String PERCENT_HEIGHT = "percentHeight";
    public static final java.lang.String PERCENT_WIDTH = "percentWidth";
    public static final java.lang.String PERCENT_X = "percentX";
    public static final java.lang.String PERCENT_Y = "percentY";
    public static final java.lang.String SIZE_PERCENT = "sizePercent";
    private static final java.lang.String TAG = "KeyPosition";
    public static final java.lang.String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    java.lang.String mTransitionEasing = null;
    int mPathMotionArc = UNSET;
    int mDrawPath = 0;
    float mPercentWidth = Float.NaN;
    float mPercentHeight = Float.NaN;
    float mPercentX = Float.NaN;
    float mPercentY = Float.NaN;
    float mAltPercentX = Float.NaN;
    float mAltPercentY = Float.NaN;
    int mPositionType = 0;
    private float mCalculatedPositionX = Float.NaN;
    private float mCalculatedPositionY = Float.NaN;

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> splines) {
    }

    public KeyPosition() {
        this.mType = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attrs) {
        androidx.constraintlayout.motion.widget.KeyPosition.Loader.read(this, context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.KeyPosition));
    }

    public void setType(int type) {
        this.mPositionType = type;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    void calcPosition(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y) {
        int i = this.mPositionType;
        if (i == 1) {
            calcPathPosition(start_x, start_y, end_x, end_y);
        } else if (i == 2) {
            calcScreenPosition(layoutWidth, layoutHeight);
        } else {
            calcCartesianPosition(start_x, start_y, end_x, end_y);
        }
    }

    private void calcScreenPosition(int layoutWidth, int layoutHeight) {
        float f = this.mPercentX;
        float f2 = 0;
        this.mCalculatedPositionX = ((layoutWidth - 0) * f) + f2;
        this.mCalculatedPositionY = ((layoutHeight - 0) * f) + f2;
    }

    private void calcPathPosition(float start_x, float start_y, float end_x, float end_y) {
        float f = end_x - start_x;
        float f2 = end_y - start_y;
        float f3 = this.mPercentX;
        float f4 = this.mPercentY;
        this.mCalculatedPositionX = start_x + (f * f3) + ((-f2) * f4);
        this.mCalculatedPositionY = start_y + (f2 * f3) + (f * f4);
    }

    private void calcCartesianPosition(float start_x, float start_y, float end_x, float end_y) {
        float f = end_x - start_x;
        float f2 = end_y - start_y;
        float f3 = java.lang.Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
        float f4 = java.lang.Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
        float f5 = java.lang.Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
        this.mCalculatedPositionX = (int) (start_x + (f3 * f) + ((java.lang.Float.isNaN(this.mAltPercentX) ? 0.0f : this.mAltPercentX) * f2));
        this.mCalculatedPositionY = (int) (start_y + (f * f4) + (f2 * f5));
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    float getPositionX() {
        return this.mCalculatedPositionX;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    float getPositionY() {
        return this.mCalculatedPositionY;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void positionAttributes(android.view.View view, android.graphics.RectF start, android.graphics.RectF end, float x, float y, java.lang.String[] attribute, float[] value) {
        int i = this.mPositionType;
        if (i == 1) {
            positionPathAttributes(start, end, x, y, attribute, value);
        } else if (i == 2) {
            positionScreenAttributes(view, start, end, x, y, attribute, value);
        } else {
            positionCartAttributes(start, end, x, y, attribute, value);
        }
    }

    void positionPathAttributes(android.graphics.RectF start, android.graphics.RectF end, float x, float y, java.lang.String[] attribute, float[] value) {
        float fCenterX = start.centerX();
        float fCenterY = start.centerY();
        float fCenterX2 = end.centerX() - fCenterX;
        float fCenterY2 = end.centerY() - fCenterY;
        float fHypot = (float) java.lang.Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            java.lang.System.out.println("distance ~ 0");
            value[0] = 0.0f;
            value[1] = 0.0f;
            return;
        }
        float f = fCenterX2 / fHypot;
        float f2 = fCenterY2 / fHypot;
        float f3 = y - fCenterY;
        float f4 = x - fCenterX;
        float f5 = ((f * f3) - (f4 * f2)) / fHypot;
        float f6 = ((f * f4) + (f2 * f3)) / fHypot;
        java.lang.String str = attribute[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                value[0] = f6;
                value[1] = f5;
                return;
            }
            return;
        }
        attribute[0] = "percentX";
        attribute[1] = "percentY";
        value[0] = f6;
        value[1] = f5;
    }

    void positionScreenAttributes(android.view.View view, android.graphics.RectF start, android.graphics.RectF end, float x, float y, java.lang.String[] attribute, float[] value) {
        start.centerX();
        start.centerY();
        end.centerX();
        end.centerY();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        java.lang.String str = attribute[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                value[0] = x / width;
                value[1] = y / height;
                return;
            } else {
                value[1] = x / width;
                value[0] = y / height;
                return;
            }
        }
        attribute[0] = "percentX";
        value[0] = x / width;
        attribute[1] = "percentY";
        value[1] = y / height;
    }

    void positionCartAttributes(android.graphics.RectF start, android.graphics.RectF end, float x, float y, java.lang.String[] attribute, float[] value) {
        float fCenterX = start.centerX();
        float fCenterY = start.centerY();
        float fCenterX2 = end.centerX() - fCenterX;
        float fCenterY2 = end.centerY() - fCenterY;
        java.lang.String str = attribute[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                value[0] = (x - fCenterX) / fCenterX2;
                value[1] = (y - fCenterY) / fCenterY2;
                return;
            } else {
                value[1] = (x - fCenterX) / fCenterX2;
                value[0] = (y - fCenterY) / fCenterY2;
                return;
            }
        }
        attribute[0] = "percentX";
        value[0] = (x - fCenterX) / fCenterX2;
        attribute[1] = "percentY";
        value[1] = (y - fCenterY) / fCenterY2;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public boolean intersects(int layoutWidth, int layoutHeight, android.graphics.RectF start, android.graphics.RectF end, float x, float y) {
        calcPosition(layoutWidth, layoutHeight, start.centerX(), start.centerY(), end.centerX(), end.centerY());
        return java.lang.Math.abs(x - this.mCalculatedPositionX) < 20.0f && java.lang.Math.abs(y - this.mCalculatedPositionY) < 20.0f;
    }

    private static class Loader {
        private static final int CURVE_FIT = 4;
        private static final int DRAW_PATH = 5;
        private static final int FRAME_POSITION = 2;
        private static final int PATH_MOTION_ARC = 10;
        private static final int PERCENT_HEIGHT = 12;
        private static final int PERCENT_WIDTH = 11;
        private static final int PERCENT_X = 6;
        private static final int PERCENT_Y = 7;
        private static final int SIZE_PERCENT = 8;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TYPE = 9;
        private static android.util.SparseIntArray mAttrMap;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_motionTarget, 1);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_framePosition, 2);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_transitionEasing, 3);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_curveFit, 4);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_drawPath, 5);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_percentX, 6);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_percentY, 7);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_keyPositionType, 9);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_sizePercent, 8);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_percentWidth, 11);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_percentHeight, 12);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_pathMotionArc, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(androidx.constraintlayout.motion.widget.KeyPosition c, android.content.res.TypedArray a2) {
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
                        if (a2.peekValue(index).type == 3) {
                            c.mTransitionEasing = a2.getString(index);
                        } else {
                            c.mTransitionEasing = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[a2.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        c.mCurveFit = a2.getInteger(index, c.mCurveFit);
                        break;
                    case 5:
                        c.mDrawPath = a2.getInt(index, c.mDrawPath);
                        break;
                    case 6:
                        c.mPercentX = a2.getFloat(index, c.mPercentX);
                        break;
                    case 7:
                        c.mPercentY = a2.getFloat(index, c.mPercentY);
                        break;
                    case 8:
                        float f = a2.getFloat(index, c.mPercentHeight);
                        c.mPercentWidth = f;
                        c.mPercentHeight = f;
                        break;
                    case 9:
                        c.mPositionType = a2.getInt(index, c.mPositionType);
                        break;
                    case 10:
                        c.mPathMotionArc = a2.getInt(index, c.mPathMotionArc);
                        break;
                    case 11:
                        c.mPercentWidth = a2.getFloat(index, c.mPercentWidth);
                        break;
                    case 12:
                        c.mPercentHeight = a2.getFloat(index, c.mPercentHeight);
                        break;
                    default:
                        android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.NAME, "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                }
            }
            if (c.mFramePosition == -1) {
                android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.NAME, "no frame position");
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String tag, java.lang.Object value) {
        tag.hashCode();
        switch (tag) {
            case "transitionEasing":
                this.mTransitionEasing = value.toString();
                break;
            case "percentWidth":
                this.mPercentWidth = toFloat(value);
                break;
            case "percentHeight":
                this.mPercentHeight = toFloat(value);
                break;
            case "drawPath":
                this.mDrawPath = toInt(value);
                break;
            case "sizePercent":
                float f = toFloat(value);
                this.mPercentWidth = f;
                this.mPercentHeight = f;
                break;
            case "percentX":
                this.mPercentX = toFloat(value);
                break;
            case "percentY":
                this.mPercentY = toFloat(value);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key src) {
        super.copy(src);
        androidx.constraintlayout.motion.widget.KeyPosition keyPosition = (androidx.constraintlayout.motion.widget.KeyPosition) src;
        this.mTransitionEasing = keyPosition.mTransitionEasing;
        this.mPathMotionArc = keyPosition.mPathMotionArc;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mPercentWidth = keyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = keyPosition.mPercentX;
        this.mPercentY = keyPosition.mPercentY;
        this.mAltPercentX = keyPosition.mAltPercentX;
        this.mAltPercentY = keyPosition.mAltPercentY;
        this.mCalculatedPositionX = keyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = keyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public androidx.constraintlayout.motion.widget.Key mo15clone() {
        return new androidx.constraintlayout.motion.widget.KeyPosition().copy(this);
    }
}
