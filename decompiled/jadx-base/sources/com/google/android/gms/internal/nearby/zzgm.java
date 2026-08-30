package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzgm> CREATOR = new com.google.android.gms.internal.nearby.zzgn();
    private com.google.android.gms.internal.nearby.zzen zza;
    private com.google.android.gms.internal.nearby.zzdw zzb;
    private com.google.android.gms.internal.nearby.zzec zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private byte[] zzf;
    private com.google.android.gms.internal.nearby.zzdz zzg;
    private byte[] zzh;
    private com.google.android.gms.nearby.connection.ConnectionOptions zzi;

    private zzgm() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzgm) {
            com.google.android.gms.internal.nearby.zzgm zzgmVar = (com.google.android.gms.internal.nearby.zzgm) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzgmVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzgmVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzgmVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzgmVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzgmVar.zze) && java.util.Arrays.equals(this.zzf, zzgmVar.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, zzgmVar.zzg) && java.util.Arrays.equals(this.zzh, zzgmVar.zzh) && com.google.android.gms.common.internal.Objects.equal(this.zzi, zzgmVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzf)), this.zzg, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzh)), this.zzi);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.internal.nearby.zzen zzenVar = this.zza;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, zzenVar == null ? null : zzenVar.asBinder(), false);
        com.google.android.gms.internal.nearby.zzdw zzdwVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzdwVar == null ? null : zzdwVar.asBinder(), false);
        com.google.android.gms.internal.nearby.zzec zzecVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzecVar == null ? null : zzecVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 6, this.zzf, false);
        com.google.android.gms.internal.nearby.zzdz zzdzVar = this.zzg;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 7, zzdzVar != null ? zzdzVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 8, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgm(android.os.IBinder iBinder, android.os.IBinder iBinder2, android.os.IBinder iBinder3, java.lang.String str, java.lang.String str2, byte[] bArr, android.os.IBinder iBinder4, byte[] bArr2, com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions) {
        com.google.android.gms.internal.nearby.zzen zzelVar;
        com.google.android.gms.internal.nearby.zzdw zzduVar;
        com.google.android.gms.internal.nearby.zzec zzeaVar;
        com.google.android.gms.internal.nearby.zzdz zzdxVar = null;
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
        if (iBinder3 == null) {
            zzeaVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            zzeaVar = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.nearby.zzec ? (com.google.android.gms.internal.nearby.zzec) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.nearby.zzea(iBinder3);
        }
        if (iBinder4 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            zzdxVar = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.nearby.zzdz ? (com.google.android.gms.internal.nearby.zzdz) iInterfaceQueryLocalInterface4 : new com.google.android.gms.internal.nearby.zzdx(iBinder4);
        }
        this.zza = zzelVar;
        this.zzb = zzduVar;
        this.zzc = zzeaVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bArr;
        this.zzg = zzdxVar;
        this.zzh = bArr2;
        this.zzi = connectionOptions;
    }

    /* synthetic */ zzgm(com.google.android.gms.internal.nearby.zzgk zzgkVar) {
    }
}
