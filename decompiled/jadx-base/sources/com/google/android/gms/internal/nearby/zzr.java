package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzr> CREATOR = new com.google.android.gms.internal.nearby.zzs();
    private com.google.android.gms.internal.nearby.zzen zza;
    private com.google.android.gms.internal.nearby.zzdw zzb;
    private java.lang.String zzc;
    private byte[] zzd;
    private com.google.android.gms.internal.nearby.zzek zze;

    private zzr() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzr) {
            com.google.android.gms.internal.nearby.zzr zzrVar = (com.google.android.gms.internal.nearby.zzr) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzrVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzrVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzrVar.zzc) && java.util.Arrays.equals(this.zzd, zzrVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzrVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzd)), this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.internal.nearby.zzen zzenVar = this.zza;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, zzenVar == null ? null : zzenVar.asBinder(), false);
        com.google.android.gms.internal.nearby.zzdw zzdwVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzdwVar == null ? null : zzdwVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        com.google.android.gms.internal.nearby.zzek zzekVar = this.zze;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, zzekVar != null ? zzekVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzr(android.os.IBinder iBinder, android.os.IBinder iBinder2, java.lang.String str, byte[] bArr, android.os.IBinder iBinder3) {
        com.google.android.gms.internal.nearby.zzen zzelVar;
        com.google.android.gms.internal.nearby.zzdw zzduVar;
        com.google.android.gms.internal.nearby.zzek zzeiVar = null;
        if (iBinder == null) {
            zzelVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzelVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.nearby.zzen ? (com.google.android.gms.internal.nearby.zzen) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.nearby.zzel(iBinder);
        }
        if (iBinder2 == null) {
            zzduVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            zzduVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.nearby.zzdw ? (com.google.android.gms.internal.nearby.zzdw) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.nearby.zzdu(iBinder2);
        }
        if (iBinder3 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            zzeiVar = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.nearby.zzek ? (com.google.android.gms.internal.nearby.zzek) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.nearby.zzei(iBinder3);
        }
        this.zza = zzelVar;
        this.zzb = zzduVar;
        this.zzc = str;
        this.zzd = bArr;
        this.zze = zzeiVar;
    }

    /* synthetic */ zzr(com.google.android.gms.internal.nearby.zzp zzpVar) {
    }
}
