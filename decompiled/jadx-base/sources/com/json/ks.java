package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/ks;", "", "Lcom/ironsource/xe;", "applicationLifecycleService", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/wc;", "Lcom/ironsource/wc;", "calculator", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ks {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.json.wc calculator;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ironsource/ks$a;", "Lcom/ironsource/js;", "", "run", "<init>", "(Lcom/ironsource/ks;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    private final class a extends com.json.js {
        public a() {
        }

        @Override // com.json.js, java.lang.Runnable
        public void run() {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put("duration", getTimeInForeground());
            } catch (org.json.JSONException e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            com.json.ep.P.a(new com.json.wb(44, mediationAdditionalData));
        }
    }

    public final void a(com.json.xe applicationLifecycleService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        this.calculator = new com.json.wc(applicationLifecycleService, new com.ironsource.ks.a());
    }
}
