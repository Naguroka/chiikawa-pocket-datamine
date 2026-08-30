package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CallableReference implements kotlin.reflect.KCallable, java.io.Serializable {
    public static final java.lang.Object NO_RECEIVER = kotlin.jvm.internal.CallableReference.NoReceiver.INSTANCE;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private transient kotlin.reflect.KCallable reflected;
    private final java.lang.String signature;

    protected abstract kotlin.reflect.KCallable computeReflected();

    private static class NoReceiver implements java.io.Serializable {
        private static final kotlin.jvm.internal.CallableReference.NoReceiver INSTANCE = new kotlin.jvm.internal.CallableReference.NoReceiver();

        private NoReceiver() {
        }

        private java.lang.Object readResolve() throws java.io.ObjectStreamException {
            return INSTANCE;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    protected CallableReference(java.lang.Object obj) {
        this(obj, null, null, null, false);
    }

    protected CallableReference(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public java.lang.Object getBoundReceiver() {
        return this.receiver;
    }

    public kotlin.reflect.KCallable compute() {
        kotlin.reflect.KCallable kCallable = this.reflected;
        if (kCallable != null) {
            return kCallable;
        }
        kotlin.reflect.KCallable kCallableComputeReflected = computeReflected();
        this.reflected = kCallableComputeReflected;
        return kCallableComputeReflected;
    }

    protected kotlin.reflect.KCallable getReflected() {
        kotlin.reflect.KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute;
        }
        throw new kotlin.jvm.KotlinReflectionNotSupportedError();
    }

    public kotlin.reflect.KDeclarationContainer getOwner() {
        java.lang.Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? kotlin.jvm.internal.Reflection.getOrCreateKotlinPackage(cls) : kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cls);
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.KCallable
    public java.util.List<kotlin.reflect.KParameter> getParameters() {
        return getReflected().getParameters();
    }

    @Override // kotlin.reflect.KCallable
    public kotlin.reflect.KType getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // kotlin.reflect.KCallable
    public java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.Object call(java.lang.Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.Object callBy(java.util.Map map) {
        return getReflected().callBy(map);
    }

    @Override // kotlin.reflect.KCallable
    public kotlin.reflect.KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
