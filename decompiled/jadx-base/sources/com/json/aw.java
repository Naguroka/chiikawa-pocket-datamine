package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\u001c\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J \u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0006H&R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/aw;", "", "Lcom/ironsource/y;", "winnerInstance", "", "orderedInstances", "", "b", "instanceToShow", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, com.json.j5.p, "", com.json.op.d, "Lcom/ironsource/lk;", "publisherDataHolder", "c", "Lcom/ironsource/l1;", "Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/to;", "Lcom/ironsource/to;", "outcomeReporter", "<init>", "(Lcom/ironsource/l1;Lcom/ironsource/to;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class aw {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final com.json.aw.Companion INSTANCE = new com.json.aw.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.l1 adTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.to outcomeReporter;

    /* JADX INFO: renamed from: com.ironsource.aw$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/ironsource/aw$a;", "", "Lcom/ironsource/t2;", "adTools", "Lcom/ironsource/t1;", "adUnitData", "Lcom/ironsource/to;", "outcomeReporter", "Lcom/ironsource/vv;", "waterfallInstances", "Lcom/ironsource/e0;", "adInstanceLoadStrategy", "Lcom/ironsource/aw;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.json.aw a(com.json.t2 adTools, com.json.t1 adUnitData, com.json.to outcomeReporter, com.json.vv waterfallInstances, com.json.e0 adInstanceLoadStrategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.getCom.ironsource.mediationsdk.d.z java.lang.String() ? new com.json.kt(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new com.json.ia(adTools, outcomeReporter, waterfallInstances);
        }
    }

    public aw(com.json.l1 adTools, com.json.to outcomeReporter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        this.adTools = adTools;
        this.outcomeReporter = outcomeReporter;
    }

    private final void b(com.json.y winnerInstance, java.util.List<? extends com.json.y> orderedInstances) {
        for (com.json.y yVar : orderedInstances) {
            if (yVar == winnerInstance) {
                winnerInstance.a(true);
                return;
            } else {
                yVar.a(false);
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.adTools, yVar.getInstanceSignature() + " - not ready to show", (java.lang.String) null, 2, (java.lang.Object) null));
            }
        }
    }

    public abstract void a();

    public abstract void a(com.json.y instance);

    public final void a(com.json.y instance, java.lang.String placementName, com.json.lk publisherDataHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.outcomeReporter.a(instance, placementName, publisherDataHolder);
    }

    public final void a(com.json.y instanceToShow, java.util.List<? extends com.json.y> orderedInstances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
        b(instanceToShow, orderedInstances);
        c(instanceToShow);
    }

    public abstract void b(com.json.y instance);

    public abstract void c(com.json.y instanceToShow);
}
