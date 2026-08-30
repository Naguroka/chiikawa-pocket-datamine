package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzl> CREATOR = new com.google.android.gms.internal.location.zzm();
    final int zza;
    final com.google.android.gms.internal.location.zzj zzb;
    final com.google.android.gms.location.zzax zzc;
    final com.google.android.gms.internal.location.zzai zzd;

    zzl(int i, com.google.android.gms.internal.location.zzj zzjVar, android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        this.zza = i;
        this.zzb = zzjVar;
        com.google.android.gms.internal.location.zzai zzagVar = null;
        this.zzc = iBinder == null ? null : com.google.android.gms.location.zzaw.zzb(iBinder);
        if (iBinder2 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.location.zzai ? (com.google.android.gms.internal.location.zzai) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.location.zzag(iBinder2);
        }
        this.zzd = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.location.zzax zzaxVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzaxVar == null ? null : zzaxVar.asBinder(), false);
        com.google.android.gms.internal.location.zzai zzaiVar = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
