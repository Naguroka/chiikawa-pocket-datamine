package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidgetContainer extends androidx.constraintlayout.core.widgets.WidgetContainer {
    private static final boolean DEBUG = false;
    static final boolean DEBUG_GRAPH = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final int MAX_ITERATIONS = 8;
    static int myCounter;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> horizontalWrapMax;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> horizontalWrapMin;
    androidx.constraintlayout.core.widgets.analyzer.BasicMeasure mBasicMeasureSolver;
    int mDebugSolverPassCount;
    public androidx.constraintlayout.core.widgets.analyzer.DependencyGraph mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    private boolean mHeightMeasuredTooSmall;
    androidx.constraintlayout.core.widgets.ChainHead[] mHorizontalChainsArray;
    public int mHorizontalChainsSize;
    public boolean mHorizontalWrapOptimized;
    private boolean mIsRtl;
    public androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure;
    protected androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    public androidx.constraintlayout.core.Metrics mMetrics;
    private int mOptimizationLevel;
    int mPaddingBottom;
    int mPaddingLeft;
    int mPaddingRight;
    int mPaddingTop;
    public boolean mSkipSolver;
    protected androidx.constraintlayout.core.LinearSystem mSystem;
    androidx.constraintlayout.core.widgets.ChainHead[] mVerticalChainsArray;
    public int mVerticalChainsSize;
    public boolean mVerticalWrapOptimized;
    private boolean mWidthMeasuredTooSmall;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;
    private int pass;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> verticalWrapMax;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> verticalWrapMin;
    java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> widgetsToAdd;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public java.lang.String getType() {
        return "ConstraintLayout";
    }

    public boolean handlesInternalConstraints() {
        return false;
    }

    public void invalidateGraph() {
        this.mDependencyGraph.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.mDependencyGraph.invalidateMeasures();
    }

    public boolean directMeasure(boolean z) {
        return this.mDependencyGraph.directMeasure(z);
    }

    public boolean directMeasureSetup(boolean z) {
        return this.mDependencyGraph.directMeasureSetup(z);
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        return this.mDependencyGraph.directMeasureWithOrientation(z, i);
    }

    public void defineTerminalWidgets() {
        this.mDependencyGraph.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
    }

    public long measure(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.mPaddingLeft = i8;
        this.mPaddingTop = i9;
        return this.mBasicMeasureSolver.solverMeasure(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public void updateHierarchy() {
        this.mBasicMeasureSolver.updateHierarchy(this);
    }

    public void setMeasurer(androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
        this.mDependencyGraph.setMeasurer(measurer);
    }

    public androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer getMeasurer() {
        return this.mMeasurer;
    }

    public void fillMetrics(androidx.constraintlayout.core.Metrics metrics) {
        this.mMetrics = metrics;
        this.mSystem.fillMetrics(metrics);
    }

    public ConstraintWidgetContainer() {
        this.mBasicMeasureSolver = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new androidx.constraintlayout.core.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mHorizontalChainsArray = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 257;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
        this.verticalWrapMin = null;
        this.horizontalWrapMin = null;
        this.verticalWrapMax = null;
        this.horizontalWrapMax = null;
        this.widgetsToAdd = new java.util.HashSet<>();
        this.mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    }

    public ConstraintWidgetContainer(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.mBasicMeasureSolver = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new androidx.constraintlayout.core.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mHorizontalChainsArray = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 257;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
        this.verticalWrapMin = null;
        this.horizontalWrapMin = null;
        this.verticalWrapMax = null;
        this.horizontalWrapMax = null;
        this.widgetsToAdd = new java.util.HashSet<>();
        this.mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    }

    public ConstraintWidgetContainer(int i, int i2) {
        super(i, i2);
        this.mBasicMeasureSolver = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new androidx.constraintlayout.core.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mHorizontalChainsArray = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 257;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
        this.verticalWrapMin = null;
        this.horizontalWrapMin = null;
        this.verticalWrapMax = null;
        this.horizontalWrapMax = null;
        this.widgetsToAdd = new java.util.HashSet<>();
        this.mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    }

    public ConstraintWidgetContainer(java.lang.String str, int i, int i2) {
        super(i, i2);
        this.mBasicMeasureSolver = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new androidx.constraintlayout.core.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mHorizontalChainsArray = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 257;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
        this.verticalWrapMin = null;
        this.horizontalWrapMin = null;
        this.verticalWrapMax = null;
        this.horizontalWrapMax = null;
        this.widgetsToAdd = new java.util.HashSet<>();
        this.mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
        setDebugName(str);
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        androidx.constraintlayout.core.LinearSystem.USE_DEPENDENCY_ORDERING = optimizeFor(512);
    }

    public int getOptimizationLevel() {
        return this.mOptimizationLevel;
    }

    public boolean optimizeFor(int i) {
        return (this.mOptimizationLevel & i) == i;
    }

    @Override // androidx.constraintlayout.core.widgets.WidgetContainer, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void reset() {
        this.mSystem.reset();
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        this.mSkipSolver = false;
        super.reset();
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.mWidthMeasuredTooSmall;
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.mHeightMeasuredTooSmall;
    }

    void addVerticalWrapMinVariable(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference = this.verticalWrapMin;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.verticalWrapMin.get().getFinalValue()) {
            this.verticalWrapMin = new java.lang.ref.WeakReference<>(constraintAnchor);
        }
    }

    public void addHorizontalWrapMinVariable(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference = this.horizontalWrapMin;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.horizontalWrapMin.get().getFinalValue()) {
            this.horizontalWrapMin = new java.lang.ref.WeakReference<>(constraintAnchor);
        }
    }

    void addVerticalWrapMaxVariable(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference = this.verticalWrapMax;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.verticalWrapMax.get().getFinalValue()) {
            this.verticalWrapMax = new java.lang.ref.WeakReference<>(constraintAnchor);
        }
    }

    public void addHorizontalWrapMaxVariable(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference = this.horizontalWrapMax;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.horizontalWrapMax.get().getFinalValue()) {
            this.horizontalWrapMax = new java.lang.ref.WeakReference<>(constraintAnchor);
        }
    }

    private void addMinWrap(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.SolverVariable solverVariable) {
        this.mSystem.addGreaterThan(this.mSystem.createObjectVariable(constraintAnchor), solverVariable, 0, 5);
    }

    private void addMaxWrap(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.SolverVariable solverVariable) {
        this.mSystem.addGreaterThan(solverVariable, this.mSystem.createObjectVariable(constraintAnchor), 0, 5);
    }

    public boolean addChildrenToSolver(androidx.constraintlayout.core.LinearSystem linearSystem) {
        boolean zOptimizeFor = optimizeFor(64);
        addToSolver(linearSystem, zOptimizeFor);
        int size = this.mChildren.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            constraintWidget.setInBarrier(0, false);
            constraintWidget.setInBarrier(1, false);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.mChildren.get(i2);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    ((androidx.constraintlayout.core.widgets.Barrier) constraintWidget2).markWidgets();
                }
            }
        }
        this.widgetsToAdd.clear();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.mChildren.get(i3);
            if (constraintWidget3.addFirst()) {
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                    this.widgetsToAdd.add(constraintWidget3);
                } else {
                    constraintWidget3.addToSolver(linearSystem, zOptimizeFor);
                }
            }
        }
        while (this.widgetsToAdd.size() > 0) {
            int size2 = this.widgetsToAdd.size();
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.widgetsToAdd.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout = (androidx.constraintlayout.core.widgets.VirtualLayout) it.next();
                if (virtualLayout.contains(this.widgetsToAdd)) {
                    virtualLayout.addToSolver(linearSystem, zOptimizeFor);
                    this.widgetsToAdd.remove(virtualLayout);
                    break;
                }
            }
            if (size2 == this.widgetsToAdd.size()) {
                java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it2 = this.widgetsToAdd.iterator();
                while (it2.hasNext()) {
                    it2.next().addToSolver(linearSystem, zOptimizeFor);
                }
                this.widgetsToAdd.clear();
            }
        }
        if (androidx.constraintlayout.core.LinearSystem.USE_DEPENDENCY_ORDERING) {
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> hashSet = new java.util.HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = this.mChildren.get(i4);
                if (!constraintWidget4.addFirst()) {
                    hashSet.add(constraintWidget4);
                }
            }
            addChildrenToSolverByDependency(this, linearSystem, hashSet, getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 : hashSet) {
                androidx.constraintlayout.core.widgets.Optimizer.checkMatchParent(this, linearSystem, constraintWidget5);
                constraintWidget5.addToSolver(linearSystem, zOptimizeFor);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = this.mChildren.get(i5);
                if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget6.mListDimensionBehaviors[0];
                    androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget6.mListDimensionBehaviors[1];
                    if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget6.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget6.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.addToSolver(linearSystem, zOptimizeFor);
                    if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget6.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget6.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    }
                } else {
                    androidx.constraintlayout.core.widgets.Optimizer.checkMatchParent(this, linearSystem, constraintWidget6);
                    if (!constraintWidget6.addFirst()) {
                        constraintWidget6.addToSolver(linearSystem, zOptimizeFor);
                    }
                }
            }
        }
        if (this.mHorizontalChainsSize > 0) {
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(this, linearSystem, null, 0);
        }
        if (this.mVerticalChainsSize > 0) {
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(this, linearSystem, null, 1);
        }
        return true;
    }

    public boolean updateChildrenFromSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean[] zArr) {
        zArr[2] = false;
        boolean zOptimizeFor = optimizeFor(64);
        updateFromSolver(linearSystem, zOptimizeFor);
        int size = this.mChildren.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            constraintWidget.updateFromSolver(linearSystem, zOptimizeFor);
            if (constraintWidget.hasDimensionOverride()) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromRuns(boolean z, boolean z2) {
        super.updateFromRuns(z, z2);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            this.mChildren.get(i).updateFromRuns(z, z2);
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.mPaddingLeft = i;
        this.mPaddingTop = i2;
        this.mPaddingRight = i3;
        this.mPaddingBottom = i4;
    }

    public void setRtl(boolean z) {
        this.mIsRtl = z;
    }

    public boolean isRtl() {
        return this.mIsRtl;
    }

    public static boolean measure(int i, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure measure, int i2) {
        int i3;
        int i4;
        if (measurer == null) {
            return false;
        }
        if (constraintWidget.getVisibility() == 8 || (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier)) {
            measure.measuredWidth = 0;
            measure.measuredHeight = 0;
            return false;
        }
        measure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        measure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        measure.horizontalDimension = constraintWidget.getWidth();
        measure.verticalDimension = constraintWidget.getHeight();
        measure.measuredNeedsSolverPass = false;
        measure.measureStrategy = i2;
        boolean z = measure.horizontalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = measure.verticalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z3 = z && constraintWidget.mDimensionRatio > 0.0f;
        boolean z4 = z2 && constraintWidget.mDimensionRatio > 0.0f;
        if (z && constraintWidget.hasDanglingDimension(0) && constraintWidget.mMatchConstraintDefaultWidth == 0 && !z3) {
            measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.hasDanglingDimension(1) && constraintWidget.mMatchConstraintDefaultHeight == 0 && !z4) {
            measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.isResolvedHorizontally()) {
            measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.isResolvedVertically()) {
            measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
                measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                if (measure.verticalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                    i4 = measure.verticalDimension;
                } else {
                    measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    measurer.measure(constraintWidget, measure);
                    i4 = measure.measuredHeight;
                }
                measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                measure.horizontalDimension = (int) (constraintWidget.getDimensionRatio() * i4);
            }
        }
        if (z4) {
            if (constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
                measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                if (measure.horizontalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                    i3 = measure.horizontalDimension;
                } else {
                    measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    measurer.measure(constraintWidget, measure);
                    i3 = measure.measuredWidth;
                }
                measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                if (constraintWidget.getDimensionRatioSide() == -1) {
                    measure.verticalDimension = (int) (i3 / constraintWidget.getDimensionRatio());
                } else {
                    measure.verticalDimension = (int) (constraintWidget.getDimensionRatio() * i3);
                }
            }
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(measure.measuredWidth);
        constraintWidget.setHeight(measure.measuredHeight);
        constraintWidget.setHasBaseline(measure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(measure.measuredBaseline);
        measure.measureStrategy = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS;
        return measure.measuredNeedsSolverPass;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0329 A[PHI: r13 r16
  0x0329: PHI (r13v8 ??) = (r13v7 ??), (r13v10 ??), (r13v10 ??), (r13v10 ??) binds: [B:147:0x02e8, B:155:0x030f, B:156:0x0311, B:158:0x0317] A[DONT_GENERATE, DONT_INLINE]
  0x0329: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:147:0x02e8, B:155:0x030f, B:156:0x0311, B:158:0x0317] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.constraintlayout.core.widgets.WidgetContainer
    public void layout() {
        int i;
        int i2;
        boolean z;
        boolean zUpdateChildrenFromSolver;
        boolean z2;
        ?? r13;
        ?? r6;
        ?? r14;
        boolean z3;
        int i3;
        ?? r15;
        ?? r16;
        int i4 = 0;
        this.mX = 0;
        this.mY = 0;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        int size = this.mChildren.size();
        int iMax = java.lang.Math.max(0, getWidth());
        int iMax2 = java.lang.Math.max(0, getHeight());
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mListDimensionBehaviors[1];
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mListDimensionBehaviors[0];
        androidx.constraintlayout.core.Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.layouts++;
        }
        if (this.pass == 0 && androidx.constraintlayout.core.widgets.Optimizer.enabled(this.mOptimizationLevel, 1)) {
            androidx.constraintlayout.core.widgets.analyzer.Direct.solvingPass(this, getMeasurer());
            for (int i5 = 0; i5 < size; i5++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i5);
                if (constraintWidget.isMeasureRequested() && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout) && !constraintWidget.isInVirtualLayout()) {
                    if (!(constraintWidget.getDimensionBehaviour(0) == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth != 1 && constraintWidget.getDimensionBehaviour(1) == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight != 1)) {
                        measure(0, constraintWidget, this.mMeasurer, new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure(), androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                    }
                }
            }
        }
        if (size <= 2 || !((dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && androidx.constraintlayout.core.widgets.Optimizer.enabled(this.mOptimizationLevel, 1024) && androidx.constraintlayout.core.widgets.analyzer.Grouping.simpleSolvingPass(this, getMeasurer()))) {
            i = iMax2;
            i2 = iMax;
            z = false;
        } else {
            if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (iMax < getWidth() && iMax > 0) {
                    setWidth(iMax);
                    this.mWidthMeasuredTooSmall = true;
                } else {
                    iMax = getWidth();
                }
            }
            if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (iMax2 < getHeight() && iMax2 > 0) {
                    setHeight(iMax2);
                    this.mHeightMeasuredTooSmall = true;
                } else {
                    iMax2 = getHeight();
                }
            }
            i = iMax2;
            i2 = iMax;
            z = true;
        }
        boolean z4 = optimizeFor(64) || optimizeFor(128);
        this.mSystem.graphOptimizer = false;
        this.mSystem.newgraphOptimizer = false;
        if (this.mOptimizationLevel != 0 && z4) {
            this.mSystem.newgraphOptimizer = true;
        }
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> arrayList = this.mChildren;
        boolean z5 = getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        resetChains();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.mChildren.get(i6);
            if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.WidgetContainer) {
                ((androidx.constraintlayout.core.widgets.WidgetContainer) constraintWidget2).layout();
            }
        }
        boolean zOptimizeFor = optimizeFor(64);
        ?? r17 = z;
        int i7 = 0;
        boolean zAddChildrenToSolver = true;
        while (zAddChildrenToSolver) {
            int i8 = i7 + 1;
            try {
                this.mSystem.reset();
                resetChains();
                createObjectVariables(this.mSystem);
                for (int i9 = i4; i9 < size; i9++) {
                    this.mChildren.get(i9).createObjectVariables(this.mSystem);
                }
                zAddChildrenToSolver = addChildrenToSolver(this.mSystem);
                java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference = this.verticalWrapMin;
                if (weakReference != null && weakReference.get() != null) {
                    addMinWrap(this.verticalWrapMin.get(), this.mSystem.createObjectVariable(this.mTop));
                    this.verticalWrapMin = null;
                }
                java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference2 = this.verticalWrapMax;
                if (weakReference2 != null && weakReference2.get() != null) {
                    addMaxWrap(this.verticalWrapMax.get(), this.mSystem.createObjectVariable(this.mBottom));
                    this.verticalWrapMax = null;
                }
                java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference3 = this.horizontalWrapMin;
                if (weakReference3 != null && weakReference3.get() != null) {
                    addMinWrap(this.horizontalWrapMin.get(), this.mSystem.createObjectVariable(this.mLeft));
                    this.horizontalWrapMin = null;
                }
                java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference4 = this.horizontalWrapMax;
                if (weakReference4 != null && weakReference4.get() != null) {
                    addMaxWrap(this.horizontalWrapMax.get(), this.mSystem.createObjectVariable(this.mRight));
                    this.horizontalWrapMax = null;
                }
                if (zAddChildrenToSolver) {
                    this.mSystem.minimize();
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                java.lang.System.out.println("EXCEPTION : " + e);
            }
            if (zAddChildrenToSolver) {
                zUpdateChildrenFromSolver = updateChildrenFromSolver(this.mSystem, androidx.constraintlayout.core.widgets.Optimizer.flags);
            } else {
                updateFromSolver(this.mSystem, zOptimizeFor);
                for (int i10 = 0; i10 < size; i10++) {
                    this.mChildren.get(i10).updateFromSolver(this.mSystem, zOptimizeFor);
                }
                zUpdateChildrenFromSolver = false;
            }
            if (z5 && i8 < 8 && androidx.constraintlayout.core.widgets.Optimizer.flags[2]) {
                int i11 = 0;
                int iMax3 = 0;
                int iMax4 = 0;
                while (i11 < size) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.mChildren.get(i11);
                    iMax4 = java.lang.Math.max(iMax4, constraintWidget3.mX + constraintWidget3.getWidth());
                    iMax3 = java.lang.Math.max(iMax3, constraintWidget3.mY + constraintWidget3.getHeight());
                    i11++;
                    zUpdateChildrenFromSolver = zUpdateChildrenFromSolver;
                }
                z2 = zUpdateChildrenFromSolver;
                int iMax5 = java.lang.Math.max(this.mMinWidth, iMax4);
                int iMax6 = java.lang.Math.max(this.mMinHeight, iMax3);
                r16 = r17;
                if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && getWidth() < iMax5) {
                    r16 = r17;
                    setWidth(iMax5);
                    this.mListDimensionBehaviors[0] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    r16 = 1;
                    z2 = true;
                }
                r16 = r17;
                r13 = r16;
                if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && getHeight() < iMax6) {
                    r13 = r16;
                    setHeight(iMax6);
                    this.mListDimensionBehaviors[1] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    r13 = 1;
                    z2 = true;
                }
            } else {
                z2 = zUpdateChildrenFromSolver;
                r13 = r17;
            }
            r13 = r16;
            int iMax7 = java.lang.Math.max(this.mMinWidth, getWidth());
            ?? r18 = r13;
            if (iMax7 > getWidth()) {
                setWidth(iMax7);
                this.mListDimensionBehaviors[0] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                r18 = 1;
                z2 = true;
            }
            int iMax8 = java.lang.Math.max(this.mMinHeight, getHeight());
            if (iMax8 > getHeight()) {
                setHeight(iMax8);
                r6 = 1;
                this.mListDimensionBehaviors[1] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                r14 = 1;
                z2 = true;
            } else {
                r6 = 1;
            }
            if (r14 == 0) {
                r14 = r18;
                if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && i2 > 0) {
                    r14 = r14;
                    if (getWidth() > i2) {
                        this.mWidthMeasuredTooSmall = r6;
                        this.mListDimensionBehaviors[0] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                        setWidth(i2);
                        ?? r19 = r6;
                        z2 = r19 == true ? 1 : 0;
                        r14 = r19;
                    }
                }
                r14 = r14;
                r14 = r14;
                if (this.mListDimensionBehaviors[r6] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || i <= 0 || getHeight() <= i) {
                    r14 = r18;
                    z3 = z2;
                    i3 = 8;
                    r15 = r14;
                } else {
                    this.mHeightMeasuredTooSmall = r6;
                    this.mListDimensionBehaviors[r6] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                    setHeight(i);
                    i3 = 8;
                    z3 = true;
                    r15 = 1;
                }
            } else {
                r14 = r18;
                z3 = z2;
                i3 = 8;
                r15 = r14;
            }
            zAddChildrenToSolver = i8 > i3 ? false : z3;
            i7 = i8;
            i4 = 0;
            r17 = r15;
        }
        this.mChildren = arrayList;
        if (r17 != 0) {
            this.mListDimensionBehaviors[0] = dimensionBehaviour2;
            this.mListDimensionBehaviors[1] = dimensionBehaviour;
        }
        resetSolverVariables(this.mSystem.getCache());
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.Guideline> getVerticalGuidelines() {
        java.util.ArrayList<androidx.constraintlayout.core.widgets.Guideline> arrayList = new java.util.ArrayList<>();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
                androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.Guideline> getHorizontalGuidelines() {
        java.util.ArrayList<androidx.constraintlayout.core.widgets.Guideline> arrayList = new java.util.ArrayList<>();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
                androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
                if (guideline.getOrientation() == 0) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public androidx.constraintlayout.core.LinearSystem getSystem() {
        return this.mSystem;
    }

    private void resetChains() {
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
    }

    void addChain(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            addHorizontalChain(constraintWidget);
        } else if (i == 1) {
            addVerticalChain(constraintWidget);
        }
    }

    private void addHorizontalChain(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        int i = this.mHorizontalChainsSize + 1;
        androidx.constraintlayout.core.widgets.ChainHead[] chainHeadArr = this.mHorizontalChainsArray;
        if (i >= chainHeadArr.length) {
            this.mHorizontalChainsArray = (androidx.constraintlayout.core.widgets.ChainHead[]) java.util.Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.mHorizontalChainsArray[this.mHorizontalChainsSize] = new androidx.constraintlayout.core.widgets.ChainHead(constraintWidget, 0, isRtl());
        this.mHorizontalChainsSize++;
    }

    private void addVerticalChain(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        int i = this.mVerticalChainsSize + 1;
        androidx.constraintlayout.core.widgets.ChainHead[] chainHeadArr = this.mVerticalChainsArray;
        if (i >= chainHeadArr.length) {
            this.mVerticalChainsArray = (androidx.constraintlayout.core.widgets.ChainHead[]) java.util.Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.mVerticalChainsArray[this.mVerticalChainsSize] = new androidx.constraintlayout.core.widgets.ChainHead(constraintWidget, 1, isRtl());
        this.mVerticalChainsSize++;
    }

    public void setPass(int i) {
        this.pass = i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void getSceneString(java.lang.StringBuilder sb) {
        sb.append(this.stringId + ":{\n");
        sb.append("  actualWidth:" + this.mWidth);
        sb.append("\n");
        sb.append("  actualHeight:" + this.mHeight);
        sb.append("\n");
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = getChildren().iterator();
        while (it.hasNext()) {
            it.next().getSceneString(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
