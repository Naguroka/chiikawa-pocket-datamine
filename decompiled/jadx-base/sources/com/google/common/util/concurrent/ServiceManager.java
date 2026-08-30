package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class ServiceManager implements com.google.common.util.concurrent.ServiceManagerBridge {
    private final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> services;
    private final com.google.common.util.concurrent.ServiceManager.ServiceManagerState state;
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.ServiceManager.class);
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener> HEALTHY_EVENT = new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.1
        public java.lang.String toString() {
            return "healthy()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(com.google.common.util.concurrent.ServiceManager.Listener listener) {
            listener.healthy();
        }
    };
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener> STOPPED_EVENT = new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.2
        public java.lang.String toString() {
            return "stopped()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(com.google.common.util.concurrent.ServiceManager.Listener listener) {
            listener.stopped();
        }
    };

    public static abstract class Listener {
        public void failure(com.google.common.util.concurrent.Service service) {
        }

        public void healthy() {
        }

        public void stopped() {
        }
    }

    public ServiceManager(java.lang.Iterable<? extends com.google.common.util.concurrent.Service> services) {
        com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf(services);
        if (immutableListCopyOf.isEmpty()) {
            logger.get().log(java.util.logging.Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (java.lang.Throwable) new com.google.common.util.concurrent.ServiceManager.EmptyServiceManagerWarning());
            immutableListCopyOf = com.google.common.collect.ImmutableList.of(new com.google.common.util.concurrent.ServiceManager.NoOpService());
        }
        com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = new com.google.common.util.concurrent.ServiceManager.ServiceManagerState(immutableListCopyOf);
        this.state = serviceManagerState;
        this.services = immutableListCopyOf;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(serviceManagerState);
        com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it = immutableListCopyOf.iterator();
        while (it.hasNext()) {
            com.google.common.util.concurrent.Service next = it.next();
            next.addListener(new com.google.common.util.concurrent.ServiceManager.ServiceListener(next, weakReference), com.google.common.util.concurrent.MoreExecutors.directExecutor());
            com.google.common.base.Preconditions.checkArgument(next.state() == com.google.common.util.concurrent.Service.State.NEW, "Can only manage NEW services, %s", next);
        }
        this.state.markReady();
    }

    public void addListener(com.google.common.util.concurrent.ServiceManager.Listener listener, java.util.concurrent.Executor executor) {
        this.state.addListener(listener, executor);
    }

    public com.google.common.util.concurrent.ServiceManager startAsync() {
        com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it = this.services.iterator();
        while (it.hasNext()) {
            com.google.common.base.Preconditions.checkState(it.next().state() == com.google.common.util.concurrent.Service.State.NEW, "Not all services are NEW, cannot start %s", this);
        }
        com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it2 = this.services.iterator();
        while (it2.hasNext()) {
            com.google.common.util.concurrent.Service next = it2.next();
            try {
                this.state.tryStartTiming(next);
                next.startAsync();
            } catch (java.lang.IllegalStateException e) {
                logger.get().log(java.util.logging.Level.WARNING, "Unable to start Service " + next, (java.lang.Throwable) e);
            }
        }
        return this;
    }

    public void awaitHealthy() {
        this.state.awaitHealthy();
    }

    public void awaitHealthy(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException {
        this.state.awaitHealthy(timeout, unit);
    }

    public com.google.common.util.concurrent.ServiceManager stopAsync() {
        com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it = this.services.iterator();
        while (it.hasNext()) {
            it.next().stopAsync();
        }
        return this;
    }

    public void awaitStopped() {
        this.state.awaitStopped();
    }

    public void awaitStopped(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException {
        this.state.awaitStopped(timeout, unit);
    }

    public boolean isHealthy() {
        com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it = this.services.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.util.concurrent.ServiceManagerBridge
    public com.google.common.collect.ImmutableSetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState() {
        return this.state.servicesByState();
    }

    public com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service, java.lang.Long> startupTimes() {
        return this.state.startupTimes();
    }

    public java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper((java.lang.Class<?>) com.google.common.util.concurrent.ServiceManager.class).add("services", com.google.common.collect.Collections2.filter(this.services, com.google.common.base.Predicates.not(com.google.common.base.Predicates.instanceOf(com.google.common.util.concurrent.ServiceManager.NoOpService.class)))).toString();
    }

    private static final class ServiceManagerState {
        final com.google.common.util.concurrent.Monitor.Guard awaitHealthGuard;
        final com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager.Listener> listeners;
        final com.google.common.util.concurrent.Monitor monitor = new com.google.common.util.concurrent.Monitor();
        final int numberOfServices;
        boolean ready;
        final com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState;
        final java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> startupTimers;
        final com.google.common.collect.Multiset<com.google.common.util.concurrent.Service.State> states;
        final com.google.common.util.concurrent.Monitor.Guard stoppedGuard;
        boolean transitioned;

        final class AwaitHealthGuard extends com.google.common.util.concurrent.Monitor.Guard {
            AwaitHealthGuard() {
                super(com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.monitor);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public boolean isSatisfied() {
                return com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.count(com.google.common.util.concurrent.Service.State.RUNNING) == com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.numberOfServices || com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.contains(com.google.common.util.concurrent.Service.State.STOPPING) || com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.contains(com.google.common.util.concurrent.Service.State.TERMINATED) || com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.contains(com.google.common.util.concurrent.Service.State.FAILED);
            }
        }

        final class StoppedGuard extends com.google.common.util.concurrent.Monitor.Guard {
            StoppedGuard() {
                super(com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.monitor);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public boolean isSatisfied() {
                return com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.count(com.google.common.util.concurrent.Service.State.TERMINATED) + com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.states.count(com.google.common.util.concurrent.Service.State.FAILED) == com.google.common.util.concurrent.ServiceManager.ServiceManagerState.this.numberOfServices;
            }
        }

        ServiceManagerState(com.google.common.collect.ImmutableCollection<com.google.common.util.concurrent.Service> services) {
            com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> setMultimapBuild = com.google.common.collect.MultimapBuilder.enumKeys(com.google.common.util.concurrent.Service.State.class).linkedHashSetValues().build();
            this.servicesByState = setMultimapBuild;
            this.states = setMultimapBuild.keys();
            this.startupTimers = com.google.common.collect.Maps.newIdentityHashMap();
            this.awaitHealthGuard = new com.google.common.util.concurrent.ServiceManager.ServiceManagerState.AwaitHealthGuard();
            this.stoppedGuard = new com.google.common.util.concurrent.ServiceManager.ServiceManagerState.StoppedGuard();
            this.listeners = new com.google.common.util.concurrent.ListenerCallQueue<>();
            this.numberOfServices = services.size();
            setMultimapBuild.putAll(com.google.common.util.concurrent.Service.State.NEW, services);
        }

        void tryStartTiming(com.google.common.util.concurrent.Service service) {
            this.monitor.enter();
            try {
                if (this.startupTimers.get(service) == null) {
                    this.startupTimers.put(service, com.google.common.base.Stopwatch.createStarted());
                }
            } finally {
                this.monitor.leave();
            }
        }

        void markReady() {
            this.monitor.enter();
            try {
                if (!this.transitioned) {
                    this.ready = true;
                    this.monitor.leave();
                    return;
                }
                java.util.ArrayList arrayListNewArrayList = com.google.common.collect.Lists.newArrayList();
                com.google.common.collect.UnmodifiableIterator<com.google.common.util.concurrent.Service> it = servicesByState().values().iterator();
                while (it.hasNext()) {
                    com.google.common.util.concurrent.Service next = it.next();
                    if (next.state() != com.google.common.util.concurrent.Service.State.NEW) {
                        arrayListNewArrayList.add(next);
                    }
                }
                throw new java.lang.IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + arrayListNewArrayList);
            } catch (java.lang.Throwable th) {
                this.monitor.leave();
                throw th;
            }
        }

        void addListener(com.google.common.util.concurrent.ServiceManager.Listener listener, java.util.concurrent.Executor executor) {
            this.listeners.addListener(listener, executor);
        }

        void awaitHealthy() {
            this.monitor.enterWhenUninterruptibly(this.awaitHealthGuard);
            try {
                checkHealthy();
            } finally {
                this.monitor.leave();
            }
        }

        void awaitHealthy(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException {
            this.monitor.enter();
            try {
                if (!this.monitor.waitForUninterruptibly(this.awaitHealthGuard, timeout, unit)) {
                    throw new java.util.concurrent.TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + com.google.common.collect.Multimaps.filterKeys((com.google.common.collect.SetMultimap) this.servicesByState, com.google.common.base.Predicates.in(com.google.common.collect.ImmutableSet.of(com.google.common.util.concurrent.Service.State.NEW, com.google.common.util.concurrent.Service.State.STARTING))));
                }
                checkHealthy();
                this.monitor.leave();
            } catch (java.lang.Throwable th) {
                this.monitor.leave();
                throw th;
            }
        }

        void awaitStopped() {
            this.monitor.enterWhenUninterruptibly(this.stoppedGuard);
            this.monitor.leave();
        }

        void awaitStopped(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException {
            this.monitor.enter();
            try {
                if (!this.monitor.waitForUninterruptibly(this.stoppedGuard, timeout, unit)) {
                    throw new java.util.concurrent.TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + com.google.common.collect.Multimaps.filterKeys((com.google.common.collect.SetMultimap) this.servicesByState, com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(java.util.EnumSet.of(com.google.common.util.concurrent.Service.State.TERMINATED, com.google.common.util.concurrent.Service.State.FAILED)))));
                }
                this.monitor.leave();
            } catch (java.lang.Throwable th) {
                this.monitor.leave();
                throw th;
            }
        }

        com.google.common.collect.ImmutableSetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState() {
            com.google.common.collect.ImmutableSetMultimap.Builder builder = com.google.common.collect.ImmutableSetMultimap.builder();
            this.monitor.enter();
            try {
                for (java.util.Map.Entry<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> entry : this.servicesByState.entries()) {
                    if (!(entry.getValue() instanceof com.google.common.util.concurrent.ServiceManager.NoOpService)) {
                        builder.put((java.util.Map.Entry) entry);
                    }
                }
                this.monitor.leave();
                return builder.build();
            } catch (java.lang.Throwable th) {
                this.monitor.leave();
                throw th;
            }
        }

        com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service, java.lang.Long> startupTimes() {
            this.monitor.enter();
            try {
                java.util.ArrayList arrayListNewArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(this.startupTimers.size());
                for (java.util.Map.Entry<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> entry : this.startupTimers.entrySet()) {
                    com.google.common.util.concurrent.Service key = entry.getKey();
                    com.google.common.base.Stopwatch value = entry.getValue();
                    if (!value.isRunning() && !(key instanceof com.google.common.util.concurrent.ServiceManager.NoOpService)) {
                        arrayListNewArrayListWithCapacity.add(com.google.common.collect.Maps.immutableEntry(key, java.lang.Long.valueOf(value.elapsed(java.util.concurrent.TimeUnit.MILLISECONDS))));
                    }
                }
                this.monitor.leave();
                java.util.Collections.sort(arrayListNewArrayListWithCapacity, com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function<java.util.Map.Entry<com.google.common.util.concurrent.Service, java.lang.Long>, java.lang.Long>(this) { // from class: com.google.common.util.concurrent.ServiceManager.ServiceManagerState.1
                    @Override // com.google.common.base.Function
                    public java.lang.Long apply(java.util.Map.Entry<com.google.common.util.concurrent.Service, java.lang.Long> input) {
                        return input.getValue();
                    }
                }));
                return com.google.common.collect.ImmutableMap.copyOf(arrayListNewArrayListWithCapacity);
            } catch (java.lang.Throwable th) {
                this.monitor.leave();
                throw th;
            }
        }

        void transitionService(final com.google.common.util.concurrent.Service service, com.google.common.util.concurrent.Service.State from, com.google.common.util.concurrent.Service.State to) throws java.lang.Exception {
            com.google.common.base.Preconditions.checkNotNull(service);
            com.google.common.base.Preconditions.checkArgument(from != to);
            this.monitor.enter();
            try {
                this.transitioned = true;
                if (this.ready) {
                    com.google.common.base.Preconditions.checkState(this.servicesByState.remove(from, service), "Service %s not at the expected location in the state map %s", service, from);
                    com.google.common.base.Preconditions.checkState(this.servicesByState.put(to, service), "Service %s in the state map unexpectedly at %s", service, to);
                    com.google.common.base.Stopwatch stopwatchCreateStarted = this.startupTimers.get(service);
                    if (stopwatchCreateStarted == null) {
                        stopwatchCreateStarted = com.google.common.base.Stopwatch.createStarted();
                        this.startupTimers.put(service, stopwatchCreateStarted);
                    }
                    if (to.compareTo(com.google.common.util.concurrent.Service.State.RUNNING) >= 0 && stopwatchCreateStarted.isRunning()) {
                        stopwatchCreateStarted.stop();
                        if (!(service instanceof com.google.common.util.concurrent.ServiceManager.NoOpService)) {
                            com.google.common.util.concurrent.ServiceManager.logger.get().log(java.util.logging.Level.FINE, "Started {0} in {1}.", new java.lang.Object[]{service, stopwatchCreateStarted});
                        }
                    }
                    if (to == com.google.common.util.concurrent.Service.State.FAILED) {
                        enqueueFailedEvent(service);
                    }
                    if (this.states.count(com.google.common.util.concurrent.Service.State.RUNNING) == this.numberOfServices) {
                        enqueueHealthyEvent();
                    } else if (this.states.count(com.google.common.util.concurrent.Service.State.TERMINATED) + this.states.count(com.google.common.util.concurrent.Service.State.FAILED) == this.numberOfServices) {
                        enqueueStoppedEvent();
                    }
                }
            } finally {
                this.monitor.leave();
                dispatchListenerEvents();
            }
        }

        void enqueueStoppedEvent() {
            this.listeners.enqueue(com.google.common.util.concurrent.ServiceManager.STOPPED_EVENT);
        }

        void enqueueHealthyEvent() {
            this.listeners.enqueue(com.google.common.util.concurrent.ServiceManager.HEALTHY_EVENT);
        }

        void enqueueFailedEvent(final com.google.common.util.concurrent.Service service) {
            this.listeners.enqueue(new com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener>(this) { // from class: com.google.common.util.concurrent.ServiceManager.ServiceManagerState.2
                @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
                public void call(com.google.common.util.concurrent.ServiceManager.Listener listener) {
                    listener.failure(service);
                }

                public java.lang.String toString() {
                    return "failed({service=" + service + "})";
                }
            });
        }

        void dispatchListenerEvents() throws java.lang.Exception {
            com.google.common.base.Preconditions.checkState(!this.monitor.isOccupiedByCurrentThread(), "It is incorrect to execute listeners with the monitor held.");
            this.listeners.dispatch();
        }

        void checkHealthy() {
            if (this.states.count(com.google.common.util.concurrent.Service.State.RUNNING) != this.numberOfServices) {
                throw new java.lang.IllegalStateException("Expected to be healthy after starting. The following services are not running: " + com.google.common.collect.Multimaps.filterKeys((com.google.common.collect.SetMultimap) this.servicesByState, com.google.common.base.Predicates.not(com.google.common.base.Predicates.equalTo(com.google.common.util.concurrent.Service.State.RUNNING))));
            }
        }
    }

    private static final class ServiceListener extends com.google.common.util.concurrent.Service.Listener {
        final com.google.common.util.concurrent.Service service;
        final java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager.ServiceManagerState> state;

        ServiceListener(com.google.common.util.concurrent.Service service, java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager.ServiceManagerState> state) {
            this.service = service;
            this.state = state;
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void starting() throws java.lang.Exception {
            com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                serviceManagerState.transitionService(this.service, com.google.common.util.concurrent.Service.State.NEW, com.google.common.util.concurrent.Service.State.STARTING);
                if (this.service instanceof com.google.common.util.concurrent.ServiceManager.NoOpService) {
                    return;
                }
                com.google.common.util.concurrent.ServiceManager.logger.get().log(java.util.logging.Level.FINE, "Starting {0}.", this.service);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void running() throws java.lang.Exception {
            com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                serviceManagerState.transitionService(this.service, com.google.common.util.concurrent.Service.State.STARTING, com.google.common.util.concurrent.Service.State.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void stopping(com.google.common.util.concurrent.Service.State from) throws java.lang.Exception {
            com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                serviceManagerState.transitionService(this.service, from, com.google.common.util.concurrent.Service.State.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(com.google.common.util.concurrent.Service.State from) throws java.lang.Exception {
            com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                if (!(this.service instanceof com.google.common.util.concurrent.ServiceManager.NoOpService)) {
                    com.google.common.util.concurrent.ServiceManager.logger.get().log(java.util.logging.Level.FINE, "Service {0} has terminated. Previous state was: {1}", new java.lang.Object[]{this.service, from});
                }
                serviceManagerState.transitionService(this.service, from, com.google.common.util.concurrent.Service.State.TERMINATED);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(com.google.common.util.concurrent.Service.State from, java.lang.Throwable failure) throws java.lang.Exception {
            com.google.common.util.concurrent.ServiceManager.ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                if (!(this.service instanceof com.google.common.util.concurrent.ServiceManager.NoOpService)) {
                    com.google.common.util.concurrent.ServiceManager.logger.get().log(java.util.logging.Level.SEVERE, "Service " + this.service + " has failed in the " + from + " state.", failure);
                }
                serviceManagerState.transitionService(this.service, from, com.google.common.util.concurrent.Service.State.FAILED);
            }
        }
    }

    private static final class NoOpService extends com.google.common.util.concurrent.AbstractService {
        private NoOpService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStart() {
            notifyStarted();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStop() {
            notifyStopped();
        }
    }

    private static final class EmptyServiceManagerWarning extends java.lang.Throwable {
        private EmptyServiceManagerWarning() {
        }
    }
}
