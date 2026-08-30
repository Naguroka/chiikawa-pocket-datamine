package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u001c\u0010\u001c\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/ironsource/xc;", "Lcom/ironsource/ho;", "Lcom/ironsource/yc;", "loadListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/zc;", "showListener", "onInterstitialInitSuccess", "", "description", "onInterstitialInitFailed", "Lcom/ironsource/mj;", com.ironsource.y8.h.p0, "onInterstitialLoadSuccess", "onInterstitialLoadFailed", "onInterstitialOpen", "demandSourceId", "", "amount", "onInterstitialAdRewarded", "onInterstitialClose", "onInterstitialShowSuccess", "onInterstitialShowFailed", "onInterstitialClick", com.ironsource.y8.h.j0, "Lorg/json/JSONObject;", com.ironsource.y8.h.l0, "onInterstitialEventNotificationReceived", "Lcom/ironsource/yc;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class xc implements com.json.ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.json.yc loadListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private java.lang.ref.WeakReference<com.json.zc> showListener = new java.lang.ref.WeakReference<>(null);

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ironsource/xc$a;", "", "", "b", "Ljava/lang/String;", "AD_VISIBLE_EVENT_NAME", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.xc.a f3557a = new com.ironsource.xc.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final java.lang.String AD_VISIBLE_EVENT_NAME = "impressions";

        private a() {
        }
    }

    public final void a(com.json.yc loadListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.loadListener = loadListener;
    }

    public final void a(com.json.zc showListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.showListener = new java.lang.ref.WeakReference<>(showListener);
    }

    @Override // com.json.ho
    public void onInterstitialAdRewarded(java.lang.String demandSourceId, int amount) {
        com.json.zc zcVar = this.showListener.get();
        if (zcVar != null) {
            zcVar.onAdInstanceDidReward(demandSourceId, amount);
        }
    }

    @Override // com.json.ho
    public void onInterstitialClick() {
        com.json.zc zcVar = this.showListener.get();
        if (zcVar != null) {
            zcVar.onAdInstanceDidClick();
        }
    }

    @Override // com.json.ho
    public void onInterstitialClose() {
        com.json.zc zcVar = this.showListener.get();
        if (zcVar != null) {
            zcVar.onAdInstanceDidDismiss();
        }
    }

    @Override // com.json.ho
    public void onInterstitialEventNotificationReceived(java.lang.String eventName, org.json.JSONObject extData) {
        com.json.zc zcVar;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(eventName, "impressions") || (zcVar = this.showListener.get()) == null) {
            return;
        }
        zcVar.onAdInstanceDidBecomeVisible();
    }

    @Override // com.json.ho
    public void onInterstitialInitFailed(java.lang.String description) {
    }

    @Override // com.json.ho
    public void onInterstitialInitSuccess() {
    }

    @Override // com.json.ho
    public void onInterstitialLoadFailed(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        com.json.yc ycVar = this.loadListener;
        if (ycVar != null) {
            ycVar.a(description);
        }
    }

    @Override // com.json.ho
    public void onInterstitialLoadSuccess(com.json.mj adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        com.json.yc ycVar = this.loadListener;
        if (ycVar != null) {
            ycVar.a(adInstance);
        }
    }

    @Override // com.json.ho
    public void onInterstitialOpen() {
        com.json.zc zcVar = this.showListener.get();
        if (zcVar != null) {
            zcVar.onAdInstanceDidShow();
        }
    }

    @Override // com.json.ho
    public void onInterstitialShowFailed(java.lang.String description) {
        com.json.zc zcVar = this.showListener.get();
        if (zcVar != null) {
            zcVar.a(description);
        }
    }

    @Override // com.json.ho
    public void onInterstitialShowSuccess() {
    }
}
