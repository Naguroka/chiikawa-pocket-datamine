package com.google.android.gms.internal.ads_identifier;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zze extends com.google.android.gms.internal.ads_identifier.zzb implements com.google.android.gms.internal.ads_identifier.zzf {
    public static com.google.android.gms.internal.ads_identifier.zzf zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads_identifier.zzf ? (com.google.android.gms.internal.ads_identifier.zzf) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads_identifier.zzd(iBinder);
    }
}
