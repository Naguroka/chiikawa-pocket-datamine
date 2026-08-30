package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class ListenerSet<T> {
    private static final int MSG_ITERATION_FINISHED = 1;
    private final androidx.media3.common.util.Clock clock;
    private final java.util.ArrayDeque<java.lang.Runnable> flushingEvents;
    private final androidx.media3.common.util.HandlerWrapper handler;
    private final androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> listeners;
    private final java.util.ArrayDeque<java.lang.Runnable> queuedEvents;
    private boolean released;
    private final java.lang.Object releasedLock;
    private boolean throwsWhenUsingWrongThread;

    public interface Event<T> {
        void invoke(T t);
    }

    public interface IterationFinishedEvent<T> {
        void invoke(T t, androidx.media3.common.FlagSet flagSet);
    }

    public ListenerSet(android.os.Looper looper, androidx.media3.common.util.Clock clock, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent, true);
    }

    private ListenerSet(java.util.concurrent.CopyOnWriteArraySet<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> copyOnWriteArraySet, android.os.Looper looper, androidx.media3.common.util.Clock clock, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent, boolean z) {
        this.clock = clock;
        this.listeners = copyOnWriteArraySet;
        this.iterationFinishedEvent = iterationFinishedEvent;
        this.releasedLock = new java.lang.Object();
        this.flushingEvents = new java.util.ArrayDeque<>();
        this.queuedEvents = new java.util.ArrayDeque<>();
        this.handler = clock.createHandler(looper, new android.os.Handler.Callback() { // from class: androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.f$0.handleMessage(message);
            }
        });
        this.throwsWhenUsingWrongThread = z;
    }

    public androidx.media3.common.util.ListenerSet<T> copy(android.os.Looper looper, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        return copy(looper, this.clock, iterationFinishedEvent);
    }

    public androidx.media3.common.util.ListenerSet<T> copy(android.os.Looper looper, androidx.media3.common.util.Clock clock, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        return new androidx.media3.common.util.ListenerSet<>(this.listeners, looper, clock, iterationFinishedEvent, this.throwsWhenUsingWrongThread);
    }

    public void add(T t) {
        androidx.media3.common.util.Assertions.checkNotNull(t);
        synchronized (this.releasedLock) {
            if (this.released) {
                return;
            }
            this.listeners.add(new androidx.media3.common.util.ListenerSet.ListenerHolder<>(t));
        }
    }

    public void remove(T t) {
        verifyCurrentThread();
        for (androidx.media3.common.util.ListenerSet.ListenerHolder<T> listenerHolder : this.listeners) {
            if (listenerHolder.listener.equals(t)) {
                listenerHolder.release(this.iterationFinishedEvent);
                this.listeners.remove(listenerHolder);
            }
        }
    }

    public void clear() {
        verifyCurrentThread();
        this.listeners.clear();
    }

    public int size() {
        verifyCurrentThread();
        return this.listeners.size();
    }

    public void queueEvent(final int i, final androidx.media3.common.util.ListenerSet.Event<T> event) {
        verifyCurrentThread();
        final java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet(this.listeners);
        this.queuedEvents.add(new java.lang.Runnable() { // from class: androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.ListenerSet.lambda$queueEvent$0(copyOnWriteArraySet, i, event);
            }
        });
    }

    static /* synthetic */ void lambda$queueEvent$0(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, int i, androidx.media3.common.util.ListenerSet.Event event) {
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((androidx.media3.common.util.ListenerSet.ListenerHolder) it.next()).invoke(i, event);
        }
    }

    public void flushEvents() {
        verifyCurrentThread();
        if (this.queuedEvents.isEmpty()) {
            return;
        }
        if (!this.handler.hasMessages(1)) {
            androidx.media3.common.util.HandlerWrapper handlerWrapper = this.handler;
            handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(1));
        }
        boolean z = !this.flushingEvents.isEmpty();
        this.flushingEvents.addAll(this.queuedEvents);
        this.queuedEvents.clear();
        if (z) {
            return;
        }
        while (!this.flushingEvents.isEmpty()) {
            this.flushingEvents.peekFirst().run();
            this.flushingEvents.removeFirst();
        }
    }

    public void sendEvent(int i, androidx.media3.common.util.ListenerSet.Event<T> event) {
        queueEvent(i, event);
        flushEvents();
    }

    public void release() {
        verifyCurrentThread();
        synchronized (this.releasedLock) {
            this.released = true;
        }
        java.util.Iterator<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().release(this.iterationFinishedEvent);
        }
        this.listeners.clear();
    }

    @java.lang.Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.throwsWhenUsingWrongThread = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(android.os.Message message) {
        java.util.Iterator<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().iterationFinished(this.iterationFinishedEvent);
            if (this.handler.hasMessages(1)) {
                break;
            }
        }
        return true;
    }

    private void verifyCurrentThread() {
        if (this.throwsWhenUsingWrongThread) {
            androidx.media3.common.util.Assertions.checkState(java.lang.Thread.currentThread() == this.handler.getLooper().getThread());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ListenerHolder<T> {
        private androidx.media3.common.FlagSet.Builder flagsBuilder = new androidx.media3.common.FlagSet.Builder();
        public final T listener;
        private boolean needsIterationFinishedEvent;
        private boolean released;

        public ListenerHolder(T t) {
            this.listener = t;
        }

        public void release(androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
            this.released = true;
            if (this.needsIterationFinishedEvent) {
                this.needsIterationFinishedEvent = false;
                iterationFinishedEvent.invoke(this.listener, this.flagsBuilder.build());
            }
        }

        public void invoke(int i, androidx.media3.common.util.ListenerSet.Event<T> event) {
            if (this.released) {
                return;
            }
            if (i != -1) {
                this.flagsBuilder.add(i);
            }
            this.needsIterationFinishedEvent = true;
            event.invoke(this.listener);
        }

        public void iterationFinished(androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
            if (this.released || !this.needsIterationFinishedEvent) {
                return;
            }
            androidx.media3.common.FlagSet flagSetBuild = this.flagsBuilder.build();
            this.flagsBuilder = new androidx.media3.common.FlagSet.Builder();
            this.needsIterationFinishedEvent = false;
            iterationFinishedEvent.invoke(this.listener, flagSetBuild);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.listener.equals(((androidx.media3.common.util.ListenerSet.ListenerHolder) obj).listener);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }
    }
}
