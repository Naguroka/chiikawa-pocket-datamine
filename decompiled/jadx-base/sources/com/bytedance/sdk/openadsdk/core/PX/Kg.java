package com.bytedance.sdk.openadsdk.core.PX;

/* JADX INFO: loaded from: classes4.dex */
public class Kg {
    public static com.bytedance.sdk.openadsdk.core.PX.iR bg(android.view.View view, java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo> set) {
        com.iab.omid.library.bytedance2.adsession.AdSession adSessionBg = bg(com.iab.omid.library.bytedance2.adsession.CreativeType.VIDEO, set, com.iab.omid.library.bytedance2.adsession.Owner.NATIVE);
        return new com.bytedance.sdk.openadsdk.core.PX.WR(adSessionBg, com.iab.omid.library.bytedance2.adsession.AdEvents.createAdEvents(adSessionBg), view, com.iab.omid.library.bytedance2.adsession.media.MediaEvents.createMediaEvents(adSessionBg));
    }

    public static com.bytedance.sdk.openadsdk.core.PX.iR bg(android.webkit.WebView webView) {
        com.iab.omid.library.bytedance2.adsession.Partner partnerBg = com.bytedance.sdk.openadsdk.core.PX.zx.bg();
        if (partnerBg == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'partner' may not be null.");
        }
        com.iab.omid.library.bytedance2.adsession.AdSession adSessionCreateAdSession = com.iab.omid.library.bytedance2.adsession.AdSession.createAdSession(com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration.createAdSessionConfiguration(com.iab.omid.library.bytedance2.adsession.CreativeType.HTML_DISPLAY, com.iab.omid.library.bytedance2.adsession.ImpressionType.BEGIN_TO_RENDER, com.iab.omid.library.bytedance2.adsession.Owner.NATIVE, com.iab.omid.library.bytedance2.adsession.Owner.NONE, false), com.iab.omid.library.bytedance2.adsession.AdSessionContext.createHtmlAdSessionContext(partnerBg, webView, "", ""));
        return new com.bytedance.sdk.openadsdk.core.PX.iR(adSessionCreateAdSession, com.iab.omid.library.bytedance2.adsession.AdEvents.createAdEvents(adSessionCreateAdSession), webView);
    }

    private static com.iab.omid.library.bytedance2.adsession.AdSession bg(com.iab.omid.library.bytedance2.adsession.CreativeType creativeType, java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo> set, com.iab.omid.library.bytedance2.adsession.Owner owner) {
        java.util.List<com.iab.omid.library.bytedance2.adsession.VerificationScriptResource> listBg = bg(set);
        if (listBg.isEmpty()) {
            com.bytedance.sdk.component.utils.PX.IL("verificationScriptResources is empty");
        }
        com.iab.omid.library.bytedance2.adsession.Partner partnerBg = com.bytedance.sdk.openadsdk.core.PX.zx.bg();
        if (partnerBg == null) {
            return null;
        }
        return com.iab.omid.library.bytedance2.adsession.AdSession.createAdSession(com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration.createAdSessionConfiguration(creativeType, com.iab.omid.library.bytedance2.adsession.ImpressionType.BEGIN_TO_RENDER, com.iab.omid.library.bytedance2.adsession.Owner.NATIVE, owner, false), com.iab.omid.library.bytedance2.adsession.AdSessionContext.createNativeAdSessionContext(partnerBg, com.bytedance.sdk.openadsdk.core.PX.zx.IL(), listBg, "", ""));
    }

    private static java.util.List<com.iab.omid.library.bytedance2.adsession.VerificationScriptResource> bg(java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo> set) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.bytedance.sdk.openadsdk.core.PX.eo eoVar : set) {
            try {
                if (android.text.TextUtils.isEmpty(eoVar.bg()) || android.text.TextUtils.isEmpty(eoVar.IL())) {
                    arrayList.add(com.iab.omid.library.bytedance2.adsession.VerificationScriptResource.createVerificationScriptResourceWithoutParameters(eoVar.bX()));
                } else {
                    arrayList.add(com.iab.omid.library.bytedance2.adsession.VerificationScriptResource.createVerificationScriptResourceWithParameters(eoVar.bg(), eoVar.bX(), eoVar.IL()));
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return arrayList;
    }
}
