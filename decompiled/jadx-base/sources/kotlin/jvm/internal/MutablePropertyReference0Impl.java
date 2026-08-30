package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class MutablePropertyReference0Impl extends kotlin.jvm.internal.MutablePropertyReference0 {
    public MutablePropertyReference0Impl(kotlin.reflect.KDeclarationContainer kDeclarationContainer, java.lang.String str, java.lang.String str2) {
        super(NO_RECEIVER, ((kotlin.jvm.internal.ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof kotlin.reflect.KClass) ? 1 : 0);
    }

    public MutablePropertyReference0Impl(java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference0Impl(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public java.lang.Object get() {
        return getGetter().call(new java.lang.Object[0]);
    }

    public void set(java.lang.Object obj) {
        getSetter().call(obj);
    }
}
