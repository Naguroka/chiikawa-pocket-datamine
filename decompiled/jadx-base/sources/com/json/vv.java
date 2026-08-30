package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0019\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/ironsource/vv;", "", "Lcom/ironsource/j5;", "item", "", "itemInstanceType", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "d", "", "Lcom/ironsource/y;", com.json.mediationsdk.d.k, "toString", "hashCode", "other", "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "()I", "size", "<init>", "(Ljava/util/List;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class vv {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.List<com.json.y> instances;

    /* JADX WARN: Multi-variable type inference failed */
    public vv(java.util.List<? extends com.json.y> instances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instances, "instances");
        this.instances = instances;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.json.vv a(com.json.vv vvVar, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = vvVar.instances;
        }
        return vvVar.a(list);
    }

    private final java.lang.String a(com.json.j5 item, int itemInstanceType) {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("%s%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(itemInstanceType), item.c()}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public final com.json.vv a(java.util.List<? extends com.json.y> instances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instances, "instances");
        return new com.json.vv(instances);
    }

    public final java.util.List<com.json.y> a() {
        return this.instances;
    }

    public final java.util.List<com.json.y> b() {
        return this.instances;
    }

    public final int c() {
        return this.instances.size();
    }

    public final java.lang.String d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.json.y yVar : this.instances) {
            arrayList.add(a(yVar.getAuctionResponseItem(), yVar.getInstanceType()));
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.json.vv) && kotlin.jvm.internal.Intrinsics.areEqual(this.instances, ((com.json.vv) other).instances);
    }

    public int hashCode() {
        return this.instances.hashCode();
    }

    public java.lang.String toString() {
        return "WaterfallInstances(instances=" + this.instances + ')';
    }
}
