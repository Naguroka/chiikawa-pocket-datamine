package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\"\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0016J#\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000e\"\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0010J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0006\u0010!\"\u0004\b\r\u0010\"¨\u0006&"}, d2 = {"Lcom/ironsource/f3;", "Lcom/ironsource/n3;", "", "Lcom/ironsource/k3;", "list", "Lorg/json/JSONObject;", "b", "", "Lcom/unity3d/ironsourceads/internal/analytics/EventCode;", "code", "", "arrayList", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "analyticsEventEntity", "([Lcom/ironsource/k3;)V", "Lcom/ironsource/i3;", "Lcom/ironsource/i3;", "eventBaseData", "Lcom/ironsource/mf;", "Lcom/ironsource/mf;", "eventsManager", "Lcom/ironsource/hm;", "c", "Lcom/ironsource/hm;", "eventsMapper", "Lcom/ironsource/n9;", "d", "Lcom/ironsource/n9;", "currentTimeProvider", "e", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "additionalData", "<init>", "(Lcom/ironsource/i3;Lcom/ironsource/mf;Lcom/ironsource/hm;Lcom/ironsource/n9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class f3 implements com.json.n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.i3 eventBaseData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.mf eventsManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.hm<java.lang.Integer, java.lang.Integer> eventsMapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.n9 currentTimeProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private java.util.List<com.json.k3> additionalData;

    public f3(com.json.i3 eventBaseData, com.json.mf eventsManager, com.json.hm<java.lang.Integer, java.lang.Integer> eventsMapper, com.json.n9 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.eventBaseData = eventBaseData;
        this.eventsManager = eventsManager;
        this.eventsMapper = eventsMapper;
        this.currentTimeProvider = currentTimeProvider;
        this.additionalData = new java.util.ArrayList();
    }

    public /* synthetic */ f3(com.json.i3 i3Var, com.json.mf mfVar, com.json.hm hmVar, com.json.n9 n9Var, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i3Var, mfVar, hmVar, (i & 8) != 0 ? new com.ironsource.n9.a() : n9Var);
    }

    private final org.json.JSONObject b(java.util.List<? extends com.json.k3> list) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<? extends com.json.k3> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new org.json.JSONObject(linkedHashMap);
    }

    @Override // com.json.n3
    public void a() {
        this.additionalData.clear();
    }

    @Override // com.json.n3
    public void a(int code, java.util.List<com.json.k3> arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            java.util.Iterator<T> it = this.eventBaseData.a().iterator();
            while (it.hasNext()) {
                arrayList.add((com.json.k3) it.next());
            }
            java.util.Iterator<com.json.k3> it2 = this.additionalData.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.eventsManager.a(new com.json.wb(this.eventsMapper.a(java.lang.Integer.valueOf(code)).intValue(), this.currentTimeProvider.a(), b(arrayList)));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            java.lang.System.out.println((java.lang.Object) ("LogRemote | Exception: " + e.getMessage()));
        }
    }

    public final void a(java.util.List<com.json.k3> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.additionalData = list;
    }

    @Override // com.json.n3
    public void a(com.json.k3... analyticsEventEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (com.json.k3 k3Var : analyticsEventEntity) {
            this.additionalData.add(k3Var);
        }
    }

    public final java.util.List<com.json.k3> b() {
        return this.additionalData;
    }
}
