package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class WidgetContainer extends androidx.constraintlayout.core.widgets.ConstraintWidget {
    public java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> mChildren;

    public WidgetContainer() {
        this.mChildren = new java.util.ArrayList<>();
    }

    public WidgetContainer(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.mChildren = new java.util.ArrayList<>();
    }

    public WidgetContainer(int i, int i2) {
        super(i, i2);
        this.mChildren = new java.util.ArrayList<>();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void reset() {
        this.mChildren.clear();
        super.reset();
    }

    public void add(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        this.mChildren.add(constraintWidget);
        if (constraintWidget.getParent() != null) {
            ((androidx.constraintlayout.core.widgets.WidgetContainer) constraintWidget.getParent()).remove(constraintWidget);
        }
        constraintWidget.setParent(this);
    }

    public void add(androidx.constraintlayout.core.widgets.ConstraintWidget... constraintWidgetArr) {
        for (androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget : constraintWidgetArr) {
            add(constraintWidget);
        }
    }

    public void remove(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        this.mChildren.remove(constraintWidget);
        constraintWidget.reset();
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> getChildren() {
        return this.mChildren;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidgetContainer getRootConstraintContainer() {
        androidx.constraintlayout.core.widgets.ConstraintWidget parent = getParent();
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer ? (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) this : null;
        while (parent != null) {
            androidx.constraintlayout.core.widgets.ConstraintWidget parent2 = parent.getParent();
            if (parent instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) {
                constraintWidgetContainer = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) parent;
            }
            parent = parent2;
        }
        return constraintWidgetContainer;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void setOffset(int i, int i2) {
        super.setOffset(i, i2);
        int size = this.mChildren.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.mChildren.get(i3).setOffset(getRootX(), getRootY());
        }
    }

    public void layout() {
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> arrayList = this.mChildren;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.WidgetContainer) {
                ((androidx.constraintlayout.core.widgets.WidgetContainer) constraintWidget).layout();
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void resetSolverVariables(androidx.constraintlayout.core.Cache cache) {
        super.resetSolverVariables(cache);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            this.mChildren.get(i).resetSolverVariables(cache);
        }
    }

    public void removeAllChildren() {
        this.mChildren.clear();
    }
}
