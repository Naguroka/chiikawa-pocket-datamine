package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzafr implements com.google.android.gms.internal.ads.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzafr> CREATOR = new com.google.android.gms.internal.ads.zzafq();
    public final int zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final java.lang.String zzd;
    public final boolean zze;
    public final int zzf;

    public zzafr(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z2);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i2;
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
            com.google.android.gms.internal.ads.zzafr zzafrVar = (com.google.android.gms.internal.ads.zzafr) obj;
            if (this.zza == zzafrVar.zza && java.util.Objects.equals(this.zzb, zzafrVar.zzb) && java.util.Objects.equals(this.zzc, zzafrVar.zzc) && java.util.Objects.equals(this.zzd, zzafrVar.zzd) && this.zze == zzafrVar.zze && this.zzf == zzafrVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zza;
        java.lang.String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((i + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode;
        java.lang.String str3 = this.zzd;
        return (((((((i2 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final java.lang.String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        int i2 = com.google.android.gms.internal.ads.zzei.zza;
        parcel.writeInt(this.zze ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
        java.lang.String str = this.zzc;
        if (str != null) {
            zzatVar.zzp(str);
        }
        java.lang.String str2 = this.zzb;
        if (str2 != null) {
            zzatVar.zzi(str2);
        }
    }

    zzafr(android.os.Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }
}
