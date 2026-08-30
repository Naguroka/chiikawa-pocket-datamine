package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "()V", "cache", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "notOnJava9", "buildCache", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getModuleName", "", "Cache", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ModuleNameRetriever {
    private static kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache cache;
    public static final kotlin.coroutines.jvm.internal.ModuleNameRetriever INSTANCE = new kotlin.coroutines.jvm.internal.ModuleNameRetriever();
    private static final kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache notOnJava9 = new kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache(null, null, null);

    /* JADX INFO: compiled from: DebugMetadata.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "getModuleMethod", "Ljava/lang/reflect/Method;", "getDescriptorMethod", "nameMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Cache {
        public final java.lang.reflect.Method getDescriptorMethod;
        public final java.lang.reflect.Method getModuleMethod;
        public final java.lang.reflect.Method nameMethod;

        public Cache(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
            this.getModuleMethod = method;
            this.getDescriptorMethod = method2;
            this.nameMethod = method3;
        }
    }

    private ModuleNameRetriever() {
    }

    public final java.lang.String getModuleName(kotlin.coroutines.jvm.internal.BaseContinuationImpl continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache cacheBuildCache = cache;
        if (cacheBuildCache == null) {
            cacheBuildCache = buildCache(continuation);
        }
        if (cacheBuildCache == notOnJava9) {
            return null;
        }
        java.lang.reflect.Method method = cacheBuildCache.getModuleMethod;
        java.lang.Object objInvoke = method != null ? method.invoke(continuation.getClass(), new java.lang.Object[0]) : null;
        if (objInvoke == null) {
            return null;
        }
        java.lang.reflect.Method method2 = cacheBuildCache.getDescriptorMethod;
        java.lang.Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new java.lang.Object[0]) : null;
        if (objInvoke2 == null) {
            return null;
        }
        java.lang.reflect.Method method3 = cacheBuildCache.nameMethod;
        java.lang.Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new java.lang.Object[0]) : null;
        if (objInvoke3 instanceof java.lang.String) {
            return (java.lang.String) objInvoke3;
        }
        return null;
    }

    private final kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache buildCache(kotlin.coroutines.jvm.internal.BaseContinuationImpl continuation) {
        try {
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache cache2 = new kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache(java.lang.Class.class.getDeclaredMethod("getModule", new java.lang.Class[0]), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new java.lang.Class[0]), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new java.lang.Class[0]));
            cache = cache2;
            return cache2;
        } catch (java.lang.Exception unused) {
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache cache3 = notOnJava9;
            cache = cache3;
            return cache3;
        }
    }
}
