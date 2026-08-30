package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class bb extends com.amoad.e {
    private static final java.lang.String h = "bb";
    com.amoad.bb.a f;
    boolean g;
    private boolean i;

    interface a {
        void a(boolean z);
    }

    public bb(android.content.Context context) {
        super(context, 60, 60);
        setOnClickListener(new android.view.View.OnClickListener() { // from class: com.amoad.bb.1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.amoad.bb bbVar = com.amoad.bb.this;
                bbVar.a(!bbVar.g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        setImageBitmap(a(z ? "https://i.amoad.com/creatives/shared/movie/sound_on40.png" : "https://i.amoad.com/creatives/shared/movie/sound_off40.png"));
    }

    @Override // com.amoad.e
    protected final void a() {
        a(new java.lang.String[]{"https://i.amoad.com/creatives/shared/movie/sound_on40.png", "https://i.amoad.com/creatives/shared/movie/sound_off40.png"}, new com.amoad.e.a() { // from class: com.amoad.bb.2
            @Override // com.amoad.e.a
            public final void a(android.graphics.Bitmap[] bitmapArr) {
                com.amoad.bb bbVar = com.amoad.bb.this;
                bbVar.b(bbVar.g);
            }
        });
    }

    public final void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            b(z);
            if (this.i) {
                return;
            }
            this.i = true;
            com.amoad.bb.a aVar = this.f;
            if (aVar != null) {
                aVar.a(this.g);
            }
            this.i = false;
        }
    }
}
