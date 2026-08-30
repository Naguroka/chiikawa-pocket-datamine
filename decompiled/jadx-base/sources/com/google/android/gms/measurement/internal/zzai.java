package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzai extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzai> CREATOR = new com.google.android.gms.measurement.internal.zzaj();
    public java.lang.String zza;
    public java.lang.String zzb;
    public com.google.android.gms.measurement.internal.zzqb zzc;
    public long zzd;
    public boolean zze;
    public java.lang.String zzf;
    public final com.google.android.gms.measurement.internal.zzbh zzg;
    public long zzh;
    public com.google.android.gms.measurement.internal.zzbh zzi;
    public final long zzj;
    public final com.google.android.gms.measurement.internal.zzbh zzk;

    zzai(com.google.android.gms.measurement.internal.zzai zzaiVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar);
        this.zza = zzaiVar.zza;
        this.zzb = zzaiVar.zzb;
        this.zzc = zzaiVar.zzc;
        this.zzd = zzaiVar.zzd;
        this.zze = zzaiVar.zze;
        this.zzf = zzaiVar.zzf;
        this.zzg = zzaiVar.zzg;
        this.zzh = zzaiVar.zzh;
        this.zzi = zzaiVar.zzi;
        this.zzj = zzaiVar.zzj;
        this.zzk = zzaiVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzai(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzqb zzqbVar, long j, boolean z, java.lang.String str3, com.google.android.gms.measurement.internal.zzbh zzbhVar, long j2, com.google.android.gms.measurement.internal.zzbh zzbhVar2, long j3, com.google.android.gms.measurement.internal.zzbh zzbhVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqbVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbhVar;
        this.zzh = j2;
        this.zzi = zzbhVar2;
        this.zzj = j3;
        this.zzk = zzbhVar3;
    }
}
