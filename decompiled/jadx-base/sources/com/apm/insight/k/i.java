package com.apm.insight.k;

/* JADX INFO: compiled from: MultipartUtility.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f436a;
    private java.net.HttpURLConnection b;
    private java.lang.String c;
    private boolean d;
    private com.apm.insight.k.f e;
    private com.apm.insight.k.k f;

    public i(java.lang.String str, java.lang.String str2, boolean z) throws java.io.IOException {
        this.c = str2;
        this.d = z;
        java.lang.String str3 = "AAA" + java.lang.System.currentTimeMillis() + "AAA";
        this.f436a = str3;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        this.b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.b.setDoOutput(true);
        this.b.setDoInput(true);
        this.b.setRequestMethod("POST");
        this.b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (z) {
            this.b.setRequestProperty(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "gzip");
            this.f = new com.apm.insight.k.k(this.b.getOutputStream());
        } else {
            this.e = new com.apm.insight.k.f(this.b.getOutputStream());
        }
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        b(str, str2);
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("--");
        sb.append(this.f436a).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"\r\nContent-Type: text/plain; charset=").append(this.c).append("\r\n\r\n");
        try {
            if (this.d) {
                this.f.write(sb.toString().getBytes());
            } else {
                this.e.write(sb.toString().getBytes());
            }
        } catch (java.io.IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.d) {
                this.f.write(bytes);
                this.f.write("\r\n".getBytes());
            } else {
                this.e.write(bytes);
                this.e.write("\r\n".getBytes());
            }
        } catch (java.io.IOException unused2) {
        }
    }

    public final void a(java.lang.String str, java.io.File... fileArr) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("--");
        sb.append(this.f436a).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"; filename=\"").append(str).append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.d) {
            this.f.write(sb.toString().getBytes());
        } else {
            this.e.write(sb.toString().getBytes());
        }
        if (this.d) {
            com.apm.insight.l.f.a(this.f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.e, fileArr);
        }
        if (this.d) {
            this.f.write("\r\n".getBytes());
        } else {
            this.e.write("\r\n".getBytes());
            this.e.flush();
        }
    }

    public final void a(java.lang.String str, java.io.File file, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException {
        java.lang.String name = file.getName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("--");
        sb.append(this.f436a).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"; filename=\"").append(name).append("\"");
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            sb.append("; ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.d) {
            this.f.write(sb.toString().getBytes());
        } else {
            this.e.write(sb.toString().getBytes());
        }
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                break;
            } else if (this.d) {
                this.f.write(bArr, 0, i);
            } else {
                this.e.write(bArr, 0, i);
            }
        }
        fileInputStream.close();
        if (this.d) {
            this.f.write("\r\n".getBytes());
        } else {
            this.e.write("\r\n".getBytes());
            this.e.flush();
        }
    }

    public final java.lang.String a() throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bytes = ("\r\n--" + this.f436a + "--\r\n").getBytes();
        if (this.d) {
            this.f.write(bytes);
            this.f.b();
            this.f.a();
        } else {
            this.e.write(bytes);
            this.e.flush();
            this.e.a();
        }
        int responseCode = this.b.getResponseCode();
        if (responseCode == 200) {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(this.b.getInputStream()));
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.b.disconnect();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((java.lang.String) it.next());
            }
            return sb.toString();
        }
        throw new java.io.IOException("Server returned non-OK status: ".concat(java.lang.String.valueOf(responseCode)));
    }
}
