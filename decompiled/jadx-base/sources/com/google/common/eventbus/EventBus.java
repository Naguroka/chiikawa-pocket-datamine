package com.google.common.eventbus;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
public class EventBus {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.eventbus.EventBus.class.getName());
    private final com.google.common.eventbus.Dispatcher dispatcher;
    private final com.google.common.eventbus.SubscriberExceptionHandler exceptionHandler;
    private final java.util.concurrent.Executor executor;
    private final java.lang.String identifier;
    private final com.google.common.eventbus.SubscriberRegistry subscribers;

    public EventBus() {
        this("default");
    }

    public EventBus(java.lang.String identifier) {
        this(identifier, com.google.common.util.concurrent.MoreExecutors.directExecutor(), com.google.common.eventbus.Dispatcher.perThreadDispatchQueue(), com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE);
    }

    public EventBus(com.google.common.eventbus.SubscriberExceptionHandler exceptionHandler) {
        this("default", com.google.common.util.concurrent.MoreExecutors.directExecutor(), com.google.common.eventbus.Dispatcher.perThreadDispatchQueue(), exceptionHandler);
    }

    EventBus(java.lang.String identifier, java.util.concurrent.Executor executor, com.google.common.eventbus.Dispatcher dispatcher, com.google.common.eventbus.SubscriberExceptionHandler exceptionHandler) {
        this.subscribers = new com.google.common.eventbus.SubscriberRegistry(this);
        this.identifier = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(identifier);
        this.executor = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull(executor);
        this.dispatcher = (com.google.common.eventbus.Dispatcher) com.google.common.base.Preconditions.checkNotNull(dispatcher);
        this.exceptionHandler = (com.google.common.eventbus.SubscriberExceptionHandler) com.google.common.base.Preconditions.checkNotNull(exceptionHandler);
    }

    public final java.lang.String identifier() {
        return this.identifier;
    }

    final java.util.concurrent.Executor executor() {
        return this.executor;
    }

    void handleSubscriberException(java.lang.Throwable e, com.google.common.eventbus.SubscriberExceptionContext context) {
        com.google.common.base.Preconditions.checkNotNull(e);
        com.google.common.base.Preconditions.checkNotNull(context);
        try {
            this.exceptionHandler.handleException(e, context);
        } catch (java.lang.Throwable th) {
            logger.log(java.util.logging.Level.SEVERE, java.lang.String.format(java.util.Locale.ROOT, "Exception %s thrown while handling exception: %s", th, e), th);
        }
    }

    public void register(java.lang.Object object) {
        this.subscribers.register(object);
    }

    public void unregister(java.lang.Object object) {
        this.subscribers.unregister(object);
    }

    public void post(java.lang.Object event) {
        java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers = this.subscribers.getSubscribers(event);
        if (subscribers.hasNext()) {
            this.dispatcher.dispatch(event, subscribers);
        } else {
            if (event instanceof com.google.common.eventbus.DeadEvent) {
                return;
            }
            post(new com.google.common.eventbus.DeadEvent(this, event));
        }
    }

    public java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).addValue(this.identifier).toString();
    }

    static final class LoggingHandler implements com.google.common.eventbus.SubscriberExceptionHandler {
        static final com.google.common.eventbus.EventBus.LoggingHandler INSTANCE = new com.google.common.eventbus.EventBus.LoggingHandler();

        LoggingHandler() {
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(java.lang.Throwable exception, com.google.common.eventbus.SubscriberExceptionContext context) {
            java.util.logging.Logger logger = logger(context);
            if (logger.isLoggable(java.util.logging.Level.SEVERE)) {
                logger.log(java.util.logging.Level.SEVERE, message(context), exception);
            }
        }

        private static java.util.logging.Logger logger(com.google.common.eventbus.SubscriberExceptionContext context) {
            return java.util.logging.Logger.getLogger(com.google.common.eventbus.EventBus.class.getName() + "." + context.getEventBus().identifier());
        }

        private static java.lang.String message(com.google.common.eventbus.SubscriberExceptionContext context) {
            java.lang.reflect.Method subscriberMethod = context.getSubscriberMethod();
            return "Exception thrown by subscriber method " + subscriberMethod.getName() + '(' + subscriberMethod.getParameterTypes()[0].getName() + ") on subscriber " + context.getSubscriber() + " when dispatching event: " + context.getEvent();
        }
    }
}
