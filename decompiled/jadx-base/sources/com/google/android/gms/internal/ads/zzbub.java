package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbub {

    @javax.annotation.Nonnull
    private final android.view.View zza;
    private final java.util.Map zzb;
    private final com.google.android.gms.internal.ads.zzbyu zzc;

    public zzbub(com.google.android.gms.internal.ads.zzbua zzbuaVar) {
        android.view.View view = zzbuaVar.zza;
        this.zza = view;
        java.util.Map map = zzbuaVar.zzb;
        this.zzb = map;
        com.google.android.gms.internal.ads.zzbyu zzbyuVarZza = com.google.android.gms.internal.ads.zzbtv.zza(zzbuaVar.zza.getContext());
        this.zzc = zzbyuVarZza;
        if (zzbyuVarZza == null || map.isEmpty()) {
            return;
        }
        try {
            zzbyuVarZza.zzg(new com.google.android.gms.internal.ads.zzbuc(com.google.android.gms.dynamic.ObjectWrapper.wrap(view).asBinder(), com.google.android.gms.dynamic.ObjectWrapper.wrap(map).asBinder()));
        } catch (android.os.RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to call remote method.");
        }
    }

    public final void zza(java.util.List list) {
        if (list == null || list.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzh(list, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzbtz(this, list));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(java.util.List list) {
        if (list == null || list.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("No impression urls were passed to recordImpression");
            return;
        }
        com.google.android.gms.internal.ads.zzbyu zzbyuVar = this.zzc;
        if (zzbyuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzbyuVar.zzi(list, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzbty(this, list));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void zzc(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzbyu zzbyuVar = this.zzc;
        if (zzbyuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzbyuVar.zzk(com.google.android.gms.dynamic.ObjectWrapper.wrap(motionEvent));
        } catch (android.os.RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to call remote method.");
        }
    }

    public final void zzd(android.net.Uri uri, com.google.android.gms.ads.query.UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(new java.util.ArrayList(java.util.Arrays.asList(uri)), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzbtx(this, updateClickUrlCallback));
        } catch (android.os.RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(java.util.List list, com.google.android.gms.ads.query.UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzm(list, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzbtw(this, updateImpressionUrlsCallback));
        } catch (android.os.RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
