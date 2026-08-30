package androidx.slidingpanelayout.widget;

/* JADX INFO: loaded from: classes3.dex */
public class SlidingPaneLayout extends android.view.ViewGroup implements androidx.customview.widget.Openable {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    public static final int LOCK_MODE_LOCKED = 3;
    public static final int LOCK_MODE_LOCKED_CLOSED = 2;
    public static final int LOCK_MODE_LOCKED_OPEN = 1;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final java.lang.String TAG = "SlidingPaneLayout";
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private boolean mDisplayListReflectionLoaded;
    final androidx.customview.widget.ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    androidx.window.layout.FoldingFeature mFoldingFeature;
    private androidx.slidingpanelayout.widget.FoldingFeatureObserver mFoldingFeatureObserver;
    private java.lang.reflect.Method mGetDisplayList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    boolean mIsUnableToDrag;
    private int mLockMode;
    private androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener mOnFoldingFeatureChangeListener;
    private androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener mPanelSlideListener;
    private final java.util.List<androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener> mPanelSlideListeners;
    private int mParallaxBy;
    private float mParallaxOffset;
    final java.util.ArrayList<androidx.slidingpanelayout.widget.SlidingPaneLayout.DisableLayerRunnable> mPostedRunnables;
    boolean mPreservedOpenState;
    private java.lang.reflect.Field mRecreateDisplayList;
    private android.graphics.drawable.Drawable mShadowDrawableLeft;
    private android.graphics.drawable.Drawable mShadowDrawableRight;
    float mSlideOffset;
    int mSlideRange;
    android.view.View mSlideableView;
    private int mSliderFadeColor;
    private final android.graphics.Rect mTmpRect;

    public interface PanelSlideListener {
        void onPanelClosed(android.view.View view);

        void onPanelOpened(android.view.View view);

        void onPanelSlide(android.view.View view, float f);
    }

    public static class SimplePanelSlideListener implements androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(android.view.View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(android.view.View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(android.view.View view, float f) {
        }
    }

    static {
        sEdgeSizeUsingSystemGestureInsets = android.os.Build.VERSION.SDK_INT >= 29;
    }

    public final void setLockMode(int i) {
        this.mLockMode = i;
    }

    public final int getLockMode() {
        return this.mLockMode;
    }

    public SlidingPaneLayout(android.content.Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSliderFadeColor = 0;
        this.mSlideOffset = 1.0f;
        this.mPanelSlideListeners = new java.util.concurrent.CopyOnWriteArrayList();
        this.mFirstLayout = true;
        this.mTmpRect = new android.graphics.Rect();
        this.mPostedRunnables = new java.util.ArrayList<>();
        this.mOnFoldingFeatureChangeListener = new androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.1
            @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener
            public void onFoldingFeatureChange(androidx.window.layout.FoldingFeature foldingFeature) {
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mFoldingFeature = foldingFeature;
                androidx.transition.ChangeBounds changeBounds = new androidx.transition.ChangeBounds();
                changeBounds.setDuration(300L);
                changeBounds.setInterpolator(androidx.core.view.animation.PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f));
                androidx.transition.TransitionManager.beginDelayedTransition(androidx.slidingpanelayout.widget.SlidingPaneLayout.this, changeBounds);
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.requestLayout();
            }
        };
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, new androidx.slidingpanelayout.widget.SlidingPaneLayout.AccessibilityDelegate());
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
        androidx.customview.widget.ViewDragHelper viewDragHelperCreate = androidx.customview.widget.ViewDragHelper.create(this, 0.5f, new androidx.slidingpanelayout.widget.SlidingPaneLayout.DragHelperCallback());
        this.mDragHelper = viewDragHelperCreate;
        viewDragHelperCreate.setMinVelocity(f * 400.0f);
        setFoldingFeatureObserver(new androidx.slidingpanelayout.widget.FoldingFeatureObserver(androidx.window.layout.WindowInfoTracker.getOrCreate(context), androidx.core.content.ContextCompat.getMainExecutor(context)));
    }

    private void setFoldingFeatureObserver(androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver) {
        this.mFoldingFeatureObserver = foldingFeatureObserver;
        foldingFeatureObserver.setOnFoldingFeatureChangeListener(this.mOnFoldingFeatureChangeListener);
    }

    public void setParallaxDistance(int i) {
        this.mParallaxBy = i;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.mParallaxBy;
    }

    @java.lang.Deprecated
    public void setSliderFadeColor(int i) {
        this.mSliderFadeColor = i;
    }

    @java.lang.Deprecated
    public int getSliderFadeColor() {
        return this.mSliderFadeColor;
    }

    @java.lang.Deprecated
    public void setCoveredFadeColor(int i) {
        this.mCoveredFadeColor = i;
    }

    @java.lang.Deprecated
    public int getCoveredFadeColor() {
        return this.mCoveredFadeColor;
    }

    @java.lang.Deprecated
    public void setPanelSlideListener(androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener2 = this.mPanelSlideListener;
        if (panelSlideListener2 != null) {
            removePanelSlideListener(panelSlideListener2);
        }
        if (panelSlideListener != null) {
            addPanelSlideListener(panelSlideListener);
        }
        this.mPanelSlideListener = panelSlideListener;
    }

    public void addPanelSlideListener(androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener) {
        this.mPanelSlideListeners.add(panelSlideListener);
    }

    public void removePanelSlideListener(androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener) {
        this.mPanelSlideListeners.remove(panelSlideListener);
    }

    void dispatchOnPanelSlide(android.view.View view) {
        java.util.Iterator<androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelSlide(view, this.mSlideOffset);
        }
    }

    void dispatchOnPanelOpened(android.view.View view) {
        java.util.Iterator<androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelOpened(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelClosed(android.view.View view) {
        java.util.Iterator<androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelClosed(view);
        }
        sendAccessibilityEvent(32);
    }

    void updateObscuredViewsVisibility(android.view.View view) {
        int left;
        int right;
        int top;
        int bottom;
        android.view.View childAt;
        android.view.View view2 = view;
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        int width = zIsLayoutRtlSupport ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zIsLayoutRtlSupport ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !viewIsOpaque(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((java.lang.Math.max(zIsLayoutRtlSupport ? paddingLeft : width, childAt.getLeft()) < left || java.lang.Math.max(paddingTop, childAt.getTop()) < top || java.lang.Math.min(zIsLayoutRtlSupport ? width : paddingLeft, childAt.getRight()) > right || java.lang.Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zIsLayoutRtlSupport = zIsLayoutRtlSupport;
        }
    }

    void setAllChildrenVisible() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    private static boolean viewIsOpaque(android.view.View view) {
        return view.isOpaque();
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchBlocker(view), i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        if (view.getParent() instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchBlocker) {
            super.removeView((android.view.View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        android.app.Activity activityOrNull;
        super.onAttachedToWindow();
        this.mFirstLayout = true;
        if (this.mFoldingFeatureObserver == null || (activityOrNull = getActivityOrNull(getContext())) == null) {
            return;
        }
        this.mFoldingFeatureObserver.registerLayoutStateChangeCallback(activityOrNull);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver = this.mFoldingFeatureObserver;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.unregisterLayoutStateChangeCallback();
        }
        int size = this.mPostedRunnables.size();
        for (int i = 0; i < size; i++) {
            this.mPostedRunnables.get(i).run();
        }
        this.mPostedRunnables.clear();
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0088 A[PHI: r15
  0x0088: PHI (r15v5 float) = (r15v1 float), (r15v6 float) binds: [B:19:0x007d, B:21:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int iMax;
        int iMakeMeasureSpec;
        int iMax2;
        int iMakeMeasureSpec2;
        int measuredHeight;
        boolean z;
        int i4;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        ?? r8 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax3 = java.lang.Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            android.util.Log.e(TAG, "onMeasure: More than two child views are not supported.");
        }
        this.mSlideableView = null;
        int i5 = 0;
        boolean z2 = false;
        int i6 = iMax3;
        float f = 0.0f;
        while (true) {
            i3 = 8;
            if (i5 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i5);
            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt.getLayoutParams();
            int i7 = size;
            if (childAt.getVisibility() == 8) {
                layoutParams.dimWhenOffset = r8;
            } else if (layoutParams.weight > 0.0f) {
                f += layoutParams.weight;
                if (layoutParams.width != 0) {
                    iMax2 = java.lang.Math.max(iMax3 - (layoutParams.leftMargin + layoutParams.rightMargin), (int) r8);
                    if (layoutParams.width == -2) {
                        if (mode == 0) {
                            i4 = mode;
                        } else {
                            i4 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMax2, i4);
                    } else if (layoutParams.width == -1) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec2, getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height));
                    int measuredWidth = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = java.lang.Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i6 -= measuredWidth;
                    if (i5 != 0) {
                        if (i6 < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        layoutParams.slideable = z;
                        z2 |= z;
                        if (layoutParams.slideable) {
                            this.mSlideableView = childAt;
                        }
                    }
                }
            } else {
                iMax2 = java.lang.Math.max(iMax3 - (layoutParams.leftMargin + layoutParams.rightMargin), (int) r8);
                if (layoutParams.width == -2) {
                    if (mode == 0) {
                        i4 = mode;
                    } else {
                        i4 = Integer.MIN_VALUE;
                    }
                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMax2, i4);
                } else if (layoutParams.width == -1) {
                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                } else {
                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                childAt.measure(iMakeMeasureSpec2, getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height));
                int measuredWidth2 = childAt.getMeasuredWidth();
                measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > iMin) {
                    if (mode2 == Integer.MIN_VALUE) {
                        iMin = java.lang.Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        iMin = measuredHeight;
                    }
                }
                i6 -= measuredWidth2;
                if (i5 != 0) {
                    if (i6 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    layoutParams.slideable = z;
                    z2 |= z;
                    if (layoutParams.slideable) {
                        this.mSlideableView = childAt;
                    }
                }
            }
            i5++;
            size = i7;
            r8 = 0;
        }
        int i8 = size;
        int i9 = i6;
        if (z2 || f > 0.0f) {
            int i10 = 0;
            while (i10 < childCount) {
                android.view.View childAt2 = getChildAt(i10);
                if (childAt2.getVisibility() != i3) {
                    androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams2 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth3 = layoutParams2.width == 0 && (layoutParams2.weight > 0.0f ? 1 : (layoutParams2.weight == 0.0f ? 0 : -1)) > 0 ? 0 : childAt2.getMeasuredWidth();
                    if (z2) {
                        iMax = iMax3 - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (layoutParams2.weight > 0.0f) {
                        iMax = measuredWidth3 + ((int) ((layoutParams2.weight * java.lang.Math.max(0, i9)) / f));
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth3;
                        iMakeMeasureSpec = 0;
                    }
                    int iMeasureChildHeight = measureChildHeight(childAt2, i2, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iMeasureChildHeight);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = java.lang.Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i10++;
                i3 = 8;
            }
        }
        java.util.ArrayList<android.graphics.Rect> arrayListSplitViewPositions = splitViewPositions();
        if (arrayListSplitViewPositions != null && !z2) {
            for (int i11 = 0; i11 < childCount; i11++) {
                android.view.View childAt3 = getChildAt(i11);
                if (childAt3.getVisibility() != 8) {
                    android.graphics.Rect rect = arrayListSplitViewPositions.get(i11);
                    androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams3 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt3.getLayoutParams();
                    int i12 = layoutParams3.leftMargin + layoutParams3.rightMargin;
                    int iMakeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(android.view.View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), iMakeMeasureSpec3);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (getMinimumWidth(childAt3) != 0 && rect.width() < getMinimumWidth(childAt3))) {
                        childAt3.measure(android.view.View.MeasureSpec.makeMeasureSpec(iMax3 - i12, 1073741824), iMakeMeasureSpec3);
                        if (i11 != 0) {
                            layoutParams3.slideable = true;
                            this.mSlideableView = childAt3;
                            z2 = true;
                        }
                    } else {
                        childAt3.measure(android.view.View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), iMakeMeasureSpec3);
                    }
                }
            }
        }
        setMeasuredDimension(i8, iMin + getPaddingTop() + getPaddingBottom());
        this.mCanSlide = z2;
        if (this.mDragHelper.getViewDragState() == 0 || z2) {
            return;
        }
        this.mDragHelper.abort();
    }

    private static int getMinimumWidth(android.view.View view) {
        if (view instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchBlocker) {
            return androidx.core.view.ViewCompat.getMinimumWidth(((androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchBlocker) view).getChildAt(0));
        }
        return androidx.core.view.ViewCompat.getMinimumWidth(view);
    }

    private static int measureChildHeight(android.view.View view, int i, int i2) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.width == 0 && layoutParams.weight > 0.0f) {
            return getChildMeasureSpec(i, i2, layoutParams.height);
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        int i10 = i3 - i;
        int paddingRight = zIsLayoutRtlSupport ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zIsLayoutRtlSupport ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.mFirstLayout) {
            this.mSlideOffset = (this.mCanSlide && this.mPreservedOpenState) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        int i12 = 0;
        while (i12 < childCount) {
            android.view.View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                i5 = i11;
            } else {
                androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.slideable) {
                    int i13 = i10 - paddingLeft;
                    int iMin = (java.lang.Math.min(paddingRight, i13) - i11) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.mSlideRange = iMin;
                    int i14 = zIsLayoutRtlSupport ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.dimWhenOffset = ((i11 + i14) + iMin) + (measuredWidth / 2) > i13;
                    int i15 = (int) (iMin * this.mSlideOffset);
                    this.mSlideOffset = i15 / this.mSlideRange;
                    i5 = i11 + i14 + i15;
                    i6 = 0;
                } else if (!this.mCanSlide || (i7 = this.mParallaxBy) == 0) {
                    i5 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.mSlideOffset) * i7);
                    i5 = paddingRight;
                }
                if (zIsLayoutRtlSupport) {
                    i9 = (i10 - i5) + i6;
                    i8 = i9 - measuredWidth;
                } else {
                    i8 = i5 - i6;
                    i9 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                androidx.window.layout.FoldingFeature foldingFeature = this.mFoldingFeature;
                paddingRight += childAt.getWidth() + java.lang.Math.abs((foldingFeature != null && foldingFeature.getOrientation() == androidx.window.layout.FoldingFeature.Orientation.VERTICAL && this.mFoldingFeature.isSeparating()) ? this.mFoldingFeature.getBounds().width() : 0);
            }
            i12++;
            i11 = i5;
        }
        if (this.mFirstLayout) {
            if (this.mCanSlide && this.mParallaxBy != 0) {
                parallaxOtherViews(this.mSlideOffset);
            }
            updateObscuredViewsVisibility(this.mSlideableView);
        }
        this.mFirstLayout = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.mFirstLayout = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.mCanSlide) {
            return;
        }
        this.mPreservedOpenState = view == this.mSlideableView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.mCanSlide && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.mPreservedOpenState = this.mDragHelper.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.mCanSlide || (this.mIsUnableToDrag && actionMasked != 0)) {
            this.mDragHelper.cancel();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.mDragHelper.cancel();
            return false;
        }
        if (actionMasked == 0) {
            this.mIsUnableToDrag = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
            if (this.mDragHelper.isViewUnder(this.mSlideableView, (int) x, (int) y) && isDimmed(this.mSlideableView)) {
                z = true;
            }
            return this.mDragHelper.shouldInterceptTouchEvent(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float fAbs = java.lang.Math.abs(x2 - this.mInitialMotionX);
            float fAbs2 = java.lang.Math.abs(y2 - this.mInitialMotionY);
            if (fAbs > this.mDragHelper.getTouchSlop() && fAbs2 > fAbs) {
                this.mDragHelper.cancel();
                this.mIsUnableToDrag = true;
                return false;
            }
        }
        z = false;
        if (this.mDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDragHelper.processTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
        } else if (actionMasked == 1 && isDimmed(this.mSlideableView)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.mInitialMotionX;
            float f2 = y2 - this.mInitialMotionY;
            int touchSlop = this.mDragHelper.getTouchSlop();
            if ((f * f) + (f2 * f2) < touchSlop * touchSlop && this.mDragHelper.isViewUnder(this.mSlideableView, (int) x2, (int) y2)) {
                closePane(0);
            }
        }
        return true;
    }

    private boolean closePane(int i) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = false;
        }
        if (!this.mFirstLayout && !smoothSlideTo(1.0f, i)) {
            return false;
        }
        this.mPreservedOpenState = false;
        return true;
    }

    private boolean openPane(int i) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = true;
        }
        if (!this.mFirstLayout && !smoothSlideTo(0.0f, i)) {
            return false;
        }
        this.mPreservedOpenState = true;
        return true;
    }

    @java.lang.Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openPane();
    }

    public boolean openPane() {
        return openPane(0);
    }

    @java.lang.Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closePane();
    }

    public boolean closePane() {
        return closePane(0);
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return !this.mCanSlide || this.mSlideOffset == 0.0f;
    }

    @java.lang.Deprecated
    public boolean canSlide() {
        return this.mCanSlide;
    }

    public boolean isSlideable() {
        return this.mCanSlide;
    }

    void onPanelDragged(int i) {
        if (this.mSlideableView == null) {
            this.mSlideOffset = 0.0f;
            return;
        }
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) this.mSlideableView.getLayoutParams();
        int width = this.mSlideableView.getWidth();
        if (zIsLayoutRtlSupport) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((zIsLayoutRtlSupport ? getPaddingRight() : getPaddingLeft()) + (zIsLayoutRtlSupport ? layoutParams.rightMargin : layoutParams.leftMargin))) / this.mSlideRange;
        this.mSlideOffset = paddingRight;
        if (this.mParallaxBy != 0) {
            parallaxOtherViews(paddingRight);
        }
        dispatchOnPanelSlide(this.mSlideableView);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        if (isLayoutRtlSupport() ^ isOpen()) {
            this.mDragHelper.setEdgeTrackingEnabled(1);
            androidx.core.graphics.Insets systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                androidx.customview.widget.ViewDragHelper viewDragHelper = this.mDragHelper;
                viewDragHelper.setEdgeSize(java.lang.Math.max(viewDragHelper.getDefaultEdgeSize(), systemGestureInsets.left));
            }
        } else {
            this.mDragHelper.setEdgeTrackingEnabled(2);
            androidx.core.graphics.Insets systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                androidx.customview.widget.ViewDragHelper viewDragHelper2 = this.mDragHelper;
                viewDragHelper2.setEdgeSize(java.lang.Math.max(viewDragHelper2.getDefaultEdgeSize(), systemGestureInsets2.right));
            }
        }
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.mCanSlide && !layoutParams.slideable && this.mSlideableView != null) {
            canvas.getClipBounds(this.mTmpRect);
            if (isLayoutRtlSupport()) {
                android.graphics.Rect rect = this.mTmpRect;
                rect.left = java.lang.Math.max(rect.left, this.mSlideableView.getRight());
            } else {
                android.graphics.Rect rect2 = this.mTmpRect;
                rect2.right = java.lang.Math.min(rect2.right, this.mSlideableView.getLeft());
            }
            canvas.clipRect(this.mTmpRect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    private androidx.core.graphics.Insets getSystemGestureInsets() {
        androidx.core.view.WindowInsetsCompat rootWindowInsets;
        if (!sEdgeSizeUsingSystemGestureInsets || (rootWindowInsets = androidx.core.view.ViewCompat.getRootWindowInsets(this)) == null) {
            return null;
        }
        return rootWindowInsets.getSystemGestureInsets();
    }

    void invalidateChildRegion(android.view.View view) {
        androidx.core.view.ViewCompat.setLayerPaint(view, ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).dimPaint);
    }

    boolean smoothSlideTo(float f, int i) {
        int paddingLeft;
        if (!this.mCanSlide) {
            return false;
        }
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) this.mSlideableView.getLayoutParams();
        if (zIsLayoutRtlSupport) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + layoutParams.rightMargin) + (f * this.mSlideRange)) + this.mSlideableView.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + layoutParams.leftMargin + (f * this.mSlideRange));
        }
        androidx.customview.widget.ViewDragHelper viewDragHelper = this.mDragHelper;
        android.view.View view = this.mSlideableView;
        if (!viewDragHelper.smoothSlideViewTo(view, paddingLeft, view.getTop())) {
            return false;
        }
        setAllChildrenVisible();
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mDragHelper.continueSettling(true)) {
            if (!this.mCanSlide) {
                this.mDragHelper.abort();
            } else {
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
            }
        }
    }

    @java.lang.Deprecated
    public void setShadowDrawable(android.graphics.drawable.Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(android.graphics.drawable.Drawable drawable) {
        this.mShadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(android.graphics.drawable.Drawable drawable) {
        this.mShadowDrawableRight = drawable;
    }

    @java.lang.Deprecated
    public void setShadowResource(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        int i;
        int right;
        super.draw(canvas);
        if (isLayoutRtlSupport()) {
            drawable = this.mShadowDrawableRight;
        } else {
            drawable = this.mShadowDrawableLeft;
        }
        android.view.View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (isLayoutRtlSupport()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    private void parallaxOtherViews(float f) {
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt != this.mSlideableView) {
                float f2 = 1.0f - this.mParallaxOffset;
                int i2 = this.mParallaxBy;
                this.mParallaxOffset = f;
                int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
                if (zIsLayoutRtlSupport) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    protected boolean canScroll(android.view.View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            if (view.canScrollHorizontally(isLayoutRtlSupport() ? i : -i)) {
                return true;
            }
        }
        return false;
    }

    boolean isDimmed(android.view.View view) {
        if (view == null) {
            return false;
        }
        return this.mCanSlide && ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).dimWhenOffset && this.mSlideOffset > 0.0f;
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState savedState = new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(super.onSaveInstanceState());
        savedState.isOpen = isSlideable() ? isOpen() : this.mPreservedOpenState;
        savedState.mLockMode = this.mLockMode;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState savedState = (androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.isOpen) {
            openPane();
        } else {
            closePane();
        }
        this.mPreservedOpenState = savedState.isOpen;
        setLockMode(savedState.mLockMode);
    }

    private class DragHelperCallback extends androidx.customview.widget.ViewDragHelper.Callback {
        DragHelperCallback() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(android.view.View view, int i) {
            if (isDraggable()) {
                return ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).slideable;
            }
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mDragHelper.getViewDragState() == 0) {
                if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideOffset == 1.0f) {
                    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = androidx.slidingpanelayout.widget.SlidingPaneLayout.this;
                    slidingPaneLayout.updateObscuredViewsVisibility(slidingPaneLayout.mSlideableView);
                    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout2 = androidx.slidingpanelayout.widget.SlidingPaneLayout.this;
                    slidingPaneLayout2.dispatchOnPanelClosed(slidingPaneLayout2.mSlideableView);
                    androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mPreservedOpenState = false;
                    return;
                }
                androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout3 = androidx.slidingpanelayout.widget.SlidingPaneLayout.this;
                slidingPaneLayout3.dispatchOnPanelOpened(slidingPaneLayout3.mSlideableView);
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mPreservedOpenState = true;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(android.view.View view, int i) {
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.setAllChildrenVisible();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.onPanelDragged(i);
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(android.view.View view, float f, float f2) {
            int paddingLeft;
            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int paddingRight = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingRight += androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideRange;
                }
                paddingLeft = (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getWidth() - paddingRight) - androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideableView.getWidth();
            } else {
                paddingLeft = layoutParams.leftMargin + androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingLeft += androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideRange;
                }
            }
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mDragHelper.settleCapturedViewAt(paddingLeft, view.getTop());
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(android.view.View view) {
            return androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideRange;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideableView.getLayoutParams();
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int width = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getWidth() - ((androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideableView.getWidth());
                return java.lang.Math.max(java.lang.Math.min(i, width), width - androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideRange);
            }
            int paddingLeft = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return java.lang.Math.min(java.lang.Math.max(i, paddingLeft), androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideRange + paddingLeft);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(android.view.View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int i, int i2) {
            if (isDraggable()) {
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mDragHelper.captureChildView(androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideableView, i2);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            if (isDraggable()) {
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mDragHelper.captureChildView(androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideableView, i2);
            }
        }

        private boolean isDraggable() {
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mIsUnableToDrag || androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getLockMode() == 3) {
                return false;
            }
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.isOpen() && androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return androidx.slidingpanelayout.widget.SlidingPaneLayout.this.isOpen() || androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getLockMode() != 2;
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private static final int[] ATTRS = {android.R.attr.layout_weight};
        android.graphics.Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.weight = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.weight = 0.0f;
            this.weight = layoutParams.weight;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
            this.weight = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState[] newArray(int i) {
                return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState[i];
            }
        };
        boolean isOpen;
        int mLockMode;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isOpen = parcel.readInt() != 0;
            this.mLockMode = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.isOpen ? 1 : 0);
            parcel.writeInt(this.mLockMode);
        }
    }

    class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final android.graphics.Rect mTmpRect = new android.graphics.Rect();

        AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
            copyNodeInfoNoChildren(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatObtain);
            accessibilityNodeInfoCompatObtain.recycle();
            accessibilityNodeInfoCompat.setClassName(androidx.slidingpanelayout.widget.SlidingPaneLayout.ACCESSIBILITY_CLASS_NAME);
            accessibilityNodeInfoCompat.setSource(view);
            java.lang.Object parentForAccessibility = androidx.core.view.ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof android.view.View) {
                accessibilityNodeInfoCompat.setParent((android.view.View) parentForAccessibility);
            }
            int childCount = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getChildAt(i);
                if (!filter(childAt) && childAt.getVisibility() == 0) {
                    androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(androidx.slidingpanelayout.widget.SlidingPaneLayout.ACCESSIBILITY_CLASS_NAME);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            if (filter(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean filter(android.view.View view) {
            return androidx.slidingpanelayout.widget.SlidingPaneLayout.this.isDimmed(view);
        }

        private void copyNodeInfoNoChildren(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            android.graphics.Rect rect = this.mTmpRect;
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat2.getMovementGranularities());
        }
    }

    private static class TouchBlocker extends android.widget.FrameLayout {
        @Override // android.view.View
        public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            return true;
        }

        TouchBlocker(android.view.View view) {
            super(view.getContext());
            addView(view);
        }
    }

    private class DisableLayerRunnable implements java.lang.Runnable {
        final android.view.View mChildView;

        DisableLayerRunnable(android.view.View view) {
            this.mChildView = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mChildView.getParent() == androidx.slidingpanelayout.widget.SlidingPaneLayout.this) {
                this.mChildView.setLayerType(0, null);
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.invalidateChildRegion(this.mChildView);
            }
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mPostedRunnables.remove(this);
        }
    }

    boolean isLayoutRtlSupport() {
        return androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
    }

    private java.util.ArrayList<android.graphics.Rect> splitViewPositions() {
        android.graphics.Rect foldBoundsInView;
        androidx.window.layout.FoldingFeature foldingFeature = this.mFoldingFeature;
        if (foldingFeature == null || !foldingFeature.isSeparating() || this.mFoldingFeature.getBounds().left == 0 || this.mFoldingFeature.getBounds().top != 0 || (foldBoundsInView = getFoldBoundsInView(this.mFoldingFeature, this)) == null) {
            return null;
        }
        android.graphics.Rect rect = new android.graphics.Rect(getPaddingLeft(), getPaddingTop(), java.lang.Math.max(getPaddingLeft(), foldBoundsInView.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new java.util.ArrayList<>(java.util.Arrays.asList(rect, new android.graphics.Rect(java.lang.Math.min(width, foldBoundsInView.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    private static android.graphics.Rect getFoldBoundsInView(androidx.window.layout.FoldingFeature foldingFeature, android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        android.graphics.Rect rect = new android.graphics.Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getWidth());
        android.graphics.Rect rect2 = new android.graphics.Rect(foldingFeature.getBounds());
        boolean zIntersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !zIntersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private static android.app.Activity getActivityOrNull(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
