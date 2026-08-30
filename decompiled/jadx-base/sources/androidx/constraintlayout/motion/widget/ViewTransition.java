package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class ViewTransition {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    public static final java.lang.String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final java.lang.String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final java.lang.String CUSTOM_METHOD = "CustomMethod";
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final java.lang.String KEY_FRAME_SET_TAG = "KeyFrameSet";
    static final int LINEAR = 3;
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static java.lang.String TAG = "ViewTransition";
    private static final int UNSET = -1;
    static final int VIEWTRANSITIONMODE_ALLSTATES = 1;
    static final int VIEWTRANSITIONMODE_CURRENTSTATE = 0;
    static final int VIEWTRANSITIONMODE_NOSTATE = 2;
    public static final java.lang.String VIEW_TRANSITION_TAG = "ViewTransition";
    androidx.constraintlayout.widget.ConstraintSet.Constraint mConstraintDelta;
    android.content.Context mContext;
    private int mId;
    androidx.constraintlayout.motion.widget.KeyFrames mKeyFrames;
    private int mTargetId;
    private java.lang.String mTargetString;
    int mViewTransitionMode;
    androidx.constraintlayout.widget.ConstraintSet set;
    private int mOnStateTransition = -1;
    private boolean mDisabled = false;
    private int mPathMotionArc = 0;
    private int mDuration = -1;
    private int mUpDuration = -1;
    private int mDefaultInterpolator = 0;
    private java.lang.String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mSetsTag = -1;
    private int mClearsTag = -1;
    private int mIfTagSet = -1;
    private int mIfTagNotSet = -1;
    private int mSharedValueTarget = -1;
    private int mSharedValueID = -1;
    private int mSharedValueCurrent = -1;

    public int getSharedValueCurrent() {
        return this.mSharedValueCurrent;
    }

    public void setSharedValueCurrent(int sharedValueCurrent) {
        this.mSharedValueCurrent = sharedValueCurrent;
    }

    public int getStateTransition() {
        return this.mOnStateTransition;
    }

    public void setStateTransition(int stateTransition) {
        this.mOnStateTransition = stateTransition;
    }

    public int getSharedValue() {
        return this.mSharedValueTarget;
    }

    public void setSharedValue(int sharedValue) {
        this.mSharedValueTarget = sharedValue;
    }

    public int getSharedValueID() {
        return this.mSharedValueID;
    }

    public void setSharedValueID(int sharedValueID) {
        this.mSharedValueID = sharedValueID;
    }

    public java.lang.String toString() {
        return "ViewTransition(" + androidx.constraintlayout.motion.widget.Debug.getName(this.mContext, this.mId) + ")";
    }

    android.view.animation.Interpolator getInterpolator(android.content.Context context) {
        int i = this.mDefaultInterpolator;
        if (i == -2) {
            return android.view.animation.AnimationUtils.loadInterpolator(context, this.mDefaultInterpolatorID);
        }
        if (i == -1) {
            final androidx.constraintlayout.core.motion.utils.Easing interpolator = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(this.mDefaultInterpolatorString);
            return new android.view.animation.Interpolator(this) { // from class: androidx.constraintlayout.motion.widget.ViewTransition.1
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

    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    ViewTransition(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
        byte b;
        this.mContext = context;
        try {
            int eventType = parser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    java.lang.String name = parser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals(CONSTRAINT_OVERRIDE)) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals(KEY_FRAME_SET_TAG)) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals(VIEW_TRANSITION_TAG)) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals(CUSTOM_METHOD)) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals(CUSTOM_ATTRIBUTE)) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        parseViewTransitionTags(context, parser);
                    } else if (b == 1) {
                        this.mKeyFrames = new androidx.constraintlayout.motion.widget.KeyFrames(context, parser);
                    } else if (b == 2) {
                        this.mConstraintDelta = androidx.constraintlayout.widget.ConstraintSet.buildDelta(context, parser);
                    } else if (b == 3 || b == 4) {
                        androidx.constraintlayout.widget.ConstraintAttribute.parse(context, parser, this.mConstraintDelta.mCustomConstraints);
                    } else {
                        android.util.Log.e(TAG, androidx.constraintlayout.motion.widget.Debug.getLoc() + " unknown tag " + name);
                        android.util.Log.e(TAG, ".xml:" + parser.getLineNumber());
                    }
                } else if (eventType == 3 && VIEW_TRANSITION_TAG.equals(parser.getName())) {
                    return;
                }
                eventType = parser.next();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void parseViewTransitionTags(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(parser), androidx.constraintlayout.widget.R.styleable.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_android_id) {
                this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_motionTarget) {
                if (androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.mTargetId);
                    this.mTargetId = resourceId;
                    if (resourceId == -1) {
                        this.mTargetString = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.mTargetString = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.mTargetId = typedArrayObtainStyledAttributes.getResourceId(index, this.mTargetId);
                }
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_onStateTransition) {
                this.mOnStateTransition = typedArrayObtainStyledAttributes.getInt(index, this.mOnStateTransition);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_transitionDisable) {
                this.mDisabled = typedArrayObtainStyledAttributes.getBoolean(index, this.mDisabled);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_pathMotionArc) {
                this.mPathMotionArc = typedArrayObtainStyledAttributes.getInt(index, this.mPathMotionArc);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_duration) {
                this.mDuration = typedArrayObtainStyledAttributes.getInt(index, this.mDuration);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_upDuration) {
                this.mUpDuration = typedArrayObtainStyledAttributes.getInt(index, this.mUpDuration);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_viewTransitionMode) {
                this.mViewTransitionMode = typedArrayObtainStyledAttributes.getInt(index, this.mViewTransitionMode);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_motionInterpolator) {
                android.util.TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                if (typedValuePeekValue.type == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.mDefaultInterpolatorID = resourceId2;
                    if (resourceId2 != -1) {
                        this.mDefaultInterpolator = -2;
                    }
                } else if (typedValuePeekValue.type == 3) {
                    java.lang.String string = typedArrayObtainStyledAttributes.getString(index);
                    this.mDefaultInterpolatorString = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.mDefaultInterpolatorID = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.mDefaultInterpolator = -2;
                    } else {
                        this.mDefaultInterpolator = -1;
                    }
                } else {
                    this.mDefaultInterpolator = typedArrayObtainStyledAttributes.getInteger(index, this.mDefaultInterpolator);
                }
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_setsTag) {
                this.mSetsTag = typedArrayObtainStyledAttributes.getResourceId(index, this.mSetsTag);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_clearsTag) {
                this.mClearsTag = typedArrayObtainStyledAttributes.getResourceId(index, this.mClearsTag);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_ifTagSet) {
                this.mIfTagSet = typedArrayObtainStyledAttributes.getResourceId(index, this.mIfTagSet);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_ifTagNotSet) {
                this.mIfTagNotSet = typedArrayObtainStyledAttributes.getResourceId(index, this.mIfTagNotSet);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_SharedValueId) {
                this.mSharedValueID = typedArrayObtainStyledAttributes.getResourceId(index, this.mSharedValueID);
            } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_SharedValue) {
                this.mSharedValueTarget = typedArrayObtainStyledAttributes.getInteger(index, this.mSharedValueTarget);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    void applyIndependentTransition(androidx.constraintlayout.motion.widget.ViewTransitionController controller, androidx.constraintlayout.motion.widget.MotionLayout motionLayout, android.view.View view) {
        androidx.constraintlayout.motion.widget.MotionController motionController = new androidx.constraintlayout.motion.widget.MotionController(view);
        motionController.setBothStates(view);
        this.mKeyFrames.addAllFrames(motionController);
        motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), this.mDuration, java.lang.System.nanoTime());
        new androidx.constraintlayout.motion.widget.ViewTransition.Animate(controller, motionController, this.mDuration, this.mUpDuration, this.mOnStateTransition, getInterpolator(motionLayout.getContext()), this.mSetsTag, this.mClearsTag);
    }

    static class Animate {
        boolean hold_at_100;
        private final int mClearsTag;
        float mDpositionDt;
        int mDuration;
        android.view.animation.Interpolator mInterpolator;
        long mLastRender;
        androidx.constraintlayout.motion.widget.MotionController mMC;
        float mPosition;
        private final int mSetsTag;
        long mStart;
        int mUpDuration;
        androidx.constraintlayout.motion.widget.ViewTransitionController mVtController;
        androidx.constraintlayout.core.motion.utils.KeyCache mCache = new androidx.constraintlayout.core.motion.utils.KeyCache();
        boolean reverse = false;
        android.graphics.Rect mTempRec = new android.graphics.Rect();

        Animate(androidx.constraintlayout.motion.widget.ViewTransitionController controller, androidx.constraintlayout.motion.widget.MotionController motionController, int duration, int upDuration, int mode, android.view.animation.Interpolator interpolator, int setTag, int clearTag) {
            this.hold_at_100 = false;
            this.mVtController = controller;
            this.mMC = motionController;
            this.mDuration = duration;
            this.mUpDuration = upDuration;
            long jNanoTime = java.lang.System.nanoTime();
            this.mStart = jNanoTime;
            this.mLastRender = jNanoTime;
            this.mVtController.addAnimation(this);
            this.mInterpolator = interpolator;
            this.mSetsTag = setTag;
            this.mClearsTag = clearTag;
            if (mode == 3) {
                this.hold_at_100 = true;
            }
            this.mDpositionDt = duration == 0 ? Float.MAX_VALUE : 1.0f / duration;
            mutate();
        }

        void reverse(boolean dir) {
            int i;
            this.reverse = dir;
            if (dir && (i = this.mUpDuration) != -1) {
                this.mDpositionDt = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.mVtController.invalidate();
            this.mLastRender = java.lang.System.nanoTime();
        }

        void mutate() {
            if (this.reverse) {
                mutateReverse();
            } else {
                mutateForward();
            }
        }

        void mutateReverse() {
            long jNanoTime = java.lang.System.nanoTime();
            long j = jNanoTime - this.mLastRender;
            this.mLastRender = jNanoTime;
            float f = this.mPosition - (((float) (j * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f;
            if (f < 0.0f) {
                this.mPosition = 0.0f;
            }
            android.view.animation.Interpolator interpolator = this.mInterpolator;
            float interpolation = interpolator == null ? this.mPosition : interpolator.getInterpolation(this.mPosition);
            androidx.constraintlayout.motion.widget.MotionController motionController = this.mMC;
            boolean zInterpolate = motionController.interpolate(motionController.mView, interpolation, jNanoTime, this.mCache);
            if (this.mPosition <= 0.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, java.lang.Long.valueOf(java.lang.System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, null);
                }
                this.mVtController.removeAnimation(this);
            }
            if (this.mPosition > 0.0f || zInterpolate) {
                this.mVtController.invalidate();
            }
        }

        void mutateForward() {
            long jNanoTime = java.lang.System.nanoTime();
            long j = jNanoTime - this.mLastRender;
            this.mLastRender = jNanoTime;
            float f = this.mPosition + (((float) (j * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f;
            if (f >= 1.0f) {
                this.mPosition = 1.0f;
            }
            android.view.animation.Interpolator interpolator = this.mInterpolator;
            float interpolation = interpolator == null ? this.mPosition : interpolator.getInterpolation(this.mPosition);
            androidx.constraintlayout.motion.widget.MotionController motionController = this.mMC;
            boolean zInterpolate = motionController.interpolate(motionController.mView, interpolation, jNanoTime, this.mCache);
            if (this.mPosition >= 1.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, java.lang.Long.valueOf(java.lang.System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, null);
                }
                if (!this.hold_at_100) {
                    this.mVtController.removeAnimation(this);
                }
            }
            if (this.mPosition < 1.0f || zInterpolate) {
                this.mVtController.invalidate();
            }
        }

        public void reactTo(int action, float x, float y) {
            if (action == 1) {
                if (this.reverse) {
                    return;
                }
                reverse(true);
            } else {
                if (action != 2) {
                    return;
                }
                this.mMC.getView().getHitRect(this.mTempRec);
                if (this.mTempRec.contains((int) x, (int) y) || this.reverse) {
                    return;
                }
                reverse(true);
            }
        }
    }

    void applyTransition(androidx.constraintlayout.motion.widget.ViewTransitionController controller, androidx.constraintlayout.motion.widget.MotionLayout layout, int fromId, androidx.constraintlayout.widget.ConstraintSet current, final android.view.View... views) {
        if (this.mDisabled) {
            return;
        }
        int i = this.mViewTransitionMode;
        if (i == 2) {
            applyIndependentTransition(controller, layout, views[0]);
            return;
        }
        if (i == 1) {
            for (int i2 : layout.getConstraintSetIds()) {
                if (i2 != fromId) {
                    androidx.constraintlayout.widget.ConstraintSet constraintSet = layout.getConstraintSet(i2);
                    for (android.view.View view : views) {
                        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = constraintSet.getConstraint(view.getId());
                        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = this.mConstraintDelta;
                        if (constraint2 != null) {
                            constraint2.applyDelta(constraint);
                            constraint.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet2 = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet2.clone(current);
        for (android.view.View view2 : views) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint3 = constraintSet2.getConstraint(view2.getId());
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint4 = this.mConstraintDelta;
            if (constraint4 != null) {
                constraint4.applyDelta(constraint3);
                constraint3.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
            }
        }
        layout.updateState(fromId, constraintSet2);
        layout.updateState(androidx.constraintlayout.widget.R.id.view_transition, current);
        layout.setState(androidx.constraintlayout.widget.R.id.view_transition, -1, -1);
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = new androidx.constraintlayout.motion.widget.MotionScene.Transition(-1, layout.mScene, androidx.constraintlayout.widget.R.id.view_transition, fromId);
        for (android.view.View view3 : views) {
            updateTransition(transition, view3);
        }
        layout.setTransition(transition);
        layout.transitionToEnd(new java.lang.Runnable() { // from class: androidx.constraintlayout.motion.widget.ViewTransition$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m16x14d7500(views);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$applyTransition$0$androidx-constraintlayout-motion-widget-ViewTransition, reason: not valid java name */
    /* synthetic */ void m16x14d7500(android.view.View[] viewArr) {
        if (this.mSetsTag != -1) {
            for (android.view.View view : viewArr) {
                view.setTag(this.mSetsTag, java.lang.Long.valueOf(java.lang.System.nanoTime()));
            }
        }
        if (this.mClearsTag != -1) {
            for (android.view.View view2 : viewArr) {
                view2.setTag(this.mClearsTag, null);
            }
        }
    }

    private void updateTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition, android.view.View view) {
        int i = this.mDuration;
        if (i != -1) {
            transition.setDuration(i);
        }
        transition.setPathMotionArc(this.mPathMotionArc);
        transition.setInterpolatorInfo(this.mDefaultInterpolator, this.mDefaultInterpolatorString, this.mDefaultInterpolatorID);
        int id = view.getId();
        androidx.constraintlayout.motion.widget.KeyFrames keyFrames = this.mKeyFrames;
        if (keyFrames != null) {
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> keyFramesForView = keyFrames.getKeyFramesForView(-1);
            androidx.constraintlayout.motion.widget.KeyFrames keyFrames2 = new androidx.constraintlayout.motion.widget.KeyFrames();
            java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it = keyFramesForView.iterator();
            while (it.hasNext()) {
                keyFrames2.addKey(it.next().mo15clone().setViewId(id));
            }
            transition.addKeyFrame(keyFrames2);
        }
    }

    int getId() {
        return this.mId;
    }

    void setId(int id) {
        this.mId = id;
    }

    boolean matchesView(android.view.View view) {
        java.lang.String str;
        if (view == null) {
            return false;
        }
        if ((this.mTargetId == -1 && this.mTargetString == null) || !checkTags(view)) {
            return false;
        }
        if (view.getId() == this.mTargetId) {
            return true;
        }
        return this.mTargetString != null && (view.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) && (str = ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && str.matches(this.mTargetString);
    }

    boolean supports(int action) {
        int i = this.mOnStateTransition;
        if (i == 1) {
            return action == 0;
        }
        if (i == 2) {
            return action == 1;
        }
        return i == 3 && action == 0;
    }

    boolean isEnabled() {
        return !this.mDisabled;
    }

    void setEnabled(boolean enable) {
        this.mDisabled = !enable;
    }

    boolean checkTags(android.view.View view) {
        int i = this.mIfTagSet;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.mIfTagNotSet;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }
}
