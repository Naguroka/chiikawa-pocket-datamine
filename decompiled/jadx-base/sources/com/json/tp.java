package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/ironsource/tp;", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", com.json.pr.b, "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseInterface;", "networkAdapter", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "adData", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/t2;", "Lcom/ironsource/t2;", "adUnitTools", "", "Lcom/ironsource/vn;", "b", "Ljava/util/List;", "providers", "Lcom/ironsource/t1;", "c", "Lcom/ironsource/t1;", "adUnitData", "d", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "legacyAdUnit", "<init>", "(Lcom/ironsource/t2;Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/util/List;Lcom/ironsource/t1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.t2 adUnitTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.List<com.json.vn> providers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.t1 adUnitData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.ironsource.mediationsdk.IronSource.AD_UNIT legacyAdUnit;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3445a;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f3445a = iArr;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/ironsource/tp$b", "Lcom/ironsource/dr;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "t", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends com.json.dr {
        final /* synthetic */ com.json.mediationsdk.model.NetworkSettings b;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface c;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdData d;

        b(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
            this.b = networkSettings;
            this.c = adapterBaseInterface;
            this.d = adData;
        }

        @Override // com.json.dr
        public void a() {
            com.json.tp tpVar = com.json.tp.this;
            com.json.mediationsdk.model.NetworkSettings networkSettings = this.b;
            com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface networkAdapter = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkAdapter, "networkAdapter");
            tpVar.a(networkSettings, networkAdapter, this.d);
        }

        @Override // com.json.dr
        public void a(java.lang.Throwable t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
            com.json.tp.this.adUnitTools.getEventSender().getTroubleshoot().g("initProvider - exception while calling networkAdapter.init with " + this.b.getProviderName() + " - " + t);
        }
    }

    public tp(com.json.t2 adUnitTools, com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.util.List<com.json.vn> providers, com.json.t1 adUnitData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providers, "providers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.adUnitTools = adUnitTools;
        this.providers = providers;
        this.adUnitData = adUnitData;
        this.legacyAdUnit = a(adFormat);
    }

    private final com.ironsource.mediationsdk.IronSource.AD_UNIT a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        int i = com.ironsource.tp.a.f3445a[adFormat.ordinal()];
        if (i == 1) {
            return com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i == 2) {
            return com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i == 3) {
            return com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        }
        if (i == 4) {
            return com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.json.mediationsdk.model.NetworkSettings providerSettings, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface networkAdapter, com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        a("Start initializing provider %s on thread %s", providerSettings);
        networkAdapter.init(adData, com.json.environment.ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", providerSettings);
    }

    private final void a(java.lang.String message, com.json.mediationsdk.model.NetworkSettings providerSettings) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        com.json.t2 t2Var = this.adUnitTools;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format(message, java.util.Arrays.copyOf(new java.lang.Object[]{providerSettings.getProviderInstanceName(), java.lang.Thread.currentThread().getName()}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        ironLog.verbose(com.json.l1.a(t2Var, str, (java.lang.String) null, 2, (java.lang.Object) null));
    }

    private final boolean a(com.json.mediationsdk.model.NetworkSettings providerSettings, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface networkAdapter) {
        if (networkAdapter == null) {
            return false;
        }
        com.json.t2 t2Var = this.adUnitTools;
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = this.legacyAdUnit;
        java.lang.String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        if (t2Var.a(networkAdapter, ad_unit, providerInstanceName)) {
            return false;
        }
        return providerSettings.shouldEarlyInit() || providerSettings.isIronSource() || providerSettings.isBidder(this.legacyAdUnit);
    }

    public final void a() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.adUnitTools, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        java.util.Iterator<com.json.vn> it = this.providers.iterator();
        while (it.hasNext()) {
            com.json.mediationsdk.model.NetworkSettings networkSettingsF = it.next().f();
            com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterfaceB = com.json.mediationsdk.c.b().b(networkSettingsF, this.legacyAdUnit, uuidRandomUUID);
            if (a(networkSettingsF, adapterBaseInterfaceB)) {
                com.json.st.a(com.json.st.f3417a, new com.ironsource.tp.b(networkSettingsF, adapterBaseInterfaceB, this.adUnitData.a(networkSettingsF)), 0L, 2, null);
            }
        }
    }
}
