package com.applovin.communicator;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLovinCommunicator {
    private static com.applovin.communicator.AppLovinCommunicator e;
    private static final java.lang.Object f = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f509a;
    private com.applovin.impl.sdk.n b;
    private final com.applovin.impl.ll c = new com.applovin.impl.ll();
    private final com.applovin.impl.communicator.MessagingServiceImpl d = new com.applovin.impl.communicator.MessagingServiceImpl();

    public static com.applovin.communicator.AppLovinCommunicator getInstance(android.content.Context context) {
        synchronized (f) {
            if (e == null) {
                e = new com.applovin.communicator.AppLovinCommunicator();
            }
        }
        return e;
    }

    public void a(com.applovin.impl.sdk.j jVar) {
        this.f509a = jVar;
        this.b = jVar.I();
        a("Attached SDK instance: " + jVar + "...");
    }

    public com.applovin.communicator.AppLovinCommunicatorMessagingService getMessagingService() {
        return this.d;
    }

    public boolean hasSubscriber(java.lang.String str) {
        return this.c.a(str);
    }

    public boolean respondsToTopic(java.lang.String str) {
        return this.f509a.q().a(str);
    }

    public void subscribe(com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, java.lang.String str) {
        subscribe(appLovinCommunicatorSubscriber, java.util.Collections.singletonList(str));
    }

    public java.lang.String toString() {
        return "AppLovinCommunicator{sdk=" + this.f509a + '}';
    }

    public void unsubscribe(com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, java.lang.String str) {
        unsubscribe(appLovinCommunicatorSubscriber, java.util.Collections.singletonList(str));
    }

    public void subscribe(com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, java.util.List<java.lang.String> list) {
        for (java.lang.String str : list) {
            if (!this.c.a(appLovinCommunicatorSubscriber, str)) {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, java.util.List<java.lang.String> list) {
        for (java.lang.String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(java.lang.String str) {
        if (this.b == null || !com.applovin.impl.sdk.n.a()) {
            return;
        }
        this.b.a("AppLovinCommunicator", str);
    }
}
