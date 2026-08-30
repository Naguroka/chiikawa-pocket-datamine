package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzby extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.zzby> CREATOR = new com.google.android.gms.nearby.messages.internal.zzbz();
    final int zza;
    public final com.google.android.gms.nearby.messages.internal.zzae zzb;
    public final com.google.android.gms.nearby.messages.Strategy zzc;
    public final com.google.android.gms.nearby.messages.internal.zzr zzd;

    @java.lang.Deprecated
    public final java.lang.String zze;

    @java.lang.Deprecated
    public final java.lang.String zzf;

    @java.lang.Deprecated
    public final boolean zzg;
    public final com.google.android.gms.nearby.messages.internal.zzv zzh;

    @java.lang.Deprecated
    public final boolean zzi;

    @java.lang.Deprecated
    public final com.google.android.gms.nearby.messages.internal.ClientAppContext zzj;
    public final int zzk;

    zzby(int i, com.google.android.gms.nearby.messages.internal.zzae zzaeVar, com.google.android.gms.nearby.messages.Strategy strategy, android.os.IBinder iBinder, java.lang.String str, java.lang.String str2, boolean z, android.os.IBinder iBinder2, boolean z2, com.google.android.gms.nearby.messages.internal.ClientAppContext clientAppContext, int i2) {
        com.google.android.gms.nearby.messages.internal.zzr zzpVar;
        this.zza = i;
        this.zzb = zzaeVar;
        this.zzc = strategy;
        com.google.android.gms.nearby.messages.internal.zzv zztVar = null;
        if (iBinder == null) {
            zzpVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.nearby.messages.internal.zzr ? (com.google.android.gms.nearby.messages.internal.zzr) iInterfaceQueryLocalInterface : new com.google.android.gms.nearby.messages.internal.zzp(iBinder);
        }
        this.zzd = zzpVar;
        this.zze = str;
        this.zzf = str2;
        this.zzg = z;
        if (iBinder2 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            zztVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.nearby.messages.internal.zzv ? (com.google.android.gms.nearby.messages.internal.zzv) iInterfaceQueryLocalInterface2 : new com.google.android.gms.nearby.messages.internal.zzt(iBinder2);
        }
        this.zzh = zztVar;
        this.zzi = z2;
        this.zzj = com.google.android.gms.nearby.messages.internal.ClientAppContext.zza(clientAppContext, str2, str, z2);
        this.zzk = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, this.zzd.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        com.google.android.gms.nearby.messages.internal.zzv zzvVar = this.zzh;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 8, zzvVar == null ? null : zzvVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
