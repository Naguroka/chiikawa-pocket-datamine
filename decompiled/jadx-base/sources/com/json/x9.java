package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/ironsource/x9;", "Lcom/ironsource/hf;", "Landroid/content/Context;", "context", "Lcom/ironsource/t9;", "source", "Lcom/ironsource/z9;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class x9 implements com.json.hf {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3553a;

        static {
            int[] iArr = new int[com.json.t9.values().length];
            try {
                iArr[com.json.t9.IADS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.json.t9.UADS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.json.t9.SHARED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.json.t9.NONE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f3553a = iArr;
        }
    }

    @Override // com.json.hf
    public com.json.z9 a(android.content.Context context, com.json.t9 source) {
        com.json.w9 w9Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        int i = com.ironsource.x9.a.f3553a[source.ordinal()];
        if (i == 1) {
            w9Var = new com.json.w9(context, "supersonic_shared_preferen");
        } else if (i == 2) {
            w9Var = new com.json.w9(context, "unityads-installinfo");
        } else {
            if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            w9Var = new com.json.w9(context, com.json.y9.c);
        }
        return w9Var;
    }
}
