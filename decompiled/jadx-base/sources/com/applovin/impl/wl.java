package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class wl implements com.applovin.impl.ia {
    private static final java.util.List b = new java.util.ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f1472a;

    @Override // com.applovin.impl.ia
    public com.applovin.impl.ia.a d(int i) {
        return a().a(this.f1472a.obtainMessage(i), this);
    }

    public wl(android.os.Handler handler) {
        this.f1472a = handler;
    }

    @Override // com.applovin.impl.ia
    public boolean a(int i) {
        return this.f1472a.hasMessages(i);
    }

    @Override // com.applovin.impl.ia
    public boolean c(int i) {
        return this.f1472a.sendEmptyMessage(i);
    }

    @Override // com.applovin.impl.ia
    public void b(int i) {
        this.f1472a.removeMessages(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.applovin.impl.wl.b bVar) {
        java.util.List list = b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    private static final class b implements com.applovin.impl.ia.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.os.Message f1473a;
        private com.applovin.impl.wl b;

        private b() {
        }

        public boolean a(android.os.Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((android.os.Message) com.applovin.impl.b1.a(this.f1473a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        private void b() {
            this.f1473a = null;
            this.b = null;
            com.applovin.impl.wl.b(this);
        }

        @Override // com.applovin.impl.ia.a
        public void a() {
            ((android.os.Message) com.applovin.impl.b1.a(this.f1473a)).sendToTarget();
            b();
        }

        public com.applovin.impl.wl.b a(android.os.Message message, com.applovin.impl.wl wlVar) {
            this.f1473a = message;
            this.b = wlVar;
            return this;
        }
    }

    @Override // com.applovin.impl.ia
    public boolean a(java.lang.Runnable runnable) {
        return this.f1472a.post(runnable);
    }

    @Override // com.applovin.impl.ia
    public void a(java.lang.Object obj) {
        this.f1472a.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.impl.ia
    public boolean a(int i, long j) {
        return this.f1472a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.applovin.impl.ia
    public boolean a(com.applovin.impl.ia.a aVar) {
        return ((com.applovin.impl.wl.b) aVar).a(this.f1472a);
    }

    @Override // com.applovin.impl.ia
    public com.applovin.impl.ia.a a(int i, java.lang.Object obj) {
        return a().a(this.f1472a.obtainMessage(i, obj), this);
    }

    @Override // com.applovin.impl.ia
    public com.applovin.impl.ia.a a(int i, int i2, int i3) {
        return a().a(this.f1472a.obtainMessage(i, i2, i3), this);
    }

    @Override // com.applovin.impl.ia
    public com.applovin.impl.ia.a a(int i, int i2, int i3, java.lang.Object obj) {
        return a().a(this.f1472a.obtainMessage(i, i2, i3, obj), this);
    }

    private static com.applovin.impl.wl.b a() {
        com.applovin.impl.wl.b bVar;
        java.util.List list = b;
        synchronized (list) {
            if (list.isEmpty()) {
                bVar = new com.applovin.impl.wl.b();
            } else {
                bVar = (com.applovin.impl.wl.b) list.remove(list.size() - 1);
            }
        }
        return bVar;
    }
}
