package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzago extends com.google.android.gms.internal.ads.zzagh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzago> CREATOR = new com.google.android.gms.internal.ads.zzagn();
    public final java.lang.String zza;
    public final byte[] zzb;

    zzago(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.PrivFrame.ID);
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zza = string;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzago zzagoVar = (com.google.android.gms.internal.ads.zzago) obj;
            if (java.util.Objects.equals(this.zza, zzagoVar.zza) && java.util.Arrays.equals(this.zzb, zzagoVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        return (((str != null ? str.hashCode() : 0) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final java.lang.String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzago(java.lang.String str, byte[] bArr) {
        super(androidx.media3.extractor.metadata.id3.PrivFrame.ID);
        this.zza = str;
        this.zzb = bArr;
    }
}
