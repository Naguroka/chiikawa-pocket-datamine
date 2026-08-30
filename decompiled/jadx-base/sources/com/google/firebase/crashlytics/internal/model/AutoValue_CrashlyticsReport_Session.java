package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session {
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application app;
    private final java.lang.String appQualitySessionId;
    private final boolean crashed;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device;
    private final java.lang.Long endedAt;
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> events;
    private final java.lang.String generator;
    private final int generatorType;
    private final java.lang.String identifier;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem os;
    private final long startedAt;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User user;

    private AutoValue_CrashlyticsReport_Session(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.Long l, boolean z, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application application, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User user, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem operatingSystem, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> list, int i) {
        this.generator = str;
        this.identifier = str2;
        this.appQualitySessionId = str3;
        this.startedAt = j;
        this.endedAt = l;
        this.crashed = z;
        this.app = application;
        this.user = user;
        this.os = operatingSystem;
        this.device = device;
        this.events = list;
        this.generatorType = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public java.lang.String getGenerator() {
        return this.generator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @com.google.firebase.encoders.annotations.Encodable.Ignore
    public java.lang.String getIdentifier() {
        return this.identifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public java.lang.String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public long getStartedAt() {
        return this.startedAt;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public java.lang.Long getEndedAt() {
        return this.endedAt;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public boolean isCrashed() {
        return this.crashed;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application getApp() {
        return this.app;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User getUser() {
        return this.user;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.os;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device getDevice() {
        return this.device;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> getEvents() {
        return this.events;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public int getGeneratorType() {
        return this.generatorType;
    }

    public java.lang.String toString() {
        return "Session{generator=" + this.generator + ", identifier=" + this.identifier + ", appQualitySessionId=" + this.appQualitySessionId + ", startedAt=" + this.startedAt + ", endedAt=" + this.endedAt + ", crashed=" + this.crashed + ", app=" + this.app + ", user=" + this.user + ", os=" + this.os + ", device=" + this.device + ", events=" + this.events + ", generatorType=" + this.generatorType + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Long l;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User user;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem operatingSystem;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device;
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session) obj;
        return this.generator.equals(session.getGenerator()) && this.identifier.equals(session.getIdentifier()) && ((str = this.appQualitySessionId) != null ? str.equals(session.getAppQualitySessionId()) : session.getAppQualitySessionId() == null) && this.startedAt == session.getStartedAt() && ((l = this.endedAt) != null ? l.equals(session.getEndedAt()) : session.getEndedAt() == null) && this.crashed == session.isCrashed() && this.app.equals(session.getApp()) && ((user = this.user) != null ? user.equals(session.getUser()) : session.getUser() == null) && ((operatingSystem = this.os) != null ? operatingSystem.equals(session.getOs()) : session.getOs() == null) && ((device = this.device) != null ? device.equals(session.getDevice()) : session.getDevice() == null) && ((list = this.events) != null ? list.equals(session.getEvents()) : session.getEvents() == null) && this.generatorType == session.getGeneratorType();
    }

    public int hashCode() {
        int iHashCode = (((this.generator.hashCode() ^ 1000003) * 1000003) ^ this.identifier.hashCode()) * 1000003;
        java.lang.String str = this.appQualitySessionId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.startedAt;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        java.lang.Long l = this.endedAt;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.crashed ? 1231 : 1237)) * 1000003) ^ this.app.hashCode()) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User user = this.user;
        int iHashCode4 = (iHashCode3 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem operatingSystem = this.os;
        int iHashCode5 = (iHashCode4 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device = this.device;
        int iHashCode6 = (iHashCode5 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> list = this.events;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.generatorType;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder toBuilder() {
        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session.Builder(this);
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder {
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application app;
        private java.lang.String appQualitySessionId;
        private boolean crashed;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device;
        private java.lang.Long endedAt;
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> events;
        private java.lang.String generator;
        private int generatorType;
        private java.lang.String identifier;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem os;
        private byte set$0;
        private long startedAt;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User user;

        Builder() {
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session) {
            this.generator = session.getGenerator();
            this.identifier = session.getIdentifier();
            this.appQualitySessionId = session.getAppQualitySessionId();
            this.startedAt = session.getStartedAt();
            this.endedAt = session.getEndedAt();
            this.crashed = session.isCrashed();
            this.app = session.getApp();
            this.user = session.getUser();
            this.os = session.getOs();
            this.device = session.getDevice();
            this.events = session.getEvents();
            this.generatorType = session.getGeneratorType();
            this.set$0 = (byte) 7;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setGenerator(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null generator");
            }
            this.generator = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setIdentifier(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null identifier");
            }
            this.identifier = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setAppQualitySessionId(java.lang.String str) {
            this.appQualitySessionId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setStartedAt(long j) {
            this.startedAt = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setEndedAt(java.lang.Long l) {
            this.endedAt = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setCrashed(boolean z) {
            this.crashed = z;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setApp(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application application) {
            if (application == null) {
                throw new java.lang.NullPointerException("Null app");
            }
            this.app = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setUser(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User user) {
            this.user = user;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setOs(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.os = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setDevice(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device) {
            this.device = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setEvents(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> list) {
            this.events = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setGeneratorType(int i) {
            this.generatorType = i;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session build() {
            if (this.set$0 != 7 || this.generator == null || this.identifier == null || this.app == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.generator == null) {
                    sb.append(" generator");
                }
                if (this.identifier == null) {
                    sb.append(" identifier");
                }
                if ((this.set$0 & 1) == 0) {
                    sb.append(" startedAt");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" crashed");
                }
                if (this.app == null) {
                    sb.append(" app");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" generatorType");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session(this.generator, this.identifier, this.appQualitySessionId, this.startedAt, this.endedAt, this.crashed, this.app, this.user, this.os, this.device, this.events, this.generatorType);
        }
    }
}
