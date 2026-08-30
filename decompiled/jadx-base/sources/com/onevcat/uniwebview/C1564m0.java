package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1564m0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564m0(java.lang.String str) {
        super(1);
        this.f3740a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.Y1 y1;
        java.lang.String absolutePath;
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.String str = this.f3740a;
        if (it.e.getHeight() <= 0 || it.e.getWidth() <= 0) {
            y1 = new com.onevcat.uniwebview.Y1("", java.lang.String.valueOf(-1002), "", null);
        } else {
            android.graphics.Bitmap bitmapA = it.a((android.graphics.Rect) null);
            java.io.File cacheDir = it.f3677a.getCacheDir();
            if (str == null || str.length() == 0) {
                str = java.util.UUID.randomUUID() + ".png";
            }
            try {
                java.io.File file = new java.io.File(cacheDir, str);
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                bitmapA.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
                java.lang.String message = "Capture Snapshot done. File written in: " + file;
                c1560l.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
                absolutePath = file.getAbsolutePath();
            } catch (java.lang.Exception e) {
                com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
                java.lang.String message2 = "Error during save snapshot image: " + e;
                c1560l2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
                c1560l2.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message2);
                absolutePath = null;
            }
            y1 = absolutePath != null ? new com.onevcat.uniwebview.Y1("", java.lang.String.valueOf(0), absolutePath, null) : new com.onevcat.uniwebview.Y1("", java.lang.String.valueOf(-1000), "", null);
        }
        it.c.a(it.b, com.onevcat.uniwebview.d2.CaptureSnapshotFinished, y1);
        return kotlin.Unit.INSTANCE;
    }
}
