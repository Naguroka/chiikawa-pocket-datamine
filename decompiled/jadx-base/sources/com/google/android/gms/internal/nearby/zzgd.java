package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzgd> CREATOR = new com.google.android.gms.internal.nearby.zzge();
    private long zza;
    private int zzb;
    private byte[] zzc;
    private android.os.ParcelFileDescriptor zzd;
    private java.lang.String zze;
    private long zzf;
    private android.os.ParcelFileDescriptor zzg;
    private android.net.Uri zzh;
    private long zzi;
    private boolean zzj;
    private com.google.android.gms.internal.nearby.zzfz zzk;

    private zzgd() {
        this.zzf = -1L;
        this.zzi = 0L;
        this.zzj = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzgd) {
            com.google.android.gms.internal.nearby.zzgd zzgdVar = (com.google.android.gms.internal.nearby.zzgd) obj;
            if (com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(zzgdVar.zza)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(zzgdVar.zzb)) && java.util.Arrays.equals(this.zzc, zzgdVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzgdVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzgdVar.zze) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzf), java.lang.Long.valueOf(zzgdVar.zzf)) && com.google.android.gms.common.internal.Objects.equal(this.zzg, zzgdVar.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, zzgdVar.zzh) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzi), java.lang.Long.valueOf(zzgdVar.zzi)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzj), java.lang.Boolean.valueOf(zzgdVar.zzj)) && com.google.android.gms.common.internal.Objects.equal(this.zzk, zzgdVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzc)), this.zzd, this.zze, java.lang.Long.valueOf(this.zzf), this.zzg, this.zzh, java.lang.Long.valueOf(this.zzi), java.lang.Boolean.valueOf(this.zzj), this.zzk);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final long zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final byte[] zzc() {
        return this.zzc;
    }

    public final android.os.ParcelFileDescriptor zzd() {
        return this.zzd;
    }

    public final java.lang.String zze() {
        return this.zze;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final android.os.ParcelFileDescriptor zzg() {
        return this.zzg;
    }

    public final android.net.Uri zzh() {
        return this.zzh;
    }

    public final com.google.android.gms.internal.nearby.zzfz zzi() {
        return this.zzk;
    }

    zzgd(long j, int i, byte[] bArr, android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str, long j2, android.os.ParcelFileDescriptor parcelFileDescriptor2, android.net.Uri uri, long j3, boolean z, com.google.android.gms.internal.nearby.zzfz zzfzVar) {
        this.zza = j;
        this.zzb = i;
        this.zzc = bArr;
        this.zzd = parcelFileDescriptor;
        this.zze = str;
        this.zzf = j2;
        this.zzg = parcelFileDescriptor2;
        this.zzh = uri;
        this.zzi = j3;
        this.zzj = z;
        this.zzk = zzfzVar;
    }

    /* synthetic */ zzgd(com.google.android.gms.internal.nearby.zzgb zzgbVar) {
        this.zzf = -1L;
        this.zzi = 0L;
        this.zzj = false;
    }
}
