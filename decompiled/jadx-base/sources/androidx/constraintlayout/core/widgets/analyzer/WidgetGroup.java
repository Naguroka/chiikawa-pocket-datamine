package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
public class WidgetGroup {
    private static final boolean DEBUG = false;
    static int count;
    int id;
    int orientation;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> widgets = new java.util.ArrayList<>();
    boolean authoritative = false;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup.MeasureResult> results = null;
    private int moveTo = -1;

    public WidgetGroup(int i) {
        int i2 = count;
        count = i2 + 1;
        this.id = i2;
        this.orientation = i;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public int getId() {
        return this.id;
    }

    public boolean add(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (this.widgets.contains(constraintWidget)) {
            return false;
        }
        this.widgets.add(constraintWidget);
        return true;
    }

    public void setAuthoritative(boolean z) {
        this.authoritative = z;
    }

    public boolean isAuthoritative() {
        return this.authoritative;
    }

    private java.lang.String getOrientationString() {
        int i = this.orientation;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        return i == 2 ? "Both" : "Unknown";
    }

    public java.lang.String toString() {
        java.lang.String str = getOrientationString() + " [" + this.id + "] <";
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.widgets.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().getDebugName();
        }
        return str + " >";
    }

    public void moveTo(int i, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup) {
        for (androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget : this.widgets) {
            widgetGroup.add(constraintWidget);
            if (i == 0) {
                constraintWidget.horizontalGroup = widgetGroup.getId();
            } else {
                constraintWidget.verticalGroup = widgetGroup.getId();
            }
        }
        this.moveTo = widgetGroup.id;
    }

    public void clear() {
        this.widgets.clear();
    }

    private int measureWrap(int i, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(i);
        if (dimensionBehaviour != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && dimensionBehaviour != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
            return -1;
        }
        if (i == 0) {
            return constraintWidget.getWidth();
        }
        return constraintWidget.getHeight();
    }

    public int measureWrap(androidx.constraintlayout.core.LinearSystem linearSystem, int i) {
        if (this.widgets.size() == 0) {
            return 0;
        }
        return solverMeasure(linearSystem, this.widgets, i);
    }

    private int solverMeasure(androidx.constraintlayout.core.LinearSystem linearSystem, java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> arrayList, int i) {
        int objectVariableValue;
        int objectVariableValue2;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) arrayList.get(0).getParent();
        linearSystem.reset();
        constraintWidgetContainer.addToSolver(linearSystem, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).addToSolver(linearSystem, false);
        }
        if (i == 0 && constraintWidgetContainer.mHorizontalChainsSize > 0) {
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i == 1 && constraintWidgetContainer.mVerticalChainsSize > 0) {
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.minimize();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        this.results = new java.util.ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.results.add(new androidx.constraintlayout.core.widgets.analyzer.WidgetGroup.MeasureResult(arrayList.get(i3), linearSystem, i));
        }
        if (i == 0) {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mLeft);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mRight);
            linearSystem.reset();
        } else {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mTop);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mBottom);
            linearSystem.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void apply() {
        if (this.results != null && this.authoritative) {
            for (int i = 0; i < this.results.size(); i++) {
                this.results.get(i).apply();
            }
        }
    }

    public boolean intersectWith(androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup) {
        for (int i = 0; i < this.widgets.size(); i++) {
            if (widgetGroup.contains(this.widgets.get(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean contains(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        return this.widgets.contains(constraintWidget);
    }

    public int size() {
        return this.widgets.size();
    }

    public void cleanup(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList) {
        int size = this.widgets.size();
        if (this.moveTo != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup = arrayList.get(i);
                if (this.moveTo == widgetGroup.id) {
                    moveTo(this.orientation, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    class MeasureResult {
        int baseline;
        int bottom;
        int left;
        int orientation;
        int right;
        int top;
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintWidget> widgetRef;

        public MeasureResult(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.LinearSystem linearSystem, int i) {
            this.widgetRef = new java.lang.ref.WeakReference<>(constraintWidget);
            this.left = linearSystem.getObjectVariableValue(constraintWidget.mLeft);
            this.top = linearSystem.getObjectVariableValue(constraintWidget.mTop);
            this.right = linearSystem.getObjectVariableValue(constraintWidget.mRight);
            this.bottom = linearSystem.getObjectVariableValue(constraintWidget.mBottom);
            this.baseline = linearSystem.getObjectVariableValue(constraintWidget.mBaseline);
            this.orientation = i;
        }

        public void apply() {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.widgetRef.get();
            if (constraintWidget != null) {
                constraintWidget.setFinalFrame(this.left, this.top, this.right, this.bottom, this.baseline, this.orientation);
            }
        }
    }
}
