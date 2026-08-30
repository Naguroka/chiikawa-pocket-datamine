package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class LogEventDropped {
    private static final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped DEFAULT_INSTANCE = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Builder().build();
    private final long events_dropped_count_;
    private final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reason_;

    LogEventDropped(long j, com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reason) {
        this.events_dropped_count_ = j;
        this.reason_ = reason;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Builder newBuilder() {
        return new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Builder();
    }

    public long getEventsDroppedCount() {
        return this.events_dropped_count_;
    }

    public com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason getReason() {
        return this.reason_;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.LogEventDropped getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder {
        private long events_dropped_count_ = 0;
        private com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reason_ = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.REASON_UNKNOWN;

        Builder() {
        }

        public com.google.android.datatransport.runtime.firebase.transport.LogEventDropped build() {
            return new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped(this.events_dropped_count_, this.reason_);
        }

        public com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Builder setEventsDroppedCount(long j) {
            this.events_dropped_count_ = j;
            return this;
        }

        public com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Builder setReason(com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reason) {
            this.reason_ = reason;
            return this;
        }
    }

    public enum Reason implements com.google.firebase.encoders.proto.ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }
}
