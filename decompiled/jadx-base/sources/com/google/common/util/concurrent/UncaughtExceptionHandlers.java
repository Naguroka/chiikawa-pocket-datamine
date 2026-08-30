package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class UncaughtExceptionHandlers {
    private UncaughtExceptionHandlers() {
    }

    public static java.lang.Thread.UncaughtExceptionHandler systemExit() {
        return new com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter(java.lang.Runtime.getRuntime());
    }

    static final class Exiter implements java.lang.Thread.UncaughtExceptionHandler {
        private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.class);
        private final java.lang.Runtime runtime;

        Exiter(java.lang.Runtime runtime) {
            this.runtime = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
            try {
                logger.get().log(java.util.logging.Level.SEVERE, java.lang.String.format(java.util.Locale.ROOT, "Caught an exception in %s.  Shutting down.", t), e);
            } catch (java.lang.Throwable th) {
                try {
                    java.lang.System.err.println(e.getMessage());
                    java.lang.System.err.println(th.getMessage());
                } finally {
                    this.runtime.exit(1);
                }
            }
        }
    }
}
