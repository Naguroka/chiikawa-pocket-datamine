package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2171a = new com.google.android.play.core.assetpacks.internal.o("ExtractChunkTaskHandler");
    private final byte[] b = new byte[8192];
    private final com.google.android.play.core.assetpacks.bh c;
    private final com.google.android.play.core.assetpacks.co d;
    private final com.google.android.play.core.assetpacks.eb e;
    private final com.google.android.play.core.assetpacks.internal.aq f;
    private final com.google.android.play.core.assetpacks.internal.aq g;

    cf(com.google.android.play.core.assetpacks.bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, com.google.android.play.core.assetpacks.co coVar, com.google.android.play.core.assetpacks.eb ebVar) {
        this.c = bhVar;
        this.f = aqVar;
        this.g = aqVar2;
        this.d = coVar;
        this.e = ebVar;
    }

    private final java.io.File b(com.google.android.play.core.assetpacks.ce ceVar) {
        java.io.File fileP = this.c.p(ceVar.l, ceVar.f2170a, ceVar.b, ceVar.d);
        if (!fileP.exists()) {
            fileP.mkdirs();
        }
        return fileP;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0187  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.play.core.assetpacks.bh] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(com.google.android.play.core.assetpacks.ce ceVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        ?? r10;
        java.io.InputStream sequenceInputStream;
        com.google.android.play.core.assetpacks.eu euVarB;
        java.io.File fileC;
        long length;
        int iMin;
        int iMax;
        long j;
        ?? r11 = this.c;
        java.lang.String str = ceVar.l;
        int i = ceVar.f2170a;
        long j2 = ceVar.b;
        java.lang.String str2 = ceVar.d;
        com.google.android.play.core.assetpacks.eo eoVar = new com.google.android.play.core.assetpacks.eo(r11, str, i, j2, str2);
        java.io.File fileO = r11.o(str, i, j2, str2);
        if (!fileO.exists()) {
            fileO.mkdirs();
        }
        try {
            java.io.InputStream inputStream = ceVar.j;
            java.io.InputStream gZIPInputStream = ceVar.e != 1 ? inputStream : new java.util.zip.GZIPInputStream(inputStream, 8192);
            try {
                try {
                    if (ceVar.f > 0) {
                        com.google.android.play.core.assetpacks.em emVarB = eoVar.b();
                        int iB = emVarB.b();
                        int i2 = ceVar.f;
                        if (iB != i2 - 1) {
                            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(emVarB.b())), ceVar.k);
                        }
                        int iA = emVarB.a();
                        try {
                            if (iA == 1) {
                                f2171a.a("Resuming zip entry from last chunk during file %s.", emVarB.e());
                                java.io.File file = new java.io.File(emVarB.e());
                                if (!file.exists()) {
                                    throw new com.google.android.play.core.assetpacks.ck("Partial file specified in checkpoint does not exist. Corrupt directory.", ceVar.k);
                                }
                                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
                                randomAccessFile.seek(emVarB.c());
                                long jD = emVarB.d();
                                while (true) {
                                    iMin = (int) java.lang.Math.min(jD, 8192L);
                                    iMax = java.lang.Math.max(gZIPInputStream.read(this.b, 0, iMin), 0);
                                    if (iMax > 0) {
                                        randomAccessFile.write(this.b, 0, iMax);
                                    }
                                    j = jD - ((long) iMax);
                                    if (j <= 0 || iMax <= 0) {
                                        break;
                                    } else {
                                        jD = j;
                                    }
                                }
                                long length2 = randomAccessFile.length();
                                randomAccessFile.close();
                                if (iMax != iMin) {
                                    f2171a.a("Chunk has ended while resuming the previous chunks file content.", new java.lang.Object[0]);
                                    eoVar.g(file.getCanonicalPath(), length2, j, ceVar.f);
                                } else {
                                    gZIPInputStream = gZIPInputStream;
                                    sequenceInputStream = gZIPInputStream;
                                }
                            } else if (iA == 2) {
                                f2171a.a("Resuming zip entry from last chunk during local file header.", new java.lang.Object[0]);
                                java.io.File fileM = this.c.m(ceVar.l, ceVar.f2170a, ceVar.b, ceVar.d);
                                if (!fileM.exists()) {
                                    throw new com.google.android.play.core.assetpacks.ck("Checkpoint extension file not found.", ceVar.k);
                                }
                                gZIPInputStream = gZIPInputStream;
                                sequenceInputStream = new java.io.SequenceInputStream(new java.io.FileInputStream(fileM), gZIPInputStream);
                            } else {
                                if (iA != 3) {
                                    throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", java.lang.Integer.valueOf(emVarB.a())), ceVar.k);
                                }
                                f2171a.a("Resuming central directory from last chunk.", new java.lang.Object[0]);
                                eoVar.d(gZIPInputStream, emVarB.c());
                                if (!ceVar.a()) {
                                    throw new com.google.android.play.core.assetpacks.ck("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", ceVar.k);
                                }
                            }
                            sequenceInputStream = null;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            r10 = gZIPInputStream;
                        }
                        th = th;
                        r10 = r11;
                        try {
                            r10.close();
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            try {
                                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th3);
                                throw th;
                            } catch (java.lang.Exception unused) {
                                throw th;
                            }
                        }
                    }
                    gZIPInputStream = gZIPInputStream;
                    sequenceInputStream = gZIPInputStream;
                    if (sequenceInputStream != null) {
                        com.google.android.play.core.assetpacks.bw bwVar = new com.google.android.play.core.assetpacks.bw(sequenceInputStream);
                        java.io.File fileB = b(ceVar);
                        do {
                            euVarB = bwVar.b();
                            if (!euVarB.e() && !bwVar.c()) {
                                if (!euVarB.h() || euVarB.g()) {
                                    eoVar.k(euVarB.f(), bwVar);
                                } else {
                                    eoVar.j(euVarB.f());
                                    java.io.File file2 = new java.io.File(fileB, euVarB.c());
                                    file2.getParentFile().mkdirs();
                                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                                    int i3 = bwVar.read(this.b, 0, 8192);
                                    while (i3 > 0) {
                                        fileOutputStream.write(this.b, 0, i3);
                                        i3 = bwVar.read(this.b, 0, 8192);
                                    }
                                    fileOutputStream.close();
                                }
                            }
                            if (bwVar.d()) {
                                break;
                            }
                        } while (!bwVar.c());
                        if (bwVar.c()) {
                            f2171a.a("Writing central directory metadata.", new java.lang.Object[0]);
                            eoVar.k(euVarB.f(), sequenceInputStream);
                        }
                        if (!ceVar.a()) {
                            if (euVarB.e()) {
                                f2171a.a("Writing slice checkpoint for partial local file header.", new java.lang.Object[0]);
                                eoVar.h(euVarB.f(), ceVar.f);
                            } else if (bwVar.c()) {
                                f2171a.a("Writing slice checkpoint for central directory.", new java.lang.Object[0]);
                                eoVar.f(ceVar.f);
                            } else {
                                if (euVarB.a() == 0) {
                                    f2171a.a("Writing slice checkpoint for partial file.", new java.lang.Object[0]);
                                    fileC = new java.io.File(b(ceVar), euVarB.c());
                                    length = euVarB.b() - bwVar.a();
                                    if (fileC.length() != length) {
                                        throw new com.google.android.play.core.assetpacks.ck("Partial file is of unexpected size.");
                                    }
                                } else {
                                    f2171a.a("Writing slice checkpoint for partial unextractable file.", new java.lang.Object[0]);
                                    fileC = eoVar.c();
                                    length = fileC.length();
                                }
                                eoVar.g(fileC.getCanonicalPath(), length, bwVar.a(), ceVar.f);
                            }
                        }
                    }
                    gZIPInputStream.close();
                    if (ceVar.a()) {
                        try {
                            eoVar.i(ceVar.f);
                        } catch (java.io.IOException e) {
                            f2171a.b("Writing extraction finished checkpoint failed with %s.", e.getMessage());
                            throw new com.google.android.play.core.assetpacks.ck("Writing extraction finished checkpoint failed.", e, ceVar.k);
                        }
                    }
                    f2171a.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", java.lang.Integer.valueOf(ceVar.f), ceVar.d, ceVar.l, java.lang.Integer.valueOf(ceVar.k));
                    ((com.google.android.play.core.assetpacks.y) this.f.a()).g(ceVar.k, ceVar.l, ceVar.d, ceVar.f);
                    try {
                        ceVar.j.close();
                    } catch (java.io.IOException unused2) {
                        f2171a.e("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(ceVar.f), ceVar.d, ceVar.l);
                    }
                    if (ceVar.i == 3) {
                        com.google.android.play.core.assetpacks.bb bbVar = (com.google.android.play.core.assetpacks.bb) this.g.a();
                        java.lang.String str3 = ceVar.l;
                        long j3 = ceVar.h;
                        bbVar.d(com.google.android.play.core.assetpacks.AssetPackState.a(str3, 3, 0, j3, j3, this.d.b(str3, ceVar), 1, ceVar.c, this.e.a(ceVar.l)));
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    th = th;
                    r10 = r11;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                r11 = gZIPInputStream;
            }
        } catch (java.io.IOException e2) {
            f2171a.b("IOException during extraction %s.", e2.getMessage());
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", java.lang.Integer.valueOf(ceVar.f), ceVar.d, ceVar.l, java.lang.Integer.valueOf(ceVar.k)), e2, ceVar.k);
        }
    }
}
