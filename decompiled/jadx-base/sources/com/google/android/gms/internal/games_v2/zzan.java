package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzan extends com.google.android.gms.games.internal.zzh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.games_v2.zzan> CREATOR = new com.google.android.gms.internal.games_v2.zzao();
    private final android.os.Bundle zza;
    private final android.os.IBinder zzb;

    zzan(android.os.Bundle bundle, android.os.IBinder iBinder) {
        this.zza = bundle;
        this.zzb = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzan(com.google.android.gms.internal.games_v2.zzam zzamVar) {
        this.zza = zzamVar.zza();
        this.zzb = zzamVar.zza;
    }
}
