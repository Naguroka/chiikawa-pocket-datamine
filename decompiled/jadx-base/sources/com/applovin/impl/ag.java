package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ag extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f617a = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public interface a {
        void a();

        void b();
    }

    public ag(android.content.Context context) {
        context.getApplicationContext().registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void b(com.applovin.impl.ag.a aVar) {
        this.f617a.remove(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || isInitialStickyBroadcast()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f617a);
        if (a(intent)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.ag.a) it.next()).a();
            }
        } else {
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((com.applovin.impl.ag.a) it2.next()).b();
            }
        }
    }

    private static boolean a(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        java.lang.Object obj = extras.get("networkInfo");
        if (obj instanceof android.net.NetworkInfo) {
            return ((android.net.NetworkInfo) obj).isConnected();
        }
        return false;
    }

    public void a(com.applovin.impl.ag.a aVar) {
        this.f617a.add(aVar);
    }
}
