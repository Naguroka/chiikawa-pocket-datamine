package androidx.constraintlayout.core.state.helpers;

/* JADX INFO: loaded from: classes.dex */
public class ChainReference extends androidx.constraintlayout.core.state.HelperReference {
    protected float mBias;
    protected androidx.constraintlayout.core.state.State.Chain mStyle;

    public ChainReference(androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.State.Helper helper) {
        super(state, helper);
        this.mBias = 0.5f;
        this.mStyle = androidx.constraintlayout.core.state.State.Chain.SPREAD;
    }

    public androidx.constraintlayout.core.state.State.Chain getStyle() {
        return androidx.constraintlayout.core.state.State.Chain.SPREAD;
    }

    public androidx.constraintlayout.core.state.helpers.ChainReference style(androidx.constraintlayout.core.state.State.Chain chain) {
        this.mStyle = chain;
        return this;
    }

    public float getBias() {
        return this.mBias;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public androidx.constraintlayout.core.state.helpers.ChainReference bias(float f) {
        this.mBias = f;
        return this;
    }
}
