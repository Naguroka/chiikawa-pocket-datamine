package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public class ItemTouchHelper extends androidx.recyclerview.widget.RecyclerView.ItemDecoration implements androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final java.lang.String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    androidx.recyclerview.widget.ItemTouchHelper.Callback mCallback;
    private java.util.List<java.lang.Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    androidx.core.view.GestureDetectorCompat mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private androidx.recyclerview.widget.ItemTouchHelper.ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    androidx.recyclerview.widget.RecyclerView mRecyclerView;
    int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private android.graphics.Rect mTmpRect;
    android.view.VelocityTracker mVelocityTracker;
    final java.util.List<android.view.View> mPendingCleanup = new java.util.ArrayList();
    private final float[] mTmpPosition = new float[2];
    androidx.recyclerview.widget.RecyclerView.ViewHolder mSelected = null;
    int mActivePointerId = -1;
    private int mActionState = 0;
    java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> mRecoverAnimations = new java.util.ArrayList();
    final java.lang.Runnable mScrollRunnable = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.1
        @Override // java.lang.Runnable
        public void run() {
            if (androidx.recyclerview.widget.ItemTouchHelper.this.mSelected == null || !androidx.recyclerview.widget.ItemTouchHelper.this.scrollIfNecessary()) {
                return;
            }
            if (androidx.recyclerview.widget.ItemTouchHelper.this.mSelected != null) {
                androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = androidx.recyclerview.widget.ItemTouchHelper.this;
                itemTouchHelper.moveIfNecessary(itemTouchHelper.mSelected);
            }
            androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView.removeCallbacks(androidx.recyclerview.widget.ItemTouchHelper.this.mScrollRunnable);
            androidx.core.view.ViewCompat.postOnAnimation(androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView, this);
        }
    };
    private androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback = null;
    android.view.View mOverdrawChild = null;
    int mOverdrawChildPosition = -1;
    private final androidx.recyclerview.widget.RecyclerView.OnItemTouchListener mOnItemTouchListener = new androidx.recyclerview.widget.RecyclerView.OnItemTouchListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.2
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            int iFindPointerIndex;
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimationFindAnimation;
            androidx.recyclerview.widget.ItemTouchHelper.this.mGestureDetector.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(0);
                androidx.recyclerview.widget.ItemTouchHelper.this.mInitialTouchX = motionEvent.getX();
                androidx.recyclerview.widget.ItemTouchHelper.this.mInitialTouchY = motionEvent.getY();
                androidx.recyclerview.widget.ItemTouchHelper.this.obtainVelocityTracker();
                if (androidx.recyclerview.widget.ItemTouchHelper.this.mSelected == null && (recoverAnimationFindAnimation = androidx.recyclerview.widget.ItemTouchHelper.this.findAnimation(motionEvent)) != null) {
                    androidx.recyclerview.widget.ItemTouchHelper.this.mInitialTouchX -= recoverAnimationFindAnimation.mX;
                    androidx.recyclerview.widget.ItemTouchHelper.this.mInitialTouchY -= recoverAnimationFindAnimation.mY;
                    androidx.recyclerview.widget.ItemTouchHelper.this.endRecoverAnimation(recoverAnimationFindAnimation.mViewHolder, true);
                    if (androidx.recyclerview.widget.ItemTouchHelper.this.mPendingCleanup.remove(recoverAnimationFindAnimation.mViewHolder.itemView)) {
                        androidx.recyclerview.widget.ItemTouchHelper.this.mCallback.clearView(androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView, recoverAnimationFindAnimation.mViewHolder);
                    }
                    androidx.recyclerview.widget.ItemTouchHelper.this.select(recoverAnimationFindAnimation.mViewHolder, recoverAnimationFindAnimation.mActionState);
                    androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = androidx.recyclerview.widget.ItemTouchHelper.this;
                    itemTouchHelper.updateDxDy(motionEvent, itemTouchHelper.mSelectedFlags, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId = -1;
                androidx.recyclerview.widget.ItemTouchHelper.this.select(null, 0);
            } else if (androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId)) >= 0) {
                androidx.recyclerview.widget.ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, iFindPointerIndex);
            }
            if (androidx.recyclerview.widget.ItemTouchHelper.this.mVelocityTracker != null) {
                androidx.recyclerview.widget.ItemTouchHelper.this.mVelocityTracker.addMovement(motionEvent);
            }
            return androidx.recyclerview.widget.ItemTouchHelper.this.mSelected != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            androidx.recyclerview.widget.ItemTouchHelper.this.mGestureDetector.onTouchEvent(motionEvent);
            if (androidx.recyclerview.widget.ItemTouchHelper.this.mVelocityTracker != null) {
                androidx.recyclerview.widget.ItemTouchHelper.this.mVelocityTracker.addMovement(motionEvent);
            }
            if (androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId);
            if (iFindPointerIndex >= 0) {
                androidx.recyclerview.widget.ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, iFindPointerIndex);
            }
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = androidx.recyclerview.widget.ItemTouchHelper.this.mSelected;
            if (viewHolder == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = androidx.recyclerview.widget.ItemTouchHelper.this;
                        itemTouchHelper.updateDxDy(motionEvent, itemTouchHelper.mSelectedFlags, iFindPointerIndex);
                        androidx.recyclerview.widget.ItemTouchHelper.this.moveIfNecessary(viewHolder);
                        androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView.removeCallbacks(androidx.recyclerview.widget.ItemTouchHelper.this.mScrollRunnable);
                        androidx.recyclerview.widget.ItemTouchHelper.this.mScrollRunnable.run();
                        androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId) {
                        androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper2 = androidx.recyclerview.widget.ItemTouchHelper.this;
                        itemTouchHelper2.updateDxDy(motionEvent, itemTouchHelper2.mSelectedFlags, actionIndex);
                        return;
                    }
                    return;
                }
                if (androidx.recyclerview.widget.ItemTouchHelper.this.mVelocityTracker != null) {
                    androidx.recyclerview.widget.ItemTouchHelper.this.mVelocityTracker.clear();
                }
            }
            androidx.recyclerview.widget.ItemTouchHelper.this.select(null, 0);
            androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                androidx.recyclerview.widget.ItemTouchHelper.this.select(null, 0);
            }
        }
    };

    public interface ViewDropHandler {
        void prepareForDrop(android.view.View view, android.view.View view2, int i, int i2);
    }

    private void addChildDrawingOrderCallback() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(android.view.View view) {
    }

    public ItemTouchHelper(androidx.recyclerview.widget.ItemTouchHelper.Callback callback) {
        this.mCallback = callback;
    }

    private static boolean hitTest(android.view.View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public void attachToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            android.content.res.Resources resources = recyclerView.getResources();
            this.mSwipeEscapeVelocity = resources.getDimension(androidx.recyclerview.R.dimen.item_touch_helper_swipe_escape_velocity);
            this.mMaxSwipeVelocity = resources.getDimension(androidx.recyclerview.R.dimen.item_touch_helper_swipe_escape_max_velocity);
            setupCallbacks();
        }
    }

    private void setupCallbacks() {
        this.mSlop = android.view.ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this);
        startGestureDetection();
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(0);
            recoverAnimation.cancel();
            this.mCallback.clearView(this.mRecyclerView, recoverAnimation.mViewHolder);
        }
        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        releaseVelocityTracker();
        stopGestureDetection();
    }

    private void startGestureDetection() {
        this.mItemTouchHelperGestureListener = new androidx.recyclerview.widget.ItemTouchHelper.ItemTouchHelperGestureListener();
        this.mGestureDetector = new androidx.core.view.GestureDetectorCompat(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
    }

    private void stopGestureDetection() {
        androidx.recyclerview.widget.ItemTouchHelper.ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.mItemTouchHelperGestureListener;
        if (itemTouchHelperGestureListener != null) {
            itemTouchHelperGestureListener.doNotReactToLongPress();
            this.mItemTouchHelperGestureListener = null;
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - this.mSelected.itemView.getLeft();
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - this.mSelected.itemView.getTop();
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        float f;
        float f2;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.mCallback.onDrawOver(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        float f;
        float f2;
        this.mOverdrawChildPosition = -1;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.mCallback.onDraw(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    void select(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        boolean z2;
        float fSignum;
        float fSignum2;
        int i2;
        if (viewHolder == this.mSelected && i == this.mActionState) {
            return;
        }
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        int i3 = this.mActionState;
        endRecoverAnimation(viewHolder, true);
        this.mActionState = i;
        if (i == 2) {
            if (viewHolder == null) {
                throw new java.lang.IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.mOverdrawChild = viewHolder.itemView;
            addChildDrawingOrderCallback();
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        final androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = this.mSelected;
        if (viewHolder2 != null) {
            if (viewHolder2.itemView.getParent() != null) {
                int iSwipeIfNecessary = i3 == 2 ? 0 : swipeIfNecessary(viewHolder2);
                releaseVelocityTracker();
                if (iSwipeIfNecessary == 1 || iSwipeIfNecessary == 2) {
                    fSignum = 0.0f;
                    fSignum2 = java.lang.Math.signum(this.mDy) * this.mRecyclerView.getHeight();
                } else if (iSwipeIfNecessary == 4 || iSwipeIfNecessary == 8 || iSwipeIfNecessary == 16 || iSwipeIfNecessary == 32) {
                    fSignum2 = 0.0f;
                    fSignum = java.lang.Math.signum(this.mDx) * this.mRecyclerView.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i3 == 2) {
                    i2 = 8;
                } else {
                    i2 = iSwipeIfNecessary > 0 ? 2 : 4;
                }
                getSelectedDxDy(this.mTmpPosition);
                float[] fArr = this.mTmpPosition;
                float f = fArr[0];
                float f2 = fArr[1];
                final int i5 = iSwipeIfNecessary;
                androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = new androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation(viewHolder2, i2, i3, f, f2, fSignum, fSignum2) { // from class: androidx.recyclerview.widget.ItemTouchHelper.3
                    @Override // androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        super.onAnimationEnd(animator);
                        if (this.mOverridden) {
                            return;
                        }
                        if (i5 <= 0) {
                            androidx.recyclerview.widget.ItemTouchHelper.this.mCallback.clearView(androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView, viewHolder2);
                        } else {
                            androidx.recyclerview.widget.ItemTouchHelper.this.mPendingCleanup.add(viewHolder2.itemView);
                            this.mIsPendingCleanup = true;
                            int i6 = i5;
                            if (i6 > 0) {
                                androidx.recyclerview.widget.ItemTouchHelper.this.postDispatchSwipe(this, i6);
                            }
                        }
                        if (androidx.recyclerview.widget.ItemTouchHelper.this.mOverdrawChild == viewHolder2.itemView) {
                            androidx.recyclerview.widget.ItemTouchHelper.this.removeChildDrawingOrderCallbackIfNecessary(viewHolder2.itemView);
                        }
                    }
                };
                recoverAnimation.setDuration(this.mCallback.getAnimationDuration(this.mRecyclerView, i2, fSignum - f, fSignum2 - f2));
                this.mRecoverAnimations.add(recoverAnimation);
                recoverAnimation.start();
                z = true;
            } else {
                removeChildDrawingOrderCallbackIfNecessary(viewHolder2.itemView);
                this.mCallback.clearView(this.mRecyclerView, viewHolder2);
                z = false;
            }
            this.mSelected = null;
        } else {
            z = false;
        }
        if (viewHolder != null) {
            this.mSelectedFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolder) & i4) >> (this.mActionState * 8);
            this.mSelectedStartX = viewHolder.itemView.getLeft();
            this.mSelectedStartY = viewHolder.itemView.getTop();
            this.mSelected = viewHolder;
            if (i == 2) {
                z2 = false;
                viewHolder.itemView.performHapticFeedback(0);
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        android.view.ViewParent parent = this.mRecyclerView.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.mSelected != null ? true : z2);
        }
        if (!z) {
            this.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.mCallback.onSelectedChanged(this.mSelected, this.mActionState);
        this.mRecyclerView.invalidate();
    }

    void postDispatchSwipe(final androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation, final int i) {
        this.mRecyclerView.post(new java.lang.Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.4
            @Override // java.lang.Runnable
            public void run() {
                if (androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView == null || !androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView.isAttachedToWindow() || recoverAnimation.mOverridden || recoverAnimation.mViewHolder.getAbsoluteAdapterPosition() == -1) {
                    return;
                }
                androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView.getItemAnimator();
                if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !androidx.recyclerview.widget.ItemTouchHelper.this.hasRunningRecoverAnim()) {
                    androidx.recyclerview.widget.ItemTouchHelper.this.mCallback.onSwiped(recoverAnimation.mViewHolder, i);
                } else {
                    androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView.post(this);
                }
            }
        });
    }

    boolean hasRunningRecoverAnim() {
        int size = this.mRecoverAnimations.size();
        for (int i = 0; i < size; i++) {
            if (!this.mRecoverAnimations.get(i).mEnded) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    boolean scrollIfNecessary() {
        int iInterpolateOutOfBoundsScroll;
        int iInterpolateOutOfBoundsScroll2;
        int i;
        int width;
        if (this.mSelected == null) {
            this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = this.mDragScrollStartTimeInMs;
        long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (this.mTmpRect == null) {
            this.mTmpRect = new android.graphics.Rect();
        }
        layoutManager.calculateItemDecorationsForChild(this.mSelected.itemView, this.mTmpRect);
        if (layoutManager.canScrollHorizontally()) {
            int i2 = (int) (this.mSelectedStartX + this.mDx);
            int paddingLeft = (i2 - this.mTmpRect.left) - this.mRecyclerView.getPaddingLeft();
            float f = this.mDx;
            if (f < 0.0f && paddingLeft < 0) {
                iInterpolateOutOfBoundsScroll = paddingLeft;
            } else if (f <= 0.0f || (width = ((i2 + this.mSelected.itemView.getWidth()) + this.mTmpRect.right) - (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight())) <= 0) {
                iInterpolateOutOfBoundsScroll = 0;
            } else {
                iInterpolateOutOfBoundsScroll = width;
            }
        } else {
            iInterpolateOutOfBoundsScroll = 0;
        }
        if (layoutManager.canScrollVertically()) {
            int i3 = (int) (this.mSelectedStartY + this.mDy);
            int paddingTop = (i3 - this.mTmpRect.top) - this.mRecyclerView.getPaddingTop();
            float f2 = this.mDy;
            if (f2 < 0.0f && paddingTop < 0) {
                iInterpolateOutOfBoundsScroll2 = paddingTop;
            } else if (f2 <= 0.0f || (iInterpolateOutOfBoundsScroll2 = ((i3 + this.mSelected.itemView.getHeight()) + this.mTmpRect.bottom) - (this.mRecyclerView.getHeight() - this.mRecyclerView.getPaddingBottom())) <= 0) {
                iInterpolateOutOfBoundsScroll2 = 0;
            }
        } else {
            iInterpolateOutOfBoundsScroll2 = 0;
        }
        if (iInterpolateOutOfBoundsScroll != 0) {
            iInterpolateOutOfBoundsScroll = this.mCallback.interpolateOutOfBoundsScroll(this.mRecyclerView, this.mSelected.itemView.getWidth(), iInterpolateOutOfBoundsScroll, this.mRecyclerView.getWidth(), j2);
        }
        int i4 = iInterpolateOutOfBoundsScroll;
        if (iInterpolateOutOfBoundsScroll2 != 0) {
            i = i4;
            iInterpolateOutOfBoundsScroll2 = this.mCallback.interpolateOutOfBoundsScroll(this.mRecyclerView, this.mSelected.itemView.getHeight(), iInterpolateOutOfBoundsScroll2, this.mRecyclerView.getHeight(), j2);
        } else {
            i = i4;
        }
        if (i != 0 || iInterpolateOutOfBoundsScroll2 != 0) {
            if (this.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
                this.mDragScrollStartTimeInMs = jCurrentTimeMillis;
            }
            this.mRecyclerView.scrollBy(i, iInterpolateOutOfBoundsScroll2);
            return true;
        }
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        return false;
    }

    private java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> findSwapTargets(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = viewHolder;
        java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> list = this.mSwapTargets;
        if (list == null) {
            this.mSwapTargets = new java.util.ArrayList();
            this.mDistances = new java.util.ArrayList();
        } else {
            list.clear();
            this.mDistances.clear();
        }
        int boundingBoxMargin = this.mCallback.getBoundingBoxMargin();
        int iRound = java.lang.Math.round(this.mSelectedStartX + this.mDx) - boundingBoxMargin;
        int iRound2 = java.lang.Math.round(this.mSelectedStartY + this.mDy) - boundingBoxMargin;
        int i = boundingBoxMargin * 2;
        int width = viewHolder2.itemView.getWidth() + iRound + i;
        int height = viewHolder2.itemView.getHeight() + iRound2 + i;
        int i2 = (iRound + width) / 2;
        int i3 = (iRound2 + height) / 2;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            android.view.View childAt = layoutManager.getChildAt(i4);
            if (childAt != viewHolder2.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(childAt);
                if (this.mCallback.canDropOver(this.mRecyclerView, this.mSelected, childViewHolder)) {
                    int iAbs = java.lang.Math.abs(i2 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int iAbs2 = java.lang.Math.abs(i3 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i5 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.mSwapTargets.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > this.mDistances.get(i7).intValue(); i7++) {
                        i6++;
                    }
                    this.mSwapTargets.add(i6, childViewHolder);
                    this.mDistances.add(i6, java.lang.Integer.valueOf(i5));
                }
            }
            i4++;
            viewHolder2 = viewHolder;
        }
        return this.mSwapTargets;
    }

    void moveIfNecessary(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (!this.mRecyclerView.isLayoutRequested() && this.mActionState == 2) {
            float moveThreshold = this.mCallback.getMoveThreshold(viewHolder);
            int i = (int) (this.mSelectedStartX + this.mDx);
            int i2 = (int) (this.mSelectedStartY + this.mDy);
            if (java.lang.Math.abs(i2 - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * moveThreshold || java.lang.Math.abs(i - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * moveThreshold) {
                java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> listFindSwapTargets = findSwapTargets(viewHolder);
                if (listFindSwapTargets.size() == 0) {
                    return;
                }
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderChooseDropTarget = this.mCallback.chooseDropTarget(viewHolder, listFindSwapTargets, i, i2);
                if (viewHolderChooseDropTarget == null) {
                    this.mSwapTargets.clear();
                    this.mDistances.clear();
                    return;
                }
                int absoluteAdapterPosition = viewHolderChooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                if (this.mCallback.onMove(this.mRecyclerView, viewHolder, viewHolderChooseDropTarget)) {
                    this.mCallback.onMoved(this.mRecyclerView, viewHolder, absoluteAdapterPosition2, viewHolderChooseDropTarget, absoluteAdapterPosition, i, i2);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(android.view.View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null && childViewHolder == viewHolder) {
            select(null, 0);
            return;
        }
        endRecoverAnimation(childViewHolder, false);
        if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
            this.mCallback.clearView(this.mRecyclerView, childViewHolder);
        }
    }

    void endRecoverAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder == viewHolder) {
                recoverAnimation.mOverridden |= z;
                if (!recoverAnimation.mEnded) {
                    recoverAnimation.cancel();
                }
                this.mRecoverAnimations.remove(size);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        rect.setEmpty();
    }

    void obtainVelocityTracker() {
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = android.view.VelocityTracker.obtain();
    }

    private void releaseVelocityTracker() {
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private androidx.recyclerview.widget.RecyclerView.ViewHolder findSwipedView(android.view.MotionEvent motionEvent) {
        android.view.View viewFindChildView;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int i = this.mActivePointerId;
        if (i == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(iFindPointerIndex) - this.mInitialTouchX;
        float y = motionEvent.getY(iFindPointerIndex) - this.mInitialTouchY;
        float fAbs = java.lang.Math.abs(x);
        float fAbs2 = java.lang.Math.abs(y);
        int i2 = this.mSlop;
        if (fAbs < i2 && fAbs2 < i2) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewFindChildView = findChildView(motionEvent)) != null) {
            return this.mRecyclerView.getChildViewHolder(viewFindChildView);
        }
        return null;
    }

    void checkSelectForSwipe(int i, android.view.MotionEvent motionEvent, int i2) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderFindSwipedView;
        int absoluteMovementFlags;
        if (this.mSelected != null || i != 2 || this.mActionState == 2 || !this.mCallback.isItemViewSwipeEnabled() || this.mRecyclerView.getScrollState() == 1 || (viewHolderFindSwipedView = findSwipedView(motionEvent)) == null || (absoluteMovementFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolderFindSwipedView) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.mInitialTouchX;
        float f2 = y - this.mInitialTouchY;
        float fAbs = java.lang.Math.abs(f);
        float fAbs2 = java.lang.Math.abs(f2);
        int i3 = this.mSlop;
        if (fAbs >= i3 || fAbs2 >= i3) {
            if (fAbs > fAbs2) {
                if (f < 0.0f && (absoluteMovementFlags & 4) == 0) {
                    return;
                }
                if (f > 0.0f && (absoluteMovementFlags & 8) == 0) {
                    return;
                }
            } else {
                if (f2 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                }
                if (f2 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                    return;
                }
            }
            this.mDy = 0.0f;
            this.mDx = 0.0f;
            this.mActivePointerId = motionEvent.getPointerId(0);
            select(viewHolderFindSwipedView, 1);
        }
    }

    android.view.View findChildView(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null) {
            android.view.View view = viewHolder.itemView;
            if (hitTest(view, x, y, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return view;
            }
        }
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            android.view.View view2 = recoverAnimation.mViewHolder.itemView;
            if (hitTest(view2, x, y, recoverAnimation.mX, recoverAnimation.mY)) {
                return view2;
            }
        }
        return this.mRecyclerView.findChildViewUnder(x, y);
    }

    public void startDrag(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.hasDragFlag(this.mRecyclerView, viewHolder)) {
            android.util.Log.e(TAG, "Start drag has been called but dragging is not enabled");
            return;
        }
        if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            android.util.Log.e(TAG, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        obtainVelocityTracker();
        this.mDy = 0.0f;
        this.mDx = 0.0f;
        select(viewHolder, 2);
    }

    public void startSwipe(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.hasSwipeFlag(this.mRecyclerView, viewHolder)) {
            android.util.Log.e(TAG, "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            android.util.Log.e(TAG, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        obtainVelocityTracker();
        this.mDy = 0.0f;
        this.mDx = 0.0f;
        select(viewHolder, 1);
    }

    androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation findAnimation(android.view.MotionEvent motionEvent) {
        if (this.mRecoverAnimations.isEmpty()) {
            return null;
        }
        android.view.View viewFindChildView = findChildView(motionEvent);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder.itemView == viewFindChildView) {
                return recoverAnimation;
            }
        }
        return null;
    }

    void updateDxDy(android.view.MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.mInitialTouchX;
        this.mDx = f;
        this.mDy = y - this.mInitialTouchY;
        if ((i & 4) == 0) {
            this.mDx = java.lang.Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.mDx = java.lang.Math.min(0.0f, this.mDx);
        }
        if ((i & 1) == 0) {
            this.mDy = java.lang.Math.max(0.0f, this.mDy);
        }
        if ((i & 2) == 0) {
            this.mDy = java.lang.Math.min(0.0f, this.mDy);
        }
    }

    private int swipeIfNecessary(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (this.mActionState == 2) {
            return 0;
        }
        int movementFlags = this.mCallback.getMovementFlags(this.mRecyclerView, viewHolder);
        int iConvertToAbsoluteDirection = (this.mCallback.convertToAbsoluteDirection(movementFlags, androidx.core.view.ViewCompat.getLayoutDirection(this.mRecyclerView)) & 65280) >> 8;
        if (iConvertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags & 65280) >> 8;
        if (java.lang.Math.abs(this.mDx) > java.lang.Math.abs(this.mDy)) {
            int iCheckHorizontalSwipe = checkHorizontalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckHorizontalSwipe > 0) {
                return (i & iCheckHorizontalSwipe) == 0 ? androidx.recyclerview.widget.ItemTouchHelper.Callback.convertToRelativeDirection(iCheckHorizontalSwipe, androidx.core.view.ViewCompat.getLayoutDirection(this.mRecyclerView)) : iCheckHorizontalSwipe;
            }
            int iCheckVerticalSwipe = checkVerticalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckVerticalSwipe > 0) {
                return iCheckVerticalSwipe;
            }
        } else {
            int iCheckVerticalSwipe2 = checkVerticalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckVerticalSwipe2 > 0) {
                return iCheckVerticalSwipe2;
            }
            int iCheckHorizontalSwipe2 = checkHorizontalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckHorizontalSwipe2 > 0) {
                return (i & iCheckHorizontalSwipe2) == 0 ? androidx.recyclerview.widget.ItemTouchHelper.Callback.convertToRelativeDirection(iCheckHorizontalSwipe2, androidx.core.view.ViewCompat.getLayoutDirection(this.mRecyclerView)) : iCheckHorizontalSwipe2;
            }
        }
        return 0;
    }

    private int checkHorizontalSwipe(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.mDx > 0.0f ? 8 : 4;
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i3 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = java.lang.Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && fAbs > java.lang.Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.mRecyclerView.getWidth() * this.mCallback.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || java.lang.Math.abs(this.mDx) <= width) {
            return 0;
        }
        return i2;
    }

    private int checkVerticalSwipe(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.mDy > 0.0f ? 2 : 1;
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i3 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = java.lang.Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && fAbs > java.lang.Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.mRecyclerView.getHeight() * this.mCallback.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || java.lang.Math.abs(this.mDy) <= height) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$5, reason: invalid class name */
    class AnonymousClass5 implements androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback {
        AnonymousClass5() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public int onGetChildDrawingOrder(int i, int i2) {
            if (androidx.recyclerview.widget.ItemTouchHelper.this.mOverdrawChild == null) {
                return i2;
            }
            int iIndexOfChild = androidx.recyclerview.widget.ItemTouchHelper.this.mOverdrawChildPosition;
            if (iIndexOfChild == -1) {
                iIndexOfChild = androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView.indexOfChild(androidx.recyclerview.widget.ItemTouchHelper.this.mOverdrawChild);
                androidx.recyclerview.widget.ItemTouchHelper.this.mOverdrawChildPosition = iIndexOfChild;
            }
            if (i2 == i - 1) {
                return iIndexOfChild;
            }
            return i2 < iIndexOfChild ? i2 : i2 + 1;
        }
    }

    void removeChildDrawingOrderCallbackIfNecessary(android.view.View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
            if (this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback(null);
            }
        }
    }

    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final android.view.animation.Interpolator sDragScrollInterpolator = new android.view.animation.Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper.Callback.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };
        private static final android.view.animation.Interpolator sDragViewScrollCapInterpolator = new android.view.animation.Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper.Callback.2
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        private int mCachedMaxScrollSpeed = -1;

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i5 | i3;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public boolean canDropOver(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & RELATIVE_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i5 | i3;
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public abstract boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2);

        public abstract void onSwiped(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i);

        public static androidx.recyclerview.widget.ItemTouchUIUtil getDefaultUIUtil() {
            return androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE;
        }

        public static int makeMovementFlags(int i, int i2) {
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag(0, i2 | i);
        }

        final int getAbsoluteMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), androidx.core.view.ViewCompat.getLayoutDirection(recyclerView));
        }

        boolean hasDragFlag(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & androidx.recyclerview.widget.ItemTouchHelper.ACTION_MODE_DRAG_MASK) != 0;
        }

        boolean hasSwipeFlag(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 65280) != 0;
        }

        public androidx.recyclerview.widget.RecyclerView.ViewHolder chooseDropTarget(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> list, int i, int i2) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = i + viewHolder.itemView.getWidth();
            int height = i2 + viewHolder.itemView.getHeight();
            int left2 = i - viewHolder.itemView.getLeft();
            int top2 = i2 - viewHolder.itemView.getTop();
            int size = list.size();
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder3 = list.get(i4);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs4 = java.lang.Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (iAbs3 = java.lang.Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i2) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (iAbs2 = java.lang.Math.abs(top)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (iAbs = java.lang.Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs;
                }
            }
            return viewHolder2;
        }

        public void onSelectedChanged(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE.onSelected(viewHolder.itemView);
            }
        }

        private int getMaxDragScroll(androidx.recyclerview.widget.RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(androidx.recyclerview.R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler) {
                ((androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = list.get(i2);
                recoverAnimation.update();
                int iSave = canvas.save();
                onChildDraw(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
        }

        void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = list.get(i2);
                int iSave = canvas.save();
                onChildDrawOver(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation2 = list.get(i3);
                if (recoverAnimation2.mEnded && !recoverAnimation2.mIsPendingCleanup) {
                    list.remove(i3);
                } else if (!recoverAnimation2.mEnded) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE.clearView(viewHolder.itemView);
        }

        public void onChildDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE.onDraw(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE.onDrawOver(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public long getAnimationDuration(androidx.recyclerview.widget.RecyclerView recyclerView, int i, float f, float f2) {
            androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 250L;
            }
            if (i == 8) {
                return itemAnimator.getMoveDuration();
            }
            return itemAnimator.getRemoveDuration();
        }

        public int interpolateOutOfBoundsScroll(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int iSignum = (int) (((int) (((int) java.lang.Math.signum(i2)) * getMaxDragScroll(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(java.lang.Math.min(1.0f, (java.lang.Math.abs(i2) * 1.0f) / i)))) * sDragScrollInterpolator.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
            if (iSignum == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return iSignum;
        }
    }

    public static abstract class SimpleCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int i, int i2) {
            this.mDefaultSwipeDirs = i2;
            this.mDefaultDragDirs = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.mDefaultSwipeDirs = i;
        }

        public void setDefaultDragDirs(int i) {
            this.mDefaultDragDirs = i;
        }

        public int getSwipeDirs(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return this.mDefaultSwipeDirs;
        }

        public int getDragDirs(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return this.mDefaultDragDirs;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }
    }

    private class ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        private boolean mShouldReactToLongPress = true;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent motionEvent) {
            return true;
        }

        ItemTouchHelperGestureListener() {
        }

        void doNotReactToLongPress() {
            this.mShouldReactToLongPress = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(android.view.MotionEvent motionEvent) {
            android.view.View viewFindChildView;
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder;
            if (this.mShouldReactToLongPress && (viewFindChildView = androidx.recyclerview.widget.ItemTouchHelper.this.findChildView(motionEvent)) != null && (childViewHolder = androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView.getChildViewHolder(viewFindChildView)) != null && androidx.recyclerview.widget.ItemTouchHelper.this.mCallback.hasDragFlag(androidx.recyclerview.widget.ItemTouchHelper.this.mRecyclerView, childViewHolder) && motionEvent.getPointerId(0) == androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId) {
                int iFindPointerIndex = motionEvent.findPointerIndex(androidx.recyclerview.widget.ItemTouchHelper.this.mActivePointerId);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                androidx.recyclerview.widget.ItemTouchHelper.this.mInitialTouchX = x;
                androidx.recyclerview.widget.ItemTouchHelper.this.mInitialTouchY = y;
                androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = androidx.recyclerview.widget.ItemTouchHelper.this;
                itemTouchHelper.mDy = 0.0f;
                itemTouchHelper.mDx = 0.0f;
                if (androidx.recyclerview.widget.ItemTouchHelper.this.mCallback.isLongPressDragEnabled()) {
                    androidx.recyclerview.widget.ItemTouchHelper.this.select(childViewHolder, 2);
                }
            }
        }
    }

    static class RecoverAnimation implements android.animation.Animator.AnimatorListener {
        final int mActionState;
        final int mAnimationType;
        private float mFraction;
        boolean mIsPendingCleanup;
        final float mStartDx;
        final float mStartDy;
        final float mTargetX;
        final float mTargetY;
        final android.animation.ValueAnimator mValueAnimator;
        final androidx.recyclerview.widget.RecyclerView.ViewHolder mViewHolder;
        float mX;
        float mY;
        boolean mOverridden = false;
        boolean mEnded = false;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
        }

        RecoverAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.mActionState = i2;
            this.mAnimationType = i;
            this.mViewHolder = viewHolder;
            this.mStartDx = f;
            this.mStartDy = f2;
            this.mTargetX = f3;
            this.mTargetY = f4;
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mValueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.this.setFraction(valueAnimator.getAnimatedFraction());
                }
            });
            valueAnimatorOfFloat.setTarget(viewHolder.itemView);
            valueAnimatorOfFloat.addListener(this);
            setFraction(0.0f);
        }

        public void setDuration(long j) {
            this.mValueAnimator.setDuration(j);
        }

        public void start() {
            this.mViewHolder.setIsRecyclable(false);
            this.mValueAnimator.start();
        }

        public void cancel() {
            this.mValueAnimator.cancel();
        }

        public void setFraction(float f) {
            this.mFraction = f;
        }

        public void update() {
            float f = this.mStartDx;
            float f2 = this.mTargetX;
            if (f == f2) {
                this.mX = this.mViewHolder.itemView.getTranslationX();
            } else {
                this.mX = f + (this.mFraction * (f2 - f));
            }
            float f3 = this.mStartDy;
            float f4 = this.mTargetY;
            if (f3 == f4) {
                this.mY = this.mViewHolder.itemView.getTranslationY();
            } else {
                this.mY = f3 + (this.mFraction * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            if (!this.mEnded) {
                this.mViewHolder.setIsRecyclable(true);
            }
            this.mEnded = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            setFraction(1.0f);
        }
    }
}
