package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyTrigger extends androidx.constraintlayout.core.motion.key.MotionKey {
    public static final java.lang.String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final java.lang.String NEGATIVE_CROSS = "negativeCross";
    public static final java.lang.String POSITIVE_CROSS = "positiveCross";
    public static final java.lang.String POST_LAYOUT = "postLayout";
    private static final java.lang.String TAG = "KeyTrigger";
    public static final java.lang.String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final java.lang.String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final java.lang.String TRIGGER_ID = "triggerID";
    public static final java.lang.String TRIGGER_RECEIVER = "triggerReceiver";
    public static final java.lang.String TRIGGER_SLACK = "triggerSlack";
    public static final int TYPE_CROSS = 312;
    public static final int TYPE_NEGATIVE_CROSS = 310;
    public static final int TYPE_POSITIVE_CROSS = 309;
    public static final int TYPE_POST_LAYOUT = 304;
    public static final int TYPE_TRIGGER_COLLISION_ID = 307;
    public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
    public static final int TYPE_TRIGGER_ID = 308;
    public static final int TYPE_TRIGGER_RECEIVER = 311;
    public static final int TYPE_TRIGGER_SLACK = 305;
    public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
    public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
    public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
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
    float mTriggerSlack = 0.1f;
    private boolean mFireCrossReset = true;
    private boolean mFireNegativeReset = true;
    private boolean mFirePositiveReset = true;
    private float mFireThreshold = Float.NaN;
    private boolean mPostLayout = false;
    int mViewTransitionOnNegativeCross = UNSET;
    int mViewTransitionOnPositiveCross = UNSET;
    int mViewTransitionOnCross = UNSET;
    androidx.constraintlayout.core.motion.utils.FloatRect mCollisionRect = new androidx.constraintlayout.core.motion.utils.FloatRect();
    androidx.constraintlayout.core.motion.utils.FloatRect mTargetRect = new androidx.constraintlayout.core.motion.utils.FloatRect();

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> map) {
    }

    public void conditionallyFire(float f, androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
    }

    public MotionKeyTrigger() {
        this.mType = 5;
        this.mCustom = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "positiveCross":
                return 309;
            case "viewTransitionOnPositiveCross":
                return 302;
            case "triggerCollisionId":
                return 307;
            case "triggerID":
                return 308;
            case "negativeCross":
                return 310;
            case "triggerCollisionView":
                return 306;
            case "viewTransitionOnNegativeCross":
                return 303;
            case "triggerSlack":
                return 305;
            case "viewTransitionOnCross":
                return 301;
            case "postLayout":
                return 304;
            case "triggerReceiver":
                return 311;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKeyTrigger copy(androidx.constraintlayout.core.motion.key.MotionKey motionKey) {
        super.copy(motionKey);
        androidx.constraintlayout.core.motion.key.MotionKeyTrigger motionKeyTrigger = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger) motionKey;
        this.mCurveFit = motionKeyTrigger.mCurveFit;
        this.mCross = motionKeyTrigger.mCross;
        this.mTriggerReceiver = motionKeyTrigger.mTriggerReceiver;
        this.mNegativeCross = motionKeyTrigger.mNegativeCross;
        this.mPositiveCross = motionKeyTrigger.mPositiveCross;
        this.mTriggerID = motionKeyTrigger.mTriggerID;
        this.mTriggerCollisionId = motionKeyTrigger.mTriggerCollisionId;
        this.mTriggerSlack = motionKeyTrigger.mTriggerSlack;
        this.mFireCrossReset = motionKeyTrigger.mFireCrossReset;
        this.mFireNegativeReset = motionKeyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = motionKeyTrigger.mFirePositiveReset;
        this.mFireThreshold = motionKeyTrigger.mFireThreshold;
        this.mFireLastPos = motionKeyTrigger.mFireLastPos;
        this.mPostLayout = motionKeyTrigger.mPostLayout;
        this.mCollisionRect = motionKeyTrigger.mCollisionRect;
        this.mTargetRect = motionKeyTrigger.mTargetRect;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public androidx.constraintlayout.core.motion.key.MotionKey mo13clone() {
        return new androidx.constraintlayout.core.motion.key.MotionKeyTrigger().copy((androidx.constraintlayout.core.motion.key.MotionKey) this);
    }

    private void fireCustom(java.lang.String str, androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(java.util.Locale.ROOT);
        }
        for (java.lang.String str2 : this.mCustom.keySet()) {
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                androidx.constraintlayout.core.motion.CustomVariable customVariable = this.mCustom.get(str2);
                if (customVariable != null) {
                    customVariable.applyToWidget(motionWidget);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 307) {
            this.mTriggerCollisionId = i2;
            return true;
        }
        if (i == 308) {
            this.mTriggerID = toInt(java.lang.Integer.valueOf(i2));
            return true;
        }
        if (i == 311) {
            this.mTriggerReceiver = i2;
            return true;
        }
        switch (i) {
            case 301:
                this.mViewTransitionOnCross = i2;
                return true;
            case 302:
                this.mViewTransitionOnPositiveCross = i2;
                return true;
            case 303:
                this.mViewTransitionOnNegativeCross = i2;
                return true;
            default:
                return super.setValue(i, i2);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 305) {
            this.mTriggerSlack = f;
            return true;
        }
        return super.setValue(i, f);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 309) {
            this.mPositiveCross = str;
            return true;
        }
        if (i == 310) {
            this.mNegativeCross = str;
            return true;
        }
        if (i == 312) {
            this.mCross = str;
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        if (i == 304) {
            this.mPostLayout = z;
            return true;
        }
        return super.setValue(i, z);
    }
}
