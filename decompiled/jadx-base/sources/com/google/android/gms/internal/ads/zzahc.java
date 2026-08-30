package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzahc implements com.google.android.gms.internal.ads.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzahc> CREATOR = new com.google.android.gms.internal.ads.zzaha();
    public final float zza;
    public final int zzb;

    public zzahc(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    /* synthetic */ zzahc(android.os.Parcel parcel, com.google.android.gms.internal.ads.zzahb zzahbVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
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
            com.google.android.gms.internal.ads.zzahc zzahcVar = (com.google.android.gms.internal.ads.zzahc) obj;
            if (this.zza == zzahcVar.zza && this.zzb == zzahcVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((java.lang.Float.valueOf(this.zza).hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }

    public final java.lang.String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
    }
}
