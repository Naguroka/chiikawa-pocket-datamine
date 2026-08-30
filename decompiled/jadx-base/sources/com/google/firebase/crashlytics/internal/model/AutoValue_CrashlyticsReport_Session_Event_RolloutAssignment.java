package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment {
    private final java.lang.String parameterKey;
    private final java.lang.String parameterValue;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
    private final long templateVersion;

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, java.lang.String str, java.lang.String str2, long j) {
        this.rolloutVariant = rolloutVariant;
        this.parameterKey = str;
        this.parameterValue = str2;
        this.templateVersion = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant() {
        return this.rolloutVariant;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public java.lang.String getParameterKey() {
        return this.parameterKey;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public java.lang.String getParameterValue() {
        return this.parameterValue;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public long getTemplateVersion() {
        return this.templateVersion;
    }

    public java.lang.String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.rolloutVariant + ", parameterKey=" + this.parameterKey + ", parameterValue=" + this.parameterValue + ", templateVersion=" + this.templateVersion + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        return this.rolloutVariant.equals(rolloutAssignment.getRolloutVariant()) && this.parameterKey.equals(rolloutAssignment.getParameterKey()) && this.parameterValue.equals(rolloutAssignment.getParameterValue()) && this.templateVersion == rolloutAssignment.getTemplateVersion();
    }

    public int hashCode() {
        int iHashCode = (((((this.rolloutVariant.hashCode() ^ 1000003) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003;
        long j = this.templateVersion;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder {
        private java.lang.String parameterKey;
        private java.lang.String parameterValue;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
        private byte set$0;
        private long templateVersion;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant == null) {
                throw new java.lang.NullPointerException("Null rolloutVariant");
            }
            this.rolloutVariant = rolloutVariant;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null parameterKey");
            }
            this.parameterKey = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null parameterValue");
            }
            this.parameterValue = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long j) {
            this.templateVersion = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment build() {
            if (this.set$0 != 1 || this.rolloutVariant == null || this.parameterKey == null || this.parameterValue == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.rolloutVariant == null) {
                    sb.append(" rolloutVariant");
                }
                if (this.parameterKey == null) {
                    sb.append(" parameterKey");
                }
                if (this.parameterValue == null) {
                    sb.append(" parameterValue");
                }
                if ((1 & this.set$0) == 0) {
                    sb.append(" templateVersion");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(this.rolloutVariant, this.parameterKey, this.parameterValue, this.templateVersion);
        }
    }
}
