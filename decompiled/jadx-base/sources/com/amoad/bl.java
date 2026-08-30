package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class bl extends android.widget.RelativeLayout {
    private static final java.lang.String d = "bl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.amoad.bj f293a;
    com.amoad.bb b;
    com.amoad.bl.a c;
    private com.amoad.bj.a e;
    private com.amoad.bb.a f;

    interface a {
        void a();
    }

    bl(android.content.Context context) {
        super(context);
        this.e = new com.amoad.bj.a() { // from class: com.amoad.bl.1
            @Override // com.amoad.bj.a
            public final void a(int i, int i2) {
                com.amoad.bl.a aVar;
                if (i == com.amoad.bj.c.f291a) {
                    com.amoad.bl.this.b.a(!((android.media.AudioManager) com.amoad.bl.this.getContext().getSystemService("audio")).isMusicActive());
                }
                if (i2 == com.amoad.bj.c.d && (aVar = com.amoad.bl.this.c) != null) {
                    aVar.a();
                }
                com.amoad.bl.this.b.setVisibility(i2 == com.amoad.bj.c.d ? 4 : 0);
            }
        };
        this.f = new com.amoad.bb.a() { // from class: com.amoad.bl.2
            @Override // com.amoad.bb.a
            public final void a(boolean z) {
                com.amoad.bl.this.f293a.a(!z);
            }
        };
        com.amoad.bj bjVar = new com.amoad.bj(context);
        this.f293a = bjVar;
        bjVar.h = this.e;
        addView(this.f293a);
        com.amoad.bb bbVar = new com.amoad.bb(context);
        this.b = bbVar;
        bbVar.f = this.f;
        this.b.a(true);
        addView(this.b);
    }

    public final void a(android.graphics.Rect rect) {
        this.b.getHitRect(rect);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.amoad.bj bjVar = this.f293a;
        bjVar.layout(0, 0, bjVar.getMeasuredWidth(), this.f293a.getMeasuredHeight());
        com.amoad.bb bbVar = this.b;
        bbVar.layout(0, 0, bbVar.getMeasuredWidth(), this.b.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.f293a.measure(i, i2);
        this.b.measure(i, i2);
        setMeasuredDimension(this.f293a.getMeasuredWidth(), this.f293a.getMeasuredHeight());
    }
}
