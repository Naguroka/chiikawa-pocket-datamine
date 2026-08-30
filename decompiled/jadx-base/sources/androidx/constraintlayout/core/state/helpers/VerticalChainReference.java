package androidx.constraintlayout.core.state.helpers;

/* JADX INFO: loaded from: classes.dex */
public class VerticalChainReference extends androidx.constraintlayout.core.state.helpers.ChainReference {
    public VerticalChainReference(androidx.constraintlayout.core.state.State state) {
        super(state, androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        java.util.Iterator<java.lang.Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mState.constraints(it.next()).clearVertical();
        }
        java.util.Iterator<java.lang.Object> it2 = this.mReferences.iterator();
        androidx.constraintlayout.core.state.ConstraintReference constraintReference = null;
        androidx.constraintlayout.core.state.ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.ConstraintReference constraintReferenceConstraints = this.mState.constraints(it2.next());
            if (constraintReference2 == null) {
                if (this.mTopToTop != null) {
                    constraintReferenceConstraints.topToTop(this.mTopToTop).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else if (this.mTopToBottom != null) {
                    constraintReferenceConstraints.topToBottom(this.mTopToBottom).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else {
                    constraintReferenceConstraints.topToTop(androidx.constraintlayout.core.state.State.PARENT);
                }
                constraintReference2 = constraintReferenceConstraints;
            }
            if (constraintReference != null) {
                constraintReference.bottomToTop(constraintReferenceConstraints.getKey());
                constraintReferenceConstraints.topToBottom(constraintReference.getKey());
            }
            constraintReference = constraintReferenceConstraints;
        }
        if (constraintReference != null) {
            if (this.mBottomToTop != null) {
                constraintReference.bottomToTop(this.mBottomToTop).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else if (this.mBottomToBottom != null) {
                constraintReference.bottomToBottom(this.mBottomToBottom).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else {
                constraintReference.bottomToBottom(androidx.constraintlayout.core.state.State.PARENT);
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        if (this.mBias != 0.5f) {
            constraintReference2.verticalBias(this.mBias);
        }
        int i = androidx.constraintlayout.core.state.helpers.VerticalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()];
        if (i == 1) {
            constraintReference2.setVerticalChainStyle(0);
        } else if (i == 2) {
            constraintReference2.setVerticalChainStyle(1);
        } else {
            if (i != 3) {
                return;
            }
            constraintReference2.setVerticalChainStyle(2);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.state.State.Chain.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Chain = iArr;
            try {
                iArr[androidx.constraintlayout.core.state.State.Chain.SPREAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[androidx.constraintlayout.core.state.State.Chain.PACKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}
