package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbgr {
    private final com.google.android.gms.internal.ads.zzbgq zza;

    public zzbgr(com.google.android.gms.internal.ads.zzbgq zzbgqVar) {
        android.content.Context context;
        this.zza = zzbgqVar;
        try {
            context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzbgqVar.zzh());
        } catch (android.os.RemoteException | java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzs(com.google.android.gms.dynamic.ObjectWrapper.wrap(new com.google.android.gms.ads.formats.MediaView(context)));
            } catch (android.os.RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
            }
        }
    }

    public final com.google.android.gms.internal.ads.zzbgq zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        try {
            return this.zza.zzi();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }
}
