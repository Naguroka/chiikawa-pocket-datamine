package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    final com.google.android.gms.location.zzs zzc;
    final java.util.List<com.google.android.gms.common.internal.ClientIdentity> zzd;
    final java.lang.String zze;
    static final java.util.List<com.google.android.gms.common.internal.ClientIdentity> zza = java.util.Collections.emptyList();
    static final com.google.android.gms.location.zzs zzb = new com.google.android.gms.location.zzs();
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzj> CREATOR = new com.google.android.gms.internal.location.zzk();

    zzj(com.google.android.gms.location.zzs zzsVar, java.util.List<com.google.android.gms.common.internal.ClientIdentity> list, java.lang.String str) {
        this.zzc = zzsVar;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.location.zzj)) {
            return false;
        }
        com.google.android.gms.internal.location.zzj zzjVar = (com.google.android.gms.internal.location.zzj) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzc, zzjVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzjVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzjVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.zzd);
        java.lang.String str = this.zze;
        int length = java.lang.String.valueOf(strValueOf).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 77 + java.lang.String.valueOf(strValueOf2).length() + java.lang.String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(strValueOf);
        sb.append(", clients=");
        sb.append(strValueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
