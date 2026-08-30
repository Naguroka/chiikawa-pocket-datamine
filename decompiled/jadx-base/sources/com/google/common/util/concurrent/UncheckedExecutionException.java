package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public class UncheckedExecutionException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 0;

    protected UncheckedExecutionException() {
    }

    protected UncheckedExecutionException(@javax.annotation.CheckForNull java.lang.String message) {
        super(message);
    }

    public UncheckedExecutionException(@javax.annotation.CheckForNull java.lang.String message, @javax.annotation.CheckForNull java.lang.Throwable cause) {
        super(message, cause);
    }

    public UncheckedExecutionException(@javax.annotation.CheckForNull java.lang.Throwable cause) {
        super(cause);
    }
}
