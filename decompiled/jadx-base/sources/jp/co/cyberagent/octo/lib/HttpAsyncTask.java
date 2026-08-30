package jp.co.cyberagent.octo.lib;

/* JADX INFO: loaded from: classes6.dex */
public class HttpAsyncTask implements okhttp3.Callback {
    public static final okhttp3.OkHttpClient j;
    public static final jp.co.cyberagent.octo.lib.BufferPool k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3957a;
    public final java.lang.String b;
    public final android.os.Looper c;
    public final jp.co.cyberagent.octo.lib.IHttpCallback d;
    public boolean e;
    public final jp.co.cyberagent.octo.lib.HttpResult f = new jp.co.cyberagent.octo.lib.HttpResult();
    public okhttp3.Call g;
    public java.io.FileOutputStream h;
    public java.nio.channels.FileChannel i;

    static {
        okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        okhttp3.OkHttpClient okHttpClientBuild = builder.connectTimeout(10000L, timeUnit).readTimeout(10000L, timeUnit).build();
        j = okHttpClientBuild;
        k = new jp.co.cyberagent.octo.lib.BufferPool(androidx.work.Data.MAX_DATA_BYTES);
        int iAvailableProcessors = (java.lang.Runtime.getRuntime().availableProcessors() * 2) + 2;
        okHttpClientBuild.dispatcher().setMaxRequests(iAvailableProcessors);
        okHttpClientBuild.dispatcher().setMaxRequestsPerHost(iAvailableProcessors);
    }

    public HttpAsyncTask(java.lang.String str, java.lang.String str2, android.os.Looper looper, jp.co.cyberagent.octo.lib.IHttpCallback iHttpCallback) {
        this.f3957a = str;
        this.b = str2;
        this.c = looper;
        this.d = iHttpCallback;
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        jp.co.cyberagent.octo.lib.IHttpCallback iHttpCallback = this.d;
        if (iHttpCallback != null) {
            iHttpCallback.onComplete(this, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        jp.co.cyberagent.octo.lib.IHttpCallback iHttpCallback = this.d;
        if (iHttpCallback != null) {
            iHttpCallback.onProgress(this.f.writtenLength);
        }
    }

    public final void a() {
        this.f.isComplete = true;
        new android.os.Handler(this.c).post(new java.lang.Runnable() { // from class: jp.co.cyberagent.octo.lib.HttpAsyncTask$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

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
    public final void a(java.io.InputStream inputStream, java.nio.channels.FileChannel fileChannel) throws java.lang.Throwable {
        java.nio.ByteBuffer byteBuffer;
        int i;
        java.nio.channels.ReadableByteChannel readableByteChannel = null;
        byteBufferBorrow = null;
        java.nio.ByteBuffer byteBufferBorrow = null;
        readableByteChannel = null;
        try {
            java.nio.channels.ReadableByteChannel readableByteChannelNewChannel = java.nio.channels.Channels.newChannel(inputStream);
            try {
                try {
                    byteBufferBorrow = k.Borrow();
                    while (!this.e) {
                        try {
                            i = readableByteChannelNewChannel.read(byteBufferBorrow);
                        } catch (java.io.IOException e) {
                            this.f.b(e);
                            i = 0;
                        }
                        if (i <= 0) {
                            break;
                        }
                        try {
                            byteBufferBorrow.flip();
                            fileChannel.write(byteBufferBorrow);
                            this.f.writtenLength += (long) i;
                            byteBufferBorrow.clear();
                            d();
                        } catch (java.io.IOException e2) {
                            this.f.a(e2);
                        }
                    }
                    k.Return(byteBufferBorrow);
                    a(readableByteChannelNewChannel);
                } catch (java.io.IOException e3) {
                    e = e3;
                    java.nio.ByteBuffer byteBuffer2 = byteBufferBorrow;
                    readableByteChannel = readableByteChannelNewChannel;
                    byteBuffer = byteBuffer2;
                    try {
                        this.f.b(e);
                        k.Return(byteBuffer);
                        a(readableByteChannel);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        k.Return(byteBuffer);
                        a(readableByteChannel);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                java.nio.ByteBuffer byteBuffer3 = byteBufferBorrow;
                readableByteChannel = readableByteChannelNewChannel;
                byteBuffer = byteBuffer3;
                k.Return(byteBuffer);
                a(readableByteChannel);
                throw th;
            }
        } catch (java.io.IOException e4) {
            e = e4;
            byteBuffer = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            byteBuffer = null;
        }
    }

    public void abort() {
        this.e = true;
        okhttp3.Call call = this.g;
        if (call != null) {
            call.cancel();
        }
        jp.co.cyberagent.octo.lib.HttpResult httpResult = this.f;
        httpResult.errorCode = "octo.network.cancel";
        httpResult.errorMessage = "Connection is aborted by user";
        httpResult.isIoError = false;
        httpResult.isComplete = true;
    }

    public final void d() {
        new android.os.Handler(this.c).post(new java.lang.Runnable() { // from class: jp.co.cyberagent.octo.lib.HttpAsyncTask$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        });
    }

    public jp.co.cyberagent.octo.lib.HttpResult getResult() {
        return this.f;
    }

    @Override // okhttp3.Callback
    public void onFailure(okhttp3.Call call, java.io.IOException iOException) {
        call.cancel();
        a(this.i);
        a(this.h);
        if (!this.e) {
            this.f.a(iOException);
        }
        a();
    }

    @Override // okhttp3.Callback
    public void onResponse(okhttp3.Call call, okhttp3.Response response) {
        this.f.statusCode = response.code();
        this.f.protocol = response.protocol().toString();
        try {
            java.io.InputStream inputStreamByteStream = response.body().byteStream();
            if (inputStreamByteStream == null) {
                a();
                a(inputStreamByteStream);
                a(this.i);
                a(this.h);
                response.close();
                return;
            }
            a(inputStreamByteStream, this.i);
            a(inputStreamByteStream);
            a(this.i);
            a(this.h);
            response.close();
            a();
        } catch (java.lang.Throwable th) {
            a(null);
            a(this.i);
            a(this.h);
            response.close();
            throw th;
        }
    }

    public void run() {
        jp.co.cyberagent.octo.lib.HttpResult httpResult;
        java.lang.String string;
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.b);
            this.h = fileOutputStream;
            this.i = fileOutputStream.getChannel();
            try {
                okhttp3.Call callNewCall = j.newCall(new okhttp3.Request.Builder().url(this.f3957a).build());
                this.g = callNewCall;
                callNewCall.enqueue(this);
            } catch (java.lang.IllegalArgumentException e) {
                httpResult = this.f;
                string = e.toString();
                httpResult.errorCode = "octo.network.communication";
                httpResult.errorMessage = string;
                httpResult.isIoError = false;
                httpResult.isComplete = true;
            } catch (java.lang.IllegalStateException e2) {
                httpResult = this.f;
                string = e2.toString();
                httpResult.errorCode = "octo.network.communication";
                httpResult.errorMessage = string;
                httpResult.isIoError = false;
                httpResult.isComplete = true;
            }
        } catch (java.io.IOException e3) {
            this.f.a(e3);
            a();
        }
    }
}
