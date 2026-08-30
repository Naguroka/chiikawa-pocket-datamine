package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzatq {
    private static final java.lang.String zza = "zzatq";

    protected static java.util.HashMap zza(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            return (java.util.HashMap) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(str.getBytes(), 0))).readObject();
        } catch (java.io.IOException | java.lang.ClassNotFoundException unused) {
            android.util.Log.d(zza, "decode object failure");
            return null;
        }
    }

    public final java.lang.String toString() {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(zzb());
            objectOutputStream.close();
            return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    protected abstract java.util.HashMap zzb();
}
