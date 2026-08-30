package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzafv extends com.google.android.gms.internal.ads.zzagh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzafv> CREATOR = new com.google.android.gms.internal.ads.zzafu();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    zzafv(android.os.Parcel parcel) {
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        super(string);
        this.zza = parcel.createByteArray();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzafv zzafvVar = (com.google.android.gms.internal.ads.zzafv) obj;
            if (this.zzf.equals(zzafvVar.zzf) && java.util.Arrays.equals(this.zza, zzafvVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzafv(java.lang.String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
