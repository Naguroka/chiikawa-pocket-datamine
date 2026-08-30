package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzagd extends com.google.android.gms.internal.ads.zzagh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagd> CREATOR = new com.google.android.gms.internal.ads.zzagc();
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final byte[] zzd;

    zzagd(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.GeobFrame.ID);
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzagd zzagdVar = (com.google.android.gms.internal.ads.zzagd) obj;
            if (java.util.Objects.equals(this.zza, zzagdVar.zza) && java.util.Objects.equals(this.zzb, zzagdVar.zzb) && java.util.Objects.equals(this.zzc, zzagdVar.zzc) && java.util.Arrays.equals(this.zzd, zzagdVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = iHashCode + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        java.lang.String str3 = this.zzc;
        return (((((i * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final java.lang.String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", filename=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzagd(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super(androidx.media3.extractor.metadata.id3.GeobFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
