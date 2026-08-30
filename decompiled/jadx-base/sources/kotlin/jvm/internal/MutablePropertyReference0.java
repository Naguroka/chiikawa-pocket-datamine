package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MutablePropertyReference0 extends kotlin.jvm.internal.MutablePropertyReference implements kotlin.reflect.KMutableProperty0 {
    public MutablePropertyReference0() {
    }

    public MutablePropertyReference0(java.lang.Object obj) {
        super(obj);
    }

    public MutablePropertyReference0(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.KCallable computeReflected() {
        return kotlin.jvm.internal.Reflection.mutableProperty0(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    public kotlin.reflect.KProperty0.Getter getGetter() {
        return ((kotlin.reflect.KMutableProperty0) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty
    public kotlin.reflect.KMutableProperty0.Setter getSetter() {
        return ((kotlin.reflect.KMutableProperty0) getReflected()).getSetter();
    }

    @Override // kotlin.reflect.KProperty0
    public java.lang.Object getDelegate() {
        return ((kotlin.reflect.KMutableProperty0) getReflected()).getDelegate();
    }
}
