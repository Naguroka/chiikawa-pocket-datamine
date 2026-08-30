package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes6.dex */
public class GMAAdsError extends com.unity3d.scar.adapter.common.WebViewAdsError {
    public static final java.lang.String AD_NOT_LOADED_MESSAGE = "Cannot show ad that is not loaded for placement %s";
    public static final java.lang.String MISSING_QUERYINFO_MESSAGE = "Missing queryInfoMetadata for ad %s";

    @Override // com.unity3d.scar.adapter.common.WebViewAdsError, com.unity3d.scar.adapter.common.IUnityAdsError
    public java.lang.String getDomain() {
        return "GMA";
    }

    public GMAAdsError(com.unity3d.scar.adapter.common.GMAEvent gMAEvent, java.lang.Object... objArr) {
        super(gMAEvent, null, objArr);
    }

    public GMAAdsError(com.unity3d.scar.adapter.common.GMAEvent gMAEvent, java.lang.String str, java.lang.Object... objArr) {
        super(gMAEvent, str, objArr);
    }

    public static com.unity3d.scar.adapter.common.GMAAdsError AdapterCreationError(java.lang.String str) {
        return new com.unity3d.scar.adapter.common.GMAAdsError(com.unity3d.scar.adapter.common.GMAEvent.SCAR_UNSUPPORTED, str, new java.lang.Object[0]);
    }

    public static com.unity3d.scar.adapter.common.GMAAdsError NoAdsError(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new com.unity3d.scar.adapter.common.GMAAdsError(com.unity3d.scar.adapter.common.GMAEvent.NO_AD_ERROR, str3, str, str2, str3);
    }

    public static com.unity3d.scar.adapter.common.GMAAdsError AdNotLoadedError(com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata) {
        java.lang.String str = java.lang.String.format(AD_NOT_LOADED_MESSAGE, scarAdMetadata.getPlacementId());
        return new com.unity3d.scar.adapter.common.GMAAdsError(com.unity3d.scar.adapter.common.GMAEvent.AD_NOT_LOADED_ERROR, str, scarAdMetadata.getPlacementId(), scarAdMetadata.getQueryId(), str);
    }

    public static com.unity3d.scar.adapter.common.GMAAdsError InternalShowError(com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, java.lang.String str) {
        return new com.unity3d.scar.adapter.common.GMAAdsError(com.unity3d.scar.adapter.common.GMAEvent.INTERNAL_SHOW_ERROR, str, scarAdMetadata.getPlacementId(), scarAdMetadata.getQueryId(), str);
    }

    public static com.unity3d.scar.adapter.common.GMAAdsError QueryNotFoundError(com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata) {
        java.lang.String str = java.lang.String.format(MISSING_QUERYINFO_MESSAGE, scarAdMetadata.getPlacementId());
        return new com.unity3d.scar.adapter.common.GMAAdsError(com.unity3d.scar.adapter.common.GMAEvent.QUERY_NOT_FOUND_ERROR, str, scarAdMetadata.getPlacementId(), scarAdMetadata.getQueryId(), str);
    }

    public static com.unity3d.scar.adapter.common.GMAAdsError InternalLoadError(com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, java.lang.String str) {
        return new com.unity3d.scar.adapter.common.GMAAdsError(com.unity3d.scar.adapter.common.GMAEvent.INTERNAL_LOAD_ERROR, str, scarAdMetadata.getPlacementId(), scarAdMetadata.getQueryId(), str);
    }

    public static com.unity3d.scar.adapter.common.GMAAdsError InternalSignalsError(java.lang.String str) {
        return new com.unity3d.scar.adapter.common.GMAAdsError(com.unity3d.scar.adapter.common.GMAEvent.INTERNAL_SIGNALS_ERROR, str, str);
    }
}
