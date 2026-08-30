package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzafz extends com.google.android.gms.internal.ads.zzagh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzafz> CREATOR = new com.google.android.gms.internal.ads.zzafy();
    public final java.lang.String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final java.lang.String[] zzd;
    private final com.google.android.gms.internal.ads.zzagh[] zze;

    zzafz(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.ChapterTocFrame.ID);
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.zze = new com.google.android.gms.internal.ads.zzagh[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zze[i3] = (com.google.android.gms.internal.ads.zzagh) parcel.readParcelable(com.google.android.gms.internal.ads.zzagh.class.getClassLoader());
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzafz zzafzVar = (com.google.android.gms.internal.ads.zzafz) obj;
            if (this.zzb == zzafzVar.zzb && this.zzc == zzafzVar.zzc && java.util.Objects.equals(this.zza, zzafzVar.zza) && java.util.Arrays.equals(this.zzd, zzafzVar.zzd) && java.util.Arrays.equals(this.zze, zzafzVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        return (((((this.zzb ? 1 : 0) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (com.google.android.gms.internal.ads.zzagh zzaghVar : this.zze) {
            parcel.writeParcelable(zzaghVar, 0);
        }
    }

    public zzafz(java.lang.String str, boolean z, boolean z2, java.lang.String[] strArr, com.google.android.gms.internal.ads.zzagh[] zzaghVarArr) {
        super(androidx.media3.extractor.metadata.id3.ChapterTocFrame.ID);
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzaghVarArr;
    }
}
