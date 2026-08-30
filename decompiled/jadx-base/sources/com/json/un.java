package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/ironsource/un;", "Lcom/ironsource/up;", "", "value", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "networkInstanceId", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class un implements com.json.up {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String networkInstanceId;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ironsource/un$a;", "", "", "b", "Ljava/lang/String;", "IRON_SOURCE", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.un.a f3475a = new com.ironsource.un.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final java.lang.String IRON_SOURCE = "IronSource";

        private a() {
        }
    }

    public un(java.lang.String networkInstanceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.networkInstanceId = networkInstanceId;
    }

    @Override // com.json.up
    public java.lang.String value() {
        if (this.networkInstanceId.length() == 0) {
            return "";
        }
        return (kotlin.jvm.internal.Intrinsics.areEqual(this.networkInstanceId, "0") || kotlin.jvm.internal.Intrinsics.areEqual(this.networkInstanceId, "IronSource")) ? "IronSource" : "IronSource_" + this.networkInstanceId;
    }
}
