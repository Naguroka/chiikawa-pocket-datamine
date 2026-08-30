package com.applovin.impl.sdk.utils;

/* JADX INFO: loaded from: classes3.dex */
public class ImageViewUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(final com.applovin.impl.sdk.j jVar, java.lang.String str, final android.widget.ImageView imageView, android.net.Uri uri) {
        if (!((java.lang.Boolean) jVar.a(com.applovin.impl.sj.z)).booleanValue()) {
            java.io.InputStream inputStreamOpenStream = null;
            try {
                inputStreamOpenStream = new java.net.URL(str).openStream();
                final android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStreamOpenStream);
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.utils.ImageViewUtils$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.applovin.impl.sdk.utils.ImageViewUtils.b(jVar, bitmapDecodeStream, imageView);
                    }
                });
                com.applovin.impl.yp.a(inputStreamOpenStream, jVar);
                return;
            } catch (java.lang.Throwable th) {
                try {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("ImageViewUtils", "Failed to fetch image: " + uri, th);
                    }
                    return;
                } finally {
                    com.applovin.impl.yp.a(inputStreamOpenStream, jVar);
                }
            }
        }
        try {
            java.io.InputStream inputStreamOpenStream2 = new java.net.URL(str).openStream();
            try {
                final android.graphics.Bitmap bitmapDecodeStream2 = android.graphics.BitmapFactory.decodeStream(inputStreamOpenStream2);
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.utils.ImageViewUtils$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.applovin.impl.sdk.utils.ImageViewUtils.a(jVar, bitmapDecodeStream2, imageView);
                    }
                });
                if (inputStreamOpenStream2 != null) {
                    inputStreamOpenStream2.close();
                }
            } catch (java.lang.Throwable th2) {
                if (inputStreamOpenStream2 != null) {
                    try {
                        inputStreamOpenStream2.close();
                    } catch (java.lang.Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (java.lang.Throwable th4) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("ImageViewUtils", "Failed to fetch image: " + uri, th4);
            }
            jVar.I().a("ImageViewUtils", th4);
            jVar.D().a("ImageViewUtils", "setImageUri", th4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(android.widget.ImageView imageView, android.net.Uri uri) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        imageView.setImageURI(uri);
        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public static void setAndDownscaleBitmap(final android.widget.ImageView imageView, final android.net.Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (jVar == null) {
            com.applovin.impl.sdk.n.h("ImageViewUtils", "SDK has not been initialized");
        } else {
            jVar.i0().b().execute(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.utils.ImageViewUtils$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.sdk.utils.ImageViewUtils.a(uri, imageView);
                }
            });
        }
    }

    public static void setAndDownscaleImageUri(final android.widget.ImageView imageView, final android.net.Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        if (imageView.getHeight() <= 0 || imageView.getWidth() <= 0) {
            imageView.post(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.utils.ImageViewUtils$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.sdk.utils.ImageViewUtils.setAndDownscaleBitmap(imageView, uri);
                }
            });
        } else {
            setAndDownscaleBitmap(imageView, uri);
        }
    }

    public static void setImageUri(final android.widget.ImageView imageView, final android.net.Uri uri, final com.applovin.impl.sdk.j jVar) {
        if (imageView == null || uri == null) {
            return;
        }
        final java.lang.String string = uri.toString();
        if (android.webkit.URLUtil.isFileUrl(string) || android.webkit.URLUtil.isContentUrl(string)) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.utils.ImageViewUtils$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.sdk.utils.ImageViewUtils.b(imageView, uri);
                }
            });
        } else {
            if (jVar == null) {
                return;
            }
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("ImageViewUtils", "Fetching image: " + uri);
            }
            jVar.i0().b().execute(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.utils.ImageViewUtils$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.sdk.utils.ImageViewUtils.a(jVar, string, imageView, uri);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.sdk.j jVar, android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.applovin.impl.sdk.j.m().getResources(), bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.j jVar, android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.applovin.impl.sdk.j.m().getResources(), bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(android.net.Uri uri, final android.widget.ImageView imageView) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            android.graphics.Point pointB = com.applovin.impl.z3.b(imageView.getContext());
            height = java.lang.Math.min(pointB.x, pointB.y);
            width = height;
        }
        int i2 = options.outHeight;
        int i3 = options.outWidth;
        if (i2 > height || i3 > width) {
            while (true) {
                int i4 = i * 2;
                if (i2 / i4 < height && i3 / i4 < width) {
                    break;
                } else {
                    i = i4;
                }
            }
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        com.applovin.impl.sdk.j.u0.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.j.u0.I().a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + "...");
        }
        final android.graphics.Bitmap bitmapDecodeFile = android.graphics.BitmapFactory.decodeFile(uri.getPath(), options);
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.utils.ImageViewUtils$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setImageBitmap(bitmapDecodeFile);
            }
        });
    }
}
