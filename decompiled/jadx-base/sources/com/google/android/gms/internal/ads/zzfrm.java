package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfrm extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzfrn {
    public static com.google.android.gms.internal.ads.zzfrn zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzfrn ? (com.google.android.gms.internal.ads.zzfrn) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzfrl(iBinder);
    }
}
