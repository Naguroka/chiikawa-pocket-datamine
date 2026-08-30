package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ironsource/co;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "<init>", "(Ljava/lang/Exception;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class co extends java.lang.Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(java.lang.Exception e) {
        super("Missing Headers", e);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
    }
}
