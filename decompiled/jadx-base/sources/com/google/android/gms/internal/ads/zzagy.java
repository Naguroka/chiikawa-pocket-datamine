package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzagy implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagy> CREATOR = new com.google.android.gms.internal.ads.zzagx();
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzagy(long j, long j2, int i) {
        com.google.android.gms.internal.ads.zzcw.zzd(j < j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
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
            com.google.android.gms.internal.ads.zzagy zzagyVar = (com.google.android.gms.internal.ads.zzagy) obj;
            if (this.zza == zzagyVar.zza && this.zzb == zzagyVar.zzb && this.zzc == zzagyVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc)});
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeInt(this.zzc);
    }
}
