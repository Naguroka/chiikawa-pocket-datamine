package com.json.mediationsdk.ads.nativead.interfaces;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0010R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface;", "", com.ironsource.y8.h.F0, "", "getAdvertiser", "()Ljava/lang/String;", "body", "getBody", "callToAction", "getCallToAction", com.ironsource.y8.h.H0, "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;", "getIcon", "()Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;", com.ironsource.y8.h.D0, "getTitle", "Image", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NativeAdDataInterface {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;", "", "Landroid/graphics/drawable/Drawable;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/net/Uri;", "b", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static class Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final android.graphics.drawable.Drawable drawable;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final android.net.Uri uri;

        public Image(android.graphics.drawable.Drawable drawable, android.net.Uri uri) {
            this.drawable = drawable;
            this.uri = uri;
        }

        public final android.graphics.drawable.Drawable getDrawable() {
            return this.drawable;
        }

        public final android.net.Uri getUri() {
            return this.uri;
        }
    }

    java.lang.String getAdvertiser();

    java.lang.String getBody();

    java.lang.String getCallToAction();

    com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image getIcon();

    java.lang.String getTitle();
}
