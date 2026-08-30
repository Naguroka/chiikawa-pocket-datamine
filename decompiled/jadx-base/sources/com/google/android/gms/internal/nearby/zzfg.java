package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfg extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzfg> CREATOR = new com.google.android.gms.internal.nearby.zzfh();
    private java.lang.String zza;
    private int zzb;
    private com.google.android.gms.nearby.connection.zzt zzc;

    private zzfg() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzfg) {
            com.google.android.gms.internal.nearby.zzfg zzfgVar = (com.google.android.gms.internal.nearby.zzfg) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzfgVar.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(zzfgVar.zzb)) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzfgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.nearby.connection.zzt zzc() {
        return this.zzc;
    }

    zzfg(java.lang.String str, int i, com.google.android.gms.nearby.connection.zzt zztVar) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zztVar;
    }
}
