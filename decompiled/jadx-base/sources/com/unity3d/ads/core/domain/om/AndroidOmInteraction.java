package com.unity3d.ads.core.domain.om;

/* JADX INFO: compiled from: AndroidOmInteraction.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidOmInteraction;", "Lcom/unity3d/ads/core/domain/om/OmInteraction;", "()V", "getCreativeType", "Lcom/iab/omid/library/unity3d/adsession/CreativeType;", "options", "Lorg/json/JSONObject;", "getImpressionType", "Lcom/iab/omid/library/unity3d/adsession/ImpressionType;", "getImpressionsOwner", "Lcom/iab/omid/library/unity3d/adsession/Owner;", "getMediaEventsOwner", "getOMidOptions", "Lcom/unity3d/ads/core/data/model/OmidOptions;", "getVideoEventsOwner", "getWebview", "Landroid/webkit/WebView;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AndroidOmInteraction implements com.unity3d.ads.core.domain.om.OmInteraction {
    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public android.webkit.WebView getWebview(com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        com.unity3d.ads.adplayer.AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) {
            return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        if (adPlayer instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) {
            return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        return null;
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public com.unity3d.ads.core.data.model.OmidOptions getOMidOptions(org.json.JSONObject options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new com.unity3d.ads.core.data.model.OmidOptions(options.optBoolean("isolateVerificationScripts"), getImpressionsOwner(options), getVideoEventsOwner(options), options.optString("customReferenceData"), getImpressionType(options), getCreativeType(options), getMediaEventsOwner(options));
    }

    private final com.iab.omid.library.unity3d.adsession.ImpressionType getImpressionType(org.json.JSONObject options) {
        switch (options.optInt("impressionType")) {
            case 1:
                return com.iab.omid.library.unity3d.adsession.ImpressionType.DEFINED_BY_JAVASCRIPT;
            case 2:
                return com.iab.omid.library.unity3d.adsession.ImpressionType.UNSPECIFIED;
            case 3:
                return com.iab.omid.library.unity3d.adsession.ImpressionType.LOADED;
            case 4:
                return com.iab.omid.library.unity3d.adsession.ImpressionType.BEGIN_TO_RENDER;
            case 5:
                return com.iab.omid.library.unity3d.adsession.ImpressionType.ONE_PIXEL;
            case 6:
                return com.iab.omid.library.unity3d.adsession.ImpressionType.VIEWABLE;
            case 7:
                return com.iab.omid.library.unity3d.adsession.ImpressionType.AUDIBLE;
            case 8:
                return com.iab.omid.library.unity3d.adsession.ImpressionType.OTHER;
            default:
                throw new java.lang.IllegalArgumentException("Invalid impressionType");
        }
    }

    private final com.iab.omid.library.unity3d.adsession.CreativeType getCreativeType(org.json.JSONObject options) {
        int iOptInt = options.optInt("creativeType");
        if (iOptInt == 1) {
            return com.iab.omid.library.unity3d.adsession.CreativeType.DEFINED_BY_JAVASCRIPT;
        }
        if (iOptInt == 2) {
            return com.iab.omid.library.unity3d.adsession.CreativeType.HTML_DISPLAY;
        }
        if (iOptInt == 3) {
            return com.iab.omid.library.unity3d.adsession.CreativeType.NATIVE_DISPLAY;
        }
        if (iOptInt == 4) {
            return com.iab.omid.library.unity3d.adsession.CreativeType.VIDEO;
        }
        if (iOptInt == 5) {
            return com.iab.omid.library.unity3d.adsession.CreativeType.AUDIO;
        }
        throw new java.lang.IllegalArgumentException("Invalid creativeType");
    }

    private final com.iab.omid.library.unity3d.adsession.Owner getVideoEventsOwner(org.json.JSONObject options) {
        try {
            int iOptInt = options.optInt("videoEventsOwner");
            if (iOptInt == 1) {
                return com.iab.omid.library.unity3d.adsession.Owner.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return com.iab.omid.library.unity3d.adsession.Owner.NATIVE;
            }
            if (iOptInt == 3) {
                return com.iab.omid.library.unity3d.adsession.Owner.NONE;
            }
            throw new java.lang.IllegalArgumentException("Invalid videoEventsOwner");
        } catch (java.lang.IllegalArgumentException unused) {
            return com.iab.omid.library.unity3d.adsession.Owner.NONE;
        }
    }

    private final com.iab.omid.library.unity3d.adsession.Owner getMediaEventsOwner(org.json.JSONObject options) {
        try {
            int iOptInt = options.optInt("mediaEventsOwner");
            if (iOptInt == 1) {
                return com.iab.omid.library.unity3d.adsession.Owner.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return com.iab.omid.library.unity3d.adsession.Owner.NATIVE;
            }
            if (iOptInt == 3) {
                return com.iab.omid.library.unity3d.adsession.Owner.NONE;
            }
            throw new java.lang.IllegalArgumentException("Invalid mediaEventsOwner");
        } catch (java.lang.IllegalArgumentException unused) {
            return com.iab.omid.library.unity3d.adsession.Owner.NONE;
        }
    }

    private final com.iab.omid.library.unity3d.adsession.Owner getImpressionsOwner(org.json.JSONObject options) {
        try {
            int iOptInt = options.optInt("impressionOwner");
            if (iOptInt == 1) {
                return com.iab.omid.library.unity3d.adsession.Owner.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return com.iab.omid.library.unity3d.adsession.Owner.NATIVE;
            }
            if (iOptInt == 3) {
                return com.iab.omid.library.unity3d.adsession.Owner.NONE;
            }
            throw new java.lang.IllegalArgumentException("Invalid impressionOwner");
        } catch (java.lang.IllegalArgumentException unused) {
            return com.iab.omid.library.unity3d.adsession.Owner.NONE;
        }
    }
}
