package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends androidx.constraintlayout.core.widgets.VirtualLayout {
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight() + 0;
        int paddingTop = getPaddingTop() + getPaddingBottom() + 0;
        if (this.mWidgetsCount > 0) {
            paddingLeft += this.mWidgets[0].getWidth();
            paddingTop += this.mWidgets[0].getHeight();
        }
        int iMax = java.lang.Math.max(getMinWidth(), paddingLeft);
        int iMax2 = java.lang.Math.max(getMinHeight(), paddingTop);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = java.lang.Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = java.lang.Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        setMeasure(i2, i4);
        setWidth(i2);
        setHeight(i4);
        needsCallbackFromSolver(this.mWidgetsCount > 0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z) {
        super.addToSolver(linearSystem, z);
        if (this.mWidgetsCount > 0) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[0];
            constraintWidget.resetAllConstraints();
            constraintWidget.connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
            constraintWidget.connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
            constraintWidget.connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
            constraintWidget.connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        }
    }
}
