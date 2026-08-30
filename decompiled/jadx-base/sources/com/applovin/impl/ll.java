package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f996a = new java.util.HashSet(32);
    private final java.lang.Object b = new java.lang.Object();

    public boolean a(java.lang.String str) {
        synchronized (this.b) {
            java.util.Iterator it = this.f996a.iterator();
            while (it.hasNext()) {
                if (str.equals(((com.applovin.impl.ml) it.next()).b())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, java.lang.String str) {
        com.applovin.impl.ml mlVarA;
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            synchronized (this.b) {
                mlVarA = a(str, appLovinCommunicatorSubscriber);
            }
            if (mlVarA != null) {
                mlVarA.a(false);
                com.applovin.impl.sdk.AppLovinBroadcastManager.unregisterReceiver(mlVarA);
            }
        }
    }

    private com.applovin.impl.ml a(java.lang.String str, com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (com.applovin.impl.ml mlVar : this.f996a) {
            if (str.equals(mlVar.b()) && appLovinCommunicatorSubscriber.equals(mlVar.a())) {
                return mlVar;
            }
        }
        return null;
    }

    public boolean a(com.applovin.communicator.AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, java.lang.String str) {
        if (appLovinCommunicatorSubscriber != null && com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            synchronized (this.b) {
                com.applovin.impl.ml mlVarA = a(str, appLovinCommunicatorSubscriber);
                if (mlVarA != null) {
                    com.applovin.impl.sdk.n.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                    if (!mlVarA.c()) {
                        mlVarA.a(true);
                        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(mlVarA, new android.content.IntentFilter(str));
                    }
                    return true;
                }
                com.applovin.impl.ml mlVar = new com.applovin.impl.ml(str, appLovinCommunicatorSubscriber);
                this.f996a.add(mlVar);
                com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(mlVar, new android.content.IntentFilter(str));
                return true;
            }
        }
        com.applovin.impl.sdk.n.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }
}
