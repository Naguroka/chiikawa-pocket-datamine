package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbdn extends androidx.browser.customtabs.CustomTabsCallback {
    private final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.List zzb = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjL)).split(","));
    private final com.google.android.gms.internal.ads.zzbdq zzc;
    private final androidx.browser.customtabs.CustomTabsCallback zzd;
    private final com.google.android.gms.internal.ads.zzdsb zze;

    zzbdn(com.google.android.gms.internal.ads.zzbdq zzbdqVar, androidx.browser.customtabs.CustomTabsCallback customTabsCallback, com.google.android.gms.internal.ads.zzdsb zzdsbVar) {
        this.zzd = customTabsCallback;
        this.zzc = zzbdqVar;
        this.zze = zzdsbVar;
    }

    private final void zzb(java.lang.String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zze, null, "pact_action", new android.util.Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void extraCallback(java.lang.String str, android.os.Bundle bundle) {
        androidx.browser.customtabs.CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) {
        androidx.browser.customtabs.CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            return customTabsCallback.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityResized(int i, int i2, android.os.Bundle bundle) {
        androidx.browser.customtabs.CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onActivityResized(i, i2, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onMessageChannelReady(android.os.Bundle bundle) {
        this.zza.set(false);
        androidx.browser.customtabs.CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, android.os.Bundle bundle) {
        java.util.List list;
        this.zza.set(false);
        androidx.browser.customtabs.CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onNavigationEvent(i, bundle);
        }
        this.zzc.zzi(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        if (this.zzc == null || (list = this.zzb) == null || !list.contains(java.lang.String.valueOf(i))) {
            return;
        }
        this.zzc.zzf();
        zzb("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onPostMessage(java.lang.String str, android.os.Bundle bundle) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e);
        }
        androidx.browser.customtabs.CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) {
        androidx.browser.customtabs.CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onRelationshipValidationResult(i, uri, z, bundle);
        }
    }

    public final java.lang.Boolean zza() {
        return java.lang.Boolean.valueOf(this.zza.get());
    }
}
