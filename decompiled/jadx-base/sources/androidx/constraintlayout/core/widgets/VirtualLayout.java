package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class VirtualLayout extends androidx.constraintlayout.core.widgets.HelperWidget {
    private int mPaddingTop = 0;
    private int mPaddingBottom = 0;
    private int mPaddingLeft = 0;
    private int mPaddingRight = 0;
    private int mPaddingStart = 0;
    private int mPaddingEnd = 0;
    private int mResolvedPaddingLeft = 0;
    private int mResolvedPaddingRight = 0;
    private boolean mNeedsCallFromSolver = false;
    private int mMeasuredWidth = 0;
    private int mMeasuredHeight = 0;
    protected androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer mMeasurer = null;

    public void measure(int i, int i2, int i3, int i4) {
    }

    public void setPadding(int i) {
        this.mPaddingLeft = i;
        this.mPaddingTop = i;
        this.mPaddingRight = i;
        this.mPaddingBottom = i;
        this.mPaddingStart = i;
        this.mPaddingEnd = i;
    }

    public void setPaddingStart(int i) {
        this.mPaddingStart = i;
        this.mResolvedPaddingLeft = i;
        this.mResolvedPaddingRight = i;
    }

    public void setPaddingEnd(int i) {
        this.mPaddingEnd = i;
    }

    public void setPaddingLeft(int i) {
        this.mPaddingLeft = i;
        this.mResolvedPaddingLeft = i;
    }

    public void applyRtl(boolean z) {
        int i = this.mPaddingStart;
        if (i > 0 || this.mPaddingEnd > 0) {
            if (z) {
                this.mResolvedPaddingLeft = this.mPaddingEnd;
                this.mResolvedPaddingRight = i;
            } else {
                this.mResolvedPaddingLeft = i;
                this.mResolvedPaddingRight = this.mPaddingEnd;
            }
        }
    }

    public void setPaddingTop(int i) {
        this.mPaddingTop = i;
    }

    public void setPaddingRight(int i) {
        this.mPaddingRight = i;
        this.mResolvedPaddingRight = i;
    }

    public void setPaddingBottom(int i) {
        this.mPaddingBottom = i;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingLeft() {
        return this.mResolvedPaddingLeft;
    }

    public int getPaddingRight() {
        return this.mResolvedPaddingRight;
    }

    protected void needsCallbackFromSolver(boolean z) {
        this.mNeedsCallFromSolver = z;
    }

    public boolean needSolverPass() {
        return this.mNeedsCallFromSolver;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        captureWidgets();
    }

    public void captureWidgets() {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[i];
            if (constraintWidget != null) {
                constraintWidget.setInVirtualLayout(true);
            }
        }
    }

    public int getMeasuredWidth() {
        return this.mMeasuredWidth;
    }

    public int getMeasuredHeight() {
        return this.mMeasuredHeight;
    }

    public void setMeasure(int i, int i2) {
        this.mMeasuredWidth = i;
        this.mMeasuredHeight = i2;
    }

    protected boolean measureChildren() {
        androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer = this.mParent != null ? ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) this.mParent).getMeasurer() : null;
        if (measurer == null) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= this.mWidgetsCount) {
                return true;
            }
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[i];
            if (constraintWidget != null && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(0);
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.getDimensionBehaviour(1);
                if (!(dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth != 1 && dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight != 1)) {
                    if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        dimensionBehaviour = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        dimensionBehaviour2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    this.mMeasure.horizontalBehavior = dimensionBehaviour;
                    this.mMeasure.verticalBehavior = dimensionBehaviour2;
                    this.mMeasure.horizontalDimension = constraintWidget.getWidth();
                    this.mMeasure.verticalDimension = constraintWidget.getHeight();
                    measurer.measure(constraintWidget, this.mMeasure);
                    constraintWidget.setWidth(this.mMeasure.measuredWidth);
                    constraintWidget.setHeight(this.mMeasure.measuredHeight);
                    constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
                }
            }
            i++;
        }
    }

    protected void measure(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        while (this.mMeasurer == null && getParent() != null) {
            this.mMeasurer = ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) getParent()).getMeasurer();
        }
        this.mMeasure.horizontalBehavior = dimensionBehaviour;
        this.mMeasure.verticalBehavior = dimensionBehaviour2;
        this.mMeasure.horizontalDimension = i;
        this.mMeasure.verticalDimension = i2;
        this.mMeasurer.measure(constraintWidget, this.mMeasure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }

    public boolean contains(java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> hashSet) {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            if (hashSet.contains(this.mWidgets[i])) {
                return true;
            }
        }
        return false;
    }
}
