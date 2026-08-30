package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzgu> CREATOR = new com.google.android.gms.internal.nearby.zzgv();
    private com.google.android.gms.internal.nearby.zzeq zza;
    private com.google.android.gms.internal.nearby.zzdt zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;
    private long zze;
    private com.google.android.gms.nearby.connection.AdvertisingOptions zzf;
    private com.google.android.gms.internal.nearby.zzdz zzg;
    private byte[] zzh;

    private zzgu() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzgu) {
            com.google.android.gms.internal.nearby.zzgu zzguVar = (com.google.android.gms.internal.nearby.zzgu) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzguVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzguVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzguVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzguVar.zzd) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zze), java.lang.Long.valueOf(zzguVar.zze)) && com.google.android.gms.common.internal.Objects.equal(this.zzf, zzguVar.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, zzguVar.zzg) && java.util.Arrays.equals(this.zzh, zzguVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, java.lang.Long.valueOf(this.zze), this.zzf, this.zzg, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzh)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.internal.nearby.zzeq zzeqVar = this.zza;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, zzeqVar == null ? null : zzeqVar.asBinder(), false);
        com.google.android.gms.internal.nearby.zzdt zzdtVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzdtVar == null ? null : zzdtVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.internal.nearby.zzdz zzdzVar = this.zzg;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 7, zzdzVar != null ? zzdzVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 8, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgu(android.os.IBinder iBinder, android.os.IBinder iBinder2, java.lang.String str, java.lang.String str2, long j, com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions, android.os.IBinder iBinder3, byte[] bArr) {
        com.google.android.gms.internal.nearby.zzeq zzeoVar;
        com.google.android.gms.internal.nearby.zzdt zzdrVar;
        com.google.android.gms.internal.nearby.zzdz zzdxVar = null;
        if (iBinder == null) {
            zzeoVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            zzeoVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.nearby.zzeq ? (com.google.android.gms.internal.nearby.zzeq) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.nearby.zzeo(iBinder);
        }
        if (iBinder2 == null) {
            zzdrVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
            zzdrVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.nearby.zzdt ? (com.google.android.gms.internal.nearby.zzdt) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.nearby.zzdr(iBinder2);
        }
        if (iBinder3 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            zzdxVar = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.nearby.zzdz ? (com.google.android.gms.internal.nearby.zzdz) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.nearby.zzdx(iBinder3);
        }
        this.zza = zzeoVar;
        this.zzb = zzdrVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = j;
        this.zzf = advertisingOptions;
        this.zzg = zzdxVar;
        this.zzh = bArr;
    }

    /* synthetic */ zzgu(com.google.android.gms.internal.nearby.zzgs zzgsVar) {
    }
}
