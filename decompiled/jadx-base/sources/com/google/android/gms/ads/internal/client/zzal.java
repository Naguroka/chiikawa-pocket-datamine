package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzal extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpe zzb;
    final /* synthetic */ com.google.android.gms.ads.h5.OnH5AdsEventListener zzc;

    zzal(com.google.android.gms.ads.internal.client.zzba zzbaVar, android.content.Context context, com.google.android.gms.internal.ads.zzbpe zzbpeVar, com.google.android.gms.ads.h5.OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbpeVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* synthetic */ java.lang.Object zza() {
        return new com.google.android.gms.internal.ads.zzbky();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        return zzcpVar.zzl(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, 244410000, new com.google.android.gms.internal.ads.zzbkl(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
        try {
            return ((com.google.android.gms.internal.ads.zzbku) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzak
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzbkt.zzb((android.os.IBinder) obj);
                }
            })).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, 244410000, new com.google.android.gms.internal.ads.zzbkl(this.zzc));
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException unused) {
            return null;
        }
    }
}
