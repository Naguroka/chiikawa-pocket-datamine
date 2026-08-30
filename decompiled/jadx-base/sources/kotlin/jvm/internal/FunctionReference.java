package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class FunctionReference extends kotlin.jvm.internal.CallableReference implements kotlin.jvm.internal.FunctionBase, kotlin.reflect.KFunction {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, NO_RECEIVER, null, null, null, 0);
    }

    public FunctionReference(int i, java.lang.Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public FunctionReference(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.KFunction getReflected() {
        return (kotlin.reflect.KFunction) super.getReflected();
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.KCallable computeReflected() {
        return kotlin.jvm.internal.Reflection.function(this);
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kotlin.jvm.internal.FunctionReference) {
            kotlin.jvm.internal.FunctionReference functionReference = (kotlin.jvm.internal.FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && kotlin.jvm.internal.Intrinsics.areEqual(getBoundReceiver(), functionReference.getBoundReceiver()) && kotlin.jvm.internal.Intrinsics.areEqual(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof kotlin.reflect.KFunction) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public java.lang.String toString() {
        kotlin.reflect.KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        return "<init>".equals(getName()) ? "constructor (Kotlin reflection is not available)" : "function " + getName() + " (Kotlin reflection is not available)";
    }
}
