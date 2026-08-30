package com.google.android.gms.ads.nativead;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class NativeAd {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static abstract class AdChoicesInfo {
        public abstract java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages();

        public abstract java.lang.CharSequence getText();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static abstract class Image {
        public abstract android.graphics.drawable.Drawable getDrawable();

        public abstract double getScale();

        public abstract android.net.Uri getUri();

        public int zza() {
            return -1;
        }

        public int zzb() {
            return -1;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public interface OnNativeAdLoadedListener {
        void onNativeAdLoaded(com.google.android.gms.ads.nativead.NativeAd nativeAd);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public interface UnconfirmedClickListener {
        void onUnconfirmedClickCancelled();

        void onUnconfirmedClickReceived(java.lang.String str);
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    @java.lang.Deprecated
    public abstract void enableCustomClickGesture();

    public abstract com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo getAdChoicesInfo();

    public abstract java.lang.String getAdvertiser();

    public abstract java.lang.String getBody();

    public abstract java.lang.String getCallToAction();

    public abstract android.os.Bundle getExtras();

    public abstract java.lang.String getHeadline();

    public abstract com.google.android.gms.ads.nativead.NativeAd.Image getIcon();

    public abstract java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages();

    public abstract com.google.android.gms.ads.MediaContent getMediaContent();

    public abstract java.util.List<com.google.android.gms.ads.MuteThisAdReason> getMuteThisAdReasons();

    public abstract java.lang.String getPrice();

    public abstract com.google.android.gms.ads.ResponseInfo getResponseInfo();

    public abstract java.lang.Double getStarRating();

    public abstract java.lang.String getStore();

    @java.lang.Deprecated
    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(com.google.android.gms.ads.MuteThisAdReason muteThisAdReason);

    public abstract void performClick(android.os.Bundle bundle);

    @java.lang.Deprecated
    public abstract void recordCustomClickGesture();

    protected abstract void recordEvent(android.os.Bundle bundle);

    public abstract boolean recordImpression(android.os.Bundle bundle);

    public abstract void reportTouchEvent(android.os.Bundle bundle);

    public abstract void setMuteThisAdListener(com.google.android.gms.ads.MuteThisAdListener muteThisAdListener);

    public abstract void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener);

    public abstract void setUnconfirmedClickListener(com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener unconfirmedClickListener);

    protected abstract java.lang.Object zza();
}
