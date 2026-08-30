package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbc extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzbc> CREATOR = new com.google.android.gms.internal.location.zzbd();
    final int zza;
    final com.google.android.gms.internal.location.zzba zzb;
    final com.google.android.gms.location.zzbd zzc;
    final android.app.PendingIntent zzd;
    final com.google.android.gms.location.zzba zze;
    final com.google.android.gms.internal.location.zzai zzf;

    zzbc(int i, com.google.android.gms.internal.location.zzba zzbaVar, android.os.IBinder iBinder, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder2, android.os.IBinder iBinder3) {
        this.zza = i;
        this.zzb = zzbaVar;
        com.google.android.gms.internal.location.zzai zzagVar = null;
        this.zzc = iBinder == null ? null : com.google.android.gms.location.zzbc.zzb(iBinder);
        this.zzd = pendingIntent;
        this.zze = iBinder2 == null ? null : com.google.android.gms.location.zzaz.zzb(iBinder2);
        if (iBinder3 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.location.zzai ? (com.google.android.gms.internal.location.zzai) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.location.zzag(iBinder3);
        }
        this.zzf = zzagVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.zzbd] */
    public static com.google.android.gms.internal.location.zzbc zza(com.google.android.gms.location.zzbd zzbdVar, com.google.android.gms.internal.location.zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new com.google.android.gms.internal.location.zzbc(2, null, zzbdVar, null, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.android.gms.internal.location.zzbc zzb(com.google.android.gms.internal.location.zzba zzbaVar, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzai zzaiVar) {
        return new com.google.android.gms.internal.location.zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.zzba] */
    public static com.google.android.gms.internal.location.zzbc zzc(com.google.android.gms.location.zzba zzbaVar, com.google.android.gms.internal.location.zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new com.google.android.gms.internal.location.zzbc(2, null, null, null, zzbaVar, zzaiVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.location.zzbd zzbdVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzbdVar == null ? null : zzbdVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.location.zzba zzbaVar = this.zze;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, zzbaVar == null ? null : zzbaVar.asBinder(), false);
        com.google.android.gms.internal.location.zzai zzaiVar = this.zzf;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
