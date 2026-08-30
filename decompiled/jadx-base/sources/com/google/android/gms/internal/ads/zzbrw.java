package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbrw implements com.google.android.gms.ads.mediation.MediationInterstitialAdapter {
    private android.app.Activity zza;
    private com.google.android.gms.ads.mediation.MediationInterstitialListener zzb;
    private android.net.Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, android.os.Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        this.zzb = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        if (!com.google.android.gms.internal.ads.zzbdm.zzg(context)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Default browser does not support custom tabs. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        java.lang.String string = bundle.getString("tab_url");
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else {
            this.zza = (android.app.Activity) context;
            this.zzc = android.net.Uri.parse(string);
            this.zzb.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        androidx.browser.customtabs.CustomTabsIntent customTabsIntentBuild = new androidx.browser.customtabs.CustomTabsIntent.Builder().build();
        customTabsIntentBuild.intent.setData(this.zzc);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzbrv(this, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null), null, new com.google.android.gms.internal.ads.zzbru(this), null, new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(0, 0, false), null, null, "")));
        com.google.android.gms.ads.internal.zzv.zzp().zzq();
    }
}
