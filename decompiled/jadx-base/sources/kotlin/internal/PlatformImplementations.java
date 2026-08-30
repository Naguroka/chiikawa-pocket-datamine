package kotlin.internal;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "getSuppressed", "", "ReflectThrowable", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class PlatformImplementations {

    /* JADX INFO: compiled from: PlatformImplementations.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "()V", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ReflectThrowable {
        public static final kotlin.internal.PlatformImplementations.ReflectThrowable INSTANCE = new kotlin.internal.PlatformImplementations.ReflectThrowable();
        public static final java.lang.reflect.Method addSuppressed;
        public static final java.lang.reflect.Method getSuppressed;

        private ReflectThrowable() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x003b  */
        static {
            java.lang.reflect.Method method;
            java.lang.reflect.Method method2;
            boolean z;
            java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
            kotlin.jvm.internal.Intrinsics.checkNotNull(methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                    java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.ArraysKt.singleOrNull(parameterTypes), java.lang.Throwable.class)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    break;
                } else {
                    i++;
                }
            }
            addSuppressed = method2;
            for (java.lang.reflect.Method method3 : methods) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            getSuppressed = method;
        }
    }

    public void addSuppressed(java.lang.Throwable cause, java.lang.Throwable exception) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        java.lang.reflect.Method method = kotlin.internal.PlatformImplementations.ReflectThrowable.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public java.util.List<java.lang.Throwable> getSuppressed(java.lang.Throwable exception) {
        java.lang.Object objInvoke;
        java.util.List<java.lang.Throwable> listAsList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        java.lang.reflect.Method method = kotlin.internal.PlatformImplementations.ReflectThrowable.getSuppressed;
        return (method == null || (objInvoke = method.invoke(exception, new java.lang.Object[0])) == null || (listAsList = kotlin.collections.ArraysKt.asList((java.lang.Throwable[]) objInvoke)) == null) ? kotlin.collections.CollectionsKt.emptyList() : listAsList;
    }

    public kotlin.text.MatchGroup getMatchResultNamedGroup(java.util.regex.MatchResult matchResult, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        throw new java.lang.UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public kotlin.random.Random defaultPlatformRandom() {
        return new kotlin.random.FallbackThreadLocalRandom();
    }
}
