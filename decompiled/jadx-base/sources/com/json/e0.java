package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u000f2\u00020\u0001:\u0003\n\u0004\u000fB\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ironsource/e0;", "", "", "Lcom/ironsource/y;", "b", com.json.j5.p, "Lcom/ironsource/e0$b;", "loadSelection", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/vv;", "waterfallInstances", "d", "Lcom/ironsource/e0$c;", "c", "Lcom/ironsource/t1;", "Lcom/ironsource/t1;", "adUnitData", "Lcom/ironsource/vv;", "<init>", "(Lcom/ironsource/t1;Lcom/ironsource/vv;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class e0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final com.json.e0.Companion INSTANCE = new com.json.e0.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.t1 adUnitData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.vv waterfallInstances;

    /* JADX INFO: renamed from: com.ironsource.e0$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/e0$a;", "", "Lcom/ironsource/t1;", "adUnitData", "Lcom/ironsource/vv;", "waterfallInstances", "Lcom/ironsource/e0;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.ironsource.e0$a$a, reason: collision with other inner class name */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0231a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2599a;

            static {
                int[] iArr = new int[com.json.zv.values().length];
                try {
                    iArr[com.json.zv.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.json.zv.DEFAULT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f2599a = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.json.e0 a(com.json.t1 adUnitData, com.json.vv waterfallInstances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            int i = com.json.e0.Companion.C0231a.f2599a[(adUnitData.getAdvancedLoading() ? com.json.zv.BIDDER_SENSITIVE : com.json.zv.DEFAULT).ordinal()];
            if (i == 1) {
                return new com.json.r7(adUnitData, waterfallInstances);
            }
            if (i == 2) {
                return adUnitData.getCom.ironsource.mediationsdk.d.z java.lang.String() ? new com.json.jt(adUnitData, waterfallInstances) : new com.json.ea(adUnitData, waterfallInstances);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000bR\"\u0010\u0015\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\t\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/e0$b;", "", "", "e", "f", "", "g", "", "Lcom/ironsource/y;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "()Ljava/util/List;", "instancesToLoad", "b", "loadedInstances", "c", "loadingInProgressInstances", "d", "Z", "()Z", "(Z)V", "isBidderReached", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.util.List<com.json.y> instancesToLoad = new java.util.ArrayList();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final java.util.List<com.json.y> loadedInstances = new java.util.ArrayList();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final java.util.List<com.json.y> loadingInProgressInstances = new java.util.ArrayList();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean isBidderReached;

        public final java.util.List<com.json.y> a() {
            return this.instancesToLoad;
        }

        public final void a(boolean z) {
            this.isBidderReached = z;
        }

        public final java.util.List<com.json.y> b() {
            return this.loadedInstances;
        }

        public final java.util.List<com.json.y> c() {
            return this.loadingInProgressInstances;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsBidderReached() {
            return this.isBidderReached;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.instancesToLoad.isEmpty() && this.loadingInProgressInstances.isEmpty();
        }

        public final int g() {
            return this.instancesToLoad.size() + this.loadedInstances.size() + this.loadingInProgressInstances.size();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J%\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ironsource/e0$c;", "", "Lcom/ironsource/y;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "instanceToShow", "orderedInstances", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/ironsource/y;", "c", "()Lcom/ironsource/y;", "Ljava/util/List;", "d", "()Ljava/util/List;", "<init>", "(Lcom/ironsource/y;Ljava/util/List;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.json.y instanceToShow;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final java.util.List<com.json.y> orderedInstances;

        /* JADX WARN: Multi-variable type inference failed */
        public c(com.json.y yVar, java.util.List<? extends com.json.y> orderedInstances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            this.instanceToShow = yVar;
            this.orderedInstances = orderedInstances;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.ironsource.e0.c a(com.ironsource.e0.c cVar, com.json.y yVar, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                yVar = cVar.instanceToShow;
            }
            if ((i & 2) != 0) {
                list = cVar.orderedInstances;
            }
            return cVar.a(yVar, list);
        }

        public final com.ironsource.e0.c a(com.json.y instanceToShow, java.util.List<? extends com.json.y> orderedInstances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            return new com.ironsource.e0.c(instanceToShow, orderedInstances);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.json.y getInstanceToShow() {
            return this.instanceToShow;
        }

        public final java.util.List<com.json.y> b() {
            return this.orderedInstances;
        }

        public final com.json.y c() {
            return this.instanceToShow;
        }

        public final java.util.List<com.json.y> d() {
            return this.orderedInstances;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.ironsource.e0.c)) {
                return false;
            }
            com.ironsource.e0.c cVar = (com.ironsource.e0.c) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instanceToShow, cVar.instanceToShow) && kotlin.jvm.internal.Intrinsics.areEqual(this.orderedInstances, cVar.orderedInstances);
        }

        public int hashCode() {
            com.json.y yVar = this.instanceToShow;
            return ((yVar == null ? 0 : yVar.hashCode()) * 31) + this.orderedInstances.hashCode();
        }

        public java.lang.String toString() {
            return "ShowSelection(instanceToShow=" + this.instanceToShow + ", orderedInstances=" + this.orderedInstances + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d<T> implements java.util.Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.json.y) t).getAuctionResponseItem().l()), java.lang.Integer.valueOf(((com.json.y) t2).getAuctionResponseItem().l()));
        }
    }

    public e0(com.json.t1 adUnitData, com.json.vv waterfallInstances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.adUnitData = adUnitData;
        this.waterfallInstances = waterfallInstances;
    }

    private final java.util.List<com.json.y> b() {
        return kotlin.collections.CollectionsKt.sortedWith(this.waterfallInstances.b(), new com.ironsource.e0.d());
    }

    private final boolean b(com.json.y instance, com.ironsource.e0.b loadSelection) {
        com.json.mediationsdk.logger.IronLog ironLog;
        java.lang.StringBuilder sbAppend;
        java.lang.String str;
        java.util.List<com.json.y> listC;
        if (!instance.getIsInstanceFailed()) {
            if (!instance.getIsInstanceLoaded()) {
                if (instance.getIsInstanceLoading()) {
                    com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(instance.getAdFormat().name() + " - Instance " + instance.getInstanceSignature() + " still loading");
                    listC = loadSelection.c();
                } else if (a(instance, this.waterfallInstances)) {
                    ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
                    sbAppend = new java.lang.StringBuilder().append(instance.getAdFormat().name()).append(" - Instance ").append(instance.getInstanceSignature());
                    str = " is not better than already loaded instances";
                } else {
                    a(instance, loadSelection);
                }
                return a(loadSelection);
            }
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(instance.getAdFormat().name() + " - Instance " + instance.getInstanceSignature() + " is already loaded");
            listC = loadSelection.b();
            listC.add(instance);
            return a(loadSelection);
        }
        ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        sbAppend = new java.lang.StringBuilder().append(instance.getAdFormat().name()).append(" - Instance ").append(instance.getInstanceSignature());
        str = " is failed to load";
        ironLog.verbose(sbAppend.append(str).toString());
        return a(loadSelection);
    }

    public abstract void a(com.json.y instance, com.ironsource.e0.b loadSelection);

    public final boolean a() {
        int i;
        java.util.List<com.json.y> listB = this.waterfallInstances.b();
        if ((listB instanceof java.util.Collection) && listB.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator<T> it = listB.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((com.json.y) it.next()).getIsInstanceLoaded() && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.adUnitData.getMaxInstancesToLoad();
    }

    public boolean a(com.ironsource.e0.b loadSelection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return loadSelection.g() >= this.adUnitData.getMaxInstancesToLoad();
    }

    public final boolean a(com.json.y instance) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        java.util.Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((com.json.y) next).getIsInstanceFailed()) {
                return kotlin.jvm.internal.Intrinsics.areEqual(next, instance);
            }
        }
        next = null;
        return kotlin.jvm.internal.Intrinsics.areEqual(next, instance);
    }

    protected boolean a(com.json.y instance, com.json.vv waterfallInstances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return false;
    }

    public final com.ironsource.e0.c c() {
        java.lang.Object next;
        java.util.List<com.json.y> listB = b();
        java.util.Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((com.json.y) next).getIsInstanceLoaded()) {
                return new com.ironsource.e0.c((com.json.y) next, listB);
            }
        }
        next = null;
        return new com.ironsource.e0.c((com.json.y) next, listB);
    }

    public final com.ironsource.e0.b d() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(this.adUnitData.getAdProperties().getAdFormat().name() + " waterfall size: " + this.waterfallInstances.b().size());
        com.ironsource.e0.b bVar = new com.ironsource.e0.b();
        java.util.Iterator<com.json.y> it = this.waterfallInstances.b().iterator();
        while (it.hasNext() && !b(it.next(), bVar)) {
        }
        return bVar;
    }
}
