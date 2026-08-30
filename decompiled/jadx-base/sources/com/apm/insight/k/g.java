package com.apm.insight.k;

/* JADX INFO: compiled from: EventUploadQueue.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c>> f432a = new java.util.concurrent.ConcurrentHashMap<>();
    private static final java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c>>> b = new java.util.HashMap<>();
    private static volatile com.apm.insight.k.g c;
    private volatile boolean e = false;
    private java.lang.Runnable f = new java.lang.Runnable() { // from class: com.apm.insight.k.g.1
        @Override // java.lang.Runnable
        public final void run() {
            if (com.apm.insight.Npth.isStopUpload()) {
                return;
            }
            if (!com.apm.insight.k.g.b.isEmpty() && com.apm.insight.runtime.m.e()) {
                com.apm.insight.k.g.f();
            }
            com.apm.insight.k.g.this.c();
            com.apm.insight.k.g.this.d.a(com.apm.insight.k.g.this.f, 30000L);
        }
    };
    private final com.apm.insight.runtime.r d = com.apm.insight.runtime.n.a();

    private g() {
    }

    public static com.apm.insight.k.g a() {
        if (c == null) {
            synchronized (com.apm.insight.k.g.class) {
                if (c == null) {
                    c = new com.apm.insight.k.g();
                }
            }
        }
        return c;
    }

    public static void a(com.apm.insight.entity.c cVar) {
        a(com.apm.insight.d.a(), cVar);
    }

    public static void a(final java.lang.Object obj, final com.apm.insight.entity.c cVar) {
        java.lang.String string;
        android.os.Handler handlerA = com.apm.insight.runtime.n.a().a();
        if (handlerA == null || handlerA.getLooper() != android.os.Looper.myLooper()) {
            com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.k.g.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.apm.insight.k.g.a(obj, cVar);
                }
            });
            return;
        }
        if (obj == null) {
            obj = com.apm.insight.d.a();
        }
        if (!com.apm.insight.runtime.m.e()) {
            com.apm.insight.a.a("EventUploadQueue", "enqueue before init.");
            c(obj, cVar);
            return;
        }
        if (!com.apm.insight.runtime.a.a(obj)) {
            com.apm.insight.k.a.b();
        }
        f();
        try {
            string = cVar.c().getString("log_type");
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            string = null;
        }
        if (!android.text.TextUtils.isEmpty(string) && com.apm.insight.runtime.a.b(obj)) {
            com.apm.insight.a.a("EventUploadQueue", "logType " + string + " enqueued");
            b(obj, cVar);
        } else {
            com.apm.insight.a.a("EventUploadQueue", "logType " + string + " not sampled");
        }
    }

    private static void b(java.lang.Object obj, com.apm.insight.entity.c cVar) {
        java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c>> concurrentHashMap;
        java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c> concurrentLinkedQueue;
        synchronized (obj) {
            concurrentHashMap = f432a;
            concurrentLinkedQueue = concurrentHashMap.get(obj);
            if (concurrentLinkedQueue == null) {
                concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
                concurrentHashMap.put(obj, concurrentLinkedQueue);
            }
        }
        concurrentLinkedQueue.add(cVar);
        int size = concurrentHashMap.size();
        boolean z = size >= 30;
        com.apm.insight.a.b((java.lang.Object) "[enqueue] size=".concat(java.lang.String.valueOf(size)));
        if (z) {
            g();
        }
    }

    private static void c(java.lang.Object obj, com.apm.insight.entity.c cVar) {
        java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c> concurrentLinkedQueue;
        try {
            java.lang.String string = cVar.c().getString("log_type");
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c>>> map = b;
            synchronized (map) {
                java.util.HashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c>> map2 = map.get(string);
                if (map2 == null) {
                    map2 = new java.util.HashMap<>();
                    map.put(obj, map2);
                }
                concurrentLinkedQueue = map2.get(string);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
                    map2.put(string, concurrentLinkedQueue);
                }
            }
            concurrentLinkedQueue.add(cVar);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        java.util.HashMap map;
        java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c>>> map2 = b;
        synchronized (map2) {
            map = new java.util.HashMap(map2);
            map2.clear();
        }
        if (!com.apm.insight.runtime.a.a()) {
            com.apm.insight.a.a("EventUploadQueue", "ApmConfig not inited, clear cache.");
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            for (java.util.Map.Entry entry2 : ((java.util.HashMap) entry.getValue()).entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) entry2.getValue();
                if (concurrentLinkedQueue == null || (com.apm.insight.runtime.a.a() && !com.apm.insight.runtime.a.b(entry.getKey()))) {
                    com.apm.insight.a.a("EventUploadQueue", "logType " + str + " not sampled");
                } else {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        try {
                            com.apm.insight.entity.c cVar = (com.apm.insight.entity.c) concurrentLinkedQueue.poll();
                            if (cVar == null) {
                                break;
                            } else {
                                b(entry.getKey(), cVar);
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    private static void g() {
        if (!com.apm.insight.runtime.m.e() || com.apm.insight.Npth.isStopUpload()) {
            return;
        }
        try {
            com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.k.g.3
                @Override // java.lang.Runnable
                public final void run() {
                    com.apm.insight.k.g.a().c();
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void b() {
        if (f432a.isEmpty()) {
            this.d.a(this.f, 30000L);
        } else {
            this.d.a(this.f);
        }
    }

    public final void c() {
        synchronized (this.d) {
            if (this.e) {
                return;
            }
            this.e = true;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (java.util.Map.Entry<java.lang.Object, java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c>> entry : f432a.entrySet()) {
                java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c> value = entry.getValue();
                java.lang.Object key = entry.getKey();
                while (!value.isEmpty()) {
                    for (int i = 0; i < 30; i++) {
                        try {
                            if (value.isEmpty()) {
                                break;
                            }
                            linkedList.add(value.poll());
                        } catch (java.lang.Throwable th) {
                            com.apm.insight.a.b(th);
                        }
                    }
                    if (linkedList.isEmpty()) {
                        break;
                    }
                    com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(linkedList, com.apm.insight.entity.b.a(key));
                    if (aVarA != null) {
                        com.apm.insight.a.a((java.lang.Object) "upload events");
                        com.apm.insight.k.d.a().b(aVarA.c());
                    }
                    linkedList.clear();
                }
            }
            this.e = false;
        }
    }
}
