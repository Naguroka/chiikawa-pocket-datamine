package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0014J\b\u0010\u0007\u001a\u00020\nH\u0014J$\u0010\u0012\u001a\u00020\n2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0010H\u0014J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0017"}, d2 = {"Lcom/ironsource/ep;", "Lcom/ironsource/p7;", "Lcom/ironsource/wb;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "j", "currentEvent", "d", "", "c", "", "f", "eventId", "", "e", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "combinedEvents", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ep extends com.json.p7 {
    public static final com.json.ep P;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/ironsource/ep$a;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {
        public final void a() {
            com.json.ep.P.a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.INIT_DEFERRED_DATA, new com.json.ii().a()));
        }
    }

    static {
        com.json.ep epVar = new com.json.ep();
        P = epVar;
        epVar.H = "outcome";
        epVar.G = 0;
        epVar.I = com.json.mediationsdk.utils.IronSourceConstants.PIXEL_EVENT_TYPE;
        epVar.e();
    }

    private ep() {
    }

    @Override // com.json.p7
    protected void a(java.util.ArrayList<com.json.wb> combinedEvents) {
    }

    @Override // com.json.p7
    protected int c(com.json.wb event) {
        return 1;
    }

    @Override // com.json.p7
    protected void d() {
    }

    @Override // com.json.p7
    protected boolean d(com.json.wb currentEvent) {
        return true;
    }

    @Override // com.json.p7
    protected java.lang.String e(int eventId) {
        return "";
    }

    @Override // com.json.p7
    protected void f(com.json.wb event) {
    }

    @Override // com.json.p7
    protected boolean g(com.json.wb event) {
        return false;
    }

    @Override // com.json.p7
    protected boolean h(com.json.wb event) {
        return false;
    }

    @Override // com.json.p7
    protected boolean j(com.json.wb event) {
        return false;
    }
}
