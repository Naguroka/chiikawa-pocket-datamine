package com.google.firebase.remoteconfig.interop.rollouts;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RolloutsState {
    public abstract java.util.Set<com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment> getRolloutAssignments();

    public static com.google.firebase.remoteconfig.interop.rollouts.RolloutsState create(java.util.Set<com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment> set) {
        return new com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutsState(set);
    }
}
