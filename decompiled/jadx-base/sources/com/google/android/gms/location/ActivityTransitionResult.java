package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityTransitionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.ActivityTransitionResult> CREATOR = new com.google.android.gms.location.zzp();
    private final java.util.List<com.google.android.gms.location.ActivityTransitionEvent> zza;
    private android.os.Bundle zzb;

    public ActivityTransitionResult(java.util.List<com.google.android.gms.location.ActivityTransitionEvent> list) {
        this.zzb = null;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                com.google.android.gms.common.internal.Preconditions.checkArgument(list.get(i).getElapsedRealTimeNanos() >= list.get(i + (-1)).getElapsedRealTimeNanos());
            }
        }
        this.zza = java.util.Collections.unmodifiableList(list);
    }

    public static com.google.android.gms.location.ActivityTransitionResult extractResult(android.content.Intent intent) {
        if (hasResult(intent)) {
            return (com.google.android.gms.location.ActivityTransitionResult) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public static boolean hasResult(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((com.google.android.gms.location.ActivityTransitionResult) obj).zza);
    }

    public java.util.List<com.google.android.gms.location.ActivityTransitionEvent> getTransitionEvents() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getTransitionEvents(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public ActivityTransitionResult(java.util.List<com.google.android.gms.location.ActivityTransitionEvent> list, android.os.Bundle bundle) {
        this(list);
        this.zzb = bundle;
    }
}
