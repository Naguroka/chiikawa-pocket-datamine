package com.bykv.vk.openvk.bg.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private static volatile com.bykv.vk.openvk.bg.bg.IL.IL.eqN zx;
    private final android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL>> IL;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.bg.IL Kg;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.bX PX;
    private volatile java.lang.String Ta;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.bX VB;
    private final java.util.HashSet<com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bg> WR;
    private final com.bykv.vk.openvk.bg.bg.IL.IL.eqN.IL<java.lang.Runnable> bX;
    private volatile int bg = 163840;
    private final com.bykv.vk.openvk.bg.bg.IL.IL.IL.InterfaceC0065IL eo;
    private final java.util.concurrent.ExecutorService eqN;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX iR;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX ldr;
    private volatile boolean yDt;

    void bg(com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX bXVar) {
        this.iR = bXVar;
    }

    void bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX bXVar) {
        this.ldr = bXVar;
    }

    public void bg(int i) {
        if (i > 0) {
            this.bg = i;
        }
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
            android.util.Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: ".concat(java.lang.String.valueOf(i)));
        }
    }

    private eqN() {
        android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL>> sparseArray = new android.util.SparseArray<>(2);
        this.IL = sparseArray;
        this.WR = new java.util.HashSet<>();
        this.eo = new com.bykv.vk.openvk.bg.bg.IL.IL.IL.InterfaceC0065IL() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.1
            @Override // com.bykv.vk.openvk.bg.bg.IL.IL.IL.InterfaceC0065IL
            public void bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL il) {
                int iLdr = il.ldr();
                synchronized (com.bykv.vk.openvk.bg.bg.IL.IL.eqN.this.IL) {
                    java.util.Map map = (java.util.Map) com.bykv.vk.openvk.bg.bg.IL.IL.eqN.this.IL.get(iLdr);
                    if (map != null) {
                        map.remove(il.Kg);
                    }
                }
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + il.Kg);
                }
            }
        };
        com.bykv.vk.openvk.bg.bg.IL.IL.eqN.IL<java.lang.Runnable> il = new com.bykv.vk.openvk.bg.bg.IL.IL.eqN.IL<>();
        this.bX = il;
        java.util.concurrent.ExecutorService executorServiceBg = bg(il);
        this.eqN = executorServiceBg;
        il.bg((java.util.concurrent.ThreadPoolExecutor) executorServiceBg);
        sparseArray.put(0, new java.util.HashMap());
        sparseArray.put(1, new java.util.HashMap());
    }

    com.bykv.vk.openvk.bg.bg.IL.IL.bX bg() {
        return this.VB;
    }

    com.bykv.vk.openvk.bg.bg.IL.IL.bX IL() {
        return this.PX;
    }

    public static com.bykv.vk.openvk.bg.bg.IL.IL.eqN bX() {
        if (zx == null) {
            synchronized (com.bykv.vk.openvk.bg.bg.IL.IL.eqN.class) {
                if (zx == null) {
                    zx = new com.bykv.vk.openvk.bg.bg.IL.IL.eqN();
                }
            }
        }
        return zx;
    }

    void bg(boolean z, java.lang.String str) {
        com.bykv.vk.openvk.bg.bg.IL.IL.IL ilRemove;
        this.Ta = str;
        this.yDt = z;
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
            android.util.Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, ".concat(java.lang.String.valueOf(str)));
        }
        java.util.HashSet<com.bykv.vk.openvk.bg.bg.IL.IL.IL> hashSet = null;
        java.util.HashSet<com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bg> hashSet2 = null;
        if (str == null) {
            synchronized (this.WR) {
                if (!this.WR.isEmpty()) {
                    hashSet2 = new java.util.HashSet(this.WR);
                    this.WR.clear();
                }
            }
            if (hashSet2 != null) {
                for (com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bg bgVar : hashSet2) {
                    bg(bgVar.bg, bgVar.IL, bgVar.bX, bgVar.eqN, bgVar.zx, bgVar.ldr);
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                        android.util.Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, resume preload: " + bgVar.eqN);
                    }
                }
                return;
            }
            return;
        }
        int i = com.bykv.vk.openvk.bg.bg.IL.IL.zx.Kg;
        if (i != 3 && i != 2) {
            if (i == 1) {
                synchronized (this.IL) {
                    java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL> map = this.IL.get(com.bykv.vk.openvk.bg.bg.IL.IL.IL.IL.bg(z));
                    ilRemove = map != null ? map.remove(str) : null;
                }
                if (ilRemove != null) {
                    ilRemove.bg();
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.IL) {
            int size = this.IL.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL>> sparseArray = this.IL;
                java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL> map2 = sparseArray.get(sparseArray.keyAt(i2));
                if (map2 != null) {
                    java.util.Collection<com.bykv.vk.openvk.bg.bg.IL.IL.IL> collectionValues = map2.values();
                    if (collectionValues != null && !collectionValues.isEmpty()) {
                        if (hashSet == null) {
                            hashSet = new java.util.HashSet();
                        }
                        hashSet.addAll(collectionValues);
                    }
                    map2.clear();
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        for (com.bykv.vk.openvk.bg.bg.IL.IL.IL il : hashSet) {
            il.bg();
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, cancel preload: " + il.iR);
            }
        }
        if (i == 3) {
            synchronized (this.WR) {
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bg bgVar2 = (com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bg) ((com.bykv.vk.openvk.bg.bg.IL.IL.IL) it.next()).yDt;
                    if (bgVar2 != null) {
                        this.WR.add(bgVar2);
                    }
                }
            }
        }
    }

    public void bg(boolean z, boolean z2, int i, java.lang.String str, java.lang.String... strArr) {
        bg(z, z2, i, str, null, strArr);
    }

    public void bg(boolean z, boolean z2, int i, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String... strArr) {
        java.util.ArrayList arrayList;
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
            android.util.Log.d("TAG_PROXY_Preloader", "preload start ！！！！");
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg bgVar = z ? this.Kg : this.iR;
        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX bXVar = this.ldr;
        if (bgVar == null || bXVar == null) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
                return;
            }
            return;
        }
        if (android.text.TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return;
        }
        int i2 = i <= 0 ? this.bg : i;
        java.lang.String strBg = z2 ? str : com.bykv.vk.openvk.bg.bg.bg.iR.IL.bg(str);
        java.io.File fileEqN = bgVar.eqN(strBg);
        if (fileEqN != null && fileEqN.length() >= i2) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.i("TAG_PROXY_Preloader", "no need preload, file size: " + fileEqN.length() + ", need preload size: " + i2);
                return;
            }
            return;
        }
        if (com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg().bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL.IL.bg(z), strBg)) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.w("TAG_PROXY_Preloader", "has running proxy task, skip preload for key: ".concat(java.lang.String.valueOf(str)));
                return;
            }
            return;
        }
        synchronized (this.IL) {
            java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL> map2 = this.IL.get(z ? 1 : 0);
            if (map2.containsKey(strBg)) {
                return;
            }
            int i3 = i2;
            com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bg bgVar2 = new com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bg(z, z2, i2, str, map, strArr);
            java.lang.String str2 = this.Ta;
            if (str2 != null) {
                int i4 = com.bykv.vk.openvk.bg.bg.IL.IL.zx.Kg;
                if (i4 == 3) {
                    synchronized (this.WR) {
                        this.WR.add(bgVar2);
                    }
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                        android.util.Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", add to pending queue");
                    }
                    return;
                }
                if (i4 == 2) {
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                        android.util.Log.w("TAG_PROXY_Preloader", "cancel preload: ".concat(java.lang.String.valueOf(str)));
                    }
                    return;
                } else if (i4 == 1 && this.yDt == z && str2.equals(strBg)) {
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                        android.util.Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", it is playing");
                    }
                    return;
                }
            }
            java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> listBg = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(map));
            if (listBg != null) {
                arrayList = new java.util.ArrayList(listBg.size());
                int size = listBg.size();
                for (int i5 = 0; i5 < size; i5++) {
                    com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL il = listBg.get(i5);
                    if (il != null) {
                        arrayList.add(new com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL(il.bg, il.IL));
                    }
                }
            } else {
                arrayList = null;
            }
            com.bykv.vk.openvk.bg.bg.IL.IL.IL ilBg = new com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg().bg(bgVar).bg(bXVar).bg(str).IL(strBg).bg(new com.bykv.vk.openvk.bg.bg.IL.IL.PX(com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(strArr))).bg((java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL>) arrayList).bg(i3).bg(this.eo).bg(bgVar2).bg();
            map2.put(strBg, ilBg);
            this.eqN.execute(ilBg);
        }
    }

    public void bg(java.lang.String str) {
        bg(false, false, str);
    }

    public void bg(final boolean z, final boolean z2, final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(new com.bytedance.sdk.component.Kg.Kg("cancel b b S") { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.2
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.bg.bg.IL.IL.IL il;
                synchronized (com.bykv.vk.openvk.bg.bg.IL.IL.eqN.this.IL) {
                    java.util.Map map = (java.util.Map) com.bykv.vk.openvk.bg.bg.IL.IL.eqN.this.IL.get(com.bykv.vk.openvk.bg.bg.IL.IL.IL.IL.bg(z));
                    if (map != null) {
                        il = (com.bykv.vk.openvk.bg.bg.IL.IL.IL) map.remove(z2 ? str : com.bykv.vk.openvk.bg.bg.bg.iR.IL.bg(str));
                    } else {
                        il = null;
                    }
                }
                if (il != null) {
                    il.bg();
                }
            }
        });
    }

    public void eqN() {
        com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(new com.bytedance.sdk.component.Kg.Kg("cancelAll") { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.3
            @Override // java.lang.Runnable
            public void run() {
                java.util.ArrayList<com.bykv.vk.openvk.bg.bg.IL.IL.IL> arrayList = new java.util.ArrayList();
                synchronized (com.bykv.vk.openvk.bg.bg.IL.IL.eqN.this.IL) {
                    int size = com.bykv.vk.openvk.bg.bg.IL.IL.eqN.this.IL.size();
                    for (int i = 0; i < size; i++) {
                        java.util.Map map = (java.util.Map) com.bykv.vk.openvk.bg.bg.IL.IL.eqN.this.IL.get(com.bykv.vk.openvk.bg.bg.IL.IL.eqN.this.IL.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    com.bykv.vk.openvk.bg.bg.IL.IL.eqN.this.bX.clear();
                }
                for (com.bykv.vk.openvk.bg.bg.IL.IL.IL il : arrayList) {
                    il.bg();
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                        android.util.Log.w("TAG_PROXY_Preloader", "PreloadTask: " + il + ", canceled!!!");
                    }
                }
            }
        });
    }

    private static final class bg {
        final boolean IL;
        final int bX;
        final boolean bg;
        final java.lang.String eqN;
        final java.lang.String[] ldr;
        final java.util.Map<java.lang.String, java.lang.String> zx;

        bg(boolean z, boolean z2, int i, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String[] strArr) {
            this.bg = z;
            this.IL = z2;
            this.bX = i;
            this.eqN = str;
            this.zx = map;
            this.ldr = strArr;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bg bgVar = (com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bg) obj;
            if (this.bg == bgVar.bg && this.IL == bgVar.IL && this.bX == bgVar.bX) {
                return this.eqN.equals(bgVar.eqN);
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.bg ? 1 : 0) * 31) + (this.IL ? 1 : 0)) * 31) + this.bX) * 31) + this.eqN.hashCode();
        }
    }

    private static final class IL<T> extends java.util.concurrent.LinkedBlockingDeque<T> {
        private java.util.concurrent.ThreadPoolExecutor bg;

        private IL() {
        }

        public void bg(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.bg != null) {
                    throw new java.lang.IllegalStateException("You can only call setExecutor() once!");
                }
                if (threadPoolExecutor == null) {
                    throw new java.lang.NullPointerException("executor argument can't be null!");
                }
                this.bg = threadPoolExecutor;
            }
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public boolean offer(T t) {
            synchronized (this) {
                int poolSize = this.bg.getPoolSize();
                int activeCount = this.bg.getActiveCount();
                int maximumPoolSize = this.bg.getMaximumPoolSize();
                if (activeCount >= poolSize && poolSize < maximumPoolSize) {
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                        android.util.Log.i("TAG_PROXY_TT", "create new preloader thread");
                    }
                    return false;
                }
                return offerFirst(t);
            }
        }
    }

    private static java.util.concurrent.ExecutorService bg(final com.bykv.vk.openvk.bg.bg.IL.IL.eqN.IL<java.lang.Runnable> il) {
        int i;
        int iBg = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg();
        if (iBg > 0) {
            if (iBg > 4) {
                i = 4;
            }
            return new java.util.concurrent.ThreadPoolExecutor(0, i, 60L, java.util.concurrent.TimeUnit.SECONDS, il, new java.util.concurrent.ThreadFactory() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.4
                @Override // java.util.concurrent.ThreadFactory
                public java.lang.Thread newThread(java.lang.Runnable runnable) {
                    java.lang.Thread thread = new java.lang.Thread(runnable) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.4.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            try {
                                android.os.Process.setThreadPriority(10);
                            } catch (java.lang.Throwable unused) {
                            }
                            super.run();
                        }
                    };
                    thread.setName("csj_video_preload_" + thread.getId());
                    thread.setDaemon(true);
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                        android.util.Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                    }
                    return thread;
                }
            }, new java.util.concurrent.RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.5
                @Override // java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
                    try {
                        il.offerFirst(runnable);
                        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                            android.util.Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
            });
        }
        iBg = 1;
        i = iBg;
        return new java.util.concurrent.ThreadPoolExecutor(0, i, 60L, java.util.concurrent.TimeUnit.SECONDS, il, new java.util.concurrent.ThreadFactory() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.4
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread thread = new java.lang.Thread(runnable) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.4.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            android.os.Process.setThreadPriority(10);
                        } catch (java.lang.Throwable unused) {
                        }
                        super.run();
                    }
                };
                thread.setName("csj_video_preload_" + thread.getId());
                thread.setDaemon(true);
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                }
                return thread;
            }
        }, new java.util.concurrent.RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.eqN.5
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
                try {
                    il.offerFirst(runnable);
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                        android.util.Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }
}
