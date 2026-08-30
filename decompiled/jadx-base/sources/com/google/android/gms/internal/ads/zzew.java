package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzew implements com.google.android.gms.internal.ads.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzew> CREATOR = new com.google.android.gms.internal.ads.zzeu();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzew(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    /* synthetic */ zzew(android.os.Parcel parcel, com.google.android.gms.internal.ads.zzev zzevVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzew)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzew zzewVar = (com.google.android.gms.internal.ads.zzew) obj;
        return this.zza == zzewVar.zza && this.zzb == zzewVar.zzb && this.zzc == zzewVar.zzc;
    }

    public final int hashCode() {
        long j = this.zza;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.zzc;
        long j3 = this.zzb;
        return ((((i + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final java.lang.String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
    }
}
