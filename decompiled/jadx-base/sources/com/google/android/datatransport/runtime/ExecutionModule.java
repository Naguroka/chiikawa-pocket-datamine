package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.Module
abstract class ExecutionModule {
    ExecutionModule() {
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @javax.inject.Singleton
    static java.util.concurrent.Executor executor() {
        return new com.google.android.datatransport.runtime.SafeLoggingExecutor(java.util.concurrent.Executors.newSingleThreadExecutor());
    }
}
