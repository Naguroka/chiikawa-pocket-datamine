package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzbh> CREATOR = new com.google.android.gms.measurement.internal.zzbi();
    public final java.lang.String zza;
    public final com.google.android.gms.measurement.internal.zzbf zzb;
    public final java.lang.String zzc;
    public final long zzd;

    zzbh(com.google.android.gms.measurement.internal.zzbh zzbhVar, long j) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbhVar);
        this.zza = zzbhVar.zza;
        this.zzb = zzbhVar.zzb;
        this.zzc = zzbhVar.zzc;
        this.zzd = j;
    }

    public final java.lang.String toString() {
        return "origin=" + this.zzc + ",name=" + this.zza + ",params=" + java.lang.String.valueOf(this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.measurement.internal.zzbi.zza(this, parcel, i);
    }

    public zzbh(java.lang.String str, com.google.android.gms.measurement.internal.zzbf zzbfVar, java.lang.String str2, long j) {
        this.zza = str;
        this.zzb = zzbfVar;
        this.zzc = str2;
        this.zzd = j;
    }
}
