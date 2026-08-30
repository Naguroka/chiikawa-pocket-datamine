package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class PropertyReference0Impl extends kotlin.jvm.internal.PropertyReference0 {
    public PropertyReference0Impl(kotlin.reflect.KDeclarationContainer kDeclarationContainer, java.lang.String str, java.lang.String str2) {
        super(NO_RECEIVER, ((kotlin.jvm.internal.ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof kotlin.reflect.KClass) ? 1 : 0);
    }

    public PropertyReference0Impl(java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference0Impl(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.reflect.KProperty0
    public java.lang.Object get() {
        return getGetter().call(new java.lang.Object[0]);
    }
}
