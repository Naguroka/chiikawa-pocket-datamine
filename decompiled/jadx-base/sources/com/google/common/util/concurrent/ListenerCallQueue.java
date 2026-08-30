package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
final class ListenerCallQueue<L> {
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.ListenerCallQueue.class);
    private final java.util.List<com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue<L>> listeners = java.util.Collections.synchronizedList(new java.util.ArrayList());

    interface Event<L> {
        void call(L listener);
    }

    ListenerCallQueue() {
    }

    public void addListener(L listener, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(listener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.google.common.base.Preconditions.checkNotNull(executor, "executor");
        this.listeners.add(new com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue<>(listener, executor));
    }

    public void enqueue(com.google.common.util.concurrent.ListenerCallQueue.Event<L> event) {
        enqueueHelper(event, event);
    }

    public void enqueue(com.google.common.util.concurrent.ListenerCallQueue.Event<L> event, java.lang.String label) {
        enqueueHelper(event, label);
    }

    private void enqueueHelper(com.google.common.util.concurrent.ListenerCallQueue.Event<L> event, java.lang.Object label) {
        com.google.common.base.Preconditions.checkNotNull(event, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        com.google.common.base.Preconditions.checkNotNull(label, "label");
        synchronized (this.listeners) {
            java.util.Iterator<com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue<L>> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().add(event, label);
            }
        }
    }

    public void dispatch() throws java.lang.Exception {
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).dispatch();
        }
    }

    private static final class PerListenerQueue<L> implements java.lang.Runnable {
        final java.util.concurrent.Executor executor;
        boolean isThreadScheduled;
        final L listener;
        final java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue.Event<L>> waitQueue = com.google.common.collect.Queues.newArrayDeque();
        final java.util.Queue<java.lang.Object> labelQueue = com.google.common.collect.Queues.newArrayDeque();

        PerListenerQueue(L l, java.util.concurrent.Executor executor) {
            this.listener = (L) com.google.common.base.Preconditions.checkNotNull(l);
            this.executor = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull(executor);
        }

        synchronized void add(com.google.common.util.concurrent.ListenerCallQueue.Event<L> event, java.lang.Object label) {
            this.waitQueue.add(event);
            this.labelQueue.add(label);
        }

        void dispatch() throws java.lang.Exception {
            boolean z;
            synchronized (this) {
                if (this.isThreadScheduled) {
                    z = false;
                } else {
                    z = true;
                    this.isThreadScheduled = true;
                }
            }
            if (z) {
                try {
                    this.executor.execute(this);
                } catch (java.lang.Exception e) {
                    synchronized (this) {
                        this.isThreadScheduled = false;
                        com.google.common.util.concurrent.ListenerCallQueue.logger.get().log(java.util.logging.Level.SEVERE, "Exception while running callbacks for " + this.listener + " on " + this.executor, (java.lang.Throwable) e);
                        throw e;
                    }
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x005f */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        
            r2.call(r9.listener);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            com.google.common.util.concurrent.ListenerCallQueue.logger.get().log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r9.listener + " " + r3, (java.lang.Throwable) r2);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() throws java.lang.Throwable {
            boolean z;
            java.lang.Throwable th;
            while (true) {
                boolean z2 = true;
                try {
                    synchronized (this) {
                        try {
                            com.google.common.base.Preconditions.checkState(this.isThreadScheduled);
                            com.google.common.util.concurrent.ListenerCallQueue.Event<L> eventPoll = this.waitQueue.poll();
                            java.lang.Object objPoll = this.labelQueue.poll();
                            if (eventPoll == null) {
                                this.isThreadScheduled = false;
                                try {
                                    return;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    z = false;
                                    while (true) {
                                        throw th;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            z = true;
                            th = th3;
                        }
                    }
                    try {
                        throw th;
                    } catch (java.lang.Throwable th4) {
                        boolean z3 = z;
                        th = th4;
                        z2 = z3;
                        if (z2) {
                            synchronized (this) {
                                this.isThreadScheduled = false;
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                }
            }
        }
    }
}
