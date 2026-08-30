package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class a implements com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {
    private static final long f = java.util.concurrent.TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1276a;
    private final com.applovin.impl.sdk.n b;
    private final java.util.HashSet c = new java.util.HashSet();
    private final java.lang.Object d = new java.lang.Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0051a {
        void onAdExpired(com.applovin.impl.i8 i8Var);
    }

    public a(com.applovin.impl.sdk.j jVar) {
        this.f1276a = jVar;
        this.b = jVar.I();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map map) {
        java.lang.String action = intent.getAction();
        if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    public void a(com.applovin.impl.i8 i8Var) {
        synchronized (this.d) {
            com.applovin.impl.sdk.b bVarB = b(i8Var);
            if (bVarB != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + i8Var);
                }
                bVarB.a();
                a(bVarB);
            }
        }
    }

    private com.applovin.impl.sdk.b b(com.applovin.impl.i8 i8Var) {
        synchronized (this.d) {
            try {
                if (i8Var == null) {
                    return null;
                }
                for (com.applovin.impl.sdk.b bVar : this.c) {
                    if (i8Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private void b() {
        java.util.HashSet<com.applovin.impl.sdk.b> hashSet = new java.util.HashSet();
        synchronized (this.d) {
            for (com.applovin.impl.sdk.b bVar : this.c) {
                com.applovin.impl.i8 i8VarB = bVar.b();
                if (i8VarB == null) {
                    hashSet.add(bVar);
                } else {
                    long timeToLiveMillis = i8VarB.getTimeToLiveMillis();
                    if (timeToLiveMillis <= 0) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + i8VarB);
                        }
                        hashSet.add(bVar);
                    } else {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.b.a("AdExpirationManager", "Rescheduling expiration with remaining " + java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + i8VarB);
                        }
                        bVar.a(timeToLiveMillis);
                    }
                }
            }
        }
        for (com.applovin.impl.sdk.b bVar2 : hashSet) {
            a(bVar2);
            bVar2.d();
        }
    }

    public boolean a(com.applovin.impl.i8 i8Var, com.applovin.impl.sdk.a.InterfaceC0051a interfaceC0051a) {
        synchronized (this.d) {
            if (b(i8Var) != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + i8Var);
                }
                return true;
            }
            if (i8Var.getTimeToLiveMillis() <= f) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("AdExpirationManager", "Ad has already expired: " + i8Var);
                }
                i8Var.setExpired();
                return false;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AdExpirationManager", "Scheduling ad expiration " + java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(i8Var.getTimeToLiveMillis()) + " seconds from now for " + i8Var + "...");
            }
            if (this.c.isEmpty()) {
                com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED));
                com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.c.add(com.applovin.impl.sdk.b.a(i8Var, interfaceC0051a, this.f1276a));
            return true;
        }
    }

    public void a(com.applovin.impl.sdk.b bVar) {
        synchronized (this.d) {
            this.c.remove(bVar);
            if (this.c.isEmpty()) {
                com.applovin.impl.sdk.AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void a() {
        synchronized (this.d) {
            java.util.Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.sdk.b) it.next()).a();
            }
        }
    }
}
