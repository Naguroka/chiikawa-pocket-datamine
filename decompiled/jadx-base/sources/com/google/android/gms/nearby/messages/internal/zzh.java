package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.zzh> CREATOR = new com.google.android.gms.nearby.messages.internal.zzi();
    final int zza;
    public final com.google.android.gms.nearby.messages.internal.zzr zzb;

    @java.lang.Deprecated
    public final java.lang.String zzc;

    @java.lang.Deprecated
    public final com.google.android.gms.nearby.messages.internal.ClientAppContext zzd;

    zzh(int i, android.os.IBinder iBinder, java.lang.String str, com.google.android.gms.nearby.messages.internal.ClientAppContext clientAppContext) {
        com.google.android.gms.nearby.messages.internal.zzr zzpVar;
        this.zza = i;
        if (iBinder == null) {
            zzpVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.nearby.messages.internal.zzr ? (com.google.android.gms.nearby.messages.internal.zzr) iInterfaceQueryLocalInterface : new com.google.android.gms.nearby.messages.internal.zzp(iBinder);
        }
        this.zzb = zzpVar;
        this.zzc = str;
        this.zzd = com.google.android.gms.nearby.messages.internal.ClientAppContext.zza(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zzb.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
