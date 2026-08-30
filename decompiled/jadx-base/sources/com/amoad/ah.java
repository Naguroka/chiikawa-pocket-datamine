package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class ah extends com.amoad.e {
    private static final java.lang.String f = "ah";

    public ah(android.content.Context context) {
        super(context, 80, 80);
        setOnClickListener(new android.view.View.OnClickListener() { // from class: com.amoad.ah.1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.amoad.ah.a(com.amoad.ah.this);
            }
        });
    }

    static /* synthetic */ void a(com.amoad.ah ahVar) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.amoad.com/sp/guideline/"));
        intent.setFlags(268435456);
        ahVar.getContext().startActivity(intent);
    }

    static /* synthetic */ void b(com.amoad.ah ahVar) {
        ahVar.setImageBitmap(ahVar.b());
    }

    @Override // com.amoad.e
    protected final void a() {
        a("https://i.amoad.com/creatives/shared/movie/info.png", new com.amoad.e.a() { // from class: com.amoad.ah.2
            @Override // com.amoad.e.a
            public final void a(android.graphics.Bitmap[] bitmapArr) {
                com.amoad.ah.b(com.amoad.ah.this);
            }
        });
    }
}
