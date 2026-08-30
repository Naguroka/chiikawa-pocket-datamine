package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzn implements java.util.Comparator<com.google.android.gms.location.ActivityTransition> {
    zzn() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(com.google.android.gms.location.ActivityTransition activityTransition, com.google.android.gms.location.ActivityTransition activityTransition2) {
        com.google.android.gms.location.ActivityTransition activityTransition3 = activityTransition;
        com.google.android.gms.location.ActivityTransition activityTransition4 = activityTransition2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activityTransition3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activityTransition4);
        int activityType = activityTransition3.getActivityType();
        int activityType2 = activityTransition4.getActivityType();
        if (activityType != activityType2) {
            return activityType >= activityType2 ? 1 : -1;
        }
        int transitionType = activityTransition3.getTransitionType();
        int transitionType2 = activityTransition4.getTransitionType();
        if (transitionType == transitionType2) {
            return 0;
        }
        return transitionType < transitionType2 ? -1 : 1;
    }
}
