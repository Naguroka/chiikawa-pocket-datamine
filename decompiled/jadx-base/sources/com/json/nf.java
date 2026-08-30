package com.json;

/* JADX INFO: loaded from: classes5.dex */
public interface nf {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.ArrayList<com.json.wb> f3077a;
        private boolean b;
        private int c;
        private java.lang.Exception d;

        public a(java.util.ArrayList<com.json.wb> arrayList) {
            this.b = false;
            this.c = -1;
            this.f3077a = arrayList;
        }

        a(java.util.ArrayList<com.json.wb> arrayList, int i, boolean z, java.lang.Exception exc) {
            this.f3077a = arrayList;
            this.b = z;
            this.d = exc;
            this.c = i;
        }

        public com.ironsource.nf.a a(int i) {
            return new com.ironsource.nf.a(this.f3077a, i, this.b, this.d);
        }

        public com.ironsource.nf.a a(java.lang.Exception exc) {
            return new com.ironsource.nf.a(this.f3077a, this.c, this.b, exc);
        }

        public com.ironsource.nf.a a(boolean z) {
            return new com.ironsource.nf.a(this.f3077a, this.c, z, this.d);
        }

        public java.lang.String a() {
            return !this.b ? "rc=" + this.c + ", ex=" + this.d : "";
        }

        public java.util.ArrayList<com.json.wb> b() {
            return this.f3077a;
        }

        public boolean c() {
            return this.b;
        }

        public java.lang.String toString() {
            return "EventSendResult{success=" + this.b + ", responseCode=" + this.c + ", exception=" + this.d + '}';
        }
    }

    void a(com.ironsource.nf.a aVar);
}
