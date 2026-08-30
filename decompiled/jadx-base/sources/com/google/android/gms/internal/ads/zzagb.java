package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzagb extends com.google.android.gms.internal.ads.zzagh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagb> CREATOR = new com.google.android.gms.internal.ads.zzaga();
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;

    zzagb(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.CommentFrame.ID);
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzagb zzagbVar = (com.google.android.gms.internal.ads.zzagb) obj;
            if (java.util.Objects.equals(this.zzb, zzagbVar.zzb) && java.util.Objects.equals(this.zza, zzagbVar.zza) && java.util.Objects.equals(this.zzc, zzagbVar.zzc)) {
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
        return (((i * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final java.lang.String toString() {
        return this.zzf + ": language=" + this.zza + ", description=" + this.zzb + ", text=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzagb(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(androidx.media3.extractor.metadata.id3.CommentFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
