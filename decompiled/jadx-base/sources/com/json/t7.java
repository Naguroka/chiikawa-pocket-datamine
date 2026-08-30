package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class t7 implements java.util.concurrent.Callable<com.json.x7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3425a;
    private final java.lang.String b;
    private final com.json.mediationsdk.adunit.adapter.utility.AdData c;
    private final com.json.v7 d;
    private final com.json.u7 e;
    private final com.json.mediationsdk.model.NetworkSettings f;

    class a implements com.json.mediationsdk.bidding.BiddingDataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.fb f3426a;
        final /* synthetic */ java.util.concurrent.BlockingQueue b;

        a(com.json.fb fbVar, java.util.concurrent.BlockingQueue blockingQueue) {
            this.f3426a = fbVar;
            this.b = blockingQueue;
        }

        @Override // com.json.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(java.lang.String str) {
            this.b.add(new com.json.x7(com.json.t7.this.d(), com.json.t7.this.c(), null, com.json.fb.a(this.f3426a), str));
        }

        @Override // com.json.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(java.util.Map<java.lang.String, java.lang.Object> map) {
            this.b.add(new com.json.x7(com.json.t7.this.d(), com.json.t7.this.c(), map, com.json.fb.a(this.f3426a), null));
        }
    }

    public t7(int i, java.lang.String str, com.json.mediationsdk.adunit.adapter.utility.AdData adData, com.json.v7 v7Var, com.json.u7 u7Var, com.json.mediationsdk.model.NetworkSettings networkSettings) {
        this.f3425a = i;
        this.b = str;
        this.c = adData;
        this.d = v7Var;
        this.e = u7Var;
        this.f = networkSettings;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007f A[PHI: r0 r2
  0x007f: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v9 java.lang.String) binds: [B:7:0x0058, B:11:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r2v10 com.ironsource.u7) = (r2v9 com.ironsource.u7), (r2v14 com.ironsource.u7) binds: [B:7:0x0058, B:11:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.json.x7 call() throws java.lang.Exception {
        java.lang.String str;
        com.json.u7 u7Var;
        com.json.fb fbVar = new com.json.fb();
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = new java.util.concurrent.ArrayBlockingQueue(1);
        try {
            b().a(this.c, new com.ironsource.t7.a(fbVar, arrayBlockingQueue));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            str = "Exception while calling collectBiddingData - " + e.getMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
            u7Var = this.e;
            if (u7Var != null) {
                u7Var.a(str);
            }
        } catch (java.lang.NoClassDefFoundError e2) {
            com.json.l9.d().a(e2);
            str = "Error while calling collectBiddingData - " + e2.getMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
            u7Var = this.e;
            if (u7Var != null) {
                u7Var.a(str);
            }
        }
        com.json.u7 u7Var2 = this.e;
        if (u7Var2 != null) {
            u7Var2.a(this.f);
        }
        return (com.json.x7) arrayBlockingQueue.take();
    }

    public com.json.v7 b() {
        return this.d;
    }

    public java.lang.String c() {
        return this.b;
    }

    public int d() {
        return this.f3425a;
    }
}
