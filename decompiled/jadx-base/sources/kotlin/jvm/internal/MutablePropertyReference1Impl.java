package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class MutablePropertyReference1Impl extends kotlin.jvm.internal.MutablePropertyReference1 {
    public MutablePropertyReference1Impl(kotlin.reflect.KDeclarationContainer kDeclarationContainer, java.lang.String str, java.lang.String str2) {
        super(NO_RECEIVER, ((kotlin.jvm.internal.ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof kotlin.reflect.KClass) ? 1 : 0);
    }

    public MutablePropertyReference1Impl(java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.reflect.KProperty1
    public java.lang.Object get(java.lang.Object obj) {
        return getGetter().call(obj);
    }

    @Override // kotlin.reflect.KMutableProperty1
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        getSetter().call(obj, obj2);
    }
}
