package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1779a = 0;

    static {
        com.five_corp.ad.internal.A.class.toString();
    }

    public static boolean a(com.five_corp.ad.internal.ad.a aVar, long j) {
        boolean z = false;
        if (aVar.f.longValue() < j) {
            return false;
        }
        for (com.five_corp.ad.internal.ad.format_config.a aVar2 : aVar.z) {
            java.util.Iterator it = aVar.y.iterator();
            while (it.hasNext()) {
                if (((com.five_corp.ad.internal.ad.x) it.next()).b == aVar2.f1811a) {
                    z = true;
                    break;
                }
            }
            if (z) {
                break;
            }
        }
        return z;
    }
}
