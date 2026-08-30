package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/ironsource/ia;", "Lcom/ironsource/aw;", "Lcom/ironsource/y;", "instanceToShow", "", "c", com.json.j5.p, "b", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/to;", "d", "Lcom/ironsource/to;", "outcomeReporter", "Lcom/ironsource/vv;", "e", "Lcom/ironsource/vv;", "waterfallInstances", "Lcom/ironsource/t2;", "adTools", "<init>", "(Lcom/ironsource/t2;Lcom/ironsource/to;Lcom/ironsource/vv;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ia extends com.json.aw {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.to outcomeReporter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.vv waterfallInstances;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(com.json.t2 adTools, com.json.to outcomeReporter, com.json.vv waterfallInstances) {
        super(adTools, outcomeReporter);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.outcomeReporter = outcomeReporter;
        this.waterfallInstances = waterfallInstances;
    }

    @Override // com.json.aw
    public void a() {
    }

    @Override // com.json.aw
    public void a(com.json.y instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.json.aw
    public void b(com.json.y instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.outcomeReporter.a(this.waterfallInstances.b(), instance);
    }

    @Override // com.json.aw
    public void c(com.json.y instanceToShow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
    }
}
