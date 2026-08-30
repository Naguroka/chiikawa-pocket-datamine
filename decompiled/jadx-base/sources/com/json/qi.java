package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ironsource/qi;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "c", "instanceId", "instanceType", "dynamicDemandSourceId", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "I", "f", "()I", "d", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class qi {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String instanceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int instanceType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.lang.String dynamicDemandSourceId;

    public qi() {
        this(null, 0, null, 7, null);
    }

    public qi(java.lang.String instanceId, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.instanceId = instanceId;
        this.instanceType = i;
        this.dynamicDemandSourceId = str;
    }

    public /* synthetic */ qi(java.lang.String str, int i, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ com.json.qi a(com.json.qi qiVar, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = qiVar.instanceId;
        }
        if ((i2 & 2) != 0) {
            i = qiVar.instanceType;
        }
        if ((i2 & 4) != 0) {
            str2 = qiVar.dynamicDemandSourceId;
        }
        return qiVar.a(str, i, str2);
    }

    public final com.json.qi a(java.lang.String instanceId, int instanceType, java.lang.String dynamicDemandSourceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new com.json.qi(instanceId, instanceType, dynamicDemandSourceId);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getInstanceType() {
        return this.instanceType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final java.lang.String getDynamicDemandSourceId() {
        return this.dynamicDemandSourceId;
    }

    public final java.lang.String d() {
        return this.dynamicDemandSourceId;
    }

    public final java.lang.String e() {
        return this.instanceId;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.qi)) {
            return false;
        }
        com.json.qi qiVar = (com.json.qi) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instanceId, qiVar.instanceId) && this.instanceType == qiVar.instanceType && kotlin.jvm.internal.Intrinsics.areEqual(this.dynamicDemandSourceId, qiVar.dynamicDemandSourceId);
    }

    public final int f() {
        return this.instanceType;
    }

    public int hashCode() {
        int iHashCode = ((this.instanceId.hashCode() * 31) + java.lang.Integer.hashCode(this.instanceType)) * 31;
        java.lang.String str = this.dynamicDemandSourceId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "InstanceInformation(instanceId=" + this.instanceId + ", instanceType=" + this.instanceType + ", dynamicDemandSourceId=" + this.dynamicDemandSourceId + ')';
    }
}
