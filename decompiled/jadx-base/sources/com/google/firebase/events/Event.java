package com.google.firebase.events;

/* JADX INFO: loaded from: classes5.dex */
public class Event<T> {
    private final T payload;
    private final java.lang.Class<T> type;

    public Event(java.lang.Class<T> cls, T t) {
        this.type = (java.lang.Class) com.google.firebase.components.Preconditions.checkNotNull(cls);
        this.payload = (T) com.google.firebase.components.Preconditions.checkNotNull(t);
    }

    public java.lang.Class<T> getType() {
        return this.type;
    }

    public T getPayload() {
        return this.payload;
    }

    public java.lang.String toString() {
        return java.lang.String.format("Event{type: %s, payload: %s}", this.type, this.payload);
    }
}
