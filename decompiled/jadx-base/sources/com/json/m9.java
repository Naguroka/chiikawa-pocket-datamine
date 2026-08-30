package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ironsource/m9;", "Ljava/lang/Runnable;", "", "run", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONObject;", "stringToSend", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class m9 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final org.json.JSONObject stringToSend;

    public m9(org.json.JSONObject stringToSend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringToSend, "stringToSend");
        this.stringToSend = stringToSend;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            java.net.URLConnection uRLConnectionOpenConnection = new java.net.URL(com.json.l9.d().h).openConnection();
            kotlin.jvm.internal.Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT, com.json.zb.L);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(this.stringToSend.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            android.util.Log.i("STATUS", java.lang.String.valueOf(httpURLConnection.getResponseCode()));
            android.util.Log.i("MSG", httpURLConnection.getResponseMessage());
            httpURLConnection.disconnect();
            ironLog.verbose("sent crash report for type " + this.stringToSend.get("crashType") + " and date " + this.stringToSend.get("crashDate"));
        } catch (java.lang.Exception e) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }
}
