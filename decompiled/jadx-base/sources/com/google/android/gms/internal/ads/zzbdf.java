package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbdf extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbdg {
    public static com.google.android.gms.internal.ads.zzbdg zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbdg ? (com.google.android.gms.internal.ads.zzbdg) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbde(iBinder);
    }
}
