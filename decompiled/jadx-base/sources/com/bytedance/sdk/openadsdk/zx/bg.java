package com.bytedance.sdk.openadsdk.zx;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.zx.bg.1
            private int IL;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest pAGAppOpenRequest, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.bg.bg.bg(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.AdSlot.Builder builder = new com.bytedance.sdk.openadsdk.AdSlot.Builder();
                com.bytedance.sdk.openadsdk.bg.bg.bg(builder, pAGAppOpenRequest);
                if (!android.text.TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final com.bytedance.sdk.openadsdk.AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                if (pAGAppOpenRequest != null) {
                    this.IL = pAGAppOpenRequest.getTimeout();
                }
                final com.bytedance.sdk.openadsdk.bg.eqN.bg bgVar = new com.bytedance.sdk.openadsdk.bg.eqN.bg(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.bg.bg.bg(new com.bytedance.sdk.component.Kg.Kg("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.zx.bg.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().vb() && com.bytedance.sdk.openadsdk.utils.ayS.tuV()) {
                                bgVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.bg.bg.bg(bgVar)) {
                                return;
                            }
                            if (adSlotBuild == null) {
                                bgVar.onError(-4, "adslot is null");
                                return;
                            }
                            java.lang.reflect.Method methodBg = com.bytedance.sdk.component.utils.kMt.bg("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", android.content.Context.class, com.bytedance.sdk.openadsdk.AdSlot.class, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener.class, java.lang.Integer.TYPE);
                            if (methodBg != null) {
                                methodBg.invoke(null, com.bytedance.sdk.openadsdk.core.VzQ.bg(), adSlotBuild, bgVar, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.zx.bg.AnonymousClass1.this.IL));
                            }
                        } catch (java.lang.Throwable th) {
                            com.bytedance.sdk.component.utils.PX.bg("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, bgVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest, com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener> createBannerAdLoader() {
        return new com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest, com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.zx.bg.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest pAGBannerRequest, com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.bg.bg.bg(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.AdSlot.Builder codeId = new com.bytedance.sdk.openadsdk.AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.bg.bg.bg(codeId, pAGBannerRequest);
                if (!android.text.TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize adSize = pAGBannerRequest != null ? pAGBannerRequest.getAdSize() : null;
                if (adSize != null) {
                    codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                }
                final com.bytedance.sdk.openadsdk.AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.bg.bg.bg bgVar = new com.bytedance.sdk.openadsdk.bg.bg.bg(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.bg.bg.bg(new com.bytedance.sdk.component.Kg.Kg("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.zx.bg.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().vb() && com.bytedance.sdk.openadsdk.utils.ayS.tuV()) {
                            bgVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.bg.bg.bg(bgVar)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            bgVar.onError(-4, "adslot is null");
                            return;
                        }
                        adSlot.setNativeAdType(1);
                        adSlotBuild.setDurationSlotType(1);
                        com.bytedance.sdk.openadsdk.core.Kg.iR.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(adSlotBuild, 1, bgVar, 5000);
                    }
                }, bgVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener> createNativeAdLoader() {
        return new com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.zx.bg.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest pAGNativeRequest, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.bg.bg.bg(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final com.bytedance.sdk.openadsdk.bg.IL.zx zxVar = new com.bytedance.sdk.openadsdk.bg.IL.zx(pAGNativeAdLoadListener);
                com.bytedance.sdk.openadsdk.AdSlot.Builder builderWithBid = new com.bytedance.sdk.openadsdk.AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.bg.bg.bg(builderWithBid, pAGNativeRequest);
                final com.bytedance.sdk.openadsdk.AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.bg.bg.bg(new com.bytedance.sdk.component.Kg.Kg("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.zx.bg.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().vb() && com.bytedance.sdk.openadsdk.utils.ayS.tuV()) {
                            zxVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.bg.bg.bg(zxVar)) {
                            return;
                        }
                        if (adSlotBuild == null) {
                            zxVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            java.lang.reflect.Method methodBg = com.bytedance.sdk.component.utils.kMt.bg("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", android.content.Context.class, com.bytedance.sdk.openadsdk.AdSlot.class, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener.class);
                            if (methodBg != null) {
                                methodBg.invoke(null, com.bytedance.sdk.openadsdk.core.VzQ.bg(), adSlotBuild, zxVar);
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                }, zxVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.zx.bg.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest pAGRewardedRequest, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.bg.bg.bg(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.AdSlot.Builder codeId = new com.bytedance.sdk.openadsdk.AdSlot.Builder().setCodeId(str);
                if (!android.text.TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.bg.bg.bg(codeId, pAGRewardedRequest);
                final com.bytedance.sdk.openadsdk.AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.bg.zx.IL il = new com.bytedance.sdk.openadsdk.bg.zx.IL(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.bg.bg.bg(new com.bytedance.sdk.component.Kg.Kg("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.zx.bg.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().vb() && com.bytedance.sdk.openadsdk.utils.ayS.tuV()) {
                            il.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.bg.bg.bg(il)) {
                            return;
                        }
                        if (adSlotBuild == null) {
                            il.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            java.lang.reflect.Method methodBg = com.bytedance.sdk.component.utils.kMt.bg("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", android.content.Context.class, com.bytedance.sdk.openadsdk.AdSlot.class, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener.class);
                            if (methodBg != null) {
                                methodBg.invoke(null, com.bytedance.sdk.openadsdk.core.VzQ.bg(), adSlotBuild, il);
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                }, il, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.zx.bg.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public void loadAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest pAGInterstitialRequest, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.bg.bg.bg(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.AdSlot.Builder codeId = new com.bytedance.sdk.openadsdk.AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.bg.bg.bg(codeId, pAGInterstitialRequest);
                if (!android.text.TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final com.bytedance.sdk.openadsdk.AdSlot adSlotBuild = codeId.build();
                final com.bytedance.sdk.openadsdk.bg.bX.bg bgVar = new com.bytedance.sdk.openadsdk.bg.bX.bg(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.bg.bg.bg(new com.bytedance.sdk.component.Kg.Kg("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.zx.bg.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().vb() && com.bytedance.sdk.openadsdk.utils.ayS.tuV()) {
                            bgVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.bg.bg.bg(bgVar)) {
                            return;
                        }
                        if (adSlotBuild == null) {
                            bgVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            java.lang.reflect.Method methodBg = com.bytedance.sdk.component.utils.kMt.bg("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", android.content.Context.class, com.bytedance.sdk.openadsdk.AdSlot.class, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener.class);
                            if (methodBg != null) {
                                methodBg.invoke(null, com.bytedance.sdk.openadsdk.core.VzQ.bg(), adSlotBuild, bgVar);
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                }, bgVar, adSlotBuild);
            }
        };
    }
}
