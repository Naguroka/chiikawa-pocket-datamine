package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzu> CREATOR = new com.google.android.gms.common.zzv();
    private final boolean zza;

    @javax.annotation.Nullable
    private final java.lang.String zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    @javax.annotation.Nullable
    private final com.google.android.gms.common.zzu zzf;

    zzu(boolean z, java.lang.String str, int i, int i2, long j, com.google.android.gms.common.zzu zzuVar) {
        this.zza = z;
        this.zzb = str;
        this.zzc = com.google.android.gms.common.zzae.zza(i) - 1;
        this.zzd = com.google.android.gms.common.zze.zza(i2) - 1;
        this.zze = j;
        this.zzf = zzuVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final long zza() {
        return this.zze;
    }

    @javax.annotation.Nullable
    public final com.google.android.gms.common.zzu zzb() {
        return this.zzf;
    }

    @javax.annotation.Nullable
    public final java.lang.String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zza;
    }

    public final int zze() {
        return com.google.android.gms.common.zze.zza(this.zzd);
    }

    public final int zzf() {
        return com.google.android.gms.common.zzae.zza(this.zzc);
    }
}
