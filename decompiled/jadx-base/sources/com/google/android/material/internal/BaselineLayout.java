package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class BaselineLayout extends android.view.ViewGroup {
    private int baseline;

    public BaselineLayout(android.content.Context context) {
        super(context, null, 0);
        this.baseline = -1;
    }

    public BaselineLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.baseline = -1;
    }

    public BaselineLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.baseline = -1;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        int iMax3 = -1;
        int iMax4 = -1;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    iMax3 = java.lang.Math.max(iMax3, baseline);
                    iMax4 = java.lang.Math.max(iMax4, childAt.getMeasuredHeight() - baseline);
                }
                iMax2 = java.lang.Math.max(iMax2, childAt.getMeasuredWidth());
                iMax = java.lang.Math.max(iMax, childAt.getMeasuredHeight());
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        if (iMax3 != -1) {
            iMax = java.lang.Math.max(iMax, java.lang.Math.max(iMax4, getPaddingBottom()) + iMax3);
            this.baseline = iMax3;
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(iMax2, getSuggestedMinimumWidth()), i, iCombineMeasuredStates), android.view.View.resolveSizeAndState(java.lang.Math.max(iMax, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.baseline == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.baseline + paddingTop) - childAt.getBaseline();
                childAt.layout(i6, baseline, measuredWidth + i6, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.baseline;
    }
}
