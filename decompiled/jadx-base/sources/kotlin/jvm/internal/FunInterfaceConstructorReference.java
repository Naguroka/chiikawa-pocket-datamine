package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class FunInterfaceConstructorReference extends kotlin.jvm.internal.FunctionReference implements java.io.Serializable {
    private final java.lang.Class funInterface;

    public FunInterfaceConstructorReference(java.lang.Class cls) {
        super(1);
        this.funInterface = cls;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kotlin.jvm.internal.FunInterfaceConstructorReference) {
            return this.funInterface.equals(((kotlin.jvm.internal.FunInterfaceConstructorReference) obj).funInterface);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.funInterface.hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public java.lang.String toString() {
        return "fun interface " + this.funInterface.getName();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    public kotlin.reflect.KFunction getReflected() {
        throw new java.lang.UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
