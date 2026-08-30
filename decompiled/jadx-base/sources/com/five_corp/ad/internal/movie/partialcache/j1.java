package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f2005a;
    public static final com.five_corp.ad.internal.movie.partialcache.C1475j b;
    public static final com.five_corp.ad.internal.movie.partialcache.C1502x c;
    public static final com.five_corp.ad.internal.movie.partialcache.C1504y d;

    static {
        java.util.HashMap map = new java.util.HashMap();
        f2005a = map;
        b = new com.five_corp.ad.internal.movie.partialcache.C1475j();
        c = new com.five_corp.ad.internal.movie.partialcache.C1502x();
        d = new com.five_corp.ad.internal.movie.partialcache.C1504y();
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("ftyp", map, com.five_corp.ad.internal.movie.partialcache.C1460b0.class, "moov", com.five_corp.ad.internal.movie.partialcache.C1486o0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("mdat", map, com.five_corp.ad.internal.movie.partialcache.C1478k0.class, "mvhd", com.five_corp.ad.internal.movie.partialcache.C1499v0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("trak", map, com.five_corp.ad.internal.movie.partialcache.Z0.class, "tkhd", com.five_corp.ad.internal.movie.partialcache.b1.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("tref", map, com.five_corp.ad.internal.movie.partialcache.c1.class, "hint", com.five_corp.ad.internal.movie.partialcache.f1.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("cdsc", map, com.five_corp.ad.internal.movie.partialcache.e1.class, "mdia", com.five_corp.ad.internal.movie.partialcache.C1476j0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("mdhd", map, com.five_corp.ad.internal.movie.partialcache.C1480l0.class, "hdlr", com.five_corp.ad.internal.movie.partialcache.C1468f0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("minf", map, com.five_corp.ad.internal.movie.partialcache.C1482m0.class, "vmhd", com.five_corp.ad.internal.movie.partialcache.h1.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("smhd", map, com.five_corp.ad.internal.movie.partialcache.R0.class, "hmhd", com.five_corp.ad.internal.movie.partialcache.C1470g0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("nmhd", map, com.five_corp.ad.internal.movie.partialcache.C1501w0.class, "dinf", com.five_corp.ad.internal.movie.partialcache.O.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("url ", map, com.five_corp.ad.internal.movie.partialcache.M.class, "urn ", com.five_corp.ad.internal.movie.partialcache.N.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("dref", map, com.five_corp.ad.internal.movie.partialcache.P.class, "stbl", com.five_corp.ad.internal.movie.partialcache.H0.class);
        map.put(com.five_corp.ad.internal.movie.partialcache.Y0.class, "stts".getBytes());
        map.put(com.five_corp.ad.internal.movie.partialcache.J.class, "ctts".getBytes());
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("avc1", map, com.five_corp.ad.internal.movie.partialcache.A.class, "mp4a", com.five_corp.ad.internal.movie.partialcache.C1474i0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("stsd", map, com.five_corp.ad.internal.movie.partialcache.D0.class, "stsz", com.five_corp.ad.internal.movie.partialcache.G0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("stz2", map, com.five_corp.ad.internal.movie.partialcache.G.class, "stsc", com.five_corp.ad.internal.movie.partialcache.K0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("stco", map, com.five_corp.ad.internal.movie.partialcache.F.class, "co64", com.five_corp.ad.internal.movie.partialcache.E.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("stss", map, com.five_corp.ad.internal.movie.partialcache.V0.class, "stsh", com.five_corp.ad.internal.movie.partialcache.Q0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("stdp", map, com.five_corp.ad.internal.movie.partialcache.Q.class, "padb", com.five_corp.ad.internal.movie.partialcache.C1503x0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("free", map, com.five_corp.ad.internal.movie.partialcache.C1462c0.class, "skip", com.five_corp.ad.internal.movie.partialcache.C1464d0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("edts", map, com.five_corp.ad.internal.movie.partialcache.S.class, "elst", com.five_corp.ad.internal.movie.partialcache.U.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("udta", map, com.five_corp.ad.internal.movie.partialcache.g1.class, "cprt", com.five_corp.ad.internal.movie.partialcache.K.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("mvex", map, com.five_corp.ad.internal.movie.partialcache.C1491r0.class, "mehd", com.five_corp.ad.internal.movie.partialcache.C1493s0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("trex", map, com.five_corp.ad.internal.movie.partialcache.a1.class, "sdtp", com.five_corp.ad.internal.movie.partialcache.C0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("sbgp", map, com.five_corp.ad.internal.movie.partialcache.N0.class, "sgpd", com.five_corp.ad.internal.movie.partialcache.F0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("subs", map, com.five_corp.ad.internal.movie.partialcache.U0.class, "ipmc", com.five_corp.ad.internal.movie.partialcache.C1472h0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("pdin", map, com.five_corp.ad.internal.movie.partialcache.C1507z0.class, "moof", com.five_corp.ad.internal.movie.partialcache.C1495t0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("mfra", map, com.five_corp.ad.internal.movie.partialcache.C1497u0.class, com.adjust.sdk.Constants.REFERRER_API_META, com.five_corp.ad.internal.movie.partialcache.C1484n0.class);
        com.five_corp.ad.internal.movie.partialcache.AbstractC1473i.a("avcC", map, com.five_corp.ad.internal.movie.partialcache.B.class, "esds", com.five_corp.ad.internal.movie.partialcache.C1458a0.class);
    }

    public static int a(byte b2) {
        return b2 < 0 ? b2 + 256 : b2;
    }

    public static com.five_corp.ad.internal.movie.partialcache.D a(com.five_corp.ad.internal.util.c cVar, long j, byte[] bArr, byte[] bArr2, int i, com.five_corp.ad.internal.logger.a aVar) {
        java.lang.Class cls;
        int i2 = cVar.h - i;
        int i3 = (int) (((long) i2) + j);
        try {
            java.util.Iterator it = d.iterator();
            do {
                if (!it.hasNext()) {
                    cls = null;
                    break;
                }
                cls = (java.lang.Class) it.next();
                byte[] bArr3 = com.five_corp.ad.internal.movie.partialcache.D.e;
            } while (!java.util.Arrays.equals((byte[]) f2005a.get(cls), bArr));
            if (cls == null) {
                aVar.a(4, "Invalid box type " + new java.lang.String(bArr));
                cVar.b(i3);
                return null;
            }
            try {
                try {
                    com.five_corp.ad.internal.movie.partialcache.D d2 = (com.five_corp.ad.internal.movie.partialcache.D) cls.newInstance();
                    d2.f1985a = j;
                    d2.b = bArr;
                    if (bArr2 != null) {
                        byte b2 = bArr2[0];
                    }
                    d2.d = i2;
                    d2.a(cVar, aVar);
                    d2.a(cVar, i3, aVar);
                    cVar.b(i3);
                    return d2;
                } catch (java.lang.IllegalAccessException unused) {
                    throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("Box " + cls + " is not instantiated");
                }
            } catch (java.lang.InstantiationException unused2) {
                throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("Box " + cls + " is not instantiated");
            }
        } catch (java.nio.BufferUnderflowException e) {
            throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("buffer is insufficient", e);
        }
    }
}
