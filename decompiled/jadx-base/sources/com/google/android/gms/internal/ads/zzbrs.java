package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbrs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbrs> CREATOR = new com.google.android.gms.internal.ads.zzbrt();
    public final int zza;
    public final int zzb;
    public final int zzc;

    zzbrs(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static com.google.android.gms.internal.ads.zzbrs zza(com.google.android.gms.ads.VersionInfo versionInfo) {
        return new com.google.android.gms.internal.ads.zzbrs(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.internal.ads.zzbrs)) {
            com.google.android.gms.internal.ads.zzbrs zzbrsVar = (com.google.android.gms.internal.ads.zzbrs) obj;
            if (zzbrsVar.zzc == this.zzc && zzbrsVar.zzb == this.zzb && zzbrsVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final java.lang.String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
