package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/z1;", "Lcom/ironsource/cc;", "Lcom/ironsource/y1;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/l1;", "Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/c1;", "b", "Lcom/ironsource/c1;", "adProperties", "c", "Ljava/lang/String;", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, "<init>", "(Lcom/ironsource/l1;Lcom/ironsource/c1;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class z1 extends com.json.cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.l1 adTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.c1 adProperties;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.lang.String mediationLoadStrategy;

    public z1(com.json.l1 adTools, com.json.c1 adProperties, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.adTools = adTools;
        this.adProperties = adProperties;
        this.mediationLoadStrategy = str;
    }

    public /* synthetic */ z1(com.json.l1 l1Var, com.json.c1 c1Var, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(l1Var, c1Var, (i & 4) != 0 ? null : str);
    }

    @Override // com.json.a2
    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.y1 event) {
        java.util.Map<java.lang.String, java.lang.Object> mapA = a(this.adProperties);
        mapA.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapA.put("sessionDepth", java.lang.Integer.valueOf(this.adTools.f()));
        java.lang.String str = this.mediationLoadStrategy;
        if (str != null) {
            mapA.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapA;
    }
}
