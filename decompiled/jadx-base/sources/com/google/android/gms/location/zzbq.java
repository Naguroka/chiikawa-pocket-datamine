package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.zzbq> CREATOR = new com.google.android.gms.location.zzbr();
    private final java.util.List<java.lang.String> zza;
    private final android.app.PendingIntent zzb;
    private final java.lang.String zzc;

    zzbq(java.util.List<java.lang.String> list, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.zza = list == null ? com.google.android.gms.internal.location.zzbs.zzi() : com.google.android.gms.internal.location.zzbs.zzj(list);
        this.zzb = pendingIntent;
        this.zzc = str;
    }

    public static com.google.android.gms.location.zzbq zza(java.util.List<java.lang.String> list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "geofence can't be null.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!list.isEmpty(), "Geofences must contains at least one id.");
        return new com.google.android.gms.location.zzbq(list, null, "");
    }

    public static com.google.android.gms.location.zzbq zzb(android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent can not be null.");
        return new com.google.android.gms.location.zzbq(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
