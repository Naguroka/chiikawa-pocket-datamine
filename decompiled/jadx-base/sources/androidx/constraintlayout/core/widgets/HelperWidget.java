package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class HelperWidget extends androidx.constraintlayout.core.widgets.ConstraintWidget implements androidx.constraintlayout.core.widgets.Helper {
    public androidx.constraintlayout.core.widgets.ConstraintWidget[] mWidgets = new androidx.constraintlayout.core.widgets.ConstraintWidget[4];
    public int mWidgetsCount = 0;

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void add(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.mWidgetsCount + 1;
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        if (i > constraintWidgetArr.length) {
            this.mWidgets = (androidx.constraintlayout.core.widgets.ConstraintWidget[]) java.util.Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
        int i2 = this.mWidgetsCount;
        constraintWidgetArr2[i2] = constraintWidget;
        this.mWidgetsCount = i2 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        androidx.constraintlayout.core.widgets.HelperWidget helperWidget = (androidx.constraintlayout.core.widgets.HelperWidget) constraintWidget;
        this.mWidgetsCount = 0;
        int i = helperWidget.mWidgetsCount;
        for (int i2 = 0; i2 < i; i2++) {
            add(map.get(helperWidget.mWidgets[i2]));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void removeAllIds() {
        this.mWidgetsCount = 0;
        java.util.Arrays.fill(this.mWidgets, (java.lang.Object) null);
    }

    public void addDependents(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList, int i, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup) {
        for (int i2 = 0; i2 < this.mWidgetsCount; i2++) {
            widgetGroup.add(this.mWidgets[i2]);
        }
        for (int i3 = 0; i3 < this.mWidgetsCount; i3++) {
            androidx.constraintlayout.core.widgets.analyzer.Grouping.findDependents(this.mWidgets[i3], i, arrayList, widgetGroup);
        }
    }

    public int findGroupInDependents(int i) {
        for (int i2 = 0; i2 < this.mWidgetsCount; i2++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[i2];
            if (i == 0 && constraintWidget.horizontalGroup != -1) {
                return constraintWidget.horizontalGroup;
            }
            if (i == 1 && constraintWidget.verticalGroup != -1) {
                return constraintWidget.verticalGroup;
            }
        }
        return -1;
    }
}
