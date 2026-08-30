package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<Listener extends com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> extends com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<com.json.mediationsdk.u, Listener> implements com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<Listener>, com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<Listener>, com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<Listener>, com.json.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.json.mediationsdk.AbstractAdapter f2932a;
    protected java.lang.ref.WeakReference<Listener> b;

    public a(com.json.mediationsdk.AbstractAdapter abstractAdapter, com.json.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.util.UUID uuid) {
        super(ad_unit, networkSettings, uuid);
        this.b = new java.lang.ref.WeakReference<>(null);
        this.f2932a = abstractAdapter;
    }

    public static com.json.mediationsdk.a<?> a(com.json.mediationsdk.AbstractAdapter abstractAdapter, com.json.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.util.UUID uuid) {
        if (!java.lang.Boolean.valueOf(com.json.im.S().d().a()).booleanValue() && ad_unit != com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD) {
            uuid = null;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return new com.json.mediationsdk.z(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return new com.json.mediationsdk.o(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            return new com.json.mediationsdk.j(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD) {
            return new com.json.mediationsdk.t(abstractAdapter, networkSettings, uuid);
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
        return null;
    }

    private void a(com.json.mediationsdk.adunit.adapter.utility.AdData adData, Listener listener) {
        this.b = new java.lang.ref.WeakReference<>(listener);
        a(com.json.hk.a(adData.getConfiguration()), com.json.hk.a(adData.getAdUnitData()), adData);
    }

    private void b(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("Method '" + str + "' is not supported for " + getClass().getName()));
    }

    protected java.lang.String a() {
        return a((java.lang.String) null);
    }

    protected java.lang.String a(java.lang.String str) {
        java.lang.String string = b().toString();
        return android.text.TextUtils.isEmpty(str) ? string : string + " - " + str;
    }

    protected void a(org.json.JSONObject jSONObject) {
        b("destroyAd");
    }

    protected abstract void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.adunit.adapter.utility.AdData adData);

    protected abstract com.ironsource.mediationsdk.IronSource.AD_UNIT b();

    protected void b(org.json.JSONObject jSONObject) {
        b("disposeAd");
    }

    protected boolean c(org.json.JSONObject jSONObject) {
        b("isAdAvailable");
        return false;
    }

    public void d(org.json.JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void destroyAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        a(com.json.hk.a(adData.getConfiguration()));
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void disposeAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        b(com.json.hk.a(adData.getConfiguration()));
    }

    public void e(org.json.JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    protected void f(org.json.JSONObject jSONObject) {
        b("showAd");
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        return c(com.json.hk.a(adData.getConfiguration()));
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData, android.app.Activity activity, com.json.mediationsdk.ISBannerSize iSBannerSize, Listener listener) {
        a(adData, listener);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void loadAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData, android.app.Activity activity, Listener listener) {
        a(adData, listener);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewBound(com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        d(com.json.hk.a(adData.getConfiguration()));
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewWillBind(com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        e(com.json.hk.a(adData.getConfiguration()));
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public void releaseMemory() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a());
        com.json.mediationsdk.AbstractAdapter abstractAdapter = this.f2932a;
        if (abstractAdapter != null) {
            abstractAdapter.releaseMemory(b(), new org.json.JSONObject());
            this.f2932a = null;
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData, Listener listener) {
        this.b = new java.lang.ref.WeakReference<>(listener);
        f(com.json.hk.a(adData.getConfiguration()));
    }
}
