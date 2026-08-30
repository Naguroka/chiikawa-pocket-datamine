package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_EventStoreConfig extends com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    private AutoValue_EventStoreConfig(long j, int i, int i2, long j2, int i3) {
        this.maxStorageSizeInBytes = j;
        this.loadBatchSize = i;
        this.criticalSectionEnterTimeoutMs = i2;
        this.eventCleanUpAge = j2;
        this.maxBlobByteSizePerRow = i3;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    long getMaxStorageSizeInBytes() {
        return this.maxStorageSizeInBytes;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    int getLoadBatchSize() {
        return this.loadBatchSize;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    int getCriticalSectionEnterTimeoutMs() {
        return this.criticalSectionEnterTimeoutMs;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    long getEventCleanUpAge() {
        return this.eventCleanUpAge;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    int getMaxBlobByteSizePerRow() {
        return this.maxBlobByteSizePerRow;
    }

    public java.lang.String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.maxStorageSizeInBytes + ", loadBatchSize=" + this.loadBatchSize + ", criticalSectionEnterTimeoutMs=" + this.criticalSectionEnterTimeoutMs + ", eventCleanUpAge=" + this.eventCleanUpAge + ", maxBlobByteSizePerRow=" + this.maxBlobByteSizePerRow + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig)) {
            return false;
        }
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig eventStoreConfig = (com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig) obj;
        return this.maxStorageSizeInBytes == eventStoreConfig.getMaxStorageSizeInBytes() && this.loadBatchSize == eventStoreConfig.getLoadBatchSize() && this.criticalSectionEnterTimeoutMs == eventStoreConfig.getCriticalSectionEnterTimeoutMs() && this.eventCleanUpAge == eventStoreConfig.getEventCleanUpAge() && this.maxBlobByteSizePerRow == eventStoreConfig.getMaxBlobByteSizePerRow();
    }

    public int hashCode() {
        long j = this.maxStorageSizeInBytes;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.loadBatchSize) * 1000003) ^ this.criticalSectionEnterTimeoutMs) * 1000003;
        long j2 = this.eventCleanUpAge;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.maxBlobByteSizePerRow;
    }

    static final class Builder extends com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder {
        private java.lang.Integer criticalSectionEnterTimeoutMs;
        private java.lang.Long eventCleanUpAge;
        private java.lang.Integer loadBatchSize;
        private java.lang.Integer maxBlobByteSizePerRow;
        private java.lang.Long maxStorageSizeInBytes;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setMaxStorageSizeInBytes(long j) {
            this.maxStorageSizeInBytes = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setLoadBatchSize(int i) {
            this.loadBatchSize = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int i) {
            this.criticalSectionEnterTimeoutMs = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setEventCleanUpAge(long j) {
            this.eventCleanUpAge = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setMaxBlobByteSizePerRow(int i) {
            this.maxBlobByteSizePerRow = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig build() {
            java.lang.String str = this.maxStorageSizeInBytes == null ? " maxStorageSizeInBytes" : "";
            if (this.loadBatchSize == null) {
                str = str + " loadBatchSize";
            }
            if (this.criticalSectionEnterTimeoutMs == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.eventCleanUpAge == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.maxBlobByteSizePerRow == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig(this.maxStorageSizeInBytes.longValue(), this.loadBatchSize.intValue(), this.criticalSectionEnterTimeoutMs.intValue(), this.eventCleanUpAge.longValue(), this.maxBlobByteSizePerRow.intValue());
        }
    }
}
