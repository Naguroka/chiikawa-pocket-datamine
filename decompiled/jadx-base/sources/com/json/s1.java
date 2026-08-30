package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J/\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/ironsource/s1;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "b", "Lcom/ironsource/lk;", "c", "userId", "providerList", "publisherDataHolder", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/ironsource/lk;", "e", "()Lcom/ironsource/lk;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/lk;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.List<com.json.mediationsdk.model.NetworkSettings> providerList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.lk publisherDataHolder;

    /* JADX WARN: Multi-variable type inference failed */
    public s1(java.lang.String str, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> providerList, com.json.lk publisherDataHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerList, "providerList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.userId = str;
        this.providerList = providerList;
        this.publisherDataHolder = publisherDataHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.json.s1 a(com.json.s1 s1Var, java.lang.String str, java.util.List list, com.json.lk lkVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = s1Var.userId;
        }
        if ((i & 2) != 0) {
            list = s1Var.providerList;
        }
        if ((i & 4) != 0) {
            lkVar = s1Var.publisherDataHolder;
        }
        return s1Var.a(str, list, lkVar);
    }

    public final com.json.s1 a(java.lang.String userId, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> providerList, com.json.lk publisherDataHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerList, "providerList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new com.json.s1(userId, providerList, publisherDataHolder);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getUserId() {
        return this.userId;
    }

    public final java.util.List<com.json.mediationsdk.model.NetworkSettings> b() {
        return this.providerList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.lk getPublisherDataHolder() {
        return this.publisherDataHolder;
    }

    public final java.util.List<com.json.mediationsdk.model.NetworkSettings> d() {
        return this.providerList;
    }

    public final com.json.lk e() {
        return this.publisherDataHolder;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.s1)) {
            return false;
        }
        com.json.s1 s1Var = (com.json.s1) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userId, s1Var.userId) && kotlin.jvm.internal.Intrinsics.areEqual(this.providerList, s1Var.providerList) && kotlin.jvm.internal.Intrinsics.areEqual(this.publisherDataHolder, s1Var.publisherDataHolder);
    }

    public final java.lang.String f() {
        return this.userId;
    }

    public int hashCode() {
        java.lang.String str = this.userId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.providerList.hashCode()) * 31) + this.publisherDataHolder.hashCode();
    }

    public java.lang.String toString() {
        return "AdUnitCommonData(userId=" + this.userId + ", providerList=" + this.providerList + ", publisherDataHolder=" + this.publisherDataHolder + ')';
    }
}
