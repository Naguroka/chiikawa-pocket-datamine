package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
class bm extends android.view.View implements com.amoad.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.lang.String f296a = "bm";
    private com.amoad.g b;
    private int c;
    private final double d;
    private final long e;
    private final com.amoad.bm.a f;

    interface a {
        void a(com.amoad.bm bmVar);

        void b(com.amoad.bm bmVar);
    }

    bm(android.content.Context context, double d, long j, com.amoad.bm.a aVar) {
        super(context);
        this.d = d;
        this.e = j;
        this.f = aVar;
        setClickable(false);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(1, 1));
    }

    private void a() {
        com.amoad.g gVar = this.b;
        this.b = null;
        if (gVar != null) {
            gVar.b(this);
        }
    }

    @Override // com.amoad.g.a
    public final void a(android.view.View view, float f) {
        if (f < this.d) {
            this.c = 0;
            return;
        }
        int i = this.c;
        this.c = i + 1;
        if (((long) i) * com.amoad.g.f306a >= this.e) {
            post(new java.lang.Runnable() { // from class: com.amoad.bm.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.amoad.bm.this.f.b(com.amoad.bm.this);
                }
            });
            a();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof android.view.View) {
            com.amoad.g gVarA = com.amoad.g.a((android.view.View) getParent());
            this.b = gVarA;
            gVarA.a((com.amoad.g.a) this);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        post(new java.lang.Runnable() { // from class: com.amoad.bm.1
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.bm.this.f.a(com.amoad.bm.this);
            }
        });
        a();
    }
}
