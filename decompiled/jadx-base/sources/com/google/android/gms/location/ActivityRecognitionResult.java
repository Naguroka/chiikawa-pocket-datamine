package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityRecognitionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.ActivityRecognitionResult> CREATOR = new com.google.android.gms.location.zzk();
    java.util.List<com.google.android.gms.location.DetectedActivity> zza;
    long zzb;
    long zzc;
    int zzd;
    android.os.Bundle zze;

    public ActivityRecognitionResult(com.google.android.gms.location.DetectedActivity detectedActivity, long j, long j2) {
        this(java.util.Collections.singletonList(detectedActivity), j, j2, 0, null);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static com.google.android.gms.location.ActivityRecognitionResult extractResult(android.content.Intent intent) {
        android.os.Bundle extras;
        com.google.android.gms.location.ActivityRecognitionResult activityRecognitionResult;
        if (hasResult(intent) && (extras = intent.getExtras()) != null) {
            java.lang.Object obj = extras.get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (obj instanceof byte[]) {
                activityRecognitionResult = (com.google.android.gms.location.ActivityRecognitionResult) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes((byte[]) obj, CREATOR);
            } else if (obj instanceof com.google.android.gms.location.ActivityRecognitionResult) {
                activityRecognitionResult = (com.google.android.gms.location.ActivityRecognitionResult) obj;
            } else {
                activityRecognitionResult = null;
            }
        } else {
            activityRecognitionResult = null;
        }
        if (activityRecognitionResult != null) {
            return activityRecognitionResult;
        }
        java.util.List<com.google.android.gms.location.ActivityRecognitionResult> listZza = zza(intent);
        if (listZza == null || listZza.isEmpty()) {
            return null;
        }
        return listZza.get(listZza.size() - 1);
    }

    public static boolean hasResult(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        java.util.List<com.google.android.gms.location.ActivityRecognitionResult> listZza = zza(intent);
        return (listZza == null || listZza.isEmpty()) ? false : true;
    }

    public static java.util.List<com.google.android.gms.location.ActivityRecognitionResult> zza(android.content.Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    private static boolean zzb(android.os.Bundle bundle, android.os.Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (java.lang.String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            java.lang.Object obj = bundle.get(str);
            java.lang.Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof android.os.Bundle) {
                if (!zzb(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = java.lang.reflect.Array.getLength(obj)) == java.lang.reflect.Array.getLength(obj2)) {
                        for (int i = 0; i < length; i++) {
                            if (com.google.android.gms.common.internal.Objects.equal(java.lang.reflect.Array.get(obj, i), java.lang.reflect.Array.get(obj2, i))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.location.ActivityRecognitionResult activityRecognitionResult = (com.google.android.gms.location.ActivityRecognitionResult) obj;
            if (this.zzb == activityRecognitionResult.zzb && this.zzc == activityRecognitionResult.zzc && this.zzd == activityRecognitionResult.zzd && com.google.android.gms.common.internal.Objects.equal(this.zza, activityRecognitionResult.zza) && zzb(this.zze, activityRecognitionResult.zze)) {
                return true;
            }
        }
        return false;
    }

    public int getActivityConfidence(int i) {
        for (com.google.android.gms.location.DetectedActivity detectedActivity : this.zza) {
            if (detectedActivity.getType() == i) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzc;
    }

    public com.google.android.gms.location.DetectedActivity getMostProbableActivity() {
        return this.zza.get(0);
    }

    public java.util.List<com.google.android.gms.location.DetectedActivity> getProbableActivities() {
        return this.zza;
    }

    public long getTime() {
        return this.zzb;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zzb), java.lang.Long.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd), this.zza, this.zze);
    }

    public java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zza);
        long j = this.zzb;
        long j2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(strValueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append(com.ironsource.y8.i.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public ActivityRecognitionResult(java.util.List<com.google.android.gms.location.DetectedActivity> list, long j, long j2) {
        this(list, j, j2, 0, null);
    }

    public ActivityRecognitionResult(java.util.List<com.google.android.gms.location.DetectedActivity> list, long j, long j2, int i, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(list != null && list.size() > 0, "Must have at least 1 detected activity");
        com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0 && j2 > 0, "Must set times");
        this.zza = list;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = i;
        this.zze = bundle;
    }
}
