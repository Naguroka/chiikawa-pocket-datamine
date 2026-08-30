package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzhj> CREATOR = new com.google.android.gms.internal.nearby.zzhk();
    public static final com.google.android.gms.internal.nearby.zzhj zza = new com.google.android.gms.internal.nearby.zzhj(1, "", null);
    final int zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    zzhj(int i, java.lang.String str, java.lang.String str2) {
        this.zzb = ((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(java.lang.Integer.valueOf(i))).intValue();
        this.zzc = str == null ? "" : str;
        this.zzd = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.nearby.zzhj)) {
            return false;
        }
        com.google.android.gms.internal.nearby.zzhj zzhjVar = (com.google.android.gms.internal.nearby.zzhj) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzc, zzhjVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzhjVar.zzd);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzc, this.zzd);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzc;
        java.lang.String str2 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + java.lang.String.valueOf(str2).length());
        sb.append("NearbyDevice{handle=");
        sb.append(str);
        sb.append(", bluetoothAddress=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
