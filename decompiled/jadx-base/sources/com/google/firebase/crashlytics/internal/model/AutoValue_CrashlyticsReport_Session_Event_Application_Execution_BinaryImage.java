package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {
    private final long baseAddress;
    private final java.lang.String name;
    private final long size;
    private final java.lang.String uuid;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long j, long j2, java.lang.String str, java.lang.String str2) {
        this.baseAddress = j;
        this.size = j2;
        this.name = str;
        this.uuid = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public long getBaseAddress() {
        return this.baseAddress;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public long getSize() {
        return this.size;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public java.lang.String getName() {
        return this.name;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @com.google.firebase.encoders.annotations.Encodable.Ignore
    public java.lang.String getUuid() {
        return this.uuid;
    }

    public java.lang.String toString() {
        return "BinaryImage{baseAddress=" + this.baseAddress + ", size=" + this.size + ", name=" + this.name + ", uuid=" + this.uuid + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.baseAddress == binaryImage.getBaseAddress() && this.size == binaryImage.getSize() && this.name.equals(binaryImage.getName())) {
            java.lang.String str = this.uuid;
            if (str == null) {
                if (binaryImage.getUuid() == null) {
                    return true;
                }
            } else if (str.equals(binaryImage.getUuid())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.baseAddress;
        long j2 = this.size;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.name.hashCode()) * 1000003;
        java.lang.String str = this.uuid;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {
        private long baseAddress;
        private java.lang.String name;
        private byte set$0;
        private long size;
        private java.lang.String uuid;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long j) {
            this.baseAddress = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long j) {
            this.size = j;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null name");
            }
            this.name = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(java.lang.String str) {
            this.uuid = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build() {
            if (this.set$0 != 3 || this.name == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if ((this.set$0 & 1) == 0) {
                    sb.append(" baseAddress");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" size");
                }
                if (this.name == null) {
                    sb.append(" name");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(this.baseAddress, this.size, this.name, this.uuid);
        }
    }
}
