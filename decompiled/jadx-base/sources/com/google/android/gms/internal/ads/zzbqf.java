package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbqf extends com.google.android.gms.internal.ads.zzbpg {
    private final java.lang.Object zza;
    private com.google.android.gms.internal.ads.zzbqh zzb;
    private com.google.android.gms.internal.ads.zzbwh zzc;
    private com.google.android.gms.dynamic.IObjectWrapper zzd;
    private android.view.View zze;
    private com.google.android.gms.ads.mediation.MediationInterstitialAd zzf;
    private com.google.android.gms.ads.mediation.UnifiedNativeAdMapper zzg;
    private com.google.android.gms.ads.mediation.NativeAdMapper zzh;
    private com.google.android.gms.ads.mediation.MediationRewardedAd zzi;
    private com.google.android.gms.ads.mediation.MediationInterscrollerAd zzj;
    private com.google.android.gms.ads.mediation.MediationAppOpenAd zzk;
    private final java.lang.String zzl = "";

    public zzbqf(com.google.android.gms.ads.mediation.Adapter adapter) {
        this.zza = adapter;
    }

    private final android.os.Bundle zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new android.os.Bundle() : bundle;
    }

    private final android.os.Bundle zzW(java.lang.String str, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Server parameters: ".concat(java.lang.String.valueOf(str)));
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            if (str != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                android.os.Bundle bundle2 = new android.os.Bundle();
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof com.google.ads.mediation.admob.AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            throw new android.os.RemoteException();
        }
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzr();
    }

    private static final java.lang.String zzY(java.lang.String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        java.lang.String str2 = zzmVar.zzu;
        try {
            return new org.json.JSONObject(str).getString("max_ad_content_rating");
        } catch (org.json.JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzA(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting rewarded ad from adapter.");
        try {
            ((com.google.android.gms.ads.mediation.Adapter) this.zza).loadRewardedAd(new com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, null), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new com.google.android.gms.internal.ads.zzbqd(this, zzbpkVar));
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, e, "adapter.loadRewardedAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            zzA(this.zzd, zzmVar, str, new com.google.android.gms.internal.ads.zzbqi((com.google.android.gms.ads.mediation.Adapter) obj, this.zzc));
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzC(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.Adapter) this.zza).loadRewardedInterstitialAd(new com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, null), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new com.google.android.gms.internal.ads.zzbqd(this, zzbpkVar));
                return;
            } catch (java.lang.Exception e) {
                com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, e, "adapter.loadRewardedInterstitialAd");
                throw new android.os.RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzD(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.OnContextChangedListener) {
            ((com.google.android.gms.ads.mediation.OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzE() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationAdapter) {
            try {
                ((com.google.android.gms.ads.mediation.MediationAdapter) obj).onPause();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzF() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationAdapter) {
            try {
                ((com.google.android.gms.ads.mediation.MediationAdapter) obj).onResume();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzG(boolean z) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener) {
            try {
                ((com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze(com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzH(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Show app open ad from adapter.");
        com.google.android.gms.ads.mediation.MediationAppOpenAd mediationAppOpenAd = this.zzk;
        if (mediationAppOpenAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Can not show null mediation app open ad.");
            throw new android.os.RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, e, "adapter.appOpen.showAd");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzI() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Showing interstitial from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                throw new android.os.RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzJ(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter) && !(obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        if (obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter) {
            zzI();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Show interstitial ad from adapter.");
        com.google.android.gms.ads.mediation.MediationInterstitialAd mediationInterstitialAd = this.zzf;
        if (mediationInterstitialAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Can not show null mediation interstitial ad.");
            throw new android.os.RemoteException();
        }
        try {
            mediationInterstitialAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, e, "adapter.interstitial.showAd");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzK(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Show rewarded ad from adapter.");
        com.google.android.gms.ads.mediation.MediationRewardedAd mediationRewardedAd = this.zzi;
        if (mediationRewardedAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Can not show null mediation rewarded ad.");
            throw new android.os.RemoteException();
        }
        try {
            mediationRewardedAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, e, "adapter.rewarded.showAd");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzL() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.mediation.MediationRewardedAd mediationRewardedAd = this.zzi;
        if (mediationRewardedAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Can not show null mediated rewarded ad.");
            throw new android.os.RemoteException();
        }
        try {
            mediationRewardedAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zzd));
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.internal.ads.zzbpb.zza(this.zzd, e, "adapter.showVideo");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final boolean zzN() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if ((obj instanceof com.google.android.gms.ads.mediation.Adapter) || java.util.Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        java.lang.Object obj2 = this.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbpp zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbpq zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final android.os.Bundle zze() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final android.os.Bundle zzf() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final android.os.Bundle zzg() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.ads.internal.client.zzeb zzh() {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbgq zzi() {
        com.google.android.gms.internal.ads.zzbqh zzbqhVar = this.zzb;
        if (zzbqhVar == null) {
            return null;
        }
        com.google.android.gms.internal.ads.zzbgr zzbgrVarZzc = zzbqhVar.zzc();
        if (zzbgrVarZzc instanceof com.google.android.gms.internal.ads.zzbgr) {
            return zzbgrVarZzc.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbpn zzj() {
        com.google.android.gms.ads.mediation.MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new com.google.android.gms.internal.ads.zzbqg(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbpt zzk() {
        com.google.android.gms.ads.mediation.UnifiedNativeAdMapper unifiedNativeAdMapperZza;
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationNativeAdapter) {
            com.google.android.gms.internal.ads.zzbqh zzbqhVar = this.zzb;
            if (zzbqhVar == null || (unifiedNativeAdMapperZza = zzbqhVar.zza()) == null) {
                return null;
            }
            return new com.google.android.gms.internal.ads.zzbql(unifiedNativeAdMapperZza);
        }
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            return null;
        }
        com.google.android.gms.ads.mediation.NativeAdMapper nativeAdMapper = this.zzh;
        if (nativeAdMapper != null) {
            return new com.google.android.gms.internal.ads.zzbqj(nativeAdMapper);
        }
        com.google.android.gms.ads.mediation.UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
        if (unifiedNativeAdMapper != null) {
            return new com.google.android.gms.internal.ads.zzbql(unifiedNativeAdMapper);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbrs zzl() {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            return com.google.android.gms.internal.ads.zzbrs.zza(((com.google.android.gms.ads.mediation.Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbrs zzm() {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            return com.google.android.gms.internal.ads.zzbrs.zza(((com.google.android.gms.ads.mediation.Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationBannerAdapter) {
            try {
                return com.google.android.gms.dynamic.ObjectWrapper.wrap(((com.google.android.gms.ads.mediation.MediationBannerAdapter) obj).getBannerView());
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                throw new android.os.RemoteException();
            }
        }
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zze);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.MediationBannerAdapter.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzo() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationAdapter) {
            try {
                ((com.google.android.gms.ads.mediation.MediationAdapter) obj).onDestroy();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzp(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbwh zzbwhVar, java.lang.String str2) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if ((obj instanceof com.google.android.gms.ads.mediation.Adapter) || java.util.Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = iObjectWrapper;
            this.zzc = zzbwhVar;
            zzbwhVar.zzl(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza));
            return;
        }
        java.lang.Object obj2 = this.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzq(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzblr zzblrVar, java.util.List list) throws android.os.RemoteException {
        byte b;
        if (!(this.zza instanceof com.google.android.gms.ads.mediation.Adapter)) {
            throw new android.os.RemoteException();
        }
        com.google.android.gms.internal.ads.zzbpy zzbpyVar = new com.google.android.gms.internal.ads.zzbpy(this, zzblrVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzblx zzblxVar = (com.google.android.gms.internal.ads.zzblx) it.next();
            switch (zzblxVar.zza) {
                case "banner":
                    b = 0;
                    break;
                case "native":
                    b = 4;
                    break;
                case "rewarded":
                    b = 2;
                    break;
                case "interstitial":
                    b = 1;
                    break;
                case "app_open":
                    b = 5;
                    break;
                case "app_open_ad":
                    b = 6;
                    break;
                case "rewarded_interstitial":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            com.google.android.gms.ads.AdFormat adFormat = null;
            switch (b) {
                case 0:
                    adFormat = com.google.android.gms.ads.AdFormat.BANNER;
                    break;
                case 1:
                    adFormat = com.google.android.gms.ads.AdFormat.INTERSTITIAL;
                    break;
                case 2:
                    adFormat = com.google.android.gms.ads.AdFormat.REWARDED;
                    break;
                case 3:
                    adFormat = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL;
                    break;
                case 4:
                    adFormat = com.google.android.gms.ads.AdFormat.NATIVE;
                    break;
                case 5:
                    adFormat = com.google.android.gms.ads.AdFormat.APP_OPEN_AD;
                    break;
                case 6:
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlI)).booleanValue()) {
                        adFormat = com.google.android.gms.ads.AdFormat.APP_OPEN_AD;
                    }
                    break;
            }
            if (adFormat != null) {
                arrayList.add(new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, zzblxVar.zzb));
            }
        }
        ((com.google.android.gms.ads.mediation.Adapter) this.zza).initialize((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), zzbpyVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwh zzbwhVar, java.util.List list) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not initialize rewarded video adapter.");
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str) throws android.os.RemoteException {
        zzB(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting app open ad from adapter.");
        try {
            ((com.google.android.gms.ads.mediation.Adapter) this.zza).loadAppOpenAd(new com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, null), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new com.google.android.gms.internal.ads.zzbqe(this, zzbpkVar));
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, e, "adapter.loadAppOpenAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzu(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        zzv(iObjectWrapper, zzsVar, zzmVar, str, null, zzbpkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzv(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.MediationBannerAdapter) && !(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.MediationBannerAdapter.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting banner ad from adapter.");
        com.google.android.gms.ads.AdSize adSizeZzd = zzsVar.zzn ? com.google.android.gms.ads.zzc.zzd(zzsVar.zze, zzsVar.zzb) : com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza);
        java.lang.Object obj2 = this.zza;
        if (!(obj2 instanceof com.google.android.gms.ads.mediation.MediationBannerAdapter)) {
            if (obj2 instanceof com.google.android.gms.ads.mediation.Adapter) {
                try {
                    ((com.google.android.gms.ads.mediation.Adapter) obj2).loadBannerAd(new com.google.android.gms.ads.mediation.MediationBannerAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), adSizeZzd, this.zzl), new com.google.android.gms.internal.ads.zzbpz(this, zzbpkVar));
                    return;
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                    com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.loadBannerAd");
                    throw new android.os.RemoteException();
                }
            }
            return;
        }
        try {
            com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter = (com.google.android.gms.ads.mediation.MediationBannerAdapter) obj2;
            java.util.List list = zzmVar.zze;
            java.util.HashSet hashSet = list != null ? new java.util.HashSet(list) : null;
            long j = zzmVar.zzb;
            com.google.android.gms.internal.ads.zzbpw zzbpwVar = new com.google.android.gms.internal.ads.zzbpw(j == -1 ? null : new java.util.Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            android.os.Bundle bundle = zzmVar.zzm;
            mediationBannerAdapter.requestBannerAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), new com.google.android.gms.internal.ads.zzbqh(zzbpkVar), zzW(str, zzmVar, str2), adSizeZzd, zzbpwVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (java.lang.Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th2);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th2, "adapter.requestBannerAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting interscroller ad from adapter.");
        try {
            com.google.android.gms.ads.mediation.Adapter adapter = (com.google.android.gms.ads.mediation.Adapter) this.zza;
            adapter.loadInterscrollerAd(new com.google.android.gms.ads.mediation.MediationBannerAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), com.google.android.gms.ads.zzc.zze(zzsVar.zze, zzsVar.zzb), ""), new com.google.android.gms.internal.ads.zzbpx(this, zzbpkVar, adapter));
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, e, "adapter.loadInterscrollerAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzx(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        zzy(iObjectWrapper, zzmVar, str, null, zzbpkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter) && !(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting interstitial ad from adapter.");
        java.lang.Object obj2 = this.zza;
        if (!(obj2 instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter)) {
            if (obj2 instanceof com.google.android.gms.ads.mediation.Adapter) {
                try {
                    ((com.google.android.gms.ads.mediation.Adapter) obj2).loadInterstitialAd(new com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl), new com.google.android.gms.internal.ads.zzbqa(this, zzbpkVar));
                    return;
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                    com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.loadInterstitialAd");
                    throw new android.os.RemoteException();
                }
            }
            return;
        }
        try {
            com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter = (com.google.android.gms.ads.mediation.MediationInterstitialAdapter) obj2;
            java.util.List list = zzmVar.zze;
            java.util.HashSet hashSet = list != null ? new java.util.HashSet(list) : null;
            long j = zzmVar.zzb;
            com.google.android.gms.internal.ads.zzbpw zzbpwVar = new com.google.android.gms.internal.ads.zzbpw(j == -1 ? null : new java.util.Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            android.os.Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), new com.google.android.gms.internal.ads.zzbqh(zzbpkVar), zzW(str, zzmVar, str2), zzbpwVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (java.lang.Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th2);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th2, "adapter.requestInterstitialAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzz(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbpk zzbpkVar, com.google.android.gms.internal.ads.zzbfl zzbflVar, java.util.List list) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.MediationNativeAdapter) && !(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(com.google.android.gms.ads.mediation.MediationNativeAdapter.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Requesting native ad from adapter.");
        java.lang.Object obj2 = this.zza;
        if (obj2 instanceof com.google.android.gms.ads.mediation.MediationNativeAdapter) {
            try {
                com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter = (com.google.android.gms.ads.mediation.MediationNativeAdapter) obj2;
                java.util.List list2 = zzmVar.zze;
                java.util.HashSet hashSet = list2 != null ? new java.util.HashSet(list2) : null;
                long j = zzmVar.zzb;
                com.google.android.gms.internal.ads.zzbqk zzbqkVar = new com.google.android.gms.internal.ads.zzbqk(j == -1 ? null : new java.util.Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzbflVar, list, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                android.os.Bundle bundle = zzmVar.zzm;
                android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new com.google.android.gms.internal.ads.zzbqh(zzbpkVar);
                mediationNativeAdapter.requestNativeAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzW(str, zzmVar, str2), zzbqkVar, bundle2);
                return;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
                com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.requestNativeAd");
                throw new android.os.RemoteException();
            }
        }
        if (obj2 instanceof com.google.android.gms.ads.mediation.Adapter) {
            try {
                ((com.google.android.gms.ads.mediation.Adapter) obj2).loadNativeAdMapper(new com.google.android.gms.ads.mediation.MediationNativeAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbflVar), new com.google.android.gms.internal.ads.zzbqc(this, zzbpkVar));
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th2);
                com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th2, "adapter.loadNativeAdMapper");
                java.lang.String message = th2.getMessage();
                if (android.text.TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new android.os.RemoteException();
                }
                try {
                    ((com.google.android.gms.ads.mediation.Adapter) this.zza).loadNativeAd(new com.google.android.gms.ads.mediation.MediationNativeAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbflVar), new com.google.android.gms.internal.ads.zzbqb(this, zzbpkVar));
                } catch (java.lang.Throwable th3) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", th3);
                    com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th3, "adapter.loadNativeAd");
                    throw new android.os.RemoteException();
                }
            }
        }
    }

    public zzbqf(com.google.android.gms.ads.mediation.MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
