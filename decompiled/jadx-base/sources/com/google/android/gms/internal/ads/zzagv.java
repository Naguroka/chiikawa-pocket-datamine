package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzagv implements com.google.android.gms.internal.ads.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagv> CREATOR = new com.google.android.gms.internal.ads.zzagt();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzagv(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    /* synthetic */ zzagv(android.os.Parcel parcel, com.google.android.gms.internal.ads.zzagu zzaguVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzagv zzagvVar = (com.google.android.gms.internal.ads.zzagv) obj;
            if (this.zza == zzagvVar.zza && this.zzb == zzagvVar.zzb && this.zzc == zzagvVar.zzc && this.zzd == zzagvVar.zzd && this.zze == zzagvVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.zze;
        long j3 = this.zzd;
        long j4 = this.zzc;
        long j5 = this.zzb;
        return ((((((((i + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final java.lang.String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
    }
}
