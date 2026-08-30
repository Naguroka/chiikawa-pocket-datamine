package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"Lcom/ironsource/uq;", com.json.pg.p, "", "isManual", "Lcom/ironsource/l2;", "b", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class qq {
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.json.l2 b(com.json.uq uqVar, boolean z) {
        com.ironsource.l2.a aVar;
        if (z) {
            aVar = com.ironsource.l2.a.MANUAL;
        } else {
            aVar = uqVar.k().e() ? com.ironsource.l2.a.AUTOMATIC_LOAD_WHILE_SHOW : com.ironsource.l2.a.AUTOMATIC_LOAD_AFTER_CLOSE;
        }
        return new com.json.l2(aVar, uqVar.k().j(), uqVar.k().b(), -1L);
    }
}
