package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u000e"}, d2 = {"Lcom/ironsource/jt;", "Lcom/ironsource/ea;", "Lcom/ironsource/vv;", "waterfallInstances", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/y;", com.json.j5.p, "b", "", "Lcom/ironsource/t1;", "adUnitData", "<init>", "(Lcom/ironsource/t1;Lcom/ironsource/vv;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class jt extends com.json.ea {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt(com.json.t1 adUnitData, com.json.vv waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    private final int a(com.json.vv waterfallInstances) {
        java.lang.Integer num;
        java.util.List<com.json.y> listB = waterfallInstances.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listB) {
            if (((com.json.y) obj).getIsInstanceLoaded()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(b((com.json.y) it.next()));
            while (it.hasNext()) {
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(b((com.json.y) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    private final int b(com.json.y instance) {
        return instance.getAuctionResponseItem().l();
    }

    @Override // com.json.e0
    protected boolean a(com.json.y instance, com.json.vv waterfallInstances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return a(waterfallInstances) < b(instance);
    }
}
