package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class AdaptedFunctionReference implements kotlin.jvm.internal.FunctionBase, java.io.Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private final java.lang.String signature;

    public AdaptedFunctionReference(int i, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        this(i, kotlin.jvm.internal.CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public AdaptedFunctionReference(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public kotlin.reflect.KDeclarationContainer getOwner() {
        java.lang.Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? kotlin.jvm.internal.Reflection.getOrCreateKotlinPackage(cls) : kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cls);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.jvm.internal.AdaptedFunctionReference)) {
            return false;
        }
        kotlin.jvm.internal.AdaptedFunctionReference adaptedFunctionReference = (kotlin.jvm.internal.AdaptedFunctionReference) obj;
        return this.isTopLevel == adaptedFunctionReference.isTopLevel && this.arity == adaptedFunctionReference.arity && this.flags == adaptedFunctionReference.flags && kotlin.jvm.internal.Intrinsics.areEqual(this.receiver, adaptedFunctionReference.receiver) && kotlin.jvm.internal.Intrinsics.areEqual(this.owner, adaptedFunctionReference.owner) && this.name.equals(adaptedFunctionReference.name) && this.signature.equals(adaptedFunctionReference.signature);
    }

    public int hashCode() {
        java.lang.Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Class cls = this.owner;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public java.lang.String toString() {
        return kotlin.jvm.internal.Reflection.renderLambdaToString(this);
    }
}
