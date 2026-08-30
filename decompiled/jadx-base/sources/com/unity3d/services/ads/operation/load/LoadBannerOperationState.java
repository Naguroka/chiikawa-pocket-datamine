package com.unity3d.services.ads.operation.load;

/* JADX INFO: loaded from: classes6.dex */
public class LoadBannerOperationState extends com.unity3d.services.ads.operation.load.LoadOperationState {
    private com.unity3d.scar.adapter.common.scarads.ScarAdMetadata _scarAdMetadata;
    private com.unity3d.services.banners.UnityBannerSize _size;

    public LoadBannerOperationState(java.lang.String str, java.lang.String str2, com.unity3d.services.banners.UnityBannerSize unityBannerSize, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.services.core.configuration.Configuration configuration) {
        super(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration);
        this.id = str2;
        this._size = unityBannerSize;
    }

    public com.unity3d.services.banners.UnityBannerSize getSize() {
        return this._size;
    }

    public void setSize(com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
        this._size = unityBannerSize;
    }

    public void setScarAdMetadata(com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata) {
        this._scarAdMetadata = scarAdMetadata;
    }

    public com.unity3d.scar.adapter.common.scarads.ScarAdMetadata getScarAdMetadata() {
        return this._scarAdMetadata;
    }

    public boolean isScarAd() {
        return this._scarAdMetadata != null;
    }
}
