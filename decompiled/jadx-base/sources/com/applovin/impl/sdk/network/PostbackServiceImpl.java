package com.applovin.impl.sdk.network;

/* JADX INFO: loaded from: classes3.dex */
public class PostbackServiceImpl implements com.applovin.sdk.AppLovinPostbackService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1315a;

    public PostbackServiceImpl(com.applovin.impl.sdk.j jVar) {
        this.f1315a = jVar;
    }

    private boolean a(com.applovin.impl.sdk.network.e eVar) {
        java.util.Map mapI = eVar.i();
        if (mapI == null) {
            return false;
        }
        java.lang.Object obj = mapI.get(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        if ("postinstall".equals(obj)) {
            obj = mapI.get("sub_event");
        }
        return com.applovin.impl.sdk.EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(java.lang.String str, com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(com.applovin.impl.sdk.network.e.b(this.f1315a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public java.lang.String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(com.applovin.impl.sdk.network.e eVar, com.applovin.impl.tm.b bVar, com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener) {
        com.applovin.impl.gm gmVar = new com.applovin.impl.gm(eVar, bVar, this.f1315a, appLovinPostbackListener);
        gmVar.a(a(eVar));
        this.f1315a.i0().a((com.applovin.impl.yl) gmVar, bVar);
    }

    public void dispatchPostbackRequest(com.applovin.impl.sdk.network.e eVar, com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, com.applovin.impl.tm.b.OTHER, appLovinPostbackListener);
    }
}
