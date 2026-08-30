package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeWindow {
    private static final com.google.android.datatransport.runtime.firebase.transport.TimeWindow DEFAULT_INSTANCE = new com.google.android.datatransport.runtime.firebase.transport.TimeWindow.Builder().build();
    private final long end_ms_;
    private final long start_ms_;

    TimeWindow(long j, long j2) {
        this.start_ms_ = j;
        this.end_ms_ = j2;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.TimeWindow.Builder newBuilder() {
        return new com.google.android.datatransport.runtime.firebase.transport.TimeWindow.Builder();
    }

    public long getStartMs() {
        return this.start_ms_;
    }

    public long getEndMs() {
        return this.end_ms_;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.TimeWindow getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder {
        private long start_ms_ = 0;
        private long end_ms_ = 0;

        Builder() {
        }

        public com.google.android.datatransport.runtime.firebase.transport.TimeWindow build() {
            return new com.google.android.datatransport.runtime.firebase.transport.TimeWindow(this.start_ms_, this.end_ms_);
        }

        public com.google.android.datatransport.runtime.firebase.transport.TimeWindow.Builder setStartMs(long j) {
            this.start_ms_ = j;
            return this;
        }

        public com.google.android.datatransport.runtime.firebase.transport.TimeWindow.Builder setEndMs(long j) {
            this.end_ms_ = j;
            return this;
        }
    }
}
