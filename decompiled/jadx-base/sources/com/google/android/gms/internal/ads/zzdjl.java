package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdjl implements android.view.View.OnClickListener {
    java.lang.String zza;
    java.lang.Long zzb;
    java.lang.ref.WeakReference zzc;
    private final com.google.android.gms.internal.ads.zzdnl zzd;
    private final com.google.android.gms.common.util.Clock zze;
    private com.google.android.gms.internal.ads.zzbhq zzf;
    private com.google.android.gms.internal.ads.zzbjp zzg;

    public zzdjl(com.google.android.gms.internal.ads.zzdnl zzdnlVar, com.google.android.gms.common.util.Clock clock) {
        this.zzd = zzdnlVar;
        this.zze = clock;
    }

    private final void zzd() {
        android.view.View view;
        this.zza = null;
        this.zzb = null;
        java.lang.ref.WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.ref.WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            java.util.HashMap map = new java.util.HashMap();
            map.put("id", this.zza);
            map.put("time_interval", java.lang.String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzj("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final com.google.android.gms.internal.ads.zzbhq zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final com.google.android.gms.internal.ads.zzbhq zzbhqVar) {
        this.zzf = zzbhqVar;
        com.google.android.gms.internal.ads.zzbjp zzbjpVar = this.zzg;
        if (zzbjpVar != null) {
            this.zzd.zzn("/unconfirmedClick", zzbjpVar);
        }
        com.google.android.gms.internal.ads.zzbjp zzbjpVar2 = new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjk
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdjl zzdjlVar = this.zza;
                try {
                    zzdjlVar.zzb = java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) map.get(com.ironsource.aa.a.d)));
                } catch (java.lang.NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                com.google.android.gms.internal.ads.zzbhq zzbhqVar2 = zzbhqVar;
                zzdjlVar.zza = (java.lang.String) map.get("id");
                java.lang.String str = (java.lang.String) map.get("asset_id");
                if (zzbhqVar2 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbhqVar2.zzf(str);
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbjpVar2;
        this.zzd.zzl("/unconfirmedClick", zzbjpVar2);
    }
}
