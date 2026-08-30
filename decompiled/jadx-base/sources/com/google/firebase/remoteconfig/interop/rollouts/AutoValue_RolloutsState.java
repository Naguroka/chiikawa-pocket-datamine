package com.google.firebase.remoteconfig.interop.rollouts;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_RolloutsState extends com.google.firebase.remoteconfig.interop.rollouts.RolloutsState {
    private final java.util.Set<com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment> rolloutAssignments;

    AutoValue_RolloutsState(java.util.Set<com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment> set) {
        if (set == null) {
            throw new java.lang.NullPointerException("Null rolloutAssignments");
        }
        this.rolloutAssignments = set;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsState
    public java.util.Set<com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment> getRolloutAssignments() {
        return this.rolloutAssignments;
    }

    public java.lang.String toString() {
        return "RolloutsState{rolloutAssignments=" + this.rolloutAssignments + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.firebase.remoteconfig.interop.rollouts.RolloutsState) {
            return this.rolloutAssignments.equals(((com.google.firebase.remoteconfig.interop.rollouts.RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    public int hashCode() {
        return this.rolloutAssignments.hashCode() ^ 1000003;
    }
}
