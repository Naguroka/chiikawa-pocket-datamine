package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer;
    private final java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> mVariableDimensionsWidgets = new java.util.ArrayList<>();
    private androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();

    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    public interface Measurer {
        void didMeasures();

        void measure(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure measure);
    }

    public void updateHierarchy(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        this.mVariableDimensionsWidgets.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i);
            if (constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.mVariableDimensionsWidgets.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }

    public BasicMeasure(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        this.constraintWidgetContainer = constraintWidgetContainer;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[PHI: r9
  0x00aa: PHI (r9v3 boolean) = (r9v2 boolean), (r9v2 boolean), (r9v2 boolean), (r9v5 boolean), (r9v5 boolean) binds: [B:33:0x0068, B:35:0x006e, B:37:0x0072, B:61:0x00a7, B:59:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    private void measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        boolean z;
        int size = constraintWidgetContainer.mChildren.size();
        boolean zOptimizeFor = constraintWidgetContainer.optimizeFor(64);
        androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer = constraintWidgetContainer.getMeasurer();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i);
            if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) && !constraintWidget.isInVirtualLayout() && (!zOptimizeFor || constraintWidget.horizontalRun == null || constraintWidget.verticalRun == null || !constraintWidget.horizontalRun.dimension.resolved || !constraintWidget.verticalRun.dimension.resolved)) {
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(0);
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.getDimensionBehaviour(1);
                boolean z2 = dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth != 1 && dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight != 1;
                if (!z2 && constraintWidgetContainer.optimizeFor(1) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                    if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0 && dimensionBehaviour2 != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && !constraintWidget.isInHorizontalChain()) {
                        z2 = true;
                    }
                    if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0 && dimensionBehaviour != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && !constraintWidget.isInHorizontalChain()) {
                        z2 = true;
                    }
                    z = (!(dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || constraintWidget.mDimensionRatio <= 0.0f) ? z2 : true;
                }
                if (!z) {
                    measure(measurer, constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                    if (constraintWidgetContainer.mMetrics != null) {
                        constraintWidgetContainer.mMetrics.measuredWidgets++;
                    }
                }
            }
        }
        measurer.didMeasures();
    }

    private void solveLinearSystem(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, java.lang.String str, int i, int i2, int i3) {
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i2);
        constraintWidgetContainer.setHeight(i3);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.constraintWidgetContainer.setPass(i);
        this.constraintWidgetContainer.layout();
    }

    public long solverMeasure(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zDirectMeasureWithOrientation;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer = constraintWidgetContainer.getMeasurer();
        int size = constraintWidgetContainer.mChildren.size();
        int width = constraintWidgetContainer.getWidth();
        int height = constraintWidgetContainer.getHeight();
        boolean zEnabled = androidx.constraintlayout.core.widgets.Optimizer.enabled(i, 128);
        boolean z3 = zEnabled || androidx.constraintlayout.core.widgets.Optimizer.enabled(i, 64);
        if (z3) {
            for (int i12 = 0; i12 < size; i12++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i12);
                boolean z4 = (constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.getDimensionRatio() > 0.0f;
                if ((constraintWidget.isInHorizontalChain() && z4) || ((constraintWidget.isInVerticalChain() && z4) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3 && androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
            androidx.constraintlayout.core.LinearSystem.sMetrics.measures++;
        }
        boolean z5 = z3 & ((i4 == 1073741824 && i6 == 1073741824) || zEnabled);
        int i13 = 2;
        if (z5) {
            int iMin = java.lang.Math.min(constraintWidgetContainer.getMaxWidth(), i5);
            int iMin2 = java.lang.Math.min(constraintWidgetContainer.getMaxHeight(), i7);
            if (i4 == 1073741824 && constraintWidgetContainer.getWidth() != iMin) {
                constraintWidgetContainer.setWidth(iMin);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i6 == 1073741824 && constraintWidgetContainer.getHeight() != iMin2) {
                constraintWidgetContainer.setHeight(iMin2);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zDirectMeasureWithOrientation = constraintWidgetContainer.directMeasure(zEnabled);
                i10 = 2;
            } else {
                boolean zDirectMeasureSetup = constraintWidgetContainer.directMeasureSetup(zEnabled);
                if (i4 == 1073741824) {
                    zDirectMeasureSetup &= constraintWidgetContainer.directMeasureWithOrientation(zEnabled, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    zDirectMeasureWithOrientation = constraintWidgetContainer.directMeasureWithOrientation(zEnabled, 1) & zDirectMeasureSetup;
                    i10++;
                } else {
                    zDirectMeasureWithOrientation = zDirectMeasureSetup;
                }
            }
            if (zDirectMeasureWithOrientation) {
                constraintWidgetContainer.updateFromRuns(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zDirectMeasureWithOrientation = false;
            i10 = 0;
        }
        if (zDirectMeasureWithOrientation && i10 == 2) {
            return 0L;
        }
        int optimizationLevel = constraintWidgetContainer.getOptimizationLevel();
        if (size > 0) {
            measureChildren(constraintWidgetContainer);
        }
        updateHierarchy(constraintWidgetContainer);
        int size2 = this.mVariableDimensionsWidgets.size();
        if (size > 0) {
            solveLinearSystem(constraintWidgetContainer, "First pass", 0, width, height);
        }
        if (size2 > 0) {
            boolean z6 = constraintWidgetContainer.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z7 = constraintWidgetContainer.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            int iMax = java.lang.Math.max(constraintWidgetContainer.getWidth(), this.constraintWidgetContainer.getMinWidth());
            int iMax2 = java.lang.Math.max(constraintWidgetContainer.getHeight(), this.constraintWidgetContainer.getMinHeight());
            int i14 = 0;
            boolean zNeedSolverPass = false;
            while (i14 < size2) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.mVariableDimensionsWidgets.get(i14);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                    int width2 = constraintWidget2.getWidth();
                    int height2 = constraintWidget2.getHeight();
                    boolean zMeasure = measure(measurer, constraintWidget2, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS) | zNeedSolverPass;
                    if (constraintWidgetContainer.mMetrics != null) {
                        constraintWidgetContainer.mMetrics.measuredMatchWidgets++;
                    }
                    int width3 = constraintWidget2.getWidth();
                    int height3 = constraintWidget2.getHeight();
                    if (width3 != width2) {
                        constraintWidget2.setWidth(width3);
                        if (z6 && constraintWidget2.getRight() > iMax) {
                            iMax = java.lang.Math.max(iMax, constraintWidget2.getRight() + constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).getMargin());
                        }
                        z2 = true;
                    } else {
                        z2 = zMeasure;
                    }
                    if (height3 != height2) {
                        constraintWidget2.setHeight(height3);
                        if (z7 && constraintWidget2.getBottom() > iMax2) {
                            iMax2 = java.lang.Math.max(iMax2, constraintWidget2.getBottom() + constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).getMargin());
                        }
                        z2 = true;
                    }
                    zNeedSolverPass = z2 | ((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget2).needSolverPass();
                } else {
                    width = width;
                }
                i14++;
                optimizationLevel = optimizationLevel;
                height = height;
                width = width;
                i13 = 2;
            }
            int i15 = optimizationLevel;
            int i16 = width;
            int i17 = height;
            int i18 = i13;
            int i19 = 0;
            while (i19 < i18) {
                int i20 = 0;
                while (i20 < size2) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.mVariableDimensionsWidgets.get(i20);
                    if (((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Helper) && !(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Guideline) || constraintWidget3.getVisibility() == 8 || ((z5 && constraintWidget3.horizontalRun.dimension.resolved && constraintWidget3.verticalRun.dimension.resolved) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.VirtualLayout))) {
                        z = z5;
                        size2 = size2;
                        measurer = measurer;
                    } else {
                        int width4 = constraintWidget3.getWidth();
                        int height4 = constraintWidget3.getHeight();
                        int baselineDistance = constraintWidget3.getBaselineDistance();
                        int i21 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS;
                        z = z5;
                        if (i19 == 1) {
                            i21 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS;
                        }
                        boolean zMeasure2 = measure(measurer, constraintWidget3, i21) | zNeedSolverPass;
                        if (constraintWidgetContainer.mMetrics != null) {
                            constraintWidgetContainer.mMetrics.measuredMatchWidgets++;
                        }
                        int width5 = constraintWidget3.getWidth();
                        int height5 = constraintWidget3.getHeight();
                        if (width5 != width4) {
                            constraintWidget3.setWidth(width5);
                            if (z6 && constraintWidget3.getRight() > iMax) {
                                iMax = java.lang.Math.max(iMax, constraintWidget3.getRight() + constraintWidget3.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).getMargin());
                            }
                            zMeasure2 = true;
                        }
                        if (height5 != height4) {
                            constraintWidget3.setHeight(height5);
                            if (z7 && constraintWidget3.getBottom() > iMax2) {
                                iMax2 = java.lang.Math.max(iMax2, constraintWidget3.getBottom() + constraintWidget3.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).getMargin());
                            }
                            zMeasure2 = true;
                        }
                        zNeedSolverPass = (!constraintWidget3.hasBaseline() || baselineDistance == constraintWidget3.getBaselineDistance()) ? zMeasure2 : true;
                    }
                    i20++;
                    measurer = measurer;
                    z5 = z;
                    size2 = size2;
                }
                boolean z8 = z5;
                int i22 = size2;
                androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer2 = measurer;
                if (!zNeedSolverPass) {
                    break;
                }
                i19++;
                solveLinearSystem(constraintWidgetContainer, "intermediate pass", i19, i16, i17);
                measurer = measurer2;
                z5 = z8;
                size2 = i22;
                i18 = 2;
                zNeedSolverPass = false;
            }
            i11 = i15;
        } else {
            i11 = optimizationLevel;
        }
        constraintWidgetContainer.setOptimizationLevel(i11);
        return 0L;
    }

    private boolean measure(androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
        this.mMeasure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = constraintWidget.getWidth();
        this.mMeasure.verticalDimension = constraintWidget.getHeight();
        this.mMeasure.measuredNeedsSolverPass = false;
        this.mMeasure.measureStrategy = i;
        boolean z = this.mMeasure.horizontalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = this.mMeasure.verticalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z3 = z && constraintWidget.mDimensionRatio > 0.0f;
        boolean z4 = z2 && constraintWidget.mDimensionRatio > 0.0f;
        if (z3 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            this.mMeasure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            this.mMeasure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, this.mMeasure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
        this.mMeasure.measureStrategy = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS;
        return this.mMeasure.measuredNeedsSolverPass;
    }
}
