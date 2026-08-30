package com.adjust.sdk.network;

/* JADX INFO: loaded from: classes3.dex */
public class UtilNetworking {

    public interface IConnectionOptions {
        void applyConnectionOptions(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.lang.String str);
    }

    public interface IHttpsURLConnectionProvider {
        javax.net.ssl.HttpsURLConnection generateHttpsURLConnection(java.net.URL url);
    }

    public class a implements com.adjust.sdk.network.UtilNetworking.IConnectionOptions {
        @Override // com.adjust.sdk.network.UtilNetworking.IConnectionOptions
        public final void applyConnectionOptions(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.lang.String str) {
            httpsURLConnection.setRequestProperty("Client-SDK", str);
            httpsURLConnection.setConnectTimeout(60000);
            httpsURLConnection.setReadTimeout(60000);
        }
    }

    public class b implements com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider {
        @Override // com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider
        public final javax.net.ssl.HttpsURLConnection generateHttpsURLConnection(java.net.URL url) {
            return (javax.net.ssl.HttpsURLConnection) url.openConnection();
        }
    }

    public static com.adjust.sdk.network.UtilNetworking.IConnectionOptions createDefaultConnectionOptions() {
        return new com.adjust.sdk.network.UtilNetworking.a();
    }

    public static com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider createDefaultHttpsURLConnectionProvider() {
        return new com.adjust.sdk.network.UtilNetworking.b();
    }

    public static int extractJsonInt(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof java.lang.Integer) {
            return ((java.lang.Integer) objOpt).intValue();
        }
        return -1;
    }

    public static java.lang.Long extractJsonLong(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof java.lang.Long) {
            return (java.lang.Long) objOpt;
        }
        if (objOpt instanceof java.lang.Number) {
            return java.lang.Long.valueOf(((java.lang.Number) objOpt).longValue());
        }
        if (!(objOpt instanceof java.lang.String)) {
            return null;
        }
        try {
            return java.lang.Long.valueOf((long) java.lang.Double.parseDouble((java.lang.String) objOpt));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static java.lang.String extractJsonString(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof java.lang.String) {
            return (java.lang.String) objOpt;
        }
        if (objOpt != null) {
            return objOpt.toString();
        }
        return null;
    }

    private static com.adjust.sdk.ILogger getLogger() {
        return com.adjust.sdk.AdjustFactory.getLogger();
    }
}
