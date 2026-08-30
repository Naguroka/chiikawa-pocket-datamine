package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class Closer implements java.io.Closeable {
    private static final com.google.common.io.Closer.Suppressor SUPPRESSOR;
    private final java.util.Deque<java.io.Closeable> stack = new java.util.ArrayDeque(4);
    final com.google.common.io.Closer.Suppressor suppressor;

    @javax.annotation.CheckForNull
    private java.lang.Throwable thrown;

    interface Suppressor {
        void suppress(java.io.Closeable closeable, java.lang.Throwable thrown, java.lang.Throwable suppressed);
    }

    static {
        com.google.common.io.Closer.Suppressor suppressorTryCreate = com.google.common.io.Closer.SuppressingSuppressor.tryCreate();
        if (suppressorTryCreate == null) {
            suppressorTryCreate = com.google.common.io.Closer.LoggingSuppressor.INSTANCE;
        }
        SUPPRESSOR = suppressorTryCreate;
    }

    public static com.google.common.io.Closer create() {
        return new com.google.common.io.Closer(SUPPRESSOR);
    }

    Closer(com.google.common.io.Closer.Suppressor suppressor) {
        this.suppressor = (com.google.common.io.Closer.Suppressor) com.google.common.base.Preconditions.checkNotNull(suppressor);
    }

    @com.google.common.io.ParametricNullness
    public <C extends java.io.Closeable> C register(@com.google.common.io.ParametricNullness C closeable) {
        if (closeable != null) {
            this.stack.addFirst(closeable);
        }
        return closeable;
    }

    public java.lang.RuntimeException rethrow(java.lang.Throwable e) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(e);
        this.thrown = e;
        com.google.common.base.Throwables.propagateIfPossible(e, java.io.IOException.class);
        throw new java.lang.RuntimeException(e);
    }

    public <X extends java.lang.Exception> java.lang.RuntimeException rethrow(java.lang.Throwable e, java.lang.Class<X> declaredType) throws java.lang.Exception {
        com.google.common.base.Preconditions.checkNotNull(e);
        this.thrown = e;
        com.google.common.base.Throwables.propagateIfPossible(e, java.io.IOException.class);
        com.google.common.base.Throwables.propagateIfPossible(e, declaredType);
        throw new java.lang.RuntimeException(e);
    }

    public <X1 extends java.lang.Exception, X2 extends java.lang.Exception> java.lang.RuntimeException rethrow(java.lang.Throwable e, java.lang.Class<X1> declaredType1, java.lang.Class<X2> declaredType2) throws java.lang.Exception {
        com.google.common.base.Preconditions.checkNotNull(e);
        this.thrown = e;
        com.google.common.base.Throwables.propagateIfPossible(e, java.io.IOException.class);
        com.google.common.base.Throwables.propagateIfPossible(e, declaredType1, declaredType2);
        throw new java.lang.RuntimeException(e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        java.lang.Throwable th = this.thrown;
        while (!this.stack.isEmpty()) {
            java.io.Closeable closeableRemoveFirst = this.stack.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (java.lang.Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.suppressor.suppress(closeableRemoveFirst, th, th2);
                }
            }
        }
        if (this.thrown != null || th == null) {
            return;
        }
        com.google.common.base.Throwables.propagateIfPossible(th, java.io.IOException.class);
        throw new java.lang.AssertionError(th);
    }

    static final class LoggingSuppressor implements com.google.common.io.Closer.Suppressor {
        static final com.google.common.io.Closer.LoggingSuppressor INSTANCE = new com.google.common.io.Closer.LoggingSuppressor();

        LoggingSuppressor() {
        }

        @Override // com.google.common.io.Closer.Suppressor
        public void suppress(java.io.Closeable closeable, java.lang.Throwable thrown, java.lang.Throwable suppressed) {
            com.google.common.io.Closeables.logger.log(java.util.logging.Level.WARNING, "Suppressing exception thrown when closing " + closeable, suppressed);
        }
    }

    static final class SuppressingSuppressor implements com.google.common.io.Closer.Suppressor {
        private final java.lang.reflect.Method addSuppressed;

        @javax.annotation.CheckForNull
        static com.google.common.io.Closer.SuppressingSuppressor tryCreate() {
            try {
                return new com.google.common.io.Closer.SuppressingSuppressor(java.lang.Throwable.class.getMethod("addSuppressed", java.lang.Throwable.class));
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }

        private SuppressingSuppressor(java.lang.reflect.Method addSuppressed) {
            this.addSuppressed = addSuppressed;
        }

        @Override // com.google.common.io.Closer.Suppressor
        public void suppress(java.io.Closeable closeable, java.lang.Throwable thrown, java.lang.Throwable suppressed) {
            if (thrown == suppressed) {
                return;
            }
            try {
                this.addSuppressed.invoke(thrown, suppressed);
            } catch (java.lang.Throwable unused) {
                com.google.common.io.Closer.LoggingSuppressor.INSTANCE.suppress(closeable, thrown, suppressed);
            }
        }
    }
}
