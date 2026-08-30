package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Queue f1324a = new java.util.LinkedList();
    private final java.lang.Object b = new java.lang.Object();

    p() {
    }

    void a(com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            if (b() <= 25) {
                this.f1324a.offer(appLovinAdImpl);
            } else {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    int b() {
        int size;
        synchronized (this.b) {
            size = this.f1324a.size();
        }
        return size;
    }

    boolean c() {
        boolean z;
        synchronized (this.b) {
            z = b() == 0;
        }
        return z;
    }

    com.applovin.impl.sdk.ad.AppLovinAdImpl d() {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            appLovinAdImpl = (com.applovin.impl.sdk.ad.AppLovinAdImpl) this.f1324a.peek();
        }
        return appLovinAdImpl;
    }

    void b(com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            this.f1324a.remove(appLovinAdImpl);
        }
    }

    com.applovin.impl.sdk.ad.AppLovinAdImpl a() {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            appLovinAdImpl = !c() ? (com.applovin.impl.sdk.ad.AppLovinAdImpl) this.f1324a.poll() : null;
        }
        return appLovinAdImpl;
    }
}
