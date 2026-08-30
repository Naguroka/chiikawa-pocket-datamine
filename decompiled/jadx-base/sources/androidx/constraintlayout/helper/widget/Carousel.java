package androidx.constraintlayout.helper.widget;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends androidx.constraintlayout.motion.widget.MotionHelper {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "Carousel";
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    private int backwardTransition;
    private float dampening;
    private int emptyViewBehavior;
    private int firstViewReference;
    private int forwardTransition;
    private boolean infiniteCarousel;
    private androidx.constraintlayout.helper.widget.Carousel.Adapter mAdapter;
    private int mAnimateTargetDelay;
    private int mIndex;
    int mLastStartId;
    private final java.util.ArrayList<android.view.View> mList;
    private androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private int mPreviousIndex;
    private int mTargetIndex;
    java.lang.Runnable mUpdateRunnable;
    private int nextState;
    private int previousState;
    private int startIndex;
    private int touchUpMode;
    private float velocityThreshold;

    public interface Adapter {
        int count();

        void onNewItem(int index);

        void populate(android.view.View view, int index);
    }

    public Carousel(android.content.Context context) {
        super(context);
        this.mAdapter = null;
        this.mList = new java.util.ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.firstViewReference = -1;
        this.infiniteCarousel = false;
        this.backwardTransition = -1;
        this.forwardTransition = -1;
        this.previousState = -1;
        this.nextState = -1;
        this.dampening = 0.9f;
        this.startIndex = 0;
        this.emptyViewBehavior = 4;
        this.touchUpMode = 1;
        this.velocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.setProgress(0.0f);
                androidx.constraintlayout.helper.widget.Carousel.this.updateItems();
                androidx.constraintlayout.helper.widget.Carousel.this.mAdapter.onNewItem(androidx.constraintlayout.helper.widget.Carousel.this.mIndex);
                float velocity = androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.getVelocity();
                if (androidx.constraintlayout.helper.widget.Carousel.this.touchUpMode != 2 || velocity <= androidx.constraintlayout.helper.widget.Carousel.this.velocityThreshold || androidx.constraintlayout.helper.widget.Carousel.this.mIndex >= androidx.constraintlayout.helper.widget.Carousel.this.mAdapter.count() - 1) {
                    return;
                }
                final float f = velocity * androidx.constraintlayout.helper.widget.Carousel.this.dampening;
                if (androidx.constraintlayout.helper.widget.Carousel.this.mIndex != 0 || androidx.constraintlayout.helper.widget.Carousel.this.mPreviousIndex <= androidx.constraintlayout.helper.widget.Carousel.this.mIndex) {
                    if (androidx.constraintlayout.helper.widget.Carousel.this.mIndex != androidx.constraintlayout.helper.widget.Carousel.this.mAdapter.count() - 1 || androidx.constraintlayout.helper.widget.Carousel.this.mPreviousIndex >= androidx.constraintlayout.helper.widget.Carousel.this.mIndex) {
                        androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.post(new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, f);
                            }
                        });
                    }
                }
            }
        };
    }

    public Carousel(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mAdapter = null;
        this.mList = new java.util.ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.firstViewReference = -1;
        this.infiniteCarousel = false;
        this.backwardTransition = -1;
        this.forwardTransition = -1;
        this.previousState = -1;
        this.nextState = -1;
        this.dampening = 0.9f;
        this.startIndex = 0;
        this.emptyViewBehavior = 4;
        this.touchUpMode = 1;
        this.velocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.setProgress(0.0f);
                androidx.constraintlayout.helper.widget.Carousel.this.updateItems();
                androidx.constraintlayout.helper.widget.Carousel.this.mAdapter.onNewItem(androidx.constraintlayout.helper.widget.Carousel.this.mIndex);
                float velocity = androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.getVelocity();
                if (androidx.constraintlayout.helper.widget.Carousel.this.touchUpMode != 2 || velocity <= androidx.constraintlayout.helper.widget.Carousel.this.velocityThreshold || androidx.constraintlayout.helper.widget.Carousel.this.mIndex >= androidx.constraintlayout.helper.widget.Carousel.this.mAdapter.count() - 1) {
                    return;
                }
                final float f = velocity * androidx.constraintlayout.helper.widget.Carousel.this.dampening;
                if (androidx.constraintlayout.helper.widget.Carousel.this.mIndex != 0 || androidx.constraintlayout.helper.widget.Carousel.this.mPreviousIndex <= androidx.constraintlayout.helper.widget.Carousel.this.mIndex) {
                    if (androidx.constraintlayout.helper.widget.Carousel.this.mIndex != androidx.constraintlayout.helper.widget.Carousel.this.mAdapter.count() - 1 || androidx.constraintlayout.helper.widget.Carousel.this.mPreviousIndex >= androidx.constraintlayout.helper.widget.Carousel.this.mIndex) {
                        androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.post(new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, f);
                            }
                        });
                    }
                }
            }
        };
        init(context, attrs);
    }

    public Carousel(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mAdapter = null;
        this.mList = new java.util.ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.firstViewReference = -1;
        this.infiniteCarousel = false;
        this.backwardTransition = -1;
        this.forwardTransition = -1;
        this.previousState = -1;
        this.nextState = -1;
        this.dampening = 0.9f;
        this.startIndex = 0;
        this.emptyViewBehavior = 4;
        this.touchUpMode = 1;
        this.velocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.setProgress(0.0f);
                androidx.constraintlayout.helper.widget.Carousel.this.updateItems();
                androidx.constraintlayout.helper.widget.Carousel.this.mAdapter.onNewItem(androidx.constraintlayout.helper.widget.Carousel.this.mIndex);
                float velocity = androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.getVelocity();
                if (androidx.constraintlayout.helper.widget.Carousel.this.touchUpMode != 2 || velocity <= androidx.constraintlayout.helper.widget.Carousel.this.velocityThreshold || androidx.constraintlayout.helper.widget.Carousel.this.mIndex >= androidx.constraintlayout.helper.widget.Carousel.this.mAdapter.count() - 1) {
                    return;
                }
                final float f = velocity * androidx.constraintlayout.helper.widget.Carousel.this.dampening;
                if (androidx.constraintlayout.helper.widget.Carousel.this.mIndex != 0 || androidx.constraintlayout.helper.widget.Carousel.this.mPreviousIndex <= androidx.constraintlayout.helper.widget.Carousel.this.mIndex) {
                    if (androidx.constraintlayout.helper.widget.Carousel.this.mIndex != androidx.constraintlayout.helper.widget.Carousel.this.mAdapter.count() - 1 || androidx.constraintlayout.helper.widget.Carousel.this.mPreviousIndex >= androidx.constraintlayout.helper.widget.Carousel.this.mIndex) {
                        androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.post(new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                androidx.constraintlayout.helper.widget.Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, f);
                            }
                        });
                    }
                }
            }
        };
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.Carousel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_firstView) {
                    this.firstViewReference = typedArrayObtainStyledAttributes.getResourceId(index, this.firstViewReference);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_backwardTransition) {
                    this.backwardTransition = typedArrayObtainStyledAttributes.getResourceId(index, this.backwardTransition);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_forwardTransition) {
                    this.forwardTransition = typedArrayObtainStyledAttributes.getResourceId(index, this.forwardTransition);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.emptyViewBehavior = typedArrayObtainStyledAttributes.getInt(index, this.emptyViewBehavior);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_previousState) {
                    this.previousState = typedArrayObtainStyledAttributes.getResourceId(index, this.previousState);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_nextState) {
                    this.nextState = typedArrayObtainStyledAttributes.getResourceId(index, this.nextState);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.dampening = typedArrayObtainStyledAttributes.getFloat(index, this.dampening);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_touchUpMode) {
                    this.touchUpMode = typedArrayObtainStyledAttributes.getInt(index, this.touchUpMode);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.velocityThreshold = typedArrayObtainStyledAttributes.getFloat(index, this.velocityThreshold);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_infinite) {
                    this.infiniteCarousel = typedArrayObtainStyledAttributes.getBoolean(index, this.infiniteCarousel);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setAdapter(androidx.constraintlayout.helper.widget.Carousel.Adapter adapter) {
        this.mAdapter = adapter;
    }

    public int getCount() {
        androidx.constraintlayout.helper.widget.Carousel.Adapter adapter = this.mAdapter;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.mIndex;
    }

    public void transitionToIndex(int index, int delay) {
        this.mTargetIndex = java.lang.Math.max(0, java.lang.Math.min(getCount() - 1, index));
        int iMax = java.lang.Math.max(0, delay);
        this.mAnimateTargetDelay = iMax;
        this.mMotionLayout.setTransitionDuration(iMax);
        if (index < this.mIndex) {
            this.mMotionLayout.transitionToState(this.previousState, this.mAnimateTargetDelay);
        } else {
            this.mMotionLayout.transitionToState(this.nextState, this.mAnimateTargetDelay);
        }
    }

    public void jumpToIndex(int index) {
        this.mIndex = java.lang.Math.max(0, java.lang.Math.min(getCount() - 1, index));
        refresh();
    }

    public void refresh() {
        int size = this.mList.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = this.mList.get(i);
            if (this.mAdapter.count() == 0) {
                updateViewVisibility(view, this.emptyViewBehavior);
            } else {
                updateViewVisibility(view, 0);
            }
        }
        this.mMotionLayout.rebuildScene();
        updateItems();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId, float progress) {
        this.mLastStartId = startId;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int currentId) {
        int i = this.mIndex;
        this.mPreviousIndex = i;
        if (currentId == this.nextState) {
            this.mIndex = i + 1;
        } else if (currentId == this.previousState) {
            this.mIndex = i - 1;
        }
        if (this.infiniteCarousel) {
            if (this.mIndex >= this.mAdapter.count()) {
                this.mIndex = 0;
            }
            if (this.mIndex < 0) {
                this.mIndex = this.mAdapter.count() - 1;
            }
        } else {
            if (this.mIndex >= this.mAdapter.count()) {
                this.mIndex = this.mAdapter.count() - 1;
            }
            if (this.mIndex < 0) {
                this.mIndex = 0;
            }
        }
        if (this.mPreviousIndex != this.mIndex) {
            this.mMotionLayout.post(this.mUpdateRunnable);
        }
    }

    private void enableAllTransitions(boolean enable) {
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.mMotionLayout.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().setEnabled(enable);
        }
    }

    private boolean enableTransition(int transitionID, boolean enable) {
        androidx.constraintlayout.motion.widget.MotionLayout motionLayout;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition;
        if (transitionID == -1 || (motionLayout = this.mMotionLayout) == null || (transition = motionLayout.getTransition(transitionID)) == null || enable == transition.isEnabled()) {
            return false;
        }
        transition.setEnabled(enable);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
            androidx.constraintlayout.motion.widget.MotionLayout motionLayout = (androidx.constraintlayout.motion.widget.MotionLayout) getParent();
            for (int i = 0; i < this.mCount; i++) {
                int i2 = this.mIds[i];
                android.view.View viewById = motionLayout.getViewById(i2);
                if (this.firstViewReference == i2) {
                    this.startIndex = i;
                }
                this.mList.add(viewById);
            }
            this.mMotionLayout = motionLayout;
            if (this.touchUpMode == 2) {
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition = motionLayout.getTransition(this.forwardTransition);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.mMotionLayout.getTransition(this.backwardTransition);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            updateItems();
        }
    }

    private boolean updateViewVisibility(android.view.View view, int visibility) {
        androidx.constraintlayout.motion.widget.MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout == null) {
            return false;
        }
        boolean zUpdateViewVisibility = false;
        for (int i : motionLayout.getConstraintSetIds()) {
            zUpdateViewVisibility |= updateViewVisibility(i, view, visibility);
        }
        return zUpdateViewVisibility;
    }

    private boolean updateViewVisibility(int constraintSetId, android.view.View view, int visibility) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        androidx.constraintlayout.widget.ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(constraintSetId);
        if (constraintSet == null || (constraint = constraintSet.getConstraint(view.getId())) == null) {
            return false;
        }
        constraint.propertySet.mVisibilityMode = 1;
        view.setVisibility(visibility);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateItems() {
        androidx.constraintlayout.helper.widget.Carousel.Adapter adapter = this.mAdapter;
        if (adapter == null || this.mMotionLayout == null || adapter.count() == 0) {
            return;
        }
        int size = this.mList.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = this.mList.get(i);
            int iCount = (this.mIndex + i) - this.startIndex;
            if (this.infiniteCarousel) {
                if (iCount < 0) {
                    int i2 = this.emptyViewBehavior;
                    if (i2 != 4) {
                        updateViewVisibility(view, i2);
                    } else {
                        updateViewVisibility(view, 0);
                    }
                    if (iCount % this.mAdapter.count() == 0) {
                        this.mAdapter.populate(view, 0);
                    } else {
                        androidx.constraintlayout.helper.widget.Carousel.Adapter adapter2 = this.mAdapter;
                        adapter2.populate(view, adapter2.count() + (iCount % this.mAdapter.count()));
                    }
                } else if (iCount >= this.mAdapter.count()) {
                    if (iCount == this.mAdapter.count()) {
                        iCount = 0;
                    } else if (iCount > this.mAdapter.count()) {
                        iCount %= this.mAdapter.count();
                    }
                    int i3 = this.emptyViewBehavior;
                    if (i3 != 4) {
                        updateViewVisibility(view, i3);
                    } else {
                        updateViewVisibility(view, 0);
                    }
                    this.mAdapter.populate(view, iCount);
                } else {
                    updateViewVisibility(view, 0);
                    this.mAdapter.populate(view, iCount);
                }
            } else if (iCount < 0) {
                updateViewVisibility(view, this.emptyViewBehavior);
            } else if (iCount >= this.mAdapter.count()) {
                updateViewVisibility(view, this.emptyViewBehavior);
            } else {
                updateViewVisibility(view, 0);
                this.mAdapter.populate(view, iCount);
            }
        }
        int i4 = this.mTargetIndex;
        if (i4 != -1 && i4 != this.mIndex) {
            this.mMotionLayout.post(new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m14xc943cdea();
                }
            });
        } else if (i4 == this.mIndex) {
            this.mTargetIndex = -1;
        }
        if (this.backwardTransition == -1 || this.forwardTransition == -1) {
            android.util.Log.w(TAG, "No backward or forward transitions defined for Carousel!");
            return;
        }
        if (this.infiniteCarousel) {
            return;
        }
        int iCount2 = this.mAdapter.count();
        if (this.mIndex == 0) {
            enableTransition(this.backwardTransition, false);
        } else {
            enableTransition(this.backwardTransition, true);
            this.mMotionLayout.setTransition(this.backwardTransition);
        }
        if (this.mIndex == iCount2 - 1) {
            enableTransition(this.forwardTransition, false);
        } else {
            enableTransition(this.forwardTransition, true);
            this.mMotionLayout.setTransition(this.forwardTransition);
        }
    }

    /* JADX INFO: renamed from: lambda$updateItems$0$androidx-constraintlayout-helper-widget-Carousel, reason: not valid java name */
    /* synthetic */ void m14xc943cdea() {
        this.mMotionLayout.setTransitionDuration(this.mAnimateTargetDelay);
        if (this.mTargetIndex < this.mIndex) {
            this.mMotionLayout.transitionToState(this.previousState, this.mAnimateTargetDelay);
        } else {
            this.mMotionLayout.transitionToState(this.nextState, this.mAnimateTargetDelay);
        }
    }
}
