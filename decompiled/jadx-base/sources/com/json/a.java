package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class a extends java.lang.Thread {
    private static final int l = 1;
    private static final com.json.b m = new com.json.a.C0229a();
    private static final com.json.ti n = new com.ironsource.a.b();
    private final int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.b f2485a = m;
    private com.json.ti b = n;
    private final android.os.Handler c = new android.os.Handler(android.os.Looper.getMainLooper());
    private java.lang.String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final java.lang.Runnable k = new com.ironsource.a.c();

    /* JADX INFO: renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    class C0229a implements com.json.b {
        C0229a() {
        }

        @Override // com.json.b
        public void a() {
        }

        @Override // com.json.b
        public void b() {
            throw new java.lang.RuntimeException("ANRHandler has given up");
        }
    }

    class b implements com.json.ti {
        b() {
        }

        @Override // com.json.ti
        public void a(java.lang.InterruptedException interruptedException) {
            android.util.Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.a aVar = com.json.a.this;
            aVar.h = (aVar.h + 1) % Integer.MAX_VALUE;
        }
    }

    public a(int i) {
        this.d = i;
    }

    private java.lang.String a(java.lang.StackTraceElement[] stackTraceElementArr) {
        java.lang.String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }

    public int a() {
        return this.j;
    }

    public com.json.a a(com.json.b bVar) {
        if (bVar == null) {
            bVar = m;
        }
        this.f2485a = bVar;
        return this;
    }

    public com.json.a a(com.json.ti tiVar) {
        if (tiVar == null) {
            tiVar = n;
        }
        this.b = tiVar;
        return this;
    }

    public com.json.a a(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public com.json.a a(boolean z) {
        this.g = z;
        return this;
    }

    public void a(int i) {
        this.i = i;
    }

    public int b() {
        return this.i;
    }

    public com.json.a b(boolean z) {
        this.f = z;
        return this;
    }

    public com.json.a c() {
        this.e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.j < this.i) {
            int i2 = this.h;
            this.c.post(this.k);
            try {
                java.lang.Thread.sleep(this.d);
                if (this.h != i2) {
                    this.j = 0;
                } else if (this.g || !android.os.Debug.isDebuggerConnected()) {
                    this.j++;
                    this.f2485a.a();
                    java.lang.String str = com.json.l9.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new com.json.ic(com.json.l9.l, java.lang.String.valueOf(java.lang.System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.h != i) {
                        android.util.Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.h;
                }
            } catch (java.lang.InterruptedException e) {
                this.b.a(e);
                return;
            }
        }
        if (this.j >= this.i) {
            this.f2485a.b();
        }
    }
}
