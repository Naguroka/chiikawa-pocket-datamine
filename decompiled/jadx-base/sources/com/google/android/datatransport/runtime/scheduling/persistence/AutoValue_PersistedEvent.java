package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PersistedEvent extends com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent {
    private final com.google.android.datatransport.runtime.EventInternal event;
    private final long id;
    private final com.google.android.datatransport.runtime.TransportContext transportContext;

    AutoValue_PersistedEvent(long j, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        this.id = j;
        if (transportContext == null) {
            throw new java.lang.NullPointerException("Null transportContext");
        }
        this.transportContext = transportContext;
        if (eventInternal == null) {
            throw new java.lang.NullPointerException("Null event");
        }
        this.event = eventInternal;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public long getId() {
        return this.id;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public com.google.android.datatransport.runtime.TransportContext getTransportContext() {
        return this.transportContext;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public com.google.android.datatransport.runtime.EventInternal getEvent() {
        return this.event;
    }

    public java.lang.String toString() {
        return "PersistedEvent{id=" + this.id + ", transportContext=" + this.transportContext + ", event=" + this.event + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent)) {
            return false;
        }
        com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent persistedEvent = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) obj;
        return this.id == persistedEvent.getId() && this.transportContext.equals(persistedEvent.getTransportContext()) && this.event.equals(persistedEvent.getEvent());
    }

    public int hashCode() {
        long j = this.id;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.transportContext.hashCode()) * 1000003) ^ this.event.hashCode();
    }
}
