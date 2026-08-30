package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzagm extends com.google.android.gms.internal.ads.zzagh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagm> CREATOR = new com.google.android.gms.internal.ads.zzagl();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzagm(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(androidx.media3.extractor.metadata.id3.MlltFrame.ID);
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzagh, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzagm zzagmVar = (com.google.android.gms.internal.ads.zzagm) obj;
            if (this.zza == zzagmVar.zza && this.zzb == zzagmVar.zzb && this.zzc == zzagmVar.zzc && java.util.Arrays.equals(this.zzd, zzagmVar.zzd) && java.util.Arrays.equals(this.zze, zzagmVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + java.util.Arrays.hashCode(this.zzd)) * 31) + java.util.Arrays.hashCode(this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    zzagm(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.MlltFrame.ID);
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzd = iArrCreateIntArray;
        this.zze = parcel.createIntArray();
    }
}
