package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: compiled from: EventMetadata.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/google/firebase/crashlytics/internal/metadata/EventMetadata;", "", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "", com.ironsource.aa.a.d, "", "additionalCustomKeys", "", "(Ljava/lang/String;JLjava/util/Map;)V", "getAdditionalCustomKeys", "()Ljava/util/Map;", "getSessionId", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EventMetadata {
    private final java.util.Map<java.lang.String, java.lang.String> additionalCustomKeys;
    private final java.lang.String sessionId;
    private final long timestamp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventMetadata(java.lang.String sessionId, long j) {
        this(sessionId, j, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.google.firebase.crashlytics.internal.metadata.EventMetadata copy$default(com.google.firebase.crashlytics.internal.metadata.EventMetadata eventMetadata, java.lang.String str, long j, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = eventMetadata.sessionId;
        }
        if ((i & 2) != 0) {
            j = eventMetadata.timestamp;
        }
        if ((i & 4) != 0) {
            map = eventMetadata.additionalCustomKeys;
        }
        return eventMetadata.copy(str, j, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component3() {
        return this.additionalCustomKeys;
    }

    public final com.google.firebase.crashlytics.internal.metadata.EventMetadata copy(java.lang.String sessionId, long timestamp, java.util.Map<java.lang.String, java.lang.String> additionalCustomKeys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        return new com.google.firebase.crashlytics.internal.metadata.EventMetadata(sessionId, timestamp, additionalCustomKeys);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.firebase.crashlytics.internal.metadata.EventMetadata)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.metadata.EventMetadata eventMetadata = (com.google.firebase.crashlytics.internal.metadata.EventMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, eventMetadata.sessionId) && this.timestamp == eventMetadata.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalCustomKeys, eventMetadata.additionalCustomKeys);
    }

    public int hashCode() {
        return (((this.sessionId.hashCode() * 31) + java.lang.Long.hashCode(this.timestamp)) * 31) + this.additionalCustomKeys.hashCode();
    }

    public java.lang.String toString() {
        return "EventMetadata(sessionId=" + this.sessionId + ", timestamp=" + this.timestamp + ", additionalCustomKeys=" + this.additionalCustomKeys + ')';
    }

    public EventMetadata(java.lang.String sessionId, long j, java.util.Map<java.lang.String, java.lang.String> additionalCustomKeys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.sessionId = sessionId;
        this.timestamp = j;
        this.additionalCustomKeys = additionalCustomKeys;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public /* synthetic */ EventMetadata(java.lang.String str, long j, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalCustomKeys() {
        return this.additionalCustomKeys;
    }
}
