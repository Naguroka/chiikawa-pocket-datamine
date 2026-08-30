package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzafx extends com.google.android.gms.internal.ads.zzagh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzafx> CREATOR = new com.google.android.gms.internal.ads.zzafw();
    public final java.lang.String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final com.google.android.gms.internal.ads.zzagh[] zzg;

    zzafx(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.ChapterFrame.ID);
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i2 = parcel.readInt();
        this.zzg = new com.google.android.gms.internal.ads.zzagh[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzg[i3] = (com.google.android.gms.internal.ads.zzagh) parcel.readParcelable(com.google.android.gms.internal.ads.zzagh.class.getClassLoader());
        }
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
            com.google.android.gms.internal.ads.zzafx zzafxVar = (com.google.android.gms.internal.ads.zzafx) obj;
            if (this.zzb == zzafxVar.zzb && this.zzc == zzafxVar.zzc && this.zzd == zzafxVar.zzd && this.zze == zzafxVar.zze && java.util.Objects.equals(this.zza, zzafxVar.zza) && java.util.Arrays.equals(this.zzg, zzafxVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        return ((((((((this.zzb + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (com.google.android.gms.internal.ads.zzagh zzaghVar : this.zzg) {
            parcel.writeParcelable(zzaghVar, 0);
        }
    }

    public zzafx(java.lang.String str, int i, int i2, long j, long j2, com.google.android.gms.internal.ads.zzagh[] zzaghVarArr) {
        super(androidx.media3.extractor.metadata.id3.ChapterFrame.ID);
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzaghVarArr;
    }
}
