package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f718a;
    private final com.applovin.impl.sdk.j b;

    public java.lang.String b() {
        return "google watermark";
    }

    public da(java.util.Map map, com.applovin.impl.sdk.j jVar) {
        this.f718a = map == null ? java.util.Collections.emptyMap() : map;
        this.b = jVar;
    }

    public android.graphics.drawable.Drawable a() {
        java.lang.Object obj = this.f718a.get(com.applovin.mediation.AppLovinExtras.Keys.KEY_WATERMARK);
        if (!a(obj)) {
            this.b.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.b.I().b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] bArrDecode = android.util.Base64.decode((java.lang.String) obj, 0);
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.applovin.impl.sdk.j.m().getResources(), android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (java.lang.Throwable th) {
            this.b.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.b.I().a("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    public boolean c() {
        return a(this.f718a.get(com.applovin.mediation.AppLovinExtras.Keys.KEY_WATERMARK));
    }

    private boolean a(java.lang.Object obj) {
        return (obj instanceof java.lang.String) && com.applovin.impl.sdk.utils.StringUtils.isValidString((java.lang.String) obj);
    }
}
