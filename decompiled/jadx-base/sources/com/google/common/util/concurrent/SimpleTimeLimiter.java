package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class SimpleTimeLimiter implements com.google.common.util.concurrent.TimeLimiter {
    private final java.util.concurrent.ExecutorService executor;

    private SimpleTimeLimiter(java.util.concurrent.ExecutorService executor) {
        this.executor = (java.util.concurrent.ExecutorService) com.google.common.base.Preconditions.checkNotNull(executor);
    }

    public static com.google.common.util.concurrent.SimpleTimeLimiter create(java.util.concurrent.ExecutorService executor) {
        return new com.google.common.util.concurrent.SimpleTimeLimiter(executor);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t, java.lang.Class<T> cls, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.base.Preconditions.checkNotNull(t);
        com.google.common.base.Preconditions.checkNotNull(cls);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        com.google.common.base.Preconditions.checkArgument(cls.isInterface(), "interfaceType must be an interface type");
        return (T) newProxy(cls, new com.google.common.util.concurrent.SimpleTimeLimiter.AnonymousClass1(t, j, timeUnit, findInterruptibleMethods(cls)));
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.reflect.InvocationHandler {
        final /* synthetic */ java.util.Set val$interruptibleMethods;
        final /* synthetic */ java.lang.Object val$target;
        final /* synthetic */ long val$timeoutDuration;
        final /* synthetic */ java.util.concurrent.TimeUnit val$timeoutUnit;

        AnonymousClass1(final java.lang.Object val$target, final long val$timeoutDuration, final java.util.concurrent.TimeUnit val$timeoutUnit, final java.util.Set val$interruptibleMethods) {
            this.val$target = val$target;
            this.val$timeoutDuration = val$timeoutDuration;
            this.val$timeoutUnit = val$timeoutUnit;
            this.val$interruptibleMethods = val$interruptibleMethods;
        }

        @Override // java.lang.reflect.InvocationHandler
        @javax.annotation.CheckForNull
        public java.lang.Object invoke(java.lang.Object obj, final java.lang.reflect.Method method, @javax.annotation.CheckForNull final java.lang.Object[] args) throws java.lang.Throwable {
            final java.lang.Object obj2 = this.val$target;
            return com.google.common.util.concurrent.SimpleTimeLimiter.this.callWithTimeout(new java.util.concurrent.Callable() { // from class: com.google.common.util.concurrent.SimpleTimeLimiter$1$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.google.common.util.concurrent.SimpleTimeLimiter.AnonymousClass1.lambda$invoke$0(method, obj2, args);
                }
            }, this.val$timeoutDuration, this.val$timeoutUnit, this.val$interruptibleMethods.contains(method));
        }

        static /* synthetic */ java.lang.Object lambda$invoke$0(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw com.google.common.util.concurrent.SimpleTimeLimiter.throwCause(e, false);
            }
        }
    }

    private static <T> T newProxy(java.lang.Class<T> interfaceType, java.lang.reflect.InvocationHandler handler) {
        return interfaceType.cast(java.lang.reflect.Proxy.newProxyInstance(interfaceType.getClassLoader(), new java.lang.Class[]{interfaceType}, handler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @com.google.common.util.concurrent.ParametricNullness
    public <T> T callWithTimeout(java.util.concurrent.Callable<T> callable, long j, java.util.concurrent.TimeUnit timeUnit, boolean z) throws java.lang.Exception {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        java.util.concurrent.Future future = (T) this.executor.submit(callable);
        try {
            if (z) {
                future = (T) future.get(j, timeUnit);
            } else {
                future = (T) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(future, j, timeUnit);
            }
            return (T) future;
        } catch (java.lang.InterruptedException e) {
            future.cancel(true);
            throw e;
        } catch (java.util.concurrent.ExecutionException e2) {
            throw throwCause(e2, true);
        } catch (java.util.concurrent.TimeoutException e3) {
            future.cancel(true);
            throw new com.google.common.util.concurrent.UncheckedTimeoutException(e3);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @com.google.common.util.concurrent.ParametricNullness
    public <T> T callWithTimeout(java.util.concurrent.Callable<T> callable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(timeoutUnit);
        checkPositiveTimeout(timeoutDuration);
        java.util.concurrent.Future<T> futureSubmit = this.executor.submit(callable);
        try {
            return futureSubmit.get(timeoutDuration, timeoutUnit);
        } catch (java.lang.InterruptedException e) {
            e = e;
            futureSubmit.cancel(true);
            throw e;
        } catch (java.util.concurrent.ExecutionException e2) {
            wrapAndThrowExecutionExceptionOrError(e2.getCause());
            throw new java.lang.AssertionError();
        } catch (java.util.concurrent.TimeoutException e3) {
            e = e3;
            futureSubmit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @com.google.common.util.concurrent.ParametricNullness
    public <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> callable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        java.util.concurrent.Future<T> futureSubmit = this.executor.submit(callable);
        try {
            return (T) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(futureSubmit, j, timeUnit);
        } catch (java.util.concurrent.ExecutionException e) {
            wrapAndThrowExecutionExceptionOrError(e.getCause());
            throw new java.lang.AssertionError();
        } catch (java.util.concurrent.TimeoutException e2) {
            futureSubmit.cancel(true);
            throw e2;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(java.lang.Runnable runnable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(runnable);
        com.google.common.base.Preconditions.checkNotNull(timeoutUnit);
        checkPositiveTimeout(timeoutDuration);
        java.util.concurrent.Future<?> futureSubmit = this.executor.submit(runnable);
        try {
            futureSubmit.get(timeoutDuration, timeoutUnit);
        } catch (java.lang.InterruptedException e) {
            e = e;
            futureSubmit.cancel(true);
            throw e;
        } catch (java.util.concurrent.ExecutionException e2) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e2.getCause());
            throw new java.lang.AssertionError();
        } catch (java.util.concurrent.TimeoutException e3) {
            e = e3;
            futureSubmit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(java.lang.Runnable runnable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.util.concurrent.TimeoutException {
        com.google.common.base.Preconditions.checkNotNull(runnable);
        com.google.common.base.Preconditions.checkNotNull(timeoutUnit);
        checkPositiveTimeout(timeoutDuration);
        java.util.concurrent.Future<?> futureSubmit = this.executor.submit(runnable);
        try {
            com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(futureSubmit, timeoutDuration, timeoutUnit);
        } catch (java.util.concurrent.ExecutionException e) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e.getCause());
            throw new java.lang.AssertionError();
        } catch (java.util.concurrent.TimeoutException e2) {
            futureSubmit.cancel(true);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Exception throwCause(java.lang.Exception e, boolean combineStackTraces) throws java.lang.Exception {
        java.lang.Throwable cause = e.getCause();
        if (cause == null) {
            throw e;
        }
        if (combineStackTraces) {
            cause.setStackTrace((java.lang.StackTraceElement[]) com.google.common.collect.ObjectArrays.concat(cause.getStackTrace(), e.getStackTrace(), java.lang.StackTraceElement.class));
        }
        if (cause instanceof java.lang.Exception) {
            throw ((java.lang.Exception) cause);
        }
        if (cause instanceof java.lang.Error) {
            throw ((java.lang.Error) cause);
        }
        throw e;
    }

    private static java.util.Set<java.lang.reflect.Method> findInterruptibleMethods(java.lang.Class<?> interfaceType) {
        java.util.HashSet hashSetNewHashSet = com.google.common.collect.Sets.newHashSet();
        for (java.lang.reflect.Method method : interfaceType.getMethods()) {
            if (declaresInterruptedEx(method)) {
                hashSetNewHashSet.add(method);
            }
        }
        return hashSetNewHashSet;
    }

    private static boolean declaresInterruptedEx(java.lang.reflect.Method method) {
        for (java.lang.Class<?> cls : method.getExceptionTypes()) {
            if (cls == java.lang.InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private void wrapAndThrowExecutionExceptionOrError(java.lang.Throwable cause) throws java.util.concurrent.ExecutionException {
        if (cause instanceof java.lang.Error) {
            throw new com.google.common.util.concurrent.ExecutionError((java.lang.Error) cause);
        }
        if (cause instanceof java.lang.RuntimeException) {
            throw new com.google.common.util.concurrent.UncheckedExecutionException(cause);
        }
        throw new java.util.concurrent.ExecutionException(cause);
    }

    private void wrapAndThrowRuntimeExecutionExceptionOrError(java.lang.Throwable cause) {
        if (cause instanceof java.lang.Error) {
            throw new com.google.common.util.concurrent.ExecutionError((java.lang.Error) cause);
        }
        throw new com.google.common.util.concurrent.UncheckedExecutionException(cause);
    }

    private static void checkPositiveTimeout(long timeoutDuration) {
        com.google.common.base.Preconditions.checkArgument(timeoutDuration > 0, "timeout must be positive: %s", timeoutDuration);
    }
}
