package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbdj extends androidx.browser.customtabs.CustomTabsCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbdk zza;

    zzbdj(com.google.android.gms.internal.ads.zzbdk zzbdkVar) {
        this.zza = zzbdkVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, android.os.Bundle bundle) {
        this.zza.zze(i);
    }
}
