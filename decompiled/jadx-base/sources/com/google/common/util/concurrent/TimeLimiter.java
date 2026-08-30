package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use FakeTimeLimiter")
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public interface TimeLimiter {
    @com.google.common.util.concurrent.ParametricNullness
    <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> callable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException;

    @com.google.common.util.concurrent.ParametricNullness
    <T> T callWithTimeout(java.util.concurrent.Callable<T> callable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException;

    <T> T newProxy(T target, java.lang.Class<T> interfaceType, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit);

    void runUninterruptiblyWithTimeout(java.lang.Runnable runnable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.util.concurrent.TimeoutException;

    void runWithTimeout(java.lang.Runnable runnable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException;
}
