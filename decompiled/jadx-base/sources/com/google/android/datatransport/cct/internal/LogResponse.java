package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LogResponse {
    private static final java.lang.String LOG_TAG = "LogResponseInternal";

    public abstract long getNextRequestWaitMillis();

    static com.google.android.datatransport.cct.internal.LogResponse create(long j) {
        return new com.google.android.datatransport.cct.internal.AutoValue_LogResponse(j);
    }

    public static com.google.android.datatransport.cct.internal.LogResponse fromJson(java.io.Reader reader) throws java.io.IOException {
        android.util.JsonReader jsonReader = new android.util.JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == android.util.JsonToken.STRING) {
                        com.google.android.datatransport.cct.internal.LogResponse logResponseCreate = create(java.lang.Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return logResponseCreate;
                    }
                    com.google.android.datatransport.cct.internal.LogResponse logResponseCreate2 = create(jsonReader.nextLong());
                    jsonReader.close();
                    return logResponseCreate2;
                }
                jsonReader.skipValue();
            }
            throw new java.io.IOException("Response is missing nextRequestWaitMillis field.");
        } catch (java.lang.Throwable th) {
            jsonReader.close();
            throw th;
        }
    }
}
