package androidx.constraintlayout.core.state.helpers;

/* JADX INFO: loaded from: classes.dex */
public class AlignVerticallyReference extends androidx.constraintlayout.core.state.HelperReference {
    private float mBias;

    public AlignVerticallyReference(androidx.constraintlayout.core.state.State state) {
        super(state, androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY);
        this.mBias = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        java.util.Iterator<java.lang.Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.ConstraintReference constraintReferenceConstraints = this.mState.constraints(it.next());
            constraintReferenceConstraints.clearVertical();
            if (this.mTopToTop != null) {
                constraintReferenceConstraints.topToTop(this.mTopToTop);
            } else if (this.mTopToBottom != null) {
                constraintReferenceConstraints.topToBottom(this.mTopToBottom);
            } else {
                constraintReferenceConstraints.topToTop(androidx.constraintlayout.core.state.State.PARENT);
            }
            if (this.mBottomToTop != null) {
                constraintReferenceConstraints.bottomToTop(this.mBottomToTop);
            } else if (this.mBottomToBottom != null) {
                constraintReferenceConstraints.bottomToBottom(this.mBottomToBottom);
            } else {
                constraintReferenceConstraints.bottomToBottom(androidx.constraintlayout.core.state.State.PARENT);
            }
            float f = this.mBias;
            if (f != 0.5f) {
                constraintReferenceConstraints.verticalBias(f);
            }
        }
    }
}
