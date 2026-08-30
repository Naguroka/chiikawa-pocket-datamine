package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f306a = java.util.concurrent.TimeUnit.MILLISECONDS.toMillis(500);
    static final long b = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);
    private static java.util.Map<android.view.View, com.amoad.g> c = new java.util.WeakHashMap();
    private java.lang.ref.WeakReference<android.view.View> d;
    private com.amoad.aj<com.amoad.g.a> e = new com.amoad.aj<>();
    private android.os.Handler f;

    interface a {
        void a(android.view.View view, float f);
    }

    private g(android.view.View view) {
        this.d = new java.lang.ref.WeakReference<>(view);
    }

    static com.amoad.g a(android.view.View view) {
        com.amoad.g gVar = c.get(view);
        if (gVar != null) {
            return gVar;
        }
        com.amoad.g gVar2 = new com.amoad.g(view);
        c.put(view, gVar2);
        return gVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        android.os.Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f = null;
        }
    }

    final void a(com.amoad.g.a aVar) {
        if (this.e.a(aVar) && this.e.f210a.size() == 1) {
            a();
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            this.f = handler;
            handler.postDelayed(new java.lang.Runnable() { // from class: com.amoad.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    final android.view.View view = (android.view.View) com.amoad.g.this.d.get();
                    if (view == null) {
                        com.amoad.g.this.a();
                        return;
                    }
                    final float fA = com.amoad.l.a(view);
                    final android.graphics.Rect rect = new android.graphics.Rect();
                    if (fA > 0.0f) {
                        com.amoad.l.a(view, rect);
                    }
                    com.amoad.g.this.e.a((com.amoad.aj.a) new com.amoad.aj.a<com.amoad.g.a>() { // from class: com.amoad.g.1.1
                        @Override // com.amoad.aj.a
                        public final /* bridge */ /* synthetic */ void a(com.amoad.g.a aVar2) {
                            aVar2.a(view, fA);
                        }
                    });
                    if (com.amoad.g.this.f != null) {
                        com.amoad.g.this.f.postDelayed(this, com.amoad.g.f306a);
                    }
                }
            }, f306a);
        }
    }

    final void b(com.amoad.g.a aVar) {
        if (this.e.b(aVar) && this.e.f210a.size() == 0) {
            a();
        }
    }
}
