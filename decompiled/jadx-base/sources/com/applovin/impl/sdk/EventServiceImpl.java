package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class EventServiceImpl implements com.applovin.sdk.AppLovinEventService {
    public static final java.util.List<java.lang.String> ALLOW_PRE_INIT_EVENT_TYPES = java.util.Arrays.asList("landing", com.ironsource.y8.h.e0, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1269a;
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();

    public EventServiceImpl(com.applovin.impl.sdk.j jVar) {
        this.f1269a = jVar;
    }

    private java.lang.String b() {
        return ((java.lang.String) this.f1269a.a(com.applovin.impl.sj.v0)) + "4.0/pix";
    }

    public void maybeTrackAppOpenEvent() {
        if (this.b.compareAndSet(false, true)) {
            this.f1269a.z().trackEvent("landing");
        }
    }

    public java.lang.String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.Map<java.lang.String, java.lang.String> map2 = com.applovin.impl.sdk.utils.CollectionUtils.map(map);
        map2.put("transaction_id", str);
        trackEvent(com.applovin.sdk.AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(java.lang.String str) {
        trackEvent(str, new java.util.HashMap());
    }

    public void trackEventSynchronously(java.lang.String str) {
        this.f1269a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1269a.I().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        com.applovin.impl.u7 u7Var = new com.applovin.impl.u7(str, new java.util.HashMap());
        java.util.Map mapA = a(u7Var, true);
        java.util.HashMap map = new java.util.HashMap(u7Var.d());
        if (((java.lang.Boolean) this.f1269a.a(com.applovin.impl.sj.s5)).booleanValue() || ((java.lang.Boolean) this.f1269a.a(com.applovin.impl.sj.n5)).booleanValue()) {
            map.putAll(mapA);
            mapA = null;
        }
        this.f1269a.W().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(mapA).c(map).a(a(u7Var, (java.util.Map) null)).c(((java.lang.Boolean) this.f1269a.a(com.applovin.impl.sj.C5)).booleanValue()).a(((java.lang.Boolean) this.f1269a.a(com.applovin.impl.sj.a5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(android.content.Intent intent, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.Map<java.lang.String, java.lang.String> map2 = com.applovin.impl.sdk.utils.CollectionUtils.map(map);
        try {
            map2.put(com.applovin.sdk.AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(com.applovin.sdk.AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f1269a.D().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent("iap", map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, final java.util.Map<java.lang.String, java.lang.String> map2) {
        this.f1269a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1269a.I().a("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final com.applovin.impl.u7 u7Var = new com.applovin.impl.u7(str, map);
        final boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        try {
            this.f1269a.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.f1269a, zContains, "submitTrackEventPostback", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(u7Var, map2, zContains);
                }
            }), com.applovin.impl.tm.b.OTHER);
        } catch (java.lang.Throwable th) {
            this.f1269a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1269a.I().a("AppLovinEventService", "Unable to track event: " + u7Var, th);
            }
            this.f1269a.D().a("AppLovinEventService", "trackEvent", th);
        }
    }

    private java.util.Map a(com.applovin.impl.u7 u7Var, java.util.Map map) {
        java.util.Map map2 = com.applovin.impl.sdk.utils.CollectionUtils.map(map);
        boolean zContains = this.f1269a.c(com.applovin.impl.sj.A0).contains(u7Var.c());
        map2.put("AppLovin-Event", zContains ? u7Var.c() : "postinstall");
        if (!zContains) {
            map2.put("AppLovin-Sub-Event", u7Var.c());
        }
        return map2;
    }

    private java.util.Map a(com.applovin.impl.u7 u7Var, boolean z) {
        boolean zContains = this.f1269a.c(com.applovin.impl.sj.A0).contains(u7Var.c());
        java.util.Map mapA = this.f1269a.x().a(null, z, false);
        mapA.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, zContains ? u7Var.c() : "postinstall");
        mapA.put("event_id", u7Var.b());
        mapA.put("ts", java.lang.Long.toString(u7Var.a()));
        if (!zContains) {
            mapA.put("sub_event", u7Var.c());
        }
        return com.applovin.impl.yp.a(mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.u7 u7Var, java.util.Map map, boolean z) {
        java.util.Map mapA = a(u7Var, false);
        java.util.HashMap map2 = new java.util.HashMap(u7Var.d());
        if (((java.lang.Boolean) this.f1269a.a(com.applovin.impl.sj.s5)).booleanValue() || ((java.lang.Boolean) this.f1269a.a(com.applovin.impl.sj.n5)).booleanValue()) {
            map2.putAll(mapA);
            mapA = null;
        }
        this.f1269a.W().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(mapA).c(map2).a(a(u7Var, map)).c(((java.lang.Boolean) this.f1269a.a(com.applovin.impl.sj.C5)).booleanValue()).a(((java.lang.Boolean) this.f1269a.a(com.applovin.impl.sj.a5)).booleanValue()).d(z).a(com.applovin.impl.vi.a.a(((java.lang.Integer) this.f1269a.a(com.applovin.impl.sj.k5)).intValue())).a());
    }

    private java.lang.String a() {
        return ((java.lang.String) this.f1269a.a(com.applovin.impl.sj.w0)) + "4.0/pix";
    }
}
