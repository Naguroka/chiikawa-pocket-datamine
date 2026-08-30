package com.apm.insight.b;

/* JADX INFO: compiled from: LooperUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.os.MessageQueue f380a;
    private static java.lang.reflect.Field b;
    private static java.lang.reflect.Field c;

    public static android.os.MessageQueue a() {
        if (f380a == null && android.os.Looper.getMainLooper() != null) {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper == android.os.Looper.myLooper()) {
                f380a = android.os.Looper.myQueue();
            } else {
                f380a = mainLooper.getQueue();
            }
        }
        return f380a;
    }

    public static android.os.Message a(android.os.MessageQueue messageQueue) {
        java.lang.reflect.Field field = b;
        if (field == null) {
            try {
                java.lang.reflect.Field declaredField = java.lang.Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                b = declaredField;
                declaredField.setAccessible(true);
                return (android.os.Message) b.get(messageQueue);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        try {
            return (android.os.Message) field.get(messageQueue);
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    private static android.os.Message a(android.os.Message message) {
        java.lang.reflect.Field field = c;
        if (field == null) {
            try {
                java.lang.reflect.Field declaredField = java.lang.Class.forName("android.os.Message").getDeclaredField("next");
                c = declaredField;
                declaredField.setAccessible(true);
                return (android.os.Message) c.get(message);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        try {
            return (android.os.Message) field.get(message);
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    private static org.json.JSONObject a(android.os.Message message, long j) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", java.lang.String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, java.lang.String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static org.json.JSONArray a(long j) {
        android.os.MessageQueue messageQueueA = a();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (messageQueueA == null) {
            return jSONArray;
        }
        try {
            synchronized (messageQueueA) {
                android.os.Message messageA = a(messageQueueA);
                if (messageA == null) {
                    return jSONArray;
                }
                int i = 0;
                int i2 = 0;
                while (messageA != null && i < 100) {
                    i++;
                    i2++;
                    org.json.JSONObject jSONObjectA = a(messageA, j);
                    try {
                        jSONObjectA.put("id", i2);
                    } catch (org.json.JSONException unused) {
                    }
                    jSONArray.put(jSONObjectA);
                    messageA = a(messageA);
                }
                return jSONArray;
            }
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            return jSONArray;
        }
    }
}
