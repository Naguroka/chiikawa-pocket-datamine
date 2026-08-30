package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue {
    private final long delta;
    private final java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> flags;
    private final long maxAllowedDelay;

    private AutoValue_SchedulerConfig_ConfigValue(long j, long j2, java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> set) {
        this.delta = j;
        this.maxAllowedDelay = j2;
        this.flags = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    long getDelta() {
        return this.delta;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    long getMaxAllowedDelay() {
        return this.maxAllowedDelay;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> getFlags() {
        return this.flags;
    }

    public java.lang.String toString() {
        return "ConfigValue{delta=" + this.delta + ", maxAllowedDelay=" + this.maxAllowedDelay + ", flags=" + this.flags + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue)) {
            return false;
        }
        com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue configValue = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue) obj;
        return this.delta == configValue.getDelta() && this.maxAllowedDelay == configValue.getMaxAllowedDelay() && this.flags.equals(configValue.getFlags());
    }

    public int hashCode() {
        long j = this.delta;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.maxAllowedDelay;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.flags.hashCode();
    }

    static final class Builder extends com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder {
        private java.lang.Long delta;
        private java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> flags;
        private java.lang.Long maxAllowedDelay;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setDelta(long j) {
            this.delta = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j) {
            this.maxAllowedDelay = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setFlags(java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> set) {
            if (set == null) {
                throw new java.lang.NullPointerException("Null flags");
            }
            this.flags = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue build() {
            java.lang.String str = this.delta == null ? " delta" : "";
            if (this.maxAllowedDelay == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.flags == null) {
                str = str + " flags";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue(this.delta.longValue(), this.maxAllowedDelay.longValue(), this.flags);
        }
    }
}
