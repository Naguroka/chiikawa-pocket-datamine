package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface InitApi {
    public static final int INIT_TYPE_CONTENT_PROVIDER = 0;
    public static final int INIT_TYPE_INTERNAL_API = 3;
    public static final int INIT_TYPE_PUBLIC_API = 1;
    public static final int INIT_TYPE_REMOTE_PROCESS = 2;

    void initialize(android.content.Context context, com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper, com.facebook.ads.AudienceNetworkAds.InitListener initListener, int i);

    boolean isInitialized();

    void onAdLoadInvoked(android.content.Context context);

    void onContentProviderCreated(android.content.Context context);
}
