package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class AbstractService implements com.google.common.util.concurrent.Service {
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STARTING_EVENT = new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.1
        public java.lang.String toString() {
            return "starting()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(com.google.common.util.concurrent.Service.Listener listener) {
            listener.starting();
        }
    };
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> RUNNING_EVENT = new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.2
        public java.lang.String toString() {
            return "running()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(com.google.common.util.concurrent.Service.Listener listener) {
            listener.running();
        }
    };
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STOPPING_FROM_STARTING_EVENT = stoppingEvent(com.google.common.util.concurrent.Service.State.STARTING);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STOPPING_FROM_RUNNING_EVENT = stoppingEvent(com.google.common.util.concurrent.Service.State.RUNNING);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_NEW_EVENT = terminatedEvent(com.google.common.util.concurrent.Service.State.NEW);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_STARTING_EVENT = terminatedEvent(com.google.common.util.concurrent.Service.State.STARTING);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_RUNNING_EVENT = terminatedEvent(com.google.common.util.concurrent.Service.State.RUNNING);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_STOPPING_EVENT = terminatedEvent(com.google.common.util.concurrent.Service.State.STOPPING);
    private final com.google.common.util.concurrent.Monitor monitor = new com.google.common.util.concurrent.Monitor();
    private final com.google.common.util.concurrent.Monitor.Guard isStartable = new com.google.common.util.concurrent.AbstractService.IsStartableGuard();
    private final com.google.common.util.concurrent.Monitor.Guard isStoppable = new com.google.common.util.concurrent.AbstractService.IsStoppableGuard();
    private final com.google.common.util.concurrent.Monitor.Guard hasReachedRunning = new com.google.common.util.concurrent.AbstractService.HasReachedRunningGuard();
    private final com.google.common.util.concurrent.Monitor.Guard isStopped = new com.google.common.util.concurrent.AbstractService.IsStoppedGuard();
    private final com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service.Listener> listeners = new com.google.common.util.concurrent.ListenerCallQueue<>();
    private volatile com.google.common.util.concurrent.AbstractService.StateSnapshot snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.NEW);

    protected void doCancelStart() {
    }

    protected abstract void doStart();

    protected abstract void doStop();

    private static com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> terminatedEvent(final com.google.common.util.concurrent.Service.State from) {
        return new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.3
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(com.google.common.util.concurrent.Service.Listener listener) {
                listener.terminated(from);
            }

            public java.lang.String toString() {
                return "terminated({from = " + from + "})";
            }
        };
    }

    private static com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> stoppingEvent(final com.google.common.util.concurrent.Service.State from) {
        return new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.4
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(com.google.common.util.concurrent.Service.Listener listener) {
                listener.stopping(from);
            }

            public java.lang.String toString() {
                return "stopping({from = " + from + "})";
            }
        };
    }

    private final class IsStartableGuard extends com.google.common.util.concurrent.Monitor.Guard {
        IsStartableGuard() {
            super(com.google.common.util.concurrent.AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return com.google.common.util.concurrent.AbstractService.this.state() == com.google.common.util.concurrent.Service.State.NEW;
        }
    }

    private final class IsStoppableGuard extends com.google.common.util.concurrent.Monitor.Guard {
        IsStoppableGuard() {
            super(com.google.common.util.concurrent.AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return com.google.common.util.concurrent.AbstractService.this.state().compareTo(com.google.common.util.concurrent.Service.State.RUNNING) <= 0;
        }
    }

    private final class HasReachedRunningGuard extends com.google.common.util.concurrent.Monitor.Guard {
        HasReachedRunningGuard() {
            super(com.google.common.util.concurrent.AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return com.google.common.util.concurrent.AbstractService.this.state().compareTo(com.google.common.util.concurrent.Service.State.RUNNING) >= 0;
        }
    }

    private final class IsStoppedGuard extends com.google.common.util.concurrent.Monitor.Guard {
        IsStoppedGuard() {
            super(com.google.common.util.concurrent.AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return com.google.common.util.concurrent.AbstractService.this.state().compareTo(com.google.common.util.concurrent.Service.State.TERMINATED) >= 0;
        }
    }

    protected AbstractService() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service startAsync() throws java.lang.Exception {
        if (this.monitor.enterIf(this.isStartable)) {
            try {
                this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.STARTING);
                enqueueStartingEvent();
                doStart();
            } catch (java.lang.Throwable th) {
                try {
                    com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                    notifyFailed(th);
                } finally {
                    this.monitor.leave();
                    dispatchListenerEvents();
                }
            }
            return this;
        }
        throw new java.lang.IllegalStateException("Service " + this + " has already been started");
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service stopAsync() throws java.lang.Exception {
        if (this.monitor.enterIf(this.isStoppable)) {
            try {
                com.google.common.util.concurrent.Service.State state = state();
                switch (com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()]) {
                    case 1:
                        this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.TERMINATED);
                        enqueueTerminatedEvent(com.google.common.util.concurrent.Service.State.NEW);
                        break;
                    case 2:
                        this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.STARTING, true, null);
                        enqueueStoppingEvent(com.google.common.util.concurrent.Service.State.STARTING);
                        doCancelStart();
                        break;
                    case 3:
                        this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.STOPPING);
                        enqueueStoppingEvent(com.google.common.util.concurrent.Service.State.RUNNING);
                        doStop();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        throw new java.lang.AssertionError("isStoppable is incorrectly implemented, saw: " + state);
                }
            } catch (java.lang.Throwable th) {
                try {
                    com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                    notifyFailed(th);
                } finally {
                    this.monitor.leave();
                    dispatchListenerEvents();
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$Service$State;

        static {
            int[] iArr = new int[com.google.common.util.concurrent.Service.State.values().length];
            $SwitchMap$com$google$common$util$concurrent$Service$State = iArr;
            try {
                iArr[com.google.common.util.concurrent.Service.State.NEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[com.google.common.util.concurrent.Service.State.STARTING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[com.google.common.util.concurrent.Service.State.RUNNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[com.google.common.util.concurrent.Service.State.STOPPING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[com.google.common.util.concurrent.Service.State.TERMINATED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[com.google.common.util.concurrent.Service.State.FAILED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.monitor.enterWhenUninterruptibly(this.hasReachedRunning);
        try {
            checkCurrentState(com.google.common.util.concurrent.Service.State.RUNNING);
        } finally {
            this.monitor.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException {
        if (this.monitor.enterWhenUninterruptibly(this.hasReachedRunning, timeout, unit)) {
            try {
                checkCurrentState(com.google.common.util.concurrent.Service.State.RUNNING);
                return;
            } finally {
                this.monitor.leave();
            }
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state.");
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.monitor.enterWhenUninterruptibly(this.isStopped);
        try {
            checkCurrentState(com.google.common.util.concurrent.Service.State.TERMINATED);
        } finally {
            this.monitor.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException {
        if (this.monitor.enterWhenUninterruptibly(this.isStopped, timeout, unit)) {
            try {
                checkCurrentState(com.google.common.util.concurrent.Service.State.TERMINATED);
                return;
            } finally {
                this.monitor.leave();
            }
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for " + this + " to reach a terminal state. Current state: " + state());
    }

    private void checkCurrentState(com.google.common.util.concurrent.Service.State expected) {
        com.google.common.util.concurrent.Service.State state = state();
        if (state != expected) {
            if (state == com.google.common.util.concurrent.Service.State.FAILED) {
                throw new java.lang.IllegalStateException("Expected the service " + this + " to be " + expected + ", but the service has FAILED", failureCause());
            }
            throw new java.lang.IllegalStateException("Expected the service " + this + " to be " + expected + ", but was " + state);
        }
    }

    protected final void notifyStarted() throws java.lang.Exception {
        this.monitor.enter();
        try {
            if (this.snapshot.state != com.google.common.util.concurrent.Service.State.STARTING) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Cannot notifyStarted() when the service is " + this.snapshot.state);
                notifyFailed(illegalStateException);
                throw illegalStateException;
            }
            if (this.snapshot.shutdownWhenStartupFinishes) {
                this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.STOPPING);
                doStop();
            } else {
                this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.RUNNING);
                enqueueRunningEvent();
            }
            this.monitor.leave();
            dispatchListenerEvents();
        } catch (java.lang.Throwable th) {
            this.monitor.leave();
            dispatchListenerEvents();
            throw th;
        }
    }

    protected final void notifyStopped() throws java.lang.Exception {
        this.monitor.enter();
        try {
            com.google.common.util.concurrent.Service.State state = state();
            switch (com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    throw new java.lang.IllegalStateException("Cannot notifyStopped() when the service is " + state);
                case 2:
                case 3:
                case 4:
                    this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.TERMINATED);
                    enqueueTerminatedEvent(state);
                    break;
            }
            this.monitor.leave();
            dispatchListenerEvents();
        } catch (java.lang.Throwable th) {
            this.monitor.leave();
            dispatchListenerEvents();
            throw th;
        }
    }

    protected final void notifyFailed(java.lang.Throwable cause) throws java.lang.Exception {
        com.google.common.base.Preconditions.checkNotNull(cause);
        this.monitor.enter();
        try {
            com.google.common.util.concurrent.Service.State state = state();
            int i = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    this.snapshot = new com.google.common.util.concurrent.AbstractService.StateSnapshot(com.google.common.util.concurrent.Service.State.FAILED, false, cause);
                    enqueueFailedEvent(state, cause);
                } else if (i != 5) {
                }
                this.monitor.leave();
                dispatchListenerEvents();
                return;
            }
            throw new java.lang.IllegalStateException("Failed while in state:" + state, cause);
        } catch (java.lang.Throwable th) {
            this.monitor.leave();
            dispatchListenerEvents();
            throw th;
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return state() == com.google.common.util.concurrent.Service.State.RUNNING;
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
        return this.snapshot.externalState();
    }

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
        return this.snapshot.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener listener, java.util.concurrent.Executor executor) {
        this.listeners.addListener(listener, executor);
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + " [" + state() + com.ironsource.y8.i.e;
    }

    private void dispatchListenerEvents() throws java.lang.Exception {
        if (this.monitor.isOccupiedByCurrentThread()) {
            return;
        }
        this.listeners.dispatch();
    }

    private void enqueueStartingEvent() {
        this.listeners.enqueue(STARTING_EVENT);
    }

    private void enqueueRunningEvent() {
        this.listeners.enqueue(RUNNING_EVENT);
    }

    private void enqueueStoppingEvent(final com.google.common.util.concurrent.Service.State from) {
        if (from == com.google.common.util.concurrent.Service.State.STARTING) {
            this.listeners.enqueue(STOPPING_FROM_STARTING_EVENT);
        } else {
            if (from == com.google.common.util.concurrent.Service.State.RUNNING) {
                this.listeners.enqueue(STOPPING_FROM_RUNNING_EVENT);
                return;
            }
            throw new java.lang.AssertionError();
        }
    }

    private void enqueueTerminatedEvent(final com.google.common.util.concurrent.Service.State from) {
        switch (com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[from.ordinal()]) {
            case 1:
                this.listeners.enqueue(TERMINATED_FROM_NEW_EVENT);
                return;
            case 2:
                this.listeners.enqueue(TERMINATED_FROM_STARTING_EVENT);
                return;
            case 3:
                this.listeners.enqueue(TERMINATED_FROM_RUNNING_EVENT);
                return;
            case 4:
                this.listeners.enqueue(TERMINATED_FROM_STOPPING_EVENT);
                return;
            case 5:
            case 6:
                throw new java.lang.AssertionError();
            default:
                return;
        }
    }

    private void enqueueFailedEvent(final com.google.common.util.concurrent.Service.State from, final java.lang.Throwable cause) {
        this.listeners.enqueue(new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>(this) { // from class: com.google.common.util.concurrent.AbstractService.5
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(com.google.common.util.concurrent.Service.Listener listener) {
                listener.failed(from, cause);
            }

            public java.lang.String toString() {
                return "failed({from = " + from + ", cause = " + cause + "})";
            }
        });
    }

    private static final class StateSnapshot {

        @javax.annotation.CheckForNull
        final java.lang.Throwable failure;
        final boolean shutdownWhenStartupFinishes;
        final com.google.common.util.concurrent.Service.State state;

        StateSnapshot(com.google.common.util.concurrent.Service.State internalState) {
            this(internalState, false, null);
        }

        StateSnapshot(com.google.common.util.concurrent.Service.State internalState, boolean shutdownWhenStartupFinishes, @javax.annotation.CheckForNull java.lang.Throwable failure) {
            com.google.common.base.Preconditions.checkArgument(!shutdownWhenStartupFinishes || internalState == com.google.common.util.concurrent.Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", internalState);
            com.google.common.base.Preconditions.checkArgument((failure != null) == (internalState == com.google.common.util.concurrent.Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", internalState, failure);
            this.state = internalState;
            this.shutdownWhenStartupFinishes = shutdownWhenStartupFinishes;
            this.failure = failure;
        }

        com.google.common.util.concurrent.Service.State externalState() {
            if (this.shutdownWhenStartupFinishes && this.state == com.google.common.util.concurrent.Service.State.STARTING) {
                return com.google.common.util.concurrent.Service.State.STOPPING;
            }
            return this.state;
        }

        java.lang.Throwable failureCause() {
            com.google.common.base.Preconditions.checkState(this.state == com.google.common.util.concurrent.Service.State.FAILED, "failureCause() is only valid if the service has failed, service is %s", this.state);
            return (java.lang.Throwable) java.util.Objects.requireNonNull(this.failure);
        }
    }
}
