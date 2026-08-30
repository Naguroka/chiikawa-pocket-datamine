package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class FakeTimeLimiter implements com.google.common.util.concurrent.TimeLimiter {
    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T target, java.lang.Class<T> interfaceType, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) {
        com.google.common.base.Preconditions.checkNotNull(target);
        com.google.common.base.Preconditions.checkNotNull(interfaceType);
        com.google.common.base.Preconditions.checkNotNull(timeoutUnit);
        return target;
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @com.google.common.util.concurrent.ParametricNullness
    public <T> T callWithTimeout(java.util.concurrent.Callable<T> callable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.util.concurrent.ExecutionException {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(timeoutUnit);
        try {
            return callable.call();
        } catch (java.lang.Error e) {
            throw new com.google.common.util.concurrent.ExecutionError(e);
        } catch (java.lang.RuntimeException e2) {
            throw new com.google.common.util.concurrent.UncheckedExecutionException(e2);
        } catch (java.lang.Exception e3) {
            com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(e3);
            throw new java.util.concurrent.ExecutionException(e3);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @com.google.common.util.concurrent.ParametricNullness
    public <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> callable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException {
        return (T) callWithTimeout(callable, j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(java.lang.Runnable runnable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) {
        com.google.common.base.Preconditions.checkNotNull(runnable);
        com.google.common.base.Preconditions.checkNotNull(timeoutUnit);
        try {
            runnable.run();
        } catch (java.lang.Error e) {
            throw new com.google.common.util.concurrent.ExecutionError(e);
        } catch (java.lang.Exception e2) {
            throw new com.google.common.util.concurrent.UncheckedExecutionException(e2);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(java.lang.Runnable runnable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) {
        runWithTimeout(runnable, timeoutDuration, timeoutUnit);
    }
}
