package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class Callables {
    static /* synthetic */ java.lang.Object lambda$returning$0(java.lang.Object obj) throws java.lang.Exception {
        return obj;
    }

    private Callables() {
    }

    public static <T> java.util.concurrent.Callable<T> returning(@com.google.common.util.concurrent.ParametricNullness final T value) {
        return new java.util.concurrent.Callable() { // from class: com.google.common.util.concurrent.Callables$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.common.util.concurrent.Callables.lambda$returning$0(value);
            }
        };
    }

    public static <T> com.google.common.util.concurrent.AsyncCallable<T> asAsyncCallable(final java.util.concurrent.Callable<T> callable, final com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService) {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(listeningExecutorService);
        return new com.google.common.util.concurrent.AsyncCallable() { // from class: com.google.common.util.concurrent.Callables$$ExternalSyntheticLambda3
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final com.google.common.util.concurrent.ListenableFuture call() {
                return listeningExecutorService.submit(callable);
            }
        };
    }

    static <T> java.util.concurrent.Callable<T> threadRenaming(final java.util.concurrent.Callable<T> callable, final com.google.common.base.Supplier<java.lang.String> nameSupplier) {
        com.google.common.base.Preconditions.checkNotNull(nameSupplier);
        com.google.common.base.Preconditions.checkNotNull(callable);
        return new java.util.concurrent.Callable() { // from class: com.google.common.util.concurrent.Callables$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.common.util.concurrent.Callables.lambda$threadRenaming$2(nameSupplier, callable);
            }
        };
    }

    static /* synthetic */ java.lang.Object lambda$threadRenaming$2(com.google.common.base.Supplier supplier, java.util.concurrent.Callable callable) throws java.lang.Exception {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.String name = threadCurrentThread.getName();
        boolean zTrySetName = trySetName((java.lang.String) supplier.get(), threadCurrentThread);
        try {
            return callable.call();
        } finally {
            if (zTrySetName) {
                trySetName(name, threadCurrentThread);
            }
        }
    }

    static java.lang.Runnable threadRenaming(final java.lang.Runnable task, final com.google.common.base.Supplier<java.lang.String> nameSupplier) {
        com.google.common.base.Preconditions.checkNotNull(nameSupplier);
        com.google.common.base.Preconditions.checkNotNull(task);
        return new java.lang.Runnable() { // from class: com.google.common.util.concurrent.Callables$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.Callables.lambda$threadRenaming$3(nameSupplier, task);
            }
        };
    }

    static /* synthetic */ void lambda$threadRenaming$3(com.google.common.base.Supplier supplier, java.lang.Runnable runnable) {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.String name = threadCurrentThread.getName();
        boolean zTrySetName = trySetName((java.lang.String) supplier.get(), threadCurrentThread);
        try {
            runnable.run();
        } finally {
            if (zTrySetName) {
                trySetName(name, threadCurrentThread);
            }
        }
    }

    private static boolean trySetName(java.lang.String threadName, java.lang.Thread currentThread) {
        try {
            currentThread.setName(threadName);
            return true;
        } catch (java.lang.SecurityException unused) {
            return false;
        }
    }
}
