package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbrq extends com.google.android.gms.internal.ads.zzbrc {
    private final com.google.android.gms.ads.mediation.rtb.RtbAdapter zza;
    private com.google.android.gms.ads.mediation.MediationInterstitialAd zzb;
    private com.google.android.gms.ads.mediation.MediationRewardedAd zzc;
    private com.google.android.gms.ads.mediation.MediationAppOpenAd zzd;
    private java.lang.String zze = "";

    public zzbrq(com.google.android.gms.ads.mediation.rtb.RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final android.os.Bundle zzv(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new android.os.Bundle() : bundle;
    }

    private static final android.os.Bundle zzw(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Server parameters: ".concat(java.lang.String.valueOf(str)));
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            if (str == null) {
                return bundle;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            throw new android.os.RemoteException();
        }
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzr();
    }

    private static final java.lang.String zzy(java.lang.String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        java.lang.String str2 = zzmVar.zzu;
        try {
            return new org.json.JSONObject(str).getString("max_ad_content_rating");
        } catch (org.json.JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        com.google.android.gms.ads.mediation.MediationExtrasReceiver mediationExtrasReceiver = this.zza;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final com.google.android.gms.internal.ads.zzbrs zzf() throws android.os.RemoteException {
        return com.google.android.gms.internal.ads.zzbrs.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final com.google.android.gms.internal.ads.zzbrs zzg() throws android.os.RemoteException {
        return com.google.android.gms.internal.ads.zzbrs.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.internal.ads.zzbrg zzbrgVar) throws android.os.RemoteException {
        com.google.android.gms.ads.AdFormat adFormat;
        try {
            com.google.android.gms.internal.ads.zzbro zzbroVar = new com.google.android.gms.internal.ads.zzbro(this, zzbrgVar);
            com.google.android.gms.ads.mediation.rtb.RtbAdapter rtbAdapter = this.zza;
            switch (str) {
                case "banner":
                    adFormat = com.google.android.gms.ads.AdFormat.BANNER;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(mediationConfiguration);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "interstitial":
                    adFormat = com.google.android.gms.ads.AdFormat.INTERSTITIAL;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration2 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(mediationConfiguration2);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList2, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "rewarded":
                    adFormat = com.google.android.gms.ads.AdFormat.REWARDED;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration3 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(mediationConfiguration3);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList3, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "rewarded_interstitial":
                    adFormat = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration4 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(mediationConfiguration4);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList4, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "native":
                    adFormat = com.google.android.gms.ads.AdFormat.NATIVE;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration5 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(mediationConfiguration5);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList5, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "app_open":
                    adFormat = com.google.android.gms.ads.AdFormat.APP_OPEN_AD;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration6 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(mediationConfiguration6);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList6, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "app_open_ad":
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlI)).booleanValue()) {
                        adFormat = com.google.android.gms.ads.AdFormat.APP_OPEN_AD;
                        com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration7 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(mediationConfiguration7);
                        rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList7, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                        return;
                    }
                default:
                    throw new java.lang.IllegalArgumentException("Internal Error");
            }
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error generating signals for RTB", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.collectSignals");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzm(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqx zzbqxVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        zzn(str, str2, zzmVar, iObjectWrapper, zzbqxVar, zzbpkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzn(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqx zzbqxVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar, com.google.android.gms.internal.ads.zzbfl zzbflVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbNativeAdMapper(new com.google.android.gms.ads.mediation.MediationNativeAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbflVar), new com.google.android.gms.internal.ads.zzbrl(this, zzbqxVar, zzbpkVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render native ad.", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbNativeAdMapper");
            java.lang.String message = th.getMessage();
            if (android.text.TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new android.os.RemoteException();
            }
            try {
                this.zza.loadRtbNativeAd(new com.google.android.gms.ads.mediation.MediationNativeAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbflVar), new com.google.android.gms.internal.ads.zzbrm(this, zzbqxVar, zzbpkVar));
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render native ad.", th2);
                com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th2, "adapter.loadRtbNativeAd");
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzq(java.lang.String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.ads.mediation.MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzs(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.ads.mediation.MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.ads.mediation.MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzo(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbra zzbraVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new com.google.android.gms.internal.ads.zzbrp(this, zzbraVar, zzbpkVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render rewarded interstitial ad.", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzp(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbra zzbraVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new com.google.android.gms.internal.ads.zzbrp(this, zzbraVar, zzbpkVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render rewarded ad.", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbRewardedAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzi(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqo zzbqoVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbAppOpenAd(new com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new com.google.android.gms.internal.ads.zzbrn(this, zzbqoVar, zzbpkVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render app open ad.", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbAppOpenAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzl(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqu zzbquVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new com.google.android.gms.internal.ads.zzbrk(this, zzbquVar, zzbpkVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render interstitial ad.", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbInterstitialAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzj(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqr zzbqrVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbBannerAd(new com.google.android.gms.ads.mediation.MediationBannerAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza), this.zze), new com.google.android.gms.internal.ads.zzbri(this, zzbqrVar, zzbpkVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render banner ad.", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbBannerAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzk(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqr zzbqrVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbInterscrollerAd(new com.google.android.gms.ads.mediation.MediationBannerAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza), this.zze), new com.google.android.gms.internal.ads.zzbrj(this, zzbqrVar, zzbpkVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render interscroller ad.", th);
            com.google.android.gms.internal.ads.zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbInterscrollerAd");
            throw new android.os.RemoteException();
        }
    }
}
