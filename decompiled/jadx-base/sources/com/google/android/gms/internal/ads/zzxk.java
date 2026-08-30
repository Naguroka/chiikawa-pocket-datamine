package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzxk implements android.media.Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzxt zza;

    zzxk(com.google.android.gms.internal.ads.zzxl zzxlVar, com.google.android.gms.internal.ads.zzxt zzxtVar) {
        this.zza = zzxtVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(android.media.Spatializer spatializer, boolean z) {
        this.zza.zzu();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(android.media.Spatializer spatializer, boolean z) {
        this.zza.zzu();
    }
}
