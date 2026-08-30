package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class MotionScene {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    private static final java.lang.String CONSTRAINTSET_TAG = "ConstraintSet";
    private static final boolean DEBUG = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final java.lang.String INCLUDE_TAG = "include";
    private static final java.lang.String INCLUDE_TAG_UC = "Include";
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final java.lang.String KEYFRAMESET_TAG = "KeyFrameSet";
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    static final int LINEAR = 3;
    private static final int MIN_DURATION = 8;
    private static final java.lang.String MOTIONSCENE_TAG = "MotionScene";
    private static final java.lang.String ONCLICK_TAG = "OnClick";
    private static final java.lang.String ONSWIPE_TAG = "OnSwipe";
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static final java.lang.String STATESET_TAG = "StateSet";
    private static final java.lang.String TAG = "MotionScene";
    static final int TRANSITION_BACKWARD = 0;
    static final int TRANSITION_FORWARD = 1;
    private static final java.lang.String TRANSITION_TAG = "Transition";
    public static final int UNSET = -1;
    private static final java.lang.String VIEW_TRANSITION = "ViewTransition";
    private android.view.MotionEvent mLastTouchDown;
    float mLastTouchX;
    float mLastTouchY;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private boolean mRtl;
    private androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker mVelocityTracker;
    final androidx.constraintlayout.motion.widget.ViewTransitionController mViewTransitionController;
    androidx.constraintlayout.widget.StateSet mStateSet = null;
    androidx.constraintlayout.motion.widget.MotionScene.Transition mCurrentTransition = null;
    private boolean mDisableAutoTransition = false;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> mTransitionList = new java.util.ArrayList<>();
    private androidx.constraintlayout.motion.widget.MotionScene.Transition mDefaultTransition = null;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> mAbstractTransitionList = new java.util.ArrayList<>();
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap = new android.util.SparseArray<>();
    private java.util.HashMap<java.lang.String, java.lang.Integer> mConstraintSetIdMap = new java.util.HashMap<>();
    private android.util.SparseIntArray mDeriveMap = new android.util.SparseIntArray();
    private boolean DEBUG_DESKTOP = false;
    private int mDefaultDuration = 400;
    private int mLayoutDuringTransition = 0;
    private boolean mIgnoreTouch = false;
    private boolean mMotionOutsideRegion = false;

    public float getPathPercent(android.view.View view, int position) {
        return 0.0f;
    }

    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0073 A[SYNTHETIC] */
    void setTransition(int beginId, int endId) {
        int iStateGetConstraintID;
        int iStateGetConstraintID2;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition;
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition2;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition3;
        androidx.constraintlayout.motion.widget.MotionScene.Transition next;
        androidx.constraintlayout.widget.StateSet stateSet = this.mStateSet;
        if (stateSet != null) {
            iStateGetConstraintID = stateSet.stateGetConstraintID(beginId, -1, -1);
            if (iStateGetConstraintID == -1) {
                iStateGetConstraintID = beginId;
            }
            iStateGetConstraintID2 = this.mStateSet.stateGetConstraintID(endId, -1, -1);
            if (iStateGetConstraintID2 == -1) {
            }
            transition = this.mCurrentTransition;
            if (transition == null && transition.mConstraintSetEnd == endId && this.mCurrentTransition.mConstraintSetStart == beginId) {
                return;
            }
            it = this.mTransitionList.iterator();
            while (true) {
                if (it.hasNext()) {
                    transition2 = this.mDefaultTransition;
                    for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition4 : this.mAbstractTransitionList) {
                        if (transition4.mConstraintSetEnd == endId) {
                            transition2 = transition4;
                        }
                    }
                    transition3 = new androidx.constraintlayout.motion.widget.MotionScene.Transition(this, transition2);
                    transition3.mConstraintSetStart = iStateGetConstraintID;
                    transition3.mConstraintSetEnd = iStateGetConstraintID2;
                    if (iStateGetConstraintID != -1) {
                        this.mTransitionList.add(transition3);
                    }
                    this.mCurrentTransition = transition3;
                    return;
                }
                next = it.next();
                if ((next.mConstraintSetEnd != iStateGetConstraintID2 && next.mConstraintSetStart == iStateGetConstraintID) || (next.mConstraintSetEnd == endId && next.mConstraintSetStart == beginId)) {
                    break;
                }
            }
            this.mCurrentTransition = next;
            if (next != null || next.mTouchResponse == null) {
            }
            this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
            return;
        }
        iStateGetConstraintID = beginId;
        iStateGetConstraintID2 = endId;
        transition = this.mCurrentTransition;
        if (transition == null) {
        }
        it = this.mTransitionList.iterator();
        while (true) {
            if (it.hasNext()) {
                transition2 = this.mDefaultTransition;
                while (r3.hasNext()) {
                    if (transition4.mConstraintSetEnd == endId) {
                        transition2 = transition4;
                    }
                }
                transition3 = new androidx.constraintlayout.motion.widget.MotionScene.Transition(this, transition2);
                transition3.mConstraintSetStart = iStateGetConstraintID;
                transition3.mConstraintSetEnd = iStateGetConstraintID2;
                if (iStateGetConstraintID != -1) {
                    this.mTransitionList.add(transition3);
                }
                this.mCurrentTransition = transition3;
                return;
            }
            next = it.next();
            if (next.mConstraintSetEnd != iStateGetConstraintID2) {
            }
        }
        this.mCurrentTransition = next;
        if (next != null) {
        }
    }

    public void addTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        int index = getIndex(transition);
        if (index == -1) {
            this.mTransitionList.add(transition);
        } else {
            this.mTransitionList.set(index, transition);
        }
    }

    public void removeTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        int index = getIndex(transition);
        if (index != -1) {
            this.mTransitionList.remove(index);
        }
    }

    private int getIndex(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        int i = transition.mId;
        if (i == -1) {
            throw new java.lang.IllegalArgumentException("The transition must have an id");
        }
        for (int i2 = 0; i2 < this.mTransitionList.size(); i2++) {
            if (this.mTransitionList.get(i2).mId == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean validateLayout(androidx.constraintlayout.motion.widget.MotionLayout layout) {
        return layout == this.mMotionLayout && layout.mScene == this;
    }

    public void setTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        this.mCurrentTransition = transition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }

    private int getRealID(int stateId) {
        int iStateGetConstraintID;
        androidx.constraintlayout.widget.StateSet stateSet = this.mStateSet;
        return (stateSet == null || (iStateGetConstraintID = stateSet.stateGetConstraintID(stateId, -1, -1)) == -1) ? stateId : iStateGetConstraintID;
    }

    public java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition> getTransitionsWithState(int stateId) {
        int realID = getRealID(stateId);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition : this.mTransitionList) {
            if (transition.mConstraintSetStart == realID || transition.mConstraintSetEnd == realID) {
                arrayList.add(transition);
            }
        }
        return arrayList;
    }

    public void addOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int currentState) {
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition : this.mTransitionList) {
            if (transition.mOnClicks.size() > 0) {
                java.util.Iterator it = transition.mOnClicks.iterator();
                while (it.hasNext()) {
                    ((androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) it.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 : this.mAbstractTransitionList) {
            if (transition2.mOnClicks.size() > 0) {
                java.util.Iterator it2 = transition2.mOnClicks.iterator();
                while (it2.hasNext()) {
                    ((androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) it2.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 : this.mTransitionList) {
            if (transition3.mOnClicks.size() > 0) {
                java.util.Iterator it3 = transition3.mOnClicks.iterator();
                while (it3.hasNext()) {
                    ((androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) it3.next()).addOnClickListeners(motionLayout, currentState, transition3);
                }
            }
        }
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition4 : this.mAbstractTransitionList) {
            if (transition4.mOnClicks.size() > 0) {
                java.util.Iterator it4 = transition4.mOnClicks.iterator();
                while (it4.hasNext()) {
                    ((androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) it4.next()).addOnClickListeners(motionLayout, currentState, transition4);
                }
            }
        }
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition bestTransitionFor(int currentState, float dx, float dy, android.view.MotionEvent lastTouchDown) {
        if (currentState != -1) {
            java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition> transitionsWithState = getTransitionsWithState(currentState);
            android.graphics.RectF rectF = new android.graphics.RectF();
            float f = 0.0f;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = null;
            for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 : transitionsWithState) {
                if (!transition2.mDisable && transition2.mTouchResponse != null) {
                    transition2.mTouchResponse.setRTL(this.mRtl);
                    android.graphics.RectF touchRegion = transition2.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion == null || lastTouchDown == null || touchRegion.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                        android.graphics.RectF limitBoundsTo = transition2.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                        if (limitBoundsTo == null || lastTouchDown == null || limitBoundsTo.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                            float fDot = transition2.mTouchResponse.dot(dx, dy);
                            if (transition2.mTouchResponse.mIsRotateMode && lastTouchDown != null) {
                                float x = lastTouchDown.getX() - transition2.mTouchResponse.mRotateCenterX;
                                float y = lastTouchDown.getY() - transition2.mTouchResponse.mRotateCenterY;
                                fDot = ((float) (java.lang.Math.atan2(dy + y, dx + x) - java.lang.Math.atan2(x, y))) * 10.0f;
                            }
                            float f2 = fDot * (transition2.mConstraintSetEnd == currentState ? -1.0f : 1.1f);
                            if (f2 > f) {
                                transition = transition2;
                                f = f2;
                            }
                        }
                    }
                }
            }
            return transition;
        }
        return this.mCurrentTransition;
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> getDefinedTransitions() {
        return this.mTransitionList;
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition getTransitionById(int id) {
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition : this.mTransitionList) {
            if (transition.mId == id) {
                return transition;
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.mConstraintSetMap.keyAt(i);
        }
        return iArr;
    }

    boolean autoTransition(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int currentState) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition;
        if (isProcessingTouch() || this.mDisableAutoTransition) {
            return false;
        }
        for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 : this.mTransitionList) {
            if (transition2.mAutoTransition != 0 && ((transition = this.mCurrentTransition) != transition2 || !transition.isTransitionFlag(2))) {
                if (currentState == transition2.mConstraintSetStart && (transition2.mAutoTransition == 4 || transition2.mAutoTransition == 2)) {
                    motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(transition2);
                    if (transition2.mAutoTransition == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
                if (currentState == transition2.mConstraintSetEnd && (transition2.mAutoTransition == 3 || transition2.mAutoTransition == 1)) {
                    motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(transition2);
                    if (transition2.mAutoTransition == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isProcessingTouch() {
        return this.mVelocityTracker != null;
    }

    public void setRtl(boolean rtl) {
        this.mRtl = rtl;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }

    public void viewTransition(int id, android.view.View... view) {
        this.mViewTransitionController.viewTransition(id, view);
    }

    public void enableViewTransition(int id, boolean enable) {
        this.mViewTransitionController.enableViewTransition(id, enable);
    }

    public boolean isViewTransitionEnabled(int id) {
        return this.mViewTransitionController.isViewTransitionEnabled(id);
    }

    public boolean applyViewTransition(int viewTransitionId, androidx.constraintlayout.motion.widget.MotionController motionController) {
        return this.mViewTransitionController.applyViewTransition(viewTransitionId, motionController);
    }

    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;
        static final int TRANSITION_FLAG_FIRST_DRAW = 1;
        static final int TRANSITION_FLAG_INTERCEPT_TOUCH = 4;
        static final int TRANSITION_FLAG_INTRA_AUTO = 2;
        private int mAutoTransition;
        private int mConstraintSetEnd;
        private int mConstraintSetStart;
        private int mDefaultInterpolator;
        private int mDefaultInterpolatorID;
        private java.lang.String mDefaultInterpolatorString;
        private boolean mDisable;
        private int mDuration;
        private int mId;
        private boolean mIsAbstract;
        private java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> mKeyFramesList;
        private int mLayoutDuringTransition;
        private final androidx.constraintlayout.motion.widget.MotionScene mMotionScene;
        private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> mOnClicks;
        private int mPathMotionArc;
        private float mStagger;
        private androidx.constraintlayout.motion.widget.TouchResponse mTouchResponse;
        private int mTransitionFlags;

        public void setOnSwipe(androidx.constraintlayout.motion.widget.OnSwipe onSwipe) {
            this.mTouchResponse = onSwipe == null ? null : new androidx.constraintlayout.motion.widget.TouchResponse(this.mMotionScene.mMotionLayout, onSwipe);
        }

        public void addOnClick(int id, int action) {
            for (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick transitionOnClick : this.mOnClicks) {
                if (transitionOnClick.mTargetId == id) {
                    transitionOnClick.mMode = action;
                    return;
                }
            }
            this.mOnClicks.add(new androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick(this, id, action));
        }

        public void removeOnClick(int id) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick next;
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> it = this.mOnClicks.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.mTargetId != id);
            if (next != null) {
                this.mOnClicks.remove(next);
            }
        }

        public int getLayoutDuringTransition() {
            return this.mLayoutDuringTransition;
        }

        public void setLayoutDuringTransition(int mode) {
            this.mLayoutDuringTransition = mode;
        }

        public void addOnClick(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
            this.mOnClicks.add(new androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick(context, this, parser));
        }

        public void setAutoTransition(int type) {
            this.mAutoTransition = type;
        }

        public int getAutoTransition() {
            return this.mAutoTransition;
        }

        public int getId() {
            return this.mId;
        }

        public int getEndConstraintSetId() {
            return this.mConstraintSetEnd;
        }

        public int getStartConstraintSetId() {
            return this.mConstraintSetStart;
        }

        public void setDuration(int duration) {
            this.mDuration = java.lang.Math.max(duration, 8);
        }

        public int getDuration() {
            return this.mDuration;
        }

        public float getStagger() {
            return this.mStagger;
        }

        public java.util.List<androidx.constraintlayout.motion.widget.KeyFrames> getKeyFrameList() {
            return this.mKeyFramesList;
        }

        public void addKeyFrame(androidx.constraintlayout.motion.widget.KeyFrames keyFrames) {
            this.mKeyFramesList.add(keyFrames);
        }

        public java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> getOnClickList() {
            return this.mOnClicks;
        }

        public androidx.constraintlayout.motion.widget.TouchResponse getTouchResponse() {
            return this.mTouchResponse;
        }

        public void setStagger(float stagger) {
            this.mStagger = stagger;
        }

        public void setPathMotionArc(int arcMode) {
            this.mPathMotionArc = arcMode;
        }

        public int getPathMotionArc() {
            return this.mPathMotionArc;
        }

        public boolean isEnabled() {
            return !this.mDisable;
        }

        public void setEnable(boolean enable) {
            setEnabled(enable);
        }

        public void setEnabled(boolean enable) {
            this.mDisable = !enable;
        }

        public java.lang.String debugString(android.content.Context context) {
            java.lang.String resourceEntryName = this.mConstraintSetStart == -1 ? "null" : context.getResources().getResourceEntryName(this.mConstraintSetStart);
            if (this.mConstraintSetEnd == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.mConstraintSetEnd);
        }

        public boolean isTransitionFlag(int flag) {
            return (flag & this.mTransitionFlags) != 0;
        }

        public void setTransitionFlag(int flag) {
            this.mTransitionFlags = flag;
        }

        public void setOnTouchUp(int touchUpMode) {
            androidx.constraintlayout.motion.widget.TouchResponse touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.setTouchUpMode(touchUpMode);
            }
        }

        public static class TransitionOnClick implements android.view.View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            int mMode;
            int mTargetId;
            private final androidx.constraintlayout.motion.widget.MotionScene.Transition mTransition;

            public TransitionOnClick(android.content.Context context, androidx.constraintlayout.motion.widget.MotionScene.Transition transition, org.xmlpull.v1.XmlPullParser parser) {
                this.mTargetId = -1;
                this.mMode = 17;
                this.mTransition = transition;
                android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(parser), androidx.constraintlayout.widget.R.styleable.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == androidx.constraintlayout.widget.R.styleable.OnClick_targetId) {
                        this.mTargetId = typedArrayObtainStyledAttributes.getResourceId(index, this.mTargetId);
                    } else if (index == androidx.constraintlayout.widget.R.styleable.OnClick_clickAction) {
                        this.mMode = typedArrayObtainStyledAttributes.getInt(index, this.mMode);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public TransitionOnClick(androidx.constraintlayout.motion.widget.MotionScene.Transition transition, int id, int action) {
                this.mTransition = transition;
                this.mTargetId = id;
                this.mMode = action;
            }

            public void addOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
                boolean z;
                android.view.View viewFindViewById;
                int i2 = this.mTargetId;
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout2 = motionLayout;
                if (i2 != -1) {
                    viewFindViewById = motionLayout.findViewById(i2);
                }
                if (motionLayout2 != null) {
                    int i3 = transition.mConstraintSetStart;
                    int i4 = transition.mConstraintSetEnd;
                    if (i3 == -1) {
                        motionLayout2 = viewFindViewById;
                        motionLayout2.setOnClickListener(this);
                        return;
                    }
                    int i5 = this.mMode;
                    boolean z2 = false;
                    if ((i5 & 1) == 0 || i != i3) {
                        motionLayout2 = viewFindViewById;
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z3 = ((i5 & 1) != 0 && i == i3) | z | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                    if ((i5 & 4096) != 0 && i == i4) {
                        z2 = true;
                    }
                    if (z3 || z2) {
                        motionLayout2.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                motionLayout2 = viewFindViewById;
                android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.NAME, "OnClick could not find id " + this.mTargetId);
            }

            public void removeOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
                int i = this.mTargetId;
                if (i == -1) {
                    return;
                }
                android.view.View viewFindViewById = motionLayout.findViewById(i);
                if (viewFindViewById == null) {
                    android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.NAME, " (*)  could not find id " + this.mTargetId);
                } else {
                    viewFindViewById.setOnClickListener(null);
                }
            }

            boolean isTransitionViable(androidx.constraintlayout.motion.widget.MotionScene.Transition current, androidx.constraintlayout.motion.widget.MotionLayout tl) {
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mTransition;
                if (transition == current) {
                    return true;
                }
                int i = transition.mConstraintSetEnd;
                int i2 = this.mTransition.mConstraintSetStart;
                if (i2 == -1) {
                    return tl.mCurrentState != i;
                }
                return tl.mCurrentState == i2 || tl.mCurrentState == i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout = this.mTransition.mMotionScene.mMotionLayout;
                if (motionLayout.isInteractionEnabled()) {
                    if (this.mTransition.mConstraintSetStart != -1) {
                        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mTransition.mMotionScene.mCurrentTransition;
                        int i = this.mMode;
                        boolean z = false;
                        boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                        boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                        if (z2 && z3) {
                            androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.mTransition.mMotionScene.mCurrentTransition;
                            androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = this.mTransition;
                            if (transition2 != transition3) {
                                motionLayout.setTransition(transition3);
                            }
                            if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                                z3 = false;
                                z = z2;
                            }
                        } else {
                            z = z2;
                        }
                        if (isTransitionViable(transition, motionLayout)) {
                            if (z && (this.mMode & 1) != 0) {
                                motionLayout.setTransition(this.mTransition);
                                motionLayout.transitionToEnd();
                                return;
                            }
                            if (z3 && (this.mMode & 16) != 0) {
                                motionLayout.setTransition(this.mTransition);
                                motionLayout.transitionToStart();
                                return;
                            } else if (z && (this.mMode & 256) != 0) {
                                motionLayout.setTransition(this.mTransition);
                                motionLayout.setProgress(1.0f);
                                return;
                            } else {
                                if (!z3 || (this.mMode & 4096) == 0) {
                                    return;
                                }
                                motionLayout.setTransition(this.mTransition);
                                motionLayout.setProgress(0.0f);
                                return;
                            }
                        }
                        return;
                    }
                    int currentState = motionLayout.getCurrentState();
                    if (currentState == -1) {
                        motionLayout.transitionToState(this.mTransition.mConstraintSetEnd);
                        return;
                    }
                    androidx.constraintlayout.motion.widget.MotionScene.Transition transition4 = new androidx.constraintlayout.motion.widget.MotionScene.Transition(this.mTransition.mMotionScene, this.mTransition);
                    transition4.mConstraintSetStart = currentState;
                    transition4.mConstraintSetEnd = this.mTransition.mConstraintSetEnd;
                    motionLayout.setTransition(transition4);
                    motionLayout.transitionToEnd();
                }
            }
        }

        Transition(androidx.constraintlayout.motion.widget.MotionScene motionScene, androidx.constraintlayout.motion.widget.MotionScene.Transition global) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new java.util.ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new java.util.ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mMotionScene = motionScene;
            this.mDuration = motionScene.mDefaultDuration;
            if (global != null) {
                this.mPathMotionArc = global.mPathMotionArc;
                this.mDefaultInterpolator = global.mDefaultInterpolator;
                this.mDefaultInterpolatorString = global.mDefaultInterpolatorString;
                this.mDefaultInterpolatorID = global.mDefaultInterpolatorID;
                this.mDuration = global.mDuration;
                this.mKeyFramesList = global.mKeyFramesList;
                this.mStagger = global.mStagger;
                this.mLayoutDuringTransition = global.mLayoutDuringTransition;
            }
        }

        public Transition(int id, androidx.constraintlayout.motion.widget.MotionScene motionScene, int constraintSetStartId, int constraintSetEndId) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new java.util.ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new java.util.ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mId = id;
            this.mMotionScene = motionScene;
            this.mConstraintSetStart = constraintSetStartId;
            this.mConstraintSetEnd = constraintSetEndId;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
        }

        Transition(androidx.constraintlayout.motion.widget.MotionScene motionScene, android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new java.util.ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new java.util.ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
            this.mMotionScene = motionScene;
            fillFromAttributeList(motionScene, context, android.util.Xml.asAttributeSet(parser));
        }

        public void setInterpolatorInfo(int interpolator, java.lang.String interpolatorString, int interpolatorID) {
            this.mDefaultInterpolator = interpolator;
            this.mDefaultInterpolatorString = interpolatorString;
            this.mDefaultInterpolatorID = interpolatorID;
        }

        private void fillFromAttributeList(androidx.constraintlayout.motion.widget.MotionScene motionScene, android.content.Context context, android.util.AttributeSet attrs) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.Transition);
            fill(motionScene, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        private void fill(androidx.constraintlayout.motion.widget.MotionScene motionScene, android.content.Context context, android.content.res.TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a2.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Transition_constraintSetEnd) {
                    this.mConstraintSetEnd = a2.getResourceId(index, -1);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintSetEnd);
                    if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        constraintSet.load(context, this.mConstraintSetEnd);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetEnd, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.mConstraintSetEnd = motionScene.parseInclude(context, this.mConstraintSetEnd);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_constraintSetStart) {
                    this.mConstraintSetStart = a2.getResourceId(index, this.mConstraintSetStart);
                    java.lang.String resourceTypeName2 = context.getResources().getResourceTypeName(this.mConstraintSetStart);
                    if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT.equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet2 = new androidx.constraintlayout.widget.ConstraintSet();
                        constraintSet2.load(context, this.mConstraintSetStart);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetStart, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.mConstraintSetStart = motionScene.parseInclude(context, this.mConstraintSetStart);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_motionInterpolator) {
                    android.util.TypedValue typedValuePeekValue = a2.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        int resourceId = a2.getResourceId(index, -1);
                        this.mDefaultInterpolatorID = resourceId;
                        if (resourceId != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        java.lang.String string = a2.getString(index);
                        this.mDefaultInterpolatorString = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.mDefaultInterpolatorID = a2.getResourceId(index, -1);
                                this.mDefaultInterpolator = -2;
                            } else {
                                this.mDefaultInterpolator = -1;
                            }
                        }
                    } else {
                        this.mDefaultInterpolator = a2.getInteger(index, this.mDefaultInterpolator);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_duration) {
                    int i2 = a2.getInt(index, this.mDuration);
                    this.mDuration = i2;
                    if (i2 < 8) {
                        this.mDuration = 8;
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_staggered) {
                    this.mStagger = a2.getFloat(index, this.mStagger);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_autoTransition) {
                    this.mAutoTransition = a2.getInteger(index, this.mAutoTransition);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_android_id) {
                    this.mId = a2.getResourceId(index, this.mId);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_transitionDisable) {
                    this.mDisable = a2.getBoolean(index, this.mDisable);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_pathMotionArc) {
                    this.mPathMotionArc = a2.getInteger(index, -1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_layoutDuringTransition) {
                    this.mLayoutDuringTransition = a2.getInteger(index, 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_transitionFlags) {
                    this.mTransitionFlags = a2.getInteger(index, 0);
                }
            }
            if (this.mConstraintSetStart == -1) {
                this.mIsAbstract = true;
            }
        }
    }

    public MotionScene(androidx.constraintlayout.motion.widget.MotionLayout layout) {
        this.mMotionLayout = layout;
        this.mViewTransitionController = new androidx.constraintlayout.motion.widget.ViewTransitionController(layout);
    }

    MotionScene(android.content.Context context, androidx.constraintlayout.motion.widget.MotionLayout layout, int resourceID) {
        this.mMotionLayout = layout;
        this.mViewTransitionController = new androidx.constraintlayout.motion.widget.ViewTransitionController(layout);
        load(context, resourceID);
        this.mConstraintSetMap.put(androidx.constraintlayout.widget.R.id.motion_base, new androidx.constraintlayout.widget.ConstraintSet());
        this.mConstraintSetIdMap.put("motion_base", java.lang.Integer.valueOf(androidx.constraintlayout.widget.R.id.motion_base));
    }

    private void load(android.content.Context context, int resourceId) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            int eventType = xml.getEventType();
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = null;
            while (true) {
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    if (this.DEBUG_DESKTOP) {
                        java.lang.System.out.println("parsing = " + name);
                    }
                    switch (name) {
                        case "MotionScene":
                            parseMotionSceneTags(context, xml);
                            break;
                        case "Transition":
                            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> arrayList = this.mTransitionList;
                            transition = new androidx.constraintlayout.motion.widget.MotionScene.Transition(this, context, xml);
                            arrayList.add(transition);
                            if (this.mCurrentTransition == null && !transition.mIsAbstract) {
                                this.mCurrentTransition = transition;
                                if (transition.mTouchResponse != null) {
                                    this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
                                }
                            }
                            if (!transition.mIsAbstract) {
                                break;
                            } else {
                                if (transition.mConstraintSetEnd == -1) {
                                    this.mDefaultTransition = transition;
                                } else {
                                    this.mAbstractTransitionList.add(transition);
                                }
                                this.mTransitionList.remove(transition);
                                break;
                            }
                            break;
                        case "OnSwipe":
                            if (transition == null) {
                                android.util.Log.v(androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.NAME, " OnSwipe (" + context.getResources().getResourceEntryName(resourceId) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (transition == null) {
                                break;
                            } else {
                                transition.mTouchResponse = new androidx.constraintlayout.motion.widget.TouchResponse(context, this.mMotionLayout, xml);
                                break;
                            }
                            break;
                        case "OnClick":
                            if (transition == null) {
                                break;
                            } else {
                                transition.addOnClick(context, xml);
                                break;
                            }
                            break;
                        case "StateSet":
                            this.mStateSet = new androidx.constraintlayout.widget.StateSet(context, xml);
                            break;
                        case "ConstraintSet":
                            parseConstraintSet(context, xml);
                            break;
                        case "include":
                        case "Include":
                            parseInclude(context, xml);
                            break;
                        case "KeyFrameSet":
                            androidx.constraintlayout.motion.widget.KeyFrames keyFrames = new androidx.constraintlayout.motion.widget.KeyFrames(context, xml);
                            if (transition == null) {
                                break;
                            } else {
                                transition.mKeyFramesList.add(keyFrames);
                                break;
                            }
                            break;
                        case "ViewTransition":
                            this.mViewTransitionController.add(new androidx.constraintlayout.motion.widget.ViewTransition(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void parseMotionSceneTags(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(parser), androidx.constraintlayout.widget.R.styleable.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.R.styleable.MotionScene_defaultDuration) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.mDefaultDuration);
                this.mDefaultDuration = i2;
                if (i2 < 8) {
                    this.mDefaultDuration = 8;
                }
            } else if (index == androidx.constraintlayout.widget.R.styleable.MotionScene_layoutDuringTransition) {
                this.mLayoutDuringTransition = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private int getId(android.content.Context context, java.lang.String idString) {
        int identifier;
        if (idString.contains("/")) {
            identifier = context.getResources().getIdentifier(idString.substring(idString.indexOf(47) + 1), "id", context.getPackageName());
            if (this.DEBUG_DESKTOP) {
                java.lang.System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (idString != null && idString.length() > 1) {
            return java.lang.Integer.parseInt(idString.substring(1));
        }
        android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.NAME, "error in parsing id");
        return identifier;
    }

    private void parseInclude(android.content.Context context, org.xmlpull.v1.XmlPullParser mainParser) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(mainParser), androidx.constraintlayout.widget.R.styleable.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.R.styleable.include_constraintSet) {
                parseInclude(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int parseInclude(android.content.Context context, int resourceId) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                java.lang.String name = xml.getName();
                if (2 == eventType && CONSTRAINTSET_TAG.equals(name)) {
                    return parseConstraintSet(context, xml);
                }
            }
            return -1;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return -1;
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    private int parseConstraintSet(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = parser.getAttributeCount();
        int id = -1;
        int id2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = parser.getAttributeName(i);
            java.lang.String attributeValue = parser.getAttributeValue(i);
            if (this.DEBUG_DESKTOP) {
                java.lang.System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    id2 = getId(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        constraintSet.mRotate = java.lang.Integer.parseInt(attributeValue);
                        break;
                    } catch (java.lang.NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue) {
                            case "x_left":
                                constraintSet.mRotate = 4;
                                break;
                            case "left":
                                constraintSet.mRotate = 2;
                                break;
                            case "none":
                                constraintSet.mRotate = 0;
                                break;
                            case "right":
                                constraintSet.mRotate = 1;
                                break;
                            case "x_right":
                                constraintSet.mRotate = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    id = getId(context, attributeValue);
                    this.mConstraintSetIdMap.put(stripID(attributeValue), java.lang.Integer.valueOf(id));
                    constraintSet.mIdString = androidx.constraintlayout.motion.widget.Debug.getName(context, id);
                    break;
            }
        }
        if (id != -1) {
            if (this.mMotionLayout.mDebugPath != 0) {
                constraintSet.setValidateOnParse(true);
            }
            constraintSet.load(context, parser);
            if (id2 != -1) {
                this.mDeriveMap.put(id, id2);
            }
            this.mConstraintSetMap.put(id, constraintSet);
        }
        return id;
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet(android.content.Context context, java.lang.String id) {
        if (this.DEBUG_DESKTOP) {
            java.lang.System.out.println("id " + id);
            java.lang.System.out.println("size " + this.mConstraintSetMap.size());
        }
        for (int i = 0; i < this.mConstraintSetMap.size(); i++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i);
            java.lang.String resourceName = context.getResources().getResourceName(iKeyAt);
            if (this.DEBUG_DESKTOP) {
                java.lang.System.out.println("Id for <" + i + "> is <" + resourceName + "> looking for <" + id + ">");
            }
            if (id.equals(resourceName)) {
                return this.mConstraintSetMap.get(iKeyAt);
            }
        }
        return null;
    }

    androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int id) {
        return getConstraintSet(id, -1, -1);
    }

    androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int id, int width, int height) {
        int iStateGetConstraintID;
        if (this.DEBUG_DESKTOP) {
            java.lang.System.out.println("id " + id);
            java.lang.System.out.println("size " + this.mConstraintSetMap.size());
        }
        androidx.constraintlayout.widget.StateSet stateSet = this.mStateSet;
        if (stateSet != null && (iStateGetConstraintID = stateSet.stateGetConstraintID(id, width, height)) != -1) {
            id = iStateGetConstraintID;
        }
        if (this.mConstraintSetMap.get(id) == null) {
            android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.NAME, "Warning could not find ConstraintSet id/" + androidx.constraintlayout.motion.widget.Debug.getName(this.mMotionLayout.getContext(), id) + " In MotionScene");
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> sparseArray = this.mConstraintSetMap;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.mConstraintSetMap.get(id);
    }

    public void setConstraintSet(int id, androidx.constraintlayout.widget.ConstraintSet set) {
        this.mConstraintSetMap.put(id, set);
    }

    public void getKeyFrames(androidx.constraintlayout.motion.widget.MotionController motionController) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition != null) {
            java.util.Iterator it = transition.mKeyFramesList.iterator();
            while (it.hasNext()) {
                ((androidx.constraintlayout.motion.widget.KeyFrames) it.next()).addFrames(motionController);
            }
        } else {
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.mDefaultTransition;
            if (transition2 != null) {
                java.util.Iterator it2 = transition2.mKeyFramesList.iterator();
                while (it2.hasNext()) {
                    ((androidx.constraintlayout.motion.widget.KeyFrames) it2.next()).addFrames(motionController);
                }
            }
        }
    }

    androidx.constraintlayout.motion.widget.Key getKeyFrame(android.content.Context context, int type, int target, int position) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return null;
        }
        for (androidx.constraintlayout.motion.widget.KeyFrames keyFrames : transition.mKeyFramesList) {
            for (java.lang.Integer num : keyFrames.getKeys()) {
                if (target == num.intValue()) {
                    for (androidx.constraintlayout.motion.widget.Key key : keyFrames.getKeyFramesForView(num.intValue())) {
                        if (key.mFramePosition == position && key.mType == type) {
                            return key;
                        }
                    }
                }
            }
        }
        return null;
    }

    int getTransitionDirection(int stateId) {
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mConstraintSetStart == stateId) {
                return 0;
            }
        }
        return 1;
    }

    boolean hasKeyFramePosition(android.view.View view, int position) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return false;
        }
        java.util.Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it2 = ((androidx.constraintlayout.motion.widget.KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == position) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setKeyframe(android.view.View view, int position, java.lang.String name, java.lang.Object value) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return;
        }
        java.util.Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it2 = ((androidx.constraintlayout.motion.widget.KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == position) {
                    if (value != null) {
                        ((java.lang.Float) value).floatValue();
                    }
                    name.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    boolean supportTouch() {
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mTouchResponse != null) {
                return true;
            }
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        return (transition == null || transition.mTouchResponse == null) ? false : true;
    }

    void processTouchEvent(android.view.MotionEvent event, int currentState, androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker motionTracker;
        android.view.MotionEvent motionEvent;
        android.graphics.RectF rectF = new android.graphics.RectF();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = this.mMotionLayout.obtainVelocityTracker();
        }
        this.mVelocityTracker.addMovement(event);
        if (currentState != -1) {
            int action = event.getAction();
            boolean z = false;
            if (action == 0) {
                this.mLastTouchX = event.getRawX();
                this.mLastTouchY = event.getRawY();
                this.mLastTouchDown = event;
                this.mIgnoreTouch = false;
                if (this.mCurrentTransition.mTouchResponse != null) {
                    android.graphics.RectF limitBoundsTo = this.mCurrentTransition.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                    if (limitBoundsTo == null || limitBoundsTo.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        android.graphics.RectF touchRegion = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                        if (touchRegion != null && !touchRegion.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                            this.mMotionOutsideRegion = true;
                        } else {
                            this.mMotionOutsideRegion = false;
                        }
                        this.mCurrentTransition.mTouchResponse.setDown(this.mLastTouchX, this.mLastTouchY);
                        return;
                    }
                    this.mLastTouchDown = null;
                    this.mIgnoreTouch = true;
                    return;
                }
                return;
            }
            if (action == 2 && !this.mIgnoreTouch) {
                float rawY = event.getRawY() - this.mLastTouchY;
                float rawX = event.getRawX() - this.mLastTouchX;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent = this.mLastTouchDown) == null) {
                    return;
                }
                androidx.constraintlayout.motion.widget.MotionScene.Transition transitionBestTransitionFor = bestTransitionFor(currentState, rawX, rawY, motionEvent);
                if (transitionBestTransitionFor != null) {
                    motionLayout.setTransition(transitionBestTransitionFor);
                    android.graphics.RectF touchRegion2 = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion2 != null && !touchRegion2.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        z = true;
                    }
                    this.mMotionOutsideRegion = z;
                    this.mCurrentTransition.mTouchResponse.setUpTouchEvent(this.mLastTouchX, this.mLastTouchY);
                }
            }
        }
        if (this.mIgnoreTouch) {
            return;
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null && !this.mMotionOutsideRegion) {
            this.mCurrentTransition.mTouchResponse.processTouchEvent(event, this.mVelocityTracker, currentState, this);
        }
        this.mLastTouchX = event.getRawX();
        this.mLastTouchY = event.getRawY();
        if (event.getAction() != 1 || (motionTracker = this.mVelocityTracker) == null) {
            return;
        }
        motionTracker.recycle();
        this.mVelocityTracker = null;
        if (motionLayout.mCurrentState != -1) {
            autoTransition(motionLayout, motionLayout.mCurrentState);
        }
    }

    void processScrollMove(float dx, float dy) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollMove(dx, dy);
    }

    void processScrollUp(float dx, float dy) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollUp(dx, dy);
    }

    float getProgressDirection(float dx, float dy) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getProgressDirection(dx, dy);
    }

    int getStartId() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetStart;
    }

    int getEndId() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetEnd;
    }

    public android.view.animation.Interpolator getInterpolator() {
        int i = this.mCurrentTransition.mDefaultInterpolator;
        if (i == -2) {
            return android.view.animation.AnimationUtils.loadInterpolator(this.mMotionLayout.getContext(), this.mCurrentTransition.mDefaultInterpolatorID);
        }
        if (i == -1) {
            final androidx.constraintlayout.core.motion.utils.Easing interpolator = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(this.mCurrentTransition.mDefaultInterpolatorString);
            return new android.view.animation.Interpolator(this) { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float v) {
                    return (float) interpolator.get(v);
                }
            };
        }
        if (i == 0) {
            return new android.view.animation.AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new android.view.animation.AccelerateInterpolator();
        }
        if (i == 2) {
            return new android.view.animation.DecelerateInterpolator();
        }
        if (i == 4) {
            return new android.view.animation.BounceInterpolator();
        }
        if (i == 5) {
            return new android.view.animation.OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new android.view.animation.AnticipateInterpolator();
    }

    public int getDuration() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mDuration;
        }
        return this.mDefaultDuration;
    }

    public void setDuration(int duration) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition != null) {
            transition.setDuration(duration);
        } else {
            this.mDefaultDuration = duration;
        }
    }

    public int gatPathMotionArc() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mPathMotionArc;
        }
        return -1;
    }

    public float getStaggered() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mStagger;
        }
        return 0.0f;
    }

    float getMaxAcceleration() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxAcceleration();
    }

    float getMaxVelocity() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxVelocity();
    }

    float getSpringStiffiness() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringStiffness();
    }

    float getSpringMass() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringMass();
    }

    float getSpringDamping() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringDamping();
    }

    float getSpringStopThreshold() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringStopThreshold();
    }

    int getSpringBoundary() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringBoundary();
    }

    int getAutoCompleteMode() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0;
        }
        return this.mCurrentTransition.mTouchResponse.getAutoCompleteMode();
    }

    void setupTouch() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setupTouch();
    }

    boolean getMoveWhenScrollAtTop() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return false;
        }
        return this.mCurrentTransition.mTouchResponse.getMoveWhenScrollAtTop();
    }

    void readFallback(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        for (int i = 0; i < this.mConstraintSetMap.size(); i++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i);
            if (hasCycleDependency(iKeyAt)) {
                android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.NAME, "Cannot be derived from yourself");
                return;
            }
            readConstraintChain(iKeyAt, motionLayout);
        }
    }

    private boolean hasCycleDependency(int key) {
        int i = this.mDeriveMap.get(key);
        int size = this.mDeriveMap.size();
        while (i > 0) {
            if (i == key) {
                return true;
            }
            int i2 = size - 1;
            if (size < 0) {
                return true;
            }
            i = this.mDeriveMap.get(i);
            size = i2;
        }
        return false;
    }

    private void readConstraintChain(int key, androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        androidx.constraintlayout.widget.ConstraintSet constraintSet = this.mConstraintSetMap.get(key);
        constraintSet.derivedState = constraintSet.mIdString;
        int i = this.mDeriveMap.get(key);
        if (i > 0) {
            readConstraintChain(i, motionLayout);
            androidx.constraintlayout.widget.ConstraintSet constraintSet2 = this.mConstraintSetMap.get(i);
            if (constraintSet2 == null) {
                android.util.Log.e(androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.NAME, "ERROR! invalid deriveConstraintsFrom: @id/" + androidx.constraintlayout.motion.widget.Debug.getName(this.mMotionLayout.getContext(), i));
                return;
            } else {
                constraintSet.derivedState += "/" + constraintSet2.derivedState;
                constraintSet.readFallback(constraintSet2);
            }
        } else {
            constraintSet.derivedState += "  layout";
            constraintSet.readFallback(motionLayout);
        }
        constraintSet.applyDeltaFrom(constraintSet);
    }

    public static java.lang.String stripID(java.lang.String id) {
        if (id == null) {
            return "";
        }
        int iIndexOf = id.indexOf(47);
        return iIndexOf < 0 ? id : id.substring(iIndexOf + 1);
    }

    public int lookUpConstraintId(java.lang.String id) {
        java.lang.Integer num = this.mConstraintSetIdMap.get(id);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public java.lang.String lookUpConstraintName(int id) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : this.mConstraintSetIdMap.entrySet()) {
            java.lang.Integer value = entry.getValue();
            if (value != null && value.intValue() == id) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void disableAutoTransition(boolean disable) {
        this.mDisableAutoTransition = disable;
    }

    static java.lang.String getLine(android.content.Context context, int resourceId, org.xmlpull.v1.XmlPullParser pullParser) {
        return ".(" + androidx.constraintlayout.motion.widget.Debug.getName(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }
}
