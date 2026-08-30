package com.bykv.vk.openvk.preload.a;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: LongSerializationPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.bykv.vk.openvk.preload.a.p f1694a;
    private static com.bykv.vk.openvk.preload.a.p b;

    private p(java.lang.String str, int i) {
        super(str, i);
    }

    /* synthetic */ p(java.lang.String str, int i, byte b2) {
        this(str, i);
    }

    static {
        com.bykv.vk.openvk.preload.a.p pVar = new com.bykv.vk.openvk.preload.a.p("DEFAULT") { // from class: com.bykv.vk.openvk.preload.a.p.1
            {
                byte b2 = 0;
            }
        };
        f1694a = pVar;
        com.bykv.vk.openvk.preload.a.p pVar2 = new com.bykv.vk.openvk.preload.a.p("STRING") { // from class: com.bykv.vk.openvk.preload.a.p.2
            {
                int i = 1;
                byte b2 = 0;
            }
        };
        b = pVar2;
        com.bykv.vk.openvk.preload.a.p[] pVarArr = {pVar, pVar2};
    }
}
