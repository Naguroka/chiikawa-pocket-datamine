package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
class EventBus implements com.google.firebase.events.Subscriber, com.google.firebase.events.Publisher {
    private final java.util.concurrent.Executor defaultExecutor;
    private final java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> handlerMap = new java.util.HashMap();
    private java.util.Queue<com.google.firebase.events.Event<?>> pendingEvents = new java.util.ArrayDeque();

    EventBus(java.util.concurrent.Executor executor) {
        this.defaultExecutor = executor;
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(final com.google.firebase.events.Event<?> event) {
        com.google.firebase.components.Preconditions.checkNotNull(event);
        synchronized (this) {
            java.util.Queue<com.google.firebase.events.Event<?>> queue = this.pendingEvents;
            if (queue != null) {
                queue.add(event);
                return;
            }
            for (final java.util.Map.Entry<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor> entry : getHandlers(event)) {
                entry.getValue().execute(new java.lang.Runnable() { // from class: com.google.firebase.components.EventBus$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.firebase.events.EventHandler) entry.getKey()).handle(event);
                    }
                });
            }
        }
    }

    private synchronized java.util.Set<java.util.Map.Entry<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> getHandlers(com.google.firebase.events.Event<?> event) {
        java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor> concurrentHashMap;
        concurrentHashMap = this.handlerMap.get(event.getType());
        return concurrentHashMap == null ? java.util.Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(java.lang.Class<T> cls, java.util.concurrent.Executor executor, com.google.firebase.events.EventHandler<? super T> eventHandler) {
        com.google.firebase.components.Preconditions.checkNotNull(cls);
        com.google.firebase.components.Preconditions.checkNotNull(eventHandler);
        com.google.firebase.components.Preconditions.checkNotNull(executor);
        if (!this.handlerMap.containsKey(cls)) {
            this.handlerMap.put(cls, new java.util.concurrent.ConcurrentHashMap<>());
        }
        this.handlerMap.get(cls).put(eventHandler, executor);
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(java.lang.Class<T> cls, com.google.firebase.events.EventHandler<? super T> eventHandler) {
        subscribe(cls, this.defaultExecutor, eventHandler);
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void unsubscribe(java.lang.Class<T> cls, com.google.firebase.events.EventHandler<? super T> eventHandler) {
        com.google.firebase.components.Preconditions.checkNotNull(cls);
        com.google.firebase.components.Preconditions.checkNotNull(eventHandler);
        if (this.handlerMap.containsKey(cls)) {
            java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor> concurrentHashMap = this.handlerMap.get(cls);
            concurrentHashMap.remove(eventHandler);
            if (concurrentHashMap.isEmpty()) {
                this.handlerMap.remove(cls);
            }
        }
    }

    void enablePublishingAndFlushPending() {
        java.util.Queue<com.google.firebase.events.Event<?>> queue;
        synchronized (this) {
            queue = this.pendingEvents;
            if (queue != null) {
                this.pendingEvents = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            java.util.Iterator<com.google.firebase.events.Event<?>> it = queue.iterator();
            while (it.hasNext()) {
                publish(it.next());
            }
        }
    }
}
