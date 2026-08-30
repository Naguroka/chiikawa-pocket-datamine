package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00062\u00020\u0001:\u0003\f\u0010\u0006B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H\u0004J\b\u0010\n\u001a\u00020\tH\u0004R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/f7;", "", "", "f", "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "c", "", "d", "", "e", "Lcom/ironsource/f7$b;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/f7$b;", "config", "Lcom/ironsource/g6;", "b", "Lcom/ironsource/g6;", "bannerAdProperties", "<init>", "(Lcom/ironsource/f7$b;Lcom/ironsource/g6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class f7 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final com.json.f7.Companion INSTANCE = new com.json.f7.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.ironsource.f7.b config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.g6 bannerAdProperties;

    /* JADX INFO: renamed from: com.ironsource.f7$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/f7$a;", "", "Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/t6;", "bannerContainer", "Lcom/ironsource/f7$b;", "config", "Lcom/ironsource/g6;", "bannerAdProperties", "Lcom/ironsource/g7;", "bannerStrategyListener", "Lcom/ironsource/k6;", "createBannerAdUnitFactory", "Lcom/ironsource/f7;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.ironsource.f7$a$a, reason: collision with other inner class name */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0233a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2647a;

            static {
                int[] iArr = new int[com.ironsource.f7.c.values().length];
                try {
                    iArr[com.ironsource.f7.c.TIMED_LOAD.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.ironsource.f7.c.TIMED_SHOW.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f2647a = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.json.f7 a(com.json.l1 adTools, com.json.t6 bannerContainer, com.ironsource.f7.b config, com.json.g6 bannerAdProperties, com.json.g7 bannerStrategyListener, com.json.k6 createBannerAdUnitFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerStrategyListener, "bannerStrategyListener");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createBannerAdUnitFactory, "createBannerAdUnitFactory");
            int i = com.json.f7.Companion.C0233a.f2647a[config.e().ordinal()];
            if (i == 1) {
                return new com.json.ru(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
            }
            if (i == 2) {
                return new com.json.su(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/ironsource/f7$b;", "", "Lcom/ironsource/f7$c;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "", "c", "strategyType", "refreshInterval", "isAutoRefreshEnabled", "", "toString", "", "hashCode", "other", "equals", "Lcom/ironsource/f7$c;", "e", "()Lcom/ironsource/f7$c;", "J", "d", "()J", "Z", "f", "()Z", "<init>", "(Lcom/ironsource/f7$c;JZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.ironsource.f7.c strategyType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long refreshInterval;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isAutoRefreshEnabled;

        public b(com.ironsource.f7.c strategyType, long j, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.strategyType = strategyType;
            this.refreshInterval = j;
            this.isAutoRefreshEnabled = z;
        }

        public static /* synthetic */ com.ironsource.f7.b a(com.ironsource.f7.b bVar, com.ironsource.f7.c cVar, long j, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cVar = bVar.strategyType;
            }
            if ((i & 2) != 0) {
                j = bVar.refreshInterval;
            }
            if ((i & 4) != 0) {
                z = bVar.isAutoRefreshEnabled;
            }
            return bVar.a(cVar, j, z);
        }

        public final com.ironsource.f7.b a(com.ironsource.f7.c strategyType, long refreshInterval, boolean isAutoRefreshEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new com.ironsource.f7.b(strategyType, refreshInterval, isAutoRefreshEnabled);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.ironsource.f7.c getStrategyType() {
            return this.strategyType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getRefreshInterval() {
            return this.refreshInterval;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsAutoRefreshEnabled() {
            return this.isAutoRefreshEnabled;
        }

        public final long d() {
            return this.refreshInterval;
        }

        public final com.ironsource.f7.c e() {
            return this.strategyType;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.ironsource.f7.b)) {
                return false;
            }
            com.ironsource.f7.b bVar = (com.ironsource.f7.b) other;
            return this.strategyType == bVar.strategyType && this.refreshInterval == bVar.refreshInterval && this.isAutoRefreshEnabled == bVar.isAutoRefreshEnabled;
        }

        public final boolean f() {
            return this.isAutoRefreshEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            int iHashCode = ((this.strategyType.hashCode() * 31) + java.lang.Long.hashCode(this.refreshInterval)) * 31;
            boolean z = this.isAutoRefreshEnabled;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        public java.lang.String toString() {
            return "Config(strategyType=" + this.strategyType + ", refreshInterval=" + this.refreshInterval + ", isAutoRefreshEnabled=" + this.isAutoRefreshEnabled + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ironsource/f7$c;", "", "<init>", "(Ljava/lang/String;I)V", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum c {
        TIMED_LOAD,
        TIMED_SHOW
    }

    public f7(com.ironsource.f7.b config, com.json.g6 bannerAdProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        this.config = config;
        this.bannerAdProperties = bannerAdProperties;
    }

    public abstract void c();

    protected final long d() {
        java.lang.Long refreshInterval = this.bannerAdProperties.getRefreshInterval();
        return refreshInterval != null ? refreshInterval.longValue() : this.config.d();
    }

    protected final boolean e() {
        java.lang.Boolean autoRefresh = this.bannerAdProperties.getAutoRefresh();
        return autoRefresh != null ? autoRefresh.booleanValue() : this.config.f();
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();
}
