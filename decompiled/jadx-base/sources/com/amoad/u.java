package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class u extends com.amoad.e {
    private static final java.lang.String f = "u";

    public u(android.content.Context context, com.amoad.AMoAdButtonType aMoAdButtonType) {
        super(context, aMoAdButtonType.mSize * 2, aMoAdButtonType.mSize * 2);
    }

    static /* synthetic */ void a(com.amoad.u uVar) {
        uVar.setImageBitmap(uVar.b());
    }

    @Override // com.amoad.e
    protected final void a() {
        a("https://i.amoad.com/creatives/shared/interstitial_video/close40.png", new com.amoad.e.a() { // from class: com.amoad.u.1
            @Override // com.amoad.e.a
            public final void a(android.graphics.Bitmap[] bitmapArr) {
                com.amoad.u.a(com.amoad.u.this);
            }
        });
    }
}
