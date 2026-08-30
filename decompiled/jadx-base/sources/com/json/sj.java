package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class sj {

    class a extends java.util.zip.GZIPOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3410a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.io.OutputStream outputStream, int i) throws java.io.IOException {
            super(outputStream);
            this.f3410a = i;
            if (i < 0 || i > 9) {
                return;
            }
            ((java.util.zip.GZIPOutputStream) this).def.setLevel(i);
        }
    }

    public static java.lang.String a(byte[] bArr) {
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(gZIPInputStream, com.adjust.sdk.Constants.ENCODING));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
                sb.append(line);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception while decompressing " + e);
            return null;
        } catch (java.lang.OutOfMemoryError e2) {
            com.json.l9.d().a(e2);
            java.lang.String str = "Error while decompressing:" + e2.getMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
            b(str);
            return null;
        }
    }

    public static byte[] a(java.lang.String str) throws java.lang.Exception {
        return a(str, -1);
    }

    public static byte[] a(java.lang.String str, int i) throws java.lang.Exception {
        byte[] byteArray = new byte[0];
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(str.length());
            com.ironsource.sj.a aVar = new com.ironsource.sj.a(byteArrayOutputStream, i);
            aVar.write(str.getBytes());
            aVar.close();
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.OutOfMemoryError e) {
            com.json.l9.d().a(e);
            java.lang.String str2 = "Error while compressing:" + e.getMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(str2);
            b(str2);
            return byteArray;
        }
    }

    private static void b(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.json.wq.i().a(new com.json.wb(81321, jSONObject));
    }
}
