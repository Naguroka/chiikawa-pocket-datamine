package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/ironsource/f8;", "", "Lcom/ironsource/k8;", "cappingType", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class f8 {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2650a;

        static {
            int[] iArr = new int[com.json.k8.values().length];
            try {
                iArr[com.json.k8.Pacing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.json.k8.ShowCount.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.json.k8.Delivery.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f2650a = iArr;
        }
    }

    public final int a(com.json.k8 cappingType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        int i = com.ironsource.f8.a.f2650a[cappingType.ordinal()];
        if (i == 1 || i == 2) {
            return 3000;
        }
        if (i == 3) {
            return 3001;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
