package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public class AdLoader {
    public static final java.lang.Object m = new java.lang.Object();
    public static com.five_corp.ad.AdLoader n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f1760a;
    public final com.five_corp.ad.FiveAdConfig b;
    public final com.five_corp.ad.j c;
    public final com.five_corp.ad.internal.soundstate.e d;
    public final com.five_corp.ad.internal.context.k e;
    public final com.five_corp.ad.internal.context.g f;
    public final com.five_corp.ad.internal.E g;
    public final com.five_corp.ad.internal.G h;
    public final com.five_corp.ad.internal.l i;
    public final com.five_corp.ad.internal.context.s j;
    public final android.os.Handler k = new android.os.Handler(android.os.Looper.getMainLooper());
    public final com.five_corp.ad.internal.adselector.a l;

    public interface CollectSignalCallback {
        void onCollect(java.lang.String str);

        void onError(com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode);
    }

    public interface LoadBannerAdCallback {
        void onError(com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode);

        void onLoad(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout);
    }

    public interface LoadInterstitialAdCallback {
        void onError(com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode);

        void onLoad(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial);
    }

    public interface LoadNativeAdCallback {
        void onError(com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode);

        void onLoad(com.five_corp.ad.FiveAdNative fiveAdNative);
    }

    public interface LoadRewardAdCallback {
        void onError(com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode);

        void onLoad(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward);
    }

    public AdLoader(android.content.Context context, com.five_corp.ad.FiveAdConfig fiveAdConfig, com.five_corp.ad.j jVar, com.five_corp.ad.internal.soundstate.e eVar, com.five_corp.ad.internal.E e, com.five_corp.ad.internal.G g, com.five_corp.ad.internal.l lVar, com.five_corp.ad.internal.context.k kVar, com.five_corp.ad.internal.context.g gVar, com.five_corp.ad.internal.context.s sVar, com.five_corp.ad.internal.adselector.a aVar) {
        this.f1760a = context;
        this.b = fiveAdConfig;
        this.c = jVar;
        this.d = eVar;
        this.f = gVar;
        this.g = e;
        this.h = g;
        this.i = lVar;
        this.j = sVar;
        this.e = kVar;
        this.l = aVar;
    }

    public static com.five_corp.ad.AdLoader forConfig(android.content.Context context, com.five_corp.ad.FiveAdConfig fiveAdConfig) {
        com.five_corp.ad.AdLoader adLoader;
        android.content.Context applicationContext = context.getApplicationContext();
        com.five_corp.ad.FiveAd.initialize(applicationContext, fiveAdConfig);
        com.five_corp.ad.j jVar = com.five_corp.ad.k.a().f2120a;
        synchronized (m) {
            if (n == null) {
                n = new com.five_corp.ad.AdLoader(applicationContext, fiveAdConfig, jVar, jVar.p, jVar.b, jVar.q, jVar.c, jVar.e, jVar.k, jVar.z, jVar.l);
            }
            adLoader = n;
        }
        return adLoader;
    }

    @java.lang.Deprecated
    public static com.five_corp.ad.AdLoader getAdLoader(android.content.Context context, com.five_corp.ad.FiveAdConfig fiveAdConfig) {
        return forConfig(context, fiveAdConfig);
    }

    public static java.lang.String getSemanticVersion() {
        return com.five_corp.ad.BuildConfig.SEMVER;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(final com.five_corp.ad.AdLoader.CollectSignalCallback collectSignalCallback, com.five_corp.ad.internal.context.t tVar) {
        android.os.Handler handler;
        java.lang.Runnable runnable;
        final com.five_corp.ad.internal.util.f fVarA = this.g.a(tVar.f1896a, tVar.d, this.d.a());
        if (fVarA.f2085a) {
            handler = this.k;
            runnable = new java.lang.Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    com.five_corp.ad.AdLoader.b(collectSignalCallback, fVarA);
                }
            };
        } else {
            handler = this.k;
            runnable = new java.lang.Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    com.five_corp.ad.AdLoader.a(collectSignalCallback, fVarA);
                }
            };
        }
        handler.post(runnable);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(final com.five_corp.ad.h hVar, final com.five_corp.ad.internal.context.l lVar) {
        this.k.post(new java.lang.Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(hVar, lVar);
            }
        });
    }

    public void collectSignal(com.five_corp.ad.AdSlotConfig adSlotConfig, final com.five_corp.ad.AdLoader.CollectSignalCallback collectSignalCallback) {
        this.j.a(this.f.a(adSlotConfig.slotId), new com.five_corp.ad.internal.context.q() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda5
            @Override // com.five_corp.ad.internal.context.q
            public final void a(com.five_corp.ad.internal.context.t tVar) {
                this.f$0.b(collectSignalCallback, tVar);
            }
        }, 1000L, new com.five_corp.ad.internal.context.r() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda6
            @Override // com.five_corp.ad.internal.context.r
            public final void a(com.five_corp.ad.internal.s sVar) {
                this.f$0.b(collectSignalCallback, sVar);
            }
        });
    }

    public void loadBannerAd(com.five_corp.ad.AdSlotConfig adSlotConfig, final int i, final com.five_corp.ad.AdLoader.LoadBannerAdCallback loadBannerAdCallback) {
        com.five_corp.ad.internal.context.i iVarA = this.f.a(adSlotConfig.slotId);
        com.five_corp.ad.internal.context.h hVar = com.five_corp.ad.internal.context.h.CUSTOM_LAYOUT;
        com.five_corp.ad.h hVar2 = new com.five_corp.ad.h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda10
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.l lVar) {
                this.f$0.b(loadBannerAdCallback, i, lVar);
            }
        };
        java.util.Objects.requireNonNull(loadBannerAdCallback);
        a(iVarA, hVar, hVar2, new com.five_corp.ad.AdLoader$$ExternalSyntheticLambda21(loadBannerAdCallback));
    }

    public void loadInterstitialAd(com.five_corp.ad.AdSlotConfig adSlotConfig, final com.five_corp.ad.AdLoader.LoadInterstitialAdCallback loadInterstitialAdCallback) {
        com.five_corp.ad.internal.context.i iVarA = this.f.a(adSlotConfig.slotId);
        com.five_corp.ad.internal.context.h hVar = com.five_corp.ad.internal.context.h.INTERSTITIAL;
        com.five_corp.ad.h hVar2 = new com.five_corp.ad.h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda11
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.l lVar) {
                this.f$0.b(loadInterstitialAdCallback, lVar);
            }
        };
        java.util.Objects.requireNonNull(loadInterstitialAdCallback);
        a(iVarA, hVar, hVar2, new com.five_corp.ad.AdLoader$$ExternalSyntheticLambda17(loadInterstitialAdCallback));
    }

    public void loadNativeAd(com.five_corp.ad.AdSlotConfig adSlotConfig, final int i, final com.five_corp.ad.AdLoader.LoadNativeAdCallback loadNativeAdCallback) {
        com.five_corp.ad.internal.context.i iVarA = this.f.a(adSlotConfig.slotId);
        com.five_corp.ad.internal.context.h hVar = com.five_corp.ad.internal.context.h.NATIVE;
        com.five_corp.ad.h hVar2 = new com.five_corp.ad.h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda16
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.l lVar) {
                this.f$0.b(loadNativeAdCallback, i, lVar);
            }
        };
        java.util.Objects.requireNonNull(loadNativeAdCallback);
        a(iVarA, hVar, hVar2, new com.five_corp.ad.AdLoader$$ExternalSyntheticLambda23(loadNativeAdCallback));
    }

    public void loadRewardAd(com.five_corp.ad.AdSlotConfig adSlotConfig, final com.five_corp.ad.AdLoader.LoadRewardAdCallback loadRewardAdCallback) {
        com.five_corp.ad.internal.context.i iVarA = this.f.a(adSlotConfig.slotId);
        com.five_corp.ad.internal.context.h hVar = com.five_corp.ad.internal.context.h.VIDEO_REWARD;
        com.five_corp.ad.h hVar2 = new com.five_corp.ad.h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda18
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.l lVar) {
                this.f$0.b(loadRewardAdCallback, lVar);
            }
        };
        java.util.Objects.requireNonNull(loadRewardAdCallback);
        a(iVarA, hVar, hVar2, new com.five_corp.ad.AdLoader$$ExternalSyntheticLambda19(loadRewardAdCallback));
    }

    public final /* synthetic */ void b(final com.five_corp.ad.AdLoader.CollectSignalCallback collectSignalCallback, final com.five_corp.ad.internal.s sVar) {
        this.k.post(new java.lang.Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                collectSignalCallback.onError(sVar.a());
            }
        });
    }

    public void collectSignal(java.lang.String str, com.five_corp.ad.AdLoader.CollectSignalCallback collectSignalCallback) {
        collectSignal(new com.five_corp.ad.AdSlotConfig(str), collectSignalCallback);
    }

    public void loadBannerAd(com.five_corp.ad.BidData bidData, final int i, final com.five_corp.ad.AdLoader.LoadBannerAdCallback loadBannerAdCallback) {
        com.five_corp.ad.internal.context.h hVar = com.five_corp.ad.internal.context.h.CUSTOM_LAYOUT;
        com.five_corp.ad.h hVar2 = new com.five_corp.ad.h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda20
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.l lVar) {
                this.f$0.a(loadBannerAdCallback, i, lVar);
            }
        };
        java.util.Objects.requireNonNull(loadBannerAdCallback);
        a(bidData, hVar, new com.five_corp.ad.AdLoader$$ExternalSyntheticLambda21(loadBannerAdCallback), hVar2);
    }

    public void loadInterstitialAd(com.five_corp.ad.BidData bidData, final com.five_corp.ad.AdLoader.LoadInterstitialAdCallback loadInterstitialAdCallback) {
        com.five_corp.ad.internal.context.h hVar = com.five_corp.ad.internal.context.h.INTERSTITIAL;
        com.five_corp.ad.h hVar2 = new com.five_corp.ad.h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda2
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.l lVar) {
                this.f$0.a(loadInterstitialAdCallback, lVar);
            }
        };
        java.util.Objects.requireNonNull(loadInterstitialAdCallback);
        a(bidData, hVar, new com.five_corp.ad.AdLoader$$ExternalSyntheticLambda17(loadInterstitialAdCallback), hVar2);
    }

    public void loadNativeAd(com.five_corp.ad.BidData bidData, final int i, final com.five_corp.ad.AdLoader.LoadNativeAdCallback loadNativeAdCallback) {
        com.five_corp.ad.internal.context.h hVar = com.five_corp.ad.internal.context.h.NATIVE;
        com.five_corp.ad.h hVar2 = new com.five_corp.ad.h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda22
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.l lVar) {
                this.f$0.a(loadNativeAdCallback, i, lVar);
            }
        };
        java.util.Objects.requireNonNull(loadNativeAdCallback);
        a(bidData, hVar, new com.five_corp.ad.AdLoader$$ExternalSyntheticLambda23(loadNativeAdCallback), hVar2);
    }

    public void loadRewardAd(com.five_corp.ad.BidData bidData, final com.five_corp.ad.AdLoader.LoadRewardAdCallback loadRewardAdCallback) {
        com.five_corp.ad.internal.context.h hVar = com.five_corp.ad.internal.context.h.VIDEO_REWARD;
        com.five_corp.ad.h hVar2 = new com.five_corp.ad.h() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda14
            @Override // com.five_corp.ad.h
            public final void a(com.five_corp.ad.internal.context.l lVar) {
                this.f$0.a(loadRewardAdCallback, lVar);
            }
        };
        java.util.Objects.requireNonNull(loadRewardAdCallback);
        a(bidData, hVar, new com.five_corp.ad.AdLoader$$ExternalSyntheticLambda19(loadRewardAdCallback), hVar2);
    }

    public static void b(com.five_corp.ad.AdLoader.CollectSignalCallback collectSignalCallback, com.five_corp.ad.internal.util.f fVar) {
        collectSignalCallback.onCollect((java.lang.String) fVar.c);
    }

    @java.lang.Deprecated
    public void loadBannerAd(com.five_corp.ad.BidData bidData, com.five_corp.ad.AdLoader.LoadBannerAdCallback loadBannerAdCallback) {
        loadBannerAd(bidData, 0, loadBannerAdCallback);
    }

    public void loadNativeAd(com.five_corp.ad.BidData bidData, com.five_corp.ad.AdLoader.LoadNativeAdCallback loadNativeAdCallback) {
        loadNativeAd(bidData, 0, loadNativeAdCallback);
    }

    public final void a(final com.five_corp.ad.BidData bidData, final com.five_corp.ad.internal.context.h hVar, final com.five_corp.ad.i iVar, final com.five_corp.ad.h hVar2) {
        this.k.post(new java.lang.Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(bidData, hVar, iVar, hVar2);
            }
        });
    }

    public final void a(final com.five_corp.ad.internal.context.j jVar, final com.five_corp.ad.internal.context.t tVar, final com.five_corp.ad.internal.context.h hVar, final com.five_corp.ad.i iVar, final java.lang.String str, final com.five_corp.ad.h hVar2) {
        this.k.post(new java.lang.Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(jVar, tVar, hVar, iVar, str, hVar2);
            }
        });
    }

    public final void b(final com.five_corp.ad.BidData bidData, final com.five_corp.ad.internal.context.h hVar, final com.five_corp.ad.i iVar, final com.five_corp.ad.h hVar2) {
        com.five_corp.ad.internal.l lVar = this.i;
        java.lang.String str = bidData.bidResponse;
        lVar.getClass();
        com.five_corp.ad.internal.util.f fVarC = com.five_corp.ad.internal.l.c(str);
        if (!fVarC.f2085a) {
            b(iVar, fVarC.b, null, null, hVar);
            return;
        }
        final com.five_corp.ad.internal.ad.c cVar = (com.five_corp.ad.internal.ad.c) fVarC.c;
        java.lang.String str2 = cVar.b;
        java.lang.String str3 = this.b.appId;
        final com.five_corp.ad.internal.context.i iVar2 = new com.five_corp.ad.internal.context.i(str2, cVar.f1797a);
        final com.five_corp.ad.internal.context.j jVarA = this.e.a(cVar.c);
        if (jVarA == null) {
            b(iVar, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.N5, null, null, null), cVar.c, iVar2, hVar);
        } else {
            this.j.a(iVar2, new com.five_corp.ad.internal.context.q() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda3
                @Override // com.five_corp.ad.internal.context.q
                public final void a(com.five_corp.ad.internal.context.t tVar) {
                    this.f$0.a(jVarA, bidData, hVar, hVar2, iVar, tVar);
                }
            }, 1000L, new com.five_corp.ad.internal.context.r() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda4
                @Override // com.five_corp.ad.internal.context.r
                public final void a(com.five_corp.ad.internal.s sVar) {
                    this.f$0.a(cVar, iVar2, hVar, iVar, sVar);
                }
            });
        }
    }

    public static void a(com.five_corp.ad.AdLoader.CollectSignalCallback collectSignalCallback, com.five_corp.ad.internal.util.f fVar) {
        collectSignalCallback.onError(fVar.b.a());
    }

    public final /* synthetic */ void a(com.five_corp.ad.internal.context.j jVar, com.five_corp.ad.BidData bidData, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.h hVar2, com.five_corp.ad.i iVar, com.five_corp.ad.internal.context.t tVar) {
        a(jVar, tVar, hVar, iVar, bidData.watermark, hVar2);
    }

    public final /* synthetic */ void a(com.five_corp.ad.internal.ad.c cVar, com.five_corp.ad.internal.context.i iVar, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.i iVar2, com.five_corp.ad.internal.s sVar) {
        b(iVar2, sVar, cVar.c, iVar, hVar);
    }

    public final /* synthetic */ void a(com.five_corp.ad.internal.context.j jVar, com.five_corp.ad.internal.context.t tVar, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.i iVar, com.five_corp.ad.internal.s sVar) {
        b(iVar, sVar, jVar.f1888a, tVar.f1896a, hVar);
    }

    public final void b(final com.five_corp.ad.internal.context.j jVar, final com.five_corp.ad.internal.context.t tVar, final com.five_corp.ad.internal.context.h hVar, final com.five_corp.ad.i iVar, java.lang.String str, final com.five_corp.ad.h hVar2) {
        com.five_corp.ad.internal.ad.format_config.a aVarA;
        int iOrdinal;
        com.five_corp.ad.internal.ad.a aVar = jVar.f1888a;
        java.lang.String str2 = tVar.f1896a.c;
        if (com.five_corp.ad.internal.A.a(aVar, java.lang.System.currentTimeMillis()) && com.five_corp.ad.internal.ad.a.a(aVar, str2) != null && (aVarA = com.five_corp.ad.internal.ad.a.a(aVar, str2)) != null && ((iOrdinal = hVar.ordinal()) == 0 || iOrdinal == 1 ? aVarA.b != null : (iOrdinal == 2 || iOrdinal == 3) && aVarA.c != null)) {
            this.f.a(jVar, str, tVar, hVar, new com.five_corp.ad.internal.context.e() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda8
                @Override // com.five_corp.ad.internal.context.e
                public final void a(com.five_corp.ad.internal.context.l lVar) {
                    this.f$0.a(hVar2, lVar);
                }
            }, new com.five_corp.ad.internal.context.f() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda9
                @Override // com.five_corp.ad.internal.context.f
                public final void a(com.five_corp.ad.internal.s sVar) {
                    this.f$0.a(jVar, tVar, hVar, iVar, sVar);
                }
            });
        } else {
            b(iVar, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.O5, null, null, null), jVar.f1888a, tVar.f1896a, hVar);
        }
    }

    public final /* synthetic */ void a(com.five_corp.ad.AdLoader.LoadBannerAdCallback loadBannerAdCallback, int i, com.five_corp.ad.internal.context.l lVar) {
        loadBannerAdCallback.onLoad(new com.five_corp.ad.FiveAdCustomLayout(this.f1760a, this.c, lVar, i));
    }

    public final /* synthetic */ void a(com.five_corp.ad.AdLoader.LoadInterstitialAdCallback loadInterstitialAdCallback, com.five_corp.ad.internal.context.l lVar) {
        loadInterstitialAdCallback.onLoad(new com.five_corp.ad.FiveAdInterstitial(this.f1760a, this.c, lVar));
    }

    public final /* synthetic */ void a(com.five_corp.ad.AdLoader.LoadNativeAdCallback loadNativeAdCallback, int i, com.five_corp.ad.internal.context.l lVar) {
        loadNativeAdCallback.onLoad(new com.five_corp.ad.FiveAdNative(this.f1760a, this.c, lVar, i));
    }

    public final /* synthetic */ void a(com.five_corp.ad.AdLoader.LoadRewardAdCallback loadRewardAdCallback, com.five_corp.ad.internal.context.l lVar) {
        loadRewardAdCallback.onLoad(new com.five_corp.ad.FiveAdVideoReward(this.f1760a, this.c, lVar));
    }

    public final void a(com.five_corp.ad.i iVar, com.five_corp.ad.internal.s sVar, com.five_corp.ad.internal.ad.a aVar, com.five_corp.ad.internal.context.i iVar2, com.five_corp.ad.internal.context.h hVar) {
        iVar.onError(sVar.a());
        this.h.a(new com.five_corp.ad.internal.beacon.b(aVar, iVar2, hVar, sVar, new com.five_corp.ad.internal.soundstate.a(1, 1, 1, this.d.a()), 0L, null, null));
    }

    public final void a(com.five_corp.ad.internal.context.i iVar, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.h hVar2, com.five_corp.ad.i iVar2) {
        com.five_corp.ad.internal.adselector.a aVar = this.l;
        com.five_corp.ad.internal.soundstate.d dVarA = this.d.a();
        java.lang.Object obj = new java.lang.Object();
        com.five_corp.ad.internal.soundstate.a aVar2 = new com.five_corp.ad.internal.soundstate.a(1, 1, 1, dVarA);
        new java.util.ArrayList();
        synchronized (obj) {
        }
        aVar.a(iVar, hVar, aVar2, new com.five_corp.ad.g(this, hVar2, iVar, hVar, iVar2));
    }

    public final /* synthetic */ void b(com.five_corp.ad.AdLoader.LoadBannerAdCallback loadBannerAdCallback, int i, com.five_corp.ad.internal.context.l lVar) {
        loadBannerAdCallback.onLoad(new com.five_corp.ad.FiveAdCustomLayout(this.f1760a, this.c, lVar, i));
    }

    public final /* synthetic */ void b(com.five_corp.ad.AdLoader.LoadInterstitialAdCallback loadInterstitialAdCallback, com.five_corp.ad.internal.context.l lVar) {
        loadInterstitialAdCallback.onLoad(new com.five_corp.ad.FiveAdInterstitial(this.f1760a, this.c, lVar));
    }

    public final /* synthetic */ void b(com.five_corp.ad.AdLoader.LoadNativeAdCallback loadNativeAdCallback, int i, com.five_corp.ad.internal.context.l lVar) {
        loadNativeAdCallback.onLoad(new com.five_corp.ad.FiveAdNative(this.f1760a, this.c, lVar, i));
    }

    public final /* synthetic */ void b(com.five_corp.ad.AdLoader.LoadRewardAdCallback loadRewardAdCallback, com.five_corp.ad.internal.context.l lVar) {
        loadRewardAdCallback.onLoad(new com.five_corp.ad.FiveAdVideoReward(this.f1760a, this.c, lVar));
    }

    public final void b(com.five_corp.ad.h hVar, com.five_corp.ad.internal.context.l lVar) {
        hVar.a(lVar);
        this.h.a(new com.five_corp.ad.internal.beacon.a(lVar, 5, new com.five_corp.ad.internal.soundstate.a(1, 1, 1, this.d.a()), 0L, 0.0d));
    }

    public final void b(final com.five_corp.ad.i iVar, final com.five_corp.ad.internal.s sVar, final com.five_corp.ad.internal.ad.a aVar, final com.five_corp.ad.internal.context.i iVar2, final com.five_corp.ad.internal.context.h hVar) {
        this.k.post(new java.lang.Runnable() { // from class: com.five_corp.ad.AdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(iVar, sVar, aVar, iVar2, hVar);
            }
        });
    }
}
