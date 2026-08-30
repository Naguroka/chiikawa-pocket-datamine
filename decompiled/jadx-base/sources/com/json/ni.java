package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ironsource/ni;", "", "<init>", "()V", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class ni {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final com.json.ni.Companion INSTANCE = new com.json.ni.Companion(null);

    /* JADX INFO: renamed from: com.ironsource.ni$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/ironsource/ni$a;", "", "Landroid/content/Context;", "context", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/hs;", "c", "Lcom/ironsource/a8;", "d", "", "b", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final org.json.JSONObject a(android.content.Context context) {
            try {
                return new org.json.JSONObject(com.json.mediationsdk.utils.IronSourceUtils.getLastResponse(context));
            } catch (org.json.JSONException unused) {
                return new org.json.JSONObject();
            }
        }

        @kotlin.jvm.JvmStatic
        public final boolean b(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.json.a8 a8VarD = d(context);
            if (a8VarD.d().length() > 0) {
                if (a8VarD.e().length() > 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002a  */
        @kotlin.jvm.JvmStatic
        public final com.json.hs c(android.content.Context context) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.json.a8 a8VarD = d(context);
            if (a8VarD.d().length() > 0) {
                z = a8VarD.e().length() > 0;
            }
            if (!z) {
                a8VarD = null;
            }
            if (a8VarD == null) {
                return null;
            }
            com.json.hs hsVar = new com.json.hs(context, a8VarD.d(), a8VarD.f(), a8VarD.e());
            hsVar.a(com.ironsource.hs.a.CACHE);
            return hsVar;
        }

        @kotlin.jvm.JvmStatic
        public final com.json.a8 d(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            org.json.JSONObject jSONObjectA = a(context);
            java.lang.String cachedAppKey = jSONObjectA.optString("appKey");
            java.lang.String cachedUserId = jSONObjectA.optString("userId");
            java.lang.String cachedSettings = jSONObjectA.optString(com.json.hs.n);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new com.json.a8(cachedAppKey, cachedUserId, cachedSettings);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean a(android.content.Context context) {
        return INSTANCE.b(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.json.hs b(android.content.Context context) {
        return INSTANCE.c(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.json.a8 c(android.content.Context context) {
        return INSTANCE.d(context);
    }
}
