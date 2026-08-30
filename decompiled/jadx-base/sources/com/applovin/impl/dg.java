package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.PriorityBlockingQueue f721a = new java.util.concurrent.PriorityBlockingQueue();
    private final com.applovin.impl.sdk.j b;

    public dg(com.applovin.impl.sdk.j jVar) {
        this.b = jVar;
    }

    public void a(com.applovin.impl.dg.c cVar) {
        if (cVar != null) {
            this.f721a.add(cVar);
            return;
        }
        throw new java.lang.IllegalArgumentException("No request specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends java.lang.Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.concurrent.BlockingQueue f722a;
        private final com.applovin.impl.sdk.j b;

        private b(java.util.concurrent.BlockingQueue blockingQueue, int i, com.applovin.impl.sdk.j jVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new java.lang.IllegalArgumentException("No request queue specified");
            }
            if (jVar != null) {
                this.f722a = blockingQueue;
                this.b = jVar;
                setPriority(((java.lang.Integer) jVar.a(com.applovin.impl.sj.U)).intValue());
                return;
            }
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws java.lang.Throwable {
            android.os.Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(com.applovin.impl.dg.c cVar, com.applovin.impl.dg.d dVar) {
            cVar.g.accept(dVar);
        }

        private java.net.HttpURLConnection a(com.applovin.impl.dg.c cVar) throws java.net.ProtocolException {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(cVar.f723a).openConnection();
            httpURLConnection.setRequestMethod(cVar.b);
            httpURLConnection.setConnectTimeout(cVar.f);
            httpURLConnection.setReadTimeout(cVar.f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.c.isEmpty()) {
                for (java.util.Map.Entry entry : cVar.c.entrySet()) {
                    httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        /* JADX WARN: Code duplicated, block: B:128:0x023d A[Catch: all -> 0x02bf, TRY_LEAVE, TryCatch #11 {all -> 0x02bf, blocks: (B:126:0x0225, B:128:0x023d), top: B:170:0x0225 }] */
        /* JADX WARN: Code duplicated, block: B:143:0x0282  */
        /* JADX WARN: Code duplicated, block: B:166:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:179:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:188:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x00e3 A[Catch: all -> 0x0161, TRY_LEAVE, TryCatch #2 {all -> 0x0161, blocks: (B:57:0x00cb, B:59:0x00e3, B:80:0x0113), top: B:154:0x00cb }] */
        /* JADX WARN: Code duplicated, block: B:82:0x012e  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r4v37 */
        /* JADX WARN: Type inference failed for: r4v38 */
        /* JADX WARN: Type inference failed for: r4v39 */
        /* JADX WARN: Type inference failed for: r4v40 */
        /* JADX WARN: Type inference failed for: r4v41 */
        /* JADX WARN: Type inference failed for: r4v42 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void b(final com.applovin.impl.dg.c cVar) throws java.lang.Throwable {
            java.lang.Throwable th;
            ?? r4;
            java.net.HttpURLConnection httpURLConnectionA;
            java.io.InputStream inputStream;
            long jElapsedRealtime;
            java.io.InputStream errorStream;
            java.io.InputStream inputStream2;
            byte[] bArrA;
            byte[] bArrA2;
            ?? r5;
            ?? r6;
            java.io.InputStream inputStream3;
            java.io.InputStream inputStream4;
            java.lang.Throwable th2;
            byte[] bArrA3;
            java.net.HttpURLConnection httpURLConnectionA2;
            long jElapsedRealtime2;
            byte[] bArrA4;
            byte[] bArr;
            byte[] bArr2;
            java.io.InputStream errorStream2;
            int responseCode = 0;
            if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.z)).booleanValue()) {
                long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                try {
                    httpURLConnectionA2 = a(cVar);
                    try {
                        if (cVar.d != null && cVar.d.length > 0) {
                            httpURLConnectionA2.setDoOutput(true);
                            httpURLConnectionA2.setFixedLengthStreamingMode(cVar.d.length);
                            try {
                                java.io.OutputStream outputStream = httpURLConnectionA2.getOutputStream();
                                try {
                                    outputStream.write(cVar.d);
                                    outputStream.close();
                                } catch (java.lang.Throwable th3) {
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                            throw th3;
                                        } catch (java.lang.Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                    throw th3;
                                }
                            } catch (java.lang.Throwable th5) {
                                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", "outputStream", new java.util.HashMap());
                                this.b.D().a("NetworkCommunicationThread", "processRequest", th5);
                                throw th5;
                            }
                        }
                        jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                        responseCode = httpURLConnectionA2.getResponseCode();
                        jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        if (responseCode > 0) {
                            try {
                                java.io.InputStream inputStream5 = httpURLConnectionA2.getInputStream();
                                try {
                                    bArrA3 = com.applovin.impl.e4.a(inputStream5, this.b);
                                    if (inputStream5 != null) {
                                        try {
                                            inputStream5.close();
                                        } catch (java.lang.Throwable th6) {
                                            th = th6;
                                            try {
                                                java.util.HashMap map = new java.util.HashMap();
                                                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", "responseDataInputStream", map);
                                                this.b.D().a("NetworkCommunicationThread", "processRequest", th, map);
                                                throw th;
                                            } catch (java.lang.Throwable th7) {
                                                th2 = th7;
                                                try {
                                                    jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                                                    this.b.I().a("NetworkCommunicationThread", th2);
                                                    this.b.I();
                                                    if (com.applovin.impl.sdk.n.a()) {
                                                        this.b.I().d("NetworkCommunicationThread", "Failed to make HTTP request", th2);
                                                    }
                                                    if (httpURLConnectionA2 != null) {
                                                        try {
                                                            errorStream2 = httpURLConnectionA2.getErrorStream();
                                                            try {
                                                                bArrA4 = com.applovin.impl.e4.a(errorStream2, this.b);
                                                                if (errorStream2 != null) {
                                                                    try {
                                                                        errorStream2.close();
                                                                    } catch (java.lang.Throwable th8) {
                                                                        th = th8;
                                                                        this.b.I().a("NetworkCommunicationThread", th2);
                                                                        java.util.HashMap map2 = new java.util.HashMap();
                                                                        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", map2);
                                                                        this.b.D().a("NetworkCommunicationThread", "processRequest", th, map2);
                                                                        bArr = bArrA4;
                                                                        bArr2 = bArrA3;
                                                                        com.applovin.impl.yp.a(httpURLConnectionA2, this.b);
                                                                        final com.applovin.impl.dg.d dVarA = com.applovin.impl.dg.d.a().a(responseCode).a(bArr2).b(bArr).a(jElapsedRealtime2 - jElapsedRealtime3).a(th2).a();
                                                                        cVar.h.execute(new java.lang.Runnable() { // from class: com.applovin.impl.dg$b$$ExternalSyntheticLambda0
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                com.applovin.impl.dg.b.a(cVar, dVarA);
                                                                            }
                                                                        });
                                                                        return;
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th9) {
                                                                if (errorStream2 != null) {
                                                                    try {
                                                                        errorStream2.close();
                                                                        throw th9;
                                                                    } catch (java.lang.Throwable th10) {
                                                                        th9.addSuppressed(th10);
                                                                        throw th9;
                                                                    }
                                                                }
                                                                throw th9;
                                                                this.b.I().a("NetworkCommunicationThread", th2);
                                                                java.util.HashMap map3 = new java.util.HashMap();
                                                                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", map3);
                                                                this.b.D().a("NetworkCommunicationThread", "processRequest", th, map3);
                                                                bArr = bArrA4;
                                                                bArr2 = bArrA3;
                                                                com.applovin.impl.yp.a(httpURLConnectionA2, this.b);
                                                                final com.applovin.impl.dg.d dVarA2 = com.applovin.impl.dg.d.a().a(responseCode).a(bArr2).b(bArr).a(jElapsedRealtime2 - jElapsedRealtime3).a(th2).a();
                                                                cVar.h.execute(new java.lang.Runnable() { // from class: com.applovin.impl.dg$b$$ExternalSyntheticLambda0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        com.applovin.impl.dg.b.a(cVar, dVarA2);
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                        } catch (java.lang.Throwable th11) {
                                                            th = th11;
                                                            bArrA4 = null;
                                                        }
                                                        bArr = bArrA4;
                                                        bArr2 = bArrA3;
                                                    } else {
                                                        bArr2 = bArrA3;
                                                        bArr = null;
                                                    }
                                                    com.applovin.impl.yp.a(httpURLConnectionA2, this.b);
                                                    final com.applovin.impl.dg.d dVarA3 = com.applovin.impl.dg.d.a().a(responseCode).a(bArr2).b(bArr).a(jElapsedRealtime2 - jElapsedRealtime3).a(th2).a();
                                                    cVar.h.execute(new java.lang.Runnable() { // from class: com.applovin.impl.dg$b$$ExternalSyntheticLambda0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            com.applovin.impl.dg.b.a(cVar, dVarA3);
                                                        }
                                                    });
                                                    return;
                                                } catch (java.lang.Throwable th12) {
                                                    com.applovin.impl.yp.a(httpURLConnectionA2, this.b);
                                                    throw th12;
                                                }
                                            }
                                        }
                                    }
                                    bArr2 = bArrA3;
                                    bArr = null;
                                    th2 = null;
                                } catch (java.lang.Throwable th13) {
                                    if (inputStream5 != null) {
                                        try {
                                            inputStream5.close();
                                            throw th13;
                                        } catch (java.lang.Throwable th14) {
                                            th13.addSuppressed(th14);
                                            throw th13;
                                        }
                                    }
                                    throw th13;
                                }
                            } catch (java.lang.Throwable th15) {
                                th = th15;
                                bArrA3 = null;
                                java.util.HashMap map4 = new java.util.HashMap();
                                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", "responseDataInputStream", map4);
                                this.b.D().a("NetworkCommunicationThread", "processRequest", th, map4);
                                throw th;
                            }
                        } else {
                            bArr = null;
                            th2 = null;
                            bArr2 = null;
                        }
                    } catch (java.lang.Throwable th16) {
                        th2 = th16;
                        bArrA3 = null;
                        jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        this.b.I().a("NetworkCommunicationThread", th2);
                        this.b.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            this.b.I().d("NetworkCommunicationThread", "Failed to make HTTP request", th2);
                        }
                        if (httpURLConnectionA2 != null) {
                            errorStream2 = httpURLConnectionA2.getErrorStream();
                            bArrA4 = com.applovin.impl.e4.a(errorStream2, this.b);
                            if (errorStream2 != null) {
                                errorStream2.close();
                            }
                            bArr = bArrA4;
                            bArr2 = bArrA3;
                        } else {
                            bArr2 = bArrA3;
                            bArr = null;
                        }
                        com.applovin.impl.yp.a(httpURLConnectionA2, this.b);
                        final com.applovin.impl.dg.d dVarA4 = com.applovin.impl.dg.d.a().a(responseCode).a(bArr2).b(bArr).a(jElapsedRealtime2 - jElapsedRealtime3).a(th2).a();
                        cVar.h.execute(new java.lang.Runnable() { // from class: com.applovin.impl.dg$b$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.applovin.impl.dg.b.a(cVar, dVarA4);
                            }
                        });
                        return;
                    }
                } catch (java.lang.Throwable th17) {
                    th2 = th17;
                    bArrA3 = null;
                    httpURLConnectionA2 = null;
                }
                com.applovin.impl.yp.a(httpURLConnectionA2, this.b);
                final com.applovin.impl.dg.d dVarA5 = com.applovin.impl.dg.d.a().a(responseCode).a(bArr2).b(bArr).a(jElapsedRealtime2 - jElapsedRealtime3).a(th2).a();
                cVar.h.execute(new java.lang.Runnable() { // from class: com.applovin.impl.dg$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.applovin.impl.dg.b.a(cVar, dVarA5);
                    }
                });
                return;
            }
            long jElapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
            try {
                httpURLConnectionA = a(cVar);
                try {
                    if (cVar.d != null && cVar.d.length > 0) {
                        httpURLConnectionA.setDoOutput(true);
                        httpURLConnectionA.setFixedLengthStreamingMode(cVar.d.length);
                        if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.A)).booleanValue()) {
                            try {
                                java.io.OutputStream outputStream2 = httpURLConnectionA.getOutputStream();
                                outputStream2.write(cVar.d);
                                outputStream2.close();
                            } catch (java.lang.Throwable th18) {
                                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", "outputStream", new java.util.HashMap());
                                this.b.D().a("NetworkCommunicationThread", "processRequest", th18);
                                throw th18;
                            }
                        } else {
                            java.io.OutputStream outputStream3 = httpURLConnectionA.getOutputStream();
                            outputStream3.write(cVar.d);
                            outputStream3.close();
                        }
                    }
                    jElapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                    responseCode = httpURLConnectionA.getResponseCode();
                    jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    if (responseCode > 0) {
                        com.applovin.impl.sdk.j jVar = this.b;
                        com.applovin.impl.sj sjVar = com.applovin.impl.sj.A;
                        try {
                            if (((java.lang.Boolean) jVar.a(sjVar)).booleanValue()) {
                                try {
                                    java.io.InputStream inputStream6 = httpURLConnectionA.getInputStream();
                                    try {
                                        bArrA = com.applovin.impl.e4.a(inputStream6, this.b);
                                        inputStream4 = inputStream6;
                                    } catch (java.lang.Throwable th19) {
                                        th = th19;
                                        java.util.HashMap map5 = new java.util.HashMap();
                                        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", "responseDataInputStream", map5);
                                        this.b.D().a("NetworkCommunicationThread", "processRequest", th, map5);
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th20) {
                                    th = th20;
                                }
                            } else {
                                java.io.InputStream inputStream7 = httpURLConnectionA.getInputStream();
                                bArrA = com.applovin.impl.e4.a(inputStream7, this.b);
                                inputStream4 = inputStream7;
                            }
                            bArrA2 = null;
                            inputStream3 = inputStream4;
                        } catch (java.lang.Throwable th21) {
                            th = th21;
                            r4 = sjVar;
                            try {
                                jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                this.b.I().a("NetworkCommunicationThread", th);
                                this.b.I();
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.b.I().d("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                }
                                if (httpURLConnectionA != null) {
                                    try {
                                        errorStream = httpURLConnectionA.getErrorStream();
                                        try {
                                            bArrA2 = com.applovin.impl.e4.a(errorStream, this.b);
                                            inputStream2 = errorStream;
                                            bArrA = null;
                                            r5 = r4;
                                        } catch (java.lang.Throwable th22) {
                                            th = th22;
                                            try {
                                                if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.A)).booleanValue()) {
                                                    java.util.HashMap map6 = new java.util.HashMap();
                                                    com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", map6);
                                                    this.b.D().a("NetworkCommunicationThread", "processRequest", th, map6);
                                                }
                                                inputStream2 = errorStream;
                                                bArrA = null;
                                                bArrA2 = null;
                                                r5 = r4;
                                            } catch (java.lang.Throwable th23) {
                                                th = th23;
                                                inputStream = errorStream;
                                                com.applovin.impl.yp.a((java.io.Closeable) r4, this.b);
                                                com.applovin.impl.yp.a(inputStream, this.b);
                                                com.applovin.impl.yp.a(httpURLConnectionA, this.b);
                                                throw th;
                                            }
                                        }
                                    } catch (java.lang.Throwable th24) {
                                        th = th24;
                                        errorStream = null;
                                    }
                                } else {
                                    bArrA = null;
                                    bArrA2 = null;
                                    r6 = r4;
                                }
                                com.applovin.impl.yp.a((java.io.Closeable) r5, this.b);
                                com.applovin.impl.yp.a(inputStream2, this.b);
                                com.applovin.impl.yp.a(httpURLConnectionA, this.b);
                                final com.applovin.impl.dg.d dVarA6 = com.applovin.impl.dg.d.a().a(responseCode).a(bArrA).b(bArrA2).a(jElapsedRealtime - jElapsedRealtime4).a(th).a();
                                cVar.h.execute(new java.lang.Runnable() { // from class: com.applovin.impl.dg$b$$ExternalSyntheticLambda1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.applovin.impl.dg.b.b(cVar, dVarA6);
                                    }
                                });
                            } catch (java.lang.Throwable th25) {
                                th = th25;
                                inputStream = null;
                            }
                        }
                    } else {
                        bArrA = null;
                        bArrA2 = null;
                        inputStream3 = null;
                    }
                    th = null;
                    r6 = inputStream3;
                } catch (java.lang.Throwable th26) {
                    th = th26;
                    r4 = 0;
                    jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    this.b.I().a("NetworkCommunicationThread", th);
                    this.b.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.b.I().d("NetworkCommunicationThread", "Failed to make HTTP request", th);
                    }
                    if (httpURLConnectionA != null) {
                        errorStream = httpURLConnectionA.getErrorStream();
                        bArrA2 = com.applovin.impl.e4.a(errorStream, this.b);
                        inputStream2 = errorStream;
                        bArrA = null;
                        r5 = r4;
                    } else {
                        bArrA = null;
                        bArrA2 = null;
                        r6 = r4;
                        inputStream2 = null;
                        r5 = r6;
                    }
                    com.applovin.impl.yp.a((java.io.Closeable) r5, this.b);
                    com.applovin.impl.yp.a(inputStream2, this.b);
                    com.applovin.impl.yp.a(httpURLConnectionA, this.b);
                    final com.applovin.impl.dg.d dVarA7 = com.applovin.impl.dg.d.a().a(responseCode).a(bArrA).b(bArrA2).a(jElapsedRealtime - jElapsedRealtime4).a(th).a();
                    cVar.h.execute(new java.lang.Runnable() { // from class: com.applovin.impl.dg$b$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.applovin.impl.dg.b.b(cVar, dVarA7);
                        }
                    });
                }
            } catch (java.lang.Throwable th27) {
                th = th27;
                r4 = 0;
                httpURLConnectionA = null;
            }
            inputStream2 = null;
            r5 = r6;
            com.applovin.impl.yp.a((java.io.Closeable) r5, this.b);
            com.applovin.impl.yp.a(inputStream2, this.b);
            com.applovin.impl.yp.a(httpURLConnectionA, this.b);
            final com.applovin.impl.dg.d dVarA8 = com.applovin.impl.dg.d.a().a(responseCode).a(bArrA).b(bArrA2).a(jElapsedRealtime - jElapsedRealtime4).a(th).a();
            cVar.h.execute(new java.lang.Runnable() { // from class: com.applovin.impl.dg$b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.dg.b.b(cVar, dVarA8);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(com.applovin.impl.dg.c cVar, com.applovin.impl.dg.d dVar) {
            cVar.g.accept(dVar);
        }

        private void a() throws java.lang.Throwable {
            b((com.applovin.impl.dg.c) this.f722a.take());
        }
    }

    public void a() {
        for (int i = 0; i < ((java.lang.Integer) this.b.a(com.applovin.impl.sj.T)).intValue(); i++) {
            new com.applovin.impl.dg.b(this.f721a, i, this.b).start();
        }
    }

    public static class c implements java.lang.Comparable {
        private static final java.util.concurrent.atomic.AtomicInteger j = new java.util.concurrent.atomic.AtomicInteger();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f723a;
        private final java.lang.String b;
        private final java.util.Map c;
        private final byte[] d;
        private final int f;
        private final androidx.core.util.Consumer g;
        private final java.util.concurrent.Executor h;
        private final int i;

        private c(com.applovin.impl.dg.c.a aVar) {
            this.f723a = aVar.f724a;
            this.b = aVar.b;
            this.c = aVar.c != null ? aVar.c : java.util.Collections.emptyMap();
            this.d = aVar.d;
            this.f = aVar.e;
            this.g = aVar.f;
            this.h = aVar.g;
            this.i = j.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(com.applovin.impl.dg.c cVar) {
            return this.i - cVar.i;
        }

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private java.lang.String f724a;
            private java.lang.String b;
            private java.util.Map c = new java.util.HashMap();
            private byte[] d;
            private int e;
            private androidx.core.util.Consumer f;
            private java.util.concurrent.Executor g;

            public com.applovin.impl.dg.c.a b(java.lang.String str) {
                this.b = str;
                return this;
            }

            public com.applovin.impl.dg.c.a a(byte[] bArr) {
                this.d = bArr;
                return this;
            }

            public com.applovin.impl.dg.c.a a(java.lang.String str) {
                this.f724a = str;
                return this;
            }

            public com.applovin.impl.dg.c.a a(java.lang.String str, java.lang.String str2) {
                this.c.put(str, str2);
                return this;
            }

            public com.applovin.impl.dg.c.a a(java.util.Map map) {
                if (map == null) {
                    map = new java.util.HashMap();
                }
                this.c = map;
                return this;
            }

            public com.applovin.impl.dg.c.a a(androidx.core.util.Consumer consumer) {
                this.f = consumer;
                return this;
            }

            public com.applovin.impl.dg.c.a a(java.util.concurrent.Executor executor) {
                this.g = executor;
                return this;
            }

            public com.applovin.impl.dg.c.a a(int i) {
                this.e = i;
                return this;
            }

            public com.applovin.impl.dg.c a() {
                return new com.applovin.impl.dg.c(this);
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f725a;
        private final byte[] b;
        private final byte[] c;
        private final long d;
        private final java.lang.Throwable e;

        public static com.applovin.impl.dg.d.a a() {
            return new com.applovin.impl.dg.d.a();
        }

        private d(com.applovin.impl.dg.d.a aVar) {
            this.f725a = aVar.f726a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }

        public int c() throws java.lang.Throwable {
            java.lang.Throwable th = this.e;
            if (th == null) {
                return this.f725a;
            }
            throw th;
        }

        public int b() {
            return this.f725a;
        }

        public byte[] d() throws java.lang.Throwable {
            java.lang.Throwable th = this.e;
            if (th == null) {
                return this.b;
            }
            throw th;
        }

        public byte[] f() {
            return this.c;
        }

        public long e() {
            return this.d;
        }

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f726a;
            private byte[] b;
            private byte[] c;
            private long d;
            private java.lang.Throwable e;

            public com.applovin.impl.dg.d.a a(int i) {
                this.f726a = i;
                return this;
            }

            public com.applovin.impl.dg.d.a b(byte[] bArr) {
                this.c = bArr;
                return this;
            }

            public com.applovin.impl.dg.d.a a(byte[] bArr) {
                this.b = bArr;
                return this;
            }

            public com.applovin.impl.dg.d.a a(long j) {
                this.d = j;
                return this;
            }

            public com.applovin.impl.dg.d.a a(java.lang.Throwable th) {
                this.e = th;
                return this;
            }

            public com.applovin.impl.dg.d a() {
                return new com.applovin.impl.dg.d(this);
            }
        }
    }
}
