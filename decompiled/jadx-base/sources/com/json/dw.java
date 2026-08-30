package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b&\u0018\u0000 \u001f*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\tB%\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0006\u001a\u00020\bH\u0002J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\f\u001a\u00020\u0005H\u0016J\u0015\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u000f\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\t\u0010\u0018¨\u0006 "}, d2 = {"Lcom/ironsource/dw;", "Lcom/ironsource/n7;", "Smash", "", "smash", "", "b", "(Lcom/ironsource/n7;)Z", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/ironsource/n7;)I", "d", "e", "", "(Lcom/ironsource/n7;)V", "c", "I", "maxSmashesToLoad", "Z", com.json.mediationsdk.d.z, "", "Ljava/util/List;", com.json.mediationsdk.d.h, "", "()Ljava/util/List;", "smashesToLoad", "loadedSmashes", "f", "loadingInProgressSmashes", "<init>", "(IZLjava/util/List;)V", "g", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class dw<Smash extends com.json.n7<?>> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final com.json.dw.Companion INSTANCE = new com.json.dw.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxSmashesToLoad;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showPriorityEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.util.List<Smash> waterfall;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final java.util.List<Smash> smashesToLoad;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final java.util.List<Smash> loadedSmashes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final java.util.List<Smash> loadingInProgressSmashes;

    /* JADX INFO: renamed from: com.ironsource.dw$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¨\u0006\u0010"}, d2 = {"Lcom/ironsource/dw$a;", "", "Lcom/ironsource/n7;", "Smash", "Lcom/ironsource/zv;", "loadingStrategy", "", "maxSmashesToLoad", "", com.json.mediationsdk.d.z, "", com.json.mediationsdk.d.h, "Lcom/ironsource/dw;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.ironsource.dw$a$a, reason: collision with other inner class name */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0230a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2596a;

            static {
                int[] iArr = new int[com.json.zv.values().length];
                try {
                    iArr[com.json.zv.DEFAULT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.json.zv.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f2596a = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <Smash extends com.json.n7<?>> com.json.dw<Smash> a(com.json.zv loadingStrategy, int maxSmashesToLoad, boolean showPriorityEnabled, java.util.List<? extends Smash> waterfall) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            int i = com.json.dw.Companion.C0230a.f2596a[loadingStrategy.ordinal()];
            if (i == 1) {
                return new com.json.ha(maxSmashesToLoad, showPriorityEnabled, waterfall);
            }
            if (i == 2) {
                return new com.json.s7(maxSmashesToLoad, showPriorityEnabled, waterfall, false, 8, null);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dw(int i, boolean z, java.util.List<? extends Smash> waterfall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.maxSmashesToLoad = i;
        this.showPriorityEnabled = z;
        this.waterfall = waterfall;
        this.smashesToLoad = new java.util.ArrayList();
        this.loadedSmashes = new java.util.ArrayList();
        this.loadingInProgressSmashes = new java.util.ArrayList();
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    private final int b() {
        java.lang.Integer num;
        java.util.List<Smash> list = this.waterfall;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.json.n7) obj).y()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(a((com.json.n7) it.next()));
            while (it.hasNext()) {
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(a((com.json.n7) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    public final java.util.List<Smash> a() {
        return this.loadingInProgressSmashes;
    }

    public final java.util.List<Smash> c() {
        return this.smashesToLoad;
    }

    public abstract void c(Smash smash);

    public final int d() {
        return this.smashesToLoad.size() + this.loadedSmashes.size() + this.loadingInProgressSmashes.size();
    }

    public final void d(Smash smash) {
        com.json.mediationsdk.logger.IronLog ironLog;
        java.lang.StringBuilder sbAppend;
        java.lang.String str;
        com.json.mediationsdk.logger.IronLog ironLog2;
        java.lang.StringBuilder sbAppend2;
        java.lang.String str2;
        java.util.List<Smash> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        if (!smash.x()) {
            if (smash.y()) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
                list = this.loadedSmashes;
            } else {
                if (smash.z()) {
                    ironLog2 = com.json.mediationsdk.logger.IronLog.INTERNAL;
                    sbAppend2 = new java.lang.StringBuilder().append(smash.g().name()).append(" - Smash ").append(smash.k());
                    str2 = " still loading";
                } else if (smash.A().get()) {
                    ironLog2 = com.json.mediationsdk.logger.IronLog.INTERNAL;
                    sbAppend2 = new java.lang.StringBuilder().append(smash.g().name()).append(" - Smash ").append(smash.k());
                    str2 = " marked as loading candidate";
                } else if (!this.showPriorityEnabled || !b(smash)) {
                    c(smash);
                    return;
                } else {
                    ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
                    sbAppend = new java.lang.StringBuilder().append(smash.g().name()).append(" - Smash ").append(smash.k());
                    str = " is not better than already loaded smashes";
                }
                ironLog2.verbose(sbAppend2.append(str2).toString());
                list = this.loadingInProgressSmashes;
            }
            list.add(smash);
            return;
        }
        ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        sbAppend = new java.lang.StringBuilder().append(smash.g().name()).append(" - smash ").append(smash.k());
        str = " is failed to load";
        ironLog.verbose(sbAppend.append(str).toString());
    }

    public boolean e() {
        return d() >= this.maxSmashesToLoad;
    }
}
