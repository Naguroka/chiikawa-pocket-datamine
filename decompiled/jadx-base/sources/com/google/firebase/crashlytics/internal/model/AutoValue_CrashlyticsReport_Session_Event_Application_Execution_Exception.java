package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception {
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception causedBy;
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
    private final int overflowCount;
    private final java.lang.String reason;
    private final java.lang.String type;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(java.lang.String str, java.lang.String str2, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i) {
        this.type = str;
        this.reason = str2;
        this.frames = list;
        this.causedBy = exception;
        this.overflowCount = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public java.lang.String getType() {
        return this.type;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public java.lang.String getReason() {
        return this.reason;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.frames;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception getCausedBy() {
        return this.causedBy;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public int getOverflowCount() {
        return this.overflowCount;
    }

    public java.lang.String toString() {
        return "Exception{type=" + this.type + ", reason=" + this.reason + ", frames=" + this.frames + ", causedBy=" + this.causedBy + ", overflowCount=" + this.overflowCount + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        return this.type.equals(exception2.getType()) && ((str = this.reason) != null ? str.equals(exception2.getReason()) : exception2.getReason() == null) && this.frames.equals(exception2.getFrames()) && ((exception = this.causedBy) != null ? exception.equals(exception2.getCausedBy()) : exception2.getCausedBy() == null) && this.overflowCount == exception2.getOverflowCount();
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        java.lang.String str = this.reason;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.frames.hashCode()) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.causedBy;
        return ((iHashCode2 ^ (exception != null ? exception.hashCode() : 0)) * 1000003) ^ this.overflowCount;
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception causedBy;
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
        private int overflowCount;
        private java.lang.String reason;
        private byte set$0;
        private java.lang.String type;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null type");
            }
            this.type = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(java.lang.String str) {
            this.reason = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null frames");
            }
            this.frames = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.causedBy = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int i) {
            this.overflowCount = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception build() {
            if (this.set$0 != 1 || this.type == null || this.frames == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.type == null) {
                    sb.append(" type");
                }
                if (this.frames == null) {
                    sb.append(" frames");
                }
                if ((1 & this.set$0) == 0) {
                    sb.append(" overflowCount");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(this.type, this.reason, this.frames, this.causedBy, this.overflowCount);
        }
    }
}
