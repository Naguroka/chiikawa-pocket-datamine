package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class aw extends com.amoad.e {
    private static final java.lang.String f = "aw";

    public aw(android.content.Context context) {
        super(context, 80, 80);
        setBackgroundColor(1711276032);
    }

    static /* synthetic */ void a(com.amoad.aw awVar) {
        awVar.setImageBitmap(awVar.b());
    }

    @Override // com.amoad.e
    protected final void a() {
        a("https://i.amoad.com/creatives/shared/movie/play.png", new com.amoad.e.a() { // from class: com.amoad.aw.1
            @Override // com.amoad.e.a
            public final void a(android.graphics.Bitmap[] bitmapArr) {
                com.amoad.aw.a(com.amoad.aw.this);
            }
        });
    }
}
