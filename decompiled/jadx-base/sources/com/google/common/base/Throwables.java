package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Throwables {
    private static final java.lang.String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";
    static final java.lang.String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";

    @javax.annotation.CheckForNull
    private static final java.lang.reflect.Method getStackTraceDepthMethod;

    @javax.annotation.CheckForNull
    private static final java.lang.reflect.Method getStackTraceElementMethod;

    @javax.annotation.CheckForNull
    private static final java.lang.Object jla;

    private Throwables() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <X extends java.lang.Throwable> void throwIfInstanceOf(java.lang.Throwable throwable, java.lang.Class<X> declaredType) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(throwable);
        if (declaredType.isInstance(throwable)) {
            throw declaredType.cast(throwable);
        }
    }

    @java.lang.Deprecated
    public static <X extends java.lang.Throwable> void propagateIfInstanceOf(@javax.annotation.CheckForNull java.lang.Throwable throwable, java.lang.Class<X> declaredType) throws java.lang.Throwable {
        if (throwable != null) {
            throwIfInstanceOf(throwable, declaredType);
        }
    }

    public static void throwIfUnchecked(java.lang.Throwable throwable) {
        com.google.common.base.Preconditions.checkNotNull(throwable);
        if (throwable instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) throwable);
        }
        if (throwable instanceof java.lang.Error) {
            throw ((java.lang.Error) throwable);
        }
    }

    @java.lang.Deprecated
    public static void propagateIfPossible(@javax.annotation.CheckForNull java.lang.Throwable throwable) {
        if (throwable != null) {
            throwIfUnchecked(throwable);
        }
    }

    public static <X extends java.lang.Throwable> void propagateIfPossible(@javax.annotation.CheckForNull java.lang.Throwable throwable, java.lang.Class<X> declaredType) throws java.lang.Throwable {
        propagateIfInstanceOf(throwable, declaredType);
        propagateIfPossible(throwable);
    }

    public static <X1 extends java.lang.Throwable, X2 extends java.lang.Throwable> void propagateIfPossible(@javax.annotation.CheckForNull java.lang.Throwable throwable, java.lang.Class<X1> declaredType1, java.lang.Class<X2> declaredType2) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(declaredType2);
        propagateIfInstanceOf(throwable, declaredType1);
        propagateIfPossible(throwable, declaredType2);
    }

    @java.lang.Deprecated
    public static java.lang.RuntimeException propagate(java.lang.Throwable throwable) {
        throwIfUnchecked(throwable);
        throw new java.lang.RuntimeException(throwable);
    }

    public static java.lang.Throwable getRootCause(java.lang.Throwable throwable) {
        boolean z = false;
        java.lang.Throwable cause = throwable;
        while (true) {
            java.lang.Throwable cause2 = throwable.getCause();
            if (cause2 == null) {
                return throwable;
            }
            if (cause2 == cause) {
                throw new java.lang.IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
            throwable = cause2;
        }
    }

    public static java.util.List<java.lang.Throwable> getCausalChain(java.lang.Throwable throwable) {
        com.google.common.base.Preconditions.checkNotNull(throwable);
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(throwable);
        boolean z = false;
        java.lang.Throwable cause = throwable;
        while (true) {
            throwable = throwable.getCause();
            if (throwable != null) {
                arrayList.add(throwable);
                if (throwable == cause) {
                    throw new java.lang.IllegalArgumentException("Loop in causal chain detected.", throwable);
                }
                if (z) {
                    cause = cause.getCause();
                }
                z = !z;
            } else {
                return java.util.Collections.unmodifiableList(arrayList);
            }
        }
    }

    @javax.annotation.CheckForNull
    public static <X extends java.lang.Throwable> X getCauseAs(java.lang.Throwable throwable, java.lang.Class<X> expectedCauseType) {
        try {
            return expectedCauseType.cast(throwable.getCause());
        } catch (java.lang.ClassCastException e) {
            e.initCause(throwable);
            throw e;
        }
    }

    public static java.lang.String getStackTraceAsString(java.lang.Throwable throwable) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        throwable.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @java.lang.Deprecated
    public static java.util.List<java.lang.StackTraceElement> lazyStackTrace(java.lang.Throwable throwable) {
        if (lazyStackTraceIsLazy()) {
            return jlaStackTrace(throwable);
        }
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(throwable.getStackTrace()));
    }

    @java.lang.Deprecated
    public static boolean lazyStackTraceIsLazy() {
        return (getStackTraceElementMethod == null || getStackTraceDepthMethod == null) ? false : true;
    }

    private static java.util.List<java.lang.StackTraceElement> jlaStackTrace(final java.lang.Throwable t) {
        com.google.common.base.Preconditions.checkNotNull(t);
        return new java.util.AbstractList<java.lang.StackTraceElement>() { // from class: com.google.common.base.Throwables.1
            @Override // java.util.AbstractList, java.util.List
            public java.lang.StackTraceElement get(int n) {
                return (java.lang.StackTraceElement) com.google.common.base.Throwables.invokeAccessibleNonThrowingMethod((java.lang.reflect.Method) java.util.Objects.requireNonNull(com.google.common.base.Throwables.getStackTraceElementMethod), java.util.Objects.requireNonNull(com.google.common.base.Throwables.jla), t, java.lang.Integer.valueOf(n));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return ((java.lang.Integer) com.google.common.base.Throwables.invokeAccessibleNonThrowingMethod((java.lang.reflect.Method) java.util.Objects.requireNonNull(com.google.common.base.Throwables.getStackTraceDepthMethod), java.util.Objects.requireNonNull(com.google.common.base.Throwables.jla), t)).intValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object invokeAccessibleNonThrowingMethod(java.lang.reflect.Method method, java.lang.Object receiver, java.lang.Object... params) {
        try {
            return method.invoke(receiver, params);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw propagate(e2.getCause());
        }
    }

    static {
        java.lang.Object jla2 = getJLA();
        jla = jla2;
        getStackTraceElementMethod = jla2 == null ? null : getGetMethod();
        getStackTraceDepthMethod = jla2 != null ? getSizeMethod(jla2) : null;
    }

    @javax.annotation.CheckForNull
    private static java.lang.Object getJLA() {
        try {
            return java.lang.Class.forName(SHARED_SECRETS_CLASSNAME, false, null).getMethod("getJavaLangAccess", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @javax.annotation.CheckForNull
    private static java.lang.reflect.Method getGetMethod() {
        return getJlaMethod("getStackTraceElement", java.lang.Throwable.class, java.lang.Integer.TYPE);
    }

    @javax.annotation.CheckForNull
    private static java.lang.reflect.Method getSizeMethod(java.lang.Object jla2) {
        try {
            java.lang.reflect.Method jlaMethod = getJlaMethod("getStackTraceDepth", java.lang.Throwable.class);
            if (jlaMethod == null) {
                return null;
            }
            jlaMethod.invoke(jla2, new java.lang.Throwable());
            return jlaMethod;
        } catch (java.lang.IllegalAccessException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    @javax.annotation.CheckForNull
    private static java.lang.reflect.Method getJlaMethod(java.lang.String name, java.lang.Class<?>... parameterTypes) throws java.lang.ThreadDeath {
        try {
            return java.lang.Class.forName(JAVA_LANG_ACCESS_CLASSNAME, false, null).getMethod(name, parameterTypes);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
