package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class ExecutionList {
    private static final com.google.common.util.concurrent.LazyLogger log = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.ExecutionList.class);
    private boolean executed;

    @javax.annotation.CheckForNull
    private com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair runnables;

    public void add(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(runnable, "Runnable was null.");
        com.google.common.base.Preconditions.checkNotNull(executor, "Executor was null.");
        synchronized (this) {
            if (!this.executed) {
                this.runnables = new com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair(runnable, executor, this.runnables);
            } else {
                executeListener(runnable, executor);
            }
        }
    }

    public void execute() {
        synchronized (this) {
            if (this.executed) {
                return;
            }
            this.executed = true;
            com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair runnableExecutorPair = this.runnables;
            com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair runnableExecutorPair2 = null;
            this.runnables = null;
            while (runnableExecutorPair != null) {
                com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair runnableExecutorPair3 = runnableExecutorPair.next;
                runnableExecutorPair.next = runnableExecutorPair2;
                runnableExecutorPair2 = runnableExecutorPair;
                runnableExecutorPair = runnableExecutorPair3;
            }
            while (runnableExecutorPair2 != null) {
                executeListener(runnableExecutorPair2.runnable, runnableExecutorPair2.executor);
                runnableExecutorPair2 = runnableExecutorPair2.next;
            }
        }
    }

    private static void executeListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            log.get().log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e);
        }
    }

    private static final class RunnableExecutorPair {
        final java.util.concurrent.Executor executor;

        @javax.annotation.CheckForNull
        com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair next;
        final java.lang.Runnable runnable;

        RunnableExecutorPair(java.lang.Runnable runnable, java.util.concurrent.Executor executor, @javax.annotation.CheckForNull com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair next) {
            this.runnable = runnable;
            this.executor = executor;
            this.next = next;
        }
    }
}
