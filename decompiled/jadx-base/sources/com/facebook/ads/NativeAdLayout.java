package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAdLayout extends com.facebook.ads.internal.api.AdComponentFrameLayout {
    private com.facebook.ads.internal.api.NativeAdLayoutApi mNativeAdLayoutApi;

    public NativeAdLayout(android.content.Context context) {
        super(context);
        initializeSelf(context);
    }

    public NativeAdLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public NativeAdLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initializeSelf(context);
    }

    public NativeAdLayout(android.content.Context context, com.facebook.ads.internal.api.NativeAdLayoutApi nativeAdLayoutApi) {
        super(context);
        this.mNativeAdLayoutApi = nativeAdLayoutApi;
        attachAdComponentViewApi(nativeAdLayoutApi);
        this.mNativeAdLayoutApi.initialize(this);
    }

    private void initializeSelf(android.content.Context context) {
        com.facebook.ads.internal.api.NativeAdLayoutApi nativeAdLayoutApiCreateNativeAdLayoutApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdLayoutApi();
        this.mNativeAdLayoutApi = nativeAdLayoutApiCreateNativeAdLayoutApi;
        attachAdComponentViewApi(nativeAdLayoutApiCreateNativeAdLayoutApi);
        this.mNativeAdLayoutApi.initialize(this);
    }

    public com.facebook.ads.internal.api.NativeAdLayoutApi getNativeAdLayoutApi() {
        return this.mNativeAdLayoutApi;
    }

    public void setMinWidth(int i) {
        this.mNativeAdLayoutApi.setMinWidth(i);
    }

    public void setMaxWidth(int i) {
        this.mNativeAdLayoutApi.setMaxWidth(i);
    }
}
