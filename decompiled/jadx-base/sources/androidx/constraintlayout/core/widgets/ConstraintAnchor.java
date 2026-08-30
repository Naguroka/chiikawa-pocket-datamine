package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {
    private static final boolean ALLOW_BINARY = false;
    private static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
    private int mFinalValue;
    private boolean mHasFinalValue;
    public final androidx.constraintlayout.core.widgets.ConstraintWidget mOwner;
    androidx.constraintlayout.core.SolverVariable mSolverVariable;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mTarget;
    public final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type mType;
    private java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> mDependents = null;
    public int mMargin = 0;
    int mGoneMargin = Integer.MIN_VALUE;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public void findDependents(int i, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup) {
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet = this.mDependents;
        if (hashSet != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.Grouping.findDependents(it.next().mOwner, i, arrayList, widgetGroup);
            }
        }
    }

    public java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> getDependents() {
        return this.mDependents;
    }

    public boolean hasDependents() {
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet = this.mDependents;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean hasCenteredDependents() {
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet = this.mDependents;
        if (hashSet == null) {
            return false;
        }
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().getOpposite().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public void setFinalValue(int i) {
        this.mFinalValue = i;
        this.mHasFinalValue = true;
    }

    public int getFinalValue() {
        if (this.mHasFinalValue) {
            return this.mFinalValue;
        }
        return 0;
    }

    public void resetFinalResolution() {
        this.mHasFinalValue = false;
        this.mFinalValue = 0;
    }

    public boolean hasFinalValue() {
        return this.mHasFinalValue;
    }

    public void copyFrom(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> map) {
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2 = this.mTarget;
        if (constraintAnchor2 != null && (hashSet = constraintAnchor2.mDependents) != null) {
            hashSet.remove(this);
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3 = constraintAnchor.mTarget;
        if (constraintAnchor3 != null) {
            this.mTarget = map.get(constraintAnchor.mTarget.mOwner).getAnchor(constraintAnchor3.getType());
        } else {
            this.mTarget = null;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4 = this.mTarget;
        if (constraintAnchor4 != null) {
            if (constraintAnchor4.mDependents == null) {
                constraintAnchor4.mDependents = new java.util.HashSet<>();
            }
            this.mTarget.mDependents.add(this);
        }
        this.mMargin = constraintAnchor.mMargin;
        this.mGoneMargin = constraintAnchor.mGoneMargin;
    }

    public ConstraintAnchor(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type) {
        this.mOwner = constraintWidget;
        this.mType = type;
    }

    public androidx.constraintlayout.core.SolverVariable getSolverVariable() {
        return this.mSolverVariable;
    }

    public void resetSolverVariable(androidx.constraintlayout.core.Cache cache) {
        androidx.constraintlayout.core.SolverVariable solverVariable = this.mSolverVariable;
        if (solverVariable == null) {
            this.mSolverVariable = new androidx.constraintlayout.core.SolverVariable(androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED, (java.lang.String) null);
        } else {
            solverVariable.reset();
        }
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getOwner() {
        return this.mOwner;
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor.Type getType() {
        return this.mType;
    }

    public int getMargin() {
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor;
        if (this.mOwner.getVisibility() == 8) {
            return 0;
        }
        if (this.mGoneMargin != Integer.MIN_VALUE && (constraintAnchor = this.mTarget) != null && constraintAnchor.mOwner.getVisibility() == 8) {
            return this.mGoneMargin;
        }
        return this.mMargin;
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor getTarget() {
        return this.mTarget;
    }

    public void reset() {
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mTarget;
        if (constraintAnchor != null && (hashSet = constraintAnchor.mDependents) != null) {
            hashSet.remove(this);
            if (this.mTarget.mDependents.size() == 0) {
                this.mTarget.mDependents = null;
            }
        }
        this.mDependents = null;
        this.mTarget = null;
        this.mMargin = 0;
        this.mGoneMargin = Integer.MIN_VALUE;
        this.mHasFinalValue = false;
        this.mFinalValue = 0;
    }

    public boolean connect(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            reset();
            return true;
        }
        if (!z && !isValidConnection(constraintAnchor)) {
            return false;
        }
        this.mTarget = constraintAnchor;
        if (constraintAnchor.mDependents == null) {
            constraintAnchor.mDependents = new java.util.HashSet<>();
        }
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet = this.mTarget.mDependents;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.mMargin = i;
        this.mGoneMargin = i2;
        return true;
    }

    public boolean connect(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, int i) {
        return connect(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    public boolean isConnected() {
        return this.mTarget != null;
    }

    public boolean isValidConnection(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type = constraintAnchor.getType();
        androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type2 = this.mType;
        if (type == type2) {
            return type2 != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE || (constraintAnchor.getOwner().hasBaseline() && getOwner().hasBaseline());
        }
        switch (androidx.constraintlayout.core.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1:
                return (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT;
                if (constraintAnchor.getOwner() instanceof androidx.constraintlayout.core.widgets.Guideline) {
                    return z || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM;
                if (constraintAnchor.getOwner() instanceof androidx.constraintlayout.core.widgets.Guideline) {
                    return z2 || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y;
                }
                return z2;
            case 6:
                return (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintAnchor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    public boolean isSideAnchor() {
        switch (androidx.constraintlayout.core.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    public boolean isSimilarDimensionConnection(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type = constraintAnchor.getType();
        if (type == this.mType) {
            return true;
        }
        switch (androidx.constraintlayout.core.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1:
                return type != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE;
            case 2:
            case 3:
            case 7:
                return type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE;
            case 9:
                return false;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    public void setMargin(int i) {
        if (isConnected()) {
            this.mMargin = i;
        }
    }

    public void setGoneMargin(int i) {
        if (isConnected()) {
            this.mGoneMargin = i;
        }
    }

    public boolean isVerticalAnchor() {
        switch (androidx.constraintlayout.core.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    public java.lang.String toString() {
        return this.mOwner.getDebugName() + ":" + this.mType.toString();
    }

    public boolean isConnectionAllowed(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        return isConnectionAllowed(constraintWidget);
    }

    public boolean isConnectionAllowed(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (isConnectionToMe(constraintWidget, new java.util.HashSet<>())) {
            return false;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget parent = getOwner().getParent();
        return parent == constraintWidget || constraintWidget.getParent() == parent;
    }

    private boolean isConnectionToMe(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> hashSet) {
        if (hashSet.contains(constraintWidget)) {
            return false;
        }
        hashSet.add(constraintWidget);
        if (constraintWidget == getOwner()) {
            return true;
        }
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> anchors = constraintWidget.getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = anchors.get(i);
            if (constraintAnchor.isSimilarDimensionConnection(this) && constraintAnchor.isConnected() && isConnectionToMe(constraintAnchor.getTarget().getOwner(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public final androidx.constraintlayout.core.widgets.ConstraintAnchor getOpposite() {
        switch (androidx.constraintlayout.core.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.mOwner.mRight;
            case 3:
                return this.mOwner.mLeft;
            case 4:
                return this.mOwner.mBottom;
            case 5:
                return this.mOwner.mTop;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }
}
