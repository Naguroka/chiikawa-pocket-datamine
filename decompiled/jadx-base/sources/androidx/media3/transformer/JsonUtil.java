package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonUtil {
    private JsonUtil() {
    }

    public static org.json.JSONObject getDeviceDetailsAsJsonObject() throws org.json.JSONException {
        return new org.json.JSONObject().put("manufacturer", android.os.Build.MANUFACTURER).put(com.json.ce.v, android.os.Build.MODEL).put("sdkVersion", android.os.Build.VERSION.SDK_INT).put("fingerprint", android.os.Build.FINGERPRINT);
    }

    public static org.json.JSONArray processedInputsAsJsonArray(com.google.common.collect.ImmutableList<androidx.media3.transformer.ExportResult.ProcessedInput> immutableList) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        com.google.common.collect.UnmodifiableIterator<androidx.media3.transformer.ExportResult.ProcessedInput> it = immutableList.iterator();
        while (it.hasNext()) {
            androidx.media3.transformer.ExportResult.ProcessedInput next = it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = next.mediaItem.localConfiguration;
            if (localConfiguration != null) {
                jSONObject.put("mediaItemUri", localConfiguration.uri);
            }
            jSONObject.putOpt("audioDecoderName", next.audioDecoderName);
            jSONObject.putOpt("videoDecoderName", next.videoDecoderName);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static org.json.JSONObject exceptionAsJsonObject(java.lang.Exception exc) throws org.json.JSONException {
        if (exc == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, exc.getMessage());
        jSONObject.put("type", exc.getClass());
        if (exc instanceof androidx.media3.transformer.ExportException) {
            jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, ((androidx.media3.transformer.ExportException) exc).errorCode);
        }
        jSONObject.put("stackTrace", androidx.media3.common.util.Log.getThrowableString(exc));
        return jSONObject;
    }

    public static org.json.JSONObject exportResultAsJsonObject(androidx.media3.transformer.ExportResult exportResult) throws org.json.JSONException {
        org.json.JSONObject jSONObjectPutOpt = new org.json.JSONObject().putOpt("audioEncoderName", exportResult.audioEncoderName).putOpt("colorInfo", exportResult.colorInfo).putOpt("videoEncoderName", exportResult.videoEncoderName).putOpt("testException", exceptionAsJsonObject(exportResult.exportException));
        if (!exportResult.processedInputs.isEmpty()) {
            jSONObjectPutOpt.put("processedInputs", processedInputsAsJsonArray(exportResult.processedInputs));
        }
        if (exportResult.averageAudioBitrate != -2147483647) {
            jSONObjectPutOpt.put("averageAudioBitrate", exportResult.averageAudioBitrate);
        }
        if (exportResult.averageVideoBitrate != -2147483647) {
            jSONObjectPutOpt.put("averageVideoBitrate", exportResult.averageVideoBitrate);
        }
        if (exportResult.channelCount != -1) {
            jSONObjectPutOpt.put("channelCount", exportResult.channelCount);
        }
        if (exportResult.durationMs != androidx.media3.common.C.TIME_UNSET) {
            jSONObjectPutOpt.put("durationMs", exportResult.durationMs);
        }
        if (exportResult.fileSizeBytes != -1) {
            jSONObjectPutOpt.put("fileSizeBytes", exportResult.fileSizeBytes);
        }
        if (exportResult.height != -1) {
            jSONObjectPutOpt.put("height", exportResult.height);
        }
        if (exportResult.sampleRate != -2147483647) {
            jSONObjectPutOpt.put("sampleRate", exportResult.sampleRate);
        }
        if (exportResult.videoFrameCount > 0) {
            jSONObjectPutOpt.put("videoFrameCount", exportResult.videoFrameCount);
        }
        if (exportResult.width != -1) {
            jSONObjectPutOpt.put("width", exportResult.width);
        }
        return jSONObjectPutOpt;
    }
}
