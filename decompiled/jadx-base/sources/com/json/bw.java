package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\n\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J \u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/bw;", "Lcom/ironsource/n7;", "Smash", "", "", com.json.mediationsdk.d.h, "b", "c", "(Ljava/util/List;)Lcom/ironsource/n7;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "smash", "Lcom/ironsource/cw;", "d", "Lcom/ironsource/r0;", "Lcom/ironsource/r0;", "managerData", "<init>", "(Lcom/ironsource/r0;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bw<Smash extends com.json.n7<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.r0 managerData;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> implements java.util.Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.json.n7) t).i().l()), java.lang.Integer.valueOf(((com.json.n7) t2).i().l()));
        }
    }

    public bw(com.json.r0 managerData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(managerData, "managerData");
        this.managerData = managerData;
    }

    public final boolean a(com.json.n7<?> smash, java.util.List<? extends Smash> waterfall) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        java.util.Iterator<T> it = b(waterfall).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((com.json.n7) next).x()) {
                return kotlin.jvm.internal.Intrinsics.areEqual(next, smash);
            }
        }
        next = null;
        return kotlin.jvm.internal.Intrinsics.areEqual(next, smash);
    }

    public final boolean a(java.util.List<? extends Smash> waterfall) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        if ((waterfall instanceof java.util.Collection) && waterfall.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator<T> it = waterfall.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((com.json.n7) it.next()).y() && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.managerData.getMaxSmashesToLoad();
    }

    public final java.util.List<Smash> b(java.util.List<? extends Smash> waterfall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        return kotlin.collections.CollectionsKt.sortedWith(waterfall, new com.ironsource.bw.a());
    }

    public final Smash c(java.util.List<? extends Smash> waterfall) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        java.util.Iterator<T> it = b(waterfall).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((com.json.n7) next).B()) {
                return (Smash) next;
            }
        }
        next = null;
        return (Smash) next;
    }

    public final com.json.cw<Smash> d(java.util.List<? extends Smash> waterfall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(this.managerData.getAdUnit().name() + " waterfall size: " + waterfall.size());
        com.json.dw<Smash> dwVarA = com.json.dw.INSTANCE.a(this.managerData.getAdvancedLoading() ? com.json.zv.BIDDER_SENSITIVE : com.json.zv.DEFAULT, this.managerData.getMaxSmashesToLoad(), this.managerData.getShowPriorityEnabled(), waterfall);
        java.util.Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            dwVarA.d(it.next());
            if (dwVarA.e()) {
                return new com.json.cw<>(dwVarA);
            }
        }
        return new com.json.cw<>(dwVarA);
    }
}
