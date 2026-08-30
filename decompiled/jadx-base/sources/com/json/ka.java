package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ironsource/ka;", "Lcom/ironsource/af;", "Lkotlin/Result;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/Object;", "Ljava/lang/Boolean;", "enabled", "<init>", "(Ljava/lang/Boolean;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ka implements com.json.af {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.Boolean enabled;

    public ka(java.lang.Boolean bool) {
        this.enabled = bool;
    }

    @Override // com.json.af
    public java.lang.Object a() {
        java.lang.Object objCreateFailure = this.enabled;
        if (objCreateFailure == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objCreateFailure = kotlin.ResultKt.createFailure(new java.lang.Exception("enabled flag is not provided or invalid"));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        }
        return kotlin.Result.m1301constructorimpl(objCreateFailure);
    }
}
