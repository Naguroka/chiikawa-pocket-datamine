package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzejo extends com.google.android.gms.ads.internal.client.zzbx {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.client.zzbl zzb;
    private final com.google.android.gms.internal.ads.zzfcj zzc;
    private final com.google.android.gms.internal.ads.zzcom zzd;
    private final android.view.ViewGroup zze;
    private final com.google.android.gms.internal.ads.zzdrw zzf;

    public zzejo(android.content.Context context, com.google.android.gms.ads.internal.client.zzbl zzblVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzcom zzcomVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzblVar;
        this.zzc = zzfcjVar;
        this.zzd = zzcomVar;
        this.zzf = zzdrwVar;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.removeAllViews();
        android.view.View viewZzd = zzcomVar.zzd();
        com.google.android.gms.ads.internal.zzv.zzq();
        frameLayout.addView(viewZzd, new android.view.ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws android.os.RemoteException {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzc(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzd;
        if (zzcomVar != null) {
            zzcomVar.zzi(this.zze, zzsVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzekn zzeknVar = this.zzc.zzc;
        if (zzeknVar != null) {
            zzeknVar.zzm(zzcmVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(com.google.android.gms.internal.ads.zzbag zzbagVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef zzefVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(com.google.android.gms.internal.ads.zzbtn zzbtnVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(com.google.android.gms.internal.ads.zzbdg zzbdgVar) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlt)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        com.google.android.gms.internal.ads.zzekn zzeknVar = this.zzc.zzc;
        if (zzeknVar != null) {
            try {
                if (!zzdrVar.zzf()) {
                    this.zzf.zze();
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            zzeknVar.zzl(zzdrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(com.google.android.gms.internal.ads.zzbtq zzbtqVar, java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(com.google.android.gms.internal.ads.zzbwc zzbwcVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(com.google.android.gms.ads.internal.client.zzga zzgaVar) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzd;
        return zzcomVar != null && zzcomVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final android.os.Bundle zzd() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzs zzg() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return com.google.android.gms.internal.ads.zzfcp.zza(this.zza, java.util.Collections.singletonList(this.zzd.zzf()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() throws android.os.RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() throws android.os.RemoteException {
        return this.zzc.zzn;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzdy zzk() {
        return this.zzd.zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzeb zzl() throws android.os.RemoteException {
        return this.zzd.zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() throws android.os.RemoteException {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzr() throws android.os.RemoteException {
        return this.zzc.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzs() throws android.os.RemoteException {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzt() throws android.os.RemoteException {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzb(null);
    }
}
