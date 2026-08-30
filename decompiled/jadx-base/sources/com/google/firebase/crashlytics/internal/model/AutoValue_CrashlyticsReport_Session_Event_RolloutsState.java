package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState {
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> rolloutAssignments;

    private AutoValue_CrashlyticsReport_Session_Event_RolloutsState(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> list) {
        this.rolloutAssignments = list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
    @com.google.firebase.encoders.annotations.Encodable.Field(name = "assignments")
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutAssignments() {
        return this.rolloutAssignments;
    }

    public java.lang.String toString() {
        return "RolloutsState{rolloutAssignments=" + this.rolloutAssignments + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState) {
            return this.rolloutAssignments.equals(((com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    public int hashCode() {
        return this.rolloutAssignments.hashCode() ^ 1000003;
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder {
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> rolloutAssignments;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null rolloutAssignments");
            }
            this.rolloutAssignments = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState build() {
            if (this.rolloutAssignments == null) {
                throw new java.lang.IllegalStateException("Missing required properties: rolloutAssignments");
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState(this.rolloutAssignments);
        }
    }
}
