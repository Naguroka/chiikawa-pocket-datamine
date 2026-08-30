package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal {
    private final long address;
    private final java.lang.String code;
    private final java.lang.String name;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(java.lang.String str, java.lang.String str2, long j) {
        this.name = str;
        this.code = str2;
        this.address = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public java.lang.String getName() {
        return this.name;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public java.lang.String getCode() {
        return this.code;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public long getAddress() {
        return this.address;
    }

    public java.lang.String toString() {
        return "Signal{name=" + this.name + ", code=" + this.code + ", address=" + this.address + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        return this.name.equals(signal.getName()) && this.code.equals(signal.getCode()) && this.address == signal.getAddress();
    }

    public int hashCode() {
        int iHashCode = (((this.name.hashCode() ^ 1000003) * 1000003) ^ this.code.hashCode()) * 1000003;
        long j = this.address;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {
        private long address;
        private java.lang.String code;
        private java.lang.String name;
        private byte set$0;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null name");
            }
            this.name = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null code");
            }
            this.code = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j) {
            this.address = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
            if (this.set$0 != 1 || this.name == null || this.code == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.name == null) {
                    sb.append(" name");
                }
                if (this.code == null) {
                    sb.append(" code");
                }
                if ((1 & this.set$0) == 0) {
                    sb.append(" address");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(this.name, this.code, this.address);
        }
    }
}
