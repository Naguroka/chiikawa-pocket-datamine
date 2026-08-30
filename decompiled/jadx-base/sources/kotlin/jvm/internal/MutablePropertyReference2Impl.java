package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class MutablePropertyReference2Impl extends kotlin.jvm.internal.MutablePropertyReference2 {
    public MutablePropertyReference2Impl(kotlin.reflect.KDeclarationContainer kDeclarationContainer, java.lang.String str, java.lang.String str2) {
        super(((kotlin.jvm.internal.ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof kotlin.reflect.KClass) ? 1 : 0);
    }

    public MutablePropertyReference2Impl(java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(cls, str, str2, i);
    }

    @Override // kotlin.reflect.KProperty2
    public java.lang.Object get(java.lang.Object obj, java.lang.Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @Override // kotlin.reflect.KMutableProperty2
    public void set(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }
}
