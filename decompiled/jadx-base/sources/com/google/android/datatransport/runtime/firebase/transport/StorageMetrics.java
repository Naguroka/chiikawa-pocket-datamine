package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class StorageMetrics {
    private static final com.google.android.datatransport.runtime.firebase.transport.StorageMetrics DEFAULT_INSTANCE = new com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder().build();
    private final long current_cache_size_bytes_;
    private final long max_cache_size_bytes_;

    StorageMetrics(long j, long j2) {
        this.current_cache_size_bytes_ = j;
        this.max_cache_size_bytes_ = j2;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder newBuilder() {
        return new com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder();
    }

    public long getCurrentCacheSizeBytes() {
        return this.current_cache_size_bytes_;
    }

    public long getMaxCacheSizeBytes() {
        return this.max_cache_size_bytes_;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.StorageMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder {
        private long current_cache_size_bytes_ = 0;
        private long max_cache_size_bytes_ = 0;

        Builder() {
        }

        public com.google.android.datatransport.runtime.firebase.transport.StorageMetrics build() {
            return new com.google.android.datatransport.runtime.firebase.transport.StorageMetrics(this.current_cache_size_bytes_, this.max_cache_size_bytes_);
        }

        public com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder setCurrentCacheSizeBytes(long j) {
            this.current_cache_size_bytes_ = j;
            return this;
        }

        public com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder setMaxCacheSizeBytes(long j) {
            this.max_cache_size_bytes_ = j;
            return this;
        }
    }
}
