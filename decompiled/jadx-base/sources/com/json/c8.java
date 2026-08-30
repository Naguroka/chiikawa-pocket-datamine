package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ironsource/c8;", "Lcom/ironsource/af;", "Lkotlin/Result;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/Object;", "Ljava/lang/Boolean;", "enabled", "", "b", "Ljava/lang/Integer;", "limit", "Lcom/ironsource/j8;", "c", "Lcom/ironsource/j8;", "unit", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ironsource/j8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class c8 implements com.json.af {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.Boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.Integer limit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.j8 unit;

    public c8(java.lang.Boolean bool, java.lang.Integer num, com.json.j8 j8Var) {
        this.enabled = bool;
        this.limit = num;
        this.unit = j8Var;
    }

    @Override // com.json.af
    public java.lang.Object a() {
        java.lang.Exception exc;
        java.lang.Object objCreateFailure;
        java.lang.Boolean bool = this.enabled;
        if (bool != null) {
            if (bool.booleanValue()) {
                java.lang.Integer num = this.limit;
                if (num == null || num.intValue() <= 0) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    exc = new java.lang.Exception("limit flag is not provided or invalid");
                } else if (this.unit == null) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    exc = new java.lang.Exception("unit flag is not provided or invalid");
                } else {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    objCreateFailure = java.lang.Boolean.TRUE;
                }
            } else {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                objCreateFailure = java.lang.Boolean.FALSE;
            }
            return kotlin.Result.m1301constructorimpl(objCreateFailure);
        }
        kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
        exc = new java.lang.Exception("enabled flag is not provided or invalid");
        objCreateFailure = kotlin.ResultKt.createFailure(exc);
        return kotlin.Result.m1301constructorimpl(objCreateFailure);
    }
}
