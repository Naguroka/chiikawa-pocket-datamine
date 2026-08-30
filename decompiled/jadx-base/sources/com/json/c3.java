package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0006\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J#\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/ironsource/c3;", "", "", "width", "Landroid/content/Context;", "context", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Integer;Landroid/content/Context;)I", "", "Lcom/unity3d/mediation/LevelPlayAdSize;", "fallbackSortedList", "maxHeight", "maxWidth", "(Landroid/content/Context;Ljava/lang/Integer;)Lcom/unity3d/mediation/LevelPlayAdSize;", "Lcom/ironsource/i1;", "Lcom/ironsource/i1;", "adSizeTools", "<init>", "(Lcom/ironsource/i1;)V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class c3 {
    private static final int c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.i1 adSizeTools;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> implements java.util.Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.unity3d.mediation.LevelPlayAdSize) t2).getWidth()), java.lang.Integer.valueOf(((com.unity3d.mediation.LevelPlayAdSize) t).getWidth()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c<T> implements java.util.Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.Comparator f2549a;

        public c(java.util.Comparator comparator) {
            this.f2549a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f2549a.compare(t, t2);
            return iCompare != 0 ? iCompare : kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.unity3d.mediation.LevelPlayAdSize) t2).getHeight()), java.lang.Integer.valueOf(((com.unity3d.mediation.LevelPlayAdSize) t).getHeight()));
        }
    }

    public c3(com.json.i1 adSizeTools) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSizeTools, "adSizeTools");
        this.adSizeTools = adSizeTools;
    }

    private final int a(java.lang.Integer width, android.content.Context context) {
        if (width != null && width.intValue() < 0) {
            com.json.mediationsdk.logger.IronLog.API.info(com.json.i1.a(this.adSizeTools, "Width is invalid, screen width will be used", (java.lang.String) null, 2, (java.lang.Object) null));
        } else if (width != null) {
            return width.intValue();
        }
        return com.json.ya.f3585a.b(context);
    }

    private final java.util.List<com.unity3d.mediation.LevelPlayAdSize> a() {
        return kotlin.collections.CollectionsKt.sortedWith(this.adSizeTools.b(), new com.ironsource.c3.c(new com.ironsource.c3.b()));
    }

    private final java.util.List<com.unity3d.mediation.LevelPlayAdSize> a(java.util.List<com.unity3d.mediation.LevelPlayAdSize> fallbackSortedList, int maxHeight, int maxWidth) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : fallbackSortedList) {
            com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize = (com.unity3d.mediation.LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= maxHeight && levelPlayAdSize.getWidth() <= maxWidth) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final com.unity3d.mediation.LevelPlayAdSize a(android.content.Context context, java.lang.Integer width) {
        com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize;
        int i;
        com.unity3d.mediation.LevelPlayAdSize levelPlayAdSizeCreateCustomSize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!this.adSizeTools.d()) {
            com.json.mediationsdk.logger.IronLog.API.error(com.json.i1.a(this.adSizeTools, "The SDK must be successfully initialized to create an Adaptive Ad Size", (java.lang.String) null, 2, (java.lang.Object) null));
            return null;
        }
        int iA = a(width, context);
        int iB = this.adSizeTools.b(context);
        int iA2 = this.adSizeTools.a(iA);
        java.util.List<com.unity3d.mediation.LevelPlayAdSize> listA = a();
        java.util.Iterator<T> it = a(listA, iB, iA).iterator();
        while (true) {
            if (!it.hasNext()) {
                levelPlayAdSize = null;
                break;
            }
            levelPlayAdSize = (com.unity3d.mediation.LevelPlayAdSize) it.next();
            if (levelPlayAdSize.getWidth() <= iA && (levelPlayAdSize.getHeight() <= iA2 || iA2 == -1)) {
                iA2 = java.lang.Math.max(iA2, levelPlayAdSize.getHeight());
                break;
            }
        }
        if (levelPlayAdSize == null) {
            int height = ((com.unity3d.mediation.LevelPlayAdSize) kotlin.collections.CollectionsKt.last((java.util.List) listA)).getHeight();
            i = height;
            levelPlayAdSizeCreateCustomSize = com.unity3d.mediation.LevelPlayAdSize.INSTANCE.createCustomSize(iA, height);
        } else {
            i = iA2;
            levelPlayAdSizeCreateCustomSize = levelPlayAdSize;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.info(com.json.i1.a(this.adSizeTools, "Adaptive: " + iA + 'x' + i + " Fallback: " + levelPlayAdSizeCreateCustomSize, (java.lang.String) null, 2, (java.lang.Object) null));
        return new com.unity3d.mediation.LevelPlayAdSize(iA, i, "CUSTOM", true, levelPlayAdSizeCreateCustomSize);
    }
}
