package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzfm> CREATOR = new com.google.android.gms.internal.nearby.zzfn();
    private java.lang.String zza;
    private com.google.android.gms.internal.nearby.zzgd zzb;
    private boolean zzc;

    private zzfm() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzfm) {
            com.google.android.gms.internal.nearby.zzfm zzfmVar = (com.google.android.gms.internal.nearby.zzfm) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzfmVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzfmVar.zzb) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(zzfmVar.zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, java.lang.Boolean.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final com.google.android.gms.internal.nearby.zzgd zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    zzfm(java.lang.String str, com.google.android.gms.internal.nearby.zzgd zzgdVar, boolean z) {
        this.zza = str;
        this.zzb = zzgdVar;
        this.zzc = z;
    }
}
