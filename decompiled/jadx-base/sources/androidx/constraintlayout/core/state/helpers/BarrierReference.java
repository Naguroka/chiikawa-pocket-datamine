package androidx.constraintlayout.core.state.helpers;

/* JADX INFO: loaded from: classes.dex */
public class BarrierReference extends androidx.constraintlayout.core.state.HelperReference {
    private androidx.constraintlayout.core.widgets.Barrier mBarrierWidget;
    private androidx.constraintlayout.core.state.State.Direction mDirection;
    private int mMargin;

    public BarrierReference(androidx.constraintlayout.core.state.State state) {
        super(state, androidx.constraintlayout.core.state.State.Helper.BARRIER);
    }

    public void setBarrierDirection(androidx.constraintlayout.core.state.State.Direction direction) {
        this.mDirection = direction;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public androidx.constraintlayout.core.state.ConstraintReference margin(java.lang.Object obj) {
        margin(this.mState.convertDimension(obj));
        return this;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public androidx.constraintlayout.core.state.ConstraintReference margin(int i) {
        this.mMargin = i;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public androidx.constraintlayout.core.widgets.HelperWidget getHelperWidget() {
        if (this.mBarrierWidget == null) {
            this.mBarrierWidget = new androidx.constraintlayout.core.widgets.Barrier();
        }
        return this.mBarrierWidget;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        int i = androidx.constraintlayout.core.state.helpers.BarrierReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Direction[this.mDirection.ordinal()];
        int i2 = 3;
        if (i == 3 || i == 4) {
            i2 = 1;
        } else if (i == 5) {
            i2 = 2;
        } else if (i != 6) {
            i2 = 0;
        }
        this.mBarrierWidget.setBarrierType(i2);
        this.mBarrierWidget.setMargin(this.mMargin);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.BarrierReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Direction;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.state.State.Direction.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Direction = iArr;
            try {
                iArr[androidx.constraintlayout.core.state.State.Direction.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[androidx.constraintlayout.core.state.State.Direction.START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[androidx.constraintlayout.core.state.State.Direction.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[androidx.constraintlayout.core.state.State.Direction.END.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[androidx.constraintlayout.core.state.State.Direction.TOP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[androidx.constraintlayout.core.state.State.Direction.BOTTOM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }
}
