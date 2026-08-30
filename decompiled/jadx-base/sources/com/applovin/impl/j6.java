package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class j6 implements com.applovin.impl.ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f908a;
    private boolean d;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int b = 0;
    private long c = 5000;
    private com.applovin.impl.ld e = com.applovin.impl.ld.f989a;

    protected void a(android.content.Context context, android.os.Handler handler, int i, java.util.ArrayList arrayList) {
    }

    public j6(android.content.Context context) {
        this.f908a = context;
    }

    protected void a(android.content.Context context, int i, com.applovin.impl.ld ldVar, boolean z, com.applovin.impl.r1 r1Var, android.os.Handler handler, com.applovin.impl.q1 q1Var, java.util.ArrayList arrayList) {
        int i2;
        int i3;
        com.applovin.impl.hd hdVar = new com.applovin.impl.hd(context, ldVar, z, handler, q1Var, r1Var);
        hdVar.a(this.f);
        hdVar.b(this.g);
        hdVar.c(this.h);
        arrayList.add(hdVar);
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (com.applovin.impl.qi) java.lang.Class.forName("com.applovin.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(android.os.Handler.class, com.applovin.impl.q1.class, com.applovin.impl.r1.class).newInstance(handler, q1Var, r1Var));
                    com.applovin.impl.oc.c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (java.lang.ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                }
            } catch (java.lang.ClassNotFoundException unused2) {
            }
            try {
                try {
                    i3 = i2 + 1;
                    try {
                        arrayList.add(i2, (com.applovin.impl.qi) java.lang.Class.forName("com.applovin.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(android.os.Handler.class, com.applovin.impl.q1.class, com.applovin.impl.r1.class).newInstance(handler, q1Var, r1Var));
                        com.applovin.impl.oc.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (java.lang.ClassNotFoundException unused3) {
                        i2 = i3;
                        i3 = i2;
                    }
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Error instantiating FLAC extension", e);
                }
            } catch (java.lang.ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i3, (com.applovin.impl.qi) java.lang.Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(android.os.Handler.class, com.applovin.impl.q1.class, com.applovin.impl.r1.class).newInstance(handler, q1Var, r1Var));
                com.applovin.impl.oc.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (java.lang.ClassNotFoundException unused5) {
            } catch (java.lang.Exception e2) {
                throw new java.lang.RuntimeException("Error instantiating FFmpeg extension", e2);
            }
        } catch (java.lang.Exception e3) {
            throw new java.lang.RuntimeException("Error instantiating Opus extension", e3);
        }
    }

    protected void a(android.content.Context context, int i, java.util.ArrayList arrayList) {
        arrayList.add(new com.applovin.impl.w2());
    }

    protected void a(android.content.Context context, com.applovin.impl.ef efVar, android.os.Looper looper, int i, java.util.ArrayList arrayList) {
        arrayList.add(new com.applovin.impl.ff(efVar, looper));
    }

    protected void a(android.content.Context context, com.applovin.impl.ao aoVar, android.os.Looper looper, int i, java.util.ArrayList arrayList) {
        arrayList.add(new com.applovin.impl.bo(aoVar, looper));
    }

    protected void a(android.content.Context context, int i, com.applovin.impl.ld ldVar, boolean z, android.os.Handler handler, com.applovin.impl.wq wqVar, long j, java.util.ArrayList arrayList) {
        int i2;
        int i3;
        com.applovin.impl.od odVar = new com.applovin.impl.od(context, ldVar, j, z, handler, wqVar, 50);
        odVar.a(this.f);
        odVar.b(this.g);
        odVar.c(this.h);
        arrayList.add(odVar);
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (com.applovin.impl.qi) java.lang.Class.forName("com.applovin.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(java.lang.Long.TYPE, android.os.Handler.class, com.applovin.impl.wq.class, java.lang.Integer.TYPE).newInstance(java.lang.Long.valueOf(j), handler, wqVar, 50));
                    com.applovin.impl.oc.c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (java.lang.ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (java.lang.ClassNotFoundException unused2) {
        }
        try {
            try {
                i3 = i2 + 1;
                try {
                    arrayList.add(i2, (com.applovin.impl.qi) java.lang.Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(java.lang.Long.TYPE, android.os.Handler.class, com.applovin.impl.wq.class, java.lang.Integer.TYPE).newInstance(java.lang.Long.valueOf(j), handler, wqVar, 50));
                    com.applovin.impl.oc.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (java.lang.ClassNotFoundException unused3) {
                    i2 = i3;
                    i3 = i2;
                }
            } catch (java.lang.ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i3, (com.applovin.impl.qi) java.lang.Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(java.lang.Long.TYPE, android.os.Handler.class, com.applovin.impl.wq.class, java.lang.Integer.TYPE).newInstance(java.lang.Long.valueOf(j), handler, wqVar, 50));
                com.applovin.impl.oc.c("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            } catch (java.lang.ClassNotFoundException unused5) {
            } catch (java.lang.Exception e2) {
                throw new java.lang.RuntimeException("Error instantiating FFmpeg extension", e2);
            }
        } catch (java.lang.Exception e3) {
            throw new java.lang.RuntimeException("Error instantiating AV1 extension", e3);
        }
    }

    @Override // com.applovin.impl.ti
    public com.applovin.impl.qi[] a(android.os.Handler handler, com.applovin.impl.wq wqVar, com.applovin.impl.q1 q1Var, com.applovin.impl.ao aoVar, com.applovin.impl.ef efVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(this.f908a, this.b, this.e, this.d, handler, wqVar, this.c, arrayList);
        com.applovin.impl.r1 r1VarA = a(this.f908a, this.i, this.j, this.k);
        if (r1VarA != null) {
            a(this.f908a, this.b, this.e, this.d, r1VarA, handler, q1Var, arrayList);
        }
        a(this.f908a, aoVar, handler.getLooper(), this.b, arrayList);
        a(this.f908a, efVar, handler.getLooper(), this.b, arrayList);
        a(this.f908a, this.b, arrayList);
        a(this.f908a, handler, this.b, arrayList);
        return (com.applovin.impl.qi[]) arrayList.toArray(new com.applovin.impl.qi[0]);
    }

    protected com.applovin.impl.r1 a(android.content.Context context, boolean z, boolean z2, boolean z3) {
        return new com.applovin.impl.r5(com.applovin.impl.n1.a(context), new com.applovin.impl.r5.d(new com.applovin.impl.p1[0]), z, z2, z3 ? 1 : 0);
    }
}
