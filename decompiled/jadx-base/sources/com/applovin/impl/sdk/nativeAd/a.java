package com.applovin.impl.sdk.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class a extends com.applovin.impl.yl {
    private final com.applovin.impl.u2 h;
    private final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl i;
    private final com.applovin.impl.sdk.nativeAd.a.InterfaceC0054a j;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0054a {
        void a(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.j jVar, com.applovin.impl.sdk.nativeAd.a.InterfaceC0054a interfaceC0054a) {
        super("TaskCacheNativeAd", jVar);
        this.h = new com.applovin.impl.u2();
        this.i = appLovinNativeAdImpl;
        this.j = interfaceC0054a;
    }

    private float a(android.net.Uri uri) {
        java.io.File file = new java.io.File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                android.graphics.BitmapFactory.decodeStream(fileInputStream, null, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                if (i <= 0 || i2 <= 0) {
                    fileInputStream.close();
                    return -1.0f;
                }
                float f = i / i2;
                fileInputStream.close();
                return f;
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Failed to calculate aspect ratio", e);
            }
        }
    }

    private android.net.Uri b(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Attempting to cache resource: " + uri);
        }
        java.lang.String strA = this.f1547a.A().a(a(), uri.toString(), this.i.getCachePrefix(), java.util.Collections.emptyList(), false, false, this.h, 1);
        if (android.text.TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        java.io.File fileA = this.f1547a.A().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to retrieve File from cached image filename = " + strA);
            }
            return null;
        }
        android.net.Uri uriFromFile = android.net.Uri.fromFile(fileA);
        if (uriFromFile != null) {
            return uriFromFile;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "Unable to extract Uri from image file");
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Begin caching ad #" + this.i.getAdIdNumber() + "...");
        }
        android.net.Uri uriB = b(this.i.getIconUri());
        if (uriB != null) {
            this.i.setIconUri(uriB);
        }
        android.net.Uri uriB2 = b(this.i.getMainImageUri());
        if (uriB2 != null) {
            this.i.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > 0.0f) {
                this.i.setMainImageAspectRatio(fA);
            }
        }
        android.net.Uri uriB3 = b(this.i.getPrivacyIconUri());
        if (uriB3 != null) {
            this.i.setPrivacyIconUri(uriB3);
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Finished caching ad #" + this.i.getAdIdNumber());
        }
        this.j.a(this.i);
    }
}
