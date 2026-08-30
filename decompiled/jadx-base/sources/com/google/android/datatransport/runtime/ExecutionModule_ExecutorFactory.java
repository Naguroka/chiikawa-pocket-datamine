package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
public final class ExecutionModule_ExecutorFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.util.concurrent.Executor> {
    @Override // javax.inject.Provider
    public java.util.concurrent.Executor get() {
        return executor();
    }

    public static com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory create() {
        return com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.InstanceHolder.INSTANCE;
    }

    public static java.util.concurrent.Executor executor() {
        return (java.util.concurrent.Executor) com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.android.datatransport.runtime.ExecutionModule.executor());
    }

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory INSTANCE = new com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory();

        private InstanceHolder() {
        }
    }
}
