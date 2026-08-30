package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaft extends com.google.android.gms.internal.ads.zzagh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzaft> CREATOR = new com.google.android.gms.internal.ads.zzafs();
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final int zzc;
    public final byte[] zzd;

    zzaft(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.ApicFrame.ID);
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzaft zzaftVar = (com.google.android.gms.internal.ads.zzaft) obj;
            if (this.zzc == zzaftVar.zzc && java.util.Objects.equals(this.zza, zzaftVar.zza) && java.util.Objects.equals(this.zzb, zzaftVar.zzb) && java.util.Arrays.equals(this.zzd, zzaftVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        java.lang.String str2 = this.zzb;
        return ((((((i + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final java.lang.String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagh, com.google.android.gms.internal.ads.zzax
    public final void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
        zzatVar.zza(this.zzd, this.zzc);
    }

    public zzaft(java.lang.String str, java.lang.String str2, int i, byte[] bArr) {
        super(androidx.media3.extractor.metadata.id3.ApicFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
