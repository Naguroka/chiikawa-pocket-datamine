package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzgq> CREATOR = new com.google.android.gms.internal.nearby.zzgr();
    private com.google.android.gms.internal.nearby.zzen zza;
    private java.lang.String[] zzb;
    private com.google.android.gms.internal.nearby.zzgd zzc;
    private boolean zzd;

    private zzgq() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzgq) {
            com.google.android.gms.internal.nearby.zzgq zzgqVar = (com.google.android.gms.internal.nearby.zzgq) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzgqVar.zza) && java.util.Arrays.equals(this.zzb, zzgqVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzgqVar.zzc) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(zzgqVar.zzd))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzb)), this.zzc, java.lang.Boolean.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.internal.nearby.zzen zzenVar = this.zza;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, zzenVar == null ? null : zzenVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgq(android.os.IBinder iBinder, java.lang.String[] strArr, com.google.android.gms.internal.nearby.zzgd zzgdVar, boolean z) {
        com.google.android.gms.internal.nearby.zzen zzelVar;
        if (iBinder == null) {
            zzelVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzelVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.nearby.zzen ? (com.google.android.gms.internal.nearby.zzen) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.nearby.zzel(iBinder);
        }
        this.zza = zzelVar;
        this.zzb = strArr;
        this.zzc = zzgdVar;
        this.zzd = z;
    }

    /* synthetic */ zzgq(com.google.android.gms.internal.nearby.zzgo zzgoVar) {
    }
}
