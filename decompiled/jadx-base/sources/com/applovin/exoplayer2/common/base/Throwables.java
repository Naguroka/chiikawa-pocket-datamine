package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public final class Throwables {
    private static final java.lang.String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";
    static final java.lang.String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";
    private static final java.lang.reflect.Method getStackTraceDepthMethod;
    private static final java.lang.reflect.Method getStackTraceElementMethod;
    private static final java.lang.Object jla;

    class a extends java.util.AbstractList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Throwable f550a;

        a(java.lang.Throwable th) {
            this.f550a = th;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return ((java.lang.Integer) com.applovin.exoplayer2.common.base.Throwables.invokeAccessibleNonThrowingMethod(com.applovin.exoplayer2.common.base.Throwables.getStackTraceDepthMethod, com.applovin.exoplayer2.common.base.Throwables.jla, this.f550a)).intValue();
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.StackTraceElement get(int i) {
            return (java.lang.StackTraceElement) com.applovin.exoplayer2.common.base.Throwables.invokeAccessibleNonThrowingMethod(com.applovin.exoplayer2.common.base.Throwables.getStackTraceElementMethod, com.applovin.exoplayer2.common.base.Throwables.jla, this.f550a, java.lang.Integer.valueOf(i));
        }
    }

    static {
        java.lang.Object jla2 = getJLA();
        jla = jla2;
        getStackTraceElementMethod = jla2 == null ? null : getGetMethod();
        getStackTraceDepthMethod = jla2 != null ? getSizeMethod() : null;
    }

    private Throwables() {
    }

    public static java.util.List<java.lang.Throwable> getCausalChain(java.lang.Throwable th) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(th);
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(th);
        boolean z = false;
        java.lang.Throwable cause = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return java.util.Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th == cause) {
                throw new java.lang.IllegalArgumentException("Loop in causal chain detected.", th);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
        }
    }

    public static <X extends java.lang.Throwable> X getCauseAs(java.lang.Throwable th, java.lang.Class<X> cls) {
        try {
            return cls.cast(th.getCause());
        } catch (java.lang.ClassCastException e) {
            e.initCause(th);
            throw e;
        }
    }

    private static java.lang.reflect.Method getGetMethod() {
        return getJlaMethod("getStackTraceElement", java.lang.Throwable.class, java.lang.Integer.TYPE);
    }

    private static java.lang.Object getJLA() {
        try {
            return java.lang.Class.forName(SHARED_SECRETS_CLASSNAME, false, null).getMethod("getJavaLangAccess", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method getJlaMethod(java.lang.String str, java.lang.Class<?>... clsArr) throws java.lang.ThreadDeath {
        try {
            return java.lang.Class.forName(JAVA_LANG_ACCESS_CLASSNAME, false, null).getMethod(str, clsArr);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Throwable getRootCause(java.lang.Throwable th) {
        boolean z = false;
        java.lang.Throwable cause = th;
        while (true) {
            java.lang.Throwable cause2 = th.getCause();
            if (cause2 == null) {
                return th;
            }
            if (cause2 == cause) {
                throw new java.lang.IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
            th = cause2;
        }
    }

    private static java.lang.reflect.Method getSizeMethod() {
        try {
            java.lang.reflect.Method jlaMethod = getJlaMethod("getStackTraceDepth", java.lang.Throwable.class);
            if (jlaMethod == null) {
                return null;
            }
            jlaMethod.invoke(getJLA(), new java.lang.Throwable());
            return jlaMethod;
        } catch (java.lang.IllegalAccessException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public static java.lang.String getStackTraceAsString(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object invokeAccessibleNonThrowingMethod(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw propagate(e2.getCause());
        }
    }

    private static java.util.List<java.lang.StackTraceElement> jlaStackTrace(java.lang.Throwable th) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(th);
        return new com.applovin.exoplayer2.common.base.Throwables.a(th);
    }

    public static java.util.List<java.lang.StackTraceElement> lazyStackTrace(java.lang.Throwable th) {
        return lazyStackTraceIsLazy() ? jlaStackTrace(th) : java.util.Collections.unmodifiableList(java.util.Arrays.asList(th.getStackTrace()));
    }

    public static boolean lazyStackTraceIsLazy() {
        return (getStackTraceElementMethod == null || getStackTraceDepthMethod == null) ? false : true;
    }

    @java.lang.Deprecated
    public static java.lang.RuntimeException propagate(java.lang.Throwable th) {
        throwIfUnchecked(th);
        throw new java.lang.RuntimeException(th);
    }

    @java.lang.Deprecated
    public static <X extends java.lang.Throwable> void propagateIfInstanceOf(java.lang.Throwable th, java.lang.Class<X> cls) throws java.lang.Throwable {
        if (th != null) {
            throwIfInstanceOf(th, cls);
        }
    }

    @java.lang.Deprecated
    public static void propagateIfPossible(java.lang.Throwable th) {
        if (th != null) {
            throwIfUnchecked(th);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <X extends java.lang.Throwable> void throwIfInstanceOf(java.lang.Throwable th, java.lang.Class<X> cls) throws java.lang.Throwable {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(th);
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    public static void throwIfUnchecked(java.lang.Throwable th) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(th);
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        }
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
    }

    public static <X extends java.lang.Throwable> void propagateIfPossible(java.lang.Throwable th, java.lang.Class<X> cls) throws java.lang.Throwable {
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th);
    }

    public static <X1 extends java.lang.Throwable, X2 extends java.lang.Throwable> void propagateIfPossible(java.lang.Throwable th, java.lang.Class<X1> cls, java.lang.Class<X2> cls2) throws java.lang.Throwable {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th, cls2);
    }
}
