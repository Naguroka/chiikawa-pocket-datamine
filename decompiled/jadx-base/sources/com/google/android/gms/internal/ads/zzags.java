package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzags extends com.google.android.gms.internal.ads.zzagh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzags> CREATOR = new com.google.android.gms.internal.ads.zzagr();
    public final java.lang.String zza;
    public final java.lang.String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    zzags(android.os.Parcel parcel) {
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        super(string);
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzags zzagsVar = (com.google.android.gms.internal.ads.zzags) obj;
            if (this.zzf.equals(zzagsVar.zzf) && java.util.Objects.equals(this.zza, zzagsVar.zza) && java.util.Objects.equals(this.zzb, zzagsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        java.lang.String str = this.zza;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i = iHashCode * 31;
        java.lang.String str2 = this.zzb;
        return ((i + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final java.lang.String toString() {
        return this.zzf + ": url=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzags(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}
