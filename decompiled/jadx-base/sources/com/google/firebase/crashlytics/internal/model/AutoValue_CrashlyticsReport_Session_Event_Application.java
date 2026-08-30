package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application {
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> appProcessDetails;
    private final java.lang.Boolean background;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails;
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> customAttributes;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution execution;
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> internalKeys;
    private final int uiOrientation;

    private AutoValue_CrashlyticsReport_Session_Event_Application(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution execution, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> list, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> list2, java.lang.Boolean bool, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> list3, int i) {
        this.execution = execution;
        this.customAttributes = list;
        this.internalKeys = list2;
        this.background = bool;
        this.currentProcessDetails = processDetails;
        this.appProcessDetails = list3;
        this.uiOrientation = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.execution;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.customAttributes;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> getInternalKeys() {
        return this.internalKeys;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public java.lang.Boolean getBackground() {
        return this.background;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public int getUiOrientation() {
        return this.uiOrientation;
    }

    public java.lang.String toString() {
        return "Application{execution=" + this.execution + ", customAttributes=" + this.customAttributes + ", internalKeys=" + this.internalKeys + ", background=" + this.background + ", currentProcessDetails=" + this.currentProcessDetails + ", appProcessDetails=" + this.appProcessDetails + ", uiOrientation=" + this.uiOrientation + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> list;
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> list2;
        java.lang.Boolean bool;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails;
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application application = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application) obj;
        return this.execution.equals(application.getExecution()) && ((list = this.customAttributes) != null ? list.equals(application.getCustomAttributes()) : application.getCustomAttributes() == null) && ((list2 = this.internalKeys) != null ? list2.equals(application.getInternalKeys()) : application.getInternalKeys() == null) && ((bool = this.background) != null ? bool.equals(application.getBackground()) : application.getBackground() == null) && ((processDetails = this.currentProcessDetails) != null ? processDetails.equals(application.getCurrentProcessDetails()) : application.getCurrentProcessDetails() == null) && ((list3 = this.appProcessDetails) != null ? list3.equals(application.getAppProcessDetails()) : application.getAppProcessDetails() == null) && this.uiOrientation == application.getUiOrientation();
    }

    public int hashCode() {
        int iHashCode = (this.execution.hashCode() ^ 1000003) * 1000003;
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> list = this.customAttributes;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> list2 = this.internalKeys;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        java.lang.Boolean bool = this.background;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.currentProcessDetails;
        int iHashCode5 = (iHashCode4 ^ (processDetails == null ? 0 : processDetails.hashCode())) * 1000003;
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> list3 = this.appProcessDetails;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.uiOrientation;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application.Builder(this);
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder {
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> appProcessDetails;
        private java.lang.Boolean background;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails;
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> customAttributes;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution execution;
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> internalKeys;
        private byte set$0;
        private int uiOrientation;

        Builder() {
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application application) {
            this.execution = application.getExecution();
            this.customAttributes = application.getCustomAttributes();
            this.internalKeys = application.getInternalKeys();
            this.background = application.getBackground();
            this.currentProcessDetails = application.getCurrentProcessDetails();
            this.appProcessDetails = application.getAppProcessDetails();
            this.uiOrientation = application.getUiOrientation();
            this.set$0 = (byte) 1;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setExecution(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution == null) {
                throw new java.lang.NullPointerException("Null execution");
            }
            this.execution = execution;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> list) {
            this.customAttributes = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> list) {
            this.internalKeys = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setBackground(java.lang.Boolean bool) {
            this.background = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setCurrentProcessDetails(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.currentProcessDetails = processDetails;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setAppProcessDetails(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> list) {
            this.appProcessDetails = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i) {
            this.uiOrientation = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application build() {
            if (this.set$0 != 1 || this.execution == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.execution == null) {
                    sb.append(" execution");
                }
                if ((1 & this.set$0) == 0) {
                    sb.append(" uiOrientation");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application(this.execution, this.customAttributes, this.internalKeys, this.background, this.currentProcessDetails, this.appProcessDetails, this.uiOrientation);
        }
    }
}
