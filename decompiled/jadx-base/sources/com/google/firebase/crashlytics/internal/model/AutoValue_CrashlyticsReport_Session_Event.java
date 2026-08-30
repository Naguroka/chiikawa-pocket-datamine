package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Event extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event {
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application app;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device device;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log log;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState rollouts;
    private final long timestamp;
    private final java.lang.String type;

    private AutoValue_CrashlyticsReport_Session_Event(long j, java.lang.String str, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application application, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device device, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log log, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.timestamp = j;
        this.type = str;
        this.app = application;
        this.device = device;
        this.log = log;
        this.rollouts = rolloutsState;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public java.lang.String getType() {
        return this.type;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application getApp() {
        return this.app;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device getDevice() {
        return this.device;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log getLog() {
        return this.log;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState getRollouts() {
        return this.rollouts;
    }

    public java.lang.String toString() {
        return "Event{timestamp=" + this.timestamp + ", type=" + this.type + ", app=" + this.app + ", device=" + this.device + ", log=" + this.log + ", rollouts=" + this.rollouts + "}";
    }

    public boolean equals(java.lang.Object obj) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log log;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event) obj;
        if (this.timestamp == event.getTimestamp() && this.type.equals(event.getType()) && this.app.equals(event.getApp()) && this.device.equals(event.getDevice()) && ((log = this.log) != null ? log.equals(event.getLog()) : event.getLog() == null)) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.rollouts;
            if (rolloutsState == null) {
                if (event.getRollouts() == null) {
                    return true;
                }
            } else if (rolloutsState.equals(event.getRollouts())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.timestamp;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.app.hashCode()) * 1000003) ^ this.device.hashCode()) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log log = this.log;
        int iHashCode2 = (iHashCode ^ (log == null ? 0 : log.hashCode())) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.rollouts;
        return iHashCode2 ^ (rolloutsState != null ? rolloutsState.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder toBuilder() {
        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.Builder(this);
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder {
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application app;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device device;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log log;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState rollouts;
        private byte set$0;
        private long timestamp;
        private java.lang.String type;

        Builder() {
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event) {
            this.timestamp = event.getTimestamp();
            this.type = event.getType();
            this.app = event.getApp();
            this.device = event.getDevice();
            this.log = event.getLog();
            this.rollouts = event.getRollouts();
            this.set$0 = (byte) 1;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setTimestamp(long j) {
            this.timestamp = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setType(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null type");
            }
            this.type = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setApp(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application application) {
            if (application == null) {
                throw new java.lang.NullPointerException("Null app");
            }
            this.app = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setDevice(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device device) {
            if (device == null) {
                throw new java.lang.NullPointerException("Null device");
            }
            this.device = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setLog(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log log) {
            this.log = log;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setRollouts(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.rollouts = rolloutsState;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event build() {
            if (this.set$0 != 1 || this.type == null || this.app == null || this.device == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if ((1 & this.set$0) == 0) {
                    sb.append(" timestamp");
                }
                if (this.type == null) {
                    sb.append(" type");
                }
                if (this.app == null) {
                    sb.append(" app");
                }
                if (this.device == null) {
                    sb.append(" device");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event(this.timestamp, this.type, this.app, this.device, this.log, this.rollouts);
        }
    }
}
