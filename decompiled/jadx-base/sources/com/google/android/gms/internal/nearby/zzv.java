package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzv extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzv> CREATOR = new com.google.android.gms.internal.nearby.zzw();
    private com.google.android.gms.internal.nearby.zzen zza;
    private long zzb;

    private zzv() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzv) {
            com.google.android.gms.internal.nearby.zzv zzvVar = (com.google.android.gms.internal.nearby.zzv) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzvVar.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzb), java.lang.Long.valueOf(zzvVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.internal.nearby.zzen zzenVar = this.zza;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, zzenVar == null ? null : zzenVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzv(android.os.IBinder iBinder, long j) {
        com.google.android.gms.internal.nearby.zzen zzelVar;
        if (iBinder == null) {
            zzelVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzelVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.nearby.zzen ? (com.google.android.gms.internal.nearby.zzen) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.nearby.zzel(iBinder);
        }
        this.zza = zzelVar;
        this.zzb = j;
    }

    /* synthetic */ zzv(com.google.android.gms.internal.nearby.zzt zztVar) {
    }
}
