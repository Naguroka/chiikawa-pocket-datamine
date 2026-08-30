package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends androidx.constraintlayout.widget.ConstraintLayout implements androidx.core.view.NestedScrollingParent3 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    static final int MAX_KEY_FRAMES = 50;
    static final java.lang.String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    boolean firstDown;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime;
    private int mBeginState;
    private android.graphics.RectF mBoundsCheck;
    int mCurrentState;
    int mDebugPath;
    private androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator mDecelerateLogic;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> mDecoratorsHelpers;
    private boolean mDelayedApply;
    private androidx.constraintlayout.motion.widget.DesignTool mDesignTool;
    androidx.constraintlayout.motion.widget.MotionLayout.DevModeDraw mDevModeDraw;
    private int mEndState;
    int mEndWrapHeight;
    int mEndWrapWidth;
    java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> mFrameArrayList;
    private int mFrames;
    int mHeightMeasureMode;
    private boolean mInLayout;
    private boolean mInRotation;
    boolean mInTransition;
    boolean mIndirectTransition;
    private boolean mInteractionEnabled;
    android.view.animation.Interpolator mInterpolator;
    private android.graphics.Matrix mInverseMatrix;
    boolean mIsAnimating;
    private boolean mKeepAnimating;
    private androidx.constraintlayout.core.motion.utils.KeyCache mKeyCache;
    private long mLastDrawTime;
    private float mLastFps;
    private int mLastHeightMeasureSpec;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    float mLastVelocity;
    private int mLastWidthMeasureSpec;
    private float mListenerPosition;
    private int mListenerState;
    protected boolean mMeasureDuringTransition;
    androidx.constraintlayout.motion.widget.MotionLayout.Model mModel;
    private boolean mNeedsFireTransitionCompleted;
    int mOldHeight;
    int mOldWidth;
    private java.lang.Runnable mOnComplete;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> mOnHideHelpers;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> mOnShowHelpers;
    float mPostInterpolationPosition;
    java.util.HashMap<android.view.View, androidx.constraintlayout.motion.utils.ViewState> mPreRotate;
    private int mPreRotateHeight;
    private int mPreRotateWidth;
    private int mPreviouseRotation;
    android.view.animation.Interpolator mProgressInterpolator;
    private android.view.View mRegionView;
    int mRotatMode;
    androidx.constraintlayout.motion.widget.MotionScene mScene;
    private int[] mScheduledTransitionTo;
    int mScheduledTransitions;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    private androidx.constraintlayout.motion.widget.MotionLayout.StateCache mStateCache;
    private androidx.constraintlayout.motion.utils.StopLogic mStopLogic;
    android.graphics.Rect mTempRect;
    private boolean mTemporalInterpolator;
    java.util.ArrayList<java.lang.Integer> mTransitionCompleted;
    private float mTransitionDuration;
    float mTransitionGoalPosition;
    private boolean mTransitionInstantly;
    float mTransitionLastPosition;
    private long mTransitionLastTime;
    private androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener mTransitionListener;
    private java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> mTransitionListeners;
    float mTransitionPosition;
    androidx.constraintlayout.motion.widget.MotionLayout.TransitionState mTransitionState;
    boolean mUndergoingMotion;
    int mWidthMeasureMode;

    protected interface MotionTracker {
        void addMovement(android.view.MotionEvent event);

        void clear();

        void computeCurrentVelocity(int units);

        void computeCurrentVelocity(int units, float maxVelocity);

        float getXVelocity();

        float getXVelocity(int id);

        float getYVelocity();

        float getYVelocity(int id);

        void recycle();
    }

    public interface TransitionListener {
        void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId, float progress);

        void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int currentId);

        void onTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId);

        void onTransitionTrigger(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int triggerId, boolean positive, float progress);
    }

    enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private static boolean willJump(float velocity, float position, float maxAcceleration) {
        if (velocity > 0.0f) {
            float f = velocity / maxAcceleration;
            return position + ((velocity * f) - (((maxAcceleration * f) * f) / 2.0f)) > 1.0f;
        }
        float f2 = (-velocity) / maxAcceleration;
        return position + ((velocity * f2) + (((maxAcceleration * f2) * f2) / 2.0f)) < 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View target, float velocityX, float velocityY, boolean consumed) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View target, float velocityX, float velocityY) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
    }

    androidx.constraintlayout.motion.widget.MotionController getMotionController(int mTouchAnchorId) {
        return this.mFrameArrayList.get(findViewById(mTouchAnchorId));
    }

    public MotionLayout(android.content.Context context) {
        super(context);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new java.util.HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new androidx.constraintlayout.motion.utils.StopLogic();
        this.mDecelerateLogic = new androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new androidx.constraintlayout.core.motion.utils.KeyCache();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new java.util.HashMap<>();
        this.mTempRect = new android.graphics.Rect();
        this.mDelayedApply = false;
        this.mTransitionState = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED;
        this.mModel = new androidx.constraintlayout.motion.widget.MotionLayout.Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new android.graphics.RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new java.util.ArrayList<>();
        init(null);
    }

    public MotionLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new java.util.HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new androidx.constraintlayout.motion.utils.StopLogic();
        this.mDecelerateLogic = new androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new androidx.constraintlayout.core.motion.utils.KeyCache();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new java.util.HashMap<>();
        this.mTempRect = new android.graphics.Rect();
        this.mDelayedApply = false;
        this.mTransitionState = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED;
        this.mModel = new androidx.constraintlayout.motion.widget.MotionLayout.Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new android.graphics.RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new java.util.ArrayList<>();
        init(attrs);
    }

    public MotionLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new java.util.HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new androidx.constraintlayout.motion.utils.StopLogic();
        this.mDecelerateLogic = new androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new androidx.constraintlayout.core.motion.utils.KeyCache();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new java.util.HashMap<>();
        this.mTempRect = new android.graphics.Rect();
        this.mDelayedApply = false;
        this.mTransitionState = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED;
        this.mModel = new androidx.constraintlayout.motion.widget.MotionLayout.Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new android.graphics.RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new java.util.ArrayList<>();
        init(attrs);
    }

    protected long getNanoTime() {
        return java.lang.System.nanoTime();
    }

    protected androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker obtainVelocityTracker() {
        return androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.obtain();
    }

    public void enableTransition(int transitionID, boolean enable) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = getTransition(transitionID);
        if (enable) {
            transition.setEnabled(true);
            return;
        }
        if (transition == this.mScene.mCurrentTransition) {
            for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 : this.mScene.getTransitionsWithState(this.mCurrentState)) {
                if (transition2.isEnabled()) {
                    this.mScene.mCurrentTransition = transition2;
                    break;
                }
            }
        }
        transition.setEnabled(false);
    }

    void setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState newState) {
        if (newState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED && this.mCurrentState == -1) {
            return;
        }
        androidx.constraintlayout.motion.widget.MotionLayout.TransitionState transitionState = this.mTransitionState;
        this.mTransitionState = newState;
        if (transitionState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING && newState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING) {
            fireTransitionChange();
        }
        int i = androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass5.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[transitionState.ordinal()];
        if (i == 1 || i == 2) {
            if (newState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING) {
                fireTransitionChange();
            }
            if (newState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED) {
                fireTransitionCompleted();
                return;
            }
            return;
        }
        if (i == 3 && newState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED) {
            fireTransitionCompleted();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState;

        static {
            int[] iArr = new int[androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values().length];
            $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState = iArr;
            try {
                iArr[androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private static class MyTracker implements androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker {
        private static androidx.constraintlayout.motion.widget.MotionLayout.MyTracker me = new androidx.constraintlayout.motion.widget.MotionLayout.MyTracker();
        android.view.VelocityTracker tracker;

        private MyTracker() {
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.MyTracker obtain() {
            me.tracker = android.view.VelocityTracker.obtain();
            return me;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void recycle() {
            android.view.VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.tracker = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void clear() {
            android.view.VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void addMovement(android.view.MotionEvent event) {
            android.view.VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(event);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int units) {
            android.view.VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int units, float maxVelocity) {
            android.view.VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units, maxVelocity);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity() {
            android.view.VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity() {
            android.view.VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity(int id) {
            android.view.VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(id);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity(int id) {
            if (this.tracker != null) {
                return getYVelocity(id);
            }
            return 0.0f;
        }
    }

    void setStartState(int beginId) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.mStateCache.setStartState(beginId);
            this.mStateCache.setEndState(beginId);
            return;
        }
        this.mCurrentState = beginId;
    }

    public void setTransition(int beginId, int endId) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.mStateCache.setStartState(beginId);
            this.mStateCache.setEndState(endId);
            return;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mBeginState = beginId;
            this.mEndState = endId;
            motionScene.setTransition(beginId, endId);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(beginId), this.mScene.getConstraintSet(endId));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransition(int transitionId) {
        float f;
        if (this.mScene != null) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = getTransition(transitionId);
            this.mBeginState = transition.getStartConstraintSetId();
            this.mEndState = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
                }
                this.mStateCache.setStartState(this.mBeginState);
                this.mStateCache.setEndState(this.mEndState);
                return;
            }
            int i = this.mCurrentState;
            if (i == this.mBeginState) {
                f = 0.0f;
            } else {
                f = i == this.mEndState ? 1.0f : Float.NaN;
            }
            this.mScene.setTransition(transition);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            rebuildScene();
            if (this.mTransitionLastPosition != f) {
                if (f == 0.0f) {
                    endTrigger(true);
                    this.mScene.getConstraintSet(this.mBeginState).applyTo(this);
                } else if (f == 1.0f) {
                    endTrigger(false);
                    this.mScene.getConstraintSet(this.mEndState).applyTo(this);
                }
            }
            this.mTransitionLastPosition = java.lang.Float.isNaN(f) ? 0.0f : f;
            if (java.lang.Float.isNaN(f)) {
                android.util.Log.v(TAG, androidx.constraintlayout.motion.widget.Debug.getLocation() + " transitionToStart ");
                transitionToStart();
            } else {
                setProgress(f);
            }
        }
    }

    protected void setTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        this.mScene.setTransition(transition);
        setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
        if (this.mCurrentState == this.mScene.getEndId()) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionGoalPosition = 0.0f;
        }
        this.mTransitionLastTime = transition.isTransitionFlag(1) ? -1L : getNanoTime();
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if (startId == this.mBeginState && endId == this.mEndState) {
            return;
        }
        this.mBeginState = startId;
        this.mEndState = endId;
        this.mScene.setTransition(startId, endId);
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        this.mModel.setMeasuredId(this.mBeginState, this.mEndState);
        this.mModel.reEvaluateState();
        rebuildScene();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int motionScene) {
        if (motionScene != 0) {
            try {
                androidx.constraintlayout.motion.widget.MotionScene motionScene2 = new androidx.constraintlayout.motion.widget.MotionScene(getContext(), this, motionScene);
                this.mScene = motionScene2;
                if (this.mCurrentState == -1) {
                    this.mCurrentState = motionScene2.getStartId();
                    this.mBeginState = this.mScene.getStartId();
                    this.mEndState = this.mScene.getEndId();
                }
                if (isAttachedToWindow()) {
                    try {
                        android.view.Display display = getDisplay();
                        this.mPreviouseRotation = display == null ? 0 : display.getRotation();
                        androidx.constraintlayout.motion.widget.MotionScene motionScene3 = this.mScene;
                        if (motionScene3 != null) {
                            androidx.constraintlayout.widget.ConstraintSet constraintSet = motionScene3.getConstraintSet(this.mCurrentState);
                            this.mScene.readFallback(this);
                            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.mDecoratorsHelpers;
                            if (arrayList != null) {
                                java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    it.next().onFinishedMotionScene(this);
                                }
                            }
                            if (constraintSet != null) {
                                constraintSet.applyTo(this);
                            }
                            this.mBeginState = this.mCurrentState;
                        }
                        onNewStateAttachHandlers();
                        androidx.constraintlayout.motion.widget.MotionLayout.StateCache stateCache = this.mStateCache;
                        if (stateCache != null) {
                            if (this.mDelayedApply) {
                                post(new java.lang.Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        androidx.constraintlayout.motion.widget.MotionLayout.this.mStateCache.apply();
                                    }
                                });
                                return;
                            } else {
                                stateCache.apply();
                                return;
                            }
                        }
                        androidx.constraintlayout.motion.widget.MotionScene motionScene4 = this.mScene;
                        if (motionScene4 == null || motionScene4.mCurrentTransition == null || this.mScene.mCurrentTransition.getAutoTransition() != 4) {
                            return;
                        }
                        transitionToEnd();
                        setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
                        setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                        return;
                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException("unable to parse MotionScene file", e);
                    }
                }
                this.mScene = null;
                return;
            } catch (java.lang.Exception e2) {
                throw new java.lang.IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        }
        this.mScene = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int id, int screenWidth, int screenHeight) {
        setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
        this.mCurrentState = id;
        this.mBeginState = -1;
        this.mEndState = -1;
        if (this.mConstraintLayoutSpec != null) {
            this.mConstraintLayoutSpec.updateConstraints(id, screenWidth, screenHeight);
            return;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.getConstraintSet(id).applyTo(this);
        }
    }

    public void setInterpolatedProgress(float pos) {
        if (this.mScene != null) {
            setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
            android.view.animation.Interpolator interpolator = this.mScene.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(pos));
                return;
            }
        }
        setProgress(pos);
    }

    public void setProgress(float pos, float velocity) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.mStateCache.setProgress(pos);
            this.mStateCache.setVelocity(velocity);
            return;
        }
        setProgress(pos);
        setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
        this.mLastVelocity = velocity;
        if (velocity != 0.0f) {
            animateTo(velocity > 0.0f ? 1.0f : 0.0f);
        } else {
            if (pos == 0.0f || pos == 1.0f) {
                return;
            }
            animateTo(pos > 0.5f ? 1.0f : 0.0f);
        }
    }

    class StateCache {
        float mProgress = Float.NaN;
        float mVelocity = Float.NaN;
        int startState = -1;
        int endState = -1;
        final java.lang.String KeyProgress = "motion.progress";
        final java.lang.String KeyVelocity = "motion.velocity";
        final java.lang.String KeyStartState = "motion.StartState";
        final java.lang.String KeyEndState = "motion.EndState";

        StateCache() {
        }

        void apply() {
            int i = this.startState;
            if (i != -1 || this.endState != -1) {
                if (i == -1) {
                    androidx.constraintlayout.motion.widget.MotionLayout.this.transitionToState(this.endState);
                } else {
                    int i2 = this.endState;
                    if (i2 == -1) {
                        androidx.constraintlayout.motion.widget.MotionLayout.this.setState(i, -1, -1);
                    } else {
                        androidx.constraintlayout.motion.widget.MotionLayout.this.setTransition(i, i2);
                    }
                }
                androidx.constraintlayout.motion.widget.MotionLayout.this.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
            }
            if (java.lang.Float.isNaN(this.mVelocity)) {
                if (java.lang.Float.isNaN(this.mProgress)) {
                    return;
                }
                androidx.constraintlayout.motion.widget.MotionLayout.this.setProgress(this.mProgress);
            } else {
                androidx.constraintlayout.motion.widget.MotionLayout.this.setProgress(this.mProgress, this.mVelocity);
                this.mProgress = Float.NaN;
                this.mVelocity = Float.NaN;
                this.startState = -1;
                this.endState = -1;
            }
        }

        public android.os.Bundle getTransitionState() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("motion.progress", this.mProgress);
            bundle.putFloat("motion.velocity", this.mVelocity);
            bundle.putInt("motion.StartState", this.startState);
            bundle.putInt("motion.EndState", this.endState);
            return bundle;
        }

        public void setTransitionState(android.os.Bundle bundle) {
            this.mProgress = bundle.getFloat("motion.progress");
            this.mVelocity = bundle.getFloat("motion.velocity");
            this.startState = bundle.getInt("motion.StartState");
            this.endState = bundle.getInt("motion.EndState");
        }

        public void setProgress(float progress) {
            this.mProgress = progress;
        }

        public void setEndState(int endState) {
            this.endState = endState;
        }

        public void setVelocity(float mVelocity) {
            this.mVelocity = mVelocity;
        }

        public void setStartState(int startState) {
            this.startState = startState;
        }

        public void recordState() {
            this.endState = androidx.constraintlayout.motion.widget.MotionLayout.this.mEndState;
            this.startState = androidx.constraintlayout.motion.widget.MotionLayout.this.mBeginState;
            this.mVelocity = androidx.constraintlayout.motion.widget.MotionLayout.this.getVelocity();
            this.mProgress = androidx.constraintlayout.motion.widget.MotionLayout.this.getProgress();
        }
    }

    public void setTransitionState(android.os.Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
        }
        this.mStateCache.setTransitionState(bundle);
        if (isAttachedToWindow()) {
            this.mStateCache.apply();
        }
    }

    public android.os.Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
        }
        this.mStateCache.recordState();
        return this.mStateCache.getTransitionState();
    }

    public void setProgress(float pos) {
        if (pos < 0.0f || pos > 1.0f) {
            android.util.Log.w(TAG, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.mStateCache.setProgress(pos);
            return;
        }
        if (pos <= 0.0f) {
            if (this.mTransitionLastPosition == 1.0f && this.mCurrentState == this.mEndState) {
                setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
            }
            this.mCurrentState = this.mBeginState;
            if (this.mTransitionLastPosition == 0.0f) {
                setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
            }
        } else if (pos >= 1.0f) {
            if (this.mTransitionLastPosition == 0.0f && this.mCurrentState == this.mBeginState) {
                setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
            }
            this.mCurrentState = this.mEndState;
            if (this.mTransitionLastPosition == 1.0f) {
                setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
            }
        } else {
            this.mCurrentState = -1;
            setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
        }
        if (this.mScene == null) {
            return;
        }
        this.mTransitionInstantly = true;
        this.mTransitionGoalPosition = pos;
        this.mTransitionPosition = pos;
        this.mTransitionLastTime = -1L;
        this.mAnimationStartTime = -1L;
        this.mInterpolator = null;
        this.mInTransition = true;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMotionViews() {
        int childCount = getChildCount();
        this.mModel.build();
        boolean z = true;
        this.mInTransition = true;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iGatPathMotionArc = this.mScene.gatPathMotionArc();
        if (iGatPathMotionArc != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                androidx.constraintlayout.motion.widget.MotionController motionController = this.mFrameArrayList.get(getChildAt(i3));
                if (motionController != null) {
                    motionController.setPathMotionArc(iGatPathMotionArc);
                }
            }
        }
        android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray();
        int[] iArr = new int[this.mFrameArrayList.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            androidx.constraintlayout.motion.widget.MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i5));
            if (motionController2.getAnimateRelativeTo() != -1) {
                sparseBooleanArray.put(motionController2.getAnimateRelativeTo(), true);
                iArr[i4] = motionController2.getAnimateRelativeTo();
                i4++;
            }
        }
        if (this.mDecoratorsHelpers != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                androidx.constraintlayout.motion.widget.MotionController motionController3 = this.mFrameArrayList.get(findViewById(iArr[i6]));
                if (motionController3 != null) {
                    this.mScene.getKeyFrames(motionController3);
                }
            }
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it = this.mDecoratorsHelpers.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(this, this.mFrameArrayList);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                androidx.constraintlayout.motion.widget.MotionController motionController4 = this.mFrameArrayList.get(findViewById(iArr[i7]));
                if (motionController4 != null) {
                    motionController4.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                androidx.constraintlayout.motion.widget.MotionController motionController5 = this.mFrameArrayList.get(findViewById(iArr[i8]));
                if (motionController5 != null) {
                    this.mScene.getKeyFrames(motionController5);
                    motionController5.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            android.view.View childAt2 = getChildAt(i9);
            androidx.constraintlayout.motion.widget.MotionController motionController6 = this.mFrameArrayList.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                this.mScene.getKeyFrames(motionController6);
                motionController6.setup(width, height, this.mTransitionDuration, getNanoTime());
            }
        }
        float staggered = this.mScene.getStaggered();
        if (staggered != 0.0f) {
            boolean z2 = ((double) staggered) < 0.0d;
            float fAbs = java.lang.Math.abs(staggered);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            int i10 = 0;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            while (true) {
                if (i10 >= childCount) {
                    z = false;
                    break;
                }
                androidx.constraintlayout.motion.widget.MotionController motionController7 = this.mFrameArrayList.get(getChildAt(i10));
                if (!java.lang.Float.isNaN(motionController7.mMotionStagger)) {
                    break;
                }
                float finalX = motionController7.getFinalX();
                float finalY = motionController7.getFinalY();
                float f = z2 ? finalY - finalX : finalY + finalX;
                fMin2 = java.lang.Math.min(fMin2, f);
                fMax2 = java.lang.Math.max(fMax2, f);
                i10++;
            }
            if (!z) {
                while (i < childCount) {
                    androidx.constraintlayout.motion.widget.MotionController motionController8 = this.mFrameArrayList.get(getChildAt(i));
                    float finalX2 = motionController8.getFinalX();
                    float finalY2 = motionController8.getFinalY();
                    float f2 = z2 ? finalY2 - finalX2 : finalY2 + finalX2;
                    motionController8.mStaggerScale = 1.0f / (1.0f - fAbs);
                    motionController8.mStaggerOffset = fAbs - (((f2 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i++;
                }
                return;
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                androidx.constraintlayout.motion.widget.MotionController motionController9 = this.mFrameArrayList.get(getChildAt(i11));
                if (!java.lang.Float.isNaN(motionController9.mMotionStagger)) {
                    fMin = java.lang.Math.min(fMin, motionController9.mMotionStagger);
                    fMax = java.lang.Math.max(fMax, motionController9.mMotionStagger);
                }
            }
            while (i < childCount) {
                androidx.constraintlayout.motion.widget.MotionController motionController10 = this.mFrameArrayList.get(getChildAt(i));
                if (!java.lang.Float.isNaN(motionController10.mMotionStagger)) {
                    motionController10.mStaggerScale = 1.0f / (1.0f - fAbs);
                    if (z2) {
                        motionController10.mStaggerOffset = fAbs - (((fMax - motionController10.mMotionStagger) / (fMax - fMin)) * fAbs);
                    } else {
                        motionController10.mStaggerOffset = fAbs - (((motionController10.mMotionStagger - fMin) * fAbs) / (fMax - fMin));
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    public void touchAnimateTo(int touchUpMode, float position, float currentVelocity) {
        if (this.mScene == null || this.mTransitionLastPosition == position) {
            return;
        }
        this.mTemporalInterpolator = true;
        this.mAnimationStartTime = getNanoTime();
        this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
        this.mTransitionGoalPosition = position;
        this.mInTransition = true;
        if (touchUpMode == 0 || touchUpMode == 1 || touchUpMode == 2) {
            if (touchUpMode != 1 || touchUpMode == 7) {
                position = 0.0f;
            } else if (touchUpMode == 2 || touchUpMode == 6) {
                position = 1.0f;
            }
            if (this.mScene.getAutoCompleteMode() == 0) {
                this.mStopLogic.config(this.mTransitionLastPosition, position, currentVelocity, this.mTransitionDuration, this.mScene.getMaxAcceleration(), this.mScene.getMaxVelocity());
            } else {
                this.mStopLogic.springConfig(this.mTransitionLastPosition, position, currentVelocity, this.mScene.getSpringMass(), this.mScene.getSpringStiffiness(), this.mScene.getSpringDamping(), this.mScene.getSpringStopThreshold(), this.mScene.getSpringBoundary());
            }
            int i = this.mCurrentState;
            this.mTransitionGoalPosition = position;
            this.mCurrentState = i;
            this.mInterpolator = this.mStopLogic;
        } else if (touchUpMode == 4) {
            this.mDecelerateLogic.config(currentVelocity, this.mTransitionLastPosition, this.mScene.getMaxAcceleration());
            this.mInterpolator = this.mDecelerateLogic;
        } else if (touchUpMode != 5) {
            if (touchUpMode == 6 || touchUpMode == 7) {
                if (touchUpMode != 1) {
                    position = 0.0f;
                } else {
                    position = 0.0f;
                }
                if (this.mScene.getAutoCompleteMode() == 0) {
                    this.mStopLogic.config(this.mTransitionLastPosition, position, currentVelocity, this.mTransitionDuration, this.mScene.getMaxAcceleration(), this.mScene.getMaxVelocity());
                } else {
                    this.mStopLogic.springConfig(this.mTransitionLastPosition, position, currentVelocity, this.mScene.getSpringMass(), this.mScene.getSpringStiffiness(), this.mScene.getSpringDamping(), this.mScene.getSpringStopThreshold(), this.mScene.getSpringBoundary());
                }
                int i2 = this.mCurrentState;
                this.mTransitionGoalPosition = position;
                this.mCurrentState = i2;
                this.mInterpolator = this.mStopLogic;
            }
        } else if (willJump(currentVelocity, this.mTransitionLastPosition, this.mScene.getMaxAcceleration())) {
            this.mDecelerateLogic.config(currentVelocity, this.mTransitionLastPosition, this.mScene.getMaxAcceleration());
            this.mInterpolator = this.mDecelerateLogic;
        } else {
            this.mStopLogic.config(this.mTransitionLastPosition, position, currentVelocity, this.mTransitionDuration, this.mScene.getMaxAcceleration(), this.mScene.getMaxVelocity());
            this.mLastVelocity = 0.0f;
            int i3 = this.mCurrentState;
            this.mTransitionGoalPosition = position;
            this.mCurrentState = i3;
            this.mInterpolator = this.mStopLogic;
        }
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        invalidate();
    }

    public void touchSpringTo(float position, float currentVelocity) {
        if (this.mScene == null || this.mTransitionLastPosition == position) {
            return;
        }
        this.mTemporalInterpolator = true;
        this.mAnimationStartTime = getNanoTime();
        this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
        this.mTransitionGoalPosition = position;
        this.mInTransition = true;
        this.mStopLogic.springConfig(this.mTransitionLastPosition, position, currentVelocity, this.mScene.getSpringMass(), this.mScene.getSpringStiffiness(), this.mScene.getSpringDamping(), this.mScene.getSpringStopThreshold(), this.mScene.getSpringBoundary());
        int i = this.mCurrentState;
        this.mTransitionGoalPosition = position;
        this.mCurrentState = i;
        this.mInterpolator = this.mStopLogic;
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        invalidate();
    }

    class DecelerateInterpolator extends androidx.constraintlayout.motion.widget.MotionInterpolator {
        float maxA;
        float initalV = 0.0f;
        float currentP = 0.0f;

        DecelerateInterpolator() {
        }

        public void config(float velocity, float position, float maxAcceleration) {
            this.initalV = velocity;
            this.currentP = position;
            this.maxA = maxAcceleration;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float time) {
            float f;
            float f2;
            float f3 = this.initalV;
            if (f3 > 0.0f) {
                float f4 = this.maxA;
                if (f3 / f4 < time) {
                    time = f3 / f4;
                }
                androidx.constraintlayout.motion.widget.MotionLayout.this.mLastVelocity = f3 - (f4 * time);
                f = (this.initalV * time) - (((this.maxA * time) * time) / 2.0f);
                f2 = this.currentP;
            } else {
                float f5 = this.maxA;
                if ((-f3) / f5 < time) {
                    time = (-f3) / f5;
                }
                androidx.constraintlayout.motion.widget.MotionLayout.this.mLastVelocity = f3 + (f5 * time);
                f = (this.initalV * time) + (((this.maxA * time) * time) / 2.0f);
                f2 = this.currentP;
            }
            return f + f2;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
            return androidx.constraintlayout.motion.widget.MotionLayout.this.mLastVelocity;
        }
    }

    void animateTo(float position) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        float f = this.mTransitionLastPosition;
        float f2 = this.mTransitionPosition;
        if (f != f2 && this.mTransitionInstantly) {
            this.mTransitionLastPosition = f2;
        }
        float f3 = this.mTransitionLastPosition;
        if (f3 == position) {
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = position;
        this.mTransitionDuration = motionScene.getDuration() / 1000.0f;
        setProgress(this.mTransitionGoalPosition);
        this.mInterpolator = null;
        this.mProgressInterpolator = this.mScene.getInterpolator();
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        this.mInTransition = true;
        this.mTransitionPosition = f3;
        this.mTransitionLastPosition = f3;
        invalidate();
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.constraintlayout.motion.widget.MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.setStartCurrentState(childAt);
            }
        }
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToEnd() {
        animateTo(1.0f);
        this.mOnComplete = null;
    }

    public void transitionToEnd(java.lang.Runnable onComplete) {
        animateTo(1.0f);
        this.mOnComplete = onComplete;
    }

    public void transitionToState(int id) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.mStateCache.setEndState(id);
            return;
        }
        transitionToState(id, -1, -1);
    }

    public void transitionToState(int id, int duration) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.mStateCache.setEndState(id);
            return;
        }
        transitionToState(id, -1, -1, duration);
    }

    public void transitionToState(int id, int screenWidth, int screenHeight) {
        transitionToState(id, screenWidth, screenHeight, -1);
    }

    public void rotateTo(int id, int duration) {
        this.mInRotation = true;
        this.mPreRotateWidth = getWidth();
        this.mPreRotateHeight = getHeight();
        int rotation = getDisplay().getRotation();
        this.mRotatMode = (rotation + 1) % 4 <= (this.mPreviouseRotation + 1) % 4 ? 2 : 1;
        this.mPreviouseRotation = rotation;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.constraintlayout.motion.utils.ViewState viewState = this.mPreRotate.get(childAt);
            if (viewState == null) {
                viewState = new androidx.constraintlayout.motion.utils.ViewState();
                this.mPreRotate.put(childAt, viewState);
            }
            viewState.getState(childAt);
        }
        this.mBeginState = -1;
        this.mEndState = id;
        this.mScene.setTransition(-1, id);
        this.mModel.initFrom(this.mLayoutWidget, null, this.mScene.getConstraintSet(this.mEndState));
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        invalidate();
        transitionToEnd(new java.lang.Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.constraintlayout.motion.widget.MotionLayout.this.mInRotation = false;
            }
        });
        if (duration > 0) {
            this.mTransitionDuration = duration / 1000.0f;
        }
    }

    public boolean isInRotation() {
        return this.mInRotation;
    }

    public void jumpToState(int id) {
        if (!isAttachedToWindow()) {
            this.mCurrentState = id;
        }
        if (this.mBeginState == id) {
            setProgress(0.0f);
        } else if (this.mEndState == id) {
            setProgress(1.0f);
        } else {
            setTransition(id, id);
        }
    }

    public void transitionToState(int id, int screenWidth, int screenHeight, int duration) {
        int iConvertToConstraintSet;
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null && motionScene.mStateSet != null && (iConvertToConstraintSet = this.mScene.mStateSet.convertToConstraintSet(this.mCurrentState, id, screenWidth, screenHeight)) != -1) {
            id = iConvertToConstraintSet;
        }
        int i = this.mCurrentState;
        if (i == id) {
            return;
        }
        if (this.mBeginState == id) {
            animateTo(0.0f);
            if (duration > 0) {
                this.mTransitionDuration = duration / 1000.0f;
                return;
            }
            return;
        }
        if (this.mEndState == id) {
            animateTo(1.0f);
            if (duration > 0) {
                this.mTransitionDuration = duration / 1000.0f;
                return;
            }
            return;
        }
        this.mEndState = id;
        if (i != -1) {
            setTransition(i, id);
            animateTo(1.0f);
            this.mTransitionLastPosition = 0.0f;
            transitionToEnd();
            if (duration > 0) {
                this.mTransitionDuration = duration / 1000.0f;
                return;
            }
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionLastTime = getNanoTime();
        this.mAnimationStartTime = getNanoTime();
        this.mTransitionInstantly = false;
        this.mInterpolator = null;
        if (duration == -1) {
            this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
        }
        this.mBeginState = -1;
        this.mScene.setTransition(-1, this.mEndState);
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        if (duration == 0) {
            this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
        } else if (duration > 0) {
            this.mTransitionDuration = duration / 1000.0f;
        }
        int childCount = getChildCount();
        this.mFrameArrayList.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            this.mFrameArrayList.put(childAt, new androidx.constraintlayout.motion.widget.MotionController(childAt));
            sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
        }
        this.mInTransition = true;
        this.mModel.initFrom(this.mLayoutWidget, null, this.mScene.getConstraintSet(id));
        rebuildScene();
        this.mModel.build();
        computeCurrentPositions();
        int width = getWidth();
        int height = getHeight();
        if (this.mDecoratorsHelpers != null) {
            for (int i3 = 0; i3 < childCount; i3++) {
                androidx.constraintlayout.motion.widget.MotionController motionController = this.mFrameArrayList.get(getChildAt(i3));
                if (motionController != null) {
                    this.mScene.getKeyFrames(motionController);
                }
            }
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it = this.mDecoratorsHelpers.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(this, this.mFrameArrayList);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                androidx.constraintlayout.motion.widget.MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i4));
                if (motionController2 != null) {
                    motionController2.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        } else {
            for (int i5 = 0; i5 < childCount; i5++) {
                androidx.constraintlayout.motion.widget.MotionController motionController3 = this.mFrameArrayList.get(getChildAt(i5));
                if (motionController3 != null) {
                    this.mScene.getKeyFrames(motionController3);
                    motionController3.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        }
        float staggered = this.mScene.getStaggered();
        if (staggered != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i6 = 0; i6 < childCount; i6++) {
                androidx.constraintlayout.motion.widget.MotionController motionController4 = this.mFrameArrayList.get(getChildAt(i6));
                float finalY = motionController4.getFinalY() + motionController4.getFinalX();
                fMin = java.lang.Math.min(fMin, finalY);
                fMax = java.lang.Math.max(fMax, finalY);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                androidx.constraintlayout.motion.widget.MotionController motionController5 = this.mFrameArrayList.get(getChildAt(i7));
                float finalX = motionController5.getFinalX();
                float finalY2 = motionController5.getFinalY();
                motionController5.mStaggerScale = 1.0f / (1.0f - staggered);
                motionController5.mStaggerOffset = staggered - ((((finalX + finalY2) - fMin) * staggered) / (fMax - fMin));
            }
        }
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mInTransition = true;
        invalidate();
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(android.view.View view, float posOnViewX, float posOnViewY, float[] returnVelocity, int type) {
        float interpolation;
        float velocity = this.mLastVelocity;
        float f = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float fSignum = java.lang.Math.signum(this.mTransitionGoalPosition - f);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            velocity = (fSignum * ((interpolation2 - interpolation) / EPSILON)) / this.mTransitionDuration;
        } else {
            interpolation = f;
        }
        android.view.animation.Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof androidx.constraintlayout.motion.widget.MotionInterpolator) {
            velocity = ((androidx.constraintlayout.motion.widget.MotionInterpolator) interpolator).getVelocity();
        }
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mFrameArrayList.get(view);
        if ((type & 1) == 0) {
            motionController.getPostLayoutDvDp(interpolation, view.getWidth(), view.getHeight(), posOnViewX, posOnViewY, returnVelocity);
        } else {
            motionController.getDpDt(interpolation, posOnViewX, posOnViewY, returnVelocity);
        }
        if (type < 2) {
            returnVelocity[0] = returnVelocity[0] * velocity;
            returnVelocity[1] = returnVelocity[1] * velocity;
        }
    }

    class Model {
        int mEndId;
        int mStartId;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer mLayoutStart = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer mLayoutEnd = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        androidx.constraintlayout.widget.ConstraintSet mStart = null;
        androidx.constraintlayout.widget.ConstraintSet mEnd = null;

        Model() {
        }

        void copy(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer src, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer dest) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> children = src.getChildren();
            java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> map = new java.util.HashMap<>();
            map.put(src, dest);
            dest.getChildren().clear();
            dest.copy(src, map);
            for (androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 : children) {
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Barrier();
                } else if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Guideline) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Guideline();
                } else if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Flow) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Flow();
                } else if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Placeholder) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Placeholder();
                } else if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Helper) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.HelperWidget();
                } else {
                    constraintWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget();
                }
                dest.add(constraintWidget);
                map.put(constraintWidget2, constraintWidget);
            }
            for (androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 : children) {
                map.get(constraintWidget3).copy(constraintWidget3, map);
            }
        }

        void initFrom(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer baseLayout, androidx.constraintlayout.widget.ConstraintSet start, androidx.constraintlayout.widget.ConstraintSet end) {
            this.mStart = start;
            this.mEnd = end;
            this.mLayoutStart = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
            this.mLayoutEnd = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
            this.mLayoutStart.setMeasurer(androidx.constraintlayout.motion.widget.MotionLayout.this.mLayoutWidget.getMeasurer());
            this.mLayoutEnd.setMeasurer(androidx.constraintlayout.motion.widget.MotionLayout.this.mLayoutWidget.getMeasurer());
            this.mLayoutStart.removeAllChildren();
            this.mLayoutEnd.removeAllChildren();
            copy(androidx.constraintlayout.motion.widget.MotionLayout.this.mLayoutWidget, this.mLayoutStart);
            copy(androidx.constraintlayout.motion.widget.MotionLayout.this.mLayoutWidget, this.mLayoutEnd);
            if (androidx.constraintlayout.motion.widget.MotionLayout.this.mTransitionLastPosition > 0.5d) {
                if (start != null) {
                    setupConstraintWidget(this.mLayoutStart, start);
                }
                setupConstraintWidget(this.mLayoutEnd, end);
            } else {
                setupConstraintWidget(this.mLayoutEnd, end);
                if (start != null) {
                    setupConstraintWidget(this.mLayoutStart, start);
                }
            }
            this.mLayoutStart.setRtl(androidx.constraintlayout.motion.widget.MotionLayout.this.isRtl());
            this.mLayoutStart.updateHierarchy();
            this.mLayoutEnd.setRtl(androidx.constraintlayout.motion.widget.MotionLayout.this.isRtl());
            this.mLayoutEnd.updateHierarchy();
            android.view.ViewGroup.LayoutParams layoutParams = androidx.constraintlayout.motion.widget.MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.mLayoutStart.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.mLayoutEnd.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
                if (layoutParams.height == -2) {
                    this.mLayoutStart.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.mLayoutEnd.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void setupConstraintWidget(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer base, androidx.constraintlayout.widget.ConstraintSet cSet) {
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> sparseArray = new android.util.SparseArray<>();
            androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams = new androidx.constraintlayout.widget.Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, base);
            sparseArray.put(androidx.constraintlayout.motion.widget.MotionLayout.this.getId(), base);
            if (cSet != null && cSet.mRotate != 0) {
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout = androidx.constraintlayout.motion.widget.MotionLayout.this;
                motionLayout.resolveSystem(this.mLayoutEnd, motionLayout.getOptimizationLevel(), android.view.View.MeasureSpec.makeMeasureSpec(androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(androidx.constraintlayout.motion.widget.MotionLayout.this.getWidth(), 1073741824));
            }
            for (androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget : base.getChildren()) {
                constraintWidget.setAnimated(true);
                sparseArray.put(((android.view.View) constraintWidget.getCompanionWidget()).getId(), constraintWidget);
            }
            for (androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 : base.getChildren()) {
                android.view.View view = (android.view.View) constraintWidget2.getCompanionWidget();
                cSet.applyToLayoutParams(view.getId(), layoutParams);
                constraintWidget2.setWidth(cSet.getWidth(view.getId()));
                constraintWidget2.setHeight(cSet.getHeight(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                    cSet.applyToHelper((androidx.constraintlayout.widget.ConstraintHelper) view, constraintWidget2, layoutParams, sparseArray);
                    if (view instanceof androidx.constraintlayout.widget.Barrier) {
                        ((androidx.constraintlayout.widget.Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(androidx.constraintlayout.motion.widget.MotionLayout.this.getLayoutDirection());
                androidx.constraintlayout.motion.widget.MotionLayout.this.applyConstraintsFromLayoutParams(false, view, constraintWidget2, layoutParams, sparseArray);
                if (cSet.getVisibilityMode(view.getId()) == 1) {
                    constraintWidget2.setVisibility(view.getVisibility());
                } else {
                    constraintWidget2.setVisibility(cSet.getVisibility(view.getId()));
                }
            }
            for (androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 : base.getChildren()) {
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                    androidx.constraintlayout.widget.ConstraintHelper constraintHelper = (androidx.constraintlayout.widget.ConstraintHelper) constraintWidget3.getCompanionWidget();
                    androidx.constraintlayout.core.widgets.Helper helper = (androidx.constraintlayout.core.widgets.Helper) constraintWidget3;
                    constraintHelper.updatePreLayout(base, helper, sparseArray);
                    ((androidx.constraintlayout.core.widgets.VirtualLayout) helper).captureWidgets();
                }
            }
        }

        androidx.constraintlayout.core.widgets.ConstraintWidget getWidget(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer container, android.view.View view) {
            if (container.getCompanionWidget() == view) {
                return container;
            }
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> children = container.getChildren();
            int size = children.size();
            for (int i = 0; i < size; i++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = children.get(i);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        private void debugLayoutParam(java.lang.String str, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams params) {
            android.util.Log.v(androidx.constraintlayout.motion.widget.MotionLayout.TAG, str + (((((((((((" ".concat(params.startToStart != -1 ? "SS" : "__") + (params.startToEnd != -1 ? "|SE" : "|__")) + (params.endToStart != -1 ? "|ES" : "|__")) + (params.endToEnd != -1 ? "|EE" : "|__")) + (params.leftToLeft != -1 ? "|LL" : "|__")) + (params.leftToRight != -1 ? "|LR" : "|__")) + (params.rightToLeft != -1 ? "|RL" : "|__")) + (params.rightToRight != -1 ? "|RR" : "|__")) + (params.topToTop != -1 ? "|TT" : "|__")) + (params.topToBottom != -1 ? "|TB" : "|__")) + (params.bottomToTop != -1 ? "|BT" : "|__")) + (params.bottomToBottom != -1 ? "|BB" : "|__")));
        }

        private void debugWidget(java.lang.String str, androidx.constraintlayout.core.widgets.ConstraintWidget child) {
            java.lang.String strConcat;
            java.lang.String strConcat2;
            java.lang.String strConcat3;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(" ");
            java.lang.String strConcat4 = "__";
            if (child.mTop.mTarget != null) {
                strConcat = "T".concat(child.mTop.mTarget.mType == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP ? "T" : "B");
            } else {
                strConcat = "__";
            }
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(sb.append(strConcat).toString());
            if (child.mBottom.mTarget != null) {
                strConcat2 = "B".concat(child.mBottom.mTarget.mType != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP ? "B" : "T");
            } else {
                strConcat2 = "__";
            }
            java.lang.StringBuilder sbAppend2 = new java.lang.StringBuilder().append(sbAppend.append(strConcat2).toString());
            if (child.mLeft.mTarget != null) {
                strConcat3 = "L".concat(child.mLeft.mTarget.mType == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT ? "L" : "R");
            } else {
                strConcat3 = "__";
            }
            java.lang.StringBuilder sbAppend3 = new java.lang.StringBuilder().append(sbAppend2.append(strConcat3).toString());
            if (child.mRight.mTarget != null) {
                strConcat4 = "R".concat(child.mRight.mTarget.mType != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT ? "R" : "L");
            }
            android.util.Log.v(androidx.constraintlayout.motion.widget.MotionLayout.TAG, str + sbAppend3.append(strConcat4).toString() + " ---  " + child);
        }

        private void debugLayout(java.lang.String title, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer c) {
            java.lang.String str = title + " " + androidx.constraintlayout.motion.widget.Debug.getName((android.view.View) c.getCompanionWidget());
            android.util.Log.v(androidx.constraintlayout.motion.widget.MotionLayout.TAG, str + "  ========= " + c);
            int size = c.getChildren().size();
            for (int i = 0; i < size; i++) {
                java.lang.String str2 = str + com.ironsource.y8.i.d + i + "] ";
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = c.getChildren().get(i);
                java.lang.String str3 = (((constraintWidget.mTop.mTarget != null ? "T" : "_") + (constraintWidget.mBottom.mTarget != null ? "B" : "_")) + (constraintWidget.mLeft.mTarget != null ? "L" : "_")) + (constraintWidget.mRight.mTarget != null ? "R" : "_");
                android.view.View view = (android.view.View) constraintWidget.getCompanionWidget();
                java.lang.String name = androidx.constraintlayout.motion.widget.Debug.getName(view);
                if (view instanceof android.widget.TextView) {
                    name = name + "(" + ((java.lang.Object) ((android.widget.TextView) view).getText()) + ")";
                }
                android.util.Log.v(androidx.constraintlayout.motion.widget.MotionLayout.TAG, str2 + "  " + name + " " + constraintWidget + " " + str3);
            }
            android.util.Log.v(androidx.constraintlayout.motion.widget.MotionLayout.TAG, str + " done. ");
        }

        public void reEvaluateState() {
            measure(androidx.constraintlayout.motion.widget.MotionLayout.this.mLastWidthMeasureSpec, androidx.constraintlayout.motion.widget.MotionLayout.this.mLastHeightMeasureSpec);
            androidx.constraintlayout.motion.widget.MotionLayout.this.setupMotionViews();
        }

        public void measure(int widthMeasureSpec, int heightMeasureSpec) {
            int mode = android.view.View.MeasureSpec.getMode(widthMeasureSpec);
            int mode2 = android.view.View.MeasureSpec.getMode(heightMeasureSpec);
            androidx.constraintlayout.motion.widget.MotionLayout.this.mWidthMeasureMode = mode;
            androidx.constraintlayout.motion.widget.MotionLayout.this.mHeightMeasureMode = mode2;
            androidx.constraintlayout.motion.widget.MotionLayout.this.getOptimizationLevel();
            computeStartEndSize(widthMeasureSpec, heightMeasureSpec);
            if (((androidx.constraintlayout.motion.widget.MotionLayout.this.getParent() instanceof androidx.constraintlayout.motion.widget.MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                computeStartEndSize(widthMeasureSpec, heightMeasureSpec);
                androidx.constraintlayout.motion.widget.MotionLayout.this.mStartWrapWidth = this.mLayoutStart.getWidth();
                androidx.constraintlayout.motion.widget.MotionLayout.this.mStartWrapHeight = this.mLayoutStart.getHeight();
                androidx.constraintlayout.motion.widget.MotionLayout.this.mEndWrapWidth = this.mLayoutEnd.getWidth();
                androidx.constraintlayout.motion.widget.MotionLayout.this.mEndWrapHeight = this.mLayoutEnd.getHeight();
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout = androidx.constraintlayout.motion.widget.MotionLayout.this;
                motionLayout.mMeasureDuringTransition = (motionLayout.mStartWrapWidth == androidx.constraintlayout.motion.widget.MotionLayout.this.mEndWrapWidth && androidx.constraintlayout.motion.widget.MotionLayout.this.mStartWrapHeight == androidx.constraintlayout.motion.widget.MotionLayout.this.mEndWrapHeight) ? false : true;
            }
            int i = androidx.constraintlayout.motion.widget.MotionLayout.this.mStartWrapWidth;
            int i2 = androidx.constraintlayout.motion.widget.MotionLayout.this.mStartWrapHeight;
            if (androidx.constraintlayout.motion.widget.MotionLayout.this.mWidthMeasureMode == Integer.MIN_VALUE || androidx.constraintlayout.motion.widget.MotionLayout.this.mWidthMeasureMode == 0) {
                i = (int) (androidx.constraintlayout.motion.widget.MotionLayout.this.mStartWrapWidth + (androidx.constraintlayout.motion.widget.MotionLayout.this.mPostInterpolationPosition * (androidx.constraintlayout.motion.widget.MotionLayout.this.mEndWrapWidth - androidx.constraintlayout.motion.widget.MotionLayout.this.mStartWrapWidth)));
            }
            int i3 = i;
            if (androidx.constraintlayout.motion.widget.MotionLayout.this.mHeightMeasureMode == Integer.MIN_VALUE || androidx.constraintlayout.motion.widget.MotionLayout.this.mHeightMeasureMode == 0) {
                i2 = (int) (androidx.constraintlayout.motion.widget.MotionLayout.this.mStartWrapHeight + (androidx.constraintlayout.motion.widget.MotionLayout.this.mPostInterpolationPosition * (androidx.constraintlayout.motion.widget.MotionLayout.this.mEndWrapHeight - androidx.constraintlayout.motion.widget.MotionLayout.this.mStartWrapHeight)));
            }
            androidx.constraintlayout.motion.widget.MotionLayout.this.resolveMeasuredDimension(widthMeasureSpec, heightMeasureSpec, i3, i2, this.mLayoutStart.isWidthMeasuredTooSmall() || this.mLayoutEnd.isWidthMeasuredTooSmall(), this.mLayoutStart.isHeightMeasuredTooSmall() || this.mLayoutEnd.isHeightMeasuredTooSmall());
        }

        private void computeStartEndSize(int widthMeasureSpec, int heightMeasureSpec) {
            int optimizationLevel = androidx.constraintlayout.motion.widget.MotionLayout.this.getOptimizationLevel();
            if (androidx.constraintlayout.motion.widget.MotionLayout.this.mCurrentState == androidx.constraintlayout.motion.widget.MotionLayout.this.getStartState()) {
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout = androidx.constraintlayout.motion.widget.MotionLayout.this;
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutEnd;
                androidx.constraintlayout.widget.ConstraintSet constraintSet = this.mEnd;
                int i = (constraintSet == null || constraintSet.mRotate == 0) ? widthMeasureSpec : heightMeasureSpec;
                androidx.constraintlayout.widget.ConstraintSet constraintSet2 = this.mEnd;
                motionLayout.resolveSystem(constraintWidgetContainer, optimizationLevel, i, (constraintSet2 == null || constraintSet2.mRotate == 0) ? heightMeasureSpec : widthMeasureSpec);
                androidx.constraintlayout.widget.ConstraintSet constraintSet3 = this.mStart;
                if (constraintSet3 != null) {
                    androidx.constraintlayout.motion.widget.MotionLayout motionLayout2 = androidx.constraintlayout.motion.widget.MotionLayout.this;
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    int i2 = constraintSet3.mRotate == 0 ? widthMeasureSpec : heightMeasureSpec;
                    if (this.mStart.mRotate == 0) {
                        widthMeasureSpec = heightMeasureSpec;
                    }
                    motionLayout2.resolveSystem(constraintWidgetContainer2, optimizationLevel, i2, widthMeasureSpec);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.ConstraintSet constraintSet4 = this.mStart;
            if (constraintSet4 != null) {
                androidx.constraintlayout.motion.widget.MotionLayout.this.resolveSystem(this.mLayoutStart, optimizationLevel, constraintSet4.mRotate == 0 ? widthMeasureSpec : heightMeasureSpec, this.mStart.mRotate == 0 ? heightMeasureSpec : widthMeasureSpec);
            }
            androidx.constraintlayout.motion.widget.MotionLayout motionLayout3 = androidx.constraintlayout.motion.widget.MotionLayout.this;
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutEnd;
            androidx.constraintlayout.widget.ConstraintSet constraintSet5 = this.mEnd;
            int i3 = (constraintSet5 == null || constraintSet5.mRotate == 0) ? widthMeasureSpec : heightMeasureSpec;
            androidx.constraintlayout.widget.ConstraintSet constraintSet6 = this.mEnd;
            if (constraintSet6 == null || constraintSet6.mRotate == 0) {
                widthMeasureSpec = heightMeasureSpec;
            }
            motionLayout3.resolveSystem(constraintWidgetContainer3, optimizationLevel, i3, widthMeasureSpec);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:26:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:27:0x0112  */
        /* JADX WARN: Code duplicated, block: B:29:0x0118  */
        /* JADX WARN: Code duplicated, block: B:42:0x014c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x014c A[SYNTHETIC] */
        public void build() {
            androidx.constraintlayout.core.widgets.ConstraintWidget widget;
            int childCount = androidx.constraintlayout.motion.widget.MotionLayout.this.getChildCount();
            androidx.constraintlayout.motion.widget.MotionLayout.this.mFrameArrayList.clear();
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            int[] iArr = new int[childCount];
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = androidx.constraintlayout.motion.widget.MotionLayout.this.getChildAt(i);
                androidx.constraintlayout.motion.widget.MotionController motionController = new androidx.constraintlayout.motion.widget.MotionController(childAt);
                int id = childAt.getId();
                iArr[i] = id;
                sparseArray.put(id, motionController);
                androidx.constraintlayout.motion.widget.MotionLayout.this.mFrameArrayList.put(childAt, motionController);
            }
            int i2 = 0;
            while (i2 < childCount) {
                android.view.View childAt2 = androidx.constraintlayout.motion.widget.MotionLayout.this.getChildAt(i2);
                androidx.constraintlayout.motion.widget.MotionController motionController2 = androidx.constraintlayout.motion.widget.MotionLayout.this.mFrameArrayList.get(childAt2);
                if (motionController2 == null) {
                    sparseArray = sparseArray;
                } else {
                    if (this.mStart == null) {
                        if (androidx.constraintlayout.motion.widget.MotionLayout.this.mInRotation) {
                            motionController2.setStartState(androidx.constraintlayout.motion.widget.MotionLayout.this.mPreRotate.get(childAt2), childAt2, androidx.constraintlayout.motion.widget.MotionLayout.this.mRotatMode, androidx.constraintlayout.motion.widget.MotionLayout.this.mPreRotateWidth, androidx.constraintlayout.motion.widget.MotionLayout.this.mPreRotateHeight);
                        }
                        if (this.mEnd == null) {
                            widget = getWidget(this.mLayoutEnd, childAt2);
                            if (widget != null) {
                                motionController2.setEndState(androidx.constraintlayout.motion.widget.MotionLayout.this.toRect(widget), this.mEnd, androidx.constraintlayout.motion.widget.MotionLayout.this.getWidth(), androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight());
                            } else if (androidx.constraintlayout.motion.widget.MotionLayout.this.mDebugPath != 0) {
                                android.util.Log.e(androidx.constraintlayout.motion.widget.MotionLayout.TAG, androidx.constraintlayout.motion.widget.Debug.getLocation() + "no widget for  " + androidx.constraintlayout.motion.widget.Debug.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        androidx.constraintlayout.core.widgets.ConstraintWidget widget2 = getWidget(this.mLayoutStart, childAt2);
                        if (widget2 != null) {
                            motionController2.setStartState(androidx.constraintlayout.motion.widget.MotionLayout.this.toRect(widget2), this.mStart, androidx.constraintlayout.motion.widget.MotionLayout.this.getWidth(), androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight());
                        } else if (androidx.constraintlayout.motion.widget.MotionLayout.this.mDebugPath != 0) {
                            android.util.Log.e(androidx.constraintlayout.motion.widget.MotionLayout.TAG, androidx.constraintlayout.motion.widget.Debug.getLocation() + "no widget for  " + androidx.constraintlayout.motion.widget.Debug.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.mEnd == null) {
                        widget = getWidget(this.mLayoutEnd, childAt2);
                        if (widget != null) {
                            motionController2.setEndState(androidx.constraintlayout.motion.widget.MotionLayout.this.toRect(widget), this.mEnd, androidx.constraintlayout.motion.widget.MotionLayout.this.getWidth(), androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight());
                        } else if (androidx.constraintlayout.motion.widget.MotionLayout.this.mDebugPath != 0) {
                            android.util.Log.e(androidx.constraintlayout.motion.widget.MotionLayout.TAG, androidx.constraintlayout.motion.widget.Debug.getLocation() + "no widget for  " + androidx.constraintlayout.motion.widget.Debug.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i2++;
                sparseArray = sparseArray;
            }
            android.util.SparseArray sparseArray2 = sparseArray;
            int i3 = 0;
            while (i3 < childCount) {
                android.util.SparseArray sparseArray3 = sparseArray2;
                androidx.constraintlayout.motion.widget.MotionController motionController3 = (androidx.constraintlayout.motion.widget.MotionController) sparseArray3.get(iArr[i3]);
                int animateRelativeTo = motionController3.getAnimateRelativeTo();
                if (animateRelativeTo != -1) {
                    motionController3.setupRelative((androidx.constraintlayout.motion.widget.MotionController) sparseArray3.get(animateRelativeTo));
                }
                i3++;
                sparseArray2 = sparseArray3;
            }
        }

        public void setMeasuredId(int startId, int endId) {
            this.mStartId = startId;
            this.mEndId = endId;
        }

        public boolean isNotConfiguredWith(int startId, int endId) {
            return (startId == this.mStartId && endId == this.mEndId) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.Rect toRect(androidx.constraintlayout.core.widgets.ConstraintWidget cw) {
        this.mTempRect.top = cw.getY();
        this.mTempRect.left = cw.getX();
        this.mTempRect.right = cw.getWidth() + this.mTempRect.left;
        this.mTempRect.bottom = cw.getHeight() + this.mTempRect.top;
        return this.mTempRect;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene;
        if (!this.mMeasureDuringTransition && this.mCurrentState == -1 && (motionScene = this.mScene) != null && motionScene.mCurrentTransition != null) {
            int layoutDuringTransition = this.mScene.mCurrentTransition.getLayoutDuringTransition();
            if (layoutDuringTransition == 0) {
                return;
            }
            if (layoutDuringTransition == 2) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    this.mFrameArrayList.get(getChildAt(i)).remeasure();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public java.lang.String toString() {
        android.content.Context context = getContext();
        return androidx.constraintlayout.motion.widget.Debug.getName(context, this.mBeginState) + "->" + androidx.constraintlayout.motion.widget.Debug.getName(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mScene == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        boolean z = false;
        boolean z2 = (this.mLastWidthMeasureSpec == widthMeasureSpec && this.mLastHeightMeasureSpec == heightMeasureSpec) ? false : true;
        if (this.mNeedsFireTransitionCompleted) {
            this.mNeedsFireTransitionCompleted = false;
            onNewStateAttachHandlers();
            processTransitionCompleted();
            z2 = true;
        }
        if (this.mDirtyHierarchy) {
            z2 = true;
        }
        this.mLastWidthMeasureSpec = widthMeasureSpec;
        this.mLastHeightMeasureSpec = heightMeasureSpec;
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if ((z2 || this.mModel.isNotConfiguredWith(startId, endId)) && this.mBeginState != -1) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(startId), this.mScene.getConstraintSet(endId));
            this.mModel.reEvaluateState();
            this.mModel.setMeasuredId(startId, endId);
        } else {
            if (z2) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
            z = true;
        }
        if (this.mMeasureDuringTransition || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int width = this.mLayoutWidget.getWidth() + getPaddingLeft() + getPaddingRight();
            int height = this.mLayoutWidget.getHeight() + paddingTop;
            int i = this.mWidthMeasureMode;
            if (i == Integer.MIN_VALUE || i == 0) {
                int i2 = this.mStartWrapWidth;
                width = (int) (i2 + (this.mPostInterpolationPosition * (this.mEndWrapWidth - i2)));
                requestLayout();
            }
            int i3 = this.mHeightMeasureMode;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.mStartWrapHeight;
                height = (int) (i4 + (this.mPostInterpolationPosition * (this.mEndWrapHeight - i4)));
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        evaluateLayout();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int axes, int type) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        return (motionScene == null || motionScene.mCurrentTransition == null || this.mScene.mCurrentTransition.getTouchResponse() == null || (this.mScene.mCurrentTransition.getTouchResponse().getFlags() & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View child, android.view.View target, int axes, int type) {
        this.mScrollTargetTime = getNanoTime();
        this.mScrollTargetDT = 0.0f;
        this.mScrollTargetDX = 0.0f;
        this.mScrollTargetDY = 0.0f;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View target, int type) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f = this.mScrollTargetDT;
            if (f == 0.0f) {
                return;
            }
            motionScene.processScrollUp(this.mScrollTargetDX / f, this.mScrollTargetDY / f);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (this.mUndergoingMotion || dxConsumed != 0 || dyConsumed != 0) {
            consumed[0] = consumed[0] + dxUnconsumed;
            consumed[1] = consumed[1] + dyUnconsumed;
        }
        this.mUndergoingMotion = false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(final android.view.View target, int dx, int dy, int[] consumed, int type) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition;
        androidx.constraintlayout.motion.widget.TouchResponse touchResponse;
        int touchRegionId;
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null || (transition = motionScene.mCurrentTransition) == null || !transition.isEnabled()) {
            return;
        }
        int i = -1;
        if (!transition.isEnabled() || (touchResponse = transition.getTouchResponse()) == null || (touchRegionId = touchResponse.getTouchRegionId()) == -1 || target.getId() == touchRegionId) {
            if (motionScene.getMoveWhenScrollAtTop()) {
                androidx.constraintlayout.motion.widget.TouchResponse touchResponse2 = transition.getTouchResponse();
                if (touchResponse2 != null && (touchResponse2.getFlags() & 4) != 0) {
                    i = dy;
                }
                float f = this.mTransitionPosition;
                if ((f == 1.0f || f == 0.0f) && target.canScrollVertically(i)) {
                    return;
                }
            }
            if (transition.getTouchResponse() != null && (transition.getTouchResponse().getFlags() & 1) != 0) {
                float progressDirection = motionScene.getProgressDirection(dx, dy);
                float f2 = this.mTransitionLastPosition;
                if ((f2 <= 0.0f && progressDirection < 0.0f) || (f2 >= 1.0f && progressDirection > 0.0f)) {
                    target.setNestedScrollingEnabled(false);
                    target.post(new java.lang.Runnable(this) { // from class: androidx.constraintlayout.motion.widget.MotionLayout.3
                        @Override // java.lang.Runnable
                        public void run() {
                            target.setNestedScrollingEnabled(true);
                        }
                    });
                    return;
                }
            }
            float f3 = this.mTransitionPosition;
            long nanoTime = getNanoTime();
            float f4 = dx;
            this.mScrollTargetDX = f4;
            float f5 = dy;
            this.mScrollTargetDY = f5;
            this.mScrollTargetDT = (float) ((nanoTime - this.mScrollTargetTime) * 1.0E-9d);
            this.mScrollTargetTime = nanoTime;
            motionScene.processScrollMove(f4, f5);
            if (f3 != this.mTransitionPosition) {
                consumed[0] = dx;
                consumed[1] = dy;
            }
            evaluate(false);
            if (consumed[0] == 0 && consumed[1] == 0) {
                return;
            }
            this.mUndergoingMotion = true;
        }
    }

    private class DevModeDraw {
        private static final int DEBUG_PATH_TICKS_PER_MS = 16;
        android.graphics.DashPathEffect mDashPathEffect;
        android.graphics.Paint mFillPaint;
        int mKeyFrameCount;
        float[] mKeyFramePoints;
        android.graphics.Paint mPaint;
        android.graphics.Paint mPaintGraph;
        android.graphics.Paint mPaintKeyframes;
        android.graphics.Path mPath;
        int[] mPathMode;
        float[] mPoints;
        private float[] mRectangle;
        int mShadowTranslate;
        android.graphics.Paint mTextPaint;
        final int RED_COLOR = -21965;
        final int KEYFRAME_COLOR = -2067046;
        final int GRAPH_COLOR = -13391360;
        final int SHADOW_COLOR = 1996488704;
        final int DIAMOND_SIZE = 10;
        android.graphics.Rect mBounds = new android.graphics.Rect();
        boolean mPresentationMode = false;

        public DevModeDraw() {
            this.mShadowTranslate = 1;
            android.graphics.Paint paint = new android.graphics.Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-21965);
            this.mPaint.setStrokeWidth(2.0f);
            this.mPaint.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.mPaintKeyframes = paint2;
            paint2.setAntiAlias(true);
            this.mPaintKeyframes.setColor(-2067046);
            this.mPaintKeyframes.setStrokeWidth(2.0f);
            this.mPaintKeyframes.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.Paint paint3 = new android.graphics.Paint();
            this.mPaintGraph = paint3;
            paint3.setAntiAlias(true);
            this.mPaintGraph.setColor(-13391360);
            this.mPaintGraph.setStrokeWidth(2.0f);
            this.mPaintGraph.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.Paint paint4 = new android.graphics.Paint();
            this.mTextPaint = paint4;
            paint4.setAntiAlias(true);
            this.mTextPaint.setColor(-13391360);
            this.mTextPaint.setTextSize(androidx.constraintlayout.motion.widget.MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.mRectangle = new float[8];
            android.graphics.Paint paint5 = new android.graphics.Paint();
            this.mFillPaint = paint5;
            paint5.setAntiAlias(true);
            android.graphics.DashPathEffect dashPathEffect = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.mDashPathEffect = dashPathEffect;
            this.mPaintGraph.setPathEffect(dashPathEffect);
            this.mKeyFramePoints = new float[100];
            this.mPathMode = new int[50];
            if (this.mPresentationMode) {
                this.mPaint.setStrokeWidth(8.0f);
                this.mFillPaint.setStrokeWidth(8.0f);
                this.mPaintKeyframes.setStrokeWidth(8.0f);
                this.mShadowTranslate = 4;
            }
        }

        public void draw(android.graphics.Canvas canvas, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> frameArrayList, int duration, int debugPath) {
            if (frameArrayList == null || frameArrayList.size() == 0) {
                return;
            }
            canvas.save();
            if (!androidx.constraintlayout.motion.widget.MotionLayout.this.isInEditMode() && (debugPath & 1) == 2) {
                java.lang.String str = androidx.constraintlayout.motion.widget.MotionLayout.this.getContext().getResources().getResourceName(androidx.constraintlayout.motion.widget.MotionLayout.this.mEndState) + ":" + androidx.constraintlayout.motion.widget.MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight() - 30, this.mTextPaint);
                canvas.drawText(str, 11.0f, androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight() - 29, this.mPaint);
            }
            for (androidx.constraintlayout.motion.widget.MotionController motionController : frameArrayList.values()) {
                int drawPath = motionController.getDrawPath();
                if (debugPath > 0 && drawPath == 0) {
                    drawPath = 1;
                }
                if (drawPath != 0) {
                    this.mKeyFrameCount = motionController.buildKeyFrames(this.mKeyFramePoints, this.mPathMode);
                    if (drawPath >= 1) {
                        int i = duration / 16;
                        float[] fArr = this.mPoints;
                        if (fArr == null || fArr.length != i * 2) {
                            this.mPoints = new float[i * 2];
                            this.mPath = new android.graphics.Path();
                        }
                        int i2 = this.mShadowTranslate;
                        canvas.translate(i2, i2);
                        this.mPaint.setColor(1996488704);
                        this.mFillPaint.setColor(1996488704);
                        this.mPaintKeyframes.setColor(1996488704);
                        this.mPaintGraph.setColor(1996488704);
                        motionController.buildPath(this.mPoints, i);
                        drawAll(canvas, drawPath, this.mKeyFrameCount, motionController);
                        this.mPaint.setColor(-21965);
                        this.mPaintKeyframes.setColor(-2067046);
                        this.mFillPaint.setColor(-2067046);
                        this.mPaintGraph.setColor(-13391360);
                        int i3 = this.mShadowTranslate;
                        canvas.translate(-i3, -i3);
                        drawAll(canvas, drawPath, this.mKeyFrameCount, motionController);
                        if (drawPath == 5) {
                            drawRectangle(canvas, motionController);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void drawAll(android.graphics.Canvas canvas, int mode, int keyFrames, androidx.constraintlayout.motion.widget.MotionController motionController) {
            if (mode == 4) {
                drawPathAsConfigured(canvas);
            }
            if (mode == 2) {
                drawPathRelative(canvas);
            }
            if (mode == 3) {
                drawPathCartesian(canvas);
            }
            drawBasicPath(canvas);
            drawTicks(canvas, mode, keyFrames, motionController);
        }

        private void drawBasicPath(android.graphics.Canvas canvas) {
            canvas.drawLines(this.mPoints, this.mPaint);
        }

        private void drawTicks(android.graphics.Canvas canvas, int mode, int keyFrames, androidx.constraintlayout.motion.widget.MotionController motionController) {
            int width;
            int height;
            if (motionController.mView != null) {
                width = motionController.mView.getWidth();
                height = motionController.mView.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i = 1; i < keyFrames - 1; i++) {
                if (mode != 4 || this.mPathMode[i - 1] != 0) {
                    float[] fArr = this.mKeyFramePoints;
                    int i2 = i * 2;
                    float f = fArr[i2];
                    float f2 = fArr[i2 + 1];
                    this.mPath.reset();
                    this.mPath.moveTo(f, f2 + 10.0f);
                    this.mPath.lineTo(f + 10.0f, f2);
                    this.mPath.lineTo(f, f2 - 10.0f);
                    this.mPath.lineTo(f - 10.0f, f2);
                    this.mPath.close();
                    int i3 = i - 1;
                    motionController.getKeyFrame(i3);
                    if (mode == 4) {
                        int i4 = this.mPathMode[i3];
                        if (i4 == 1) {
                            drawPathRelativeTicks(canvas, f - 0.0f, f2 - 0.0f);
                        } else if (i4 == 0) {
                            drawPathCartesianTicks(canvas, f - 0.0f, f2 - 0.0f);
                        } else {
                            if (i4 == 2) {
                                drawPathScreenTicks(canvas, f - 0.0f, f2 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.mPath, this.mFillPaint);
                        }
                        canvas.drawPath(this.mPath, this.mFillPaint);
                    } else {
                        f2 = f2;
                        f = f;
                    }
                    if (mode == 2) {
                        drawPathRelativeTicks(canvas, f - 0.0f, f2 - 0.0f);
                    }
                    if (mode == 3) {
                        drawPathCartesianTicks(canvas, f - 0.0f, f2 - 0.0f);
                    }
                    if (mode == 6) {
                        drawPathScreenTicks(canvas, f - 0.0f, f2 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.mPath, this.mFillPaint);
                }
            }
            float[] fArr2 = this.mPoints;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
                float[] fArr3 = this.mPoints;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
            }
        }

        private void drawTranslation(android.graphics.Canvas canvas, float x1, float y1, float x2, float y2) {
            canvas.drawRect(x1, y1, x2, y2, this.mPaintGraph);
            canvas.drawLine(x1, y1, x2, y2, this.mPaintGraph);
        }

        private void drawPathRelative(android.graphics.Canvas canvas) {
            float[] fArr = this.mPoints;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
        }

        private void drawPathAsConfigured(android.graphics.Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.mKeyFrameCount; i++) {
                int i2 = this.mPathMode[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                drawPathRelative(canvas);
            }
            if (z2) {
                drawPathCartesian(canvas);
            }
        }

        private void drawPathRelativeTicks(android.graphics.Canvas canvas, float x, float y) {
            float[] fArr = this.mPoints;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float fHypot = (float) java.lang.Math.hypot(f - f3, f2 - f4);
            float f5 = f3 - f;
            float f6 = f4 - f2;
            float f7 = (((x - f) * f5) + ((y - f2) * f6)) / (fHypot * fHypot);
            float f8 = f + (f5 * f7);
            float f9 = f2 + (f7 * f6);
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(x, y);
            path.lineTo(f8, f9);
            float fHypot2 = (float) java.lang.Math.hypot(f8 - x, f9 - y);
            java.lang.String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
            canvas.drawLine(x, y, f8, f9, this.mPaintGraph);
        }

        void getTextBounds(java.lang.String text, android.graphics.Paint paint) {
            paint.getTextBounds(text, 0, text.length(), this.mBounds);
        }

        private void drawPathCartesian(android.graphics.Canvas canvas) {
            float[] fArr = this.mPoints;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(java.lang.Math.min(f, f3), java.lang.Math.max(f2, f4), java.lang.Math.max(f, f3), java.lang.Math.max(f2, f4), this.mPaintGraph);
            canvas.drawLine(java.lang.Math.min(f, f3), java.lang.Math.min(f2, f4), java.lang.Math.min(f, f3), java.lang.Math.max(f2, f4), this.mPaintGraph);
        }

        private void drawPathCartesianTicks(android.graphics.Canvas canvas, float x, float y) {
            float[] fArr = this.mPoints;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float fMin = java.lang.Math.min(f, f3);
            float fMax = java.lang.Math.max(f2, f4);
            float fMin2 = x - java.lang.Math.min(f, f3);
            float fMax2 = java.lang.Math.max(f2, f4) - y;
            java.lang.String str = "" + (((int) (((double) ((fMin2 * 100.0f) / java.lang.Math.abs(f3 - f))) + 0.5d)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.mBounds.width() / 2)) + fMin, y - 20.0f, this.mTextPaint);
            canvas.drawLine(x, y, java.lang.Math.min(f, f3), y, this.mPaintGraph);
            java.lang.String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / java.lang.Math.abs(f4 - f2))) + 0.5d)) / 100.0f);
            getTextBounds(str2, this.mTextPaint);
            canvas.drawText(str2, x + 5.0f, fMax - ((fMax2 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
            canvas.drawLine(x, y, x, java.lang.Math.max(f2, f4), this.mPaintGraph);
        }

        private void drawPathScreenTicks(android.graphics.Canvas canvas, float x, float y, int viewWidth, int viewHeight) {
            java.lang.String str = "" + (((int) (((double) (((x - (viewWidth / 2)) * 100.0f) / (androidx.constraintlayout.motion.widget.MotionLayout.this.getWidth() - viewWidth))) + 0.5d)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawText(str, ((x / 2.0f) - (this.mBounds.width() / 2)) + 0.0f, y - 20.0f, this.mTextPaint);
            canvas.drawLine(x, y, java.lang.Math.min(0.0f, 1.0f), y, this.mPaintGraph);
            java.lang.String str2 = "" + (((int) (((double) (((y - (viewHeight / 2)) * 100.0f) / (androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight() - viewHeight))) + 0.5d)) / 100.0f);
            getTextBounds(str2, this.mTextPaint);
            canvas.drawText(str2, x + 5.0f, 0.0f - ((y / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
            canvas.drawLine(x, y, x, java.lang.Math.max(0.0f, 1.0f), this.mPaintGraph);
        }

        private void drawRectangle(android.graphics.Canvas canvas, androidx.constraintlayout.motion.widget.MotionController motionController) {
            this.mPath.reset();
            for (int i = 0; i <= 50; i++) {
                motionController.buildRect(i / 50, this.mRectangle, 0);
                android.graphics.Path path = this.mPath;
                float[] fArr = this.mRectangle;
                path.moveTo(fArr[0], fArr[1]);
                android.graphics.Path path2 = this.mPath;
                float[] fArr2 = this.mRectangle;
                path2.lineTo(fArr2[2], fArr2[3]);
                android.graphics.Path path3 = this.mPath;
                float[] fArr3 = this.mRectangle;
                path3.lineTo(fArr3[4], fArr3[5]);
                android.graphics.Path path4 = this.mPath;
                float[] fArr4 = this.mRectangle;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.mPath.close();
            }
            this.mPaint.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.mPath, this.mPaint);
            canvas.translate(-2.0f, -2.0f);
            this.mPaint.setColor(-65536);
            canvas.drawPath(this.mPath, this.mPaint);
        }
    }

    private void debugPos() {
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            android.util.Log.v(TAG, " " + androidx.constraintlayout.motion.widget.Debug.getLocation() + " " + androidx.constraintlayout.motion.widget.Debug.getName(this) + " " + androidx.constraintlayout.motion.widget.Debug.getName(getContext(), this.mCurrentState) + " " + androidx.constraintlayout.motion.widget.Debug.getName(childAt) + childAt.getLeft() + " " + childAt.getTop());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.mDecoratorsHelpers;
        if (arrayList != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onPreDraw(canvas);
            }
        }
        evaluate(false);
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null && motionScene.mViewTransitionController != null) {
            this.mScene.mViewTransitionController.animate();
        }
        super.dispatchDraw(canvas);
        if (this.mScene == null) {
            return;
        }
        if ((this.mDebugPath & 1) == 1 && !isInEditMode()) {
            this.mFrames++;
            long nanoTime = getNanoTime();
            long j = this.mLastDrawTime;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    this.mLastFps = ((int) ((this.mFrames / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.mFrames = 0;
                    this.mLastDrawTime = nanoTime;
                }
            } else {
                this.mLastDrawTime = nanoTime;
            }
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setTextSize(42.0f);
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(this.mLastFps + " fps " + androidx.constraintlayout.motion.widget.Debug.getState(this, this.mBeginState) + " -> ").append(androidx.constraintlayout.motion.widget.Debug.getState(this, this.mEndState)).append(" (progress: ").append(((int) (getProgress() * 1000.0f)) / 10.0f).append(" ) state=");
            int i = this.mCurrentState;
            java.lang.String string = sbAppend.append(i == -1 ? com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN : androidx.constraintlayout.motion.widget.Debug.getState(this, i)).toString();
            paint.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.mDebugPath > 1) {
            if (this.mDevModeDraw == null) {
                this.mDevModeDraw = new androidx.constraintlayout.motion.widget.MotionLayout.DevModeDraw();
            }
            this.mDevModeDraw.draw(canvas, this.mFrameArrayList, this.mScene.getDuration(), this.mDebugPath);
        }
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList2 = this.mDecoratorsHelpers;
        if (arrayList2 != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().onPostDraw(canvas);
            }
        }
    }

    private void evaluateLayout() {
        boolean z;
        float fSignum = java.lang.Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        android.view.animation.Interpolator interpolator = this.mInterpolator;
        float interpolation = this.mTransitionLastPosition + (!(interpolator instanceof androidx.constraintlayout.motion.utils.StopLogic) ? (((nanoTime - this.mTransitionLastTime) * fSignum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            interpolation = this.mTransitionGoalPosition;
        }
        if ((fSignum <= 0.0f || interpolation < this.mTransitionGoalPosition) && (fSignum > 0.0f || interpolation > this.mTransitionGoalPosition)) {
            z = false;
        } else {
            interpolation = this.mTransitionGoalPosition;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.mTemporalInterpolator) {
                interpolation = interpolator.getInterpolation((nanoTime - this.mAnimationStartTime) * 1.0E-9f);
            } else {
                interpolation = interpolator.getInterpolation(interpolation);
            }
        }
        if ((fSignum > 0.0f && interpolation >= this.mTransitionGoalPosition) || (fSignum <= 0.0f && interpolation <= this.mTransitionGoalPosition)) {
            interpolation = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        android.view.animation.Interpolator interpolator2 = this.mProgressInterpolator;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.constraintlayout.motion.widget.MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.interpolate(childAt, interpolation, nanoTime2, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    void endTrigger(boolean start) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.constraintlayout.motion.widget.MotionController motionController = this.mFrameArrayList.get(getChildAt(i));
            if (motionController != null) {
                motionController.endTrigger(start);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:143:0x0221  */
    /* JADX WARN: Code duplicated, block: B:180:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ab, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0150  */
    /* JADX WARN: Code duplicated, block: B:93:0x0158  */
    /* JADX WARN: Code duplicated, block: B:96:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    void evaluate(boolean force) {
        boolean z;
        char c;
        int childCount;
        long nanoTime;
        android.view.animation.Interpolator interpolator;
        float interpolation;
        android.view.animation.Interpolator interpolator2;
        int i;
        int i2;
        int i3;
        int i4;
        android.view.View childAt;
        androidx.constraintlayout.motion.widget.MotionController motionController;
        boolean z2;
        if (this.mTransitionLastTime == -1) {
            this.mTransitionLastTime = getNanoTime();
        }
        float f = this.mTransitionLastPosition;
        if (f > 0.0f && f < 1.0f) {
            this.mCurrentState = -1;
        }
        boolean z3 = false;
        if (this.mKeepAnimating || (this.mInTransition && (force || this.mTransitionGoalPosition != f))) {
            float fSignum = java.lang.Math.signum(this.mTransitionGoalPosition - f);
            long nanoTime2 = getNanoTime();
            android.view.animation.Interpolator interpolator3 = this.mInterpolator;
            float f2 = !(interpolator3 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator) ? (((nanoTime2 - this.mTransitionLastTime) * fSignum) * 1.0E-9f) / this.mTransitionDuration : 0.0f;
            float f3 = this.mTransitionLastPosition + f2;
            if (this.mTransitionInstantly) {
                f3 = this.mTransitionGoalPosition;
            }
            if ((fSignum <= 0.0f || f3 < this.mTransitionGoalPosition) && (fSignum > 0.0f || f3 > this.mTransitionGoalPosition)) {
                z = false;
            } else {
                f3 = this.mTransitionGoalPosition;
                this.mInTransition = false;
                z = true;
            }
            this.mTransitionLastPosition = f3;
            this.mTransitionPosition = f3;
            this.mTransitionLastTime = nanoTime2;
            if (interpolator3 != null && !z) {
                if (this.mTemporalInterpolator) {
                    float interpolation2 = interpolator3.getInterpolation((nanoTime2 - this.mAnimationStartTime) * 1.0E-9f);
                    android.view.animation.Interpolator interpolator4 = this.mInterpolator;
                    androidx.constraintlayout.motion.utils.StopLogic stopLogic = this.mStopLogic;
                    if (interpolator4 == stopLogic) {
                        c = stopLogic.isStopped() ? (char) 2 : (char) 1;
                    } else {
                        c = 0;
                    }
                    this.mTransitionLastPosition = interpolation2;
                    this.mTransitionLastTime = nanoTime2;
                    android.view.animation.Interpolator interpolator5 = this.mInterpolator;
                    if (interpolator5 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator) {
                        float velocity = ((androidx.constraintlayout.motion.widget.MotionInterpolator) interpolator5).getVelocity();
                        this.mLastVelocity = velocity;
                        if (java.lang.Math.abs(velocity) * this.mTransitionDuration <= EPSILON && c == 2) {
                            this.mInTransition = false;
                        }
                        if (velocity > 0.0f && interpolation2 >= 1.0f) {
                            this.mTransitionLastPosition = 1.0f;
                            this.mInTransition = false;
                            interpolation2 = 1.0f;
                        }
                        if (velocity >= 0.0f || interpolation2 > 0.0f) {
                            f3 = interpolation2;
                        } else {
                            this.mTransitionLastPosition = 0.0f;
                            this.mInTransition = false;
                            f3 = 0.0f;
                        }
                    } else {
                        f3 = interpolation2;
                    }
                } else {
                    float interpolation3 = interpolator3.getInterpolation(f3);
                    android.view.animation.Interpolator interpolator6 = this.mInterpolator;
                    if (interpolator6 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator) {
                        this.mLastVelocity = ((androidx.constraintlayout.motion.widget.MotionInterpolator) interpolator6).getVelocity();
                    } else {
                        this.mLastVelocity = ((interpolator6.getInterpolation(f3 + f2) - interpolation3) * fSignum) / f2;
                    }
                    f3 = interpolation3;
                }
                if (java.lang.Math.abs(this.mLastVelocity) > EPSILON) {
                    setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                }
                if (c != 1) {
                    if ((fSignum <= 0.0f && f3 >= this.mTransitionGoalPosition) || (fSignum <= 0.0f && f3 <= this.mTransitionGoalPosition)) {
                        f3 = this.mTransitionGoalPosition;
                        this.mInTransition = false;
                    }
                    if (f3 < 1.0f || f3 <= 0.0f) {
                        this.mInTransition = false;
                        setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.mKeepAnimating = false;
                nanoTime = getNanoTime();
                this.mPostInterpolationPosition = f3;
                interpolator = this.mProgressInterpolator;
                if (interpolator == null) {
                    interpolation = f3;
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                }
                interpolator2 = this.mProgressInterpolator;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.mTransitionDuration) + f3);
                    this.mLastVelocity = interpolation4;
                    this.mLastVelocity = interpolation4 - this.mProgressInterpolator.getInterpolation(f3);
                }
                for (i = 0; i < childCount; i++) {
                    childAt = getChildAt(i);
                    motionController = this.mFrameArrayList.get(childAt);
                    if (motionController != null) {
                        this.mKeepAnimating = motionController.interpolate(childAt, interpolation, nanoTime, this.mKeyCache) | this.mKeepAnimating;
                    }
                }
                boolean z4 = (fSignum <= 0.0f && f3 >= this.mTransitionGoalPosition) || (fSignum <= 0.0f && f3 <= this.mTransitionGoalPosition);
                if (!this.mKeepAnimating && !this.mInTransition && z4) {
                    setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                }
                if (this.mMeasureDuringTransition) {
                    requestLayout();
                }
                this.mKeepAnimating = (!z4) | this.mKeepAnimating;
                if (f3 <= 0.0f && (i4 = this.mBeginState) != -1 && this.mCurrentState != i4) {
                    this.mCurrentState = i4;
                    this.mScene.getConstraintSet(i4).applyCustomAttributes(this);
                    setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                    z3 = true;
                }
                if (f3 >= 1.0d) {
                    i2 = this.mCurrentState;
                    i3 = this.mEndState;
                    if (i2 != i3) {
                        this.mCurrentState = i3;
                        this.mScene.getConstraintSet(i3).applyCustomAttributes(this);
                        setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                        z3 = true;
                    }
                }
                if (!this.mKeepAnimating || this.mInTransition) {
                    invalidate();
                } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                    setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                }
                if (!this.mKeepAnimating && !this.mInTransition && ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f))) {
                    onNewStateAttachHandlers();
                }
            } else {
                this.mLastVelocity = f2;
            }
            c = 0;
            if (java.lang.Math.abs(this.mLastVelocity) > EPSILON) {
                setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
            }
            if (c != 1) {
                if (fSignum <= 0.0f) {
                    f3 = this.mTransitionGoalPosition;
                    this.mInTransition = false;
                } else {
                    f3 = this.mTransitionGoalPosition;
                    this.mInTransition = false;
                }
                if (f3 < 1.0f) {
                    this.mInTransition = false;
                    setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                } else {
                    this.mInTransition = false;
                    setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                }
            }
            childCount = getChildCount();
            this.mKeepAnimating = false;
            nanoTime = getNanoTime();
            this.mPostInterpolationPosition = f3;
            interpolator = this.mProgressInterpolator;
            if (interpolator == null) {
                interpolation = f3;
            } else {
                interpolation = interpolator.getInterpolation(f3);
            }
            interpolator2 = this.mProgressInterpolator;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.mTransitionDuration) + f3);
                this.mLastVelocity = interpolation5;
                this.mLastVelocity = interpolation5 - this.mProgressInterpolator.getInterpolation(f3);
            }
            while (i < childCount) {
                childAt = getChildAt(i);
                motionController = this.mFrameArrayList.get(childAt);
                if (motionController != null) {
                    this.mKeepAnimating = motionController.interpolate(childAt, interpolation, nanoTime, this.mKeyCache) | this.mKeepAnimating;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.mKeepAnimating) {
                setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
            }
            if (this.mMeasureDuringTransition) {
                requestLayout();
            }
            this.mKeepAnimating = (!z4) | this.mKeepAnimating;
            if (f3 <= 0.0f) {
                this.mCurrentState = i4;
                this.mScene.getConstraintSet(i4).applyCustomAttributes(this);
                setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                z3 = true;
            }
            if (f3 >= 1.0d) {
                i2 = this.mCurrentState;
                i3 = this.mEndState;
                if (i2 != i3) {
                    this.mCurrentState = i3;
                    this.mScene.getConstraintSet(i3).applyCustomAttributes(this);
                    setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                    z3 = true;
                }
            }
            if (this.mKeepAnimating) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.mKeepAnimating) {
                onNewStateAttachHandlers();
            }
        }
        float f4 = this.mTransitionLastPosition;
        if (f4 >= 1.0f) {
            int i5 = this.mCurrentState;
            int i6 = this.mEndState;
            z2 = i5 == i6 ? z3 : true;
            this.mCurrentState = i6;
        } else {
            if (f4 <= 0.0f) {
                int i7 = this.mCurrentState;
                int i8 = this.mBeginState;
                z2 = i7 == i8 ? z3 : true;
                this.mCurrentState = i8;
            }
            this.mNeedsFireTransitionCompleted |= z3;
            if (z3 && !this.mInLayout) {
                requestLayout();
            }
            this.mTransitionPosition = this.mTransitionLastPosition;
        }
        z3 = z2;
        this.mNeedsFireTransitionCompleted |= z3;
        if (z3) {
            requestLayout();
        }
        this.mTransitionPosition = this.mTransitionLastPosition;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(changed, left, top, right, bottom);
                return;
            }
            int i = right - left;
            int i2 = bottom - top;
            if (this.mLastLayoutWidth != i || this.mLastLayoutHeight != i2) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i;
            this.mLastLayoutHeight = i2;
            this.mOldWidth = i;
            this.mOldHeight = i2;
        } finally {
            this.mInLayout = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void parseLayoutDescription(int id) {
        this.mConstraintLayoutSpec = null;
    }

    private void init(android.util.AttributeSet attrs) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_layoutDescription) {
                    this.mScene = new androidx.constraintlayout.motion.widget.MotionScene(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_currentState) {
                    this.mCurrentState = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_motionProgress) {
                    this.mTransitionGoalPosition = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_applyMotionScene) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_showPaths) {
                    if (this.mDebugPath == 0) {
                        this.mDebugPath = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_motionDebug) {
                    this.mDebugPath = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.mScene == null) {
                android.util.Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState != -1 || (motionScene = this.mScene) == null) {
            return;
        }
        this.mCurrentState = motionScene.getStartId();
        this.mBeginState = this.mScene.getStartId();
        this.mEndState = this.mScene.getEndId();
    }

    public void setScene(androidx.constraintlayout.motion.widget.MotionScene scene) {
        this.mScene = scene;
        scene.setRtl(isRtl());
        rebuildScene();
    }

    public androidx.constraintlayout.motion.widget.MotionScene getScene() {
        return this.mScene;
    }

    private void checkStructure() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            android.util.Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int startId = motionScene.getStartId();
        androidx.constraintlayout.motion.widget.MotionScene motionScene2 = this.mScene;
        checkStructure(startId, motionScene2.getConstraintSet(motionScene2.getStartId()));
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        android.util.SparseIntArray sparseIntArray2 = new android.util.SparseIntArray();
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition : this.mScene.getDefinedTransitions()) {
            if (transition == this.mScene.mCurrentTransition) {
                android.util.Log.v(TAG, "CHECK: CURRENT");
            }
            checkStructure(transition);
            int startConstraintSetId = transition.getStartConstraintSetId();
            int endConstraintSetId = transition.getEndConstraintSetId();
            java.lang.String name = androidx.constraintlayout.motion.widget.Debug.getName(getContext(), startConstraintSetId);
            java.lang.String name2 = androidx.constraintlayout.motion.widget.Debug.getName(getContext(), endConstraintSetId);
            if (sparseIntArray.get(startConstraintSetId) == endConstraintSetId) {
                android.util.Log.e(TAG, "CHECK: two transitions with the same start and end " + name + "->" + name2);
            }
            if (sparseIntArray2.get(endConstraintSetId) == startConstraintSetId) {
                android.util.Log.e(TAG, "CHECK: you can't have reverse transitions" + name + "->" + name2);
            }
            sparseIntArray.put(startConstraintSetId, endConstraintSetId);
            sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
            if (this.mScene.getConstraintSet(startConstraintSetId) == null) {
                android.util.Log.e(TAG, " no such constraintSetStart " + name);
            }
            if (this.mScene.getConstraintSet(endConstraintSetId) == null) {
                android.util.Log.e(TAG, " no such constraintSetEnd " + name);
            }
        }
    }

    private void checkStructure(int csetId, androidx.constraintlayout.widget.ConstraintSet set) {
        java.lang.String name = androidx.constraintlayout.motion.widget.Debug.getName(getContext(), csetId);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            int id = childAt.getId();
            if (id == -1) {
                android.util.Log.w(TAG, "CHECK: " + name + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (set.getConstraint(id) == null) {
                android.util.Log.w(TAG, "CHECK: " + name + " NO CONSTRAINTS for " + androidx.constraintlayout.motion.widget.Debug.getName(childAt));
            }
        }
        int[] knownIds = set.getKnownIds();
        for (int i2 = 0; i2 < knownIds.length; i2++) {
            int i3 = knownIds[i2];
            java.lang.String name2 = androidx.constraintlayout.motion.widget.Debug.getName(getContext(), i3);
            if (findViewById(knownIds[i2]) == null) {
                android.util.Log.w(TAG, "CHECK: " + name + " NO View matches id " + name2);
            }
            if (set.getHeight(i3) == -1) {
                android.util.Log.w(TAG, "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
            if (set.getWidth(i3) == -1) {
                android.util.Log.w(TAG, "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void checkStructure(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        if (transition.getStartConstraintSetId() == transition.getEndConstraintSetId()) {
            android.util.Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public void setDebugMode(int debugMode) {
        this.mDebugPath = debugMode;
        invalidate();
    }

    public void getDebugMode(boolean showPaths) {
        this.mDebugPath = showPaths ? 2 : 1;
        invalidate();
    }

    private boolean callTransformedTouchEvent(android.view.View view, android.view.MotionEvent event, float offsetX, float offsetY) {
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            event.offsetLocation(offsetX, offsetY);
            boolean zOnTouchEvent = view.onTouchEvent(event);
            event.offsetLocation(-offsetX, -offsetY);
            return zOnTouchEvent;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(event);
        motionEventObtain.offsetLocation(offsetX, offsetY);
        if (this.mInverseMatrix == null) {
            this.mInverseMatrix = new android.graphics.Matrix();
        }
        matrix.invert(this.mInverseMatrix);
        motionEventObtain.transform(this.mInverseMatrix);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    private boolean handlesTouchEvent(float x, float y, android.view.View view, android.view.MotionEvent event) {
        boolean z;
        if (!(view instanceof android.view.ViewGroup)) {
            z = false;
            break;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z = false;
                break;
            }
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (handlesTouchEvent((childAt.getLeft() + x) - view.getScrollX(), (childAt.getTop() + y) - view.getScrollY(), childAt, event)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            this.mBoundsCheck.set(x, y, (view.getRight() + x) - view.getLeft(), (view.getBottom() + y) - view.getTop());
            if ((event.getAction() != 0 || this.mBoundsCheck.contains(event.getX(), event.getY())) && callTransformedTouchEvent(view, event, -x, -y)) {
                return true;
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        androidx.constraintlayout.motion.widget.TouchResponse touchResponse;
        int touchRegionId;
        android.graphics.RectF touchRegion;
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled) {
            if (motionScene.mViewTransitionController != null) {
                this.mScene.mViewTransitionController.touchEvent(event);
            }
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mScene.mCurrentTransition;
            if (transition != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((event.getAction() != 0 || (touchRegion = touchResponse.getTouchRegion(this, new android.graphics.RectF())) == null || touchRegion.contains(event.getX(), event.getY())) && (touchRegionId = touchResponse.getTouchRegionId()) != -1)) {
                android.view.View view = this.mRegionView;
                if (view == null || view.getId() != touchRegionId) {
                    this.mRegionView = findViewById(touchRegionId);
                }
                android.view.View view2 = this.mRegionView;
                if (view2 != null) {
                    this.mBoundsCheck.set(view2.getLeft(), this.mRegionView.getTop(), this.mRegionView.getRight(), this.mRegionView.getBottom());
                    if (this.mBoundsCheck.contains(event.getX(), event.getY()) && !handlesTouchEvent(this.mRegionView.getLeft(), this.mRegionView.getTop(), this.mRegionView, event)) {
                        return onTouchEvent(event);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled && motionScene.supportTouch()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mScene.mCurrentTransition;
            if (transition != null && !transition.isEnabled()) {
                return super.onTouchEvent(event);
            }
            this.mScene.processTouchEvent(event, getCurrentState(), this);
            if (this.mScene.mCurrentTransition.isTransitionFlag(4)) {
                return this.mScene.mCurrentTransition.getTouchResponse().isDragStarted();
            }
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        android.view.Display display = getDisplay();
        if (display != null) {
            this.mPreviouseRotation = display.getRotation();
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null && (i = this.mCurrentState) != -1) {
            androidx.constraintlayout.widget.ConstraintSet constraintSet = motionScene.getConstraintSet(i);
            this.mScene.readFallback(this);
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.mDecoratorsHelpers;
            if (arrayList != null) {
                java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onFinishedMotionScene(this);
                }
            }
            if (constraintSet != null) {
                constraintSet.applyTo(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        androidx.constraintlayout.motion.widget.MotionLayout.StateCache stateCache = this.mStateCache;
        if (stateCache != null) {
            if (this.mDelayedApply) {
                post(new java.lang.Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.4
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx.constraintlayout.motion.widget.MotionLayout.this.mStateCache.apply();
                    }
                });
                return;
            } else {
                stateCache.apply();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene2 = this.mScene;
        if (motionScene2 == null || motionScene2.mCurrentTransition == null || this.mScene.mCurrentTransition.getAutoTransition() != 4) {
            return;
        }
        transitionToEnd();
        setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
        setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    void onNewStateAttachHandlers() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        if (motionScene.autoTransition(this, this.mCurrentState)) {
            requestLayout();
            return;
        }
        int i = this.mCurrentState;
        if (i != -1) {
            this.mScene.addOnClickListeners(this, i);
        }
        if (this.mScene.supportTouch()) {
            this.mScene.setupTouch();
        }
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    void getAnchorDpDt(int mTouchAnchorId, float pos, float locationX, float locationY, float[] mAnchorDpDt) {
        java.lang.String resourceName;
        java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> map = this.mFrameArrayList;
        android.view.View viewById = getViewById(mTouchAnchorId);
        androidx.constraintlayout.motion.widget.MotionController motionController = map.get(viewById);
        if (motionController != null) {
            motionController.getDpDt(pos, locationX, locationY, mAnchorDpDt);
            float y = viewById.getY();
            this.lastPos = pos;
            this.lastY = y;
            return;
        }
        if (viewById == null) {
            resourceName = "" + mTouchAnchorId;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(mTouchAnchorId);
        }
        android.util.Log.w(TAG, "WARNING could not find view id " + resourceName);
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mTransitionDuration = motionScene.getDuration() / 1000.0f;
        }
        return (long) (this.mTransitionDuration * 1000.0f);
    }

    public void setTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener listener) {
        this.mTransitionListener = listener;
    }

    public void addTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener listener) {
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        }
        this.mTransitionListeners.add(listener);
    }

    public boolean removeTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener listener) {
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(listener);
    }

    public void fireTrigger(int triggerId, boolean positive, float progress) {
        androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, triggerId, positive, progress);
        }
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, triggerId, positive, progress);
            }
        }
    }

    private void fireTransitionChange() {
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList;
        if ((this.mTransitionListener == null && ((copyOnWriteArrayList = this.mTransitionListeners) == null || copyOnWriteArrayList.isEmpty())) || this.mListenerPosition == this.mTransitionPosition) {
            return;
        }
        if (this.mListenerState != -1) {
            androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener = this.mTransitionListener;
            if (transitionListener != null) {
                transitionListener.onTransitionStarted(this, this.mBeginState, this.mEndState);
            }
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
            if (copyOnWriteArrayList2 != null) {
                java.util.Iterator<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
                }
            }
            this.mIsAnimating = true;
        }
        this.mListenerState = -1;
        float f = this.mTransitionPosition;
        this.mListenerPosition = f;
        androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener2 = this.mTransitionListener;
        if (transitionListener2 != null) {
            transitionListener2.onTransitionChange(this, this.mBeginState, this.mEndState, f);
        }
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList3 = this.mTransitionListeners;
        if (copyOnWriteArrayList3 != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
            }
        }
        this.mIsAnimating = true;
    }

    protected void fireTransitionCompleted() {
        int iIntValue;
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList;
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (this.mTransitionCompleted.isEmpty()) {
                iIntValue = -1;
            } else {
                java.util.ArrayList<java.lang.Integer> arrayList = this.mTransitionCompleted;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i = this.mCurrentState;
            if (iIntValue != i && i != -1) {
                this.mTransitionCompleted.add(java.lang.Integer.valueOf(i));
            }
        }
        processTransitionCompleted();
        java.lang.Runnable runnable = this.mOnComplete;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr == null || this.mScheduledTransitions <= 0) {
            return;
        }
        transitionToState(iArr[0]);
        int[] iArr2 = this.mScheduledTransitionTo;
        java.lang.System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.mScheduledTransitions--;
    }

    private void processTransitionCompleted() {
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList;
        if (this.mTransitionListener == null && ((copyOnWriteArrayList = this.mTransitionListeners) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.mIsAnimating = false;
        for (java.lang.Integer num : this.mTransitionCompleted) {
            androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener = this.mTransitionListener;
            if (transitionListener != null) {
                transitionListener.onTransitionCompleted(this, num.intValue());
            }
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
            if (copyOnWriteArrayList2 != null) {
                java.util.Iterator<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().onTransitionCompleted(this, num.intValue());
                }
            }
        }
        this.mTransitionCompleted.clear();
    }

    public androidx.constraintlayout.motion.widget.DesignTool getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new androidx.constraintlayout.motion.widget.DesignTool(this);
        }
        return this.mDesignTool;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (view instanceof androidx.constraintlayout.motion.widget.MotionHelper) {
            androidx.constraintlayout.motion.widget.MotionHelper motionHelper = (androidx.constraintlayout.motion.widget.MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new java.util.ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new java.util.ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.mDecoratorsHelpers == null) {
                    this.mDecoratorsHelpers = new java.util.ArrayList<>();
                }
                this.mDecoratorsHelpers.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void setOnShow(float progress) {
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnShowHelpers.get(i).setProgress(progress);
            }
        }
    }

    public void setOnHide(float progress) {
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnHideHelpers.get(i).setProgress(progress);
            }
        }
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int id) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSet(id);
    }

    public androidx.constraintlayout.widget.ConstraintSet cloneConstraintSet(int id) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet = motionScene.getConstraintSet(id);
        androidx.constraintlayout.widget.ConstraintSet constraintSet2 = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet2.clone(constraintSet);
        return constraintSet2;
    }

    @java.lang.Deprecated
    public void rebuildMotion() {
        android.util.Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.reEvaluateState();
        invalidate();
    }

    public void updateState(int stateId, androidx.constraintlayout.widget.ConstraintSet set) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setConstraintSet(stateId, set);
        }
        updateState();
        if (this.mCurrentState == stateId) {
            set.applyTo(this);
        }
    }

    public void updateStateAnimate(int stateId, androidx.constraintlayout.widget.ConstraintSet set, int duration) {
        if (this.mScene != null && this.mCurrentState == stateId) {
            updateState(androidx.constraintlayout.widget.R.id.view_transition, getConstraintSet(stateId));
            setState(androidx.constraintlayout.widget.R.id.view_transition, -1, -1);
            updateState(stateId, set);
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = new androidx.constraintlayout.motion.widget.MotionScene.Transition(-1, this.mScene, androidx.constraintlayout.widget.R.id.view_transition, stateId);
            transition.setDuration(duration);
            setTransition(transition);
            transitionToEnd();
        }
    }

    public void scheduleTransitionTo(int id) {
        if (getCurrentState() == -1) {
            transitionToState(id);
            return;
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr == null) {
            this.mScheduledTransitionTo = new int[4];
        } else if (iArr.length <= this.mScheduledTransitions) {
            this.mScheduledTransitionTo = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mScheduledTransitionTo;
        int i = this.mScheduledTransitions;
        this.mScheduledTransitions = i + 1;
        iArr2[i] = id;
    }

    public void updateState() {
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        rebuildScene();
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public int getEndState() {
        return this.mEndState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public void setTransitionDuration(int milliseconds) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            android.util.Log.e(TAG, "MotionScene not defined");
        } else {
            motionScene.setDuration(milliseconds);
        }
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition getTransition(int id) {
        return this.mScene.getTransitionById(id);
    }

    int lookUpConstraintId(java.lang.String id) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return 0;
        }
        return motionScene.lookUpConstraintId(id);
    }

    java.lang.String getConstraintSetNames(int id) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.lookUpConstraintName(id);
    }

    void disableAutoTransition(boolean disable) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        motionScene.disableAutoTransition(disable);
    }

    public void setInteractionEnabled(boolean enabled) {
        this.mInteractionEnabled = enabled;
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    private void fireTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int mBeginState, int mEndState) {
        androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionStarted(this, mBeginState, mEndState);
        }
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(motionLayout, mBeginState, mEndState);
            }
        }
    }

    public void viewTransition(int viewTransitionId, android.view.View... view) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.viewTransition(viewTransitionId, view);
        } else {
            android.util.Log.e(TAG, " no motionScene");
        }
    }

    public void enableViewTransition(int viewTransitionId, boolean enable) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.enableViewTransition(viewTransitionId, enable);
        }
    }

    public boolean isViewTransitionEnabled(int viewTransitionId) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            return motionScene.isViewTransitionEnabled(viewTransitionId);
        }
        return false;
    }

    public boolean applyViewTransition(int viewTransitionId, androidx.constraintlayout.motion.widget.MotionController motionController) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            return motionScene.applyViewTransition(viewTransitionId, motionController);
        }
        return false;
    }

    public boolean isDelayedApplicationOfInitialState() {
        return this.mDelayedApply;
    }

    public void setDelayedApplicationOfInitialState(boolean delayedApply) {
        this.mDelayedApply = delayedApply;
    }
}
