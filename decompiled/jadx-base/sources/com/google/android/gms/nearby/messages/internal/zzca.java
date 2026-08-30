package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzca extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.zzca> CREATOR = new com.google.android.gms.nearby.messages.internal.zzcb();
    final int zza;
    public final com.google.android.gms.nearby.messages.internal.zzr zzb;
    public final com.google.android.gms.nearby.messages.internal.zzy zzc;
    public boolean zzd;

    @java.lang.Deprecated
    public java.lang.String zze;

    @java.lang.Deprecated
    public final com.google.android.gms.nearby.messages.internal.ClientAppContext zzf;

    zzca(int i, android.os.IBinder iBinder, android.os.IBinder iBinder2, boolean z, java.lang.String str, com.google.android.gms.nearby.messages.internal.ClientAppContext clientAppContext) {
        com.google.android.gms.nearby.messages.internal.zzr zzpVar;
        com.google.android.gms.nearby.messages.internal.zzy zzwVar;
        this.zza = i;
        if (iBinder == null) {
            zzpVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.nearby.messages.internal.zzr ? (com.google.android.gms.nearby.messages.internal.zzr) iInterfaceQueryLocalInterface : new com.google.android.gms.nearby.messages.internal.zzp(iBinder);
        }
        this.zzb = zzpVar;
        if (iBinder2 == null) {
            zzwVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            zzwVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.nearby.messages.internal.zzy ? (com.google.android.gms.nearby.messages.internal.zzy) iInterfaceQueryLocalInterface2 : new com.google.android.gms.nearby.messages.internal.zzw(iBinder2);
        }
        this.zzc = zzwVar;
        this.zzd = z;
        this.zze = str;
        this.zzf = com.google.android.gms.nearby.messages.internal.ClientAppContext.zza(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zzb.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, this.zzc.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzca(android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        this(1, iBinder, iBinder2, false, null, null);
    }
}
