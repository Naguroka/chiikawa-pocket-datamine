package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ml implements com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {
    private final java.lang.String b;
    private final java.lang.ref.WeakReference c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1073a = true;
    private final java.util.Set d = new java.util.LinkedHashSet();
    private final java.lang.Object f = new java.lang.Object();

    ml(java.lang.String str, com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.b = str;
        this.c = new java.lang.ref.WeakReference(appLovinCommunicatorSubscriber);
    }

    public java.lang.String b() {
        return this.b;
    }

    public com.applovin.communicator.AppLovinCommunicatorSubscriber a() {
        return (com.applovin.communicator.AppLovinCommunicatorSubscriber) this.c.get();
    }

    public boolean c() {
        return this.f1073a;
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map map) {
        boolean z;
        if (a() == null) {
            com.applovin.impl.sdk.n.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        com.applovin.impl.communicator.CommunicatorMessageImpl communicatorMessageImpl = (com.applovin.impl.communicator.CommunicatorMessageImpl) intent;
        synchronized (this.f) {
            if (this.d.contains(communicatorMessageImpl.getUniqueId())) {
                z = false;
            } else {
                this.d.add(communicatorMessageImpl.getUniqueId());
                z = true;
            }
        }
        if (z) {
            a().onMessageReceived((com.applovin.communicator.AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.ml)) {
            return false;
        }
        com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (com.applovin.communicator.AppLovinCommunicatorSubscriber) this.c.get();
        com.applovin.impl.ml mlVar = (com.applovin.impl.ml) obj;
        com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (com.applovin.communicator.AppLovinCommunicatorSubscriber) mlVar.c.get();
        if (b().equals(mlVar.b())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.b.hashCode();
        com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (com.applovin.communicator.AppLovinCommunicatorSubscriber) this.c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    public void a(boolean z) {
        this.f1073a = z;
    }
}
