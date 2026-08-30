package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final java.lang.String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final java.lang.String VERSION = "ConstraintLayout-2.1.4";
    private static androidx.constraintlayout.widget.SharedValues sSharedValues;
    android.util.SparseArray<android.view.View> mChildrenByIds;
    private java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> mConstraintHelpers;
    protected androidx.constraintlayout.widget.ConstraintLayoutStates mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected androidx.constraintlayout.core.widgets.ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    androidx.constraintlayout.widget.ConstraintLayout.Measurer mMeasurer;
    private androidx.constraintlayout.core.Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> mTempMapIdToWidget;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static androidx.constraintlayout.widget.SharedValues getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new androidx.constraintlayout.widget.SharedValues();
        }
        return sSharedValues;
    }

    public void setDesignInformation(int type, java.lang.Object value1, java.lang.Object value2) {
        if (type == 0 && (value1 instanceof java.lang.String) && (value2 instanceof java.lang.Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new java.util.HashMap<>();
            }
            java.lang.String strSubstring = (java.lang.String) value1;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, java.lang.Integer.valueOf(((java.lang.Integer) value2).intValue()));
        }
    }

    public java.lang.Object getDesignInformation(int type, java.lang.Object value) {
        if (type != 0 || !(value instanceof java.lang.String)) {
            return null;
        }
        java.lang.String str = (java.lang.String) value;
        java.util.HashMap<java.lang.String, java.lang.Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public ConstraintLayout(android.content.Context context) {
        super(context);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attrs, 0, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attrs, defStyleAttr, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attrs, defStyleAttr, defStyleRes);
    }

    @Override // android.view.View
    public void setId(int id) {
        this.mChildrenByIds.remove(getId());
        super.setId(id);
        this.mChildrenByIds.put(getId(), this);
    }

    class Measurer implements androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer {
        androidx.constraintlayout.widget.ConstraintLayout layout;
        int layoutHeightSpec;
        int layoutWidthSpec;
        int paddingBottom;
        int paddingHeight;
        int paddingTop;
        int paddingWidth;

        public void captureLayoutInfo(int widthSpec, int heightSpec, int top, int bottom, int width, int height) {
            this.paddingTop = top;
            this.paddingBottom = bottom;
            this.paddingWidth = width;
            this.paddingHeight = height;
            this.layoutWidthSpec = widthSpec;
            this.layoutHeightSpec = heightSpec;
        }

        public Measurer(androidx.constraintlayout.widget.ConstraintLayout l) {
            this.layout = l;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        public final void measure(androidx.constraintlayout.core.widgets.ConstraintWidget widget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure measure) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i;
            if (widget == null) {
                return;
            }
            if (widget.getVisibility() == 8 && !widget.isInPlaceholder()) {
                measure.measuredWidth = 0;
                measure.measuredHeight = 0;
                measure.measuredBaseline = 0;
                return;
            }
            if (widget.getParent() == null) {
                return;
            }
            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.verticalBehavior;
            int i2 = measure.horizontalDimension;
            int i3 = measure.verticalDimension;
            int i4 = this.paddingTop + this.paddingBottom;
            int i5 = this.paddingWidth;
            android.view.View view = (android.view.View) widget.getCompanionWidget();
            int i6 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour.ordinal()];
            if (i6 == 1) {
                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else if (i6 == 2) {
                iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.layoutWidthSpec, i5, -2);
            } else if (i6 == 3) {
                iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.layoutWidthSpec, i5 + widget.getHorizontalMargin(), -1);
            } else if (i6 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.layoutWidthSpec, i5, -2);
                boolean z = widget.mMatchConstraintDefaultWidth == 1;
                if (measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
                    if (measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || !z || (z && (view.getMeasuredHeight() == widget.getHeight())) || (view instanceof androidx.constraintlayout.widget.Placeholder) || widget.isResolvedHorizontally()) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(widget.getWidth(), 1073741824);
                    }
                }
            }
            int i7 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour2.ordinal()];
            if (i7 == 1) {
                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i7 == 2) {
                iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, i4, -2);
            } else if (i7 == 3) {
                iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, i4 + widget.getVerticalMargin(), -1);
            } else if (i7 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, i4, -2);
                boolean z2 = widget.mMatchConstraintDefaultHeight == 1;
                if (measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
                    if (measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || !z2 || (z2 && (view.getMeasuredWidth() == widget.getWidth())) || (view instanceof androidx.constraintlayout.widget.Placeholder) || widget.isResolvedVertically()) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(widget.getHeight(), 1073741824);
                    }
                }
            }
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) widget.getParent();
            if (constraintWidgetContainer != null && androidx.constraintlayout.core.widgets.Optimizer.enabled(androidx.constraintlayout.widget.ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == widget.getWidth() && view.getMeasuredWidth() < constraintWidgetContainer.getWidth() && view.getMeasuredHeight() == widget.getHeight() && view.getMeasuredHeight() < constraintWidgetContainer.getHeight() && view.getBaseline() == widget.getBaselineDistance() && !widget.isMeasureRequested()) {
                if (isSimilarSpec(widget.getLastHorizontalMeasureSpec(), iMakeMeasureSpec, widget.getWidth()) && isSimilarSpec(widget.getLastVerticalMeasureSpec(), iMakeMeasureSpec2, widget.getHeight())) {
                    measure.measuredWidth = widget.getWidth();
                    measure.measuredHeight = widget.getHeight();
                    measure.measuredBaseline = widget.getBaselineDistance();
                    return;
                }
            }
            boolean z3 = dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z4 = dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z5 = dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z6 = dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z7 = z3 && widget.mDimensionRatio > 0.0f;
            boolean z8 = z4 && widget.mDimensionRatio > 0.0f;
            if (view == null) {
                return;
            }
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
            if (measure.measureStrategy != androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS && measure.measureStrategy != androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS && z3 && widget.mMatchConstraintDefaultWidth == 0 && z4 && widget.mMatchConstraintDefaultHeight == 0) {
                i = -1;
                baseline = 0;
                iMax = 0;
                iMax2 = 0;
            } else {
                if ((view instanceof androidx.constraintlayout.widget.VirtualLayout) && (widget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                    ((androidx.constraintlayout.widget.VirtualLayout) view).onMeasure((androidx.constraintlayout.core.widgets.VirtualLayout) widget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                widget.setLastMeasureSpec(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = widget.mMatchConstraintMinWidth > 0 ? java.lang.Math.max(widget.mMatchConstraintMinWidth, measuredWidth) : measuredWidth;
                if (widget.mMatchConstraintMaxWidth > 0) {
                    iMax = java.lang.Math.min(widget.mMatchConstraintMaxWidth, iMax);
                }
                iMax2 = widget.mMatchConstraintMinHeight > 0 ? java.lang.Math.max(widget.mMatchConstraintMinHeight, measuredHeight) : measuredHeight;
                if (widget.mMatchConstraintMaxHeight > 0) {
                    iMax2 = java.lang.Math.min(widget.mMatchConstraintMaxHeight, iMax2);
                }
                if (!androidx.constraintlayout.core.widgets.Optimizer.enabled(androidx.constraintlayout.widget.ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (z7 && z5) {
                        iMax = (int) ((iMax2 * widget.mDimensionRatio) + 0.5f);
                    } else if (z8 && z6) {
                        iMax2 = (int) ((iMax / widget.mDimensionRatio) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax2 ? android.view.View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : iMakeMeasureSpec2;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    widget.setLastMeasureSpec(iMakeMeasureSpec, iMakeMeasureSpec3);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i = -1;
            }
            boolean z9 = baseline != i;
            measure.measuredNeedsSolverPass = (iMax == measure.horizontalDimension && iMax2 == measure.verticalDimension) ? false : true;
            if (layoutParams.needsBaseline) {
                z9 = true;
            }
            if (z9 && baseline != -1 && widget.getBaselineDistance() != baseline) {
                measure.measuredNeedsSolverPass = true;
            }
            measure.measuredWidth = iMax;
            measure.measuredHeight = iMax2;
            measure.measuredHasBaseline = z9;
            measure.measuredBaseline = baseline;
        }

        private boolean isSimilarSpec(int lastMeasureSpec, int spec, int widgetSize) {
            if (lastMeasureSpec == spec) {
                return true;
            }
            int mode = android.view.View.MeasureSpec.getMode(lastMeasureSpec);
            android.view.View.MeasureSpec.getSize(lastMeasureSpec);
            int mode2 = android.view.View.MeasureSpec.getMode(spec);
            int size = android.view.View.MeasureSpec.getSize(spec);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && widgetSize == size;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        public final void didMeasures() {
            int childCount = this.layout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = this.layout.getChildAt(i);
                if (childAt instanceof androidx.constraintlayout.widget.Placeholder) {
                    ((androidx.constraintlayout.widget.Placeholder) childAt).updatePostMeasure(this.layout);
                }
            }
            int size = this.layout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.ConstraintHelper) this.layout.mConstraintHelpers.get(i2)).updatePostMeasure(this.layout);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private void init(android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mLayoutWidget.setMeasurer(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout, defStyleAttr, defStyleRes);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (android.content.res.Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.load(getContext(), resourceId2);
                    } catch (android.content.res.Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    protected void parseLayoutDescription(int id) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.ConstraintLayoutStates(getContext(), this, id);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        androidx.constraintlayout.core.widgets.ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof androidx.constraintlayout.widget.Guideline) && !(viewWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
            layoutParams.widget = new androidx.constraintlayout.core.widgets.Guideline();
            layoutParams.isGuideline = true;
            ((androidx.constraintlayout.core.widgets.Guideline) layoutParams.widget).setOrientation(layoutParams.orientation);
        }
        if (view instanceof androidx.constraintlayout.widget.ConstraintHelper) {
            androidx.constraintlayout.widget.ConstraintHelper constraintHelper = (androidx.constraintlayout.widget.ConstraintHelper) view;
            constraintHelper.validateParams();
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.remove(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void setMinWidth(int value) {
        if (value == this.mMinWidth) {
            return;
        }
        this.mMinWidth = value;
        requestLayout();
    }

    public void setMinHeight(int value) {
        if (value == this.mMinHeight) {
            return;
        }
        this.mMinHeight = value;
        requestLayout();
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public void setMaxWidth(int value) {
        if (value == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = value;
        requestLayout();
    }

    public void setMaxHeight(int value) {
        if (value == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = value;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    private void setChildrenConstraints() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                try {
                    java.lang.String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, java.lang.Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).setDebugName(resourceName);
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof androidx.constraintlayout.widget.Constraints)) {
                    this.mConstraintSet = ((androidx.constraintlayout.widget.Constraints) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet != null) {
            constraintSet.applyToInternal(this, true);
        }
        this.mLayoutWidget.removeAllChildren();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).updatePreLayout(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt3 = getChildAt(i5);
            if (childAt3 instanceof androidx.constraintlayout.widget.Placeholder) {
                ((androidx.constraintlayout.widget.Placeholder) childAt3).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt5 = getChildAt(i7);
            androidx.constraintlayout.core.widgets.ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.add(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void applyConstraintsFromLayoutParams(boolean isInEditMode, android.view.View child, androidx.constraintlayout.core.widgets.ConstraintWidget widget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> idToWidget) {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4;
        layoutParams.validate();
        layoutParams.helped = false;
        widget.setVisibility(child.getVisibility());
        if (layoutParams.isInPlaceholder) {
            widget.setInPlaceholder(true);
            widget.setVisibility(8);
        }
        widget.setCompanionWidget(child);
        if (child instanceof androidx.constraintlayout.widget.ConstraintHelper) {
            ((androidx.constraintlayout.widget.ConstraintHelper) child).resolveRtl(widget, this.mLayoutWidget.isRtl());
        }
        if (layoutParams.isGuideline) {
            androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) widget;
            int i = layoutParams.resolvedGuideBegin;
            int i2 = layoutParams.resolvedGuideEnd;
            float f = layoutParams.resolvedGuidePercent;
            if (f != -1.0f) {
                guideline.setGuidePercent(f);
                return;
            } else if (i != -1) {
                guideline.setGuideBegin(i);
                return;
            } else {
                if (i2 != -1) {
                    guideline.setGuideEnd(i2);
                    return;
                }
                return;
            }
        }
        int i3 = layoutParams.resolvedLeftToLeft;
        int i4 = layoutParams.resolvedLeftToRight;
        int i5 = layoutParams.resolvedRightToLeft;
        int i6 = layoutParams.resolvedRightToRight;
        int i7 = layoutParams.resolveGoneLeftMargin;
        int i8 = layoutParams.resolveGoneRightMargin;
        float f2 = layoutParams.resolvedHorizontalBias;
        if (layoutParams.circleConstraint != -1) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = idToWidget.get(layoutParams.circleConstraint);
            if (constraintWidget5 != null) {
                widget.connectCircularConstraint(constraintWidget5, layoutParams.circleAngle, layoutParams.circleRadius);
            }
        } else {
            if (i3 != -1) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = idToWidget.get(i3);
                if (constraintWidget6 != null) {
                    widget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, constraintWidget6, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, layoutParams.leftMargin, i7);
                }
            } else if (i4 != -1 && (constraintWidget = idToWidget.get(i4)) != null) {
                widget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, layoutParams.leftMargin, i7);
            }
            if (i5 != -1) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = idToWidget.get(i5);
                if (constraintWidget7 != null) {
                    widget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget7, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, layoutParams.rightMargin, i8);
                }
            } else if (i6 != -1 && (constraintWidget2 = idToWidget.get(i6)) != null) {
                widget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget2, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, layoutParams.rightMargin, i8);
            }
            if (layoutParams.topToTop != -1) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget8 = idToWidget.get(layoutParams.topToTop);
                if (constraintWidget8 != null) {
                    widget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, constraintWidget8, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, layoutParams.topMargin, layoutParams.goneTopMargin);
                }
            } else if (layoutParams.topToBottom != -1 && (constraintWidget3 = idToWidget.get(layoutParams.topToBottom)) != null) {
                widget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, constraintWidget3, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, layoutParams.topMargin, layoutParams.goneTopMargin);
            }
            if (layoutParams.bottomToTop != -1) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget9 = idToWidget.get(layoutParams.bottomToTop);
                if (constraintWidget9 != null) {
                    widget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget9, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, layoutParams.bottomMargin, layoutParams.goneBottomMargin);
                }
            } else if (layoutParams.bottomToBottom != -1 && (constraintWidget4 = idToWidget.get(layoutParams.bottomToBottom)) != null) {
                widget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget4, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, layoutParams.bottomMargin, layoutParams.goneBottomMargin);
            }
            if (layoutParams.baselineToBaseline != -1) {
                setWidgetBaseline(widget, layoutParams, idToWidget, layoutParams.baselineToBaseline, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
            } else if (layoutParams.baselineToTop != -1) {
                setWidgetBaseline(widget, layoutParams, idToWidget, layoutParams.baselineToTop, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
            } else if (layoutParams.baselineToBottom != -1) {
                setWidgetBaseline(widget, layoutParams, idToWidget, layoutParams.baselineToBottom, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
            }
            if (f2 >= 0.0f) {
                widget.setHorizontalBiasPercent(f2);
            }
            if (layoutParams.verticalBias >= 0.0f) {
                widget.setVerticalBiasPercent(layoutParams.verticalBias);
            }
        }
        if (isInEditMode && (layoutParams.editorAbsoluteX != -1 || layoutParams.editorAbsoluteY != -1)) {
            widget.setOrigin(layoutParams.editorAbsoluteX, layoutParams.editorAbsoluteY);
        }
        if (!layoutParams.horizontalDimensionFixed) {
            if (layoutParams.width == -1) {
                if (layoutParams.constrainedWidth) {
                    widget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    widget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                widget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).mMargin = layoutParams.leftMargin;
                widget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).mMargin = layoutParams.rightMargin;
            } else {
                widget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                widget.setWidth(0);
            }
        } else {
            widget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
            widget.setWidth(layoutParams.width);
            if (layoutParams.width == -2) {
                widget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
        if (!layoutParams.verticalDimensionFixed) {
            if (layoutParams.height == -1) {
                if (layoutParams.constrainedHeight) {
                    widget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    widget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                widget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).mMargin = layoutParams.topMargin;
                widget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).mMargin = layoutParams.bottomMargin;
            } else {
                widget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                widget.setHeight(0);
            }
        } else {
            widget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
            widget.setHeight(layoutParams.height);
            if (layoutParams.height == -2) {
                widget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
        widget.setDimensionRatio(layoutParams.dimensionRatio);
        widget.setHorizontalWeight(layoutParams.horizontalWeight);
        widget.setVerticalWeight(layoutParams.verticalWeight);
        widget.setHorizontalChainStyle(layoutParams.horizontalChainStyle);
        widget.setVerticalChainStyle(layoutParams.verticalChainStyle);
        widget.setWrapBehaviorInParent(layoutParams.wrapBehaviorInParent);
        widget.setHorizontalMatchStyle(layoutParams.matchConstraintDefaultWidth, layoutParams.matchConstraintMinWidth, layoutParams.matchConstraintMaxWidth, layoutParams.matchConstraintPercentWidth);
        widget.setVerticalMatchStyle(layoutParams.matchConstraintDefaultHeight, layoutParams.matchConstraintMinHeight, layoutParams.matchConstraintMaxHeight, layoutParams.matchConstraintPercentHeight);
    }

    private void setWidgetBaseline(androidx.constraintlayout.core.widgets.ConstraintWidget widget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> idToWidget, int baselineTarget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type) {
        android.view.View view = this.mChildrenByIds.get(baselineTarget);
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = idToWidget.get(baselineTarget);
        if (constraintWidget == null || view == null || !(view.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams)) {
            return;
        }
        layoutParams.needsBaseline = true;
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.needsBaseline = true;
            layoutParams2.widget.setHasBaseline(true);
        }
        widget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE).connect(constraintWidget.getAnchor(type), layoutParams.baselineMargin, layoutParams.goneBaselineMargin, true);
        widget.setHasBaseline(true);
        widget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).reset();
        widget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).reset();
    }

    private final androidx.constraintlayout.core.widgets.ConstraintWidget getTargetWidget(int id) {
        if (id == 0) {
            return this.mLayoutWidget;
        }
        android.view.View viewFindViewById = this.mChildrenByIds.get(id);
        if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).widget;
    }

    public final androidx.constraintlayout.core.widgets.ConstraintWidget getViewWidget(android.view.View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            return ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).widget;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            return ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).widget;
        }
        return null;
    }

    public void fillMetrics(androidx.constraintlayout.core.Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.fillMetrics(metrics);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveSystem(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer layout, int optimizationLevel, int widthMeasureSpec, int heightMeasureSpec) {
        int iMax;
        int mode = android.view.View.MeasureSpec.getMode(widthMeasureSpec);
        int size = android.view.View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = android.view.View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = android.view.View.MeasureSpec.getSize(heightMeasureSpec);
        int iMax2 = java.lang.Math.max(0, getPaddingTop());
        int iMax3 = java.lang.Math.max(0, getPaddingBottom());
        int i = iMax2 + iMax3;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.captureLayoutInfo(widthMeasureSpec, heightMeasureSpec, iMax2, iMax3, paddingWidth, i);
        int iMax4 = java.lang.Math.max(0, getPaddingStart());
        int iMax5 = java.lang.Math.max(0, getPaddingEnd());
        if (iMax4 > 0 || iMax5 > 0) {
            iMax = isRtl() ? iMax5 : iMax4;
        } else {
            iMax = java.lang.Math.max(0, getPaddingLeft());
        }
        int i2 = size - paddingWidth;
        int i3 = size2 - i;
        setSelfDimensionBehaviour(layout, mode, i2, mode2, i3);
        layout.measure(optimizationLevel, mode, i2, mode2, i3, this.mLastMeasureWidth, this.mLastMeasureHeight, iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveMeasuredDimension(int widthMeasureSpec, int heightMeasureSpec, int measuredWidth, int measuredHeight, boolean isWidthMeasuredTooSmall, boolean isHeightMeasuredTooSmall) {
        int i = this.mMeasurer.paddingHeight;
        int iResolveSizeAndState = resolveSizeAndState(measuredWidth + this.mMeasurer.paddingWidth, widthMeasureSpec, 0);
        int iResolveSizeAndState2 = resolveSizeAndState(measuredHeight + i, heightMeasureSpec, 0);
        int i2 = iResolveSizeAndState & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
        int i3 = iResolveSizeAndState2 & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
        int iMin = java.lang.Math.min(this.mMaxWidth, i2);
        int iMin2 = java.lang.Math.min(this.mMaxHeight, i3);
        if (isWidthMeasuredTooSmall) {
            iMin |= 16777216;
        }
        if (isHeightMeasuredTooSmall) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mOnMeasureWidthMeasureSpec == widthMeasureSpec) {
            int i = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        boolean z = this.mDirtyHierarchy;
        this.mOnMeasureWidthMeasureSpec = widthMeasureSpec;
        this.mOnMeasureHeightMeasureSpec = heightMeasureSpec;
        this.mLayoutWidget.setRtl(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.updateHierarchy();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, widthMeasureSpec, heightMeasureSpec);
        resolveMeasuredDimension(widthMeasureSpec, heightMeasureSpec, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isRtl() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    private int getPaddingWidth() {
        int iMax = java.lang.Math.max(0, getPaddingLeft()) + java.lang.Math.max(0, getPaddingRight());
        int iMax2 = java.lang.Math.max(0, getPaddingStart()) + java.lang.Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[PHI: r3
  0x0040: PHI (r3v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
  (r3v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r3v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
 binds: [B:20:0x004c, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:6:0x001b A[PHI: r2
  0x001b: PHI (r2v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
  (r2v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r2v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
 binds: [B:9:0x0027, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    protected void setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer layout, int widthMode, int widthSize, int heightMode, int heightSize) {
        int i = this.mMeasurer.paddingHeight;
        int i2 = this.mMeasurer.paddingWidth;
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (widthMode == Integer.MIN_VALUE) {
            dimensionBehaviour = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                widthSize = java.lang.Math.max(0, this.mMinWidth);
            }
        } else if (widthMode == 0) {
            dimensionBehaviour = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                widthSize = java.lang.Math.max(0, this.mMinWidth);
            } else {
                widthSize = 0;
            }
        } else if (widthMode != 1073741824) {
            widthSize = 0;
        } else {
            widthSize = java.lang.Math.min(this.mMaxWidth - i2, widthSize);
        }
        if (heightMode == Integer.MIN_VALUE) {
            dimensionBehaviour2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                heightSize = java.lang.Math.max(0, this.mMinHeight);
            }
        } else if (heightMode == 0) {
            dimensionBehaviour2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                heightSize = java.lang.Math.max(0, this.mMinHeight);
            } else {
                heightSize = 0;
            }
        } else if (heightMode != 1073741824) {
            heightSize = 0;
        } else {
            heightSize = java.lang.Math.min(this.mMaxHeight - i, heightSize);
        }
        if (widthSize != layout.getWidth() || heightSize != layout.getHeight()) {
            layout.invalidateMeasures();
        }
        layout.setX(0);
        layout.setY(0);
        layout.setMaxWidth(this.mMaxWidth - i2);
        layout.setMaxHeight(this.mMaxHeight - i);
        layout.setMinWidth(0);
        layout.setMinHeight(0);
        layout.setHorizontalDimensionBehaviour(dimensionBehaviour);
        layout.setWidth(widthSize);
        layout.setVerticalDimensionBehaviour(dimensionBehaviour2);
        layout.setHeight(heightSize);
        layout.setMinWidth(this.mMinWidth - i2);
        layout.setMinHeight(this.mMinHeight - i);
    }

    public void setState(int id, int screenWidth, int screenHeight) {
        androidx.constraintlayout.widget.ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(id, screenWidth, screenHeight);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        android.view.View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = layoutParams.widget;
            if ((childAt.getVisibility() != 8 || layoutParams.isGuideline || layoutParams.isHelper || layoutParams.isVirtualGroup || zIsInEditMode) && !layoutParams.isInPlaceholder) {
                int x = constraintWidget.getX();
                int y = constraintWidget.getY();
                int width = constraintWidget.getWidth() + x;
                int height = constraintWidget.getHeight() + y;
                childAt.layout(x, y, width, height);
                if ((childAt instanceof androidx.constraintlayout.widget.Placeholder) && (content = ((androidx.constraintlayout.widget.Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x, y, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.mConstraintHelpers.get(i2).updatePostLayout(this);
            }
        }
    }

    public void setOptimizationLevel(int level) {
        this.mOptimizationLevel = level;
        this.mLayoutWidget.setOptimizationLevel(level);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(getContext(), attrs);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateDefaultLayoutParams() {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(p);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) {
        return p instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.ConstraintSet set) {
        this.mConstraintSet = set;
    }

    public android.view.View getViewById(int id) {
        return this.mChildrenByIds.get(id);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        java.lang.Object tag;
        int size;
        java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof java.lang.String)) {
                    java.lang.String[] strArrSplit = ((java.lang.String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = java.lang.Integer.parseInt(strArrSplit[0]);
                        int i4 = java.lang.Integer.parseInt(strArrSplit[1]);
                        int i5 = java.lang.Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((java.lang.Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
        androidx.constraintlayout.widget.ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.setOnConstraintsChanged(constraintsChangedListener);
        }
    }

    public void loadLayoutDescription(int layoutDescription) {
        if (layoutDescription != 0) {
            try {
                this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.ConstraintLayoutStates(getContext(), this, layoutDescription);
                return;
            } catch (android.content.res.Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int CIRCLE = 8;
        public static final int END = 7;
        public static final int GONE_UNSET = Integer.MIN_VALUE;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
        public static final int WRAP_BEHAVIOR_INCLUDED = 0;
        public static final int WRAP_BEHAVIOR_SKIPPED = 3;
        public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
        public int baselineMargin;
        public int baselineToBaseline;
        public int baselineToBottom;
        public int baselineToTop;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public java.lang.String constraintTag;
        public java.lang.String dimensionRatio;
        int dimensionRatioSide;
        float dimensionRatioValue;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBaselineMargin;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean guidelineUseRtl;
        boolean heightSet;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        boolean horizontalDimensionFixed;
        public float horizontalWeight;
        boolean isGuideline;
        boolean isHelper;
        boolean isInPlaceholder;
        boolean isVirtualGroup;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        boolean needsBaseline;
        public int orientation;
        int resolveGoneLeftMargin;
        int resolveGoneRightMargin;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias;
        int resolvedLeftToLeft;
        int resolvedLeftToRight;
        int resolvedRightToLeft;
        int resolvedRightToRight;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        boolean verticalDimensionFixed;
        public float verticalWeight;
        androidx.constraintlayout.core.widgets.ConstraintWidget widget;
        boolean widthSet;
        public int wrapBehaviorInParent;

        public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
            return this.widget;
        }

        public void setWidgetDebugName(java.lang.String text) {
            this.widget.setDebugName(text);
        }

        public void reset() {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.widget;
            if (constraintWidget != null) {
                constraintWidget.reset();
            }
        }

        public LayoutParams(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams source) {
            super((android.view.ViewGroup.MarginLayoutParams) source);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.widthSet = true;
            this.heightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = Integer.MIN_VALUE;
            this.resolveGoneRightMargin = Integer.MIN_VALUE;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new androidx.constraintlayout.core.widgets.ConstraintWidget();
            this.helped = false;
            this.guideBegin = source.guideBegin;
            this.guideEnd = source.guideEnd;
            this.guidePercent = source.guidePercent;
            this.guidelineUseRtl = source.guidelineUseRtl;
            this.leftToLeft = source.leftToLeft;
            this.leftToRight = source.leftToRight;
            this.rightToLeft = source.rightToLeft;
            this.rightToRight = source.rightToRight;
            this.topToTop = source.topToTop;
            this.topToBottom = source.topToBottom;
            this.bottomToTop = source.bottomToTop;
            this.bottomToBottom = source.bottomToBottom;
            this.baselineToBaseline = source.baselineToBaseline;
            this.baselineToTop = source.baselineToTop;
            this.baselineToBottom = source.baselineToBottom;
            this.circleConstraint = source.circleConstraint;
            this.circleRadius = source.circleRadius;
            this.circleAngle = source.circleAngle;
            this.startToEnd = source.startToEnd;
            this.startToStart = source.startToStart;
            this.endToStart = source.endToStart;
            this.endToEnd = source.endToEnd;
            this.goneLeftMargin = source.goneLeftMargin;
            this.goneTopMargin = source.goneTopMargin;
            this.goneRightMargin = source.goneRightMargin;
            this.goneBottomMargin = source.goneBottomMargin;
            this.goneStartMargin = source.goneStartMargin;
            this.goneEndMargin = source.goneEndMargin;
            this.goneBaselineMargin = source.goneBaselineMargin;
            this.baselineMargin = source.baselineMargin;
            this.horizontalBias = source.horizontalBias;
            this.verticalBias = source.verticalBias;
            this.dimensionRatio = source.dimensionRatio;
            this.dimensionRatioValue = source.dimensionRatioValue;
            this.dimensionRatioSide = source.dimensionRatioSide;
            this.horizontalWeight = source.horizontalWeight;
            this.verticalWeight = source.verticalWeight;
            this.horizontalChainStyle = source.horizontalChainStyle;
            this.verticalChainStyle = source.verticalChainStyle;
            this.constrainedWidth = source.constrainedWidth;
            this.constrainedHeight = source.constrainedHeight;
            this.matchConstraintDefaultWidth = source.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = source.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = source.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = source.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = source.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = source.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = source.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = source.matchConstraintPercentHeight;
            this.editorAbsoluteX = source.editorAbsoluteX;
            this.editorAbsoluteY = source.editorAbsoluteY;
            this.orientation = source.orientation;
            this.horizontalDimensionFixed = source.horizontalDimensionFixed;
            this.verticalDimensionFixed = source.verticalDimensionFixed;
            this.needsBaseline = source.needsBaseline;
            this.isGuideline = source.isGuideline;
            this.resolvedLeftToLeft = source.resolvedLeftToLeft;
            this.resolvedLeftToRight = source.resolvedLeftToRight;
            this.resolvedRightToLeft = source.resolvedRightToLeft;
            this.resolvedRightToRight = source.resolvedRightToRight;
            this.resolveGoneLeftMargin = source.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = source.resolveGoneRightMargin;
            this.resolvedHorizontalBias = source.resolvedHorizontalBias;
            this.constraintTag = source.constraintTag;
            this.wrapBehaviorInParent = source.wrapBehaviorInParent;
            this.widget = source.widget;
            this.widthSet = source.widthSet;
            this.heightSet = source.heightSet;
        }

        private static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int GUIDELINE_USE_RTL = 67;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF = 53;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF = 52;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT = 65;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH = 64;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BASELINE = 55;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int LAYOUT_MARGIN_BASELINE = 54;
            public static final int LAYOUT_WRAP_BEHAVIOR_IN_PARENT = 66;
            public static final int UNUSED = 0;
            public static final android.util.SparseIntArray map;

            private Table() {
            }

            static {
                android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
                map = sparseIntArray;
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(android.content.Context c, android.util.AttributeSet attrs) {
            super(c, attrs);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.widthSet = true;
            this.heightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = Integer.MIN_VALUE;
            this.resolveGoneRightMargin = Integer.MIN_VALUE;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new androidx.constraintlayout.core.widgets.ConstraintWidget();
            this.helped = false;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = c.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.Table.map.get(index);
                switch (i2) {
                    case 1:
                        this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId == -1) {
                            this.circleConstraint = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f;
                        if (f < 0.0f) {
                            this.circleAngle = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 == -1) {
                            this.leftToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 == -1) {
                            this.leftToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 == -1) {
                            this.rightToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 == -1) {
                            this.rightToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 == -1) {
                            this.topToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 == -1) {
                            this.topToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 == -1) {
                            this.bottomToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 == -1) {
                            this.bottomToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 == -1) {
                            this.baselineToBaseline = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 == -1) {
                            this.startToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 == -1) {
                            this.startToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 == -1) {
                            this.endToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 == -1) {
                            this.endToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultWidth = i3;
                        if (i3 == 1) {
                            android.util.Log.e(androidx.constraintlayout.widget.ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultHeight = i4;
                        if (i4 == 1) {
                            android.util.Log.e(androidx.constraintlayout.widget.ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.matchConstraintMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                        } catch (java.lang.Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                        } catch (java.lang.Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                            }
                        }
                        break;
                    case 35:
                        this.matchConstraintPercentWidth = java.lang.Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                        } catch (java.lang.Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                        } catch (java.lang.Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                            }
                        }
                        break;
                    case 38:
                        this.matchConstraintPercentHeight = java.lang.Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                androidx.constraintlayout.widget.ConstraintSet.parseDimensionRatioString(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                            case 51:
                                this.constraintTag = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.baselineToTop);
                                this.baselineToTop = resourceId15;
                                if (resourceId15 == -1) {
                                    this.baselineToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.baselineToBottom);
                                this.baselineToBottom = resourceId16;
                                if (resourceId16 == -1) {
                                    this.baselineToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.baselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                break;
                            case 55:
                                this.goneBaselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.widthSet = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.heightSet = true;
                                        break;
                                    case 66:
                                        this.wrapBehaviorInParent = typedArrayObtainStyledAttributes.getInt(index, this.wrapBehaviorInParent);
                                        break;
                                    case 67:
                                        this.guidelineUseRtl = typedArrayObtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            validate();
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            if (this.width == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            if (this.height == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (this.width == 0 || this.width == -1) {
                this.horizontalDimensionFixed = false;
                if (this.width == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.verticalDimensionFixed = false;
                if (this.height == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent == -1.0f && this.guideBegin == -1 && this.guideEnd == -1) {
                return;
            }
            this.isGuideline = true;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            if (!(this.widget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                this.widget = new androidx.constraintlayout.core.widgets.Guideline();
            }
            ((androidx.constraintlayout.core.widgets.Guideline) this.widget).setOrientation(this.orientation);
        }

        public LayoutParams(int width, int height) {
            super(width, height);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.widthSet = true;
            this.heightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = Integer.MIN_VALUE;
            this.resolveGoneRightMargin = Integer.MIN_VALUE;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new androidx.constraintlayout.core.widgets.ConstraintWidget();
            this.helped = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams source) {
            super(source);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.widthSet = true;
            this.heightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = Integer.MIN_VALUE;
            this.resolveGoneRightMargin = Integer.MIN_VALUE;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new androidx.constraintlayout.core.widgets.ConstraintWidget();
            this.helped = false;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int layoutDirection) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = this.leftMargin;
            int i6 = this.rightMargin;
            super.resolveLayoutDirection(layoutDirection);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolveGoneLeftMargin = this.goneLeftMargin;
            this.resolveGoneRightMargin = this.goneRightMargin;
            float f = this.horizontalBias;
            this.resolvedHorizontalBias = f;
            int i7 = this.guideBegin;
            this.resolvedGuideBegin = i7;
            int i8 = this.guideEnd;
            this.resolvedGuideEnd = i8;
            float f2 = this.guidePercent;
            this.resolvedGuidePercent = f2;
            if (z2) {
                int i9 = this.startToEnd;
                if (i9 != -1) {
                    this.resolvedRightToLeft = i9;
                } else {
                    int i10 = this.startToStart;
                    if (i10 != -1) {
                        this.resolvedRightToRight = i10;
                    } else {
                        i = this.endToStart;
                        if (i != -1) {
                            this.resolvedLeftToRight = i;
                            z = true;
                        }
                        i2 = this.endToEnd;
                        if (i2 != -1) {
                            this.resolvedLeftToLeft = i2;
                            z = true;
                        }
                        i3 = this.goneStartMargin;
                        if (i3 != Integer.MIN_VALUE) {
                            this.resolveGoneRightMargin = i3;
                        }
                        i4 = this.goneEndMargin;
                        if (i4 != Integer.MIN_VALUE) {
                            this.resolveGoneLeftMargin = i4;
                        }
                        if (z) {
                            this.resolvedHorizontalBias = 1.0f - f;
                        }
                        if (this.isGuideline && this.orientation == 1 && this.guidelineUseRtl) {
                            if (f2 != -1.0f) {
                                this.resolvedGuidePercent = 1.0f - f2;
                                this.resolvedGuideBegin = -1;
                                this.resolvedGuideEnd = -1;
                            } else if (i7 != -1) {
                                this.resolvedGuideEnd = i7;
                                this.resolvedGuideBegin = -1;
                                this.resolvedGuidePercent = -1.0f;
                            } else if (i8 != -1) {
                                this.resolvedGuideBegin = i8;
                                this.resolvedGuideEnd = -1;
                                this.resolvedGuidePercent = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i = this.endToStart;
                if (i != -1) {
                    this.resolvedLeftToRight = i;
                    z = true;
                }
                i2 = this.endToEnd;
                if (i2 != -1) {
                    this.resolvedLeftToLeft = i2;
                    z = true;
                }
                i3 = this.goneStartMargin;
                if (i3 != Integer.MIN_VALUE) {
                    this.resolveGoneRightMargin = i3;
                }
                i4 = this.goneEndMargin;
                if (i4 != Integer.MIN_VALUE) {
                    this.resolveGoneLeftMargin = i4;
                }
                if (z) {
                    this.resolvedHorizontalBias = 1.0f - f;
                }
                if (this.isGuideline) {
                    if (f2 != -1.0f) {
                        this.resolvedGuidePercent = 1.0f - f2;
                        this.resolvedGuideBegin = -1;
                        this.resolvedGuideEnd = -1;
                    } else if (i7 != -1) {
                        this.resolvedGuideEnd = i7;
                        this.resolvedGuideBegin = -1;
                        this.resolvedGuidePercent = -1.0f;
                    } else if (i8 != -1) {
                        this.resolvedGuideBegin = i8;
                        this.resolvedGuideEnd = -1;
                        this.resolvedGuidePercent = -1.0f;
                    }
                }
            } else {
                int i11 = this.startToEnd;
                if (i11 != -1) {
                    this.resolvedLeftToRight = i11;
                }
                int i12 = this.startToStart;
                if (i12 != -1) {
                    this.resolvedLeftToLeft = i12;
                }
                int i13 = this.endToStart;
                if (i13 != -1) {
                    this.resolvedRightToLeft = i13;
                }
                int i14 = this.endToEnd;
                if (i14 != -1) {
                    this.resolvedRightToRight = i14;
                }
                int i15 = this.goneStartMargin;
                if (i15 != Integer.MIN_VALUE) {
                    this.resolveGoneLeftMargin = i15;
                }
                int i16 = this.goneEndMargin;
                if (i16 != Integer.MIN_VALUE) {
                    this.resolveGoneRightMargin = i16;
                }
            }
            if (this.endToStart == -1 && this.endToEnd == -1 && this.startToStart == -1 && this.startToEnd == -1) {
                int i17 = this.rightToLeft;
                if (i17 != -1) {
                    this.resolvedRightToLeft = i17;
                    if (this.rightMargin <= 0 && i6 > 0) {
                        this.rightMargin = i6;
                    }
                } else {
                    int i18 = this.rightToRight;
                    if (i18 != -1) {
                        this.resolvedRightToRight = i18;
                        if (this.rightMargin <= 0 && i6 > 0) {
                            this.rightMargin = i6;
                        }
                    }
                }
                int i19 = this.leftToLeft;
                if (i19 != -1) {
                    this.resolvedLeftToLeft = i19;
                    if (this.leftMargin > 0 || i5 <= 0) {
                        return;
                    }
                    this.leftMargin = i5;
                    return;
                }
                int i20 = this.leftToRight;
                if (i20 != -1) {
                    this.resolvedLeftToRight = i20;
                    if (this.leftMargin > 0 || i5 <= 0) {
                        return;
                    }
                    this.leftMargin = i5;
                }
            }
        }

        public java.lang.String getConstraintTag() {
            return this.constraintTag;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    public java.lang.String getSceneString() {
        int id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.mLayoutWidget.stringId == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.stringId = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.stringId = "parent";
            }
        }
        if (this.mLayoutWidget.getDebugName() == null) {
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
            constraintWidgetContainer.setDebugName(constraintWidgetContainer.stringId);
            android.util.Log.v(TAG, " setDebugName " + this.mLayoutWidget.getDebugName());
        }
        for (androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget : this.mLayoutWidget.getChildren()) {
            android.view.View view = (android.view.View) constraintWidget.getCompanionWidget();
            if (view != null) {
                if (constraintWidget.stringId == null && (id = view.getId()) != -1) {
                    constraintWidget.stringId = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.getDebugName() == null) {
                    constraintWidget.setDebugName(constraintWidget.stringId);
                    android.util.Log.v(TAG, " setDebugName " + constraintWidget.getDebugName());
                }
            }
        }
        this.mLayoutWidget.getSceneString(sb);
        return sb.toString();
    }
}
