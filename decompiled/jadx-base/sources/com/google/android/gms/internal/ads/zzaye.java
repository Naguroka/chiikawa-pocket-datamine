package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzaye extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzayf {
    public static com.google.android.gms.internal.ads.zzayf zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzayf ? (com.google.android.gms.internal.ads.zzayf) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzayd(iBinder);
    }
}
