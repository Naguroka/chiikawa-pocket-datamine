package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyTrigger extends androidx.constraintlayout.motion.widget.Key {
    public static final java.lang.String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    static final java.lang.String NAME = "KeyTrigger";
    public static final java.lang.String NEGATIVE_CROSS = "negativeCross";
    public static final java.lang.String POSITIVE_CROSS = "positiveCross";
    public static final java.lang.String POST_LAYOUT = "postLayout";
    private static final java.lang.String TAG = "KeyTrigger";
    public static final java.lang.String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final java.lang.String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final java.lang.String TRIGGER_ID = "triggerID";
    public static final java.lang.String TRIGGER_RECEIVER = "triggerReceiver";
    public static final java.lang.String TRIGGER_SLACK = "triggerSlack";
    public static final java.lang.String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final java.lang.String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final java.lang.String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    private float mFireLastPos;
    private int mCurveFit = -1;
    private java.lang.String mCross = null;
    private int mTriggerReceiver = UNSET;
    private java.lang.String mNegativeCross = null;
    private java.lang.String mPositiveCross = null;
    private int mTriggerID = UNSET;
    private int mTriggerCollisionId = UNSET;
    private android.view.View mTriggerCollisionView = null;
    float mTriggerSlack = 0.1f;
    private boolean mFireCrossReset = true;
    private boolean mFireNegativeReset = true;
    private boolean mFirePositiveReset = true;
    private float mFireThreshold = Float.NaN;
    private boolean mPostLayout = false;
    int mViewTransitionOnNegativeCross = UNSET;
    int mViewTransitionOnPositiveCross = UNSET;
    int mViewTransitionOnCross = UNSET;
    android.graphics.RectF mCollisionRect = new android.graphics.RectF();
    android.graphics.RectF mTargetRect = new android.graphics.RectF();
    java.util.HashMap<java.lang.String, java.lang.reflect.Method> mMethodHashMap = new java.util.HashMap<>();

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> splines) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> attributes) {
    }

    public KeyTrigger() {
        this.mType = 5;
        this.mCustomConstraints = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attrs) {
        androidx.constraintlayout.motion.widget.KeyTrigger.Loader.read(this, context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.KeyTrigger), context);
    }

    int getCurveFit() {
        return this.mCurveFit;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String tag, java.lang.Object value) {
        tag.hashCode();
        switch (tag) {
            case "positiveCross":
                this.mPositiveCross = value.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.mViewTransitionOnPositiveCross = toInt(value);
                break;
            case "triggerCollisionId":
                this.mTriggerCollisionId = toInt(value);
                break;
            case "triggerID":
                this.mTriggerID = toInt(value);
                break;
            case "negativeCross":
                this.mNegativeCross = value.toString();
                break;
            case "triggerCollisionView":
                this.mTriggerCollisionView = (android.view.View) value;
                break;
            case "viewTransitionOnNegativeCross":
                this.mViewTransitionOnNegativeCross = toInt(value);
                break;
            case "CROSS":
                this.mCross = value.toString();
                break;
            case "triggerSlack":
                this.mTriggerSlack = toFloat(value);
                break;
            case "viewTransitionOnCross":
                this.mViewTransitionOnCross = toInt(value);
                break;
            case "postLayout":
                this.mPostLayout = toBoolean(value);
                break;
            case "triggerReceiver":
                this.mTriggerReceiver = toInt(value);
                break;
        }
    }

    private void setUpRect(android.graphics.RectF rect, android.view.View child, boolean postLayout) {
        rect.top = child.getTop();
        rect.bottom = child.getBottom();
        rect.left = child.getLeft();
        rect.right = child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    public void conditionallyFire(float pos, android.view.View child) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        boolean z4;
        boolean z5;
        float f3;
        float f4;
        boolean z6;
        if (this.mTriggerCollisionId != UNSET) {
            if (this.mTriggerCollisionView == null) {
                this.mTriggerCollisionView = ((android.view.ViewGroup) child.getParent()).findViewById(this.mTriggerCollisionId);
            }
            setUpRect(this.mCollisionRect, this.mTriggerCollisionView, this.mPostLayout);
            setUpRect(this.mTargetRect, child, this.mPostLayout);
            if (this.mCollisionRect.intersect(this.mTargetRect)) {
                if (this.mFireCrossReset) {
                    this.mFireCrossReset = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.mFirePositiveReset) {
                    this.mFirePositiveReset = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.mFireNegativeReset = true;
                z5 = z6;
                z3 = false;
            } else {
                if (this.mFireCrossReset) {
                    z = false;
                } else {
                    this.mFireCrossReset = true;
                    z = true;
                }
                if (this.mFireNegativeReset) {
                    this.mFireNegativeReset = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.mFirePositiveReset = true;
                z5 = false;
            }
        } else {
            if (this.mFireCrossReset) {
                float f5 = this.mFireThreshold;
                if ((pos - f5) * (this.mFireLastPos - f5) < 0.0f) {
                    this.mFireCrossReset = false;
                    z = true;
                }
                if (this.mFireNegativeReset) {
                    f3 = this.mFireThreshold;
                    f4 = pos - f3;
                    if ((this.mFireLastPos - f3) * f4 >= 0.0f && f4 < 0.0f) {
                        this.mFireNegativeReset = false;
                        z2 = true;
                    }
                    if (this.mFirePositiveReset) {
                        f = this.mFireThreshold;
                        f2 = pos - f;
                        if ((this.mFireLastPos - f) * f2 < 0.0f || f2 <= 0.0f) {
                            z4 = false;
                        } else {
                            this.mFirePositiveReset = false;
                            z4 = true;
                        }
                        boolean z7 = z2;
                        z5 = z4;
                        z3 = z7;
                    } else {
                        if (java.lang.Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                            this.mFirePositiveReset = true;
                        }
                        z3 = z2;
                        z5 = false;
                    }
                } else if (java.lang.Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                    this.mFireNegativeReset = true;
                }
                z2 = false;
                if (this.mFirePositiveReset) {
                    f = this.mFireThreshold;
                    f2 = pos - f;
                    if ((this.mFireLastPos - f) * f2 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    boolean z8 = z2;
                    z5 = z4;
                    z3 = z8;
                } else {
                    if (java.lang.Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                        this.mFirePositiveReset = true;
                    }
                    z3 = z2;
                    z5 = false;
                }
            } else if (java.lang.Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                this.mFireCrossReset = true;
            }
            z = false;
            if (this.mFireNegativeReset) {
                f3 = this.mFireThreshold;
                f4 = pos - f3;
                if ((this.mFireLastPos - f3) * f4 >= 0.0f) {
                }
                if (this.mFirePositiveReset) {
                    f = this.mFireThreshold;
                    f2 = pos - f;
                    if ((this.mFireLastPos - f) * f2 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    boolean z9 = z2;
                    z5 = z4;
                    z3 = z9;
                } else {
                    if (java.lang.Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                        this.mFirePositiveReset = true;
                    }
                    z3 = z2;
                    z5 = false;
                }
            } else if (java.lang.Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                this.mFireNegativeReset = true;
            }
            z2 = false;
            if (this.mFirePositiveReset) {
                f = this.mFireThreshold;
                f2 = pos - f;
                if ((this.mFireLastPos - f) * f2 < 0.0f) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                boolean z10 = z2;
                z5 = z4;
                z3 = z10;
            } else {
                if (java.lang.Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                    this.mFirePositiveReset = true;
                }
                z3 = z2;
                z5 = false;
            }
        }
        this.mFireLastPos = pos;
        if (z3 || z || z5) {
            ((androidx.constraintlayout.motion.widget.MotionLayout) child.getParent()).fireTrigger(this.mTriggerID, z5, pos);
        }
        android.view.View viewFindViewById = this.mTriggerReceiver == UNSET ? child : ((androidx.constraintlayout.motion.widget.MotionLayout) child.getParent()).findViewById(this.mTriggerReceiver);
        if (z3) {
            java.lang.String str = this.mNegativeCross;
            if (str != null) {
                fire(str, viewFindViewById);
            }
            if (this.mViewTransitionOnNegativeCross != UNSET) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) child.getParent()).viewTransition(this.mViewTransitionOnNegativeCross, viewFindViewById);
            }
        }
        if (z5) {
            java.lang.String str2 = this.mPositiveCross;
            if (str2 != null) {
                fire(str2, viewFindViewById);
            }
            if (this.mViewTransitionOnPositiveCross != UNSET) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) child.getParent()).viewTransition(this.mViewTransitionOnPositiveCross, viewFindViewById);
            }
        }
        if (z) {
            java.lang.String str3 = this.mCross;
            if (str3 != null) {
                fire(str3, viewFindViewById);
            }
            if (this.mViewTransitionOnCross != UNSET) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) child.getParent()).viewTransition(this.mViewTransitionOnCross, viewFindViewById);
            }
        }
    }

    private void fire(java.lang.String str, android.view.View call) {
        java.lang.reflect.Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            fireCustom(str, call);
            return;
        }
        if (this.mMethodHashMap.containsKey(str)) {
            method = this.mMethodHashMap.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = call.getClass().getMethod(str, new java.lang.Class[0]);
                this.mMethodHashMap.put(str, method);
            } catch (java.lang.NoSuchMethodException unused) {
                this.mMethodHashMap.put(str, null);
                android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.TriggerType.NAME, "Could not find method \"" + str + "\"on class " + call.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.Debug.getName(call));
                return;
            }
        }
        try {
            method.invoke(call, new java.lang.Object[0]);
        } catch (java.lang.Exception unused2) {
            android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.TriggerType.NAME, "Exception in call \"" + this.mCross + "\"on class " + call.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.Debug.getName(call));
        }
    }

    private void fireCustom(java.lang.String str, android.view.View view) {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(java.util.Locale.ROOT);
        }
        for (java.lang.String str2 : this.mCustomConstraints.keySet()) {
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.applyCustom(view);
                }
            }
        }
    }

    private static class Loader {
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static final int VT_CROSS = 12;
        private static final int VT_NEGATIVE_CROSS = 13;
        private static final int VT_POSITIVE_CROSS = 14;
        private static android.util.SparseIntArray mAttrMap;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_framePosition, 8);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_onCross, 4);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_onNegativeCross, 1);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_onPositiveCross, 2);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_motionTarget, 7);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerId, 6);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerSlack, 5);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerReceiver, 11);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyTrigger c, android.content.res.TypedArray a2, android.content.Context context) {
            int indexCount = a2.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a2.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        c.mNegativeCross = a2.getString(index);
                        break;
                    case 2:
                        c.mPositiveCross = a2.getString(index);
                        break;
                    case 3:
                    default:
                        android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.TriggerType.NAME, "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                    case 4:
                        c.mCross = a2.getString(index);
                        break;
                    case 5:
                        c.mTriggerSlack = a2.getFloat(index, c.mTriggerSlack);
                        break;
                    case 6:
                        c.mTriggerID = a2.getResourceId(index, c.mTriggerID);
                        break;
                    case 7:
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
                    case 8:
                        c.mFramePosition = a2.getInteger(index, c.mFramePosition);
                        c.mFireThreshold = (c.mFramePosition + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c.mTriggerCollisionId = a2.getResourceId(index, c.mTriggerCollisionId);
                        break;
                    case 10:
                        c.mPostLayout = a2.getBoolean(index, c.mPostLayout);
                        break;
                    case 11:
                        c.mTriggerReceiver = a2.getResourceId(index, c.mTriggerReceiver);
                        break;
                    case 12:
                        c.mViewTransitionOnCross = a2.getResourceId(index, c.mViewTransitionOnCross);
                        break;
                    case 13:
                        c.mViewTransitionOnNegativeCross = a2.getResourceId(index, c.mViewTransitionOnNegativeCross);
                        break;
                    case 14:
                        c.mViewTransitionOnPositiveCross = a2.getResourceId(index, c.mViewTransitionOnPositiveCross);
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key src) {
        super.copy(src);
        androidx.constraintlayout.motion.widget.KeyTrigger keyTrigger = (androidx.constraintlayout.motion.widget.KeyTrigger) src;
        this.mCurveFit = keyTrigger.mCurveFit;
        this.mCross = keyTrigger.mCross;
        this.mTriggerReceiver = keyTrigger.mTriggerReceiver;
        this.mNegativeCross = keyTrigger.mNegativeCross;
        this.mPositiveCross = keyTrigger.mPositiveCross;
        this.mTriggerID = keyTrigger.mTriggerID;
        this.mTriggerCollisionId = keyTrigger.mTriggerCollisionId;
        this.mTriggerCollisionView = keyTrigger.mTriggerCollisionView;
        this.mTriggerSlack = keyTrigger.mTriggerSlack;
        this.mFireCrossReset = keyTrigger.mFireCrossReset;
        this.mFireNegativeReset = keyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = keyTrigger.mFirePositiveReset;
        this.mFireThreshold = keyTrigger.mFireThreshold;
        this.mFireLastPos = keyTrigger.mFireLastPos;
        this.mPostLayout = keyTrigger.mPostLayout;
        this.mCollisionRect = keyTrigger.mCollisionRect;
        this.mTargetRect = keyTrigger.mTargetRect;
        this.mMethodHashMap = keyTrigger.mMethodHashMap;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public androidx.constraintlayout.motion.widget.Key mo15clone() {
        return new androidx.constraintlayout.motion.widget.KeyTrigger().copy(this);
    }
}
