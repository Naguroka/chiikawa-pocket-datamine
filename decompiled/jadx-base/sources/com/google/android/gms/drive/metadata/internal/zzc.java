package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzc extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.zzc> CREATOR = new com.google.android.gms.drive.metadata.internal.zzd();
    final java.lang.String value;
    final com.google.android.gms.drive.metadata.CustomPropertyKey zzje;

    public zzc(com.google.android.gms.drive.metadata.CustomPropertyKey customPropertyKey, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(customPropertyKey, com.ironsource.y8.h.W);
        this.zzje = customPropertyKey;
        this.value = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzje, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.value, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzje, this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            com.google.android.gms.drive.metadata.internal.zzc zzcVar = (com.google.android.gms.drive.metadata.internal.zzc) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzje, zzcVar.zzje) && com.google.android.gms.common.internal.Objects.equal(this.value, zzcVar.value)) {
                return true;
            }
        }
        return false;
    }
}
