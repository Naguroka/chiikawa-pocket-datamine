package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MutablePropertyReference1 extends kotlin.jvm.internal.MutablePropertyReference implements kotlin.reflect.KMutableProperty1 {
    public MutablePropertyReference1() {
    }

    public MutablePropertyReference1(java.lang.Object obj) {
        super(obj);
    }

    public MutablePropertyReference1(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.KCallable computeReflected() {
        return kotlin.jvm.internal.Reflection.mutableProperty1(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.KProperty
    public kotlin.reflect.KProperty1.Getter getGetter() {
        return ((kotlin.reflect.KMutableProperty1) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty
    public kotlin.reflect.KMutableProperty1.Setter getSetter() {
        return ((kotlin.reflect.KMutableProperty1) getReflected()).getSetter();
    }

    @Override // kotlin.reflect.KProperty1
    public java.lang.Object getDelegate(java.lang.Object obj) {
        return ((kotlin.reflect.KMutableProperty1) getReflected()).getDelegate(obj);
    }
}
