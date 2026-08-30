package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class Flushables {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.io.Flushables.class.getName());

    private Flushables() {
    }

    public static void flush(java.io.Flushable flushable, boolean swallowIOException) throws java.io.IOException {
        try {
            flushable.flush();
        } catch (java.io.IOException e) {
            if (swallowIOException) {
                logger.log(java.util.logging.Level.WARNING, "IOException thrown while flushing Flushable.", (java.lang.Throwable) e);
                return;
            }
            throw e;
        }
    }

    public static void flushQuietly(java.io.Flushable flushable) {
        try {
            flush(flushable, true);
        } catch (java.io.IOException e) {
            logger.log(java.util.logging.Level.SEVERE, "IOException should not have been thrown.", (java.lang.Throwable) e);
        }
    }
}
