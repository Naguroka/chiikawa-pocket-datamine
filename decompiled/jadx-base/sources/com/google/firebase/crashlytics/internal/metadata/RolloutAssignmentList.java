package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes5.dex */
public class RolloutAssignmentList {
    static final java.lang.String ROLLOUTS_STATE = "rolloutsState";
    private final int maxEntries;
    private final java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> rolloutsState = new java.util.ArrayList();

    public RolloutAssignmentList(int i) {
        this.maxEntries = i;
    }

    public synchronized java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> getRolloutAssignmentList() {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.rolloutsState));
    }

    public synchronized boolean updateRolloutAssignmentList(java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> list) {
        this.rolloutsState.clear();
        if (list.size() > this.maxEntries) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.maxEntries);
            return this.rolloutsState.addAll(list.subList(0, this.maxEntries));
        }
        return this.rolloutsState.addAll(list);
    }

    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> getReportRolloutsState() {
        java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> rolloutAssignmentList = getRolloutAssignmentList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < rolloutAssignmentList.size(); i++) {
            arrayList.add(rolloutAssignmentList.get(i).toReportProto());
        }
        return arrayList;
    }
}
