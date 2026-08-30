package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public class ExecutionError extends java.lang.Error {
    private static final long serialVersionUID = 0;

    protected ExecutionError() {
    }

    protected ExecutionError(@javax.annotation.CheckForNull java.lang.String message) {
        super(message);
    }

    public ExecutionError(@javax.annotation.CheckForNull java.lang.String message, @javax.annotation.CheckForNull java.lang.Error cause) {
        super(message, cause);
    }

    public ExecutionError(@javax.annotation.CheckForNull java.lang.Error cause) {
        super(cause);
    }
}
