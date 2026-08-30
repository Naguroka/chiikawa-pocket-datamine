package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0005\n\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/qd;", "", "Lcom/ironsource/k2;", "adUnitLoadStrategyListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/app/Activity;", "activity", "Lcom/ironsource/w1;", "adUnitDisplayStrategyListener", "b", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface qd {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ironsource/qd$a;", "", "Lcom/ironsource/qd$c;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "strategyType", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/ironsource/qd$c;", "b", "()Lcom/ironsource/qd$c;", "<init>", "(Lcom/ironsource/qd$c;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.ironsource.qd.c strategyType;

        public a(com.ironsource.qd.c strategyType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.strategyType = strategyType;
        }

        public static /* synthetic */ com.ironsource.qd.a a(com.ironsource.qd.a aVar, com.ironsource.qd.c cVar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.strategyType;
            }
            return aVar.a(cVar);
        }

        public final com.ironsource.qd.a a(com.ironsource.qd.c strategyType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new com.ironsource.qd.a(strategyType);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.ironsource.qd.c getStrategyType() {
            return this.strategyType;
        }

        public final com.ironsource.qd.c b() {
            return this.strategyType;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.qd.a) && this.strategyType == ((com.ironsource.qd.a) other).strategyType;
        }

        public int hashCode() {
            return this.strategyType.hashCode();
        }

        public java.lang.String toString() {
            return "Config(strategyType=" + this.strategyType + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/ironsource/qd$b;", "", "Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/qd$a;", "config", "Lcom/ironsource/nd;", "fullscreenAdUnitFactory", "Lcom/ironsource/qd;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3198a;

            static {
                int[] iArr = new int[com.ironsource.qd.c.values().length];
                try {
                    iArr[com.ironsource.qd.c.MANUAL.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.ironsource.qd.c.PROGRESSIVE_ON_SHOW.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f3198a = iArr;
            }
        }

        public final com.json.qd a(com.json.l1 adTools, com.ironsource.qd.a config, com.json.nd fullscreenAdUnitFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            int i = com.ironsource.qd.b.a.f3198a[config.b().ordinal()];
            if (i == 1) {
                return new com.json.yd(adTools, config, fullscreenAdUnitFactory);
            }
            if (i == 2) {
                return new com.json.rd(adTools, fullscreenAdUnitFactory);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ironsource/qd$c;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum c {
        MANUAL("Manual"),
        PROGRESSIVE_ON_SHOW("ProgressiveOnShow");


        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String description;

        c(java.lang.String str) {
            this.description = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }
    }

    void a(android.app.Activity activity, com.json.w1 adUnitDisplayStrategyListener);

    void a(com.json.k2 adUnitLoadStrategyListener);
}
