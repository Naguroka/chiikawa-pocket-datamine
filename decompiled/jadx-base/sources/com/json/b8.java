package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\nJ \u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\nR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ironsource/b8;", "Lcom/ironsource/ze;", "Lcom/ironsource/j8;", "unit", "Lkotlin/Result;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/ironsource/j8;)Ljava/lang/Object;", "Lcom/ironsource/et;", "c", "()Ljava/lang/Object;", "Lcom/ironsource/uo;", "b", "Lcom/ironsource/ja;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "enabled", "", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "limit", "Lcom/ironsource/j8;", "f", "()Lcom/ironsource/j8;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ironsource/j8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class b8 implements com.json.ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.Boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.Integer limit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.j8 unit;

    public b8(java.lang.Boolean bool, java.lang.Integer num, com.json.j8 j8Var) {
        this.enabled = bool;
        this.limit = num;
        this.unit = j8Var;
    }

    public /* synthetic */ b8(java.lang.Boolean bool, java.lang.Integer num, com.json.j8 j8Var, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : j8Var);
    }

    private final java.lang.Object a(com.json.j8 unit) {
        return new com.json.c8(this.enabled, this.limit, unit).a();
    }

    @Override // com.json.ze
    public java.lang.Object a() {
        com.json.ja jaVar;
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(new com.json.ka(this.enabled).a());
        if (thM1304exceptionOrNullimpl != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        java.lang.Boolean bool = this.enabled;
        if (bool != null) {
            bool.booleanValue();
            jaVar = new com.json.ja(this.enabled.booleanValue());
        } else {
            jaVar = null;
        }
        return kotlin.Result.m1301constructorimpl(jaVar);
    }

    @Override // com.json.ze
    public java.lang.Object b() {
        com.json.uo uoVar;
        java.lang.Integer num;
        com.json.j8 j8Var = com.json.j8.Second;
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(a(j8Var));
        if (thM1304exceptionOrNullimpl != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.enabled, java.lang.Boolean.TRUE) || (num = this.limit) == null) {
            uoVar = null;
        } else {
            num.intValue();
            uoVar = new com.json.uo(j8Var.a(this.limit), null, 2, null);
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        return kotlin.Result.m1301constructorimpl(uoVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    @Override // com.json.ze
    public java.lang.Object c() {
        com.json.et etVar;
        java.lang.Integer num;
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(a(this.unit));
        if (thM1304exceptionOrNullimpl != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.enabled, java.lang.Boolean.TRUE) || (num = this.limit) == null) {
            etVar = null;
        } else {
            int iIntValue = num.intValue();
            com.json.j8 j8Var = this.unit;
            if (j8Var != null) {
                etVar = new com.json.et(iIntValue, j8Var);
            } else {
                etVar = null;
            }
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        return kotlin.Result.m1301constructorimpl(etVar);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final java.lang.Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final java.lang.Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final com.json.j8 getUnit() {
        return this.unit;
    }
}
