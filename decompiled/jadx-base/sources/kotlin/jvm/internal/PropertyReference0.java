package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public abstract class PropertyReference0 extends kotlin.jvm.internal.PropertyReference implements kotlin.reflect.KProperty0 {
    public PropertyReference0() {
    }

    public PropertyReference0(java.lang.Object obj) {
        super(obj);
    }

    public PropertyReference0(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.KCallable computeReflected() {
        return kotlin.jvm.internal.Reflection.property0(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    public kotlin.reflect.KProperty0.Getter getGetter() {
        return ((kotlin.reflect.KProperty0) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KProperty0
    public java.lang.Object getDelegate() {
        return ((kotlin.reflect.KProperty0) getReflected()).getDelegate();
    }
}
