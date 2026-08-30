package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.zzcf> CREATOR = new com.google.android.gms.nearby.messages.internal.zzcg();
    final int zza;
    public final com.google.android.gms.nearby.messages.internal.zzo zzb;
    public final com.google.android.gms.nearby.messages.internal.zzr zzc;
    public final android.app.PendingIntent zzd;

    @java.lang.Deprecated
    public final int zze;

    @java.lang.Deprecated
    public final java.lang.String zzf;

    @java.lang.Deprecated
    public final java.lang.String zzg;

    @java.lang.Deprecated
    public final boolean zzh;

    @java.lang.Deprecated
    public final com.google.android.gms.nearby.messages.internal.ClientAppContext zzi;

    public zzcf(int i, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent, int i2, java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.nearby.messages.internal.ClientAppContext clientAppContext) {
        com.google.android.gms.nearby.messages.internal.zzo zzmVar;
        this.zza = i;
        com.google.android.gms.nearby.messages.internal.zzr zzpVar = null;
        if (iBinder == null) {
            zzmVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            zzmVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.nearby.messages.internal.zzo ? (com.google.android.gms.nearby.messages.internal.zzo) iInterfaceQueryLocalInterface : new com.google.android.gms.nearby.messages.internal.zzm(iBinder);
        }
        this.zzb = zzmVar;
        if (iBinder2 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.nearby.messages.internal.zzr ? (com.google.android.gms.nearby.messages.internal.zzr) iInterfaceQueryLocalInterface2 : new com.google.android.gms.nearby.messages.internal.zzp(iBinder2);
        }
        this.zzc = zzpVar;
        this.zzd = pendingIntent;
        this.zze = i2;
        this.zzf = str;
        this.zzg = str2;
        this.zzh = z;
        this.zzi = com.google.android.gms.nearby.messages.internal.ClientAppContext.zza(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.nearby.messages.internal.zzo zzoVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzoVar == null ? null : zzoVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, this.zzc.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzcf(android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, null, null, false, null);
    }
}
