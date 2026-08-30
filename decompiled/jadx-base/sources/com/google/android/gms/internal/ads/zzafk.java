package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzafk implements com.google.android.gms.internal.ads.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzafk> CREATOR;
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzaa(androidx.media3.common.MimeTypes.APPLICATION_ID3);
        zzzVar.zzag();
        com.google.android.gms.internal.ads.zzz zzzVar2 = new com.google.android.gms.internal.ads.zzz();
        zzzVar2.zzaa(androidx.media3.common.MimeTypes.APPLICATION_SCTE35);
        zzzVar2.zzag();
        CREATOR = new com.google.android.gms.internal.ads.zzafj();
    }

    zzafk(android.os.Parcel parcel) {
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }

    public zzafk(java.lang.String str, java.lang.String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
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
            com.google.android.gms.internal.ads.zzafk zzafkVar = (com.google.android.gms.internal.ads.zzafk) obj;
            if (this.zzc == zzafkVar.zzc && this.zzd == zzafkVar.zzd && java.util.Objects.equals(this.zza, zzafkVar.zza) && java.util.Objects.equals(this.zzb, zzafkVar.zzb) && java.util.Arrays.equals(this.zze, zzafkVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        java.lang.String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = iHashCode + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j = this.zzc;
        long j2 = this.zzd;
        int iHashCode3 = (((((((i2 * 31) + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + java.util.Arrays.hashCode(this.zze);
        this.zzf = iHashCode3;
        return iHashCode3;
    }

    public final java.lang.String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
    }
}
