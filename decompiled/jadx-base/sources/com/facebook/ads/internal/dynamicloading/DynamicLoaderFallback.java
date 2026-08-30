package com.facebook.ads.internal.dynamicloading;

/* JADX INFO: loaded from: classes4.dex */
class DynamicLoaderFallback {
    private static final java.util.WeakHashMap<java.lang.Object, com.facebook.ads.AdListener> sApiProxyToAdListenersMap = new java.util.WeakHashMap<>();

    DynamicLoaderFallback() {
    }

    static com.facebook.ads.internal.dynamicloading.DynamicLoader makeFallbackLoader() {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        final java.util.ArrayList arrayList3 = new java.util.ArrayList();
        final java.util.ArrayList arrayList4 = new java.util.ArrayList();
        final java.util.ArrayList arrayList5 = new java.util.ArrayList();
        final java.util.HashMap map = new java.util.HashMap();
        final java.util.HashMap map2 = new java.util.HashMap();
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.SimpleMethodCaptor simpleMethodCaptor = new com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.SimpleMethodCaptor();
        com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoader = (com.facebook.ads.internal.dynamicloading.DynamicLoader) simpleMethodCaptor.mock(com.facebook.ads.internal.dynamicloading.DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(simpleMethodCaptor.getLastMethod());
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(simpleMethodCaptor.getLastMethod());
        dynamicLoader.createAdViewApi((android.content.Context) null, (java.lang.String) null, (com.facebook.ads.AdSize) null, (com.facebook.ads.internal.api.AdViewParentApi) null, (com.facebook.ads.AdView) null);
        arrayList5.add(simpleMethodCaptor.getLastMethod());
        try {
            dynamicLoader.createAdViewApi((android.content.Context) null, (java.lang.String) null, (java.lang.String) null, (com.facebook.ads.internal.api.AdViewParentApi) null, (com.facebook.ads.AdView) null);
        } catch (java.lang.Exception unused) {
        }
        arrayList5.add(simpleMethodCaptor.getLastMethod());
        dynamicLoader.createNativeAdApi(null, null);
        final java.lang.reflect.Method lastMethod = simpleMethodCaptor.getLastMethod();
        dynamicLoader.createNativeBannerAdApi(null, null);
        final java.lang.reflect.Method lastMethod2 = simpleMethodCaptor.getLastMethod();
        com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi = (com.facebook.ads.internal.api.NativeAdBaseApi) simpleMethodCaptor.mock(com.facebook.ads.internal.api.NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(simpleMethodCaptor.getLastMethod());
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(simpleMethodCaptor.getLastMethod());
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(simpleMethodCaptor.getLastMethod());
        com.facebook.ads.internal.api.InterstitialAdApi interstitialAdApi = (com.facebook.ads.internal.api.InterstitialAdApi) simpleMethodCaptor.mock(com.facebook.ads.internal.api.InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(simpleMethodCaptor.getLastMethod());
        interstitialAdApi.loadAd(null);
        arrayList2.add(simpleMethodCaptor.getLastMethod());
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(simpleMethodCaptor.getLastMethod());
        com.facebook.ads.internal.api.RewardedVideoAdApi rewardedVideoAdApi = (com.facebook.ads.internal.api.RewardedVideoAdApi) simpleMethodCaptor.mock(com.facebook.ads.internal.api.RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(simpleMethodCaptor.getLastMethod());
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(simpleMethodCaptor.getLastMethod());
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(simpleMethodCaptor.getLastMethod());
        com.facebook.ads.internal.api.AdViewApi adViewApi = (com.facebook.ads.internal.api.AdViewApi) simpleMethodCaptor.mock(com.facebook.ads.internal.api.AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(simpleMethodCaptor.getLastMethod());
        adViewApi.loadAd(null);
        arrayList2.add(simpleMethodCaptor.getLastMethod());
        adViewApi.buildLoadAdConfig();
        arrayList4.add(simpleMethodCaptor.getLastMethod());
        ((com.facebook.ads.AdView.AdViewLoadConfigBuilder) simpleMethodCaptor.mock(com.facebook.ads.AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(simpleMethodCaptor.getLastMethod());
        ((com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder) simpleMethodCaptor.mock(com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(simpleMethodCaptor.getLastMethod());
        ((com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder) simpleMethodCaptor.mock(com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(simpleMethodCaptor.getLastMethod());
        ((com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) simpleMethodCaptor.mock(com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(simpleMethodCaptor.getLastMethod());
        return (com.facebook.ads.internal.dynamicloading.DynamicLoader) java.lang.reflect.Proxy.newProxyInstance(com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.class.getClassLoader(), new java.lang.Class[]{com.facebook.ads.internal.dynamicloading.DynamicLoader.class}, new java.lang.reflect.InvocationHandler() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.1
            @Override // java.lang.reflect.InvocationHandler
            public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                if (method.getReturnType().isPrimitive()) {
                    if (method.getReturnType().equals(java.lang.Void.TYPE)) {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext() && (!com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.equalsMethods(method, (java.lang.reflect.Method) it.next()) || !com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.reportError(obj, map))) {
                        }
                        java.util.Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.equalsMethods(method, (java.lang.reflect.Method) it2.next()) && com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.reportError(obj, map)) {
                                return null;
                            }
                        }
                        return null;
                    }
                    return java.lang.reflect.Array.get(java.lang.reflect.Array.newInstance(method.getReturnType(), 1), 0);
                }
                if (method.getReturnType().equals(java.lang.String.class)) {
                    return "";
                }
                java.lang.Object objNewProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : java.lang.reflect.Proxy.newProxyInstance(com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.class.getClassLoader(), new java.lang.Class[]{method.getReturnType()}, this);
                java.util.Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.equalsMethods(method, (java.lang.reflect.Method) it3.next())) {
                        com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.sApiProxyToAdListenersMap.put(map2.get(obj), (com.facebook.ads.AdListener) objArr[0]);
                        break;
                    }
                }
                java.util.Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    if (com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.equalsMethods(method, (java.lang.reflect.Method) it4.next())) {
                        map2.put(objNewProxyInstance, obj);
                    }
                }
                java.util.Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    if (com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.equalsMethods(method, (java.lang.reflect.Method) it5.next())) {
                        for (java.lang.Object obj2 : objArr) {
                            if (obj2 instanceof com.facebook.ads.Ad) {
                                map.put(objNewProxyInstance, (com.facebook.ads.Ad) obj2);
                            }
                        }
                    }
                }
                if (com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.equalsMethods(method, lastMethod)) {
                    map.put(objArr[1], (com.facebook.ads.Ad) objArr[0]);
                }
                if (com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.equalsMethods(method, lastMethod2)) {
                    map.put(objArr[1], (com.facebook.ads.Ad) objArr[0]);
                }
                return objNewProxyInstance;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(java.lang.Object obj, java.util.Map<java.lang.Object, com.facebook.ads.Ad> map) {
        if (obj == null) {
            return false;
        }
        final com.facebook.ads.AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        final com.facebook.ads.Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.2
            @Override // java.lang.Runnable
            public void run() {
                adListener.onError(ad, new com.facebook.ads.AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
            }
        }, 500L);
        return true;
    }

    private static class SimpleMethodCaptor {
        private final java.lang.reflect.InvocationHandler mInvocationHandler;
        private java.lang.reflect.Method mLastInvokedMethod;

        private SimpleMethodCaptor() {
            this.mInvocationHandler = new java.lang.reflect.InvocationHandler() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.SimpleMethodCaptor.1
                @Override // java.lang.reflect.InvocationHandler
                public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                    if ("toString".equals(method.getName())) {
                        return null;
                    }
                    com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.SimpleMethodCaptor.this.mLastInvokedMethod = method;
                    return null;
                }
            };
        }

        public <T> T mock(java.lang.Class<T> cls) {
            return cls.cast(java.lang.reflect.Proxy.newProxyInstance(com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.class.getClassLoader(), new java.lang.Class[]{cls}, this.mInvocationHandler));
        }

        java.lang.reflect.Method getLastMethod() {
            return this.mLastInvokedMethod;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    private static boolean equalsMethodParams(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
        return java.util.Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }
}
