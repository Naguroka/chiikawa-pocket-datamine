package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class NativeBannerAdView {
    public static android.view.View render(android.content.Context context, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.NativeBannerAdView.Type type) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "context must be not null");
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(nativeBannerAd, "nativeBannerAd must be not null");
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(type, "type must be not null");
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeBannerAdViewApi().render(context, nativeBannerAd, type, null);
    }

    public static android.view.View render(android.content.Context context, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.NativeBannerAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "context must be not null");
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(nativeBannerAd, "nativeBannerAd must be not null");
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(type, "type must be not null");
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeBannerAdViewApi().render(context, nativeBannerAd, type, nativeAdViewAttributes);
    }

    public enum Type {
        HEIGHT_50(4),
        HEIGHT_100(0),
        HEIGHT_120(1);

        private final int mEnumCode;
        private com.facebook.ads.internal.api.NativeAdViewTypeApi mNativeAdViewTypeApi;

        Type(int i) {
            this.mEnumCode = i;
        }

        public int getWidth() {
            return getNativeAdViewTypeApi().getWidth();
        }

        public int getHeight() {
            return getNativeAdViewTypeApi().getHeight();
        }

        public int getValue() {
            return getNativeAdViewTypeApi().getValue();
        }

        public int getEnumCode() {
            return this.mEnumCode;
        }

        private com.facebook.ads.internal.api.NativeAdViewTypeApi getNativeAdViewTypeApi() {
            if (this.mNativeAdViewTypeApi == null) {
                this.mNativeAdViewTypeApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewTypeApi(this.mEnumCode);
            }
            return this.mNativeAdViewTypeApi;
        }
    }
}
