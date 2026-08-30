package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzet implements com.google.android.gms.internal.ads.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzet> CREATOR = new com.google.android.gms.internal.ads.zzer();
    public final float zza;
    public final float zzb;

    public zzet(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzcw.zze(z, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f2;
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
            com.google.android.gms.internal.ads.zzet zzetVar = (com.google.android.gms.internal.ads.zzet) obj;
            if (this.zza == zzetVar.zza && this.zzb == zzetVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((java.lang.Float.valueOf(this.zza).hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.lang.Float.valueOf(this.zzb).hashCode();
    }

    public final java.lang.String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
    }

    /* synthetic */ zzet(android.os.Parcel parcel, com.google.android.gms.internal.ads.zzes zzesVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }
}
