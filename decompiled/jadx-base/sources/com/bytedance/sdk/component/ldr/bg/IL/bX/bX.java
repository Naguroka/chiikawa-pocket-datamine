package com.bytedance.sdk.component.ldr.bg.IL.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends android.os.HandlerThread implements android.os.Handler.Callback {
    private static int tuV = 200;
    private static int xxp = 10;
    private final int Fy;
    private volatile boolean IL;
    private volatile long Kg;
    private final int LZ;
    private final java.util.concurrent.atomic.AtomicInteger Lq;
    private final java.util.concurrent.atomic.AtomicInteger PX;
    private volatile android.os.Handler Ta;
    private final long VB;
    private long VzQ;
    private final java.util.concurrent.atomic.AtomicInteger WR;
    private final java.lang.Object bX;
    protected com.bytedance.sdk.component.ldr.bg.bg.eqN bg;
    private final long eo;
    private com.bytedance.sdk.component.ldr.bg.IL.bX eqN;
    private volatile long iR;
    private volatile int ldr;
    private final int tC;
    private final java.util.concurrent.atomic.AtomicInteger vb;
    private final java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> yDt;
    private final java.util.concurrent.PriorityBlockingQueue<com.bytedance.sdk.component.ldr.bg.eqN.bg> zx;

    public static void bg(int i) {
        xxp = i;
    }

    public static void IL(int i) {
        tuV = i;
    }

    public bX(java.util.concurrent.PriorityBlockingQueue<com.bytedance.sdk.component.ldr.bg.eqN.bg> priorityBlockingQueue) {
        super("csj_log");
        this.IL = true;
        this.bX = new java.lang.Object();
        this.iR = 0L;
        this.Kg = 0L;
        this.WR = new java.util.concurrent.atomic.AtomicInteger(0);
        this.eo = 5000L;
        this.VB = 5000000000L;
        this.PX = new java.util.concurrent.atomic.AtomicInteger(0);
        this.yDt = new java.util.ArrayList();
        this.Lq = new java.util.concurrent.atomic.AtomicInteger(0);
        this.vb = new java.util.concurrent.atomic.AtomicInteger(0);
        this.VzQ = 60000L;
        this.Fy = 1;
        this.LZ = 2;
        this.tC = 3;
        this.zx = priorityBlockingQueue;
        this.bg = new com.bytedance.sdk.component.ldr.bg.bg.IL();
        if (com.bytedance.sdk.component.ldr.bg.IL.IL()) {
            return;
        }
        long jLq = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().Lq();
        if (jLq > 0) {
            this.VzQ = jLq;
        }
    }

    public void bg(boolean z) {
        this.IL = z;
    }

    public boolean bg() {
        return this.IL;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.WR(), 1);
                IL();
                bg(true);
                zx();
            } else {
                if (i != 2 && i != 3) {
                    if (i == 11) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(this.yDt);
                        this.yDt.clear();
                        bg((java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg>) arrayList, false, "timeout_dispatch");
                        eo();
                    }
                    return true;
                }
                bX();
            }
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
        return true;
    }

    private void IL() {
        long jXxp = com.bytedance.sdk.component.ldr.bg.Kg.iR().xxp();
        if (jXxp <= 0) {
            return;
        }
        this.bg.bg(Integer.MAX_VALUE, jXxp);
    }

    private void bX() {
        eqN();
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.ZQc(), 1);
        bX(1);
    }

    private void eqN() {
        if (!isAlive()) {
            com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.eqN();
        } else {
            if (bg()) {
                return;
            }
            bX(6);
        }
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.Ta = new android.os.Handler(getLooper(), this);
        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bg(this.Ta);
        this.Ta.sendEmptyMessage(1);
    }

    public boolean bg(int i, boolean z) {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb == null || !zxVarVb.bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr())) {
            return false;
        }
        return this.bg.bg(i, z);
    }

    public void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, boolean z) {
        if (bgVar == null) {
            return;
        }
        bgVar.eqN();
        if (z) {
            if (this.Ta != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(bgVar);
                bg((java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.zx.add(bgVar);
        zx(2);
    }

    public void bX(int i) {
        try {
            boolean zBg = bg(i, com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL);
            if (i == 6 || zBg) {
                com.bytedance.sdk.component.ldr.bg.eqN.IL il = new com.bytedance.sdk.component.ldr.bg.eqN.IL();
                il.IL(i);
                this.zx.add(il);
                zx(3);
            }
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }

    private void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, int i) {
        this.WR.set(0);
        if (i == 0) {
            this.ldr = ((com.bytedance.sdk.component.ldr.bg.eqN.IL) bgVar).VB();
            if (this.ldr != 6) {
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Dxa(), 1);
                IL(bgVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.ldr.bg.eqN.IL il = (com.bytedance.sdk.component.ldr.bg.eqN.IL) bgVar;
        if (il.VB() == 1) {
            this.ldr = 1;
            IL(bgVar);
        } else if (il.VB() == 2) {
            iR();
            this.ldr = 2;
            IL(bgVar);
        }
    }

    private void zx() {
        while (bg()) {
            try {
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Kg(), 1);
                com.bytedance.sdk.component.ldr.bg.eqN.bg bgVarPoll = this.zx.poll(this.VzQ, java.util.concurrent.TimeUnit.MILLISECONDS);
                int size = this.zx.size();
                if (bgVarPoll instanceof com.bytedance.sdk.component.ldr.bg.eqN.IL) {
                    bg(bgVarPoll, size);
                } else if (bgVarPoll == null) {
                    int iIncrementAndGet = this.WR.incrementAndGet();
                    com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.bN(), 1);
                    if (eqN(iIncrementAndGet)) {
                        ldr();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.ldr = 1;
                        IL((com.bytedance.sdk.component.ldr.bg.eqN.bg) null);
                    }
                } else {
                    bg(bgVarPoll);
                    IL(bgVarPoll);
                }
            } catch (java.lang.Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.CQc(), 1);
            }
        }
    }

    private boolean eqN(int i) {
        return i >= 4 && this.PX.get() == 0 && !com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL && !com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX;
    }

    private void ldr() {
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.tC(), 1);
        bg(false);
        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX();
    }

    private void iR() {
        if (this.zx.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                com.bytedance.sdk.component.ldr.bg.eqN.bg bgVarPoll = this.zx.poll();
                if (!(bgVarPoll instanceof com.bytedance.sdk.component.ldr.bg.eqN.IL) && bgVarPoll != null) {
                    bg(bgVarPoll);
                }
            }
        }
    }

    private void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        this.WR.set(0);
        if (com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL) {
            this.ldr = 5;
        } else if (com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX) {
            this.ldr = 7;
        } else {
            this.ldr = 4;
        }
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.ApA(), 1);
        this.bg.bg(bgVar, this.ldr);
        com.bytedance.sdk.component.ldr.bg.bX.bg.iR(bgVar);
    }

    private boolean Kg() {
        if (com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL) {
            return this.ldr == 4 || this.ldr == 7 || this.ldr == 6 || this.ldr == 5 || this.ldr == 2;
        }
        return false;
    }

    private void IL(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg;
        if (com.bytedance.sdk.component.ldr.bg.bX.bg.IL() && com.bytedance.sdk.component.ldr.bg.Kg.iR().bg()) {
            return;
        }
        int i = 0;
        if (Kg()) {
            com.bytedance.sdk.component.ldr.bg.bX.bg.bg(this.ldr);
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.PX(), 1);
            if (this.zx.size() != 0) {
                return;
            }
            if (!this.Ta.hasMessages(2)) {
                com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL = false;
                this.Kg = 0L;
                this.iR = 0L;
                this.Lq.set(0);
                this.vb.set(0);
            } else {
                bg(false);
                return;
            }
        }
        do {
            boolean zBg = bg(this.ldr, com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL);
            com.bytedance.sdk.component.ldr.bg.bX.bg.bg(zBg, this.ldr, bgVar);
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Ta(), 1);
            if (zBg && (listBg = this.bg.bg(this.ldr, -1, null)) != null) {
                listBg.size();
                bg(listBg);
            } else {
                WR();
            }
            i++;
            if (!zBg) {
                return;
            }
        } while (i <= 6);
    }

    private void WR() {
        try {
            if (this.zx.size() == 0 && this.Ta.hasMessages(11) && bg()) {
                bg(false);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    private void bg(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, java.lang.String str) {
        bg(str);
        bg(list, false, str);
        eo();
    }

    private void bg(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.ldr.bg.bX.bg.bg(list, this.zx.size());
            if (list.size() > 1 || com.bytedance.sdk.component.ldr.bg.bX.bg.bX()) {
                bg(list, "batchRead");
                return;
            }
            com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar = list.get(0);
            if (bgVar != null) {
                if (bgVar.zx() == 1) {
                    bg(list, "highPriority");
                    return;
                }
                if (bgVar.eqN() == 0 && bgVar.zx() == 2) {
                    if (bgVar.IL() == 3) {
                        bg(list, "version_v3");
                        return;
                    } else {
                        IL(list);
                        return;
                    }
                }
                if (bgVar.eqN() == 1) {
                    bg(list, "stats");
                    return;
                } else if (bgVar.eqN() == 3) {
                    bg(list, "adType_v3");
                    return;
                } else {
                    if (bgVar.eqN() == 2) {
                        bg(list, "other");
                        return;
                    }
                    return;
                }
            }
            return;
        }
        WR();
    }

    private void IL(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list) {
        this.yDt.addAll(list);
        this.yDt.size();
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb != null && zxVarVb.PX() != null) {
            xxp = zxVarVb.PX().IL();
        }
        if (this.yDt.size() >= xxp) {
            if (this.Ta.hasMessages(11)) {
                this.Ta.removeMessages(11);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.yDt);
            this.yDt.clear();
            bg((java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg>) arrayList, false, "max_size_dispatch");
            eo();
            return;
        }
        if (this.zx.size() == 0) {
            bg(false);
            if (this.Ta.hasMessages(11)) {
                this.Ta.removeMessages(11);
            }
            if (this.Ta.hasMessages(1)) {
                this.Ta.removeMessages(1);
            }
            long jBg = tuV;
            if (zxVarVb != null && zxVarVb.PX() != null) {
                jBg = zxVarVb.PX().bg();
            }
            this.Ta.sendEmptyMessageDelayed(11, jBg);
            return;
        }
        this.yDt.size();
    }

    private void bg(java.lang.String str) {
        if (this.Ta.hasMessages(11)) {
            this.Ta.removeMessages(11);
        }
        if (this.yDt.size() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.yDt);
            this.yDt.clear();
            bg((java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg>) arrayList, false, "before_".concat(java.lang.String.valueOf(str)));
            eo();
            arrayList.size();
        }
    }

    private void bg(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, boolean z, java.lang.String str) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.bytedance.sdk.component.ldr.bg.bX.bg.bg(list, this.ldr, str);
        com.bytedance.sdk.component.ldr.bg.IL.bX bXVarKg = com.bytedance.sdk.component.ldr.bg.Kg.iR().Kg();
        this.eqN = bXVarKg;
        if (bXVarKg != null) {
            IL(list, z, jCurrentTimeMillis);
        } else {
            bg(list, z, jCurrentTimeMillis);
        }
    }

    private void bg(final java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, final boolean z, final long j) {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb != null) {
            java.util.concurrent.Executor executorZx = zxVarVb.zx();
            if (list.get(0).zx() == 1) {
                executorZx = zxVarVb.eqN();
            }
            if (executorZx == null) {
                return;
            }
            this.PX.incrementAndGet();
            executorZx.execute(new com.bytedance.sdk.component.ldr.bg.zx.zx("csj_log_upload") { // from class: com.bytedance.sdk.component.ldr.bg.IL.bX.bX.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.ldr.bg.IL.bX.bX bXVar = com.bytedance.sdk.component.ldr.bg.IL.bX.bX.this;
                    bXVar.bg((java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg>) list, z, j, bXVar.ldr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, boolean z, long j, int i) {
        com.bytedance.sdk.component.ldr.bg.IL.bX.IL ilBg;
        try {
            com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar = list.get(0);
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.zCS(), 1);
            if (bgVar.eqN() == 0) {
                ilBg = com.bytedance.sdk.component.ldr.bg.Kg.zx().bg(list);
                bg(ilBg, list);
                if (ilBg != null) {
                    com.bytedance.sdk.component.ldr.bg.bX.bg.bg(list, ilBg.eqN);
                }
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator<com.bytedance.sdk.component.ldr.bg.eqN.bg> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().iR());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (java.lang.Exception e) {
                    e.getMessage();
                }
                ilBg = com.bytedance.sdk.component.ldr.bg.Kg.zx().bg(jSONObject);
            }
            com.bytedance.sdk.component.ldr.bg.IL.bX.IL il = ilBg;
            this.PX.decrementAndGet();
            bg(z, il, list, j);
        } catch (java.lang.Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.CQc(), 1);
            this.PX.decrementAndGet();
        }
    }

    private void IL(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, final boolean z, final long j) {
        this.PX.incrementAndGet();
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.zCS(), 1);
        try {
            java.util.HashMap map = new java.util.HashMap();
            java.util.Iterator<com.bytedance.sdk.component.ldr.bg.eqN.bg> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.ldr.bg.eqN.bg next = it.next();
                int iEo = next == null ? 0 : next.eo();
                if (map.get(java.lang.Integer.valueOf(iEo)) == null) {
                    map.put(java.lang.Integer.valueOf(iEo), new java.util.ArrayList());
                }
                ((java.util.List) map.get(java.lang.Integer.valueOf(iEo))).add(next);
            }
            java.util.Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                int iIntValue = ((java.lang.Integer) it2.next()).intValue();
                if (iIntValue == 0 || com.bytedance.sdk.component.ldr.bg.Kg.iR().bX() == null || com.bytedance.sdk.component.ldr.bg.Kg.iR().bX().get(java.lang.Integer.valueOf(iIntValue)) == null) {
                    this.eqN.bg(list, new com.bytedance.sdk.component.ldr.bg.IL.IL() { // from class: com.bytedance.sdk.component.ldr.bg.IL.bX.bX.2
                        @Override // com.bytedance.sdk.component.ldr.bg.IL.IL
                        public void bg(java.util.List<com.bytedance.sdk.component.ldr.bg.IL.bX.bg> list2) {
                            try {
                                com.bytedance.sdk.component.ldr.bg.IL.bX.bX.this.PX.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    com.bytedance.sdk.component.ldr.bg.IL.bX.bg bgVar = list2.get(i);
                                    if (bgVar != null) {
                                        com.bytedance.sdk.component.ldr.bg.IL.bX.bX.this.bg(z, bgVar.bg(), bgVar.IL(), j);
                                    }
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    });
                } else {
                    com.bytedance.sdk.component.ldr.bg.Kg.iR().bX().get(java.lang.Integer.valueOf(iIntValue)).bg(list, new com.bytedance.sdk.component.ldr.bg.IL.IL() { // from class: com.bytedance.sdk.component.ldr.bg.IL.bX.bX.3
                        @Override // com.bytedance.sdk.component.ldr.bg.IL.IL
                        public void bg(java.util.List<com.bytedance.sdk.component.ldr.bg.IL.bX.bg> list2) {
                            try {
                                com.bytedance.sdk.component.ldr.bg.IL.bX.bX.this.PX.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    com.bytedance.sdk.component.ldr.bg.IL.bX.bg bgVar = list2.get(i);
                                    if (bgVar != null) {
                                        com.bytedance.sdk.component.ldr.bg.IL.bX.bX.this.bg(z, bgVar.bg(), bgVar.IL(), j);
                                    }
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    });
                }
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.CQc(), 1);
            this.PX.decrementAndGet();
        }
    }

    private void zx(int i) {
        if (!bg()) {
            if (this.Ta == null) {
                return;
            }
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.bX(), 1);
            if (this.Ta.hasMessages(1)) {
                return;
            }
            if (i == 1) {
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.ldr(), 1);
            } else if (i == 2) {
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.eqN(), 1);
            } else if (i == 3) {
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.zx(), 1);
            }
            this.Ta.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.bg(), 1);
    }

    private void bg(com.bytedance.sdk.component.ldr.bg.IL.bX.IL il, java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list) {
        if (il == null || !il.bg) {
            return;
        }
        java.util.List<java.lang.Object> listBg = com.bytedance.sdk.component.ldr.bg.IL.bg();
        if (list == null || listBg == null || listBg.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar : list) {
            if (bgVar.zx() == 1) {
                com.bytedance.sdk.component.ldr.bg.bX.bg.bg(bgVar);
                com.bytedance.sdk.component.ldr.bg.bX.bg.zx(bgVar);
                java.util.Iterator<java.lang.Object> it = listBg.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    private void eo() {
        if (this.Ta.hasMessages(11)) {
            WR();
        } else {
            zx(1);
        }
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.IL(), 1);
        if (this.ldr != 2) {
            return;
        }
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.iR(), 1);
        synchronized (this.bX) {
            try {
                try {
                    long jNanoTime = java.lang.System.nanoTime();
                    this.bX.wait(5000L);
                    long jNanoTime2 = java.lang.System.nanoTime() - jNanoTime;
                    if (!com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL) {
                        boolean z = com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX;
                    }
                    if (jNanoTime2 < 5000000000L && 5000000000L - jNanoTime2 >= 50000000) {
                        if (!com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL && !com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX) {
                            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.LKE(), 1);
                            bX(2);
                            return;
                        }
                        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.VB(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.eo(), 1);
                } catch (java.lang.InterruptedException e) {
                    e.getMessage();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(boolean z, com.bytedance.sdk.component.ldr.bg.IL.bX.IL il, java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, long j) {
        if (z || il == null) {
            return;
        }
        int i = il.IL;
        int i2 = -2;
        if (il.zx) {
            i = -1;
        } else if (i < 0) {
            i = -2;
        }
        if (i == 510 || i == 511) {
            i = -2;
        }
        if (il.bg || ((i < 500 || i >= 509) && i <= 513)) {
            i2 = i;
        }
        if (list != null) {
            list.size();
            this.PX.get();
        }
        bg(i2, list, j);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[Catch: all -> 0x00fd, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3 A[Catch: all -> 0x00fd, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    private void bg(int i, java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, long j) {
        synchronized (this.bX) {
            if (list != null) {
                if (this.Ta != null) {
                    com.bytedance.sdk.component.ldr.bg.bX.bg.bg(i, list, j);
                    this.bg.bg(i, list);
                    com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
                    if (i == -2) {
                        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL = false;
                        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX = true;
                        if (this.Ta.hasMessages(3)) {
                            return;
                        }
                        if (java.lang.System.currentTimeMillis() - this.Kg < androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
                            return;
                        }
                        this.Kg = java.lang.System.currentTimeMillis();
                        if (this.Ta.hasMessages(2)) {
                            this.Ta.removeMessages(2);
                        }
                        bg(3, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                    } else if (i == -1) {
                        if (!com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL || com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX) {
                            com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL = false;
                            com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX = false;
                            if (this.Ta.hasMessages(2)) {
                                this.Ta.removeMessages(2);
                            }
                            if (this.Ta.hasMessages(3)) {
                                this.Ta.removeMessages(3);
                            }
                            this.Kg = 0L;
                            this.iR = 0L;
                            this.Lq.set(0);
                            this.vb.set(0);
                            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.uu(), 1);
                            bX(2);
                        }
                    } else if (i == 0) {
                        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL = false;
                        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX = true;
                        if (this.Ta.hasMessages(3)) {
                            return;
                        }
                        if (java.lang.System.currentTimeMillis() - this.Kg < androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
                            return;
                        }
                        this.Kg = java.lang.System.currentTimeMillis();
                        if (this.Ta.hasMessages(2)) {
                            this.Ta.removeMessages(2);
                        }
                        bg(3, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                    } else if (i != 200) {
                        if (i == 509) {
                            com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL = true;
                            com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX = false;
                            if (this.Ta.hasMessages(2)) {
                                return;
                            }
                            if (java.lang.System.currentTimeMillis() - this.iR < 30000) {
                                return;
                            }
                            this.iR = java.lang.System.currentTimeMillis();
                            if (this.Ta.hasMessages(3)) {
                                this.Ta.removeMessages(3);
                            }
                            bg(2, 30000L);
                        }
                    } else if (!com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL) {
                        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL = false;
                        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX = false;
                        if (this.Ta.hasMessages(2)) {
                            this.Ta.removeMessages(2);
                        }
                        if (this.Ta.hasMessages(3)) {
                            this.Ta.removeMessages(3);
                        }
                        this.Kg = 0L;
                        this.iR = 0L;
                        this.Lq.set(0);
                        this.vb.set(0);
                        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.uu(), 1);
                        bX(2);
                    } else {
                        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL = false;
                        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX = false;
                        if (this.Ta.hasMessages(2)) {
                            this.Ta.removeMessages(2);
                        }
                        if (this.Ta.hasMessages(3)) {
                            this.Ta.removeMessages(3);
                        }
                        this.Kg = 0L;
                        this.iR = 0L;
                        this.Lq.set(0);
                        this.vb.set(0);
                        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.uu(), 1);
                        bX(2);
                    }
                    if (this.ldr == 2) {
                        this.bX.notify();
                    }
                    this.zx.size();
                }
            }
        }
    }

    public void bg(int i, long j) {
        if (this.Ta == null) {
            return;
        }
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = i;
        if (i == 2) {
            this.Ta.sendMessageDelayed(messageObtain, ((long) (((this.Lq.incrementAndGet() - 1) % 4) + 1)) * j);
        } else if (i == 3) {
            this.Ta.sendMessageDelayed(messageObtain, ((long) (((this.vb.incrementAndGet() - 1) % 4) + 1)) * j);
        }
    }
}
