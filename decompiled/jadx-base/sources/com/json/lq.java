package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/ironsource/lq;", "Lcom/ironsource/hv;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/yl;", "Lcom/ironsource/yl;", "loadTaskConfig", "<init>", "(Lcom/ironsource/yl;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class lq implements com.json.hv {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.yl loadTaskConfig;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/mediationsdk/logger/IronSourceError;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.mediationsdk.logger.IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.lq.a f2898a = new com.ironsource.lq.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.mediationsdk.logger.IronSourceError invoke() {
            return com.json.tb.f3430a.d("Load task config is null");
        }
    }

    public lq(com.json.yl ylVar) {
        this.loadTaskConfig = ylVar;
    }

    @Override // com.json.hv
    public void a() {
        a(this.loadTaskConfig != null, com.ironsource.lq.a.f2898a);
    }
}
