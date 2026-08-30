package com.bykv.vk.openvk.preload.geckox;

/* JADX INFO: loaded from: classes3.dex */
public class GeckoHubImp {

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static com.bykv.vk.openvk.preload.geckox.GeckoHubImp f1708a = new com.bykv.vk.openvk.preload.geckox.GeckoHubImp(null);
    }

    /* synthetic */ GeckoHubImp(com.bykv.vk.openvk.preload.geckox.a aVar) {
        this();
    }

    public static com.bykv.vk.openvk.preload.geckox.GeckoHubImp inst(android.content.Context context) {
        com.bykv.vk.openvk.preload.geckox.c.a(context);
        return com.bykv.vk.openvk.preload.geckox.GeckoHubImp.a.f1708a;
    }

    private GeckoHubImp() {
    }

    public static void setRandomHost(java.lang.String str) {
        com.bykv.vk.openvk.preload.geckox.c.a(str);
    }

    public void preload(java.lang.String str, com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor iStatisticMonitor, java.util.Set<java.lang.String> set, com.bykv.vk.openvk.preload.geckox.net.INetWork iNetWork) {
        com.bykv.vk.openvk.preload.geckox.c.a().a(str, iStatisticMonitor, set, iNetWork);
    }

    public com.bykv.vk.openvk.preload.falconx.loader.a getGeckoResLoader() {
        com.bykv.vk.openvk.preload.geckox.c.a();
        return com.bykv.vk.openvk.preload.geckox.c.b();
    }

    public void releaseGeckoResLoader(com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader) {
        com.bykv.vk.openvk.preload.geckox.c.a();
        com.bykv.vk.openvk.preload.geckox.c.a(iLoader);
    }

    public com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel findResAndMsg(com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader, java.lang.String str, java.lang.String str2) {
        return com.bykv.vk.openvk.preload.geckox.c.a().a(iLoader, str, str2);
    }

    public android.webkit.WebResourceResponse findRes(com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader, java.lang.String str, java.lang.String str2) {
        return com.bykv.vk.openvk.preload.geckox.c.a().a(iLoader, str, str2).getWebResourceResponse();
    }

    public int getResCount(com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader, java.lang.String str) {
        com.bykv.vk.openvk.preload.geckox.c.a();
        return com.bykv.vk.openvk.preload.geckox.c.a(iLoader, str);
    }

    public static void setThreadPoolExecutorCallback(com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback iThreadPoolCallback) {
        com.bykv.vk.openvk.preload.geckox.b.a(iThreadPoolCallback);
    }
}
