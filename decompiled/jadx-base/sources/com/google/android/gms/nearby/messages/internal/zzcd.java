package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.zzcd> CREATOR = new com.google.android.gms.nearby.messages.internal.zzce();
    final int zza;
    public final com.google.android.gms.nearby.messages.internal.zzae zzb;
    public final com.google.android.gms.nearby.messages.internal.zzr zzc;

    @java.lang.Deprecated
    public final java.lang.String zzd;

    @java.lang.Deprecated
    public final java.lang.String zze;

    @java.lang.Deprecated
    public final boolean zzf;

    @java.lang.Deprecated
    public final com.google.android.gms.nearby.messages.internal.ClientAppContext zzg;

    zzcd(int i, com.google.android.gms.nearby.messages.internal.zzae zzaeVar, android.os.IBinder iBinder, java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.nearby.messages.internal.ClientAppContext clientAppContext) {
        com.google.android.gms.nearby.messages.internal.zzr zzpVar;
        this.zza = i;
        this.zzb = zzaeVar;
        if (iBinder == null) {
            zzpVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.nearby.messages.internal.zzr ? (com.google.android.gms.nearby.messages.internal.zzr) iInterfaceQueryLocalInterface : new com.google.android.gms.nearby.messages.internal.zzp(iBinder);
        }
        this.zzc = zzpVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = z;
        this.zzg = com.google.android.gms.nearby.messages.internal.ClientAppContext.zza(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, this.zzc.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
