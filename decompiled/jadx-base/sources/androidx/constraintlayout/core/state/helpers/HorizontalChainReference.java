package androidx.constraintlayout.core.state.helpers;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalChainReference extends androidx.constraintlayout.core.state.helpers.ChainReference {
    public HorizontalChainReference(androidx.constraintlayout.core.state.State state) {
        super(state, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        java.util.Iterator<java.lang.Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mState.constraints(it.next()).clearHorizontal();
        }
        java.util.Iterator<java.lang.Object> it2 = this.mReferences.iterator();
        androidx.constraintlayout.core.state.ConstraintReference constraintReference = null;
        androidx.constraintlayout.core.state.ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.ConstraintReference constraintReferenceConstraints = this.mState.constraints(it2.next());
            if (constraintReference2 == null) {
                if (this.mStartToStart != null) {
                    constraintReferenceConstraints.startToStart(this.mStartToStart).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                } else if (this.mStartToEnd != null) {
                    constraintReferenceConstraints.startToEnd(this.mStartToEnd).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                } else if (this.mLeftToLeft != null) {
                    constraintReferenceConstraints.startToStart(this.mLeftToLeft).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                } else if (this.mLeftToRight != null) {
                    constraintReferenceConstraints.startToEnd(this.mLeftToRight).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                } else {
                    constraintReferenceConstraints.startToStart(androidx.constraintlayout.core.state.State.PARENT);
                }
                constraintReference2 = constraintReferenceConstraints;
            }
            if (constraintReference != null) {
                constraintReference.endToStart(constraintReferenceConstraints.getKey());
                constraintReferenceConstraints.startToEnd(constraintReference.getKey());
            }
            constraintReference = constraintReferenceConstraints;
        }
        if (constraintReference != null) {
            if (this.mEndToStart != null) {
                constraintReference.endToStart(this.mEndToStart).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            } else if (this.mEndToEnd != null) {
                constraintReference.endToEnd(this.mEndToEnd).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            } else if (this.mRightToLeft != null) {
                constraintReference.endToStart(this.mRightToLeft).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
            } else if (this.mRightToRight != null) {
                constraintReference.endToEnd(this.mRightToRight).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
            } else {
                constraintReference.endToEnd(androidx.constraintlayout.core.state.State.PARENT);
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        if (this.mBias != 0.5f) {
            constraintReference2.horizontalBias(this.mBias);
        }
        int i = androidx.constraintlayout.core.state.helpers.HorizontalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()];
        if (i == 1) {
            constraintReference2.setHorizontalChainStyle(0);
        } else if (i == 2) {
            constraintReference2.setHorizontalChainStyle(1);
        } else {
            if (i != 3) {
                return;
            }
            constraintReference2.setHorizontalChainStyle(2);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1, reason: invalid class name */
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
