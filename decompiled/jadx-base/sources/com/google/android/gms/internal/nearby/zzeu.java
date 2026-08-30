package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzeu> CREATOR = new com.google.android.gms.internal.nearby.zzev();
    private java.lang.String zza;
    private int zzb;
    private final int zzc;

    private zzeu() {
        this.zzc = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzeu) {
            com.google.android.gms.internal.nearby.zzeu zzeuVar = (com.google.android.gms.internal.nearby.zzeu) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzeuVar.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(zzeuVar.zzb)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(zzeuVar.zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    zzeu(java.lang.String str, int i, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
    }
}
