package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgi extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzgi> CREATOR = new com.google.android.gms.internal.nearby.zzgj();
    private com.google.android.gms.internal.nearby.zzen zza;
    private java.lang.String zzb;

    private zzgi() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzgi) {
            com.google.android.gms.internal.nearby.zzgi zzgiVar = (com.google.android.gms.internal.nearby.zzgi) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzgiVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzgiVar.zzb)) {
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
        com.google.android.gms.internal.nearby.zzen zzenVar = this.zza;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, zzenVar == null ? null : zzenVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgi(android.os.IBinder iBinder, java.lang.String str) {
        com.google.android.gms.internal.nearby.zzen zzelVar;
        if (iBinder == null) {
            zzelVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzelVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.nearby.zzen ? (com.google.android.gms.internal.nearby.zzen) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.nearby.zzel(iBinder);
        }
        this.zza = zzelVar;
        this.zzb = str;
    }

    /* synthetic */ zzgi(com.google.android.gms.internal.nearby.zzgg zzggVar) {
    }
}
