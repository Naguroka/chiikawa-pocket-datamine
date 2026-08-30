package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzgy> CREATOR = new com.google.android.gms.internal.nearby.zzgz();
    private com.google.android.gms.internal.nearby.zzen zza;
    private java.lang.String zzb;
    private long zzc;
    private com.google.android.gms.nearby.connection.DiscoveryOptions zzd;
    private com.google.android.gms.internal.nearby.zzeg zze;
    private com.google.android.gms.internal.nearby.zzed zzf;

    private zzgy() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzgy) {
            com.google.android.gms.internal.nearby.zzgy zzgyVar = (com.google.android.gms.internal.nearby.zzgy) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzgyVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzf, zzgyVar.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzgyVar.zzb) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzc), java.lang.Long.valueOf(zzgyVar.zzc)) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzgyVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzgyVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzf, this.zzb, java.lang.Long.valueOf(this.zzc), this.zzd, this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.internal.nearby.zzen zzenVar = this.zza;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, zzenVar == null ? null : zzenVar.asBinder(), false);
        com.google.android.gms.internal.nearby.zzed zzedVar = this.zzf;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzedVar == null ? null : zzedVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        com.google.android.gms.internal.nearby.zzeg zzegVar = this.zze;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 6, zzegVar != null ? zzegVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgy(android.os.IBinder iBinder, android.os.IBinder iBinder2, java.lang.String str, long j, com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions, android.os.IBinder iBinder3) {
        com.google.android.gms.internal.nearby.zzen zzelVar;
        com.google.android.gms.internal.nearby.zzed zzedVar;
        com.google.android.gms.internal.nearby.zzeg zzeeVar = null;
        if (iBinder == null) {
            zzelVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzelVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.nearby.zzen ? (com.google.android.gms.internal.nearby.zzen) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.nearby.zzel(iBinder);
        }
        if (iBinder2 == null) {
            zzedVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            zzedVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.nearby.zzed ? (com.google.android.gms.internal.nearby.zzed) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.nearby.zzed(iBinder2);
        }
        if (iBinder3 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            zzeeVar = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.nearby.zzeg ? (com.google.android.gms.internal.nearby.zzeg) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.nearby.zzee(iBinder3);
        }
        this.zza = zzelVar;
        this.zzf = zzedVar;
        this.zzb = str;
        this.zzc = j;
        this.zzd = discoveryOptions;
        this.zze = zzeeVar;
    }

    /* synthetic */ zzgy(com.google.android.gms.internal.nearby.zzgw zzgwVar) {
    }
}
