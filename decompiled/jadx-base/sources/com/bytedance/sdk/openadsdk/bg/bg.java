package com.bytedance.sdk.openadsdk.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public static boolean bg(com.bytedance.sdk.openadsdk.api.PAGLoadListener pAGLoadListener) {
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
        return true;
    }

    public static void bg(final com.bytedance.sdk.component.Kg.Kg kg, final com.bytedance.sdk.openadsdk.api.PAGLoadListener pAGLoadListener, final com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.bg.1
            @Override // java.lang.Runnable
            public void run() {
                if (!com.bytedance.sdk.openadsdk.core.yDt.zx()) {
                    com.bytedance.sdk.component.utils.PX.bg("AdLoadBaseManager", "please exec TTAdSdk.init before load ad");
                    com.bytedance.sdk.openadsdk.api.PAGLoadListener pAGLoadListener2 = pAGLoadListener;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.p002vb.eqN.bg(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.bg.bg.1.1
                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                        bgVar.IL("load_ad");
                        bgVar.bX(adSlot.getCodeId());
                        bgVar.eqN(com.bytedance.sdk.openadsdk.utils.ayS.bX(adSlot.getDurationSlotType()));
                        bgVar.bg(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
                        bgVar.iR(com.bytedance.sdk.openadsdk.utils.ayS.bg(adSlot).toString());
                        return bgVar;
                    }
                });
                com.bytedance.sdk.openadsdk.utils.VJ.eqN(kg);
            }
        };
        if (com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.yDt.IL().post(runnable);
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.AdSlot.Builder builder, com.bytedance.sdk.openadsdk.api.PAGRequest pAGRequest) {
        java.util.Map<java.lang.String, java.lang.Object> extraInfo;
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey("creative_id") && extraInfo.get("creative_id") != null) {
            builder.setCreativeId(extraInfo.get("creative_id").toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean bg(java.lang.String str, com.bytedance.sdk.openadsdk.api.PAGRequest pAGRequest, com.bytedance.sdk.openadsdk.api.PAGLoadListener pAGLoadListener) {
        if (android.text.TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, com.bytedance.sdk.openadsdk.api.PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, com.bytedance.sdk.openadsdk.api.PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
