package com.google.common.eventbus;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
class Subscriber {
    private com.google.common.eventbus.EventBus bus;
    private final java.util.concurrent.Executor executor;
    private final java.lang.reflect.Method method;
    final java.lang.Object target;

    static com.google.common.eventbus.Subscriber create(com.google.common.eventbus.EventBus bus, java.lang.Object listener, java.lang.reflect.Method method) {
        if (isDeclaredThreadSafe(method)) {
            return new com.google.common.eventbus.Subscriber(bus, listener, method);
        }
        return new com.google.common.eventbus.Subscriber.SynchronizedSubscriber(bus, listener, method);
    }

    private Subscriber(com.google.common.eventbus.EventBus bus, java.lang.Object target, java.lang.reflect.Method method) {
        this.bus = bus;
        this.target = com.google.common.base.Preconditions.checkNotNull(target);
        this.method = method;
        method.setAccessible(true);
        this.executor = bus.executor();
    }

    final void dispatchEvent(final java.lang.Object event) {
        this.executor.execute(new java.lang.Runnable() { // from class: com.google.common.eventbus.Subscriber$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m795lambda$dispatchEvent$0$comgooglecommoneventbusSubscriber(event);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$dispatchEvent$0$com-google-common-eventbus-Subscriber, reason: not valid java name */
    /* synthetic */ void m795lambda$dispatchEvent$0$comgooglecommoneventbusSubscriber(java.lang.Object obj) {
        try {
            invokeSubscriberMethod(obj);
        } catch (java.lang.reflect.InvocationTargetException e) {
            this.bus.handleSubscriberException(e.getCause(), context(obj));
        }
    }

    void invokeSubscriberMethod(java.lang.Object event) throws java.lang.reflect.InvocationTargetException {
        try {
            this.method.invoke(this.target, com.google.common.base.Preconditions.checkNotNull(event));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.Error("Method became inaccessible: " + event, e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new java.lang.Error("Method rejected target/argument: " + event, e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            if (e3.getCause() instanceof java.lang.Error) {
                throw ((java.lang.Error) e3.getCause());
            }
            throw e3;
        }
    }

    private com.google.common.eventbus.SubscriberExceptionContext context(java.lang.Object event) {
        return new com.google.common.eventbus.SubscriberExceptionContext(this.bus, event, this.target, this.method);
    }

    public final int hashCode() {
        return ((this.method.hashCode() + 31) * 31) + java.lang.System.identityHashCode(this.target);
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof com.google.common.eventbus.Subscriber)) {
            return false;
        }
        com.google.common.eventbus.Subscriber subscriber = (com.google.common.eventbus.Subscriber) obj;
        return this.target == subscriber.target && this.method.equals(subscriber.method);
    }

    private static boolean isDeclaredThreadSafe(java.lang.reflect.Method method) {
        return method.getAnnotation(com.google.common.eventbus.AllowConcurrentEvents.class) != null;
    }

    static final class SynchronizedSubscriber extends com.google.common.eventbus.Subscriber {
        private SynchronizedSubscriber(com.google.common.eventbus.EventBus bus, java.lang.Object target, java.lang.reflect.Method method) {
            super(bus, target, method);
        }

        @Override // com.google.common.eventbus.Subscriber
        void invokeSubscriberMethod(java.lang.Object event) throws java.lang.reflect.InvocationTargetException {
            synchronized (this) {
                super.invokeSubscriberMethod(event);
            }
        }
    }
}
