package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzac extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.zzac> CREATOR = new com.google.android.gms.nearby.messages.internal.zzad();
    final int zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;

    zzac(int i, java.lang.String str, java.lang.String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.nearby.messages.internal.zzac) && hashCode() == obj.hashCode()) {
            com.google.android.gms.nearby.messages.internal.zzac zzacVar = (com.google.android.gms.nearby.messages.internal.zzac) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzb, zzacVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzacVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zzc);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzb;
        java.lang.String str2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 17 + java.lang.String.valueOf(str2).length());
        sb.append("namespace=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzac(java.lang.String str, java.lang.String str2) {
        this(1, str, str2);
    }
}
