package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.ByteArrayOutputStream f1496a;
    private final java.io.DataOutputStream b;

    public x7() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(512);
        this.f1496a = byteArrayOutputStream;
        this.b = new java.io.DataOutputStream(byteArrayOutputStream);
    }

    public byte[] a(com.applovin.impl.v7 v7Var) {
        this.f1496a.reset();
        try {
            a(this.b, v7Var.f1422a);
            java.lang.String str = v7Var.b;
            if (str == null) {
                str = "";
            }
            a(this.b, str);
            this.b.writeLong(v7Var.c);
            this.b.writeLong(v7Var.d);
            this.b.write(v7Var.f);
            this.b.flush();
            return this.f1496a.toByteArray();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static void a(java.io.DataOutputStream dataOutputStream, java.lang.String str) throws java.io.IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
