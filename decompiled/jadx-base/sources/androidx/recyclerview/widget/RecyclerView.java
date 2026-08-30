package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public class RecyclerView extends android.view.ViewGroup implements androidx.core.view.ScrollingView, androidx.core.view.NestedScrollingChild2, androidx.core.view.NestedScrollingChild3 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final java.lang.String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final java.lang.String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final java.lang.String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final java.lang.String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final java.lang.String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final java.lang.String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final java.lang.String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final java.lang.String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final java.lang.String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager;
    androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;
    androidx.recyclerview.widget.AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private android.widget.EdgeEffect mBottomGlow;
    private androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    androidx.recyclerview.widget.ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private androidx.recyclerview.widget.RecyclerView.OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    androidx.recyclerview.widget.RecyclerView.ItemAnimator mItemAnimator;
    private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private java.lang.Runnable mItemAnimatorRunner;
    final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    androidx.recyclerview.widget.RecyclerView.LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private android.widget.EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final androidx.recyclerview.widget.RecyclerView.RecyclerViewDataObserver mObserver;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private androidx.recyclerview.widget.RecyclerView.OnFlingListener mOnFlingListener;
    private final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.OnItemTouchListener> mOnItemTouchListeners;
    final java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mPendingAccessibilityImportanceChange;
    androidx.recyclerview.widget.RecyclerView.SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final androidx.recyclerview.widget.RecyclerView.Recycler mRecycler;
    androidx.recyclerview.widget.RecyclerView.RecyclerListener mRecyclerListener;
    final java.util.List<androidx.recyclerview.widget.RecyclerView.RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private android.widget.EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private androidx.recyclerview.widget.RecyclerView.OnScrollListener mScrollListener;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.NestedScrollingChildHelper mScrollingChildHelper;
    final androidx.recyclerview.widget.RecyclerView.State mState;
    final android.graphics.Rect mTempRect;
    private final android.graphics.Rect mTempRect2;
    final android.graphics.RectF mTempRectF;
    private android.widget.EdgeEffect mTopGlow;
    private int mTouchSlop;
    final java.lang.Runnable mUpdateChildViewsRunnable;
    private android.view.VelocityTracker mVelocityTracker;
    final androidx.recyclerview.widget.RecyclerView.ViewFlinger mViewFlinger;
    private final androidx.recyclerview.widget.ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final androidx.recyclerview.widget.ViewInfoStore mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {android.R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final java.lang.Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = {android.content.Context.class, android.util.AttributeSet.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE};
    static final android.view.animation.Interpolator sQuinticInterpolator = new android.view.animation.Interpolator() { // from class: androidx.recyclerview.widget.RecyclerView.3
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    static final androidx.recyclerview.widget.RecyclerView.StretchEdgeEffectFactory sDefaultEdgeEffectFactory = new androidx.recyclerview.widget.RecyclerView.StretchEdgeEffectFactory();

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i, int i2);
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(android.view.View view);

        void onChildViewDetachedFromWindow(android.view.View view);
    }

    public static abstract class OnFlingListener {
        public abstract boolean onFling(int i, int i2);
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent);
    }

    public static abstract class OnScrollListener {
        public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        }

        public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public interface RecyclerListener {
        void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);
    }

    public static class SimpleOnItemTouchListener implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        }
    }

    public static abstract class ViewCacheExtension {
        public abstract android.view.View getViewForPositionAndType(androidx.recyclerview.widget.RecyclerView.Recycler recycler, int i, int i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public void onChildAttachedToWindow(android.view.View view) {
    }

    public void onChildDetachedFromWindow(android.view.View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    public RecyclerView(android.content.Context context) {
        this(context, null);
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new androidx.recyclerview.widget.RecyclerView.RecyclerViewDataObserver();
        this.mRecycler = new androidx.recyclerview.widget.RecyclerView.Recycler();
        this.mViewInfoStore = new androidx.recyclerview.widget.ViewInfoStore();
        this.mUpdateChildViewsRunnable = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.1
            @Override // java.lang.Runnable
            public void run() {
                if (!androidx.recyclerview.widget.RecyclerView.this.mFirstLayoutComplete || androidx.recyclerview.widget.RecyclerView.this.isLayoutRequested()) {
                    return;
                }
                if (!androidx.recyclerview.widget.RecyclerView.this.mIsAttached) {
                    androidx.recyclerview.widget.RecyclerView.this.requestLayout();
                } else if (androidx.recyclerview.widget.RecyclerView.this.mLayoutSuppressed) {
                    androidx.recyclerview.widget.RecyclerView.this.mLayoutWasDefered = true;
                } else {
                    androidx.recyclerview.widget.RecyclerView.this.consumePendingUpdateOperations();
                }
            }
        };
        this.mTempRect = new android.graphics.Rect();
        this.mTempRect2 = new android.graphics.Rect();
        this.mTempRectF = new android.graphics.RectF();
        this.mRecyclerListeners = new java.util.ArrayList();
        this.mItemDecorations = new java.util.ArrayList<>();
        this.mOnItemTouchListeners = new java.util.ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new androidx.recyclerview.widget.RecyclerView.ViewFlinger();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl() : null;
        this.mState = new androidx.recyclerview.widget.RecyclerView.State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new androidx.recyclerview.widget.RecyclerView.ItemAnimatorRestoreListener();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new java.util.ArrayList();
        this.mItemAnimatorRunner = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.2
            @Override // java.lang.Runnable
            public void run() {
                if (androidx.recyclerview.widget.RecyclerView.this.mItemAnimator != null) {
                    androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.runPendingAnimations();
                }
                androidx.recyclerview.widget.RecyclerView.this.mPostedAnimatorRunner = false;
            }
        };
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new androidx.recyclerview.widget.ViewInfoStore.ProcessCallback() { // from class: androidx.recyclerview.widget.RecyclerView.4
            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void processDisappeared(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                androidx.recyclerview.widget.RecyclerView.this.mRecycler.unscrapView(viewHolder);
                androidx.recyclerview.widget.RecyclerView.this.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void processAppeared(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                androidx.recyclerview.widget.RecyclerView.this.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void processPersistent(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                viewHolder.setIsRecyclable(false);
                if (androidx.recyclerview.widget.RecyclerView.this.mDataSetHasChangedAfterLayout) {
                    if (androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.animateChange(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                        androidx.recyclerview.widget.RecyclerView.this.postAnimationRunner();
                    }
                } else if (androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.animatePersistence(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    androidx.recyclerview.widget.RecyclerView.this.postAnimationRunner();
                }
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void unused(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
                androidx.recyclerview.widget.RecyclerView.this.mLayout.removeAndRecycleView(viewHolder.itemView, androidx.recyclerview.widget.RecyclerView.this.mRecycler);
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = androidx.core.view.ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = androidx.core.view.ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (androidx.core.view.ViewCompat.getImportantForAccessibility(this) == 0) {
            androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.mAccessibilityManager = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate(this));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.recyclerview.R.styleable.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        java.lang.String string = typedArrayObtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((android.graphics.drawable.StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (android.graphics.drawable.StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        androidx.customview.poolingcontainer.PoolingContainer.setPoolingContainer(this, true);
    }

    java.lang.String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    private void initAutofill() {
        if (androidx.core.view.ViewCompat.getImportantForAutofill(this) == 0) {
            androidx.core.view.ViewCompat.setImportantForAutofill(this, 8);
        }
    }

    public androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, recyclerViewAccessibilityDelegate);
    }

    private void createLayoutManager(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet, int i, int i2) {
        java.lang.ClassLoader classLoader;
        java.lang.reflect.Constructor constructor;
        java.lang.Object[] objArr;
        if (str != null) {
            java.lang.String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            java.lang.String fullClassName = getFullClassName(context, strTrim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(fullClassName, false, classLoader).asSubclass(androidx.recyclerview.widget.RecyclerView.LayoutManager.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new java.lang.Object[]{context, attributeSet, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
                } catch (java.lang.NoSuchMethodException e) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new java.lang.Class[0]);
                        objArr = null;
                    } catch (java.lang.NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((androidx.recyclerview.widget.RecyclerView.LayoutManager) constructor.newInstance(objArr));
            } catch (java.lang.ClassCastException e3) {
                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
            } catch (java.lang.ClassNotFoundException e4) {
                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
            } catch (java.lang.IllegalAccessException e5) {
                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
            } catch (java.lang.InstantiationException e6) {
                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
            } catch (java.lang.reflect.InvocationTargetException e7) {
                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            }
        }
    }

    private java.lang.String getFullClassName(android.content.Context context, java.lang.String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        return str.contains(".") ? str : androidx.recyclerview.widget.RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.ChildHelper(new androidx.recyclerview.widget.ChildHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.5
            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public int getChildCount() {
                return androidx.recyclerview.widget.RecyclerView.this.getChildCount();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void addView(android.view.View view, int i) {
                androidx.recyclerview.widget.RecyclerView.this.addView(view, i);
                androidx.recyclerview.widget.RecyclerView.this.dispatchChildAttached(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public int indexOfChild(android.view.View view) {
                return androidx.recyclerview.widget.RecyclerView.this.indexOfChild(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void removeViewAt(int i) {
                android.view.View childAt = androidx.recyclerview.widget.RecyclerView.this.getChildAt(i);
                if (childAt != null) {
                    androidx.recyclerview.widget.RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                androidx.recyclerview.widget.RecyclerView.this.removeViewAt(i);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public android.view.View getChildAt(int i) {
                return androidx.recyclerview.widget.RecyclerView.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void removeAllViews() {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = getChildAt(i);
                    androidx.recyclerview.widget.RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                androidx.recyclerview.widget.RecyclerView.this.removeAllViews();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public androidx.recyclerview.widget.RecyclerView.ViewHolder getChildViewHolder(android.view.View view) {
                return androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void attachViewToParent(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new java.lang.IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                    }
                    childViewHolderInt.clearTmpDetachFlag();
                }
                androidx.recyclerview.widget.RecyclerView.this.attachViewToParent(view, i, layoutParams);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void detachViewFromParent(int i) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt;
                android.view.View childAt = getChildAt(i);
                if (childAt != null && (childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(childAt)) != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new java.lang.IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                    }
                    childViewHolderInt.addFlags(256);
                }
                androidx.recyclerview.widget.RecyclerView.this.detachViewFromParent(i);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void onEnteredHiddenState(android.view.View view) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onEnteredHiddenState(androidx.recyclerview.widget.RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void onLeftHiddenState(android.view.View view) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(androidx.recyclerview.widget.RecyclerView.this);
                }
            }
        });
    }

    void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.AdapterHelper(new androidx.recyclerview.widget.AdapterHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.6
            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolder(int i) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderFindViewHolderForPosition = androidx.recyclerview.widget.RecyclerView.this.findViewHolderForPosition(i, true);
                if (viewHolderFindViewHolderForPosition == null || androidx.recyclerview.widget.RecyclerView.this.mChildHelper.isHidden(viewHolderFindViewHolderForPosition.itemView)) {
                    return null;
                }
                return viewHolderFindViewHolderForPosition;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForRemovingInvisible(int i, int i2) {
                androidx.recyclerview.widget.RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
                androidx.recyclerview.widget.RecyclerView.this.mItemsAddedOrRemoved = true;
                androidx.recyclerview.widget.RecyclerView.this.mState.mDeletedInvisibleItemCountSincePreviousLayout += i2;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForRemovingLaidOutOrNewView(int i, int i2) {
                androidx.recyclerview.widget.RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
                androidx.recyclerview.widget.RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void markViewHoldersUpdated(int i, int i2, java.lang.Object obj) {
                androidx.recyclerview.widget.RecyclerView.this.viewRangeUpdate(i, i2, obj);
                androidx.recyclerview.widget.RecyclerView.this.mItemsChanged = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void onDispatchFirstPass(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
                dispatchUpdate(updateOp);
            }

            void dispatchUpdate(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
                int i = updateOp.cmd;
                if (i == 1) {
                    androidx.recyclerview.widget.RecyclerView.this.mLayout.onItemsAdded(androidx.recyclerview.widget.RecyclerView.this, updateOp.positionStart, updateOp.itemCount);
                    return;
                }
                if (i == 2) {
                    androidx.recyclerview.widget.RecyclerView.this.mLayout.onItemsRemoved(androidx.recyclerview.widget.RecyclerView.this, updateOp.positionStart, updateOp.itemCount);
                } else if (i == 4) {
                    androidx.recyclerview.widget.RecyclerView.this.mLayout.onItemsUpdated(androidx.recyclerview.widget.RecyclerView.this, updateOp.positionStart, updateOp.itemCount, updateOp.payload);
                } else {
                    if (i != 8) {
                        return;
                    }
                    androidx.recyclerview.widget.RecyclerView.this.mLayout.onItemsMoved(androidx.recyclerview.widget.RecyclerView.this, updateOp.positionStart, updateOp.itemCount, 1);
                }
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void onDispatchSecondPass(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
                dispatchUpdate(updateOp);
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForAdd(int i, int i2) {
                androidx.recyclerview.widget.RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
                androidx.recyclerview.widget.RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForMove(int i, int i2) {
                androidx.recyclerview.widget.RecyclerView.this.offsetPositionRecordsForMove(i, i2);
                androidx.recyclerview.widget.RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        });
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int i) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                android.util.Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void swapAdapter(androidx.recyclerview.widget.RecyclerView.Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(androidx.recyclerview.widget.RecyclerView.Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    void removeAndRecycleViews() {
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.clear();
    }

    private void setAdapterInternal(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, boolean z, boolean z2) {
        androidx.recyclerview.widget.RecyclerView.Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.reset();
        androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(adapter3, this.mAdapter);
        }
        this.mRecycler.onAdapterChanged(adapter3, this.mAdapter, z);
        this.mState.mStructureChanged = true;
    }

    public androidx.recyclerview.widget.RecyclerView.Adapter getAdapter() {
        return this.mAdapter;
    }

    @java.lang.Deprecated
    public void setRecyclerListener(androidx.recyclerview.widget.RecyclerView.RecyclerListener recyclerListener) {
        this.mRecyclerListener = recyclerListener;
    }

    public void addRecyclerListener(androidx.recyclerview.widget.RecyclerView.RecyclerListener recyclerListener) {
        androidx.core.util.Preconditions.checkArgument(recyclerListener != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerListener);
    }

    public void removeRecyclerListener(androidx.recyclerview.widget.RecyclerView.RecyclerListener recyclerListener) {
        this.mRecyclerListeners.remove(recyclerListener);
    }

    @Override // android.view.View
    public int getBaseline() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.getBaseline();
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new java.util.ArrayList();
        }
        this.mOnChildAttachStateListeners.add(onChildAttachStateChangeListener);
    }

    public void removeOnChildAttachStateChangeListener(androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(onChildAttachStateChangeListener);
    }

    public void clearOnChildAttachStateChangeListeners() {
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setLayoutManager(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.clear();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.clear();
        }
        this.mChildHelper.removeAllViewsUnfiltered();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                throw new java.lang.IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.mRecyclerView.exceptionLabel());
            }
            this.mLayout.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.updateViewCacheSize();
        requestLayout();
    }

    public void setOnFlingListener(androidx.recyclerview.widget.RecyclerView.OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    public androidx.recyclerview.widget.RecyclerView.OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.recyclerview.widget.RecyclerView.SavedState savedState = new androidx.recyclerview.widget.RecyclerView.SavedState(super.onSaveInstanceState());
        androidx.recyclerview.widget.RecyclerView.SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.copyFrom(savedState2);
        } else {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                savedState.mLayoutState = layoutManager.onSaveInstanceState();
            } else {
                savedState.mLayoutState = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.recyclerview.widget.RecyclerView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.recyclerview.widget.RecyclerView.SavedState savedState = (androidx.recyclerview.widget.RecyclerView.SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void addAnimatingView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        android.view.View view = viewHolder.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.unscrapView(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.mChildHelper.attachViewToParent(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.addView(view, true);
        } else {
            this.mChildHelper.hide(view);
        }
    }

    boolean removeAnimatingView(android.view.View view) {
        startInterceptRequestLayout();
        boolean zRemoveViewIfHidden = this.mChildHelper.removeViewIfHidden(view);
        if (zRemoveViewIfHidden) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.unscrapView(childViewHolderInt);
            this.mRecycler.recycleViewHolderInternal(childViewHolderInt);
        }
        stopInterceptRequestLayout(!zRemoveViewIfHidden);
        return zRemoveViewIfHidden;
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public androidx.recyclerview.widget.RecyclerView.RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.getRecycledViewPool();
    }

    public void setRecycledViewPool(androidx.recyclerview.widget.RecyclerView.RecycledViewPool recycledViewPool) {
        this.mRecycler.setRecycledViewPool(recycledViewPool);
    }

    public void setViewCacheExtension(androidx.recyclerview.widget.RecyclerView.ViewCacheExtension viewCacheExtension) {
        this.mRecycler.setViewCacheExtension(viewCacheExtension);
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.setViewCacheSize(i);
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void addItemDecoration(androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration, int i) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(itemDecoration);
        } else {
            this.mItemDecorations.add(i, itemDecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }

    public androidx.recyclerview.widget.RecyclerView.ItemDecoration getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new java.lang.IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        return this.mItemDecorations.get(i);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new java.lang.IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeItemDecoration(androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(itemDecoration);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    @java.lang.Deprecated
    public void setOnScrollListener(androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void addOnScrollListener(androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new java.util.ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void removeOnScrollListener(androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener) {
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void clearOnScrollListeners() {
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            android.util.Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            android.util.Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.smoothScrollToPosition(this, this.mState, i);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        android.util.Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            android.util.Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    private void nestedScrollByInternal(int i, int i2, android.view.MotionEvent motionEvent, int i3) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            android.util.Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i4 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i - releaseHorizontalGlow(i, height);
        int iReleaseVerticalGlow = i2 - releaseVerticalGlow(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, i3);
        androidx.recyclerview.widget.GapWorker gapWorker = this.mGapWorker;
        if (gapWorker != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            gapWorker.postFromTraversal(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i3);
    }

    void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        androidx.core.os.TraceCompat.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        androidx.core.os.TraceCompat.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            androidx.core.os.TraceCompat.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            androidx.core.os.TraceCompat.endSection();
            return;
        }
        if (this.mAdapterHelper.hasPendingUpdates()) {
            if (this.mAdapterHelper.hasAnyUpdateTypes(4) && !this.mAdapterHelper.hasAnyUpdateTypes(11)) {
                androidx.core.os.TraceCompat.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.preProcess();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.consumePostponedUpdates();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                androidx.core.os.TraceCompat.endSection();
                return;
            }
            if (this.mAdapterHelper.hasPendingUpdates()) {
                androidx.core.os.TraceCompat.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                androidx.core.os.TraceCompat.endSection();
            }
        }
    }

    private boolean hasUpdatedView() {
        int childCount = this.mChildHelper.getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    boolean scrollByInternal(int i, int i2, android.view.MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.MotionEventCompat.isFromSource(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    private int releaseHorizontalGlow(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mLeftGlow, -width, 1.0f - height);
                if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            android.widget.EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fOnPullDistance = androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mRightGlow, width, height);
                    if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fOnPullDistance;
                }
                invalidate();
            }
        }
        return java.lang.Math.round(f2 * getWidth());
    }

    private int releaseVerticalGlow(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        android.widget.EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mTopGlow, -height, width);
                if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            android.widget.EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fOnPullDistance = androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mBottomGlow, height, 1.0f - width);
                    if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fOnPullDistance;
                }
                invalidate();
            }
        }
        return java.lang.Math.round(f2 * getHeight());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            onTouchEvent(android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @java.lang.Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @java.lang.Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new java.lang.IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, android.view.animation.Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(int i, int i2, android.view.animation.Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    void smoothScrollBy(int i, int i2, android.view.animation.Interpolator interpolator, int i3, boolean z) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            android.util.Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 == Integer.MIN_VALUE || i3 > 0) {
            if (z) {
                int i4 = i != 0 ? 1 : 0;
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.mViewFlinger.smoothScrollBy(i, i2, i3, interpolator);
            return;
        }
        scrollBy(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i, int i2) {
        int iMax;
        int i3;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            android.util.Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || java.lang.Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || java.lang.Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            iMax = 0;
        } else {
            android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
                int i4 = -i;
                if (shouldAbsorb(this.mLeftGlow, i4, getWidth())) {
                    this.mLeftGlow.onAbsorb(i4);
                    i = 0;
                }
            } else {
                android.widget.EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (shouldAbsorb(this.mRightGlow, i, getWidth())) {
                    this.mRightGlow.onAbsorb(i);
                    i = 0;
                }
            }
            iMax = i;
            i = 0;
        }
        if (i2 == 0) {
            i3 = i2;
            i2 = 0;
        } else {
            android.widget.EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect3) != 0.0f) {
                int i5 = -i2;
                if (shouldAbsorb(this.mTopGlow, i5, getHeight())) {
                    this.mTopGlow.onAbsorb(i5);
                    i2 = 0;
                }
            } else {
                android.widget.EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect4) == 0.0f) {
                    i3 = i2;
                    i2 = 0;
                } else if (shouldAbsorb(this.mBottomGlow, i2, getHeight())) {
                    this.mBottomGlow.onAbsorb(i2);
                    i2 = 0;
                }
            }
            i3 = 0;
        }
        if (iMax != 0 || i2 != 0) {
            int i6 = this.mMaxFlingVelocity;
            iMax = java.lang.Math.max(-i6, java.lang.Math.min(iMax, i6));
            int i7 = this.mMaxFlingVelocity;
            i2 = java.lang.Math.max(-i7, java.lang.Math.min(i2, i7));
            this.mViewFlinger.fling(iMax, i2);
        }
        if (i == 0 && i3 == 0) {
            return (iMax == 0 && i2 == 0) ? false : true;
        }
        float f = i;
        float f2 = i3;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            androidx.recyclerview.widget.RecyclerView.OnFlingListener onFlingListener = this.mOnFlingListener;
            if (onFlingListener != null && onFlingListener.onFling(i, i3)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i8 = this.mMaxFlingVelocity;
                int iMax2 = java.lang.Math.max(-i8, java.lang.Math.min(i, i8));
                int i9 = this.mMaxFlingVelocity;
                this.mViewFlinger.fling(iMax2, java.lang.Math.max(-i9, java.lang.Math.min(i3, i9)));
                return true;
            }
        }
        return false;
    }

    private boolean shouldAbsorb(android.widget.EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return getSplineFlingDistance(-i) < androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) * ((float) i2);
    }

    int consumeFlingInHorizontalStretch(int i) {
        return consumeFlingInStretch(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i) {
        return consumeFlingInStretch(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    private int consumeFlingInStretch(int i, android.widget.EdgeEffect edgeEffect, android.widget.EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            int iRound = java.lang.Math.round(((-i2) / FLING_DESTRETCH_FACTOR) * androidx.core.widget.EdgeEffectCompat.onPullDistance(edgeEffect, ((-i) * FLING_DESTRETCH_FACTOR) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = java.lang.Math.round((f / FLING_DESTRETCH_FACTOR) * androidx.core.widget.EdgeEffectCompat.onPullDistance(edgeEffect2, (i * FLING_DESTRETCH_FACTOR) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.stop();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 >= 0.0f) {
            if (f2 > 0.0f) {
                ensureRightGlow();
                androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
            } else {
                z = false;
            }
            if (f4 < 0.0f) {
                ensureTopGlow();
                androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > 0.0f) {
                ensureBottomGlow();
                androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (z2 && f2 == 0.0f && f4 == 0.0f) {
                return;
            }
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
        ensureLeftGlow();
        androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        z = true;
        if (f4 < 0.0f) {
            ensureTopGlow();
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
        } else if (f4 > 0.0f) {
            ensureBottomGlow();
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
        } else {
            z2 = z;
        }
        if (z2) {
        }
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
    }

    private void releaseGlows() {
        boolean zIsFinished;
        android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        android.widget.EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 0);
        this.mLeftGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 2);
        this.mRightGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 1);
        this.mTopGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 3);
        this.mBottomGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void setEdgeEffectFactory(androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory edgeEffectFactory) {
        androidx.core.util.Preconditions.checkNotNull(edgeEffectFactory);
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    public androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View view, int i) {
        android.view.View viewOnFocusSearchFailed;
        boolean z;
        android.view.View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i);
        } else {
            android.view.View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i) ? viewOnFocusSearchFailed : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    private boolean isPreferredNextFocus(android.view.View view, android.view.View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b = -1;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        if ((this.mTempRect.left < this.mTempRect2.left || this.mTempRect.right <= this.mTempRect2.left) && this.mTempRect.right < this.mTempRect2.right) {
            i2 = 1;
        } else {
            i2 = ((this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        if ((this.mTempRect.top < this.mTempRect2.top || this.mTempRect.bottom <= this.mTempRect2.top) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            b = 1;
        } else if ((this.mTempRect.bottom <= this.mTempRect2.bottom && this.mTempRect.top < this.mTempRect2.bottom) || this.mTempRect.top <= this.mTempRect2.top) {
            b = 0;
        }
        if (i == 1) {
            return b < 0 || (b == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return b > 0 || (b == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return b < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return b > 0;
        }
        throw new java.lang.IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private void requestChildOnScreen(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
            if (!layoutParams2.mInsetsDirty) {
                android.graphics.Rect rect = layoutParams2.mDecorInsets;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                this.mTempRect.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> arrayList, int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.onAttachedToWindow();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            androidx.recyclerview.widget.GapWorker gapWorker = androidx.recyclerview.widget.GapWorker.sGapWorker.get();
            this.mGapWorker = gapWorker;
            if (gapWorker == null) {
                this.mGapWorker = new androidx.recyclerview.widget.GapWorker();
                android.view.Display display = androidx.core.view.ViewCompat.getDisplay(this);
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                this.mGapWorker.mFrameIntervalNs = (long) (1.0E9f / refreshRate);
                androidx.recyclerview.widget.GapWorker.sGapWorker.set(this.mGapWorker);
            }
            this.mGapWorker.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.GapWorker gapWorker;
        super.onDetachedFromWindow();
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.onDetach();
        this.mRecycler.onDetachedFromWindow();
        androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnReleaseForChildren(this);
        if (!ALLOW_THREAD_GAP_WORK || (gapWorker = this.mGapWorker) == null) {
            return;
        }
        gapWorker.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    void assertInLayoutOrScroll(java.lang.String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new java.lang.IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new java.lang.IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(java.lang.String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new java.lang.IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            android.util.Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new java.lang.IllegalStateException("" + exceptionLabel()));
        }
    }

    public void addOnItemTouchListener(androidx.recyclerview.widget.RecyclerView.OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void removeOnItemTouchListener(androidx.recyclerview.widget.RecyclerView.OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    private boolean dispatchToOnItemTouchListeners(android.view.MotionEvent motionEvent) {
        androidx.recyclerview.widget.RecyclerView.OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
        if (onItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        onItemTouchListener.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            androidx.recyclerview.widget.RecyclerView.OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                android.util.Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || java.lang.Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && java.lang.Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    private boolean stopGlowAnimations(android.view.MotionEvent motionEvent) {
        boolean z;
        android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        android.widget.EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        android.widget.EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        android.widget.EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00de A[PHI: r0
  0x00de: PHI (r0v37 int) = (r0v26 int), (r0v41 int) binds: [B:41:0x00c7, B:45:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int i;
        boolean z;
        boolean z2 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (zCanScrollVertically) {
                i = zCanScrollHorizontally;
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            i = zCanScrollHorizontally;
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.addMovement(motionEventObtain);
            this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
            float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
            float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
            if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                setScrollState(0);
            }
            resetScroll();
            z2 = true;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                android.util.Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int iMin = this.mLastTouchX - x2;
            int iMin2 = this.mLastTouchY - y2;
            if (this.mScrollState != 1) {
                if (zCanScrollHorizontally) {
                    if (iMin > 0) {
                        iMin = java.lang.Math.max(0, iMin - this.mTouchSlop);
                    } else {
                        iMin = java.lang.Math.min(0, iMin + this.mTouchSlop);
                    }
                    if (iMin != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (zCanScrollVertically) {
                    if (iMin2 > 0) {
                        iMin2 = java.lang.Math.max(0, iMin2 - this.mTouchSlop);
                    } else {
                        iMin2 = java.lang.Math.min(0, iMin2 + this.mTouchSlop);
                    }
                    if (iMin2 != 0) {
                        z = true;
                    }
                }
                if (z) {
                    setScrollState(1);
                }
            }
            if (this.mScrollState == 1) {
                int[] iArr3 = this.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int iReleaseHorizontalGlow = iMin - releaseHorizontalGlow(iMin, motionEvent.getY());
                int iReleaseVerticalGlow = iMin2 - releaseVerticalGlow(iMin2, motionEvent.getX());
                if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                    int[] iArr4 = this.mReusableIntPair;
                    iReleaseHorizontalGlow -= iArr4[0];
                    iReleaseVerticalGlow -= iArr4[1];
                    int[] iArr5 = this.mNestedOffsets;
                    int i2 = iArr5[0];
                    int[] iArr6 = this.mScrollOffset;
                    iArr5[0] = i2 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i3 = iReleaseVerticalGlow;
                int[] iArr7 = this.mScrollOffset;
                this.mLastTouchX = x2 - iArr7[0];
                this.mLastTouchY = y2 - iArr7[1];
                if (scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? i3 : 0, motionEvent, 0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                androidx.recyclerview.widget.GapWorker gapWorker = this.mGapWorker;
                if (gapWorker != null && (iReleaseHorizontalGlow != 0 || i3 != 0)) {
                    gapWorker.postFromTraversal(this, iReleaseHorizontalGlow, i3);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (!z2) {
            this.mVelocityTracker.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    private void resetScroll() {
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void onPointerUp(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.mLayoutStep == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.mIsMeasuring = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.mIsMeasuring = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            if (this.mState.mRunPredictiveAnimations) {
                this.mState.mInPreLayout = true;
            } else {
                this.mAdapterHelper.consumeUpdatesInOnePass();
                this.mState.mInPreLayout = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.mRunPredictiveAnimations) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.mItemCount = adapter.getItemCount();
        } else {
            this.mState.mItemCount = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.mInPreLayout = false;
    }

    void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i, getPaddingLeft() + getPaddingRight(), androidx.core.view.ViewCompat.getMinimumWidth(this)), androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i2, getPaddingTop() + getPaddingBottom(), androidx.core.view.ViewCompat.getMinimumHeight(this)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    public void setItemAnimator(androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator) {
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.setListener(this.mItemAnimatorListener);
        }
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    boolean isAccessibilityEnabled() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        androidx.core.view.accessibility.AccessibilityEventCompat.setContentChangeTypes(accessibilityEventObtain, i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    boolean shouldDeferAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? androidx.core.view.accessibility.AccessibilityEventCompat.getContentChangeTypes(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public androidx.recyclerview.widget.RecyclerView.ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        androidx.core.view.ViewCompat.postOnAnimation(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.reset();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.preProcess();
        } else {
            this.mAdapterHelper.consumeUpdatesInOnePass();
        }
        boolean z = false;
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.mRunSimpleAnimations = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.mRequestedSimpleAnimations) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.hasStableIds());
        androidx.recyclerview.widget.RecyclerView.State state = this.mState;
        if (state.mRunSimpleAnimations && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        state.mRunPredictiveAnimations = z;
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            android.util.Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            android.util.Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.mIsMeasuring = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.mLayoutStep == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.hasUpdates() || z || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
        }
        dispatchLayoutStep3();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        android.view.View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (viewHolderFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.mFocusedItemId = this.mAdapter.hasStableIds() ? viewHolderFindContainingViewHolder.getItemId() : -1L;
        androidx.recyclerview.widget.RecyclerView.State state = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = viewHolderFindContainingViewHolder.isRemoved() ? viewHolderFindContainingViewHolder.mOldPosition : viewHolderFindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        state.mFocusedItemPosition = absoluteAdapterPosition;
        this.mState.mFocusedSubChildId = getDeepestFocusedViewWithId(viewHolderFindContainingViewHolder.itemView);
    }

    private void resetFocusInfo() {
        this.mState.mFocusedItemId = -1L;
        this.mState.mFocusedItemPosition = -1;
        this.mState.mFocusedSubChildId = -1;
    }

    private android.view.View findNextViewToFocus() {
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        int i = this.mState.mFocusedItemPosition != -1 ? this.mState.mFocusedItemPosition : 0;
        int itemCount = this.mState.getItemCount();
        for (int i2 = i; i2 < itemCount; i2++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (viewHolderFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return viewHolderFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = java.lang.Math.min(itemCount, i);
        do {
            iMin--;
            if (iMin < 0 || (viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return viewHolderFindViewHolderForAdapterPosition.itemView;
    }

    private void recoverFocusFromState() {
        android.view.View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            android.view.View focusedChild = getFocusedChild();
            if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.mChildHelper.getChildCount() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.mChildHelper.isHidden(focusedChild)) {
                return;
            }
        }
        android.view.View viewFindNextViewToFocus = null;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderFindViewHolderForItemId = (this.mState.mFocusedItemId == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.mFocusedItemId);
        if (viewHolderFindViewHolderForItemId == null || this.mChildHelper.isHidden(viewHolderFindViewHolderForItemId.itemView) || !viewHolderFindViewHolderForItemId.itemView.hasFocusable()) {
            if (this.mChildHelper.getChildCount() > 0) {
                viewFindNextViewToFocus = findNextViewToFocus();
            }
        } else {
            viewFindNextViewToFocus = viewHolderFindViewHolderForItemId.itemView;
        }
        if (viewFindNextViewToFocus != null) {
            if (this.mState.mFocusedSubChildId != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(this.mState.mFocusedSubChildId)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private int getDeepestFocusedViewWithId(android.view.View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof android.view.ViewGroup) && view.hasFocus()) {
            view = ((android.view.ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    final void fillRemainingScrollValues(androidx.recyclerview.widget.RecyclerView.State state) {
        if (getScrollState() == 2) {
            android.widget.OverScroller overScroller = this.mViewFlinger.mOverScroller;
            state.mRemainingScrollHorizontal = overScroller.getFinalX() - overScroller.getCurrX();
            state.mRemainingScrollVertical = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            state.mRemainingScrollHorizontal = 0;
            state.mRemainingScrollVertical = 0;
        }
    }

    private void dispatchLayoutStep1() {
        this.mState.assertLayoutStep(1);
        fillRemainingScrollValues(this.mState);
        this.mState.mIsMeasuring = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.clear();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        androidx.recyclerview.widget.RecyclerView.State state = this.mState;
        state.mTrackOldChangeHolders = state.mRunSimpleAnimations && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        androidx.recyclerview.widget.RecyclerView.State state2 = this.mState;
        state2.mInPreLayout = state2.mRunPredictiveAnimations;
        this.mState.mItemCount = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.mRunSimpleAnimations) {
            int childCount = this.mChildHelper.getChildCount();
            for (int i = 0; i < childCount; i++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.addToPreLayout(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.mTrackOldChangeHolders && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.addToOldChangeHolders(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.mRunPredictiveAnimations) {
            saveOldPositions();
            boolean z = this.mState.mStructureChanged;
            this.mState.mStructureChanged = false;
            this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
            this.mState.mStructureChanged = z;
            for (int i2 = 0; i2 < this.mChildHelper.getChildCount(); i2++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.getChildAt(i2));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.isInPreLayout(childViewHolderInt2)) {
                    int iBuildAdapterChangeFlagsForAnimations = androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iBuildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, iBuildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, itemHolderInfoRecordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.addToAppearedInPreLayoutHolders(childViewHolderInt2, itemHolderInfoRecordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.mLayoutStep = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.assertLayoutStep(6);
        this.mAdapterHelper.consumeUpdatesInOnePass();
        this.mState.mItemCount = this.mAdapter.getItemCount();
        this.mState.mDeletedInvisibleItemCountSincePreviousLayout = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            if (this.mPendingSavedState.mLayoutState != null) {
                this.mLayout.onRestoreInstanceState(this.mPendingSavedState.mLayoutState);
            }
            this.mPendingSavedState = null;
        }
        this.mState.mInPreLayout = false;
        this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
        this.mState.mStructureChanged = false;
        androidx.recyclerview.widget.RecyclerView.State state = this.mState;
        state.mRunSimpleAnimations = state.mRunSimpleAnimations && this.mItemAnimator != null;
        this.mState.mLayoutStep = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.assertLayoutStep(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mLayoutStep = 1;
        if (this.mState.mRunSimpleAnimations) {
            for (int childCount = this.mChildHelper.getChildCount() - 1; childCount >= 0; childCount--) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(childCount));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfoRecordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    androidx.recyclerview.widget.RecyclerView.ViewHolder fromOldChangeHolders = this.mViewInfoStore.getFromOldChangeHolders(changedHolderKey);
                    if (fromOldChangeHolders != null && !fromOldChangeHolders.shouldIgnore()) {
                        boolean zIsDisappearing = this.mViewInfoStore.isDisappearing(fromOldChangeHolders);
                        boolean zIsDisappearing2 = this.mViewInfoStore.isDisappearing(childViewHolderInt);
                        if (zIsDisappearing && fromOldChangeHolders == childViewHolderInt) {
                            this.mViewInfoStore.addToPostLayout(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                        } else {
                            androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfoPopFromPreLayout = this.mViewInfoStore.popFromPreLayout(fromOldChangeHolders);
                            this.mViewInfoStore.addToPostLayout(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                            androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfoPopFromPostLayout = this.mViewInfoStore.popFromPostLayout(childViewHolderInt);
                            if (itemHolderInfoPopFromPreLayout == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, fromOldChangeHolders);
                            } else {
                                animateChange(fromOldChangeHolders, childViewHolderInt, itemHolderInfoPopFromPreLayout, itemHolderInfoPopFromPostLayout, zIsDisappearing, zIsDisappearing2);
                            }
                        }
                    } else {
                        this.mViewInfoStore.addToPostLayout(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                    }
                }
            }
            this.mViewInfoStore.process(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        androidx.recyclerview.widget.RecyclerView.State state = this.mState;
        state.mPreviousLayoutItemCount = state.mItemCount;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mState.mRunSimpleAnimations = false;
        this.mState.mRunPredictiveAnimations = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        if (this.mRecycler.mChangedScrap != null) {
            this.mRecycler.mChangedScrap.clear();
        }
        if (this.mLayout.mPrefetchMaxObservedInInitialPrefetch) {
            this.mLayout.mPrefetchMaxCountObserved = 0;
            this.mLayout.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.updateViewCacheSize();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.clear();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private void handleMissingPreInfoForChangeError(long j, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i));
            if (childViewHolderInt != viewHolder && getChangedHolderKey(childViewHolderInt) == j) {
                androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
                if (adapter != null && adapter.hasStableIds()) {
                    throw new java.lang.IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + viewHolder + exceptionLabel());
                }
                throw new java.lang.IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + viewHolder + exceptionLabel());
            }
        }
        android.util.Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder2 + " cannot be found but it is necessary for " + viewHolder + exceptionLabel());
    }

    void recordAnimationInfoIfBouncedHiddenView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        if (this.mState.mTrackOldChangeHolders && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.addToOldChangeHolders(getChangedHolderKey(viewHolder), viewHolder);
        }
        this.mViewInfoStore.addToPreLayout(viewHolder, itemHolderInfo);
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int childCount = this.mChildHelper.getChildCount();
        if (childCount == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(android.view.View view, boolean z) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new java.lang.IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    long getChangedHolderKey(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    void animateAppearance(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        addAnimatingView(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    private void animateChange(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2, boolean z, boolean z2) {
        viewHolder.setIsRecyclable(false);
        if (z) {
            addAnimatingView(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z2) {
                addAnimatingView(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            addAnimatingView(viewHolder);
            this.mRecycler.unscrapView(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.mItemAnimator.animateChange(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        androidx.core.os.TraceCompat.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.TraceCompat.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    void markItemDecorInsetsDirty() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            ((androidx.recyclerview.widget.RecyclerView.LayoutParams) this.mChildHelper.getUnfilteredChildAt(i).getLayoutParams()).mInsetsDirty = true;
        }
        this.mRecycler.markItemDecorInsetsDirty();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            android.widget.EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        android.widget.EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            android.widget.EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        android.widget.EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            android.widget.EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        android.widget.EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            android.widget.EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) ? z : true) {
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) && this.mLayout.checkLayoutParams((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return layoutManager.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return layoutManager.generateLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return layoutManager.generateLayoutParams(layoutParams);
    }

    public boolean isAnimating() {
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.isRunning();
    }

    void saveOldPositions() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    void clearOldPositions() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.clearOldPositions();
    }

    void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i6 = 0; i6 < unfilteredChildCount; i6++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i6));
            if (childViewHolderInt != null && childViewHolderInt.mPosition >= i4 && childViewHolderInt.mPosition <= i3) {
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.mStructureChanged = true;
            }
        }
        this.mRecycler.offsetPositionRecordsForMove(i, i2);
        requestLayout();
    }

    void offsetPositionRecordsForInsert(int i, int i2) {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i3 = 0; i3 < unfilteredChildCount; i3++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.mStructureChanged = true;
            }
        }
        this.mRecycler.offsetPositionRecordsForInsert(i, i2);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i4 = 0; i4 < unfilteredChildCount; i4++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                if (childViewHolderInt.mPosition >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.mStructureChanged = true;
                } else if (childViewHolderInt.mPosition >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.mStructureChanged = true;
                }
            }
        }
        this.mRecycler.offsetPositionRecordsForRemove(i, i2, z);
        requestLayout();
    }

    void viewRangeUpdate(int i, int i2, java.lang.Object obj) {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i3 = i + i2;
        for (int i4 = 0; i4 < unfilteredChildCount; i4++) {
            android.view.View unfilteredChildAt = this.mChildHelper.getUnfilteredChildAt(i4);
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(unfilteredChildAt);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i && childViewHolderInt.mPosition < i3) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((androidx.recyclerview.widget.RecyclerView.LayoutParams) unfilteredChildAt.getLayoutParams()).mInsetsDirty = true;
            }
        }
        this.mRecycler.viewRangeUpdate(i, i2);
    }

    boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.canReuseUpdatedViewHolder(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void markKnownViewsInvalid() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.markKnownViewsInvalid();
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder getChildViewHolder(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new java.lang.IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    public android.view.View findContainingItemView(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof android.view.View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder findContainingViewHolder(android.view.View view) {
        android.view.View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    static androidx.recyclerview.widget.RecyclerView.ViewHolder getChildViewHolderInt(android.view.View view) {
        if (view == null) {
            return null;
        }
        return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).mViewHolder;
    }

    @java.lang.Deprecated
    public int getChildPosition(android.view.View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public long getChildItemId(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt;
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    @java.lang.Deprecated
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForAdapterPosition(int i) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i2 = 0; i2 < unfilteredChildCount; i2++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int i, boolean z) {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = null;
        for (int i2 = 0; i2 < unfilteredChildCount; i2++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    } else {
                        if (this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        viewHolder = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                } else {
                    if (this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForItemId(long j) {
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
            for (int i = 0; i < unfilteredChildCount; i++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (!this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    public android.view.View findChildViewUnder(float f, float f2) {
        for (int childCount = this.mChildHelper.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = this.mChildHelper.getChildAt(childCount);
            float translationX = childAt.getTranslationX();
            float translationY = childAt.getTranslationY();
            if (f >= childAt.getLeft() + translationX && f <= childAt.getRight() + translationX && f2 >= childAt.getTop() + translationY && f2 <= childAt.getBottom() + translationY) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetChildrenVertical(int i) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.mChildHelper.getChildAt(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.mChildHelper.getChildAt(i2).offsetLeftAndRight(i);
        }
    }

    public void getDecoratedBoundsWithMargins(android.view.View view, android.graphics.Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    static void getDecoratedBoundsWithMarginsInt(android.view.View view, android.graphics.Rect rect) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        android.graphics.Rect rect2 = layoutParams.mDecorInsets;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    android.graphics.Rect getItemDecorInsetsForChild(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (!layoutParams.mInsetsDirty) {
            return layoutParams.mDecorInsets;
        }
        if (this.mState.isPreLayout() && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return layoutParams.mDecorInsets;
        }
        android.graphics.Rect rect = layoutParams.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        layoutParams.mInsetsDirty = false;
        return rect;
    }

    void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i, i2);
        }
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    private float getSplineFlingDistance(int i) {
        double dLog = java.lang.Math.log((java.lang.Math.abs(i) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f = DECELERATION_RATE;
        return (float) (((double) (this.mPhysicalCoef * SCROLL_FRICTION)) * java.lang.Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog));
    }

    void dispatchOnScrollStateChanged(int i) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i);
        }
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.hasPendingUpdates();
    }

    class ViewFlinger implements java.lang.Runnable {
        private int mLastFlingX;
        private int mLastFlingY;
        android.widget.OverScroller mOverScroller;
        android.view.animation.Interpolator mInterpolator = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator;
        private boolean mEatRunOnAnimationRequest = false;
        private boolean mReSchedulePostAnimationCallback = false;

        ViewFlinger() {
            this.mOverScroller = new android.widget.OverScroller(androidx.recyclerview.widget.RecyclerView.this.getContext(), androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            if (androidx.recyclerview.widget.RecyclerView.this.mLayout == null) {
                stop();
                return;
            }
            this.mReSchedulePostAnimationCallback = false;
            this.mEatRunOnAnimationRequest = true;
            androidx.recyclerview.widget.RecyclerView.this.consumePendingUpdateOperations();
            android.widget.OverScroller overScroller = this.mOverScroller;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.mLastFlingX;
                int i5 = currY - this.mLastFlingY;
                this.mLastFlingX = currX;
                this.mLastFlingY = currY;
                int iConsumeFlingInHorizontalStretch = androidx.recyclerview.widget.RecyclerView.this.consumeFlingInHorizontalStretch(i4);
                int iConsumeFlingInVerticalStretch = androidx.recyclerview.widget.RecyclerView.this.consumeFlingInVerticalStretch(i5);
                androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0] = 0;
                androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1] = 0;
                androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
                if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, recyclerView.mReusableIntPair, null, 1)) {
                    iConsumeFlingInHorizontalStretch -= androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0];
                    iConsumeFlingInVerticalStretch -= androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1];
                }
                if (androidx.recyclerview.widget.RecyclerView.this.getOverScrollMode() != 2) {
                    androidx.recyclerview.widget.RecyclerView.this.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                if (androidx.recyclerview.widget.RecyclerView.this.mAdapter != null) {
                    androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0] = 0;
                    androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1] = 0;
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = androidx.recyclerview.widget.RecyclerView.this;
                    recyclerView2.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, recyclerView2.mReusableIntPair);
                    i = androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0];
                    i2 = androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1];
                    iConsumeFlingInHorizontalStretch -= i;
                    iConsumeFlingInVerticalStretch -= i2;
                    androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller = androidx.recyclerview.widget.RecyclerView.this.mLayout.mSmoothScroller;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int itemCount = androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount();
                        if (itemCount == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= itemCount) {
                            smoothScroller.setTargetPosition(itemCount - 1);
                            smoothScroller.onAnimation(i, i2);
                        } else {
                            smoothScroller.onAnimation(i, i2);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!androidx.recyclerview.widget.RecyclerView.this.mItemDecorations.isEmpty()) {
                    androidx.recyclerview.widget.RecyclerView.this.invalidate();
                }
                androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0] = 0;
                androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1] = 0;
                androidx.recyclerview.widget.RecyclerView recyclerView3 = androidx.recyclerview.widget.RecyclerView.this;
                recyclerView3.dispatchNestedScroll(i, i2, iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, null, 1, recyclerView3.mReusableIntPair);
                int i6 = iConsumeFlingInHorizontalStretch - androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0];
                int i7 = iConsumeFlingInVerticalStretch - androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1];
                if (i != 0 || i2 != 0) {
                    androidx.recyclerview.widget.RecyclerView.this.dispatchOnScrolled(i, i2);
                }
                if (!androidx.recyclerview.widget.RecyclerView.this.awakenScrollBars()) {
                    androidx.recyclerview.widget.RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller2 = androidx.recyclerview.widget.RecyclerView.this.mLayout.mSmoothScroller;
                if (!(smoothScroller2 != null && smoothScroller2.isPendingInitialRun()) && z) {
                    if (androidx.recyclerview.widget.RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else {
                            i3 = i6 > 0 ? currVelocity : 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        androidx.recyclerview.widget.RecyclerView.this.absorbGlows(i3, currVelocity);
                    }
                    if (androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        androidx.recyclerview.widget.RecyclerView.this.mPrefetchRegistry.clearPrefetchPositions();
                    }
                } else {
                    postOnAnimation();
                    if (androidx.recyclerview.widget.RecyclerView.this.mGapWorker != null) {
                        androidx.recyclerview.widget.RecyclerView.this.mGapWorker.postFromTraversal(androidx.recyclerview.widget.RecyclerView.this, i, i2);
                    }
                }
            }
            androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller3 = androidx.recyclerview.widget.RecyclerView.this.mLayout.mSmoothScroller;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.mEatRunOnAnimationRequest = false;
            if (this.mReSchedulePostAnimationCallback) {
                internalPostOnAnimation();
            } else {
                androidx.recyclerview.widget.RecyclerView.this.setScrollState(0);
                androidx.recyclerview.widget.RecyclerView.this.stopNestedScroll(1);
            }
        }

        void postOnAnimation() {
            if (this.mEatRunOnAnimationRequest) {
                this.mReSchedulePostAnimationCallback = true;
            } else {
                internalPostOnAnimation();
            }
        }

        private void internalPostOnAnimation() {
            androidx.recyclerview.widget.RecyclerView.this.removeCallbacks(this);
            androidx.core.view.ViewCompat.postOnAnimation(androidx.recyclerview.widget.RecyclerView.this, this);
        }

        public void fling(int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.this.setScrollState(2);
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            if (this.mInterpolator != androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator) {
                this.mInterpolator = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator;
                this.mOverScroller = new android.widget.OverScroller(androidx.recyclerview.widget.RecyclerView.this.getContext(), androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator);
            }
            this.mOverScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            postOnAnimation();
        }

        public void smoothScrollBy(int i, int i2, int i3, android.view.animation.Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = computeScrollDuration(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator;
            }
            if (this.mInterpolator != interpolator) {
                this.mInterpolator = interpolator;
                this.mOverScroller = new android.widget.OverScroller(androidx.recyclerview.widget.RecyclerView.this.getContext(), interpolator);
            }
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            androidx.recyclerview.widget.RecyclerView.this.setScrollState(2);
            this.mOverScroller.startScroll(0, 0, i, i2, i4);
            postOnAnimation();
        }

        private int computeScrollDuration(int i, int i2) {
            int iAbs = java.lang.Math.abs(i);
            int iAbs2 = java.lang.Math.abs(i2);
            boolean z = iAbs > iAbs2;
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            return java.lang.Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        public void stop() {
            androidx.recyclerview.widget.RecyclerView.this.removeCallbacks(this);
            this.mOverScroller.abortAnimation();
        }
    }

    void repositionShadowingViews() {
        int childCount = this.mChildHelper.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = this.mChildHelper.getChildAt(i);
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder = getChildViewHolder(childAt);
            if (childViewHolder != null && childViewHolder.mShadowingHolder != null) {
                android.view.View view = childViewHolder.mShadowingHolder.itemView;
                int left = childAt.getLeft();
                int top = childAt.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    private class RecyclerViewDataObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        RecyclerViewDataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            androidx.recyclerview.widget.RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.RecyclerView.this.mState.mStructureChanged = true;
            androidx.recyclerview.widget.RecyclerView.this.processDataSetCompletelyChanged(true);
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.hasPendingUpdates()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            androidx.recyclerview.widget.RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.onItemRangeChanged(i, i2, obj)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.onItemRangeInserted(i, i2)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.onItemRangeRemoved(i, i2)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            androidx.recyclerview.widget.RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.onItemRangeMoved(i, i2, i3)) {
                triggerUpdateProcessor();
            }
        }

        void triggerUpdateProcessor() {
            if (androidx.recyclerview.widget.RecyclerView.POST_UPDATES_ON_ANIMATION && androidx.recyclerview.widget.RecyclerView.this.mHasFixedSize && androidx.recyclerview.widget.RecyclerView.this.mIsAttached) {
                androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
                androidx.core.view.ViewCompat.postOnAnimation(recyclerView, recyclerView.mUpdateChildViewsRunnable);
            } else {
                androidx.recyclerview.widget.RecyclerView.this.mAdapterUpdateDuringMeasure = true;
                androidx.recyclerview.widget.RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            androidx.recyclerview.widget.RecyclerView.Adapter adapter;
            if (androidx.recyclerview.widget.RecyclerView.this.mPendingSavedState == null || (adapter = androidx.recyclerview.widget.RecyclerView.this.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.requestLayout();
        }
    }

    public static class EdgeEffectFactory {
        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        protected android.widget.EdgeEffect createEdgeEffect(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
            return new android.widget.EdgeEffect(recyclerView.getContext());
        }
    }

    static class StretchEdgeEffectFactory extends androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory {
        StretchEdgeEffectFactory() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        protected android.widget.EdgeEffect createEdgeEffect(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
            return new android.widget.EdgeEffect(recyclerView.getContext());
        }
    }

    public static class RecycledViewPool {
        private static final int DEFAULT_MAX_SCRAP = 5;
        android.util.SparseArray<androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData> mScrap = new android.util.SparseArray<>();
        int mAttachCountForClearing = 0;
        java.util.Set<androidx.recyclerview.widget.RecyclerView.Adapter<?>> mAttachedAdaptersForPoolingContainer = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());

        static class ScrapData {
            final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mScrapHeap = new java.util.ArrayList<>();
            int mMaxScrap = 5;
            long mCreateRunningAverageNs = 0;
            long mBindRunningAverageNs = 0;

            ScrapData() {
            }
        }

        public void clear() {
            for (int i = 0; i < this.mScrap.size(); i++) {
                androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData scrapDataValueAt = this.mScrap.valueAt(i);
                java.util.Iterator<androidx.recyclerview.widget.RecyclerView.ViewHolder> it = scrapDataValueAt.mScrapHeap.iterator();
                while (it.hasNext()) {
                    androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(it.next().itemView);
                }
                scrapDataValueAt.mScrapHeap.clear();
            }
        }

        public void setMaxRecycledViews(int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mMaxScrap = i2;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = scrapDataForType.mScrapHeap;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public int getRecycledViewCount(int i) {
            return getScrapDataForType(i).mScrapHeap.size();
        }

        public androidx.recyclerview.widget.RecyclerView.ViewHolder getRecycledView(int i) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData scrapData = this.mScrap.get(i);
            if (scrapData == null || scrapData.mScrapHeap.isEmpty()) {
                return null;
            }
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = scrapData.mScrapHeap;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        int size() {
            int size = 0;
            for (int i = 0; i < this.mScrap.size(); i++) {
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = this.mScrap.valueAt(i).mScrapHeap;
                if (arrayList != null) {
                    size += arrayList.size();
                }
            }
            return size;
        }

        public void putRecycledView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = getScrapDataForType(itemViewType).mScrapHeap;
            if (this.mScrap.get(itemViewType).mMaxScrap <= arrayList.size()) {
                androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(viewHolder.itemView);
            } else {
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        long runningAverage(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        void factorInCreateTime(int i, long j) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mCreateRunningAverageNs = runningAverage(scrapDataForType.mCreateRunningAverageNs, j);
        }

        void factorInBindTime(int i, long j) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mBindRunningAverageNs = runningAverage(scrapDataForType.mBindRunningAverageNs, j);
        }

        boolean willCreateInTime(int i, long j, long j2) {
            long j3 = getScrapDataForType(i).mCreateRunningAverageNs;
            return j3 == 0 || j + j3 < j2;
        }

        boolean willBindInTime(int i, long j, long j2) {
            long j3 = getScrapDataForType(i).mBindRunningAverageNs;
            return j3 == 0 || j + j3 < j2;
        }

        void attach() {
            this.mAttachCountForClearing++;
        }

        void detach() {
            this.mAttachCountForClearing--;
        }

        void attachForPoolingContainer(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
            this.mAttachedAdaptersForPoolingContainer.add(adapter);
        }

        void detachForPoolingContainer(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, boolean z) {
            this.mAttachedAdaptersForPoolingContainer.remove(adapter);
            if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < this.mScrap.size(); i++) {
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData> sparseArray = this.mScrap;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = sparseArray.get(sparseArray.keyAt(i)).mScrapHeap;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(arrayList.get(i2).itemView);
                }
            }
        }

        void onAdapterChanged(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter2, boolean z) {
            if (adapter != null) {
                detach();
            }
            if (!z && this.mAttachCountForClearing == 0) {
                clear();
            }
            if (adapter2 != null) {
                attach();
            }
        }

        private androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData getScrapDataForType(int i) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData scrapData = this.mScrap.get(i);
            if (scrapData != null) {
                return scrapData;
            }
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData scrapData2 = new androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData();
            this.mScrap.put(i, scrapData2);
            return scrapData2;
        }
    }

    static androidx.recyclerview.widget.RecyclerView findNestedRecyclerView(android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        if (view instanceof androidx.recyclerview.widget.RecyclerView) {
            return (androidx.recyclerview.widget.RecyclerView) view;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.recyclerview.widget.RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    static void clearNestedRecyclerViewIfNotNested(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.mNestedRecyclerView != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = viewHolder.mNestedRecyclerView.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                java.lang.Object parent = recyclerView.getParent();
                recyclerView = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return java.lang.System.nanoTime();
        }
        return 0L;
    }

    public final class Recycler {
        static final int DEFAULT_CACHE_SIZE = 2;
        final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mAttachedScrap;
        final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mCachedViews;
        java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mChangedScrap;
        androidx.recyclerview.widget.RecyclerView.RecycledViewPool mRecyclerPool;
        private int mRequestedCacheMax;
        private final java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mUnmodifiableAttachedScrap;
        private androidx.recyclerview.widget.RecyclerView.ViewCacheExtension mViewCacheExtension;
        int mViewCacheMax;

        public Recycler() {
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = new java.util.ArrayList<>();
            this.mAttachedScrap = arrayList;
            this.mChangedScrap = null;
            this.mCachedViews = new java.util.ArrayList<>();
            this.mUnmodifiableAttachedScrap = java.util.Collections.unmodifiableList(arrayList);
            this.mRequestedCacheMax = 2;
            this.mViewCacheMax = 2;
        }

        public void clear() {
            this.mAttachedScrap.clear();
            recycleAndClearCachedViews();
        }

        public void setViewCacheSize(int i) {
            this.mRequestedCacheMax = i;
            updateViewCacheSize();
        }

        void updateViewCacheSize() {
            this.mViewCacheMax = this.mRequestedCacheMax + (androidx.recyclerview.widget.RecyclerView.this.mLayout != null ? androidx.recyclerview.widget.RecyclerView.this.mLayout.mPrefetchMaxCountObserved : 0);
            for (int size = this.mCachedViews.size() - 1; size >= 0 && this.mCachedViews.size() > this.mViewCacheMax; size--) {
                recycleCachedViewAt(size);
            }
        }

        public java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> getScrapList() {
            return this.mUnmodifiableAttachedScrap;
        }

        boolean validateViewHolderForOffsetPosition(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                return androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout();
            }
            if (viewHolder.mPosition < 0 || viewHolder.mPosition >= androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemCount()) {
                throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolder + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
            }
            if (androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout() || androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemViewType(viewHolder.mPosition) == viewHolder.getItemViewType()) {
                return !androidx.recyclerview.widget.RecyclerView.this.mAdapter.hasStableIds() || viewHolder.getItemId() == androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemId(viewHolder.mPosition);
            }
            return false;
        }

        private boolean tryBindViewHolderByDeadline(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, int i2, long j) {
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = androidx.recyclerview.widget.RecyclerView.this;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = androidx.recyclerview.widget.RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.mRecyclerPool.willBindInTime(itemViewType, nanoTime, j)) {
                return false;
            }
            androidx.recyclerview.widget.RecyclerView.this.mAdapter.bindViewHolder(viewHolder, i);
            this.mRecyclerPool.factorInBindTime(viewHolder.getItemViewType(), androidx.recyclerview.widget.RecyclerView.this.getNanoTime() - nanoTime);
            attachAccessibilityDelegateOnBind(viewHolder);
            if (!androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout()) {
                return true;
            }
            viewHolder.mPreLayoutPosition = i2;
            return true;
        }

        public void bindViewToPosition(android.view.View view, int i) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams;
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null) {
                throw new java.lang.IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
            }
            int iFindPositionOffset = androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.findPositionOffset(i);
            if (iFindPositionOffset < 0 || iFindPositionOffset >= androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemCount()) {
                throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iFindPositionOffset + ").state:" + androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount() + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
            }
            tryBindViewHolderByDeadline(childViewHolderInt, iFindPositionOffset, i, Long.MAX_VALUE);
            android.view.ViewGroup.LayoutParams layoutParams2 = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(layoutParams);
            } else if (!androidx.recyclerview.widget.RecyclerView.this.checkLayoutParams(layoutParams2)) {
                layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateLayoutParams(layoutParams2);
                childViewHolderInt.itemView.setLayoutParams(layoutParams);
            } else {
                layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams2;
            }
            layoutParams.mInsetsDirty = true;
            layoutParams.mViewHolder = childViewHolderInt;
            layoutParams.mPendingInvalidate = childViewHolderInt.itemView.getParent() == null;
        }

        public int convertPreLayoutPositionToPostLayout(int i) {
            if (i < 0 || i >= androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount()) {
                throw new java.lang.IndexOutOfBoundsException("invalid position " + i + ". State item count is " + androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount() + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
            }
            return !androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout() ? i : androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.findPositionOffset(i);
        }

        public android.view.View getViewForPosition(int i) {
            return getViewForPosition(i, false);
        }

        android.view.View getViewForPosition(int i, boolean z) {
            return tryGetViewHolderForPositionByDeadline(i, z, Long.MAX_VALUE).itemView;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x020f  */
        /* JADX WARN: Code duplicated, block: B:102:0x0217  */
        /* JADX WARN: Code duplicated, block: B:103:0x0225  */
        /* JADX WARN: Code duplicated, block: B:106:0x022b A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:108:0x022e  */
        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:73:0x0182 A[PHI: r1 r4
  0x0182: PHI (r1v18 androidx.recyclerview.widget.RecyclerView$ViewHolder) = 
  (r1v17 androidx.recyclerview.widget.RecyclerView$ViewHolder)
  (r1v43 androidx.recyclerview.widget.RecyclerView$ViewHolder)
 binds: [B:28:0x005d, B:59:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x0182: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:59:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:82:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:88:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:90:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:99:0x0201  */
        androidx.recyclerview.widget.RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline(int i, boolean z, long j) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder;
            boolean z2;
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder;
            boolean z3;
            boolean zTryBindViewHolderByDeadline;
            android.view.ViewGroup.LayoutParams layoutParams;
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2;
            int iFindPositionOffset;
            androidx.recyclerview.widget.RecyclerView recyclerViewFindNestedRecyclerView;
            androidx.recyclerview.widget.RecyclerView.ViewCacheExtension viewCacheExtension;
            android.view.View viewForPositionAndType;
            if (i < 0 || i >= androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount()) {
                throw new java.lang.IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount() + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
            }
            if (androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout()) {
                childViewHolder = getChangedScrapViewForPosition(i);
                if (childViewHolder != null) {
                    z2 = true;
                }
                if (childViewHolder == null && (childViewHolder = getScrapOrHiddenOrCachedHolderForPosition(i, z)) != null) {
                    if (validateViewHolderForOffsetPosition(childViewHolder)) {
                        z2 = true;
                    } else {
                        if (!z) {
                            childViewHolder.addFlags(4);
                            if (childViewHolder.isScrap()) {
                                androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(childViewHolder.itemView, false);
                                childViewHolder.unScrap();
                            } else if (childViewHolder.wasReturnedFromScrap()) {
                                childViewHolder.clearReturnedFromScrapFlag();
                            }
                            recycleViewHolderInternal(childViewHolder);
                        }
                        childViewHolder = null;
                    }
                }
                if (childViewHolder == null) {
                    viewHolder = childViewHolder;
                } else {
                    iFindPositionOffset = androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.findPositionOffset(i);
                    if (iFindPositionOffset >= 0 || iFindPositionOffset >= androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemCount()) {
                        throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iFindPositionOffset + ").state:" + androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount() + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                    }
                    int itemViewType = androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemViewType(iFindPositionOffset);
                    if (androidx.recyclerview.widget.RecyclerView.this.mAdapter.hasStableIds() && (childViewHolder = getScrapOrCachedViewForId(androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemId(iFindPositionOffset), itemViewType, z)) != null) {
                        childViewHolder.mPosition = iFindPositionOffset;
                        z2 = true;
                    }
                    if (childViewHolder == null && (viewCacheExtension = this.mViewCacheExtension) != null && (viewForPositionAndType = viewCacheExtension.getViewForPositionAndType(this, i, itemViewType)) != null) {
                        childViewHolder = androidx.recyclerview.widget.RecyclerView.this.getChildViewHolder(viewForPositionAndType);
                        if (childViewHolder == null) {
                            throw new java.lang.IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                        }
                        if (childViewHolder.shouldIgnore()) {
                            throw new java.lang.IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                        }
                    }
                    if (childViewHolder == null) {
                        androidx.recyclerview.widget.RecyclerView.ViewHolder recycledView = getRecycledViewPool().getRecycledView(itemViewType);
                        if (recycledView != null) {
                            recycledView.resetInternal();
                            if (androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                invalidateDisplayListInt(recycledView);
                            }
                        }
                        childViewHolder = recycledView;
                    }
                    if (childViewHolder == null) {
                        long nanoTime = androidx.recyclerview.widget.RecyclerView.this.getNanoTime();
                        if (j != Long.MAX_VALUE && !this.mRecyclerPool.willCreateInTime(itemViewType, nanoTime, j)) {
                            return null;
                        }
                        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderCreateViewHolder = androidx.recyclerview.widget.RecyclerView.this.mAdapter.createViewHolder(androidx.recyclerview.widget.RecyclerView.this, itemViewType);
                        if (androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(viewHolderCreateViewHolder.itemView)) != null) {
                            viewHolderCreateViewHolder.mNestedRecyclerView = new java.lang.ref.WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        this.mRecyclerPool.factorInCreateTime(itemViewType, androidx.recyclerview.widget.RecyclerView.this.getNanoTime() - nanoTime);
                        viewHolder = viewHolderCreateViewHolder;
                    } else {
                        viewHolder = childViewHolder;
                    }
                }
                z3 = z2;
                if (z3 && !androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout() && viewHolder.hasAnyOfTheFlags(8192)) {
                    viewHolder.setFlags(0, 8192);
                    if (androidx.recyclerview.widget.RecyclerView.this.mState.mRunSimpleAnimations) {
                        androidx.recyclerview.widget.RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(viewHolder, androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.recordPreLayoutInformation(androidx.recyclerview.widget.RecyclerView.this.mState, viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(viewHolder) | 4096, viewHolder.getUnmodifiedPayloads()));
                    }
                }
                if (!androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout() && viewHolder.isBound()) {
                    viewHolder.mPreLayoutPosition = i;
                } else {
                    if (viewHolder.isBound() || viewHolder.needsUpdate() || viewHolder.isInvalid()) {
                        zTryBindViewHolderByDeadline = tryBindViewHolderByDeadline(viewHolder, androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.findPositionOffset(i), i, j);
                    }
                    layoutParams = viewHolder.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateDefaultLayoutParams();
                        viewHolder.itemView.setLayoutParams(layoutParams2);
                    } else if (!androidx.recyclerview.widget.RecyclerView.this.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateLayoutParams(layoutParams);
                        viewHolder.itemView.setLayoutParams(layoutParams2);
                    } else {
                        layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
                    }
                    layoutParams2.mViewHolder = viewHolder;
                    layoutParams2.mPendingInvalidate = !z3 && zTryBindViewHolderByDeadline;
                    return viewHolder;
                }
                zTryBindViewHolderByDeadline = false;
                layoutParams = viewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateDefaultLayoutParams();
                    viewHolder.itemView.setLayoutParams(layoutParams2);
                } else if (!androidx.recyclerview.widget.RecyclerView.this.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateLayoutParams(layoutParams);
                    viewHolder.itemView.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
                }
                layoutParams2.mViewHolder = viewHolder;
                layoutParams2.mPendingInvalidate = !z3 && zTryBindViewHolderByDeadline;
                return viewHolder;
            }
            childViewHolder = null;
            z2 = false;
            if (childViewHolder == null) {
                if (validateViewHolderForOffsetPosition(childViewHolder)) {
                    if (!z) {
                        childViewHolder.addFlags(4);
                        if (childViewHolder.isScrap()) {
                            androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(childViewHolder.itemView, false);
                            childViewHolder.unScrap();
                        } else if (childViewHolder.wasReturnedFromScrap()) {
                            childViewHolder.clearReturnedFromScrapFlag();
                        }
                        recycleViewHolderInternal(childViewHolder);
                    }
                    childViewHolder = null;
                } else {
                    z2 = true;
                }
            }
            if (childViewHolder == null) {
                iFindPositionOffset = androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.findPositionOffset(i);
                if (iFindPositionOffset >= 0) {
                }
                throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iFindPositionOffset + ").state:" + androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount() + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
            }
            viewHolder = childViewHolder;
            z3 = z2;
            if (z3) {
                viewHolder.setFlags(0, 8192);
                if (androidx.recyclerview.widget.RecyclerView.this.mState.mRunSimpleAnimations) {
                    androidx.recyclerview.widget.RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(viewHolder, androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.recordPreLayoutInformation(androidx.recyclerview.widget.RecyclerView.this.mState, viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(viewHolder) | 4096, viewHolder.getUnmodifiedPayloads()));
                }
            }
            if (!androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout()) {
                if (viewHolder.isBound()) {
                }
                zTryBindViewHolderByDeadline = tryBindViewHolderByDeadline(viewHolder, androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.findPositionOffset(i), i, j);
            } else {
                if (viewHolder.isBound()) {
                }
                zTryBindViewHolderByDeadline = tryBindViewHolderByDeadline(viewHolder, androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.findPositionOffset(i), i, j);
            }
            layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateDefaultLayoutParams();
                viewHolder.itemView.setLayoutParams(layoutParams2);
            } else if (!androidx.recyclerview.widget.RecyclerView.this.checkLayoutParams(layoutParams)) {
                layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateLayoutParams(layoutParams);
                viewHolder.itemView.setLayoutParams(layoutParams2);
            } else {
                layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
            }
            layoutParams2.mViewHolder = viewHolder;
            layoutParams2.mPendingInvalidate = !z3 && zTryBindViewHolderByDeadline;
            return viewHolder;
        }

        private void attachAccessibilityDelegateOnBind(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            if (androidx.recyclerview.widget.RecyclerView.this.isAccessibilityEnabled()) {
                android.view.View view = viewHolder.itemView;
                if (androidx.core.view.ViewCompat.getImportantForAccessibility(view) == 0) {
                    androidx.core.view.ViewCompat.setImportantForAccessibility(view, 1);
                }
                if (androidx.recyclerview.widget.RecyclerView.this.mAccessibilityDelegate == null) {
                    return;
                }
                androidx.core.view.AccessibilityDelegateCompat itemDelegate = androidx.recyclerview.widget.RecyclerView.this.mAccessibilityDelegate.getItemDelegate();
                if (itemDelegate instanceof androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) {
                    ((androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).saveOriginalDelegate(view);
                }
                androidx.core.view.ViewCompat.setAccessibilityDelegate(view, itemDelegate);
            }
        }

        private void invalidateDisplayListInt(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.itemView instanceof android.view.ViewGroup) {
                invalidateDisplayListInt((android.view.ViewGroup) viewHolder.itemView, false);
            }
        }

        private void invalidateDisplayListInt(android.view.ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof android.view.ViewGroup) {
                    invalidateDisplayListInt((android.view.ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public void recycleView(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            recycleViewHolderInternal(childViewHolderInt);
            if (androidx.recyclerview.widget.RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
        }

        void recycleAndClearCachedViews() {
            for (int size = this.mCachedViews.size() - 1; size >= 0; size--) {
                recycleCachedViewAt(size);
            }
            this.mCachedViews.clear();
            if (androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK) {
                androidx.recyclerview.widget.RecyclerView.this.mPrefetchRegistry.clearPrefetchPositions();
            }
        }

        void recycleCachedViewAt(int i) {
            addViewHolderToRecycledViewPool(this.mCachedViews.get(i), true);
            this.mCachedViews.remove(i);
        }

        void recycleViewHolderInternal(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (viewHolder.isScrap() || viewHolder.itemView.getParent() != null) {
                throw new java.lang.IllegalArgumentException("Scrapped or attached views may not be recycled. isScrap:" + viewHolder.isScrap() + " isAttached:" + (viewHolder.itemView.getParent() != null) + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
            }
            if (viewHolder.isTmpDetached()) {
                throw new java.lang.IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + viewHolder + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
            }
            if (viewHolder.shouldIgnore()) {
                throw new java.lang.IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
            }
            boolean zDoesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
            if ((androidx.recyclerview.widget.RecyclerView.this.mAdapter != null && zDoesTransientStatePreventRecycling && androidx.recyclerview.widget.RecyclerView.this.mAdapter.onFailedToRecycleView(viewHolder)) || viewHolder.isRecyclable()) {
                if (this.mViewCacheMax <= 0 || viewHolder.hasAnyOfTheFlags(com.json.mediationsdk.logger.IronSourceError.ERROR_CAPPED_PER_SESSION)) {
                    z = false;
                } else {
                    int size = this.mCachedViews.size();
                    if (size >= this.mViewCacheMax && size > 0) {
                        recycleCachedViewAt(0);
                        size--;
                    }
                    if (androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !androidx.recyclerview.widget.RecyclerView.this.mPrefetchRegistry.lastPrefetchIncludedPosition(viewHolder.mPosition)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!androidx.recyclerview.widget.RecyclerView.this.mPrefetchRegistry.lastPrefetchIncludedPosition(this.mCachedViews.get(i).mPosition)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.mCachedViews.add(size, viewHolder);
                    z = true;
                }
                if (z) {
                    z3 = false;
                } else {
                    addViewHolderToRecycledViewPool(viewHolder, true);
                }
                z2 = z;
            } else {
                z3 = false;
            }
            androidx.recyclerview.widget.RecyclerView.this.mViewInfoStore.removeViewHolder(viewHolder);
            if (z2 || z3 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(viewHolder.itemView);
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
        }

        void addViewHolderToRecycledViewPool(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, boolean z) {
            androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            android.view.View view = viewHolder.itemView;
            if (androidx.recyclerview.widget.RecyclerView.this.mAccessibilityDelegate != null) {
                androidx.core.view.AccessibilityDelegateCompat itemDelegate = androidx.recyclerview.widget.RecyclerView.this.mAccessibilityDelegate.getItemDelegate();
                androidx.core.view.ViewCompat.setAccessibilityDelegate(view, itemDelegate instanceof androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate ? ((androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).getAndRemoveOriginalDelegateForItem(view) : null);
            }
            if (z) {
                dispatchViewRecycled(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            getRecycledViewPool().putRecycledView(viewHolder);
        }

        void quickRecycleScrapView(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            recycleViewHolderInternal(childViewHolderInt);
        }

        void scrapView(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.hasAnyOfTheFlags(12) || !childViewHolderInt.isUpdated() || androidx.recyclerview.widget.RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !androidx.recyclerview.widget.RecyclerView.this.mAdapter.hasStableIds()) {
                    throw new java.lang.IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.setScrapContainer(this, false);
                this.mAttachedScrap.add(childViewHolderInt);
                return;
            }
            if (this.mChangedScrap == null) {
                this.mChangedScrap = new java.util.ArrayList<>();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.mChangedScrap.add(childViewHolderInt);
        }

        void unscrapView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.mChangedScrap.remove(viewHolder);
            } else {
                this.mAttachedScrap.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        int getScrapCount() {
            return this.mAttachedScrap.size();
        }

        android.view.View getScrapViewAt(int i) {
            return this.mAttachedScrap.get(i).itemView;
        }

        void clearScrap() {
            this.mAttachedScrap.clear();
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = this.mChangedScrap;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        androidx.recyclerview.widget.RecyclerView.ViewHolder getChangedScrapViewForPosition(int i) {
            int size;
            int iFindPositionOffset;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = this.mChangedScrap;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mChangedScrap.get(i2);
                    if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i) {
                        viewHolder.addFlags(32);
                        return viewHolder;
                    }
                }
                if (androidx.recyclerview.widget.RecyclerView.this.mAdapter.hasStableIds() && (iFindPositionOffset = androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.findPositionOffset(i)) > 0 && iFindPositionOffset < androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemId(iFindPositionOffset);
                    for (int i3 = 0; i3 < size; i3++) {
                        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = this.mChangedScrap.get(i3);
                        if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                            viewHolder2.addFlags(32);
                            return viewHolder2;
                        }
                    }
                }
            }
            return null;
        }

        androidx.recyclerview.widget.RecyclerView.ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int i, boolean z) {
            android.view.View viewFindHiddenNonRemovedView;
            int size = this.mAttachedScrap.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mAttachedScrap.get(i2);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i && !viewHolder.isInvalid() && (androidx.recyclerview.widget.RecyclerView.this.mState.mInPreLayout || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!z && (viewFindHiddenNonRemovedView = androidx.recyclerview.widget.RecyclerView.this.mChildHelper.findHiddenNonRemovedView(i)) != null) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(viewFindHiddenNonRemovedView);
                androidx.recyclerview.widget.RecyclerView.this.mChildHelper.unhide(viewFindHiddenNonRemovedView);
                int iIndexOfChild = androidx.recyclerview.widget.RecyclerView.this.mChildHelper.indexOfChild(viewFindHiddenNonRemovedView);
                if (iIndexOfChild == -1) {
                    throw new java.lang.IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                }
                androidx.recyclerview.widget.RecyclerView.this.mChildHelper.detachViewFromParent(iIndexOfChild);
                scrapView(viewFindHiddenNonRemovedView);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            int size2 = this.mCachedViews.size();
            for (int i3 = 0; i3 < size2; i3++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = this.mCachedViews.get(i3);
                if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.mCachedViews.remove(i3);
                    }
                    return viewHolder2;
                }
            }
            return null;
        }

        androidx.recyclerview.widget.RecyclerView.ViewHolder getScrapOrCachedViewForId(long j, int i, boolean z) {
            for (int size = this.mAttachedScrap.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mAttachedScrap.get(size);
                if (viewHolder.getItemId() == j && !viewHolder.wasReturnedFromScrap()) {
                    if (i == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout()) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    }
                    if (!z) {
                        this.mAttachedScrap.remove(size);
                        androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        quickRecycleScrapView(viewHolder.itemView);
                    }
                }
            }
            int size2 = this.mCachedViews.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = this.mCachedViews.get(size2);
                if (viewHolder2.getItemId() == j && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (i == viewHolder2.getItemViewType()) {
                        if (!z) {
                            this.mCachedViews.remove(size2);
                        }
                        return viewHolder2;
                    }
                    if (!z) {
                        recycleCachedViewAt(size2);
                        return null;
                    }
                }
            }
        }

        void dispatchViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            if (androidx.recyclerview.widget.RecyclerView.this.mRecyclerListener != null) {
                androidx.recyclerview.widget.RecyclerView.this.mRecyclerListener.onViewRecycled(viewHolder);
            }
            int size = androidx.recyclerview.widget.RecyclerView.this.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                androidx.recyclerview.widget.RecyclerView.this.mRecyclerListeners.get(i).onViewRecycled(viewHolder);
            }
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapter != null) {
                androidx.recyclerview.widget.RecyclerView.this.mAdapter.onViewRecycled(viewHolder);
            }
            if (androidx.recyclerview.widget.RecyclerView.this.mState != null) {
                androidx.recyclerview.widget.RecyclerView.this.mViewInfoStore.removeViewHolder(viewHolder);
            }
        }

        void onAdapterChanged(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter2, boolean z) {
            clear();
            poolingContainerDetach(adapter, true);
            getRecycledViewPool().onAdapterChanged(adapter, adapter2, z);
            maybeSendPoolingContainerAttach();
        }

        void offsetPositionRecordsForMove(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.mCachedViews.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mCachedViews.get(i6);
                if (viewHolder != null && viewHolder.mPosition >= i5 && viewHolder.mPosition <= i4) {
                    if (viewHolder.mPosition == i) {
                        viewHolder.offsetPosition(i2 - i, false);
                    } else {
                        viewHolder.offsetPosition(i3, false);
                    }
                }
            }
        }

        void offsetPositionRecordsForInsert(int i, int i2) {
            int size = this.mCachedViews.size();
            for (int i3 = 0; i3 < size; i3++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mCachedViews.get(i3);
                if (viewHolder != null && viewHolder.mPosition >= i) {
                    viewHolder.offsetPosition(i2, false);
                }
            }
        }

        void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.mCachedViews.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mCachedViews.get(size);
                if (viewHolder != null) {
                    if (viewHolder.mPosition >= i3) {
                        viewHolder.offsetPosition(-i2, z);
                    } else if (viewHolder.mPosition >= i) {
                        viewHolder.addFlags(8);
                        recycleCachedViewAt(size);
                    }
                }
            }
        }

        void setViewCacheExtension(androidx.recyclerview.widget.RecyclerView.ViewCacheExtension viewCacheExtension) {
            this.mViewCacheExtension = viewCacheExtension;
        }

        void setRecycledViewPool(androidx.recyclerview.widget.RecyclerView.RecycledViewPool recycledViewPool) {
            poolingContainerDetach(androidx.recyclerview.widget.RecyclerView.this.mAdapter);
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool recycledViewPool2 = this.mRecyclerPool;
            if (recycledViewPool2 != null) {
                recycledViewPool2.detach();
            }
            this.mRecyclerPool = recycledViewPool;
            if (recycledViewPool != null && androidx.recyclerview.widget.RecyclerView.this.getAdapter() != null) {
                this.mRecyclerPool.attach();
            }
            maybeSendPoolingContainerAttach();
        }

        private void maybeSendPoolingContainerAttach() {
            if (this.mRecyclerPool == null || androidx.recyclerview.widget.RecyclerView.this.mAdapter == null || !androidx.recyclerview.widget.RecyclerView.this.isAttachedToWindow()) {
                return;
            }
            this.mRecyclerPool.attachForPoolingContainer(androidx.recyclerview.widget.RecyclerView.this.mAdapter);
        }

        private void poolingContainerDetach(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
            poolingContainerDetach(adapter, false);
        }

        private void poolingContainerDetach(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, boolean z) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool recycledViewPool = this.mRecyclerPool;
            if (recycledViewPool != null) {
                recycledViewPool.detachForPoolingContainer(adapter, z);
            }
        }

        void onAttachedToWindow() {
            maybeSendPoolingContainerAttach();
        }

        void onDetachedFromWindow() {
            for (int i = 0; i < this.mCachedViews.size(); i++) {
                androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(this.mCachedViews.get(i).itemView);
            }
            poolingContainerDetach(androidx.recyclerview.widget.RecyclerView.this.mAdapter);
        }

        androidx.recyclerview.widget.RecyclerView.RecycledViewPool getRecycledViewPool() {
            if (this.mRecyclerPool == null) {
                this.mRecyclerPool = new androidx.recyclerview.widget.RecyclerView.RecycledViewPool();
                maybeSendPoolingContainerAttach();
            }
            return this.mRecyclerPool;
        }

        void viewRangeUpdate(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.mCachedViews.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mCachedViews.get(size);
                if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i4) {
                    viewHolder.addFlags(2);
                    recycleCachedViewAt(size);
                }
            }
        }

        void markKnownViewsInvalid() {
            int size = this.mCachedViews.size();
            for (int i = 0; i < size; i++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mCachedViews.get(i);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapter == null || !androidx.recyclerview.widget.RecyclerView.this.mAdapter.hasStableIds()) {
                recycleAndClearCachedViews();
            }
        }

        void clearOldPositions() {
            int size = this.mCachedViews.size();
            for (int i = 0; i < size; i++) {
                this.mCachedViews.get(i).clearOldPosition();
            }
            int size2 = this.mAttachedScrap.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.mAttachedScrap.get(i2).clearOldPosition();
            }
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = this.mChangedScrap;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.mChangedScrap.get(i3).clearOldPosition();
                }
            }
        }

        void markItemDecorInsetsDirty() {
            int size = this.mCachedViews.size();
            for (int i = 0; i < size; i++) {
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) this.mCachedViews.get(i).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.mInsetsDirty = true;
                }
            }
        }
    }

    public static abstract class Adapter<VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        private final androidx.recyclerview.widget.RecyclerView.AdapterDataObservable mObservable = new androidx.recyclerview.widget.RecyclerView.AdapterDataObservable();
        private boolean mHasStableIds = false;
        private androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy mStateRestorationPolicy = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public int findRelativeAdapterPositionIn(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public abstract VH onCreateViewHolder(android.view.ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void onBindViewHolder(VH vh, int i, java.util.List<java.lang.Object> list) {
            onBindViewHolder(vh, i);
        }

        public final VH createViewHolder(android.view.ViewGroup viewGroup, int i) {
            try {
                androidx.core.os.TraceCompat.beginSection(androidx.recyclerview.widget.RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new java.lang.IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                androidx.core.os.TraceCompat.endSection();
                return vh;
            } catch (java.lang.Throwable th) {
                androidx.core.os.TraceCompat.endSection();
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                androidx.core.os.TraceCompat.beginSection(androidx.recyclerview.widget.RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                android.view.ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) {
                    ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).mInsetsDirty = true;
                }
                androidx.core.os.TraceCompat.endSection();
            }
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new java.lang.IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final boolean hasObservers() {
            return this.mObservable.hasObservers();
        }

        public void registerAdapterDataObserver(androidx.recyclerview.widget.RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void unregisterAdapterDataObserver(androidx.recyclerview.widget.RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.notifyItemRangeChanged(i, 1);
        }

        public final void notifyItemChanged(int i, java.lang.Object obj) {
            this.mObservable.notifyItemRangeChanged(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.notifyItemRangeChanged(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2, java.lang.Object obj) {
            this.mObservable.notifyItemRangeChanged(i, i2, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.notifyItemRangeInserted(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.notifyItemMoved(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.notifyItemRangeInserted(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.notifyItemRangeRemoved(i, 1);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.notifyItemRangeRemoved(i, i2);
        }

        public void setStateRestorationPolicy(androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.notifyStateRestorationPolicyChanged();
        }

        public final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        boolean canRestoreState() {
            int i = androidx.recyclerview.widget.RecyclerView.AnonymousClass7.$SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy[this.mStateRestorationPolicy.ordinal()];
            if (i != 1) {
                return i != 2 || getItemCount() > 0;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy;

        static {
            int[] iArr = new int[androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values().length];
            $SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy = iArr;
            try {
                iArr[androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy[androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    void dispatchChildDetached(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    void dispatchChildAttached(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.ViewBoundsCheck mHorizontalBoundCheck;
        private final androidx.recyclerview.widget.ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        androidx.recyclerview.widget.RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        androidx.recyclerview.widget.RecyclerView.SmoothScroller mSmoothScroller;
        androidx.recyclerview.widget.ViewBoundsCheck mVerticalBoundCheck;
        private final androidx.recyclerview.widget.ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public interface LayoutPrefetchRegistry {
            void addPosition(int i, int i2);
        }

        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void collectInitialPrefetchPositions(int i, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public int computeHorizontalScrollExtent(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int computeVerticalScrollExtent(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public abstract androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams();

        public int getBaseline() {
            return -1;
        }

        public int getColumnCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return -1;
        }

        public int getRowCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return -1;
        }

        public int getSelectionModeForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public boolean isLayoutHierarchical(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return false;
        }

        public void onAdapterChanged(androidx.recyclerview.widget.RecyclerView.Adapter adapter, androidx.recyclerview.widget.RecyclerView.Adapter adapter2) {
        }

        public boolean onAddFocusables(androidx.recyclerview.widget.RecyclerView recyclerView, java.util.ArrayList<android.view.View> arrayList, int i, int i2) {
            return false;
        }

        public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        @java.lang.Deprecated
        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public android.view.View onFocusSearchFailed(android.view.View view, int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return null;
        }

        public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public android.view.View onInterceptFocusSearch(android.view.View view, int i) {
            return null;
        }

        public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public void onItemsMoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        }

        public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State state) {
        }

        public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        }

        public android.os.Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public boolean performAccessibilityActionForItem(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, android.view.View view, int i, android.os.Bundle bundle) {
            return false;
        }

        public int scrollHorizontallyBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public LayoutManager() {
            androidx.recyclerview.widget.ViewBoundsCheck.Callback callback = new androidx.recyclerview.widget.ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.1
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public android.view.View getChildAt(int i) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getChildAt(i);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentStart() {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getPaddingLeft();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentEnd() {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getWidth() - androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getPaddingRight();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildStart(android.view.View view) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getDecoratedLeft(view) - ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildEnd(android.view.View view) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getDecoratedRight(view) + ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
                }
            };
            this.mHorizontalBoundCheckCallback = callback;
            androidx.recyclerview.widget.ViewBoundsCheck.Callback callback2 = new androidx.recyclerview.widget.ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.2
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public android.view.View getChildAt(int i) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getChildAt(i);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentStart() {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getPaddingTop();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentEnd() {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getHeight() - androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getPaddingBottom();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildStart(android.view.View view) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getDecoratedTop(view) - ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildEnd(android.view.View view) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getDecoratedBottom(view) + ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
                }
            };
            this.mVerticalBoundCheckCallback = callback2;
            this.mHorizontalBoundCheck = new androidx.recyclerview.widget.ViewBoundsCheck(callback);
            this.mVerticalBoundCheck = new androidx.recyclerview.widget.ViewBoundsCheck(callback2);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        void setRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        void setMeasureSpecs(int i, int i2) {
            this.mWidth = android.view.View.MeasureSpec.getSize(i);
            int mode = android.view.View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = android.view.View.MeasureSpec.getSize(i2);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 != 0 || androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                android.view.View childAt = getChildAt(i7);
                android.graphics.Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                if (rect.left < i6) {
                    i6 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i5) {
                    i5 = rect.bottom;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasuredDimension(android.graphics.Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void requestLayout() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void assertInLayoutOrScroll(java.lang.String str) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            int size = android.view.View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? java.lang.Math.max(i2, i3) : size;
            }
            return java.lang.Math.min(size, java.lang.Math.max(i2, i3));
        }

        public void assertNotInLayoutOrScroll(java.lang.String str) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        @java.lang.Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.updateViewCacheSize();
                }
            }
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        void dispatchAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, recycler);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public void postOnAnimation(java.lang.Runnable runnable) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                androidx.core.view.ViewCompat.postOnAnimation(recyclerView, runnable);
            }
        }

        public boolean removeCallbacks(java.lang.Runnable runnable) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            onDetachedFromWindow(recyclerView);
        }

        public boolean getClipToPadding() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            android.util.Log.e(androidx.recyclerview.widget.RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) {
                return new androidx.recyclerview.widget.RecyclerView.LayoutParams((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
            }
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                return new androidx.recyclerview.widget.RecyclerView.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new androidx.recyclerview.widget.RecyclerView.LayoutParams(layoutParams);
        }

        public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            return new androidx.recyclerview.widget.RecyclerView.LayoutParams(context, attributeSet);
        }

        public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state, int i) {
            android.util.Log.e(androidx.recyclerview.widget.RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller) {
            androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller2 = this.mSmoothScroller;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = smoothScroller;
            smoothScroller.start(this.mRecyclerView, this);
        }

        public boolean isSmoothScrolling() {
            androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller = this.mSmoothScroller;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        public int getLayoutDirection() {
            return androidx.core.view.ViewCompat.getLayoutDirection(this.mRecyclerView);
        }

        public void endAnimation(android.view.View view) {
            if (this.mRecyclerView.mItemAnimator != null) {
                this.mRecyclerView.mItemAnimator.endAnimation(androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view));
            }
        }

        public void addDisappearingView(android.view.View view) {
            addDisappearingView(view, -1);
        }

        public void addDisappearingView(android.view.View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(android.view.View view) {
            addView(view, -1);
        }

        public void addView(android.view.View view, int i) {
            addViewInt(view, i, false);
        }

        private void addViewInt(android.view.View view, int i, boolean z) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.addToDisappearedInLayout(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(childViewHolderInt);
            }
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.attachViewToParent(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iIndexOfChild = this.mChildHelper.indexOfChild(view);
                if (i == -1) {
                    i = this.mChildHelper.getChildCount();
                }
                if (iIndexOfChild == -1) {
                    throw new java.lang.IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                }
                if (iIndexOfChild != i) {
                    this.mRecyclerView.mLayout.moveView(iIndexOfChild, i);
                }
            } else {
                this.mChildHelper.addView(view, i, false);
                layoutParams.mInsetsDirty = true;
                androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller = this.mSmoothScroller;
                if (smoothScroller != null && smoothScroller.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.mPendingInvalidate) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.mPendingInvalidate = false;
            }
        }

        public void removeView(android.view.View view) {
            this.mChildHelper.removeView(view);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.removeViewAt(i);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.removeViewAt(childCount);
            }
        }

        public int getPosition(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getItemViewType(android.view.View view) {
            return androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public android.view.View findContainingItemView(android.view.View view) {
            android.view.View viewFindContainingItemView;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.isHidden(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public android.view.View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.isPreLayout() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public void detachView(android.view.View view) {
            int iIndexOfChild = this.mChildHelper.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                detachViewInternal(iIndexOfChild, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        private void detachViewInternal(int i, android.view.View view) {
            this.mChildHelper.detachViewFromParent(i);
        }

        public void attachView(android.view.View view, int i, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.addToDisappearedInLayout(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(childViewHolderInt);
            }
            this.mChildHelper.attachViewToParent(view, i, layoutParams, childViewHolderInt.isRemoved());
        }

        public void attachView(android.view.View view, int i) {
            attachView(view, i, (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams());
        }

        public void attachView(android.view.View view) {
            attachView(view, -1);
        }

        public void removeDetachedView(android.view.View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void moveView(int i, int i2) {
            android.view.View childAt = getChildAt(i);
            if (childAt == null) {
                throw new java.lang.IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
            }
            detachViewAt(i);
            attachView(childAt, i2);
        }

        public void detachAndScrapView(android.view.View view, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            scrapOrRecycleView(recycler, this.mChildHelper.indexOfChild(view), view);
        }

        public void detachAndScrapViewAt(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            scrapOrRecycleView(recycler, i, getChildAt(i));
        }

        public void removeAndRecycleView(android.view.View view, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            removeView(view);
            recycler.recycleView(view);
        }

        public void removeAndRecycleViewAt(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            android.view.View childAt = getChildAt(i);
            removeViewAt(i);
            recycler.recycleView(childAt);
        }

        public int getChildCount() {
            androidx.recyclerview.widget.ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.getChildCount();
            }
            return 0;
        }

        public android.view.View getChildAt(int i) {
            androidx.recyclerview.widget.ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.getChildAt(i);
            }
            return null;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getPaddingLeft() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingTop() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPaddingRight() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingBottom() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingStart() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return androidx.core.view.ViewCompat.getPaddingStart(recyclerView);
            }
            return 0;
        }

        public int getPaddingEnd() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return androidx.core.view.ViewCompat.getPaddingEnd(recyclerView);
            }
            return 0;
        }

        public boolean isFocused() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public boolean hasFocus() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public android.view.View getFocusedChild() {
            android.view.View focusedChild;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.isHidden(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getItemCount() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            androidx.recyclerview.widget.RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public void offsetChildrenHorizontal(int i) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void ignoreView(android.view.View view) {
            android.view.ViewParent parent = view.getParent();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new java.lang.IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.removeViewHolder(childViewHolderInt);
        }

        public void stopIgnoringView(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void detachAndScrapAttachedViews(androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(recycler, childCount, getChildAt(childCount));
            }
        }

        private void scrapOrRecycleView(androidx.recyclerview.widget.RecyclerView.Recycler recycler, int i, android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                recycler.recycleViewHolderInternal(childViewHolderInt);
            } else {
                detachViewAt(i);
                recycler.scrapView(view);
                this.mRecyclerView.mViewInfoStore.onViewDetached(childViewHolderInt);
            }
        }

        void removeAndRecycleScrapInt(androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            int scrapCount = recycler.getScrapCount();
            for (int i = scrapCount - 1; i >= 0; i--) {
                android.view.View scrapViewAt = recycler.getScrapViewAt(i);
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(scrapViewAt);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(scrapViewAt, false);
                    }
                    if (this.mRecyclerView.mItemAnimator != null) {
                        this.mRecyclerView.mItemAnimator.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    recycler.quickRecycleScrapView(scrapViewAt);
                }
            }
            recycler.clearScrap();
            if (scrapCount > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void measureChild(android.view.View view, int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            android.graphics.Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i3, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i4, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        boolean shouldReMeasureChild(android.view.View view, int i, int i2, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, layoutParams.width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, layoutParams.height)) ? false : true;
        }

        boolean shouldMeasureChild(android.view.View view, int i, int i2, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, layoutParams.width) && isMeasurementUpToDate(view.getHeight(), i2, layoutParams.height)) ? false : true;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = android.view.View.MeasureSpec.getMode(i2);
            int size = android.view.View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public void measureChildWithMargins(android.view.View view, int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            android.graphics.Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + i3, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:6:0x000d  */
        /* JADX WARN: Code duplicated, block: B:8:0x0011 A[PHI: r3
  0x0011: PHI (r3v3 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x000f, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        @java.lang.Deprecated
        public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
            int i4 = i - i2;
            int i5 = 0;
            int iMax = java.lang.Math.max(0, i4);
            if (z) {
                if (i3 >= 0) {
                    i5 = 1073741824;
                } else {
                    i3 = 0;
                }
            } else if (i3 >= 0) {
                i5 = 1073741824;
            } else if (i3 == -1) {
                i3 = iMax;
                i5 = 1073741824;
            } else if (i3 == -2) {
                i5 = Integer.MIN_VALUE;
                i3 = iMax;
            } else {
                i3 = 0;
            }
            return android.view.View.MeasureSpec.makeMeasureSpec(i3, i5);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        /* JADX WARN: Code duplicated, block: B:14:0x0020  */
        /* JADX WARN: Code duplicated, block: B:21:0x002f  */
        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
            int iMax = java.lang.Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return android.view.View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public int getDecoratedMeasuredWidth(android.view.View view) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedMeasuredHeight(android.view.View view) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void layoutDecorated(android.view.View view, int i, int i2, int i3, int i4) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(android.view.View view, int i, int i2, int i3, int i4) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            android.graphics.Rect rect = layoutParams.mDecorInsets;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        public void getTransformedBoundingBox(android.view.View view, boolean z, android.graphics.Rect rect) {
            android.graphics.Matrix matrix;
            if (z) {
                android.graphics.Rect rect2 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                android.graphics.RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void getDecoratedBoundsWithMargins(android.view.View view, android.graphics.Rect rect) {
            androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(android.view.View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedTop(android.view.View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public int getDecoratedRight(android.view.View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedBottom(android.view.View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void calculateItemDecorationsForChild(android.view.View view, android.graphics.Rect rect) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int getTopDecorationHeight(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets.top;
        }

        public int getBottomDecorationHeight(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
        }

        public int getLeftDecorationWidth(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets.left;
        }

        public int getRightDecorationWidth(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets.right;
        }

        private int[] getChildRectangleOnScreenScrollAmount(android.view.View view, android.graphics.Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - paddingLeft;
            int iMin = java.lang.Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = java.lang.Math.min(0, i2);
            int i3 = iWidth - width;
            int iMax = java.lang.Math.max(0, i3);
            int iMax2 = java.lang.Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = java.lang.Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = java.lang.Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = java.lang.Math.min(i2, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        public boolean isViewPartiallyVisible(android.view.View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.isViewWithinBoundFlags(view, 24579) && this.mVerticalBoundCheck.isViewWithinBoundFlags(view, 24579);
            return z ? z3 : !z3;
        }

        private boolean isFocusedChildVisibleAfterScrolling(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
            android.view.View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            android.graphics.Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
        }

        @java.lang.Deprecated
        public boolean onRequestChildFocus(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.view.View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public boolean onRequestChildFocus(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state, android.view.View view, android.view.View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, java.lang.Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onMeasure(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public int getMinimumWidth() {
            return androidx.core.view.ViewCompat.getMinimumWidth(this.mRecyclerView);
        }

        public int getMinimumHeight() {
            return androidx.core.view.ViewCompat.getMinimumHeight(this.mRecyclerView);
        }

        void stopSmoothScroller() {
            androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller = this.mSmoothScroller;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        void onSmoothScrollerStopped(androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller) {
            if (this.mSmoothScroller == smoothScroller) {
                this.mSmoothScroller = null;
            }
        }

        public void removeAndRecycleAllViews(androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, recycler);
                }
            }
        }

        void onInitializeAccessibilityNodeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            onInitializeAccessibilityNodeInfo(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityNodeInfoCompat);
        }

        public void onInitializeAccessibilityNodeInfo(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            accessibilityNodeInfoCompat.setCollectionInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)));
        }

        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            onInitializeAccessibilityEvent(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.mRecyclerView.mAdapter != null) {
                accessibilityEvent.setItemCount(this.mRecyclerView.mAdapter.getItemCount());
            }
        }

        void onInitializeAccessibilityNodeInfoForItem(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                return;
            }
            onInitializeAccessibilityNodeInfoForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, accessibilityNodeInfoCompat);
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        boolean performAccessibilityAction(int i, android.os.Bundle bundle) {
            return performAccessibilityAction(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, i, bundle);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x008f A[PHI: r9
  0x008f: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:27:0x007f, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, int i, android.os.Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i2;
            int i3;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            android.graphics.Rect rect = new android.graphics.Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i2 = paddingTop;
                    i3 = paddingLeft;
                } else {
                    i2 = paddingTop;
                    i3 = 0;
                }
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i2 = paddingTop;
                    i3 = paddingLeft;
                } else {
                    i2 = paddingTop;
                    i3 = 0;
                }
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        boolean performAccessibilityActionForItem(android.view.View view, int i, android.os.Bundle bundle) {
            return performAccessibilityActionForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, i, bundle);
        }

        public static androidx.recyclerview.widget.RecyclerView.LayoutManager.Properties getProperties(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager.Properties properties = new androidx.recyclerview.widget.RecyclerView.LayoutManager.Properties();
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i, i2);
            properties.orientation = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
            properties.spanCount = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_spanCount, 1);
            properties.reverseLayout = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
            properties.stackFromEnd = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return properties;
        }

        void setExactMeasureSpecsFrom(androidx.recyclerview.widget.RecyclerView recyclerView) {
            setMeasureSpecs(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static abstract class ItemDecoration {
        @java.lang.Deprecated
        public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        @java.lang.Deprecated
        public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            onDrawOver(canvas, recyclerView);
        }

        @java.lang.Deprecated
        public void getItemOffsets(android.graphics.Rect rect, int i, androidx.recyclerview.widget.RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            getItemOffsets(rect, ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final java.util.List<java.lang.Object> FULLUPDATE_PAYLOADS = java.util.Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final android.view.View itemView;
        androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> mBindingAdapter;
        int mFlags;
        java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> mNestedRecyclerView;
        androidx.recyclerview.widget.RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        androidx.recyclerview.widget.RecyclerView.ViewHolder mShadowedHolder = null;
        androidx.recyclerview.widget.RecyclerView.ViewHolder mShadowingHolder = null;
        java.util.List<java.lang.Object> mPayloads = null;
        java.util.List<java.lang.Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        androidx.recyclerview.widget.RecyclerView.Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public ViewHolder(android.view.View view) {
            if (view == null) {
                throw new java.lang.IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((androidx.recyclerview.widget.RecyclerView.LayoutParams) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        @java.lang.Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        @java.lang.Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final int getBindingAdapterPosition() {
            androidx.recyclerview.widget.RecyclerView recyclerView;
            androidx.recyclerview.widget.RecyclerView.Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final int getAbsoluteAdapterPosition() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        public final androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        void unScrap() {
            this.mScrapContainer.unscrapView(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        void setScrapContainer(androidx.recyclerview.widget.RecyclerView.Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        void addChangePayload(java.lang.Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = java.util.Collections.unmodifiableList(arrayList);
            }
        }

        void clearPayload() {
            java.util.List<java.lang.Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        java.util.List<java.lang.Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                java.util.List<java.lang.Object> list = this.mPayloads;
                if (list == null || list.size() == 0) {
                    return FULLUPDATE_PAYLOADS;
                }
                return this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void onEnteredHiddenState(androidx.recyclerview.widget.RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = androidx.core.view.ViewCompat.getImportantForAccessibility(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(androidx.recyclerview.widget.RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + java.lang.Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ").append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                android.util.Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !androidx.core.view.ViewCompat.hasTransientState(this.itemView);
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && androidx.core.view.ViewCompat.hasTransientState(this.itemView);
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }
    }

    boolean setChildImportantForAccessibilityInternal(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        androidx.core.view.ViewCompat.setImportantForAccessibility(viewHolder.itemView, i);
        return true;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mPendingAccessibilityImportanceChange.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                androidx.core.view.ViewCompat.setImportantForAccessibility(viewHolder.itemView, i);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    int getAdapterPositionInRecyclerView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(com.json.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED) || !viewHolder.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.applyPendingUpdatesToPosition(viewHolder.mPosition);
    }

    void initFastScroller(android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new java.lang.IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        android.content.res.Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().isNestedScrollingEnabled();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().startNestedScroll(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().startNestedScroll(i, i2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        getScrollingChildHelper().stopNestedScroll();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        getScrollingChildHelper().stopNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().hasNestedScrollingParent();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().hasNestedScrollingParent(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().dispatchNestedPreFling(f, f2);
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        final android.graphics.Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        androidx.recyclerview.widget.RecyclerView.ViewHolder mViewHolder;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mDecorInsets = new android.graphics.Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mDecorInsets = new android.graphics.Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mDecorInsets = new android.graphics.Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new android.graphics.Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            super((android.view.ViewGroup.LayoutParams) layoutParams);
            this.mDecorInsets = new android.graphics.Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public boolean viewNeedsUpdate() {
            return this.mViewHolder.needsUpdate();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.isInvalid();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }

        @java.lang.Deprecated
        public int getViewPosition() {
            return this.mViewHolder.getPosition();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        @java.lang.Deprecated
        public int getViewAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getAbsoluteAdapterPosition() {
            return this.mViewHolder.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }
    }

    public static abstract class AdapterDataObserver {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    public static abstract class SmoothScroller {
        private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private androidx.recyclerview.widget.RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private android.view.View mTargetView;
        private int mTargetPosition = -1;
        private final androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action mRecyclingAction = new androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action(0, 0);

        public interface ScrollVectorProvider {
            android.graphics.PointF computeScrollVectorForPosition(int i);
        }

        protected abstract void onSeekTargetStep(int i, int i2, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action action);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(android.view.View view, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action action);

        void start(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
            recyclerView.mViewFlinger.stop();
            if (this.mStarted) {
                android.util.Log.w(androidx.recyclerview.widget.RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            if (this.mTargetPosition == -1) {
                throw new java.lang.IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.mTargetPosition = this.mTargetPosition;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.postOnAnimation();
            this.mStarted = true;
        }

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public android.graphics.PointF computeScrollVectorForPosition(int i) {
            java.lang.Object layoutManager = getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) {
                return ((androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i);
            }
            android.util.Log.w(androidx.recyclerview.widget.RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        protected final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.mTargetPosition = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        void onAnimation(int i, int i2) {
            android.graphics.PointF pointFComputeScrollVectorForPosition;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null && (pointFComputeScrollVectorForPosition.x != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f)) {
                recyclerView.scrollStep((int) java.lang.Math.signum(pointFComputeScrollVectorForPosition.x), (int) java.lang.Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
            this.mPendingInitialRun = false;
            android.view.View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.runIfNecessary(recyclerView);
                    stop();
                } else {
                    android.util.Log.e(androidx.recyclerview.widget.RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean zHasJumpTarget = this.mRecyclingAction.hasJumpTarget();
                this.mRecyclingAction.runIfNecessary(recyclerView);
                if (zHasJumpTarget && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.postOnAnimation();
                }
            }
        }

        public int getChildPosition(android.view.View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public android.view.View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        @java.lang.Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        protected void onChildAttachedToWindow(android.view.View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        protected void normalize(android.graphics.PointF pointF) {
            float fSqrt = (float) java.lang.Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public static class Action {
            public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
            private boolean mChanged;
            private int mConsecutiveUpdates;
            private int mDuration;
            private int mDx;
            private int mDy;
            private android.view.animation.Interpolator mInterpolator;
            private int mJumpToPosition;

            public Action(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public Action(int i, int i2, int i3) {
                this(i, i2, i3, null);
            }

            public Action(int i, int i2, int i3, android.view.animation.Interpolator interpolator) {
                this.mJumpToPosition = -1;
                this.mChanged = false;
                this.mConsecutiveUpdates = 0;
                this.mDx = i;
                this.mDy = i2;
                this.mDuration = i3;
                this.mInterpolator = interpolator;
            }

            public void jumpTo(int i) {
                this.mJumpToPosition = i;
            }

            boolean hasJumpTarget() {
                return this.mJumpToPosition >= 0;
            }

            void runIfNecessary(androidx.recyclerview.widget.RecyclerView recyclerView) {
                int i = this.mJumpToPosition;
                if (i >= 0) {
                    this.mJumpToPosition = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.mChanged = false;
                } else {
                    if (this.mChanged) {
                        validate();
                        recyclerView.mViewFlinger.smoothScrollBy(this.mDx, this.mDy, this.mDuration, this.mInterpolator);
                        int i2 = this.mConsecutiveUpdates + 1;
                        this.mConsecutiveUpdates = i2;
                        if (i2 > 10) {
                            android.util.Log.e(androidx.recyclerview.widget.RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.mChanged = false;
                        return;
                    }
                    this.mConsecutiveUpdates = 0;
                }
            }

            private void validate() {
                if (this.mInterpolator != null && this.mDuration < 1) {
                    throw new java.lang.IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.mDuration < 1) {
                    throw new java.lang.IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public int getDx() {
                return this.mDx;
            }

            public void setDx(int i) {
                this.mChanged = true;
                this.mDx = i;
            }

            public int getDy() {
                return this.mDy;
            }

            public void setDy(int i) {
                this.mChanged = true;
                this.mDy = i;
            }

            public int getDuration() {
                return this.mDuration;
            }

            public void setDuration(int i) {
                this.mChanged = true;
                this.mDuration = i;
            }

            public android.view.animation.Interpolator getInterpolator() {
                return this.mInterpolator;
            }

            public void setInterpolator(android.view.animation.Interpolator interpolator) {
                this.mChanged = true;
                this.mInterpolator = interpolator;
            }

            public void update(int i, int i2, int i3, android.view.animation.Interpolator interpolator) {
                this.mDx = i;
                this.mDy = i2;
                this.mDuration = i3;
                this.mInterpolator = interpolator;
                this.mChanged = true;
            }
        }
    }

    static class AdapterDataObservable extends android.database.Observable<androidx.recyclerview.widget.RecyclerView.AdapterDataObserver> {
        AdapterDataObservable() {
        }

        public boolean hasObservers() {
            return !this.mObservers.isEmpty();
        }

        public void notifyChanged() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onChanged();
            }
        }

        public void notifyStateRestorationPolicyChanged() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }

        public void notifyItemRangeChanged(int i, int i2) {
            notifyItemRangeChanged(i, i2, null);
        }

        public void notifyItemRangeChanged(int i, int i2, java.lang.Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public void notifyItemRangeInserted(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public void notifyItemRangeRemoved(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public void notifyItemMoved(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.RecyclerView.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.recyclerview.widget.RecyclerView.SavedState>() { // from class: androidx.recyclerview.widget.RecyclerView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.recyclerview.widget.RecyclerView.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.recyclerview.widget.RecyclerView.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.RecyclerView.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.recyclerview.widget.RecyclerView.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.RecyclerView.SavedState[] newArray(int i) {
                return new androidx.recyclerview.widget.RecyclerView.SavedState[i];
            }
        };
        android.os.Parcelable mLayoutState;

        SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.mLayoutState = parcel.readParcelable(classLoader == null ? androidx.recyclerview.widget.RecyclerView.LayoutManager.class.getClassLoader() : classLoader);
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.mLayoutState, 0);
        }

        void copyFrom(androidx.recyclerview.widget.RecyclerView.SavedState savedState) {
            this.mLayoutState = savedState.mLayoutState;
        }
    }

    public static class State {
        static final int STEP_ANIMATIONS = 4;
        static final int STEP_LAYOUT = 2;
        static final int STEP_START = 1;
        private android.util.SparseArray<java.lang.Object> mData;
        long mFocusedItemId;
        int mFocusedItemPosition;
        int mFocusedSubChildId;
        int mRemainingScrollHorizontal;
        int mRemainingScrollVertical;
        int mTargetPosition = -1;
        int mPreviousLayoutItemCount = 0;
        int mDeletedInvisibleItemCountSincePreviousLayout = 0;
        int mLayoutStep = 1;
        int mItemCount = 0;
        boolean mStructureChanged = false;
        boolean mInPreLayout = false;
        boolean mTrackOldChangeHolders = false;
        boolean mIsMeasuring = false;
        boolean mRunSimpleAnimations = false;
        boolean mRunPredictiveAnimations = false;

        void assertLayoutStep(int i) {
            if ((this.mLayoutStep & i) == 0) {
                throw new java.lang.IllegalStateException("Layout state should be one of " + java.lang.Integer.toBinaryString(i) + " but it is " + java.lang.Integer.toBinaryString(this.mLayoutStep));
            }
        }

        void prepareForNestedPrefetch(androidx.recyclerview.widget.RecyclerView.Adapter adapter) {
            this.mLayoutStep = 1;
            this.mItemCount = adapter.getItemCount();
            this.mInPreLayout = false;
            this.mTrackOldChangeHolders = false;
            this.mIsMeasuring = false;
        }

        public boolean isMeasuring() {
            return this.mIsMeasuring;
        }

        public boolean isPreLayout() {
            return this.mInPreLayout;
        }

        public boolean willRunPredictiveAnimations() {
            return this.mRunPredictiveAnimations;
        }

        public boolean willRunSimpleAnimations() {
            return this.mRunSimpleAnimations;
        }

        public void remove(int i) {
            android.util.SparseArray<java.lang.Object> sparseArray = this.mData;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i);
        }

        public <T> T get(int i) {
            android.util.SparseArray<java.lang.Object> sparseArray = this.mData;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i);
        }

        public void put(int i, java.lang.Object obj) {
            if (this.mData == null) {
                this.mData = new android.util.SparseArray<>();
            }
            this.mData.put(i, obj);
        }

        public int getTargetScrollPosition() {
            return this.mTargetPosition;
        }

        public boolean hasTargetScrollPosition() {
            return this.mTargetPosition != -1;
        }

        public boolean didStructureChange() {
            return this.mStructureChanged;
        }

        public int getItemCount() {
            if (this.mInPreLayout) {
                return this.mPreviousLayoutItemCount - this.mDeletedInvisibleItemCountSincePreviousLayout;
            }
            return this.mItemCount;
        }

        public int getRemainingScrollHorizontal() {
            return this.mRemainingScrollHorizontal;
        }

        public int getRemainingScrollVertical() {
            return this.mRemainingScrollVertical;
        }

        public java.lang.String toString() {
            return "State{mTargetPosition=" + this.mTargetPosition + ", mData=" + this.mData + ", mItemCount=" + this.mItemCount + ", mIsMeasuring=" + this.mIsMeasuring + ", mPreviousLayoutItemCount=" + this.mPreviousLayoutItemCount + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.mDeletedInvisibleItemCountSincePreviousLayout + ", mStructureChanged=" + this.mStructureChanged + ", mInPreLayout=" + this.mInPreLayout + ", mRunSimpleAnimations=" + this.mRunSimpleAnimations + ", mRunPredictiveAnimations=" + this.mRunPredictiveAnimations + '}';
        }
    }

    private class ItemAnimatorRestoreListener implements androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener {
        ItemAnimatorRestoreListener() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        public void onAnimationFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (viewHolder.shouldBeKeptAsChild() || androidx.recyclerview.widget.RecyclerView.this.removeAnimatingView(viewHolder.itemView) || !viewHolder.isTmpDetached()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
        }
    }

    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mListener = null;
        private java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> mFinishedListeners = new java.util.ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        interface ItemAnimatorListener {
            void onAnimationFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);
        }

        public abstract boolean animateAppearance(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        public boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public abstract void endAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);

        public abstract void endAnimations();

        public abstract boolean isRunning();

        public void onAnimationFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        }

        public void onAnimationStarted(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        }

        public abstract void runPendingAnimations();

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        void setListener(androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener) {
            this.mListener = itemAnimatorListener;
        }

        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, java.util.List<java.lang.Object> list) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPostLayoutInformation(androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        static int buildAdapterChangeFlagsForAnimations(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mFlags & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = viewHolder.getOldPosition();
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i : i | 2048;
        }

        public final void dispatchAnimationFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            onAnimationFinished(viewHolder);
            androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener = this.mListener;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.onAnimationFinished(viewHolder);
            }
        }

        public final void dispatchAnimationStarted(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            onAnimationStarted(viewHolder);
        }

        public final boolean isRunning(androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean zIsRunning = isRunning();
            if (itemAnimatorFinishedListener != null) {
                if (!zIsRunning) {
                    itemAnimatorFinishedListener.onAnimationsFinished();
                } else {
                    this.mFinishedListeners.add(itemAnimatorFinishedListener);
                }
            }
            return zIsRunning;
        }

        public boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, java.util.List<java.lang.Object> list) {
            return canReuseUpdatedViewHolder(viewHolder);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i = 0; i < size; i++) {
                this.mFinishedListeners.get(i).onAnimationsFinished();
            }
            this.mFinishedListeners.clear();
        }

        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo obtainHolderInfo() {
            return new androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo();
        }

        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;

            public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
                return setFrom(viewHolder, 0);
            }

            public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
                android.view.View view = viewHolder.itemView;
                this.left = view.getLeft();
                this.top = view.getTop();
                this.right = view.getRight();
                this.bottom = view.getBottom();
                return this;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback childDrawingOrderCallback = this.mChildDrawingOrderCallback;
        if (childDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return childDrawingOrderCallback.onGetChildDrawingOrder(i, i2);
    }

    private androidx.core.view.NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }
}
