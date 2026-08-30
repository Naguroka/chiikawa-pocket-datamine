package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/ironsource/go;", "Lcom/ironsource/fo;", "Lcom/ironsource/x5;", "loadListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/z5;", "showListener", "onBannerInitSuccess", "", "description", "onBannerInitFailed", "onBannerClick", "Lcom/ironsource/mj;", com.ironsource.y8.h.p0, "Lcom/ironsource/qg;", "adContainer", "onBannerLoadSuccess", "onBannerLoadFail", "onBannerShowSuccess", "Lcom/ironsource/x5;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class go implements com.json.fo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.json.x5 loadListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private java.lang.ref.WeakReference<com.json.z5> showListener = new java.lang.ref.WeakReference<>(null);

    public final void a(com.json.x5 loadListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.loadListener = loadListener;
    }

    public final void a(com.json.z5 showListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.showListener = new java.lang.ref.WeakReference<>(showListener);
    }

    @Override // com.json.fo
    public void onBannerClick() {
        com.json.z5 z5Var = this.showListener.get();
        if (z5Var != null) {
            z5Var.onBannerClick();
        }
    }

    @Override // com.json.fo
    public void onBannerInitFailed(java.lang.String description) {
    }

    @Override // com.json.fo
    public void onBannerInitSuccess() {
    }

    @Override // com.json.fo
    public void onBannerLoadFail(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        com.json.x5 x5Var = this.loadListener;
        if (x5Var != null) {
            x5Var.onBannerLoadFail(description);
        }
    }

    @Override // com.json.fo
    public void onBannerLoadSuccess(com.json.mj adInstance, com.json.qg adContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        com.json.x5 x5Var = this.loadListener;
        if (x5Var != null) {
            x5Var.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.json.fo
    public void onBannerShowSuccess() {
        com.json.z5 z5Var = this.showListener.get();
        if (z5Var != null) {
            z5Var.onBannerShowSuccess();
        }
    }
}
