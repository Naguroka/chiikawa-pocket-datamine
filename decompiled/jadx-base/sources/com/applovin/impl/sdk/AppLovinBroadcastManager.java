package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinBroadcastManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map f1262a = new java.util.HashMap();
    private static final java.util.Map b = new java.util.HashMap();
    private static final java.util.ArrayList c = new java.util.ArrayList();
    private static final android.os.Handler d = new com.applovin.impl.sdk.AppLovinBroadcastManager.a(android.os.Looper.getMainLooper());

    public interface Receiver {
        void onReceive(android.content.Intent intent, java.util.Map<java.lang.String, java.lang.Object> map);
    }

    class a extends android.os.Handler {
        a(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what == 1) {
                com.applovin.impl.sdk.AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.content.Intent f1263a;
        final java.util.Map b;
        final java.util.List c;

        b(android.content.Intent intent, java.util.Map map, java.util.List list) {
            this.f1263a = intent;
            this.b = map;
            this.c = list;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.content.IntentFilter f1264a;
        final com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver b;
        boolean c;
        boolean d;

        c(android.content.IntentFilter intentFilter, com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver receiver) {
            this.f1264a = intentFilter;
            this.b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        com.applovin.impl.sdk.AppLovinBroadcastManager.b[] bVarArr;
        while (true) {
            synchronized (f1262a) {
                java.util.ArrayList arrayList = c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new com.applovin.impl.sdk.AppLovinBroadcastManager.b[size];
                arrayList.toArray(bVarArr);
                arrayList.clear();
            }
            for (int i = 0; i < size; i++) {
                com.applovin.impl.sdk.AppLovinBroadcastManager.b bVar = bVarArr[i];
                if (bVar != null) {
                    for (com.applovin.impl.sdk.AppLovinBroadcastManager.c cVar : bVar.c) {
                        if (cVar != null && !cVar.d) {
                            cVar.b.onReceive(bVar.f1263a, bVar.b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver receiver, android.content.IntentFilter intentFilter) {
        java.util.Map map = f1262a;
        synchronized (map) {
            com.applovin.impl.sdk.AppLovinBroadcastManager.c cVar = new com.applovin.impl.sdk.AppLovinBroadcastManager.c(intentFilter, receiver);
            java.util.ArrayList arrayList = (java.util.ArrayList) map.get(receiver);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(cVar);
            java.util.Iterator<java.lang.String> itActionsIterator = intentFilter.actionsIterator();
            while (itActionsIterator.hasNext()) {
                java.lang.String next = itActionsIterator.next();
                java.util.Map map2 = b;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public static boolean sendBroadcast(android.content.Intent intent, java.util.Map<java.lang.String, java.lang.Object> map) {
        synchronized (f1262a) {
            java.util.List listA = a(intent);
            if (listA == null) {
                return false;
            }
            c.add(new com.applovin.impl.sdk.AppLovinBroadcastManager.b(intent, map, listA));
            android.os.Handler handler = d;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static void sendBroadcastSync(android.content.Intent intent, java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.List<com.applovin.impl.sdk.AppLovinBroadcastManager.c> listA = a(intent);
        if (listA == null) {
            return;
        }
        for (com.applovin.impl.sdk.AppLovinBroadcastManager.c cVar : listA) {
            if (!cVar.d) {
                cVar.b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(android.content.Intent intent, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(java.lang.String str, java.lang.Object obj) {
        java.util.HashMap map = new java.util.HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new android.content.Intent(str), map);
    }

    public static void unregisterReceiver(com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver receiver) {
        java.util.Map map = f1262a;
        synchronized (map) {
            java.util.List<com.applovin.impl.sdk.AppLovinBroadcastManager.c> list = (java.util.List) map.remove(receiver);
            if (list == null) {
                return;
            }
            for (com.applovin.impl.sdk.AppLovinBroadcastManager.c cVar : list) {
                cVar.d = true;
                java.util.Iterator<java.lang.String> itActionsIterator = cVar.f1264a.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    java.lang.String next = itActionsIterator.next();
                    java.util.List list2 = (java.util.List) b.get(next);
                    if (list2 != null) {
                        java.util.Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((com.applovin.impl.sdk.AppLovinBroadcastManager.c) it.next()).b == receiver) {
                                cVar.d = true;
                                it.remove();
                            }
                        }
                        if (list2.size() <= 0) {
                            b.remove(next);
                        }
                    }
                }
            }
        }
    }

    private static java.util.List a(android.content.Intent intent) {
        synchronized (f1262a) {
            java.lang.String action = intent.getAction();
            android.net.Uri data = intent.getData();
            java.lang.String scheme = intent.getScheme();
            java.util.Set<java.lang.String> categories = intent.getCategories();
            java.util.List<com.applovin.impl.sdk.AppLovinBroadcastManager.c> list = (java.util.List) b.get(action);
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = null;
            for (com.applovin.impl.sdk.AppLovinBroadcastManager.c cVar : list) {
                if (!cVar.c && cVar.f1264a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(cVar);
                    cVar.c = true;
                }
            }
            if (arrayList == null) {
                return null;
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.sdk.AppLovinBroadcastManager.c) it.next()).c = false;
            }
            return arrayList;
        }
    }
}
