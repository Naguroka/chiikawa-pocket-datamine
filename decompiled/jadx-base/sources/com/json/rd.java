package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f¨\u0006\""}, d2 = {"Lcom/ironsource/rd;", "Lcom/ironsource/qd;", "Lcom/ironsource/md$a;", "Lcom/ironsource/v1;", "Lcom/ironsource/k2;", "adUnitLoadStrategyListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/app/Activity;", "activity", "Lcom/ironsource/w1;", "adUnitDisplayStrategyListener", "Lcom/ironsource/xd;", "state", "", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/l1;", "Lcom/ironsource/l1;", "c", "()Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/nd;", "Lcom/ironsource/nd;", "d", "()Lcom/ironsource/nd;", "factory", "Lcom/ironsource/xd;", "<init>", "(Lcom/ironsource/l1;Lcom/ironsource/nd;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class rd implements com.json.qd, com.ironsource.md.a, com.json.v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.l1 adTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.nd factory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private com.json.xd state;

    public rd(com.json.l1 adTools, com.json.nd factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "factory");
        this.adTools = adTools;
        this.factory = factory;
        this.state = new com.json.sd(this, null, false, 4, null);
    }

    @Override // com.ironsource.md.a
    public void a() {
        this.state.a();
    }

    @Override // com.json.qd
    public void a(android.app.Activity activity, com.json.w1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        this.state.a(activity, adUnitDisplayStrategyListener);
    }

    @Override // com.json.qd
    public void a(com.json.k2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        this.state.a(adUnitLoadStrategyListener);
    }

    @Override // com.ironsource.md.a
    public void a(com.json.mediationsdk.logger.IronSourceError error) {
        this.state.a(error);
    }

    public final void a(com.json.xd state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    @Override // com.ironsource.md.a
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.state.a(adInfo);
    }

    public final void a(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.adTools.getEventSender().getTroubleshoot().f(message);
    }

    @Override // com.json.v1
    public void b() {
        this.state.b();
    }

    @Override // com.json.v1
    public void b(com.json.mediationsdk.logger.IronSourceError error) {
        this.state.b(error);
    }

    @Override // com.ironsource.md.a
    public void b(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.state.b(adInfo);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.l1 getAdTools() {
        return this.adTools;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.json.nd getFactory() {
        return this.factory;
    }
}
