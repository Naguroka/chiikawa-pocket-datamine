package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class Closeables {
    static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.io.Closeables.class.getName());

    private Closeables() {
    }

    public static void close(@javax.annotation.CheckForNull java.io.Closeable closeable, boolean swallowIOException) throws java.io.IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            if (swallowIOException) {
                logger.log(java.util.logging.Level.WARNING, "IOException thrown while closing Closeable.", (java.lang.Throwable) e);
                return;
            }
            throw e;
        }
    }

    public static void closeQuietly(@javax.annotation.CheckForNull java.io.InputStream inputStream) {
        try {
            close(inputStream, true);
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static void closeQuietly(@javax.annotation.CheckForNull java.io.Reader reader) {
        try {
            close(reader, true);
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
