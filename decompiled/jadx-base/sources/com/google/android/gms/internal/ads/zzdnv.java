package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdnv extends com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks {
    private final com.google.android.gms.internal.ads.zzdif zza;

    public zzdnv(com.google.android.gms.internal.ads.zzdif zzdifVar) {
        this.zza = zzdifVar;
    }

    private static com.google.android.gms.ads.internal.client.zzee zza(com.google.android.gms.internal.ads.zzdif zzdifVar) {
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzj = zzdifVar.zzj();
        if (zzebVarZzj == null) {
            return null;
        }
        try {
            return zzebVarZzj.zzi();
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzee zzeeVarZza = zza(this.zza);
        if (zzeeVarZza == null) {
            return;
        }
        try {
            zzeeVarZza.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzee zzeeVarZza = zza(this.zza);
        if (zzeeVarZza == null) {
            return;
        }
        try {
            zzeeVarZza.zzg();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzee zzeeVarZza = zza(this.zza);
        if (zzeeVarZza == null) {
            return;
        }
        try {
            zzeeVarZza.zzi();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to call onVideoEnd()", e);
        }
    }
}
