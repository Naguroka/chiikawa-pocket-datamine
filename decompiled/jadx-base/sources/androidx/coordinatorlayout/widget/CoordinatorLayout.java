package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements androidx.core.view.NestedScrollingParent2, androidx.core.view.NestedScrollingParent3 {
    static final java.lang.Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final java.lang.String TAG = "CoordinatorLayout";
    static final java.util.Comparator<android.view.View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final java.lang.String WIDGET_PACKAGE_NAME;
    static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior>>> sConstructors;
    private static final androidx.core.util.Pools.Pool<android.graphics.Rect> sRectPool;
    private androidx.core.view.OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private android.view.View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> mChildDag;
    private final java.util.List<android.view.View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private androidx.core.view.WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final androidx.core.view.NestedScrollingParentHelper mNestedScrollingParentHelper;
    private android.view.View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private androidx.coordinatorlayout.widget.CoordinatorLayout.OnPreDrawListener mOnPreDrawListener;
    private android.graphics.Paint mScrimPaint;
    private android.graphics.drawable.Drawable mStatusBarBackground;
    private final java.util.List<android.view.View> mTempDependenciesList;
    private final java.util.List<android.view.View> mTempList1;

    public interface AttachedBehavior {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.Deprecated
    public @interface DefaultBehavior {
        java.lang.Class<? extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior> value();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DispatchChangeEvent {
    }

    private static int clamp(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    private static int resolveAnchoredChildGravity(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int resolveGravity(int i) {
        if ((i & 7) == 0) {
            i |= androidx.core.view.GravityCompat.START;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int resolveKeylineGravity(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    static {
        java.lang.Package r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new androidx.coordinatorlayout.widget.CoordinatorLayout.ViewElevationComparator();
        CONSTRUCTOR_PARAMS = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class};
        sConstructors = new java.lang.ThreadLocal<>();
        sRectPool = new androidx.core.util.Pools.SynchronizedPool(12);
    }

    private static android.graphics.Rect acquireTempRect() {
        android.graphics.Rect rectAcquire = sRectPool.acquire();
        return rectAcquire == null ? new android.graphics.Rect() : rectAcquire;
    }

    private static void releaseTempRect(android.graphics.Rect rect) {
        rect.setEmpty();
        sRectPool.release(rect);
    }

    public CoordinatorLayout(android.content.Context context) {
        this(context, null);
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.coordinatorlayout.R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.mDependencySortedChildren = new java.util.ArrayList();
        this.mChildDag = new androidx.coordinatorlayout.widget.DirectedAcyclicGraph<>();
        this.mTempList1 = new java.util.ArrayList();
        this.mTempDependenciesList = new java.util.ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new androidx.core.view.NestedScrollingParentHelper(this);
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.coordinatorlayout.R.styleable.CoordinatorLayout, 0, androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.coordinatorlayout.R.styleable.CoordinatorLayout, i, 0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, androidx.coordinatorlayout.R.styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, androidx.coordinatorlayout.R.styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            android.content.res.Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.mKeylines;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.mStatusBarBackground = typedArrayObtainStyledAttributes.getDrawable(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new androidx.coordinatorlayout.widget.CoordinatorLayout.HierarchyChangeListener());
        if (androidx.core.view.ViewCompat.getImportantForAccessibility(this) == 0) {
            androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new androidx.coordinatorlayout.widget.CoordinatorLayout.OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && androidx.core.view.ViewCompat.getFitsSystemWindows(this)) {
            androidx.core.view.ViewCompat.requestApplyInsets(this);
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        android.view.View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            android.graphics.drawable.Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(this.mStatusBarBackground, androidx.core.view.ViewCompat.getLayoutDirection(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public android.graphics.drawable.Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.mStatusBarBackground;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        android.graphics.drawable.Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.mStatusBarBackground.setVisible(z, false);
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? androidx.core.content.ContextCompat.getDrawable(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new android.graphics.drawable.ColorDrawable(i));
    }

    final androidx.core.view.WindowInsetsCompat setWindowInsets(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        if (androidx.core.util.ObjectsCompat.equals(this.mLastInsets, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.mLastInsets = windowInsetsCompat;
        boolean z = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        this.mDrawStatusBarBackground = z;
        setWillNotDraw(!z && getBackground() == null);
        androidx.core.view.WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatDispatchApplyWindowInsetsToBehaviors;
    }

    public final androidx.core.view.WindowInsetsCompat getLastWindowInsets() {
        return this.mLastInsets;
    }

    private void resetTouchBehaviors(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    behavior.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) getChildAt(i2).getLayoutParams()).resetTouchBehaviorTracking();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private void getTopSortedChildren(java.util.List<android.view.View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        java.util.Comparator<android.view.View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            java.util.Collections.sort(list, comparator);
        }
    }

    private boolean performIntercept(android.view.MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        java.util.List<android.view.View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        android.view.MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            android.view.View view = list.get(i2);
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = layoutParams.getBehavior();
            if (!(zOnInterceptTouchEvent || z) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && behavior != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = behavior.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = behavior.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean zDidBlockInteraction = layoutParams.didBlockInteraction();
                boolean zIsBlockingInteractionBelow = layoutParams.isBlockingInteractionBelow(this, view);
                z = zIsBlockingInteractionBelow && !zDidBlockInteraction;
                if (zIsBlockingInteractionBelow && !z) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                    motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    behavior.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean zPerformIntercept = performIntercept(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            resetTouchBehaviors(true);
        }
        return zPerformIntercept;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r3
  0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean zPerformIntercept;
        boolean zOnTouchEvent;
        android.view.MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zPerformIntercept = performIntercept(motionEvent, 1);
            if (!zPerformIntercept) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zPerformIntercept) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                resetTouchBehaviors(false);
            }
            return zOnTouchEvent;
        }
        zPerformIntercept = false;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) this.mBehaviorTouchView.getLayoutParams()).getBehavior();
        if (behavior != null) {
            zOnTouchEvent = behavior.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zPerformIntercept) {
            long jUptimeMillis2 = android.os.SystemClock.uptimeMillis();
            motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            resetTouchBehaviors(false);
        } else {
            resetTouchBehaviors(false);
        }
        return zOnTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        resetTouchBehaviors(false);
        this.mDisallowInterceptReset = true;
    }

    private int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            android.util.Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i < 0 || i >= iArr.length) {
            android.util.Log.e(TAG, "Keyline index " + i + " out of range for " + this);
            return 0;
        }
        return iArr[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    static androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior parseBehavior(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            java.lang.String str2 = WIDGET_PACKAGE_NAME;
            if (!android.text.TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior>>> threadLocal = sConstructors;
            java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new java.util.HashMap<>();
                threadLocal.set(map);
            }
            java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = java.lang.Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams getResolvedLayoutParams(android.view.View view) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (!layoutParams.mBehaviorResolved) {
            if (view instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    android.util.Log.e(TAG, "Attached behavior class is null");
                }
                layoutParams.setBehavior(behavior);
                layoutParams.mBehaviorResolved = true;
            } else {
                androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior defaultBehavior = null;
                for (java.lang.Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    defaultBehavior = (androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior) superclass.getAnnotation(androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        layoutParams.setBehavior(defaultBehavior.value().getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                    } catch (java.lang.Exception e) {
                        android.util.Log.e(TAG, "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                layoutParams.mBehaviorResolved = true;
            }
        }
        return layoutParams;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.findAnchorView(this, childAt);
            this.mChildDag.addNode(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    android.view.View childAt2 = getChildAt(i2);
                    if (resolvedLayoutParams.dependsOn(this, childAt, childAt2)) {
                        if (!this.mChildDag.contains(childAt2)) {
                            this.mChildDag.addNode(childAt2);
                        }
                        this.mChildDag.addEdge(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.getSortedList());
        java.util.Collections.reverse(this.mDependencySortedChildren);
    }

    void getDescendantRect(android.view.View view, android.graphics.Rect rect) {
        androidx.coordinatorlayout.widget.ViewGroupUtils.getDescendantRect(this, view, rect);
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return java.lang.Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return java.lang.Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public void onMeasureChild(android.view.View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:45:0x011f  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        prepareChildren();
        ensurePreDrawListener();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        boolean z = layoutDirection == 1;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int i10 = paddingLeft + paddingRight;
        int i11 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z2 = this.mLastInsets != null && androidx.core.view.ViewCompat.getFitsSystemWindows(this);
        int size3 = this.mDependencySortedChildren.size();
        int i12 = suggestedMinimumWidth;
        int i13 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i14 = 0;
        while (i14 < size3) {
            android.view.View view = this.mDependencySortedChildren.get(i14);
            if (view.getVisibility() == 8) {
                i8 = i14;
                i5 = size3;
                i6 = paddingLeft;
            } else {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
                if (layoutParams2.keyline < 0 || mode == 0) {
                    i3 = iCombineMeasuredStates;
                } else {
                    int keyline = getKeyline(layoutParams2.keyline);
                    int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutParams2.gravity), layoutDirection) & 7;
                    i3 = iCombineMeasuredStates;
                    if ((absoluteGravity == 3 && !z) || (absoluteGravity == 5 && z)) {
                        iMax = java.lang.Math.max(0, (size - paddingRight) - keyline);
                    } else if ((absoluteGravity == 5 && !z) || (absoluteGravity == 3 && z)) {
                        iMax = java.lang.Math.max(0, keyline - paddingLeft);
                    }
                    if (z2 || androidx.core.view.ViewCompat.getFitsSystemWindows(view)) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        int systemWindowInsetLeft = this.mLastInsets.getSystemWindowInsetLeft() + this.mLastInsets.getSystemWindowInsetRight();
                        int systemWindowInsetTop = this.mLastInsets.getSystemWindowInsetTop() + this.mLastInsets.getSystemWindowInsetBottom();
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(size - systemWindowInsetLeft, mode);
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(size2 - systemWindowInsetTop, mode2);
                    }
                    behavior = layoutParams2.getBehavior();
                    if (behavior != null) {
                        layoutParams = layoutParams2;
                        i7 = i3;
                        i8 = i14;
                        i4 = i13;
                        i6 = paddingLeft;
                        i9 = i12;
                        i5 = size3;
                        if (!behavior.onMeasureChild(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                        }
                        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams3 = layoutParams;
                        int iMax2 = java.lang.Math.max(i9, i10 + view.getMeasuredWidth() + layoutParams3.leftMargin + layoutParams3.rightMargin);
                        int iMax3 = java.lang.Math.max(i4, i11 + view.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin);
                        iCombineMeasuredStates = android.view.View.combineMeasuredStates(i7, view.getMeasuredState());
                        i12 = iMax2;
                        i13 = iMax3;
                    } else {
                        layoutParams = layoutParams2;
                        i4 = i13;
                        i5 = size3;
                        i6 = paddingLeft;
                        i7 = i3;
                        i8 = i14;
                        i9 = i12;
                    }
                    onMeasureChild(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams4 = layoutParams;
                    int iMax4 = java.lang.Math.max(i9, i10 + view.getMeasuredWidth() + layoutParams4.leftMargin + layoutParams4.rightMargin);
                    int iMax5 = java.lang.Math.max(i4, i11 + view.getMeasuredHeight() + layoutParams4.topMargin + layoutParams4.bottomMargin);
                    iCombineMeasuredStates = android.view.View.combineMeasuredStates(i7, view.getMeasuredState());
                    i12 = iMax4;
                    i13 = iMax5;
                }
                iMax = 0;
                if (z2) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                behavior = layoutParams2.getBehavior();
                if (behavior != null) {
                    layoutParams = layoutParams2;
                    i7 = i3;
                    i8 = i14;
                    i4 = i13;
                    i6 = paddingLeft;
                    i9 = i12;
                    i5 = size3;
                    if (!behavior.onMeasureChild(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                    }
                    androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams5 = layoutParams;
                    int iMax6 = java.lang.Math.max(i9, i10 + view.getMeasuredWidth() + layoutParams5.leftMargin + layoutParams5.rightMargin);
                    int iMax7 = java.lang.Math.max(i4, i11 + view.getMeasuredHeight() + layoutParams5.topMargin + layoutParams5.bottomMargin);
                    iCombineMeasuredStates = android.view.View.combineMeasuredStates(i7, view.getMeasuredState());
                    i12 = iMax6;
                    i13 = iMax7;
                } else {
                    layoutParams = layoutParams2;
                    i4 = i13;
                    i5 = size3;
                    i6 = paddingLeft;
                    i7 = i3;
                    i8 = i14;
                    i9 = i12;
                }
                onMeasureChild(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams6 = layoutParams;
                int iMax8 = java.lang.Math.max(i9, i10 + view.getMeasuredWidth() + layoutParams6.leftMargin + layoutParams6.rightMargin);
                int iMax9 = java.lang.Math.max(i4, i11 + view.getMeasuredHeight() + layoutParams6.topMargin + layoutParams6.bottomMargin);
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(i7, view.getMeasuredState());
                i12 = iMax8;
                i13 = iMax9;
            }
            i14 = i8 + 1;
            paddingLeft = i6;
            size3 = i5;
        }
        int i15 = iCombineMeasuredStates;
        setMeasuredDimension(android.view.View.resolveSizeAndState(i12, i, (-16777216) & i15), android.view.View.resolveSizeAndState(i13, i2, i15 << 16));
    }

    private androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (androidx.core.view.ViewCompat.getFitsSystemWindows(childAt) && (behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior()) != null) {
                windowInsetsCompat = behavior.onApplyWindowInsets(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    break;
                }
            }
        }
        return windowInsetsCompat;
    }

    public void onLayoutChild(android.view.View view, int i) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.checkAnchorChanged()) {
            throw new java.lang.IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (layoutParams.mAnchorView != null) {
            layoutChildWithAnchor(view, layoutParams.mAnchorView, i);
        } else if (layoutParams.keyline >= 0) {
            layoutChildWithKeyline(view, layoutParams.keyline, i);
        } else {
            layoutChild(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            android.view.View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getBehavior()) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    void recordLastChildRect(android.view.View view, android.graphics.Rect rect) {
        ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).setLastChildRect(rect);
    }

    void getLastChildRect(android.view.View view, android.graphics.Rect rect) {
        rect.set(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getLastChildRect());
    }

    void getChildRect(android.view.View view, boolean z, android.graphics.Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(android.view.View view, int i, android.graphics.Rect rect, android.graphics.Rect rect2, androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams, int i2, int i3) {
        int iWidth;
        int iHeight;
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(resolveAnchoredChildGravity(layoutParams.gravity), i);
        int absoluteGravity2 = androidx.core.view.GravityCompat.getAbsoluteGravity(resolveGravity(layoutParams.anchorGravity), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int i6 = absoluteGravity2 & 7;
        int i7 = absoluteGravity2 & 112;
        if (i6 == 1) {
            iWidth = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            iWidth = rect.left;
        } else {
            iWidth = rect.right;
        }
        if (i7 == 16) {
            iHeight = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            iHeight = rect.top;
        } else {
            iHeight = rect.bottom;
        }
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    private void constrainChildRect(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams, android.graphics.Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = java.lang.Math.max(getPaddingLeft() + layoutParams.leftMargin, java.lang.Math.min(rect.left, ((width - getPaddingRight()) - i) - layoutParams.rightMargin));
        int iMax2 = java.lang.Math.max(getPaddingTop() + layoutParams.topMargin, java.lang.Math.min(rect.top, ((height - getPaddingBottom()) - i2) - layoutParams.bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    void getDesiredAnchoredChildRect(android.view.View view, int i, android.graphics.Rect rect, android.graphics.Rect rect2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect2, layoutParams, measuredWidth, measuredHeight);
        constrainChildRect(layoutParams, rect2, measuredWidth, measuredHeight);
    }

    private void layoutChildWithAnchor(android.view.View view, android.view.View view2, int i) {
        android.graphics.Rect rectAcquireTempRect = acquireTempRect();
        android.graphics.Rect rectAcquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, rectAcquireTempRect);
            getDesiredAnchoredChildRect(view, i, rectAcquireTempRect, rectAcquireTempRect2);
            view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(android.view.View view, int i, int i2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutParams.gravity), i2);
        int i3 = absoluteGravity & 7;
        int i4 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int keyline = getKeyline(i) - measuredWidth;
        if (i3 == 1) {
            keyline += measuredWidth / 2;
        } else if (i3 == 5) {
            keyline += measuredWidth;
        }
        int i5 = 0;
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int iMax = java.lang.Math.max(getPaddingLeft() + layoutParams.leftMargin, java.lang.Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - layoutParams.rightMargin));
        int iMax2 = java.lang.Math.max(getPaddingTop() + layoutParams.topMargin, java.lang.Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void layoutChild(android.view.View view, int i) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        android.graphics.Rect rectAcquireTempRect = acquireTempRect();
        rectAcquireTempRect.set(getPaddingLeft() + layoutParams.leftMargin, getPaddingTop() + layoutParams.topMargin, (getWidth() - getPaddingRight()) - layoutParams.rightMargin, (getHeight() - getPaddingBottom()) - layoutParams.bottomMargin);
        if (this.mLastInsets != null && androidx.core.view.ViewCompat.getFitsSystemWindows(this) && !androidx.core.view.ViewCompat.getFitsSystemWindows(view)) {
            rectAcquireTempRect.left += this.mLastInsets.getSystemWindowInsetLeft();
            rectAcquireTempRect.top += this.mLastInsets.getSystemWindowInsetTop();
            rectAcquireTempRect.right -= this.mLastInsets.getSystemWindowInsetRight();
            rectAcquireTempRect.bottom -= this.mLastInsets.getSystemWindowInsetBottom();
        }
        android.graphics.Rect rectAcquireTempRect2 = acquireTempRect();
        androidx.core.view.GravityCompat.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rectAcquireTempRect, rectAcquireTempRect2, i);
        view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.mBehavior != null) {
            float scrimOpacity = layoutParams.mBehavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new android.graphics.Paint();
                }
                this.mScrimPaint.setColor(layoutParams.mBehavior.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(java.lang.Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), android.graphics.Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void onChildViewsChanged(int i) {
        int i2;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        boolean zOnDependentViewChanged;
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        int size = this.mDependencySortedChildren.size();
        android.graphics.Rect rectAcquireTempRect = acquireTempRect();
        android.graphics.Rect rectAcquireTempRect2 = acquireTempRect();
        android.graphics.Rect rectAcquireTempRect3 = acquireTempRect();
        for (int i3 = 0; i3 < size; i3++) {
            android.view.View view = this.mDependencySortedChildren.get(i3);
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (layoutParams.mAnchorDirectChild == this.mDependencySortedChildren.get(i4)) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, true, rectAcquireTempRect2);
                if (layoutParams.insetEdge != 0 && !rectAcquireTempRect2.isEmpty()) {
                    int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(layoutParams.insetEdge, layoutDirection);
                    int i5 = absoluteGravity & 112;
                    if (i5 == 48) {
                        rectAcquireTempRect.top = java.lang.Math.max(rectAcquireTempRect.top, rectAcquireTempRect2.bottom);
                    } else if (i5 == 80) {
                        rectAcquireTempRect.bottom = java.lang.Math.max(rectAcquireTempRect.bottom, getHeight() - rectAcquireTempRect2.top);
                    }
                    int i6 = absoluteGravity & 7;
                    if (i6 == 3) {
                        rectAcquireTempRect.left = java.lang.Math.max(rectAcquireTempRect.left, rectAcquireTempRect2.right);
                    } else if (i6 == 5) {
                        rectAcquireTempRect.right = java.lang.Math.max(rectAcquireTempRect.right, getWidth() - rectAcquireTempRect2.left);
                    }
                }
                if (layoutParams.dodgeInsetEdges != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, rectAcquireTempRect, layoutDirection);
                }
                if (i != 2) {
                    getLastChildRect(view, rectAcquireTempRect3);
                    if (!rectAcquireTempRect3.equals(rectAcquireTempRect2)) {
                        recordLastChildRect(view, rectAcquireTempRect2);
                        for (i2 = i3 + 1; i2 < size; i2++) {
                            android.view.View view2 = this.mDependencySortedChildren.get(i2);
                            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view2.getLayoutParams();
                            behavior = layoutParams2.getBehavior();
                            if (behavior == null && behavior.layoutDependsOn(this, view2, view)) {
                                if (i == 0 && layoutParams2.getChangedAfterNestedScroll()) {
                                    layoutParams2.resetChangedAfterNestedScroll();
                                } else {
                                    if (i == 2) {
                                        behavior.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    } else {
                                        zOnDependentViewChanged = behavior.onDependentViewChanged(this, view2, view);
                                    }
                                    if (i == 1) {
                                        layoutParams2.setChangedAfterNestedScroll(zOnDependentViewChanged);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                        android.view.View view3 = this.mDependencySortedChildren.get(i2);
                        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view3.getLayoutParams();
                        behavior = layoutParams3.getBehavior();
                        if (behavior == null) {
                        }
                    }
                }
            }
        }
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
        releaseTempRect(rectAcquireTempRect3);
    }

    private void offsetChildByInset(android.view.View view, android.graphics.Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int height;
        int i3;
        if (androidx.core.view.ViewCompat.isLaidOut(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = layoutParams.getBehavior();
            android.graphics.Rect rectAcquireTempRect = acquireTempRect();
            android.graphics.Rect rectAcquireTempRect2 = acquireTempRect();
            rectAcquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behavior != null && behavior.getInsetDodgeRect(this, view, rectAcquireTempRect)) {
                if (!rectAcquireTempRect2.contains(rectAcquireTempRect)) {
                    throw new java.lang.IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectAcquireTempRect.toShortString() + " | Bounds:" + rectAcquireTempRect2.toShortString());
                }
            } else {
                rectAcquireTempRect.set(rectAcquireTempRect2);
            }
            releaseTempRect(rectAcquireTempRect2);
            if (rectAcquireTempRect.isEmpty()) {
                releaseTempRect(rectAcquireTempRect);
                return;
            }
            int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(layoutParams.dodgeInsetEdges, i);
            boolean z3 = true;
            if ((absoluteGravity & 48) != 48 || (i3 = (rectAcquireTempRect.top - layoutParams.topMargin) - layoutParams.mInsetOffsetY) >= rect.top) {
                z = false;
            } else {
                setInsetOffsetY(view, rect.top - i3);
                z = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - rectAcquireTempRect.bottom) - layoutParams.bottomMargin) + layoutParams.mInsetOffsetY) < rect.bottom) {
                setInsetOffsetY(view, height - rect.bottom);
                z = true;
            }
            if (!z) {
                setInsetOffsetY(view, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i2 = (rectAcquireTempRect.left - layoutParams.leftMargin) - layoutParams.mInsetOffsetX) >= rect.left) {
                z2 = false;
            } else {
                setInsetOffsetX(view, rect.left - i2);
                z2 = true;
            }
            if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - rectAcquireTempRect.right) - layoutParams.rightMargin) + layoutParams.mInsetOffsetX) >= rect.right) {
                z3 = z2;
            } else {
                setInsetOffsetX(view, width - rect.right);
            }
            if (!z3) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(rectAcquireTempRect);
        }
    }

    private void setInsetOffsetX(android.view.View view, int i) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.mInsetOffsetX != i) {
            androidx.core.view.ViewCompat.offsetLeftAndRight(view, i - layoutParams.mInsetOffsetX);
            layoutParams.mInsetOffsetX = i;
        }
    }

    private void setInsetOffsetY(android.view.View view, int i) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.mInsetOffsetY != i) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(view, i - layoutParams.mInsetOffsetY);
            layoutParams.mInsetOffsetY = i;
        }
    }

    public void dispatchDependentViewsChanged(android.view.View view) {
        java.util.List incomingEdges = this.mChildDag.getIncomingEdges(view);
        if (incomingEdges == null || incomingEdges.isEmpty()) {
            return;
        }
        for (int i = 0; i < incomingEdges.size(); i++) {
            android.view.View view2 = (android.view.View) incomingEdges.get(i);
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior != null) {
                behavior.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public java.util.List<android.view.View> getDependencies(android.view.View view) {
        java.util.List<android.view.View> outgoingEdges = this.mChildDag.getOutgoingEdges(view);
        this.mTempDependenciesList.clear();
        if (outgoingEdges != null) {
            this.mTempDependenciesList.addAll(outgoingEdges);
        }
        return this.mTempDependenciesList;
    }

    public java.util.List<android.view.View> getDependents(android.view.View view) {
        java.util.List incomingEdges = this.mChildDag.getIncomingEdges(view);
        this.mTempDependenciesList.clear();
        if (incomingEdges != null) {
            this.mTempDependenciesList.addAll(incomingEdges);
        }
        return this.mTempDependenciesList;
    }

    final java.util.List<android.view.View> getDependencySortedChildren() {
        prepareChildren();
        return java.util.Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (hasDependencies(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    private boolean hasDependencies(android.view.View view) {
        return this.mChildDag.hasOutgoingEdges(view);
    }

    void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new androidx.coordinatorlayout.widget.CoordinatorLayout.OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    void offsetChildToAnchor(android.view.View view, int i) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.mAnchorView != null) {
            android.graphics.Rect rectAcquireTempRect = acquireTempRect();
            android.graphics.Rect rectAcquireTempRect2 = acquireTempRect();
            android.graphics.Rect rectAcquireTempRect3 = acquireTempRect();
            getDescendantRect(layoutParams.mAnchorView, rectAcquireTempRect);
            getChildRect(view, false, rectAcquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i, rectAcquireTempRect, rectAcquireTempRect3, layoutParams, measuredWidth, measuredHeight);
            boolean z = (rectAcquireTempRect3.left == rectAcquireTempRect2.left && rectAcquireTempRect3.top == rectAcquireTempRect2.top) ? false : true;
            constrainChildRect(layoutParams, rectAcquireTempRect3, measuredWidth, measuredHeight);
            int i2 = rectAcquireTempRect3.left - rectAcquireTempRect2.left;
            int i3 = rectAcquireTempRect3.top - rectAcquireTempRect2.top;
            if (i2 != 0) {
                androidx.core.view.ViewCompat.offsetLeftAndRight(view, i2);
            }
            if (i3 != 0) {
                androidx.core.view.ViewCompat.offsetTopAndBottom(view, i3);
            }
            if (z && (behavior = layoutParams.getBehavior()) != null) {
                behavior.onDependentViewChanged(this, view, layoutParams.mAnchorView);
            }
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
            releaseTempRect(rectAcquireTempRect3);
        }
    }

    public boolean isPointInChildBounds(android.view.View view, int i, int i2) {
        android.graphics.Rect rectAcquireTempRect = acquireTempRect();
        getDescendantRect(view, rectAcquireTempRect);
        try {
            return rectAcquireTempRect.contains(i, i2);
        } finally {
            releaseTempRect(rectAcquireTempRect);
        }
    }

    public boolean doViewsOverlap(android.view.View view, android.view.View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        android.graphics.Rect rectAcquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, rectAcquireTempRect);
        android.graphics.Rect rectAcquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, rectAcquireTempRect2);
        try {
            if (rectAcquireTempRect.left <= rectAcquireTempRect2.right && rectAcquireTempRect.top <= rectAcquireTempRect2.bottom && rectAcquireTempRect.right >= rectAcquireTempRect2.left && rectAcquireTempRect.bottom >= rectAcquireTempRect2.top) {
                z = true;
            }
            return z;
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) {
            return new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateDefaultLayoutParams() {
        return new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    boolean zOnStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= zOnStartNestedScroll;
                    layoutParams.setNestedScrollAccepted(i2, zOnStartNestedScroll);
                } else {
                    layoutParams.setNestedScrollAccepted(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i, int i2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i2) && (behavior = layoutParams.getBehavior()) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View view, int i) {
        this.mNestedScrollingParentHelper.onStopNestedScroll(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i)) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                layoutParams.resetNestedScroll(i);
                layoutParams.resetChangedAfterNestedScroll();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        boolean z;
        int iMin;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i5) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i3 > 0 ? java.lang.Math.max(iMax, iArr3[0]) : java.lang.Math.min(iMax, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        iMin = java.lang.Math.max(i6, this.mBehaviorConsumed[1]);
                    } else {
                        z = true;
                        iMin = java.lang.Math.min(i6, this.mBehaviorConsumed[1]);
                    }
                    i6 = iMin;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int i3) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i3) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i > 0 ? java.lang.Math.max(iMax, iArr3[0]) : java.lang.Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i2 > 0 ? java.lang.Math.max(iMax2, iArr4[1]) : java.lang.Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(0) && (behavior = layoutParams.getBehavior()) != null) {
                    zOnNestedFling |= behavior.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (zOnNestedFling) {
            onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View view, float f, float f2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(0) && (behavior = layoutParams.getBehavior()) != null) {
                    zOnNestedPreFling |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    class OnPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener {
        OnPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            androidx.coordinatorlayout.widget.CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    static class ViewElevationComparator implements java.util.Comparator<android.view.View> {
        ViewElevationComparator() {
        }

        @Override // java.util.Comparator
        public int compare(android.view.View view, android.view.View view2) {
            float z = androidx.core.view.ViewCompat.getZ(view);
            float z2 = androidx.core.view.ViewCompat.getZ(view2);
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    public static abstract class Behavior<V extends android.view.View> {
        public boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.graphics.Rect rect) {
            return false;
        }

        public int getScrimColor(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            return androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        }

        public float getScrimOpacity(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view) {
            return false;
        }

        public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams) {
        }

        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view) {
            return false;
        }

        public void onDependentViewRemoved(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, float f, float f2) {
            return false;
        }

        @java.lang.Deprecated
        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int[] iArr) {
        }

        @java.lang.Deprecated
        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int i3, int i4) {
        }

        @java.lang.Deprecated
        public void onNestedScrollAccepted(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.graphics.Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.os.Parcelable parcelable) {
        }

        @java.lang.Deprecated
        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i) {
            return false;
        }

        @java.lang.Deprecated
        public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view) {
        }

        public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
            return false;
        }

        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        }

        public boolean blocksInteractionBelow(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public static void setTag(android.view.View view, java.lang.Object obj) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).mBehaviorTag = obj;
        }

        public static java.lang.Object getTag(android.view.View view) {
            return ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).mBehaviorTag;
        }

        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onNestedScrollAccepted(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        @java.lang.Deprecated
        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            return android.view.View.BaseSavedState.EMPTY_STATE;
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public int anchorGravity;
        public int dodgeInsetEdges;
        public int gravity;
        public int insetEdge;
        public int keyline;
        android.view.View mAnchorDirectChild;
        int mAnchorId;
        android.view.View mAnchorView;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior mBehavior;
        boolean mBehaviorResolved;
        java.lang.Object mBehaviorTag;
        private boolean mDidAcceptNestedScrollNonTouch;
        private boolean mDidAcceptNestedScrollTouch;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        int mInsetOffsetX;
        int mInsetOffsetY;
        final android.graphics.Rect mLastChildRect;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new android.graphics.Rect();
        }

        LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new android.graphics.Rect();
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.mAnchorId = typedArrayObtainStyledAttributes.getResourceId(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.anchorGravity = typedArrayObtainStyledAttributes.getInteger(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.keyline = typedArrayObtainStyledAttributes.getInteger(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.insetEdge = typedArrayObtainStyledAttributes.getInt(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.dodgeInsetEdges = typedArrayObtainStyledAttributes.getInt(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior);
            this.mBehaviorResolved = zHasValue;
            if (zHasValue) {
                this.mBehavior = androidx.coordinatorlayout.widget.CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior));
            }
            typedArrayObtainStyledAttributes.recycle();
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = this.mBehavior;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public LayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new android.graphics.Rect();
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new android.graphics.Rect();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new android.graphics.Rect();
        }

        public int getAnchorId() {
            return this.mAnchorId;
        }

        public void setAnchorId(int i) {
            invalidateAnchor();
            this.mAnchorId = i;
        }

        public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
            return this.mBehavior;
        }

        public void setBehavior(androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior2 = this.mBehavior;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.mBehavior = behavior;
                this.mBehaviorTag = null;
                this.mBehaviorResolved = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        void setLastChildRect(android.graphics.Rect rect) {
            this.mLastChildRect.set(rect);
        }

        android.graphics.Rect getLastChildRect() {
            return this.mLastChildRect;
        }

        boolean checkAnchorChanged() {
            return this.mAnchorView == null && this.mAnchorId != -1;
        }

        boolean didBlockInteraction() {
            if (this.mBehavior == null) {
                this.mDidBlockInteraction = false;
            }
            return this.mDidBlockInteraction;
        }

        boolean isBlockingInteractionBelow(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            boolean z = this.mDidBlockInteraction;
            if (z) {
                return true;
            }
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = this.mBehavior;
            boolean zBlocksInteractionBelow = (behavior != null ? behavior.blocksInteractionBelow(coordinatorLayout, view) : false) | z;
            this.mDidBlockInteraction = zBlocksInteractionBelow;
            return zBlocksInteractionBelow;
        }

        void resetTouchBehaviorTracking() {
            this.mDidBlockInteraction = false;
        }

        void resetNestedScroll(int i) {
            setNestedScrollAccepted(i, false);
        }

        void setNestedScrollAccepted(int i, boolean z) {
            if (i == 0) {
                this.mDidAcceptNestedScrollTouch = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.mDidAcceptNestedScrollNonTouch = z;
            }
        }

        boolean isNestedScrollAccepted(int i) {
            if (i == 0) {
                return this.mDidAcceptNestedScrollTouch;
            }
            if (i != 1) {
                return false;
            }
            return this.mDidAcceptNestedScrollNonTouch;
        }

        boolean getChangedAfterNestedScroll() {
            return this.mDidChangeAfterNestedScroll;
        }

        void setChangedAfterNestedScroll(boolean z) {
            this.mDidChangeAfterNestedScroll = z;
        }

        void resetChangedAfterNestedScroll() {
            this.mDidChangeAfterNestedScroll = false;
        }

        boolean dependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
            return view2 == this.mAnchorDirectChild || shouldDodge(view2, androidx.core.view.ViewCompat.getLayoutDirection(coordinatorLayout)) || ((behavior = this.mBehavior) != null && behavior.layoutDependsOn(coordinatorLayout, view, view2));
        }

        void invalidateAnchor() {
            this.mAnchorDirectChild = null;
            this.mAnchorView = null;
        }

        android.view.View findAnchorView(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            if (this.mAnchorId == -1) {
                this.mAnchorDirectChild = null;
                this.mAnchorView = null;
                return null;
            }
            if (this.mAnchorView == null || !verifyAnchorView(view, coordinatorLayout)) {
                resolveAnchorView(view, coordinatorLayout);
            }
            return this.mAnchorView;
        }

        private void resolveAnchorView(android.view.View view, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
            android.view.View viewFindViewById = coordinatorLayout.findViewById(this.mAnchorId);
            this.mAnchorView = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return;
                }
                throw new java.lang.IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.mAnchorId) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return;
                }
                throw new java.lang.IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            }
            for (android.view.ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.mAnchorDirectChild = null;
                        this.mAnchorView = null;
                        return;
                    }
                    throw new java.lang.IllegalStateException("Anchor must not be a descendant of the anchored view");
                }
                if (parent instanceof android.view.View) {
                    viewFindViewById = parent;
                }
            }
            this.mAnchorDirectChild = viewFindViewById;
        }

        private boolean verifyAnchorView(android.view.View view, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
            if (this.mAnchorView.getId() != this.mAnchorId) {
                return false;
            }
            android.view.View view2 = this.mAnchorView;
            for (android.view.ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return false;
                }
                if (parent instanceof android.view.View) {
                    view2 = parent;
                }
            }
            this.mAnchorDirectChild = view2;
            return true;
        }

        private boolean shouldDodge(android.view.View view, int i) {
            int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).insetEdge, i);
            return absoluteGravity != 0 && (androidx.core.view.GravityCompat.getAbsoluteGravity(this.dodgeInsetEdges, i) & absoluteGravity) == absoluteGravity;
        }
    }

    private class HierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        HierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View view, android.view.View view2) {
            if (androidx.coordinatorlayout.widget.CoordinatorLayout.this.mOnHierarchyChangeListener != null) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.this.mOnHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View view, android.view.View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.this.onChildViewsChanged(2);
            if (androidx.coordinatorlayout.widget.CoordinatorLayout.this.mOnHierarchyChangeListener != null) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.this.mOnHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState savedState = (androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        android.util.SparseArray<android.os.Parcelable> sparseArray = savedState.behaviorStates;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            int id = childAt.getId();
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = getResolvedLayoutParams(childAt).getBehavior();
            if (id != -1 && behavior != null && (parcelable2 = sparseArray.get(id)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableOnSaveInstanceState;
        androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState savedState = new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(super.onSaveInstanceState());
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            int id = childAt.getId();
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (id != -1 && behavior != null && (parcelableOnSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        savedState.behaviorStates = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getBehavior();
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void setupForInsets() {
        if (androidx.core.view.ViewCompat.getFitsSystemWindows(this)) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new androidx.core.view.OnApplyWindowInsetsListener() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.1
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                        return androidx.coordinatorlayout.widget.CoordinatorLayout.this.setWindowInsets(windowInsetsCompat);
                    }
                };
            }
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this, null);
    }

    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState[] newArray(int i) {
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState[i];
            }
        };
        android.util.SparseArray<android.os.Parcelable> behaviorStates;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            android.os.Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.behaviorStates = new android.util.SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.behaviorStates.append(iArr[i2], parcelableArray[i2]);
            }
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            android.util.SparseArray<android.os.Parcelable> sparseArray = this.behaviorStates;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            android.os.Parcelable[] parcelableArr = new android.os.Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.behaviorStates.keyAt(i2);
                parcelableArr[i2] = this.behaviorStates.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }
}
