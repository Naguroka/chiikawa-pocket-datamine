package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAdView {
    public static android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "context must be not null");
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(nativeAd, "nativeAd must be not null");
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdViewApi().render(context, nativeAd);
    }

    public static android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "context must be not null");
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(nativeAd, "nativeAd must be not null");
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdViewApi().render(context, nativeAd, nativeAdViewAttributes);
    }

    @java.lang.Deprecated
    public static android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdView.Type type) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "context must be not null");
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(nativeAd, "nativeAd must be not null");
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdViewApi().render(context, nativeAd, type);
    }

    @java.lang.Deprecated
    public static android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "context must be not null");
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(nativeAd, "nativeAd must be not null");
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(type, "type must be not null");
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdViewApi().render(context, nativeAd, type, nativeAdViewAttributes);
    }

    @java.lang.Deprecated
    public enum Type {
        HEIGHT_300(2),
        HEIGHT_400(3);

        private final int mEnumCode;
        private com.facebook.ads.internal.api.NativeAdViewTypeApi mNativeAdViewTypeApi;

        @java.lang.Deprecated
        Type(int i) {
            this.mEnumCode = i;
        }

        @java.lang.Deprecated
        public int getWidth() {
            return getNativeAdViewTypeApi(this.mEnumCode).getWidth();
        }

        @java.lang.Deprecated
        public int getHeight() {
            return getNativeAdViewTypeApi(this.mEnumCode).getHeight();
        }

        @java.lang.Deprecated
        public int getValue() {
            return getNativeAdViewTypeApi(this.mEnumCode).getValue();
        }

        public int getEnumCode() {
            return this.mEnumCode;
        }

        private com.facebook.ads.internal.api.NativeAdViewTypeApi getNativeAdViewTypeApi(int i) {
            if (this.mNativeAdViewTypeApi == null) {
                this.mNativeAdViewTypeApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewTypeApi(i);
            }
            return this.mNativeAdViewTypeApi;
        }
    }
}
