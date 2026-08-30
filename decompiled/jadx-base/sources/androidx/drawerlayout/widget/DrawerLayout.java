package androidx.drawerlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends android.view.ViewGroup implements androidx.customview.widget.Openable {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.drawerlayout.widget.DrawerLayout";
    private static final boolean ALLOW_EDGE_LOCK = false;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final java.lang.String TAG = "DrawerLayout";
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private final androidx.core.view.accessibility.AccessibilityViewCommand mActionDismiss;
    private final androidx.drawerlayout.widget.DrawerLayout.ChildAccessibilityDelegate mChildAccessibilityDelegate;
    private android.graphics.Rect mChildHitRect;
    private android.graphics.Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private java.lang.Object mLastInsets;
    private final androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback mLeftCallback;
    private final androidx.customview.widget.ViewDragHelper mLeftDragger;
    private androidx.drawerlayout.widget.DrawerLayout.DrawerListener mListener;
    private java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final java.util.ArrayList<android.view.View> mNonDrawerViews;
    private final androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback mRightCallback;
    private final androidx.customview.widget.ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private android.graphics.Paint mScrimPaint;
    private android.graphics.drawable.Drawable mShadowEnd;
    private android.graphics.drawable.Drawable mShadowLeft;
    private android.graphics.drawable.Drawable mShadowLeftResolved;
    private android.graphics.drawable.Drawable mShadowRight;
    private android.graphics.drawable.Drawable mShadowRightResolved;
    private android.graphics.drawable.Drawable mShadowStart;
    private android.graphics.drawable.Drawable mStatusBarBackground;
    private java.lang.CharSequence mTitleLeft;
    private java.lang.CharSequence mTitleRight;
    private static final int[] THEME_ATTRS = {android.R.attr.colorPrimaryDark};
    static final int[] LAYOUT_ATTRS = {android.R.attr.layout_gravity};
    static final boolean CAN_HIDE_DESCENDANTS = true;
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION = true;

    public interface DrawerListener {
        void onDrawerClosed(android.view.View view);

        void onDrawerOpened(android.view.View view);

        void onDrawerSlide(android.view.View view, float f);

        void onDrawerStateChanged(int i);
    }

    public static abstract class SimpleDrawerListener implements androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(android.view.View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(android.view.View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(android.view.View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int i) {
        }
    }

    static {
        sEdgeSizeUsingSystemGestureInsets = android.os.Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(android.content.Context context) {
        this(context, null);
    }

    public DrawerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.drawerlayout.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildAccessibilityDelegate = new androidx.drawerlayout.widget.DrawerLayout.ChildAccessibilityDelegate();
        this.mScrimColor = DEFAULT_SCRIM_COLOR;
        this.mScrimPaint = new android.graphics.Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        this.mActionDismiss = new androidx.core.view.accessibility.AccessibilityViewCommand() { // from class: androidx.drawerlayout.widget.DrawerLayout.1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
                if (!androidx.drawerlayout.widget.DrawerLayout.this.isDrawerOpen(view) || androidx.drawerlayout.widget.DrawerLayout.this.getDrawerLockMode(view) == 2) {
                    return false;
                }
                androidx.drawerlayout.widget.DrawerLayout.this.closeDrawer(view);
                return true;
            }
        };
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback viewDragCallback = new androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback(3);
        this.mLeftCallback = viewDragCallback;
        androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback viewDragCallback2 = new androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback(5);
        this.mRightCallback = viewDragCallback2;
        androidx.customview.widget.ViewDragHelper viewDragHelperCreate = androidx.customview.widget.ViewDragHelper.create(this, 1.0f, viewDragCallback);
        this.mLeftDragger = viewDragHelperCreate;
        viewDragHelperCreate.setEdgeTrackingEnabled(1);
        viewDragHelperCreate.setMinVelocity(f2);
        viewDragCallback.setDragger(viewDragHelperCreate);
        androidx.customview.widget.ViewDragHelper viewDragHelperCreate2 = androidx.customview.widget.ViewDragHelper.create(this, 1.0f, viewDragCallback2);
        this.mRightDragger = viewDragHelperCreate2;
        viewDragHelperCreate2.setEdgeTrackingEnabled(2);
        viewDragHelperCreate2.setMinVelocity(f2);
        viewDragCallback2.setDragger(viewDragHelperCreate2);
        setFocusableInTouchMode(true);
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, new androidx.drawerlayout.widget.DrawerLayout.AccessibilityDelegate());
        setMotionEventSplittingEnabled(false);
        if (androidx.core.view.ViewCompat.getFitsSystemWindows(this)) {
            setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: androidx.drawerlayout.widget.DrawerLayout.2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                    ((androidx.drawerlayout.widget.DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
            setSystemUiVisibility(1280);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
            try {
                this.mStatusBarBackground = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.drawerlayout.R.styleable.DrawerLayout, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(androidx.drawerlayout.R.styleable.DrawerLayout_elevation)) {
                this.mDrawerElevation = typedArrayObtainStyledAttributes2.getDimension(androidx.drawerlayout.R.styleable.DrawerLayout_elevation, 0.0f);
            } else {
                this.mDrawerElevation = getResources().getDimension(androidx.drawerlayout.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.mNonDrawerViews = new java.util.ArrayList<>();
        } catch (java.lang.Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setDrawerElevation(float f) {
        this.mDrawerElevation = f;
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (isDrawerView(childAt)) {
                androidx.core.view.ViewCompat.setElevation(childAt, this.mDrawerElevation);
            }
        }
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    public void setChildInsets(java.lang.Object obj, boolean z) {
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerShadow(android.graphics.drawable.Drawable drawable, int i) {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        if ((i & androidx.core.view.GravityCompat.START) == 8388611) {
            this.mShadowStart = drawable;
        } else if ((i & androidx.core.view.GravityCompat.END) == 8388613) {
            this.mShadowEnd = drawable;
        } else if ((i & 3) == 3) {
            this.mShadowLeft = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.mShadowRight = drawable;
        }
        resolveShadowDrawables();
        invalidate();
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(androidx.core.content.ContextCompat.getDrawable(getContext(), i), i2);
    }

    public void setScrimColor(int i) {
        this.mScrimColor = i;
        invalidate();
    }

    @java.lang.Deprecated
    public void setDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener drawerListener) {
        androidx.drawerlayout.widget.DrawerLayout.DrawerListener drawerListener2 = this.mListener;
        if (drawerListener2 != null) {
            removeDrawerListener(drawerListener2);
        }
        if (drawerListener != null) {
            addDrawerListener(drawerListener);
        }
        this.mListener = drawerListener;
    }

    public void addDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener drawerListener) {
        if (drawerListener == null) {
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new java.util.ArrayList();
        }
        this.mListeners.add(drawerListener);
    }

    public void removeDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener drawerListener) {
        java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> list;
        if (drawerListener == null || (list = this.mListeners) == null) {
            return;
        }
        list.remove(drawerListener);
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int i2) {
        android.view.View viewFindDrawerWithGravity;
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i2, androidx.core.view.ViewCompat.getLayoutDirection(this));
        if (i2 == 3) {
            this.mLockModeLeft = i;
        } else if (i2 == 5) {
            this.mLockModeRight = i;
        } else if (i2 == 8388611) {
            this.mLockModeStart = i;
        } else if (i2 == 8388613) {
            this.mLockModeEnd = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.mLeftDragger : this.mRightDragger).cancel();
        }
        if (i != 1) {
            if (i == 2 && (viewFindDrawerWithGravity = findDrawerWithGravity(absoluteGravity)) != null) {
                openDrawer(viewFindDrawerWithGravity);
                return;
            }
            return;
        }
        android.view.View viewFindDrawerWithGravity2 = findDrawerWithGravity(absoluteGravity);
        if (viewFindDrawerWithGravity2 != null) {
            closeDrawer(viewFindDrawerWithGravity2);
        }
    }

    public void setDrawerLockMode(int i, android.view.View view) {
        if (!isDrawerView(view)) {
            throw new java.lang.IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
        }
        setDrawerLockMode(i, ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).gravity);
    }

    public int getDrawerLockMode(int i) {
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        if (i == 3) {
            int i2 = this.mLockModeLeft;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.mLockModeStart : this.mLockModeEnd;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.mLockModeRight;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.mLockModeEnd : this.mLockModeStart;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.mLockModeStart;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.mLockModeLeft : this.mLockModeRight;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.mLockModeEnd;
        if (i8 != 3) {
            return i8;
        }
        int i9 = layoutDirection == 0 ? this.mLockModeRight : this.mLockModeLeft;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    public int getDrawerLockMode(android.view.View view) {
        if (!isDrawerView(view)) {
            throw new java.lang.IllegalArgumentException("View " + view + " is not a drawer");
        }
        return getDrawerLockMode(((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).gravity);
    }

    public void setDrawerTitle(int i, java.lang.CharSequence charSequence) {
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, androidx.core.view.ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            this.mTitleLeft = charSequence;
        } else if (absoluteGravity == 5) {
            this.mTitleRight = charSequence;
        }
    }

    public java.lang.CharSequence getDrawerTitle(int i) {
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, androidx.core.view.ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            return this.mTitleLeft;
        }
        if (absoluteGravity == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    private boolean isInBoundsOfChild(float f, float f2, android.view.View view) {
        if (this.mChildHitRect == null) {
            this.mChildHitRect = new android.graphics.Rect();
        }
        view.getHitRect(this.mChildHitRect);
        return this.mChildHitRect.contains((int) f, (int) f2);
    }

    private boolean dispatchTransformedGenericPointerEvent(android.view.MotionEvent motionEvent, android.view.View view) {
        if (!view.getMatrix().isIdentity()) {
            android.view.MotionEvent transformedMotionEvent = getTransformedMotionEvent(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(transformedMotionEvent);
            transformedMotionEvent.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private android.view.MotionEvent getTransformedMotionEvent(android.view.MotionEvent motionEvent, android.view.View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        android.graphics.Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.mChildInvertedMatrix == null) {
                this.mChildInvertedMatrix = new android.graphics.Matrix();
            }
            matrix.invert(this.mChildInvertedMatrix);
            motionEventObtain.transform(this.mChildInvertedMatrix);
        }
        return motionEventObtain;
    }

    void updateDrawerState(int i, android.view.View view) {
        int i2;
        int viewDragState = this.mLeftDragger.getViewDragState();
        int viewDragState2 = this.mRightDragger.getViewDragState();
        if (viewDragState == 1 || viewDragState2 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (viewDragState != 2 && viewDragState2 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.onScreen == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (layoutParams.onScreen == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i2 != this.mDrawerState) {
            this.mDrawerState = i2;
            java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerStateChanged(i2);
                }
            }
        }
    }

    void dispatchOnDrawerClosed(android.view.View view) {
        android.view.View rootView;
        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
        if ((layoutParams.openState & 1) == 1) {
            layoutParams.openState = 0;
            java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerClosed(view);
                }
            }
            updateChildrenImportantForAccessibility(view, false);
            updateChildAccessibilityAction(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void dispatchOnDrawerOpened(android.view.View view) {
        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
        if ((layoutParams.openState & 1) == 0) {
            layoutParams.openState = 1;
            java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerOpened(view);
                }
            }
            updateChildrenImportantForAccessibility(view, true);
            updateChildAccessibilityAction(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    private void updateChildrenImportantForAccessibility(android.view.View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if ((!z && !isDrawerView(childAt)) || (z && childAt == view)) {
                androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, 1);
            } else {
                androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, 4);
            }
        }
    }

    private void updateChildAccessibilityAction(android.view.View view) {
        androidx.core.view.ViewCompat.removeAccessibilityAction(view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS.getId());
        if (!isDrawerOpen(view) || getDrawerLockMode(view) == 2) {
            return;
        }
        androidx.core.view.ViewCompat.replaceAccessibilityAction(view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, this.mActionDismiss);
    }

    void dispatchOnDrawerSlide(android.view.View view, float f) {
        java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> list = this.mListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).onDrawerSlide(view, f);
            }
        }
    }

    void setDrawerViewOffset(android.view.View view, float f) {
        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
        if (f == layoutParams.onScreen) {
            return;
        }
        layoutParams.onScreen = f;
        dispatchOnDrawerSlide(view, f);
    }

    float getDrawerViewOffset(android.view.View view) {
        return ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).onScreen;
    }

    int getDrawerViewAbsoluteGravity(android.view.View view) {
        return androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).gravity, androidx.core.view.ViewCompat.getLayoutDirection(this));
    }

    boolean checkDrawerViewAbsoluteGravity(android.view.View view, int i) {
        return (getDrawerViewAbsoluteGravity(view) & i) == i;
    }

    android.view.View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if ((((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams()).openState & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    void moveDrawerToOffset(android.view.View view, float f) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        setDrawerViewOffset(view, f);
    }

    android.view.View findDrawerWithGravity(int i) {
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, androidx.core.view.ViewCompat.getLayoutDirection(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    static java.lang.String gravityToString(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : java.lang.Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new java.lang.IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.mLastInsets != null && androidx.core.view.ViewCompat.getFitsSystemWindows(this);
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(layoutParams.gravity, layoutDirection);
                    if (androidx.core.view.ViewCompat.getFitsSystemWindows(childAt)) {
                        android.view.WindowInsets windowInsetsReplaceSystemWindowInsets = (android.view.WindowInsets) this.mLastInsets;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        android.view.WindowInsets windowInsetsReplaceSystemWindowInsets2 = (android.view.WindowInsets) this.mLastInsets;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (isDrawerView(childAt)) {
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
                        float elevation = androidx.core.view.ViewCompat.getElevation(childAt);
                        float f = this.mDrawerElevation;
                        if (elevation != f) {
                            androidx.core.view.ViewCompat.setElevation(childAt, f);
                        }
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    boolean z4 = drawerViewAbsoluteGravity == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new java.lang.IllegalStateException("Child drawer has absolute gravity " + gravityToString(drawerViewAbsoluteGravity) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(getChildMeasureSpec(i, this.mMinDrawerMargin + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                } else {
                    throw new java.lang.IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    private void resolveShadowDrawables() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        this.mShadowLeftResolved = resolveLeftShadow();
        this.mShadowRightResolved = resolveRightShadow();
    }

    private android.graphics.drawable.Drawable resolveLeftShadow() {
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        if (layoutDirection == 0) {
            android.graphics.drawable.Drawable drawable = this.mShadowStart;
            if (drawable != null) {
                mirror(drawable, layoutDirection);
                return this.mShadowStart;
            }
        } else {
            android.graphics.drawable.Drawable drawable2 = this.mShadowEnd;
            if (drawable2 != null) {
                mirror(drawable2, layoutDirection);
                return this.mShadowEnd;
            }
        }
        return this.mShadowLeft;
    }

    private android.graphics.drawable.Drawable resolveRightShadow() {
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        if (layoutDirection == 0) {
            android.graphics.drawable.Drawable drawable = this.mShadowEnd;
            if (drawable != null) {
                mirror(drawable, layoutDirection);
                return this.mShadowEnd;
            }
        } else {
            android.graphics.drawable.Drawable drawable2 = this.mShadowStart;
            if (drawable2 != null) {
                mirror(drawable2, layoutDirection);
                return this.mShadowStart;
            }
        }
        return this.mShadowRight;
    }

    private void mirror(android.graphics.drawable.Drawable drawable, int i) {
        if (drawable == null || !androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(drawable)) {
            return;
        }
        androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(drawable, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.mInLayout = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.onScreen * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i8 = i6 - ((int) (layoutParams.onScreen * f3));
                        f = (i6 - i8) / f3;
                        i5 = i8;
                    }
                    boolean z3 = f != layoutParams.onScreen ? z2 : false;
                    int i9 = layoutParams.gravity & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < layoutParams.topMargin) {
                            i11 = layoutParams.topMargin;
                        } else if (i11 + measuredHeight > i10 - layoutParams.bottomMargin) {
                            i11 = (i10 - layoutParams.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, layoutParams.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i5, (i12 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - layoutParams.bottomMargin);
                    }
                    if (z3) {
                        setDrawerViewOffset(childAt, f);
                    }
                    int i13 = layoutParams.onScreen > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (sEdgeSizeUsingSystemGestureInsets && (rootWindowInsets = getRootWindowInsets()) != null) {
            androidx.core.graphics.Insets systemGestureInsets = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets).getSystemGestureInsets();
            androidx.customview.widget.ViewDragHelper viewDragHelper = this.mLeftDragger;
            viewDragHelper.setEdgeSize(java.lang.Math.max(viewDragHelper.getDefaultEdgeSize(), systemGestureInsets.left));
            androidx.customview.widget.ViewDragHelper viewDragHelper2 = this.mRightDragger;
            viewDragHelper2.setEdgeSize(java.lang.Math.max(viewDragHelper2.getDefaultEdgeSize(), systemGestureInsets.right));
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = java.lang.Math.max(fMax, ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) getChildAt(i).getLayoutParams()).onScreen);
        }
        this.mScrimOpacity = fMax;
        boolean zContinueSettling = this.mLeftDragger.continueSettling(true);
        boolean zContinueSettling2 = this.mRightDragger.continueSettling(true);
        if (zContinueSettling || zContinueSettling2) {
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private static boolean hasOpaqueBackground(android.view.View view) {
        android.graphics.drawable.Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    public android.graphics.drawable.Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public void setStatusBarBackground(int i) {
        this.mStatusBarBackground = i != 0 ? androidx.core.content.ContextCompat.getDrawable(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.mStatusBarBackground = new android.graphics.drawable.ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        resolveShadowDrawables();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        java.lang.Object obj = this.mLastInsets;
        int systemWindowInsetTop = obj != null ? ((android.view.WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        int height = getHeight();
        boolean zIsContentView = isContentView(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zIsContentView) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && hasOpaqueBackground(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.mScrimOpacity;
        if (f > 0.0f && zIsContentView) {
            int i4 = this.mScrimColor;
            this.mScrimPaint.setColor((i4 & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | (((int) ((((-16777216) & i4) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.mScrimPaint);
        } else if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = java.lang.Math.max(0.0f, java.lang.Math.min(right2 / this.mLeftDragger.getEdgeSize(), 1.0f));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (fMax * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
        } else if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = java.lang.Math.max(0.0f, java.lang.Math.min((getWidth() - left2) / this.mRightDragger.getEdgeSize(), 1.0f));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (fMax2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return zDrawChild;
    }

    boolean isContentView(android.view.View view) {
        return ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).gravity == 0;
    }

    boolean isDrawerView(android.view.View view) {
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).gravity, androidx.core.view.ViewCompat.getLayoutDirection(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.View viewFindTopChildUnder;
        int actionMasked = motionEvent.getActionMasked();
        boolean zShouldInterceptTouchEvent = this.mLeftDragger.shouldInterceptTouchEvent(motionEvent) | this.mRightDragger.shouldInterceptTouchEvent(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                closeDrawers(true);
                this.mChildrenCanceledTouch = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    closeDrawers(true);
                    this.mChildrenCanceledTouch = false;
                }
            } else if (this.mLeftDragger.checkTouchSlop(3)) {
                this.mLeftCallback.removeCallbacks();
                this.mRightCallback.removeCallbacks();
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
            z = this.mScrimOpacity > 0.0f && (viewFindTopChildUnder = this.mLeftDragger.findTopChildUnder((int) x, (int) y)) != null && isContentView(viewFindTopChildUnder);
            this.mChildrenCanceledTouch = false;
        }
        return zShouldInterceptTouchEvent || z || hasPeekingDrawer() || this.mChildrenCanceledTouch;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            android.view.View childAt = getChildAt(i);
            if (isInBoundsOfChild(x, y, childAt) && !isContentView(childAt) && dispatchTransformedGenericPointerEvent(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.View viewFindOpenDrawer;
        this.mLeftDragger.processTouchEvent(motionEvent);
        this.mRightDragger.processTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
            this.mChildrenCanceledTouch = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            android.view.View viewFindTopChildUnder = this.mLeftDragger.findTopChildUnder((int) x2, (int) y2);
            if (viewFindTopChildUnder != null && isContentView(viewFindTopChildUnder)) {
                float f = x2 - this.mInitialMotionX;
                float f2 = y2 - this.mInitialMotionY;
                int touchSlop = this.mLeftDragger.getTouchSlop();
                z = (f * f) + (f2 * f2) >= ((float) (touchSlop * touchSlop)) || (viewFindOpenDrawer = findOpenDrawer()) == null || getDrawerLockMode(viewFindOpenDrawer) == 2;
            }
            closeDrawers(z);
        } else if (action == 3) {
            closeDrawers(true);
            this.mChildrenCanceledTouch = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            closeDrawers(true);
        }
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    void closeDrawers(boolean z) {
        boolean zSmoothSlideViewTo;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z || layoutParams.isPeeking)) {
                int width = childAt.getWidth();
                if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                    zSmoothSlideViewTo = this.mLeftDragger.smoothSlideViewTo(childAt, -width, childAt.getTop());
                } else {
                    zSmoothSlideViewTo = this.mRightDragger.smoothSlideViewTo(childAt, getWidth(), childAt.getTop());
                }
                z2 |= zSmoothSlideViewTo;
                layoutParams.isPeeking = false;
            }
        }
        this.mLeftCallback.removeCallbacks();
        this.mRightCallback.removeCallbacks();
        if (z2) {
            invalidate();
        }
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openDrawer(androidx.core.view.GravityCompat.START);
    }

    public void openDrawer(android.view.View view) {
        openDrawer(view, true);
    }

    public void openDrawer(android.view.View view, boolean z) {
        if (!isDrawerView(view)) {
            throw new java.lang.IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
        if (this.mFirstLayout) {
            layoutParams.onScreen = 1.0f;
            layoutParams.openState = 1;
            updateChildrenImportantForAccessibility(view, true);
            updateChildAccessibilityAction(view);
        } else if (z) {
            layoutParams.openState |= 2;
            if (checkDrawerViewAbsoluteGravity(view, 3)) {
                this.mLeftDragger.smoothSlideViewTo(view, 0, view.getTop());
            } else {
                this.mRightDragger.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            moveDrawerToOffset(view, 1.0f);
            updateDrawerState(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void openDrawer(int i, boolean z) {
        android.view.View viewFindDrawerWithGravity = findDrawerWithGravity(i);
        if (viewFindDrawerWithGravity == null) {
            throw new java.lang.IllegalArgumentException("No drawer view found with gravity " + gravityToString(i));
        }
        openDrawer(viewFindDrawerWithGravity, z);
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closeDrawer(androidx.core.view.GravityCompat.START);
    }

    public void closeDrawer(android.view.View view) {
        closeDrawer(view, true);
    }

    public void closeDrawer(android.view.View view, boolean z) {
        if (!isDrawerView(view)) {
            throw new java.lang.IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
        if (this.mFirstLayout) {
            layoutParams.onScreen = 0.0f;
            layoutParams.openState = 0;
        } else if (z) {
            layoutParams.openState |= 4;
            if (checkDrawerViewAbsoluteGravity(view, 3)) {
                this.mLeftDragger.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
            } else {
                this.mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
            }
        } else {
            moveDrawerToOffset(view, 0.0f);
            updateDrawerState(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void closeDrawer(int i, boolean z) {
        android.view.View viewFindDrawerWithGravity = findDrawerWithGravity(i);
        if (viewFindDrawerWithGravity == null) {
            throw new java.lang.IllegalArgumentException("No drawer view found with gravity " + gravityToString(i));
        }
        closeDrawer(viewFindDrawerWithGravity, z);
    }

    public boolean isDrawerOpen(android.view.View view) {
        if (isDrawerView(view)) {
            return (((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).openState & 1) == 1;
        }
        throw new java.lang.IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return isDrawerOpen(androidx.core.view.GravityCompat.START);
    }

    public boolean isDrawerOpen(int i) {
        android.view.View viewFindDrawerWithGravity = findDrawerWithGravity(i);
        if (viewFindDrawerWithGravity != null) {
            return isDrawerOpen(viewFindDrawerWithGravity);
        }
        return false;
    }

    public boolean isDrawerVisible(android.view.View view) {
        if (isDrawerView(view)) {
            return ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).onScreen > 0.0f;
        }
        throw new java.lang.IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerVisible(int i) {
        android.view.View viewFindDrawerWithGravity = findDrawerWithGravity(i);
        if (viewFindDrawerWithGravity != null) {
            return isDrawerVisible(viewFindDrawerWithGravity);
        }
        return false;
    }

    private boolean hasPeekingDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) getChildAt(i).getLayoutParams()).isPeeking) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new androidx.drawerlayout.widget.DrawerLayout.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams) {
            return new androidx.drawerlayout.widget.DrawerLayout.LayoutParams((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.drawerlayout.widget.DrawerLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.drawerlayout.widget.DrawerLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.drawerlayout.widget.DrawerLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (isDrawerView(childAt)) {
                if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.mNonDrawerViews.add(childAt);
            }
        }
        if (!z) {
            int size = this.mNonDrawerViews.size();
            for (int i4 = 0; i4 < size; i4++) {
                android.view.View view = this.mNonDrawerViews.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.mNonDrawerViews.clear();
    }

    private boolean hasVisibleDrawer() {
        return findVisibleDrawer() != null;
    }

    android.view.View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    void cancelChildViewTouch() {
        if (this.mChildrenCanceledTouch) {
            return;
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.mChildrenCanceledTouch = true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i == 4 && hasVisibleDrawer()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            android.view.View viewFindVisibleDrawer = findVisibleDrawer();
            if (viewFindVisibleDrawer != null && getDrawerLockMode(viewFindVisibleDrawer) == 0) {
                closeDrawers();
            }
            return viewFindVisibleDrawer != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.View viewFindDrawerWithGravity;
        if (!(parcelable instanceof androidx.drawerlayout.widget.DrawerLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.drawerlayout.widget.DrawerLayout.SavedState savedState = (androidx.drawerlayout.widget.DrawerLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.openDrawerGravity != 0 && (viewFindDrawerWithGravity = findDrawerWithGravity(savedState.openDrawerGravity)) != null) {
            openDrawer(viewFindDrawerWithGravity);
        }
        if (savedState.lockModeLeft != 3) {
            setDrawerLockMode(savedState.lockModeLeft, 3);
        }
        if (savedState.lockModeRight != 3) {
            setDrawerLockMode(savedState.lockModeRight, 5);
        }
        if (savedState.lockModeStart != 3) {
            setDrawerLockMode(savedState.lockModeStart, androidx.core.view.GravityCompat.START);
        }
        if (savedState.lockModeEnd != 3) {
            setDrawerLockMode(savedState.lockModeEnd, androidx.core.view.GravityCompat.END);
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.drawerlayout.widget.DrawerLayout.SavedState savedState = new androidx.drawerlayout.widget.DrawerLayout.SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) getChildAt(i).getLayoutParams();
            boolean z = layoutParams.openState == 1;
            boolean z2 = layoutParams.openState == 2;
            if (z || z2) {
                savedState.openDrawerGravity = layoutParams.gravity;
                break;
            }
        }
        savedState.lockModeLeft = this.mLockModeLeft;
        savedState.lockModeRight = this.mLockModeRight;
        savedState.lockModeStart = this.mLockModeStart;
        savedState.lockModeEnd = this.mLockModeEnd;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            androidx.core.view.ViewCompat.setImportantForAccessibility(view, 4);
        } else {
            androidx.core.view.ViewCompat.setImportantForAccessibility(view, 1);
        }
        if (CAN_HIDE_DESCENDANTS) {
            return;
        }
        androidx.core.view.ViewCompat.setAccessibilityDelegate(view, this.mChildAccessibilityDelegate);
    }

    static boolean includeChildForAccessibility(android.view.View view) {
        return (androidx.core.view.ViewCompat.getImportantForAccessibility(view) == 4 || androidx.core.view.ViewCompat.getImportantForAccessibility(view) == 2) ? false : true;
    }

    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.drawerlayout.widget.DrawerLayout.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.drawerlayout.widget.DrawerLayout.SavedState>() { // from class: androidx.drawerlayout.widget.DrawerLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.drawerlayout.widget.DrawerLayout.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.drawerlayout.widget.DrawerLayout.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.drawerlayout.widget.DrawerLayout.SavedState[] newArray(int i) {
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState[i];
            }
        };
        int lockModeEnd;
        int lockModeLeft;
        int lockModeRight;
        int lockModeStart;
        int openDrawerGravity;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.openDrawerGravity = 0;
            this.openDrawerGravity = parcel.readInt();
            this.lockModeLeft = parcel.readInt();
            this.lockModeRight = parcel.readInt();
            this.lockModeStart = parcel.readInt();
            this.lockModeEnd = parcel.readInt();
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
            this.openDrawerGravity = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.openDrawerGravity);
            parcel.writeInt(this.lockModeLeft);
            parcel.writeInt(this.lockModeRight);
            parcel.writeInt(this.lockModeStart);
            parcel.writeInt(this.lockModeEnd);
        }
    }

    private class ViewDragCallback extends androidx.customview.widget.ViewDragHelper.Callback {
        private final int mAbsGravity;
        private androidx.customview.widget.ViewDragHelper mDragger;
        private final java.lang.Runnable mPeekRunnable = new java.lang.Runnable() { // from class: androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback.this.peekDrawer();
            }
        };

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean onEdgeLock(int i) {
            return false;
        }

        ViewDragCallback(int i) {
            this.mAbsGravity = i;
        }

        public void setDragger(androidx.customview.widget.ViewDragHelper viewDragHelper) {
            this.mDragger = viewDragHelper;
        }

        public void removeCallbacks() {
            androidx.drawerlayout.widget.DrawerLayout.this.removeCallbacks(this.mPeekRunnable);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(android.view.View view, int i) {
            return androidx.drawerlayout.widget.DrawerLayout.this.isDrawerView(view) && androidx.drawerlayout.widget.DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, this.mAbsGravity) && androidx.drawerlayout.widget.DrawerLayout.this.getDrawerLockMode(view) == 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            androidx.drawerlayout.widget.DrawerLayout.this.updateDrawerState(i, this.mDragger.getCapturedView());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (androidx.drawerlayout.widget.DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3) ? i + width : androidx.drawerlayout.widget.DrawerLayout.this.getWidth() - i) / width;
            androidx.drawerlayout.widget.DrawerLayout.this.setDrawerViewOffset(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            androidx.drawerlayout.widget.DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(android.view.View view, int i) {
            ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).isPeeking = false;
            closeOtherDrawer();
        }

        private void closeOtherDrawer() {
            android.view.View viewFindDrawerWithGravity = androidx.drawerlayout.widget.DrawerLayout.this.findDrawerWithGravity(this.mAbsGravity == 3 ? 5 : 3);
            if (viewFindDrawerWithGravity != null) {
                androidx.drawerlayout.widget.DrawerLayout.this.closeDrawer(viewFindDrawerWithGravity);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(android.view.View view, float f, float f2) {
            int i;
            float drawerViewOffset = androidx.drawerlayout.widget.DrawerLayout.this.getDrawerViewOffset(view);
            int width = view.getWidth();
            if (androidx.drawerlayout.widget.DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width;
            } else {
                int width2 = androidx.drawerlayout.widget.DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.mDragger.settleCapturedViewAt(i, view.getTop());
            androidx.drawerlayout.widget.DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int i, int i2) {
            androidx.drawerlayout.widget.DrawerLayout.this.postDelayed(this.mPeekRunnable, 160L);
        }

        void peekDrawer() {
            android.view.View viewFindDrawerWithGravity;
            int width;
            int edgeSize = this.mDragger.getEdgeSize();
            boolean z = this.mAbsGravity == 3;
            if (z) {
                viewFindDrawerWithGravity = androidx.drawerlayout.widget.DrawerLayout.this.findDrawerWithGravity(3);
                width = (viewFindDrawerWithGravity != null ? -viewFindDrawerWithGravity.getWidth() : 0) + edgeSize;
            } else {
                viewFindDrawerWithGravity = androidx.drawerlayout.widget.DrawerLayout.this.findDrawerWithGravity(5);
                width = androidx.drawerlayout.widget.DrawerLayout.this.getWidth() - edgeSize;
            }
            if (viewFindDrawerWithGravity != null) {
                if (((!z || viewFindDrawerWithGravity.getLeft() >= width) && (z || viewFindDrawerWithGravity.getLeft() <= width)) || androidx.drawerlayout.widget.DrawerLayout.this.getDrawerLockMode(viewFindDrawerWithGravity) != 0) {
                    return;
                }
                androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) viewFindDrawerWithGravity.getLayoutParams();
                this.mDragger.smoothSlideViewTo(viewFindDrawerWithGravity, width, viewFindDrawerWithGravity.getTop());
                layoutParams.isPeeking = true;
                androidx.drawerlayout.widget.DrawerLayout.this.invalidate();
                closeOtherDrawer();
                androidx.drawerlayout.widget.DrawerLayout.this.cancelChildViewTouch();
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            android.view.View viewFindDrawerWithGravity;
            if ((i & 1) == 1) {
                viewFindDrawerWithGravity = androidx.drawerlayout.widget.DrawerLayout.this.findDrawerWithGravity(3);
            } else {
                viewFindDrawerWithGravity = androidx.drawerlayout.widget.DrawerLayout.this.findDrawerWithGravity(5);
            }
            if (viewFindDrawerWithGravity == null || androidx.drawerlayout.widget.DrawerLayout.this.getDrawerLockMode(viewFindDrawerWithGravity) != 0) {
                return;
            }
            this.mDragger.captureChildView(viewFindDrawerWithGravity, i2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(android.view.View view) {
            if (androidx.drawerlayout.widget.DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
            if (androidx.drawerlayout.widget.DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                return java.lang.Math.max(-view.getWidth(), java.lang.Math.min(i, 0));
            }
            int width = androidx.drawerlayout.widget.DrawerLayout.this.getWidth();
            return java.lang.Math.max(width - view.getWidth(), java.lang.Math.min(i, width));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(android.view.View view, int i, int i2) {
            return view.getTop();
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private static final int FLAG_IS_CLOSING = 4;
        private static final int FLAG_IS_OPENED = 1;
        private static final int FLAG_IS_OPENING = 2;
        public int gravity;
        boolean isPeeking;
        float onScreen;
        int openState;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.drawerlayout.widget.DrawerLayout.LAYOUT_ATTRS);
            this.gravity = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
        }

        public LayoutParams(int i, int i2, int i3) {
            this(i, i2);
            this.gravity = i3;
        }

        public LayoutParams(androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = 0;
        }
    }

    class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final android.graphics.Rect mTmpRect = new android.graphics.Rect();

        AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (androidx.drawerlayout.widget.DrawerLayout.CAN_HIDE_DESCENDANTS) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
                accessibilityNodeInfoCompat.setSource(view);
                java.lang.Object parentForAccessibility = androidx.core.view.ViewCompat.getParentForAccessibility(view);
                if (parentForAccessibility instanceof android.view.View) {
                    accessibilityNodeInfoCompat.setParent((android.view.View) parentForAccessibility);
                }
                copyNodeInfoNoChildren(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatObtain);
                accessibilityNodeInfoCompatObtain.recycle();
                addChildrenForAccessibility(accessibilityNodeInfoCompat, (android.view.ViewGroup) view);
            }
            accessibilityNodeInfoCompat.setClassName(androidx.drawerlayout.widget.DrawerLayout.ACCESSIBILITY_CLASS_NAME);
            accessibilityNodeInfoCompat.setFocusable(false);
            accessibilityNodeInfoCompat.setFocused(false);
            accessibilityNodeInfoCompat.removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS);
            accessibilityNodeInfoCompat.removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(androidx.drawerlayout.widget.DrawerLayout.ACCESSIBILITY_CLASS_NAME);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                java.util.List<java.lang.CharSequence> text = accessibilityEvent.getText();
                android.view.View viewFindVisibleDrawer = androidx.drawerlayout.widget.DrawerLayout.this.findVisibleDrawer();
                if (viewFindVisibleDrawer == null) {
                    return true;
                }
                java.lang.CharSequence drawerTitle = androidx.drawerlayout.widget.DrawerLayout.this.getDrawerTitle(androidx.drawerlayout.widget.DrawerLayout.this.getDrawerViewAbsoluteGravity(viewFindVisibleDrawer));
                if (drawerTitle == null) {
                    return true;
                }
                text.add(drawerTitle);
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            if (androidx.drawerlayout.widget.DrawerLayout.CAN_HIDE_DESCENDANTS || androidx.drawerlayout.widget.DrawerLayout.includeChildForAccessibility(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private void addChildrenForAccessibility(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, android.view.ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (androidx.drawerlayout.widget.DrawerLayout.includeChildForAccessibility(childAt)) {
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
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
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
        }
    }

    static final class ChildAccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        ChildAccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (androidx.drawerlayout.widget.DrawerLayout.includeChildForAccessibility(view)) {
                return;
            }
            accessibilityNodeInfoCompat.setParent(null);
        }
    }
}
