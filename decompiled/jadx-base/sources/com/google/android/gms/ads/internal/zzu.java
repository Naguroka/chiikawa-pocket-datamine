package com.google.android.gms.ads.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzu extends com.google.android.gms.ads.internal.client.zzbx {
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private final com.google.android.gms.ads.internal.client.zzs zzb;
    private final java.util.concurrent.Future zzc = com.google.android.gms.internal.ads.zzbzw.zza.zzb(new com.google.android.gms.ads.internal.zzq(this));
    private final android.content.Context zzd;
    private final com.google.android.gms.ads.internal.zzs zze;
    private android.webkit.WebView zzf;
    private com.google.android.gms.ads.internal.client.zzbl zzg;
    private com.google.android.gms.internal.ads.zzava zzh;
    private android.os.AsyncTask zzi;

    public zzu(android.content.Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zzd = context;
        this.zza = versionInfoParcel;
        this.zzb = zzsVar;
        this.zzf = new android.webkit.WebView(context);
        this.zze = new com.google.android.gms.ads.internal.zzs(context, str);
        zzV(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new com.google.android.gms.ads.internal.zzo(this));
        this.zzf.setOnTouchListener(new com.google.android.gms.ads.internal.zzp(this));
    }

    static /* bridge */ /* synthetic */ java.lang.String zzo(com.google.android.gms.ads.internal.zzu zzuVar, java.lang.String str) {
        if (zzuVar.zzh == null) {
            return str;
        }
        android.net.Uri uriZza = android.net.Uri.parse(str);
        try {
            uriZza = zzuVar.zzh.zza(uriZza, zzuVar.zzd, null, null);
        } catch (com.google.android.gms.internal.ads.zzavb e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to process ad data", e);
        }
        return uriZza.toString();
    }

    static /* bridge */ /* synthetic */ void zzw(com.google.android.gms.ads.internal.zzu zzuVar, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(str));
        zzuVar.zzd.startActivity(intent);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) throws android.os.RemoteException {
        this.zzg = zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(com.google.android.gms.internal.ads.zzbag zzbagVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef zzefVar) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(com.google.android.gms.internal.ads.zzbtn zzbtnVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(com.google.android.gms.internal.ads.zzbdg zzbdgVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(com.google.android.gms.internal.ads.zzbtq zzbtqVar, java.lang.String str) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(java.lang.String str) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(com.google.android.gms.internal.ads.zzbwc zzbwcVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(java.lang.String str) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    final void zzV(int i) {
        if (this.zzf == null) {
            return;
        }
        this.zzf.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws android.os.RemoteException {
        return false;
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
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        this.zze.zzf(zzmVar, this.zza);
        this.zzi = new com.google.android.gms.ads.internal.zzr(this, null).execute(new java.lang.Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    final int zzb(java.lang.String str) {
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("height");
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzx(this.zzd, java.lang.Integer.parseInt(queryParameter));
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final android.os.Bundle zzd() {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzs zzg() throws android.os.RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
        throw new java.lang.IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
        throw new java.lang.IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzdy zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzf);
    }

    final java.lang.String zzp() {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https://").appendEncodedPath((java.lang.String) com.google.android.gms.internal.ads.zzbdx.zzd.zze());
        builder.appendQueryParameter("query", this.zze.zzd());
        builder.appendQueryParameter("pubId", this.zze.zzc());
        builder.appendQueryParameter("mappver", this.zze.zza());
        java.util.Map mapZze = this.zze.zze();
        for (java.lang.String str : mapZze.keySet()) {
            builder.appendQueryParameter(str, (java.lang.String) mapZze.get(str));
        }
        android.net.Uri uriBuild = builder.build();
        com.google.android.gms.internal.ads.zzava zzavaVar = this.zzh;
        if (zzavaVar != null) {
            try {
                uriBuild = zzavaVar.zzb(uriBuild, this.zzd);
            } catch (com.google.android.gms.internal.ads.zzavb e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to process ad data", e);
            }
        }
        return zzq() + "#" + uriBuild.getEncodedQuery();
    }

    final java.lang.String zzq() {
        java.lang.String strZzb = this.zze.zzb();
        if (true == android.text.TextUtils.isEmpty(strZzb)) {
            strZzb = "www.google.com";
        }
        return "https://" + strZzb + ((java.lang.String) com.google.android.gms.internal.ads.zzbdx.zzd.zze());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzr() {
        throw new java.lang.IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzs() throws android.os.RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzt() throws android.os.RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(false);
        this.zzf.destroy();
        this.zzf = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
