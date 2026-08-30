package com.google.common.eventbus;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
public class SubscriberExceptionContext {
    private final java.lang.Object event;
    private final com.google.common.eventbus.EventBus eventBus;
    private final java.lang.Object subscriber;
    private final java.lang.reflect.Method subscriberMethod;

    SubscriberExceptionContext(com.google.common.eventbus.EventBus eventBus, java.lang.Object event, java.lang.Object subscriber, java.lang.reflect.Method subscriberMethod) {
        this.eventBus = (com.google.common.eventbus.EventBus) com.google.common.base.Preconditions.checkNotNull(eventBus);
        this.event = com.google.common.base.Preconditions.checkNotNull(event);
        this.subscriber = com.google.common.base.Preconditions.checkNotNull(subscriber);
        this.subscriberMethod = (java.lang.reflect.Method) com.google.common.base.Preconditions.checkNotNull(subscriberMethod);
    }

    public com.google.common.eventbus.EventBus getEventBus() {
        return this.eventBus;
    }

    public java.lang.Object getEvent() {
        return this.event;
    }

    public java.lang.Object getSubscriber() {
        return this.subscriber;
    }

    public java.lang.reflect.Method getSubscriberMethod() {
        return this.subscriberMethod;
    }
}
