package com.google.firebase.crashlytics.internal;

/* JADX INFO: compiled from: CrashlyticsRemoteConfigListener.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener;", "Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsStateSubscriber;", "userMetadata", "Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;", "(Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;)V", "onRolloutsStateChanged", "", "rolloutsState", "Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsState;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CrashlyticsRemoteConfigListener implements com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber {
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata;

    public CrashlyticsRemoteConfigListener(com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.userMetadata = userMetadata;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber
    public void onRolloutsStateChanged(com.google.firebase.remoteconfig.interop.rollouts.RolloutsState rolloutsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rolloutsState, "rolloutsState");
        com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata = this.userMetadata;
        java.util.Set<com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment> rolloutAssignments = rolloutsState.getRolloutAssignments();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rolloutAssignments, "rolloutsState.rolloutAssignments");
        java.util.Set<com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment> set = rolloutAssignments;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
        for (com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment rolloutAssignment : set) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.create(rolloutAssignment.getRolloutId(), rolloutAssignment.getParameterKey(), rolloutAssignment.getParameterValue(), rolloutAssignment.getVariantId(), rolloutAssignment.getTemplateVersion()));
        }
        userMetadata.updateRolloutsState(arrayList);
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Updated Crashlytics Rollout State");
    }
}
