package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzfo> CREATOR = new com.google.android.gms.internal.nearby.zzfp();
    private java.lang.String zza;
    private com.google.android.gms.nearby.connection.PayloadTransferUpdate zzb;

    private zzfo() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzfo) {
            com.google.android.gms.internal.nearby.zzfo zzfoVar = (com.google.android.gms.internal.nearby.zzfo) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzfoVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzfoVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final com.google.android.gms.nearby.connection.PayloadTransferUpdate zzb() {
        return this.zzb;
    }

    zzfo(java.lang.String str, com.google.android.gms.nearby.connection.PayloadTransferUpdate payloadTransferUpdate) {
        this.zza = str;
        this.zzb = payloadTransferUpdate;
    }
}
